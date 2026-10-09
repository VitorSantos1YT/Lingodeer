package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import defpackage.e;
import hh.p0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqp extends zzrd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzb f10877c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f10878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f10879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zzb f10880c;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzqp a() throws GeneralSecurityException {
            Integer num = this.f10878a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f10879b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f10880c != null) {
                return new zzqp(num.intValue(), this.f10879b.intValue(), this.f10880c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public final void b(int i11) throws InvalidAlgorithmParameterException {
            if (i11 != 16 && i11 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i11 << 3)));
            }
            this.f10878a = Integer.valueOf(i11);
        }

        public final void c(int i11) throws GeneralSecurityException {
            if (i11 < 10 || 16 < i11) {
                throw new GeneralSecurityException(p.j(i11, "Invalid tag size for AesCmacParameters: "));
            }
            this.f10879b = Integer.valueOf(i11);
        }

        private zza() {
            this.f10878a = null;
            this.f10879b = null;
            this.f10880c = zzb.f10884e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzb f10881b = new zzb("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzb f10882c = new zzb("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzb f10883d = new zzb("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzb f10884e = new zzb(DytezVyM.KkzpdVDU);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10885a;

        public zzb(String str) {
            this.f10885a = str;
        }

        public final String toString() {
            return this.f10885a;
        }
    }

    public zzqp(int i11, int i12, zzb zzbVar) {
        this.f10875a = i11;
        this.f10876b = i12;
        this.f10877c = zzbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10877c != zzb.f10884e;
    }

    public final int b() {
        zzb zzbVar = zzb.f10884e;
        int i11 = this.f10876b;
        zzb zzbVar2 = this.f10877c;
        if (zzbVar2 == zzbVar) {
            return i11;
        }
        if (zzbVar2 == zzb.f10881b) {
            return i11 + 5;
        }
        if (zzbVar2 == zzb.f10882c) {
            return i11 + 5;
        }
        if (zzbVar2 == zzb.f10883d) {
            return i11 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqp)) {
            return false;
        }
        zzqp zzqpVar = (zzqp) obj;
        return zzqpVar.f10875a == this.f10875a && zzqpVar.b() == b() && zzqpVar.f10877c == this.f10877c;
    }

    public final int hashCode() {
        return Objects.hash(zzqp.class, Integer.valueOf(this.f10875a), Integer.valueOf(this.f10876b), this.f10877c);
    }

    public final String toString() {
        return p0.i(this.f10875a, "-byte key)", e.q(this.f10876b, "AES-CMAC Parameters (variant: ", String.valueOf(this.f10877c), ", ", "-byte tags, and "));
    }
}
