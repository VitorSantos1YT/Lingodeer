package com.google.firebase.installations;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20344c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends InstallationTokenResult.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f20347c;
    }

    public AutoValue_InstallationTokenResult(String str, long j11, long j12) {
        this.f20342a = str;
        this.f20343b = j11;
        this.f20344c = j12;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final String a() {
        return this.f20342a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long b() {
        return this.f20344c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long c() {
        return this.f20343b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.f20342a.equals(installationTokenResult.a()) && this.f20343b == installationTokenResult.c() && this.f20344c == installationTokenResult.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f20342a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f20343b;
        long j12 = this.f20344c;
        return ((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f20342a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f20343b);
        sb2.append(", tokenCreationTimestamp=");
        return e.i(this.f20344c, "}", sb2);
    }
}
