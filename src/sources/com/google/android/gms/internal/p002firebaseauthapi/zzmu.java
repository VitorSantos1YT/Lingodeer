package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmu implements zzms {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f10747b = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f10748c = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f10749a;

    public zzmu(Provider provider) {
        this.f10749a = provider;
    }

    public static zzmu b() throws GeneralSecurityException {
        Provider providerA = zzng.a();
        if (providerA == null) {
            throw new GeneralSecurityException("Conscrypt is not available.");
        }
        KeyFactory.getInstance("XDH", providerA);
        KeyAgreement.getInstance("XDH", providerA);
        zzmu zzmuVar = new zzmu(providerA);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", providerA);
        keyPairGenerator.initialize(255);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            throw new GeneralSecurityException("Invalid encoded private key length");
        }
        if (!zzqj.b(f10747b, encoded)) {
            throw new GeneralSecurityException("Invalid encoded private key prefix");
        }
        Arrays.copyOfRange(encoded, 16, encoded.length);
        byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            throw new GeneralSecurityException("Invalid encoded public key length");
        }
        if (!zzqj.b(f10748c, encoded2)) {
            throw new GeneralSecurityException("Invalid encoded public key prefix");
        }
        Arrays.copyOfRange(encoded2, 12, encoded2.length);
        return zzmuVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
    public final byte[] a(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        Provider provider = this.f10749a;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length != 32) {
            throw new InvalidKeyException("Invalid X25519 private key");
        }
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(zzyl.d(f10747b, bArr)));
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(zzyl.d(f10748c, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }
}
