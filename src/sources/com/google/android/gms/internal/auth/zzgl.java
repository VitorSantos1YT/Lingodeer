package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzgl extends zzgv {
    @Override // com.google.android.gms.internal.auth.zzgv
    public final void a() {
        if (!this.f9558d) {
            for (int i11 = 0; i11 < this.f9556b.size(); i11++) {
                Map.Entry entry = (Map.Entry) this.f9556b.get(i11);
                if (((zzep) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.f9557c.isEmpty() ? zzgo.f9545b : this.f9557c.entrySet()) {
                if (((zzep) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
