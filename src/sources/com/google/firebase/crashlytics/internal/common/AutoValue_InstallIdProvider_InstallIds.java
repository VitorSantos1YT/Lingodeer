package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18243c;

    public AutoValue_InstallIdProvider_InstallIds(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f18241a = str;
        this.f18242b = str2;
        this.f18243c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String a() {
        return this.f18241a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String b() {
        return this.f18243c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String c() {
        return this.f18242b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallIdProvider.InstallIds)) {
            return false;
        }
        InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
        if (!this.f18241a.equals(installIds.a())) {
            return false;
        }
        String str = this.f18242b;
        if (str == null) {
            if (installIds.c() != null) {
                return false;
            }
        } else if (!str.equals(installIds.c())) {
            return false;
        }
        String str2 = this.f18243c;
        if (str2 == null) {
            return installIds.b() == null;
        }
        return str2.equals(installIds.b());
    }

    public final int hashCode() {
        int iHashCode = (this.f18241a.hashCode() ^ 1000003) * 1000003;
        String str = this.f18242b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f18243c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f18241a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f18242b);
        sb2.append(", firebaseAuthenticationToken=");
        return ep.a.k(sb2, this.f18243c, "}");
    }
}
