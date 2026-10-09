package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzlw implements zzmd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10708a;

    public zzlw(String str) {
        this.f10708a = str;
    }

    public final byte[] a(int i11, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzyz zzyzVar = zzyv.f11040c.f11044a;
        String str = this.f10708a;
        Mac mac = (Mac) zzyzVar.zza(str);
        if (i11 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i11];
        mac.init(new SecretKeySpec(bArr, str));
        byte[] bArrDoFinal = new byte[0];
        int i12 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i12);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i11) {
                System.arraycopy(bArrDoFinal, 0, bArr3, length, i11 - length);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i12++;
        }
    }

    public final byte[] b(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return c(zzyl.d(zzml.f10742o, bArr3, str.getBytes(zzqj.f10870a), bArr2), bArr);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        zzyz zzyzVar = zzyv.f11040c.f11044a;
        String str = this.f10708a;
        Mac mac = (Mac) zzyzVar.zza(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i11) {
        return a(i11, bArr, zzyl.d(zzml.b(2, i11), zzml.f10742o, bArr3, str.getBytes(zzqj.f10870a), bArr2));
    }

    public final byte[] e() throws GeneralSecurityException {
        String str = this.f10708a;
        str.getClass();
        byte b3 = -1;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    b3 = 0;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    b3 = 1;
                }
                break;
            case 984525777:
                if (str.equals(iFLeRCXvYCGdPW.aga)) {
                    b3 = 2;
                }
                break;
        }
        switch (b3) {
            case 0:
                return zzml.f10734f;
            case 1:
                return zzml.f10735g;
            case 2:
                return zzml.f10736h;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }
}
