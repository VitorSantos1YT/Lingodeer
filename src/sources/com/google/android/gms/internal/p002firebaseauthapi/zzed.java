package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzed extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzb f10370d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f10371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f10372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public zzb f10374d;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzed a() throws GeneralSecurityException {
            Integer num = this.f10371a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f10374d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f10372b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f10373c != null) {
                return new zzed(num.intValue(), this.f10372b.intValue(), this.f10373c.intValue(), this.f10374d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public final void b() {
            this.f10372b = 12;
        }

        public final void c(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 16 && i11 != 24 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f10371a = Integer.valueOf(i11);
        }

        public final void d() {
            this.f10373c = 16;
        }

        private zza() {
            this.f10371a = null;
            this.f10372b = null;
            this.f10373c = null;
            this.f10374d = zzb.f10377d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzb f10375b = new zzb("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzb f10376c = new zzb("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzb f10377d = new zzb("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10378a;

        public zzb(String str) {
            this.f10378a = str;
        }

        public final String toString() {
            return this.f10378a;
        }
    }

    public zzed(int i11, int i12, int i13, zzb zzbVar) {
        this.f10367a = i11;
        this.f10368b = i12;
        this.f10369c = i13;
        this.f10370d = zzbVar;
    }

    public static zza b() {
        return new zza(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10370d != zzb.f10377d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzed)) {
            return false;
        }
        zzed zzedVar = (zzed) obj;
        return zzedVar.f10367a == this.f10367a && zzedVar.f10368b == this.f10368b && zzedVar.f10369c == this.f10369c && zzedVar.f10370d == this.f10370d;
    }

    public final int hashCode() {
        return Objects.hash(zzed.class, Integer.valueOf(this.f10367a), Integer.valueOf(this.f10368b), Integer.valueOf(this.f10369c), this.f10370d);
    }

    public final String toString() {
        StringBuilder sbQ = e.q(this.f10368b, "AesGcm Parameters (variant: ", String.valueOf(this.f10370d), ", ", "-byte IV, ");
        sbQ.append(this.f10369c);
        sbQ.append("-byte tag, and ");
        sbQ.append(this.f10367a);
        sbQ.append("-byte key)");
        return sbQ.toString();
    }
}
