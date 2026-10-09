package com.google.firebase.installations.remote;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_TokenResult extends TokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TokenResult.ResponseCode f20410c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends TokenResult.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TokenResult.ResponseCode f20413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f20414d;

        public final TokenResult a() {
            if (this.f20414d == 1) {
                return new AutoValue_TokenResult(this.f20411a, this.f20412b, this.f20413c);
            }
            throw new IllegalStateException(SemtNwfPgIhi.rtlHBfg);
        }
    }

    public AutoValue_TokenResult(String str, long j11, TokenResult.ResponseCode responseCode) {
        this.f20408a = str;
        this.f20409b = j11;
        this.f20410c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.ResponseCode a() {
        return this.f20410c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final String b() {
        return this.f20408a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final long c() {
        return this.f20409b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f20408a;
        if (str == null) {
            if (tokenResult.b() != null) {
                return false;
            }
        } else if (!str.equals(tokenResult.b())) {
            return false;
        }
        if (this.f20409b != tokenResult.c()) {
            return false;
        }
        TokenResult.ResponseCode responseCode = this.f20410c;
        if (responseCode == null) {
            return tokenResult.a() == null;
        }
        return responseCode.equals(tokenResult.a());
    }

    public final int hashCode() {
        String str = this.f20408a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j11 = this.f20409b;
        int i11 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f20410c;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f20408a + ", tokenExpirationTimestamp=" + this.f20409b + ", responseCode=" + this.f20410c + "}";
    }
}
