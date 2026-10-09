package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzm implements zzsc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzjb.zza f11049e = zzjb.zza.zzb;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f11050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f11052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11053d;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsc
    public final byte[] a(byte[] bArr, int i11) throws InvalidAlgorithmParameterException {
        if (i11 > this.f11053d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.f11050a;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i11);
    }

    public zzzm(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        zzzp zzzpVar = new zzzp(this);
        this.f11050a = zzzpVar;
        if (f11049e.a()) {
            this.f11051b = str;
            this.f11052c = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                str.getClass();
                byte b3 = -1;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            b3 = 0;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            b3 = 1;
                        }
                        break;
                    case 392315118:
                        if (str.equals(iFLeRCXvYCGdPW.HROkgpEJAp)) {
                            b3 = 2;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            b3 = 3;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            b3 = 4;
                        }
                        break;
                }
                switch (b3) {
                    case 0:
                        this.f11053d = 20;
                        break;
                    case 1:
                        this.f11053d = 28;
                        break;
                    case 2:
                        this.f11053d = 32;
                        break;
                    case 3:
                        this.f11053d = 48;
                        break;
                    case 4:
                        this.f11053d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                zzzpVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
