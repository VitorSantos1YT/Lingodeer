package com.google.android.gms.internal.p002firebaseauthapi;

import i0.pKy.shrCcjmOhAmRC;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyr {
    public static int a(EllipticCurve ellipticCurve) {
        return (zzni.d(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger b(BigInteger bigInteger, boolean z11, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerD = zzni.d(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerD);
        if (bigIntegerD.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerD);
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigIntegerAdd)) {
            if (bigIntegerD.testBit(0) && bigIntegerD.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerD.add(BigInteger.ONE).shiftRight(2), bigIntegerD);
            } else if (!bigIntegerD.testBit(0) || bigIntegerD.testBit(1)) {
                bigIntegerAdd = null;
            } else {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerD.subtract(bigIntegerAdd).shiftRight(1);
                int i11 = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerD);
                    if (!bigIntegerMod3.equals(BigInteger.ZERO)) {
                        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerD);
                        BigInteger bigIntegerMod4 = BigInteger.ONE;
                        if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerD)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerD.add(bigIntegerMod4).shiftRight(1);
                            BigInteger bigIntegerMod5 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerD).multiply(bigIntegerMod3)).mod(bigIntegerD);
                                BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerD);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerD);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerD);
                                    bigIntegerMod5 = bigIntegerMod7;
                                } else {
                                    bigIntegerMod4 = bigIntegerMod6;
                                }
                            }
                            bigIntegerAdd = bigIntegerMod5;
                        } else {
                            if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                            i11++;
                            if (i11 == 128 && !bigIntegerD.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerD).compareTo(bigIntegerMod2) != 0) {
                throw new GeneralSecurityException("Could not find a modular square root");
            }
        }
        return z11 != bigIntegerAdd.testBit(0) ? bigIntegerD.subtract(bigIntegerAdd).mod(bigIntegerD) : bigIntegerAdd;
    }

    public static ECParameterSpec c(zzyq zzyqVar) throws NoSuchAlgorithmException {
        int iOrdinal = zzyqVar.ordinal();
        if (iOrdinal == 0) {
            return zzni.f10769a;
        }
        if (iOrdinal == 1) {
            return zzni.f10770b;
        }
        if (iOrdinal == 2) {
            return zzni.f10771c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(zzyqVar)));
    }

    public static byte[] e(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        try {
            if (!zzni.h(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w11 = eCPublicKey.getW();
            zzni.g(w11, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = ((KeyFactory) zzyv.f11043f.f11044a.zza("EC")).generatePublic(new ECPublicKeySpec(w11, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) zzyv.f11041d.f11044a.zza("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(zzni.d(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                b(bigInteger, true, curve);
                return bArrGenerateSecret;
            } catch (IllegalStateException e8) {
                throw new GeneralSecurityException(e8);
            }
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static ECPoint d(EllipticCurve ellipticCurve, zzyt zzytVar, byte[] bArr) throws GeneralSecurityException {
        int iA = a(ellipticCurve);
        int iOrdinal = zzytVar.ordinal();
        boolean z11 = false;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (bArr.length == iA * 2) {
                        ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, iA)), new BigInteger(1, Arrays.copyOfRange(bArr, iA, bArr.length)));
                        zzni.g(eCPoint, ellipticCurve);
                        return eCPoint;
                    }
                    throw new GeneralSecurityException("invalid point size");
                }
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zzytVar)));
            }
            BigInteger bigIntegerD = zzni.d(ellipticCurve);
            if (bArr.length == iA + 1) {
                byte b3 = bArr[0];
                if (b3 != 2) {
                    if (b3 == 3) {
                        z11 = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(bigIntegerD) < 0) {
                    return new ECPoint(bigInteger, b(bigInteger, z11, ellipticCurve));
                }
                throw new GeneralSecurityException("x is out of range");
            }
            throw new GeneralSecurityException(shrCcjmOhAmRC.lzoDbmmqHuu);
        }
        if (bArr.length == (iA * 2) + 1) {
            if (bArr[0] == 4) {
                int i11 = iA + 1;
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i11)), new BigInteger(1, Arrays.copyOfRange(bArr, i11, bArr.length)));
                zzni.g(eCPoint2, ellipticCurve);
                return eCPoint2;
            }
            throw new GeneralSecurityException("invalid point format");
        }
        throw new GeneralSecurityException("invalid point size");
    }
}
