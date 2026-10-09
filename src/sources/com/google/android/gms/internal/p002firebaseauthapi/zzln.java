package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzln implements zzlo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzdo f10694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10695b;

    public zzln(zzdo zzdoVar) {
        this.f10694a = zzdoVar;
        this.f10695b = zzdoVar.f10311a + zzdoVar.f10312b;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final byte[] a(int i11, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length < i11) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i11, bArr2.length);
        zzdo zzdoVar = this.f10694a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, zzdoVar.f10311a);
        int i12 = zzdoVar.f10311a;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i12, zzdoVar.f10312b + i12);
        zzdh.zza zzaVar = new zzdh.zza(0);
        zzaVar.f10302a = zzdoVar;
        zzcw zzcwVar = zzcw.f10287a;
        zzaVar.f10303b = zzzw.b(bArrCopyOf, zzcwVar);
        zzaVar.f10304c = zzzw.b(bArrCopyOfRange2, zzcwVar);
        return zzys.c(zzaVar.a()).a(bArrCopyOfRange, zzlk.f10692a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlo
    public final int zza() {
        return this.f10695b;
    }
}
