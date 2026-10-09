package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzol implements zzoh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f11780a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f11782c;

    public zzol() {
        new ConcurrentHashMap();
        this.f11781b = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f11782c = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x0030 A[EDGE_INSN: B:42:0x0030->B:40:0x0030 BREAK  A[LOOP:1: B:12:0x0050->B:45:?], SYNTHETIC] */
    public final void a(zzacr zzacrVar, Set set, String str) {
        zzok[] zzokVarArr;
        zzok[] zzokVarArr2;
        if (!set.isEmpty() && !this.f11780a.getAndSet(true)) {
            zzbu.a().f11476a.add(0, new zzoj());
        }
        final byte[] bArrM = zzacrVar.m();
        this.f11781b.compute(str, new BiFunction() { // from class: com.google.android.gms.internal.measurement.zzoi
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrM;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) this.f11782c.putIfAbsent((String) it.next(), new AtomicReference(new zzok(bArrM, str)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof zzok) {
                        zzok zzokVar = (zzok) obj;
                        String str2 = zzokVar.f11778a;
                        if (str.equals(str2)) {
                            zzokVar.a(bArrM);
                            break;
                        }
                        zzok zzokVar2 = new zzok(bArrM, str);
                        zzokVarArr2 = str.compareTo(str2) < 0 ? new zzok[]{zzokVar2, zzokVar} : new zzok[]{zzokVar, zzokVar2};
                        do {
                            if (atomicReference.compareAndSet(obj, zzokVarArr2)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        zzok[] zzokVarArr3 = (zzok[]) obj;
                        int iBinarySearch = Arrays.binarySearch(zzokVarArr3, str);
                        if (iBinarySearch >= 0) {
                            zzokVarArr3[iBinarySearch].a(bArrM);
                            break;
                        }
                        int i11 = ~iBinarySearch;
                        int length = zzokVarArr3.length;
                        int i12 = length + 1;
                        int i13 = length - i11;
                        if (i13 == 0) {
                            zzokVarArr = (zzok[]) Arrays.copyOf(zzokVarArr3, i12);
                        } else {
                            zzok[] zzokVarArr4 = new zzok[i12];
                            System.arraycopy(zzokVarArr3, 0, zzokVarArr4, 0, i11);
                            System.arraycopy(zzokVarArr3, i11, zzokVarArr4, i11 + 1, i13);
                            zzokVarArr = zzokVarArr4;
                        }
                        zzokVarArr[i11] = new zzok(bArrM, str);
                        zzokVarArr2 = zzokVarArr;
                        do {
                            if (atomicReference.compareAndSet(obj, zzokVarArr2)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }
}
