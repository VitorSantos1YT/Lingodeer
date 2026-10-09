package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxw extends zzyl {
    @Override // com.google.android.gms.internal.measurement.zzyl
    public final void b(Object obj, zzzc zzzcVar) {
        zzabe zzabeVar = (zzabe) obj;
        if (zzabeVar == null) {
            return;
        }
        zzabb zzabbVar = (zzabb) zzabeVar.f11178a.f11173c;
        zzabbVar.getClass();
        zzaba zzabaVar = new zzaba(zzabbVar);
        while (zzabaVar.hasNext()) {
            Map.Entry entry = (Map.Entry) zzabaVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                zzzcVar.a(null, (String) entry.getKey());
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    zzzcVar.a(it.next(), (String) entry.getKey());
                }
            }
        }
    }
}
