package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpn extends zzpl {
    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzpmVarZzf = zzpm.zzf();
        zzndVar.zzc = zzpmVarZzf;
        return zzpmVarZzf;
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ Object zzb() {
        return zzpm.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ Object zzc(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        zzpmVar.zzh();
        return zzpmVar;
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i11, int i12) {
        ((zzpm) obj).zzj((i11 << 3) | 5, Integer.valueOf(i12));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i11, long j11) {
        ((zzpm) obj).zzj((i11 << 3) | 1, Long.valueOf(j11));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i11, Object obj2) {
        ((zzpm) obj).zzj((i11 << 3) | 3, (zzpm) obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i11, zzle zzleVar) {
        ((zzpm) obj).zzj((i11 << 3) | 2, zzleVar);
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i11, long j11) {
        ((zzpm) obj).zzj(i11 << 3, Long.valueOf(j11));
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final void zzi(Object obj) {
        ((zznd) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzpl
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zznd) obj).zzc = (zzpm) obj2;
    }
}
