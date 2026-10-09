package com.google.android.gms.internal.measurement;

import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzst implements zzrt {
    private zzst() {
    }

    public static zzst b() {
        return new zzst();
    }

    public static final InputStream c(zzrs zzrsVar) throws IOException {
        InputStream inputStreamA = zzrsVar.f11920a.a(zzrsVar.f11923d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamA);
        ArrayList arrayList2 = zzrsVar.f11922c;
        if (!arrayList2.isEmpty()) {
            int i11 = zzrp.f11911b;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                zzsz zzszVarZza = ((zztb) obj).zza();
                if (zzszVarZza != null) {
                    arrayList3.add(zzszVarZza);
                }
            }
            zzrp zzrpVar = !arrayList3.isEmpty() ? new zzrp(inputStreamA, arrayList3) : null;
            if (zzrpVar != null) {
                arrayList.add(zzrpVar);
            }
        }
        Iterator<E> it = zzrsVar.f11921b.iterator();
        if (it.hasNext()) {
            ((zztc) it.next()).a((InputStream) Iterables.c(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object a(zzrs zzrsVar) {
        return c(zzrsVar);
    }
}
