package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzmz extends zzmx implements zzoj {
    public zzmz(zzna zznaVar) {
        super(zznaVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zzoh
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzna zzl() {
        if (!((zzna) this.zza).zzL()) {
            return (zzna) this.zza;
        }
        ((zzna) this.zza).zzb.zzg();
        return (zzna) super.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzmx
    public final void zzo() {
        super.zzo();
        if (((zzna) this.zza).zzb != zzmt.zzd()) {
            zzna zznaVar = (zzna) this.zza;
            zznaVar.zzb = zznaVar.zzb.clone();
        }
    }
}
