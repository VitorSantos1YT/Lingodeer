package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgy extends zzhd {
    public zzgy() {
        super(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final void a() {
        if (!this.f12446d) {
            if (this.f12444b > 0) {
                ((zzey) ((zzgz) d(0)).f12430a).zze();
                throw null;
            }
            Iterator it = b().iterator();
            if (it.hasNext()) {
                ((zzey) ((Map.Entry) it.next()).getKey()).zze();
                throw null;
            }
        }
        super.a();
    }
}
