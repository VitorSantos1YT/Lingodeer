package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzkq implements zzoq {
    private static final zzmo zza;

    static {
        int i11 = zzmo.zzb;
        int i12 = zzos.zza;
        zza = zzmo.zza;
    }

    public zzoi zza(byte[] bArr, int i11, int i12, zzmo zzmoVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final /* synthetic */ Object zzb(byte[] bArr) throws zznn {
        zzoi zzoiVarZza = zza(bArr, 0, bArr.length, zza);
        if (zzoiVarZza == null || zzoiVarZza.zzp()) {
            return zzoiVarZza;
        }
        throw new zzpk((zzko) zzoiVarZza).zza();
    }
}
