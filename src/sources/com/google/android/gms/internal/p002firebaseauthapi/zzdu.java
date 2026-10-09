package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdu extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zza f10346d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zza f10347b = new zza("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zza f10348c = new zza("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zza f10349d = new zza("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10350a;

        public zza(String str) {
            this.f10350a = str;
        }

        public final String toString() {
            return this.f10350a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f10351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f10352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public zza f10354d;

        public /* synthetic */ zzb(int i11) {
            this();
        }

        public final zzdu a() throws GeneralSecurityException {
            Integer num = this.f10351a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f10352b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f10354d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f10353c != null) {
                return new zzdu(num.intValue(), this.f10352b.intValue(), this.f10353c.intValue(), this.f10354d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public final void b(int i11) throws GeneralSecurityException {
            if (i11 != 12 && i11 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i11)));
            }
            this.f10352b = Integer.valueOf(i11);
        }

        public final void c(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 16 && i11 != 24 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f10351a = Integer.valueOf(i11);
        }

        public final void d() {
            this.f10353c = 16;
        }

        private zzb() {
            this.f10351a = null;
            this.f10352b = null;
            this.f10353c = null;
            this.f10354d = zza.f10349d;
        }
    }

    public zzdu(int i11, int i12, int i13, zza zzaVar) {
        this.f10343a = i11;
        this.f10344b = i12;
        this.f10345c = i13;
        this.f10346d = zzaVar;
    }

    public static zzb b() {
        return new zzb(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10346d != zza.f10349d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdu)) {
            return false;
        }
        zzdu zzduVar = (zzdu) obj;
        return zzduVar.f10343a == this.f10343a && zzduVar.f10344b == this.f10344b && zzduVar.f10345c == this.f10345c && zzduVar.f10346d == this.f10346d;
    }

    public final int hashCode() {
        return Objects.hash(zzdu.class, Integer.valueOf(this.f10343a), Integer.valueOf(this.f10344b), Integer.valueOf(this.f10345c), this.f10346d);
    }

    public final String toString() {
        StringBuilder sbQ = e.q(this.f10344b, "AesEax Parameters (variant: ", String.valueOf(this.f10346d), ", ", "-byte IV, ");
        sbQ.append(this.f10345c);
        sbQ.append("-byte tag, and ");
        sbQ.append(this.f10343a);
        sbQ.append("-byte key)");
        return sbQ.toString();
    }
}
