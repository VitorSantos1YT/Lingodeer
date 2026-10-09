package com.google.firebase.inappmessaging.model;

import com.google.android.material.datepicker.d;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_RateLimit extends RateLimit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20279c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends RateLimit.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f20282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f20283d;

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public final RateLimit a() {
            String str;
            if (this.f20283d == 3 && (str = this.f20280a) != null) {
                return new AutoValue_RateLimit(str, this.f20281b, this.f20282c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f20280a == null) {
                sb2.append(" limiterKey");
            }
            if ((this.f20283d & 1) == 0) {
                sb2.append(" limit");
            }
            if ((this.f20283d & 2) == 0) {
                sb2.append(" timeToLiveMillis");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public final RateLimit.Builder b() {
            this.f20281b = 1L;
            this.f20283d = (byte) (this.f20283d | 1);
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public final RateLimit.Builder c() {
            this.f20280a = "APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY";
            return this;
        }

        @Override // com.google.firebase.inappmessaging.model.RateLimit.Builder
        public final RateLimit.Builder d(long j11) {
            this.f20282c = j11;
            this.f20283d = (byte) (this.f20283d | 2);
            return this;
        }
    }

    public AutoValue_RateLimit(String str, long j11, long j12) {
        this.f20277a = str;
        this.f20278b = j11;
        this.f20279c = j12;
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public final long b() {
        return this.f20278b;
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public final String c() {
        return this.f20277a;
    }

    @Override // com.google.firebase.inappmessaging.model.RateLimit
    public final long d() {
        return this.f20279c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RateLimit)) {
            return false;
        }
        RateLimit rateLimit = (RateLimit) obj;
        return this.f20277a.equals(rateLimit.c()) && this.f20278b == rateLimit.b() && this.f20279c == rateLimit.d();
    }

    public final int hashCode() {
        int iHashCode = (this.f20277a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f20278b;
        long j12 = this.f20279c;
        return ((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RateLimit{limiterKey=");
        sb2.append(this.f20277a);
        sb2.append(", limit=");
        sb2.append(this.f20278b);
        sb2.append(", timeToLiveMillis=");
        return e.i(this.f20279c, "}", sb2);
    }
}
