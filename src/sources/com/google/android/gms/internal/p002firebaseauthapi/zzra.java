package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import defpackage.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzra extends zzrd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzb f10901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzc f10902d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f10903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f10904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zzc f10905c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public zzb f10906d;

        public /* synthetic */ zza(int i11) {
            this();
        }

        private zza() {
            this.f10903a = null;
            this.f10904b = null;
            this.f10905c = null;
            this.f10906d = zzb.f10910e;
        }

        public final zzra a() throws GeneralSecurityException {
            Integer num = this.f10903a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f10904b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f10905c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f10906d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f10903a));
            }
            Integer num2 = this.f10904b;
            int iIntValue = num2.intValue();
            zzc zzcVar = this.f10905c;
            if (iIntValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
            }
            if (zzcVar == zzc.f10912b) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                }
            } else if (zzcVar == zzc.f10913c) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format(DytezVyM.xsHe, num2));
                }
            } else if (zzcVar == zzc.f10914d) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                }
            } else if (zzcVar == zzc.f10915e) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                }
            } else {
                if (zzcVar != zzc.f10916f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                }
            }
            return new zzra(this.f10903a.intValue(), this.f10904b.intValue(), this.f10906d, this.f10905c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzb f10907b = new zzb("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzb f10908c = new zzb("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzb f10909d = new zzb("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzb f10910e = new zzb("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10911a;

        public zzb(String str) {
            this.f10911a = str;
        }

        public final String toString() {
            return this.f10911a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzc {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzc f10912b = new zzc("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzc f10913c = new zzc("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzc f10914d = new zzc("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzc f10915e = new zzc("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final zzc f10916f = new zzc("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10917a;

        public zzc(String str) {
            this.f10917a = str;
        }

        public final String toString() {
            return this.f10917a;
        }
    }

    public zzra(int i11, int i12, zzb zzbVar, zzc zzcVar) {
        this.f10899a = i11;
        this.f10900b = i12;
        this.f10901c = zzbVar;
        this.f10902d = zzcVar;
    }

    public static zza b() {
        return new zza(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10901c != zzb.f10910e;
    }

    public final int c() {
        zzb zzbVar = zzb.f10910e;
        int i11 = this.f10900b;
        zzb zzbVar2 = this.f10901c;
        if (zzbVar2 == zzbVar) {
            return i11;
        }
        if (zzbVar2 == zzb.f10907b) {
            return i11 + 5;
        }
        if (zzbVar2 == zzb.f10908c) {
            return i11 + 5;
        }
        if (zzbVar2 == zzb.f10909d) {
            return i11 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzra)) {
            return false;
        }
        zzra zzraVar = (zzra) obj;
        return zzraVar.f10899a == this.f10899a && zzraVar.c() == c() && zzraVar.f10901c == this.f10901c && zzraVar.f10902d == this.f10902d;
    }

    public final int hashCode() {
        return Objects.hash(zzra.class, Integer.valueOf(this.f10899a), Integer.valueOf(this.f10900b), this.f10901c, this.f10902d);
    }

    public final String toString() {
        StringBuilder sbS = e.s("HMAC Parameters (variant: ", String.valueOf(this.f10901c), ", hashType: ", String.valueOf(this.f10902d), ", ");
        sbS.append(this.f10900b);
        sbS.append("-byte tags, and ");
        sbS.append(this.f10899a);
        sbS.append("-byte key)");
        return sbS.toString();
    }
}
