package com.google.firebase.inappmessaging.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class RateLimit {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
        public abstract RateLimit a();

        public abstract Builder b();

        public abstract Builder c();

        public abstract Builder d(long j11);
    }

    public static Builder a() {
        return new AutoValue_RateLimit.Builder();
    }

    public abstract long b();

    public abstract String c();

    public abstract long d();
}
