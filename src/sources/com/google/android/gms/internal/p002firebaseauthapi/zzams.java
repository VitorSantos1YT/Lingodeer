package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzams extends zzamt {
    public zzams() {
        super(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamt
    public final void d() {
        if (!this.f10199d) {
            if (this.f10197b > 0) {
                ((zzako) ((zzamx) c(0)).f10209a).zze();
                throw null;
            }
            Iterator it = f().iterator();
            if (it.hasNext()) {
                ((zzako) ((Map.Entry) it.next()).getKey()).zze();
                throw null;
            }
        }
        super.d();
    }
}
