package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzabc extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Comparator f11170f = new zzaaz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f11171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f11173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f11174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11175e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzabc, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.zzabc] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public zzabc(zzabc zzabcVar, zzabc zzabcVar2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f11173c = new zzabb(abstractMap, -1);
        abstractMap.f11174d = null;
        abstractMap.f11175e = null;
        int size = zzabcVar2.size() + zzabcVar.size();
        int i11 = zzabcVar.f11172b[zzabcVar.size()] + zzabcVar2.f11172b[zzabcVar2.size()];
        int i12 = size + 1;
        Object[] objArr2 = new Object[i11];
        int[] iArr = new int[i12];
        int i13 = 0;
        iArr[0] = size;
        Map.Entry entryC = zzabcVar.c(0);
        Map.Entry entryC2 = zzabcVar2.c(0);
        int i14 = 0;
        int i15 = 0;
        int iA = size;
        int i16 = 0;
        while (true) {
            if (entryC == null && entryC2 == null) {
                break;
            }
            i16++;
            if (entryC != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i17 = i14 + 1;
                        int i18 = i15 + 1;
                        objArr2[i16] = new AbstractMap.SimpleImmutableEntry((String) entryC.getKey(), new zzabb(abstractMap, i16));
                        zzabb zzabbVar = (zzabb) entryC.getValue();
                        zzabb zzabbVar2 = (zzabb) entryC2.getValue();
                        int i19 = 0;
                        int i21 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iD = zzabbVar.d();
                            zzabc zzabcVar3 = zzabbVar.f11169b;
                            if (i19 >= iD - zzabbVar.b() && i21 >= zzabbVar2.d() - zzabbVar2.b()) {
                                break;
                            }
                            int iCompare = i19 == zzabbVar.d() - zzabbVar.b() ? 1 : i21 == zzabbVar2.d() - zzabbVar2.b() ? -1 : 0;
                            if (iCompare == 0) {
                                Comparator comparator = zzabe.f11176b;
                                iCompare = ((zzaax) zzabe.f11176b).compare(zzabcVar3.f11171a[zzabbVar.b() + i19], zzabbVar2.f11169b.f11171a[zzabbVar2.b() + i21]);
                            }
                            if (iCompare < 0) {
                                i19++;
                                obj = zzabcVar3.f11171a[zzabbVar.b() + i19];
                            } else {
                                int i22 = i21 + 1;
                                Object obj2 = zzabbVar2.f11169b.f11171a[zzabbVar2.b() + i21];
                                if (iCompare == 0) {
                                    i21 = i22;
                                    obj = obj2;
                                    i19++;
                                } else {
                                    i21 = i22;
                                    obj = obj2;
                                    i19 = i19;
                                }
                            }
                            objArr2[iA] = obj;
                            abstractMap = this;
                            iA++;
                        }
                        iArr[i16] = iA;
                        entryC = zzabcVar.c(i18);
                        entryC2 = zzabcVar2.c(i17);
                        i15 = i18;
                        i14 = i17;
                        i13 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i13 = 0;
                        abstractMap = this;
                    }
                }
                i15++;
                iA = a(entryC, i16, iA, objArr2, iArr);
                entryC = zzabcVar.c(i15);
                i13 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC;
            i14++;
            int iA2 = a(entryC2, i16, iA, objArr2, iArr);
            entryC2 = zzabcVar2.c(i14);
            iA = iA2;
            entryC = entry;
            i13 = 0;
            abstractMap = this;
        }
        int i23 = iArr[i13];
        int i24 = i23 - i16;
        if (i24 != 0) {
            for (int i25 = i13; i25 <= i16; i25++) {
                iArr[i25] = iArr[i25] - i24;
            }
            int i26 = iArr[i16];
            int i27 = i26 - i16;
            if (b(i11, i26)) {
                objArr = new Object[i26];
                System.arraycopy(objArr2, i13, objArr, i13, i16);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i23, objArr, i16, i27);
            objArr2 = objArr;
        }
        abstractMap.f11171a = objArr2;
        int i28 = iArr[i13] + 1;
        abstractMap.f11172b = b(i12, i28) ? Arrays.copyOf(iArr, i28) : iArr;
    }

    public static boolean b(int i11, int i12) {
        return i11 > 16 && i11 * 9 > i12 * 10;
    }

    public final int a(Map.Entry entry, int i11, int i12, Object[] objArr, int[] iArr) {
        zzabb zzabbVar = (zzabb) entry.getValue();
        int iD = zzabbVar.d() - zzabbVar.b();
        System.arraycopy(zzabbVar.f11169b.f11171a, zzabbVar.b(), objArr, i12, iD);
        objArr[i11] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new zzabb(this, i11));
        int i13 = i12 + iD;
        iArr[i11 + 1] = i13;
        return i13;
    }

    public final Map.Entry c(int i11) {
        if (i11 < this.f11172b[0]) {
            return (Map.Entry) this.f11171a[i11];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f11173c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f11174d == null) {
            this.f11174d = Integer.valueOf(super.hashCode());
        }
        return this.f11174d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f11175e == null) {
            this.f11175e = super.toString();
        }
        return this.f11175e;
    }

    public zzabc() {
        List list = Collections.EMPTY_LIST;
        this.f11173c = new zzabb(this, -1);
        this.f11174d = null;
        this.f11175e = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f11171a = b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f11172b = iArr;
                return;
            }
            throw null;
        }
        throw null;
    }
}
