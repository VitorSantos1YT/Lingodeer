package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs extends zzo {
    public final /* synthetic */ zzt H;

    public zzs(zzt zztVar) {
        this.H = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final String a() {
        zzp zzpVar = (zzp) this.H.f12490a.get();
        return zzpVar == null ? "Completer object has been garbage collected, future will fail soon" : ep.a.g("tag=[", String.valueOf(zzpVar.f12486a), "]");
    }
}
