package com.google.firebase.installations.remote;

import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_InstallationResponse extends InstallationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TokenResult f20402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InstallationResponse.ResponseCode f20403e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends InstallationResponse.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TokenResult f20407d;
    }

    public AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f20399a = str;
        this.f20400b = str2;
        this.f20401c = str3;
        this.f20402d = tokenResult;
        this.f20403e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final TokenResult a() {
        return this.f20402d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String b() {
        return this.f20400b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String c() {
        return this.f20401c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final InstallationResponse.ResponseCode d() {
        return this.f20403e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String e() {
        return this.f20399a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f20399a;
        if (str == null) {
            if (installationResponse.e() != null) {
                return false;
            }
        } else if (!str.equals(installationResponse.e())) {
            return false;
        }
        String str2 = this.f20400b;
        if (str2 == null) {
            if (installationResponse.b() != null) {
                return false;
            }
        } else if (!str2.equals(installationResponse.b())) {
            return false;
        }
        String str3 = this.f20401c;
        if (str3 == null) {
            if (installationResponse.c() != null) {
                return false;
            }
        } else if (!str3.equals(installationResponse.c())) {
            return false;
        }
        TokenResult tokenResult = this.f20402d;
        if (tokenResult == null) {
            if (installationResponse.a() != null) {
                return false;
            }
        } else if (!tokenResult.equals(installationResponse.a())) {
            return false;
        }
        InstallationResponse.ResponseCode responseCode = this.f20403e;
        if (responseCode == null) {
            return installationResponse.d() == null;
        }
        return responseCode.equals(installationResponse.d());
    }

    public final int hashCode() {
        String str = this.f20399a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f20400b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20401c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f20402d;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f20403e;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return aYZzTH.RjcBwPDcnGtzSs + this.f20399a + ", fid=" + this.f20400b + ", refreshToken=" + this.f20401c + ", authToken=" + this.f20402d + ", responseCode=" + this.f20403e + "}";
    }
}
