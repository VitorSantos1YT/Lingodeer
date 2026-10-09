package com.google.android.gms.internal.measurement;

import b7.e0;
import com.google.android.gms.internal.measurement.zzaca;
import com.google.android.gms.internal.measurement.zzacb;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzacb<MessageType extends zzacb<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> implements zzafc {
    protected transient int zza = 0;

    public static void j(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzaen) {
            List listZza = ((zzaen) iterable).zza();
            zzaen zzaenVar = (zzaen) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = zzaenVar.size() - size;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String string = sb2.toString();
                    int size3 = zzaenVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        zzaenVar.remove(size3);
                    }
                } else if (obj instanceof zzacr) {
                    zzaenVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzacr.k(bArr, 0, bArr.length);
                    zzaenVar.zzb();
                } else {
                    zzaenVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzafk) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof zzafm) {
                zzafm zzafmVar = (zzafm) list;
                int i11 = zzafmVar.f11323c + size4;
                int length = zzafmVar.f11322b.length;
                if (i11 > length) {
                    if (length != 0) {
                        while (length < i11) {
                            length = e0.c(length, 3, 2, 1, 10);
                        }
                        zzafmVar.f11322b = Arrays.copyOf(zzafmVar.f11322b, length);
                    } else {
                        zzafmVar.f11322b = new Object[Math.max(i11, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zzaca.j(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i12 = 0; i12 < size6; i12++) {
            Object obj3 = list2.get(i12);
            if (obj3 == null) {
                zzaca.j(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final byte[] b() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int iH = zzaduVar.h();
            byte[] bArr = new byte[iH];
            boolean z11 = zzada.f11245b;
            zzacx zzacxVar = new zzacx(bArr, iH);
            zzaduVar.i(zzacxVar);
            zzacxVar.e();
            return bArr;
        } catch (IOException e8) {
            String name = getClass().getName();
            throw new RuntimeException(p.u(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e8);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final zzacr c() {
        try {
            zzadu zzaduVar = (zzadu) this;
            int iH = zzaduVar.h();
            zzacr zzacrVar = zzacr.f11213b;
            byte[] bArr = new byte[iH];
            boolean z11 = zzada.f11245b;
            zzacx zzacxVar = new zzacx(bArr, iH);
            zzaduVar.i(zzacxVar);
            zzacxVar.e();
            return new zzacq(bArr);
        } catch (IOException e8) {
            String name = getClass().getName();
            throw new RuntimeException(p.u(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e8);
        }
    }

    public int e(zzafp zzafpVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final void g(OutputStream outputStream) {
        zzadu zzaduVar = (zzadu) this;
        int iH = zzaduVar.h();
        boolean z11 = zzada.f11245b;
        if (iH > 4096) {
            iH = 4096;
        }
        zzacz zzaczVar = new zzacz(outputStream, iH);
        zzaduVar.i(zzaczVar);
        if (zzaczVar.f11241e > 0) {
            zzaczVar.G();
        }
    }
}
