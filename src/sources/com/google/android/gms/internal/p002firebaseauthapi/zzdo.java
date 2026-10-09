package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import defpackage.e;
import ep.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdo extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzb f10315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzc f10316f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f10317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f10318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f10320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zzc f10321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public zzb f10322f;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzdo a() throws GeneralSecurityException {
            if (this.f10317a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.f10318b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f10319c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f10320d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f10321e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f10322f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            int iIntValue = num.intValue();
            zzc zzcVar = this.f10321e;
            if (zzcVar == zzc.f10327b) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                }
            } else if (zzcVar == zzc.f10328c) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                }
            } else if (zzcVar == zzc.f10329d) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                }
            } else if (zzcVar == zzc.f10330e) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                }
            } else {
                if (zzcVar != zzc.f10331f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                }
            }
            return new zzdo(this.f10317a.intValue(), this.f10318b.intValue(), this.f10319c.intValue(), this.f10320d.intValue(), this.f10322f, this.f10321e);
        }

        public final void c(int i11) {
            if (i11 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i11)));
            }
            this.f10318b = Integer.valueOf(i11);
        }

        public final void d(int i11) {
            if (i11 < 12 || i11 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i11)));
            }
            this.f10319c = Integer.valueOf(i11);
        }

        public final void e(int i11) {
            if (i11 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i11)));
            }
            this.f10320d = Integer.valueOf(i11);
        }

        private zza() {
            this.f10317a = null;
            this.f10318b = null;
            this.f10319c = null;
            this.f10320d = null;
            this.f10321e = null;
            this.f10322f = zzb.f10325d;
        }

        public final void b(int i11) {
            if (i11 == 16 || i11 == 24 || i11 == 32) {
                this.f10317a = Integer.valueOf(i11);
            } else {
                throw new InvalidAlgorithmParameterException(String.format(gkbGsXmgaxRjJ.LwjcfLK, Integer.valueOf(i11)));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzb f10323b = new zzb(PQgum.UZPRyKVDsjs);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzb f10324c = new zzb("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzb f10325d = new zzb("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10326a;

        public zzb(String str) {
            this.f10326a = str;
        }

        public final String toString() {
            return this.f10326a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzc {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzc f10327b = new zzc("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzc f10328c = new zzc("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzc f10329d = new zzc("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzc f10330e = new zzc("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final zzc f10331f = new zzc("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10332a;

        public zzc(String str) {
            this.f10332a = str;
        }

        public final String toString() {
            return this.f10332a;
        }
    }

    public zzdo(int i11, int i12, int i13, int i14, zzb zzbVar, zzc zzcVar) {
        this.f10311a = i11;
        this.f10312b = i12;
        this.f10313c = i13;
        this.f10314d = i14;
        this.f10315e = zzbVar;
        this.f10316f = zzcVar;
    }

    public static zza b() {
        return new zza(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10315e != zzb.f10325d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdo)) {
            return false;
        }
        zzdo zzdoVar = (zzdo) obj;
        return zzdoVar.f10311a == this.f10311a && zzdoVar.f10312b == this.f10312b && zzdoVar.f10313c == this.f10313c && zzdoVar.f10314d == this.f10314d && zzdoVar.f10315e == this.f10315e && zzdoVar.f10316f == this.f10316f;
    }

    public final int hashCode() {
        return Objects.hash(zzdo.class, Integer.valueOf(this.f10311a), Integer.valueOf(this.f10312b), Integer.valueOf(this.f10313c), Integer.valueOf(this.f10314d), this.f10315e, this.f10316f);
    }

    public final String toString() {
        StringBuilder sbS = e.s("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.f10315e), ", hashType: ", String.valueOf(this.f10316f), ", ");
        a.v(this.f10313c, this.f10314d, "-byte IV, and ", "-byte tags, and ", sbS);
        sbS.append(this.f10311a);
        sbS.append(OCBJEWZHh.sYCpYTiht);
        sbS.append(this.f10312b);
        sbS.append("-byte HMAC key)");
        return sbS.toString();
    }
}
