package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgc implements zzgj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgj[] f12394a;

    public zzgc(zzgj... zzgjVarArr) {
        this.f12394a = zzgjVarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final zzgi zzb(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            zzgj zzgjVar = this.f12394a[i11];
            if (zzgjVar.zzc(cls)) {
                return zzgjVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final boolean zzc(Class cls) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (this.f12394a[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
