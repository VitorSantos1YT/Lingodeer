package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxv extends zzyl {
    @Override // com.google.android.gms.internal.measurement.zzyl
    public final void a(Iterator it, zzzc zzzcVar) {
        if (it.hasNext()) {
            Object next = it.next();
            boolean zHasNext = it.hasNext();
            String str = this.f12179a;
            if (!zHasNext) {
                zzzcVar.a(next, str);
                return;
            }
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(next);
            do {
                sb2.append(',');
                sb2.append(it.next());
            } while (it.hasNext());
            sb2.append(']');
            zzzcVar.a(sb2.toString(), str);
        }
    }
}
