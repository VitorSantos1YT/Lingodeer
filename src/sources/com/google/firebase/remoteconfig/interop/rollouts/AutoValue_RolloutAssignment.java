package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.android.material.datepicker.d;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20799f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends RolloutAssignment.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f20803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20804e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f20805f;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment a() {
            if (this.f20805f == 1 && this.f20800a != null && this.f20801b != null && this.f20802c != null && this.f20803d != null) {
                return new AutoValue_RolloutAssignment(this.f20800a, this.f20801b, this.f20802c, this.f20803d, this.f20804e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f20800a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f20801b == null) {
                sb2.append(" variantId");
            }
            if (this.f20802c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f20803d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f20805f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f20802c = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder c(String str) {
            this.f20803d = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f20800a = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder e(long j11) {
            this.f20804e = j11;
            this.f20805f = (byte) (this.f20805f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f20801b = str;
            return this;
        }
    }

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j11) {
        this.f20795b = str;
        this.f20796c = str2;
        this.f20797d = str3;
        this.f20798e = str4;
        this.f20799f = j11;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String b() {
        return this.f20797d;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String c() {
        return this.f20798e;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String d() {
        return this.f20795b;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final long e() {
        return this.f20799f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.f20795b.equals(rolloutAssignment.d()) && this.f20796c.equals(rolloutAssignment.f()) && this.f20797d.equals(rolloutAssignment.b()) && this.f20798e.equals(rolloutAssignment.c()) && this.f20799f == rolloutAssignment.e();
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final String f() {
        return this.f20796c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f20795b.hashCode() ^ 1000003) * 1000003) ^ this.f20796c.hashCode()) * 1000003) ^ this.f20797d.hashCode()) * 1000003) ^ this.f20798e.hashCode()) * 1000003;
        long j11 = this.f20799f;
        return iHashCode ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f20795b);
        sb2.append(", variantId=");
        sb2.append(this.f20796c);
        sb2.append(", parameterKey=");
        sb2.append(this.f20797d);
        sb2.append(", parameterValue=");
        sb2.append(this.f20798e);
        sb2.append(", templateVersion=");
        return e.i(this.f20799f, "}", sb2);
    }
}
