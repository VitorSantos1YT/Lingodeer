package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpn f10722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzpn f10723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzcs f10724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzny f10725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzmi f10726e;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.firebase-auth-api.zzmi] */
    static {
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmg
        };
        f10722a = new zzpm(zzkm.class, zzbs.class);
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmj
        };
        f10723b = new zzpm(zzku.class, zzbr.class);
        zzwd.E();
        f10724c = new zzob("type.googleapis.com/google.crypto.tink.HpkePrivateKey", zzwj.zza.ASYMMETRIC_PRIVATE);
        zzwj.zza zzaVar = zzwj.zza.ASYMMETRIC_PUBLIC;
        zzwg.F();
        f10725d = new zzny("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzaVar);
        f10726e = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzno
            public final zzbt a(zzcq zzcqVar, Integer num) throws GeneralSecurityException {
                zzyq zzyqVar;
                byte[] bArr;
                zzzw zzzwVarB;
                zzzv zzzvVarA;
                zzkk zzkkVar = (zzkk) zzcqVar;
                zzpn zzpnVar = zzmh.f10722a;
                zzkk.zzf zzfVar = zzkkVar.f10640a;
                if (zzfVar.equals(zzkk.zzf.f10663f)) {
                    byte[] bArrA = zzpz.a(32);
                    bArrA[0] = (byte) (bArrA[0] | 7);
                    byte b3 = (byte) (bArrA[31] & 63);
                    bArrA[31] = b3;
                    bArrA[31] = (byte) (b3 | 128);
                    zzzwVarB = zzzw.b(bArrA, zzcw.f10287a);
                    zzzvVarA = zzzv.a(zzzt.a(bArrA));
                } else {
                    zzkk.zzf zzfVar2 = zzkk.zzf.f10660c;
                    boolean zEquals = zzfVar.equals(zzfVar2);
                    zzkk.zzf zzfVar3 = zzkk.zzf.f10662e;
                    zzkk.zzf zzfVar4 = zzkk.zzf.f10661d;
                    if (!zEquals && !zzfVar.equals(zzfVar4) && !zzfVar.equals(zzfVar3)) {
                        throw new GeneralSecurityException("Unknown KEM ID");
                    }
                    byte[] bArr2 = zzml.f10729a;
                    if (zzfVar == zzfVar2) {
                        zzyqVar = zzyq.zza;
                    } else if (zzfVar == zzfVar4) {
                        zzyqVar = zzyq.zzb;
                    } else {
                        if (zzfVar != zzfVar3) {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                        zzyqVar = zzyq.zzc;
                    }
                    ECParameterSpec eCParameterSpecC = zzyr.c(zzyqVar);
                    KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzyv.f11042e.f11044a.zza("EC");
                    keyPairGenerator.initialize(eCParameterSpecC);
                    KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                    zzyt zzytVar = zzyt.zza;
                    ECPoint w11 = ((ECPublicKey) keyPairGenerateKeyPair.getPublic()).getW();
                    EllipticCurve curve = zzyr.c(zzyqVar).getCurve();
                    zzni.g(w11, curve);
                    int iA = zzyr.a(curve);
                    int iOrdinal = zzytVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            int i11 = iA + 1;
                            bArr = new byte[i11];
                            byte[] bArrB = zznh.b(w11.getAffineX());
                            System.arraycopy(bArrB, 0, bArr, i11 - bArrB.length, bArrB.length);
                            bArr[0] = (byte) (w11.getAffineY().testBit(0) ? 3 : 2);
                        } else {
                            if (iOrdinal != 2) {
                                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzytVar)));
                            }
                            int i12 = iA * 2;
                            bArr = new byte[i12];
                            byte[] bArrB2 = zznh.b(w11.getAffineX());
                            if (bArrB2.length > iA) {
                                bArrB2 = Arrays.copyOfRange(bArrB2, bArrB2.length - iA, bArrB2.length);
                            }
                            byte[] bArrB3 = zznh.b(w11.getAffineY());
                            if (bArrB3.length > iA) {
                                bArrB3 = Arrays.copyOfRange(bArrB3, bArrB3.length - iA, bArrB3.length);
                            }
                            System.arraycopy(bArrB3, 0, bArr, i12 - bArrB3.length, bArrB3.length);
                            System.arraycopy(bArrB2, 0, bArr, iA - bArrB2.length, bArrB2.length);
                        }
                    } else {
                        int i13 = (iA * 2) + 1;
                        bArr = new byte[i13];
                        byte[] bArrB4 = zznh.b(w11.getAffineX());
                        byte[] bArrB5 = zznh.b(w11.getAffineY());
                        System.arraycopy(bArrB5, 0, bArr, i13 - bArrB5.length, bArrB5.length);
                        System.arraycopy(bArrB4, 0, bArr, (iA + 1) - bArrB4.length, bArrB4.length);
                        bArr[0] = 4;
                    }
                    zzzv zzzvVarA2 = zzzv.a(bArr);
                    zzzwVarB = zzzw.b(zznh.c(((ECPrivateKey) keyPairGenerateKeyPair.getPrivate()).getS(), zzml.a(zzfVar)), zzcw.f10287a);
                    zzzvVarA = zzzvVarA2;
                }
                return zzkm.e(zzku.e(zzkkVar, zzzvVarA, num), zzzwVarB);
            }
        };
    }
}
