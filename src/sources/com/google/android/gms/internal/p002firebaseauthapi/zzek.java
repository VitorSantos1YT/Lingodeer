package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzek extends zzdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zza f10391b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zza f10392b = new zza("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zza f10393c = new zza("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zza f10394d = new zza("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10395a;

        public zza(String str) {
            this.f10395a = str;
        }

        public final String toString() {
            return this.f10395a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f10396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zza f10397b;

        public /* synthetic */ zzb(int i11) {
            this();
        }

        public final zzek a() throws GeneralSecurityException {
            Integer num = this.f10396a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f10397b != null) {
                return new zzek(num.intValue(), this.f10397b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public final void b(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 16 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i11)));
            }
            this.f10396a = Integer.valueOf(i11);
        }

        private zzb() {
            this.f10396a = null;
            this.f10397b = zza.f10394d;
        }
    }

    public zzek(int i11, zza zzaVar) {
        this.f10390a = i11;
        this.f10391b = zzaVar;
    }

    public static zzb b() {
        return new zzb(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10391b != zza.f10394d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzek)) {
            return false;
        }
        zzek zzekVar = (zzek) obj;
        return zzekVar.f10390a == this.f10390a && zzekVar.f10391b == this.f10391b;
    }

    public final int hashCode() {
        return Objects.hash(zzek.class, Integer.valueOf(this.f10390a), this.f10391b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.f10391b) + ", " + this.f10390a + "-byte key)";
    }
}
