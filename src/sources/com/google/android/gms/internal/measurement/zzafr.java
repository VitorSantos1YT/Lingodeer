package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafr extends zzafv {
    public zzafr() {
        super(0);
    }

    @Override // com.google.android.gms.internal.measurement.zzafv
    public final void a() {
        if (!this.f11340d) {
            if (this.f11338b > 0) {
                ((zzadj) ((zzafs) b(0)).f11329a).zzd();
                throw null;
            }
            Iterator it = c().iterator();
            if (it.hasNext()) {
                ((zzadj) ((Map.Entry) it.next()).getKey()).zzd();
                throw null;
            }
        }
        super.a();
    }
}
