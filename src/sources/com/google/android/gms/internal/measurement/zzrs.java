package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzsx f11920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList f11921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f11923d;

    public zzrs(zzrr zzrrVar) {
        this.f11920a = zzrrVar.f11915a;
        this.f11921b = zzrrVar.f11916b;
        this.f11922c = zzrrVar.f11917c;
        this.f11923d = zzrrVar.f11919e;
    }

    public final ArrayList a(OutputStream outputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.f11922c;
        if (!arrayList2.isEmpty()) {
            int i11 = zzrq.f11913b;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                zzta zztaVarZzb = ((zztb) obj).zzb();
                if (zztaVarZzb != null) {
                    arrayList3.add(zztaVarZzb);
                }
            }
            zzrq zzrqVar = !arrayList3.isEmpty() ? new zzrq(outputStream, arrayList3) : null;
            if (zzrqVar != null) {
                arrayList.add(zzrqVar);
            }
        }
        Iterator<E> it = this.f11921b.iterator();
        if (it.hasNext()) {
            ((zztc) it.next()).b((OutputStream) Iterables.c(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
