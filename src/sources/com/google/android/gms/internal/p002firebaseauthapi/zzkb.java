package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpn f10600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzpn f10601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzcs f10602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzny f10603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzkg f10604e;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.firebase-auth-api.zzkg] */
    static {
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzke
        };
        f10600a = new zzpm(zzki.class, zzbs.class);
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkd
        };
        f10601b = new zzpm(zzkl.class, zzbr.class);
        zzuv.E();
        f10602c = new zzob("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzwj.zza.ASYMMETRIC_PRIVATE);
        zzwj.zza zzaVar = zzwj.zza.ASYMMETRIC_PUBLIC;
        zzuy.H();
        f10603d = new zzny("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzaVar);
        f10604e = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzno
            public final zzbt a(zzcq zzcqVar, Integer num) throws GeneralSecurityException {
                ECParameterSpec eCParameterSpec;
                zzkf zzkfVar = (zzkf) zzcqVar;
                zzpn zzpnVar = zzkb.f10600a;
                zzkf.zzc zzcVar = zzkfVar.f10606a;
                if (zzcVar == zzkf.zzc.f10624b) {
                    eCParameterSpec = zzni.f10769a;
                } else if (zzcVar == zzkf.zzc.f10625c) {
                    eCParameterSpec = zzni.f10770b;
                } else {
                    if (zzcVar != zzkf.zzc.f10626d) {
                        throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(zzcVar)));
                    }
                    eCParameterSpec = zzni.f10771c;
                }
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzyv.f11042e.f11044a.zza("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                zzkl zzklVarF = zzkl.f(zzkfVar, eCPublicKey.getW(), num);
                BigInteger s3 = eCPrivateKey.getS();
                if (zzcw.f10287a != null) {
                    return zzki.e(zzklVarF, new zzzu(s3));
                }
                throw new NullPointerException("SecretKeyAccess required");
            }
        };
    }
}
