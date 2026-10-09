package com.google.android.recaptcha.internal;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgf {
    private final zzge zza;
    private final HashMap zzb;
    private final zzfw zzc;
    private final zzcg zzd;

    public zzgf(zzfw zzfwVar, zzcg zzcgVar, zzbo zzboVar) {
        this.zzc = zzfwVar;
        this.zzd = zzcgVar;
        zzge zzgeVar = new zzge();
        this.zza = zzgeVar;
        HashMap map = new HashMap();
        this.zzb = map;
        zzgeVar.zzd(173, map);
    }

    public final zzge zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zza.zzc();
        this.zza.zzd(173, this.zzb);
    }

    public final zzcg zzc() {
        return this.zzd;
    }

    public final zzfw zzd() {
        return this.zzc;
    }

    public final void zze(int i11, Object obj) {
        this.zzb.put(Integer.valueOf(i11 - 2), obj);
    }
}
