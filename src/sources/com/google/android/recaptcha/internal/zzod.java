package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzod {
    public static final boolean zza(Object obj) {
        return !((zzoc) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzoc zzocVarZzb = (zzoc) obj;
        zzoc zzocVar = (zzoc) obj2;
        if (!zzocVar.isEmpty()) {
            if (!zzocVarZzb.zze()) {
                zzocVarZzb = zzocVarZzb.zzb();
            }
            zzocVarZzb.zzd(zzocVar);
        }
        return zzocVarZzb;
    }
}
