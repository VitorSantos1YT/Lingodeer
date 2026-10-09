package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyn implements zzbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f11026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzyp f11027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzyt f11030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzlo f11031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f11032g;

    public zzyn(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzyt zzytVar, zzlo zzloVar, byte[] bArr2) {
        this.f11026a = eCPrivateKey;
        zzyp zzypVar = new zzyp();
        zzypVar.f11033a = eCPrivateKey;
        this.f11027b = zzypVar;
        this.f11029d = bArr;
        this.f11028c = str;
        this.f11030e = zzytVar;
        this.f11031f = zzloVar;
        this.f11032g = bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:17:0x0088  */
    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c9 A[LOOP:0: B:22:0x00b6->B:24:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00db  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int i11;
        int i12;
        zzlo zzloVar;
        int iZza;
        byte[] bArrD;
        String str;
        Mac mac;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArrDoFinal;
        int length;
        byte[] bArr4 = this.f11032g;
        if (!zzqj.b(bArr4, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        int length2 = bArr4.length;
        int iA = zzyr.a(this.f11026a.getParams().getCurve());
        zzyt zzytVar = this.f11030e;
        int iOrdinal = zzytVar.ordinal();
        int i13 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new GeneralSecurityException("unknown EC point format");
                }
                i11 = iA * 2;
            }
            i12 = i11 + length2;
            if (bArr.length >= i12) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i12);
            zzloVar = this.f11031f;
            iZza = zzloVar.zza();
            ECPrivateKey eCPrivateKey = this.f11027b.f11033a;
            ECParameterSpec params = eCPrivateKey.getParams();
            bArrD = zzyl.d(bArrCopyOfRange, zzyr.e(eCPrivateKey, (ECPublicKey) ((KeyFactory) zzyv.f11043f.f11044a.zza("EC")).generatePublic(new ECPublicKeySpec(zzyr.d(params.getCurve(), zzytVar, bArrCopyOfRange), params))));
            zzyz zzyzVar = zzyv.f11040c.f11044a;
            str = this.f11028c;
            mac = (Mac) zzyzVar.zza(str);
            if (iZza <= mac.getMacLength() * 255) {
                throw new GeneralSecurityException("size too large");
            }
            bArr2 = this.f11029d;
            if (bArr2.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr2, str));
            }
            bArr3 = new byte[iZza];
            mac.init(new SecretKeySpec(mac.doFinal(bArrD), str));
            bArrDoFinal = new byte[0];
            length = 0;
            while (true) {
                mac.update(bArrDoFinal);
                mac.update((byte[]) null);
                mac.update((byte) i13);
                bArrDoFinal = mac.doFinal();
                if (bArrDoFinal.length + length < iZza) {
                    System.arraycopy(bArrDoFinal, 0, bArr3, length, iZza - length);
                    return zzloVar.a(i12, bArr3, bArr);
                }
                System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
                length += bArrDoFinal.length;
                i13++;
            }
        } else {
            iA *= 2;
        }
        i11 = iA + 1;
        i12 = i11 + length2;
        if (bArr.length >= i12) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2, i12);
        zzloVar = this.f11031f;
        iZza = zzloVar.zza();
        ECPrivateKey eCPrivateKey2 = this.f11027b.f11033a;
        ECParameterSpec params2 = eCPrivateKey2.getParams();
        bArrD = zzyl.d(bArrCopyOfRange2, zzyr.e(eCPrivateKey2, (ECPublicKey) ((KeyFactory) zzyv.f11043f.f11044a.zza("EC")).generatePublic(new ECPublicKeySpec(zzyr.d(params2.getCurve(), zzytVar, bArrCopyOfRange2), params2))));
        zzyz zzyzVar2 = zzyv.f11040c.f11044a;
        str = this.f11028c;
        mac = (Mac) zzyzVar2.zza(str);
        if (iZza <= mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        bArr2 = this.f11029d;
        if (bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        bArr3 = new byte[iZza];
        mac.init(new SecretKeySpec(mac.doFinal(bArrD), str));
        bArrDoFinal = new byte[0];
        length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update((byte[]) null);
            mac.update((byte) i13);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length < iZza) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, iZza - length);
                return zzloVar.a(i12, bArr3, bArr);
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i13++;
        }
    }
}
