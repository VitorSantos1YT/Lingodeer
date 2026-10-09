package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjn extends zzjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzb f10583b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f10584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzb f10585b;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzjn a() throws GeneralSecurityException {
            Integer num = this.f10584a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f10585b != null) {
                return new zzjn(num.intValue(), this.f10585b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public final void b(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 32 && i11 != 48 && i11 != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i11)));
            }
            this.f10584a = Integer.valueOf(i11);
        }

        private zza() {
            this.f10584a = null;
            this.f10585b = zzb.f10588d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzb f10586b = new zzb("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzb f10587c = new zzb("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzb f10588d = new zzb("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10589a;

        public zzb(String str) {
            this.f10589a = str;
        }

        public final String toString() {
            return this.f10589a;
        }
    }

    public zzjn(int i11, zzb zzbVar) {
        this.f10582a = i11;
        this.f10583b = zzbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10583b != zzb.f10588d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjn)) {
            return false;
        }
        zzjn zzjnVar = (zzjn) obj;
        return zzjnVar.f10582a == this.f10582a && zzjnVar.f10583b == this.f10583b;
    }

    public final int hashCode() {
        return Objects.hash(zzjn.class, Integer.valueOf(this.f10582a), this.f10583b);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.f10583b) + ", " + this.f10582a + "-byte key)";
    }
}
