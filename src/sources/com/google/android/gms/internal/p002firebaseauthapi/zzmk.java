package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzmk implements zzmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzyq f10727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzlw f10728b;

    public zzmk(zzlw zzlwVar, zzyq zzyqVar) {
        this.f10728b = zzlwVar;
        this.f10727a = zzyqVar;
    }

    public static zzmk b(zzyq zzyqVar) throws GeneralSecurityException {
        int i11 = zzmn.f10743a[zzyqVar.ordinal()];
        if (i11 == 1) {
            return new zzmk(new zzlw("HmacSha256"), zzyq.zza);
        }
        if (i11 == 2) {
            return new zzmk(new zzlw("HmacSha384"), zzyq.zzb);
        }
        if (i11 == 3) {
            return new zzmk(new zzlw("HmacSha512"), zzyq.zzc);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(zzyqVar)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmc
    public final byte[] a(byte[] bArr, zzmf zzmfVar) throws GeneralSecurityException {
        byte[] bArrB = zzmfVar.f10720a.b();
        zzyq zzyqVar = this.f10727a;
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(zznh.a(bArrB), zzyr.c(zzyqVar));
        zzyv zzyvVar = zzyv.f11043f;
        ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) zzyvVar.f11044a.zza("EC")).generatePrivate(eCPrivateKeySpec);
        zzyt zzytVar = zzyt.zza;
        ECParameterSpec eCParameterSpecC = zzyr.c(zzyqVar);
        byte[] bArrE = zzyr.e(eCPrivateKey, (ECPublicKey) ((KeyFactory) zzyvVar.f11044a.zza("EC")).generatePublic(new ECPublicKeySpec(zzyr.d(eCParameterSpecC.getCurve(), zzytVar, bArr), eCParameterSpecC)));
        byte[] bArrD = zzyl.d(bArr, zzmfVar.f10721b.b());
        byte[] bArrD2 = zzyl.d(zzml.m, zza());
        zzlw zzlwVar = this.f10728b;
        int macLength = Mac.getInstance(zzlwVar.f10708a).getMacLength();
        byte[] bArr2 = zzml.f10742o;
        Charset charset = zzqj.f10870a;
        return zzlwVar.a(macLength, zzlwVar.c(zzyl.d(bArr2, bArrD2, "eae_prk".getBytes(charset), bArrE), null), zzyl.d(zzml.b(2, macLength), bArr2, bArrD2, "shared_secret".getBytes(charset), bArrD));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmc
    public final byte[] zza() throws GeneralSecurityException {
        int i11 = zzmn.f10743a[this.f10727a.ordinal()];
        if (i11 == 1) {
            return zzml.f10731c;
        }
        if (i11 == 2) {
            return zzml.f10732d;
        }
        if (i11 == 3) {
            return zzml.f10733e;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
