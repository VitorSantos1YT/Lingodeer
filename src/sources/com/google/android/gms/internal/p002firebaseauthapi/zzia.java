package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzia {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzjb.zza f10540c = zzjb.zza.zza;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f10542b;

    public zzia(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!f10540c.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f10541a = new SecretKeySpec(bArr, "ChaCha20");
        this.f10542b = provider;
    }
}
