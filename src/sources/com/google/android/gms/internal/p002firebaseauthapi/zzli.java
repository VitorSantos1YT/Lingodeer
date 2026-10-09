package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzli implements zzlz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10691a;

    public zzli(int i11) throws InvalidAlgorithmParameterException {
        if (i11 != 16 && i11 != 32) {
            throw new InvalidAlgorithmParameterException(p.j(i11, "Unsupported key length: "));
        }
        this.f10691a = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlz
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length == this.f10691a) {
            return new zzht(bArr).a(bArr2, bArr3, i11, bArr4);
        }
        throw new InvalidAlgorithmParameterException(p.j(bArr.length, "Unexpected key length: "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlz
    public final int zza() {
        return this.f10691a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlz
    public final byte[] zzc() throws GeneralSecurityException {
        int i11 = this.f10691a;
        if (i11 == 16) {
            return zzml.f10737i;
        }
        if (i11 == 32) {
            return zzml.f10738j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
