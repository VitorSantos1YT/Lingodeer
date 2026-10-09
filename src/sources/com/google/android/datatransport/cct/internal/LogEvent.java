package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class LogEvent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
        public abstract LogEvent a();

        public abstract Builder b(ComplianceData complianceData);

        public abstract Builder c(Integer num);

        public abstract Builder d(long j11);

        public abstract Builder e(long j11);

        public abstract Builder f(ExperimentIds experimentIds);

        public abstract Builder g(NetworkConnectionInfo networkConnectionInfo);

        public abstract Builder h(long j11);
    }

    public static Builder j(String str) {
        AutoValue_LogEvent.Builder builder = new AutoValue_LogEvent.Builder();
        builder.f7929f = str;
        return builder;
    }

    public static Builder k(byte[] bArr) {
        AutoValue_LogEvent.Builder builder = new AutoValue_LogEvent.Builder();
        builder.f7928e = bArr;
        return builder;
    }

    public abstract ComplianceData a();

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract ExperimentIds e();

    public abstract NetworkConnectionInfo f();

    public abstract byte[] g();

    public abstract String h();

    public abstract long i();
}
