package com.google.firebase.installations.local;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PersistedInstallationEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20398a = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder {
        public abstract PersistedInstallationEntry a();

        public abstract Builder b(String str);

        public abstract Builder c(long j11);

        public abstract Builder d(String str);

        public abstract Builder e(String str);

        public abstract Builder f(PersistedInstallation.RegistrationStatus registrationStatus);

        public abstract Builder g(long j11);
    }

    static {
        AutoValue_PersistedInstallationEntry.Builder builder = new AutoValue_PersistedInstallationEntry.Builder();
        builder.g(0L);
        builder.f(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION);
        builder.c(0L);
        builder.a();
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract PersistedInstallation.RegistrationStatus f();

    public abstract long g();

    public abstract Builder h();

    public final PersistedInstallationEntry i() {
        AutoValue_PersistedInstallationEntry.Builder builder = (AutoValue_PersistedInstallationEntry.Builder) h();
        builder.f20391g = "BAD CONFIG";
        builder.f(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
        return builder.a();
    }
}
