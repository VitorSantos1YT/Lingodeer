package com.google.firebase.installations.local;

import com.google.android.material.datepicker.d;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f20379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20384h;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends PersistedInstallationEntry.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f20386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f20388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f20390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f20391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f20392h;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry a() {
            if (this.f20392h == 3 && this.f20386b != null) {
                return new AutoValue_PersistedInstallationEntry(this.f20385a, this.f20386b, this.f20387c, this.f20388d, this.f20389e, this.f20390f, this.f20391g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f20386b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f20392h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f20392h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder b(String str) {
            this.f20387c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder c(long j11) {
            this.f20389e = j11;
            this.f20392h = (byte) (this.f20392h | 1);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder d(String str) {
            this.f20385a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder e(String str) {
            this.f20388d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder f(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f20386b = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder g(long j11) {
            this.f20390f = j11;
            this.f20392h = (byte) (this.f20392h | 2);
            return this;
        }
    }

    public AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j11, long j12, String str4) {
        this.f20378b = str;
        this.f20379c = registrationStatus;
        this.f20380d = str2;
        this.f20381e = str3;
        this.f20382f = j11;
        this.f20383g = j12;
        this.f20384h = str4;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String a() {
        return this.f20380d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long b() {
        return this.f20382f;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String c() {
        return this.f20378b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String d() {
        return this.f20384h;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String e() {
        return this.f20381e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str = this.f20378b;
        if (str == null) {
            if (persistedInstallationEntry.c() != null) {
                return false;
            }
        } else if (!str.equals(persistedInstallationEntry.c())) {
            return false;
        }
        if (!this.f20379c.equals(persistedInstallationEntry.f())) {
            return false;
        }
        String str2 = this.f20380d;
        if (str2 == null) {
            if (persistedInstallationEntry.a() != null) {
                return false;
            }
        } else if (!str2.equals(persistedInstallationEntry.a())) {
            return false;
        }
        String str3 = this.f20381e;
        if (str3 == null) {
            if (persistedInstallationEntry.e() != null) {
                return false;
            }
        } else if (!str3.equals(persistedInstallationEntry.e())) {
            return false;
        }
        if (this.f20382f != persistedInstallationEntry.b() || this.f20383g != persistedInstallationEntry.g()) {
            return false;
        }
        String str4 = this.f20384h;
        if (str4 == null) {
            return persistedInstallationEntry.d() == null;
        }
        return str4.equals(persistedInstallationEntry.d());
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallation.RegistrationStatus f() {
        return this.f20379c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long g() {
        return this.f20383g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallationEntry.Builder h() {
        Builder builder = new Builder();
        builder.f20385a = c();
        builder.f20386b = f();
        builder.f20387c = a();
        builder.f20388d = e();
        builder.f20389e = b();
        builder.f20390f = g();
        builder.f20391g = d();
        builder.f20392h = (byte) 3;
        return builder;
    }

    public final int hashCode() {
        String str = this.f20378b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f20379c.hashCode()) * 1000003;
        String str2 = this.f20380d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20381e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j11 = this.f20382f;
        int i11 = (iHashCode3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f20383g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str4 = this.f20384h;
        return (str4 != null ? str4.hashCode() : 0) ^ i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f20378b);
        sb2.append(", registrationStatus=");
        sb2.append(this.f20379c);
        sb2.append(", authToken=");
        sb2.append(this.f20380d);
        sb2.append(", refreshToken=");
        sb2.append(this.f20381e);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f20382f);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f20383g);
        sb2.append(", fisError=");
        return a.k(sb2, this.f20384h, "}");
    }
}
