package com.google.android.datatransport.cct.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ClientInfo extends ClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientInfo.ClientType f7899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidClientInfo f7900b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends ClientInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClientInfo.ClientType f7901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AndroidClientInfo f7902b;

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo a() {
            return new AutoValue_ClientInfo(this.f7901a, this.f7902b);
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo.Builder b(AndroidClientInfo androidClientInfo) {
            this.f7902b = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final ClientInfo.Builder c(ClientInfo.ClientType clientType) {
            this.f7901a = clientType;
            return this;
        }
    }

    public AutoValue_ClientInfo(ClientInfo.ClientType clientType, AndroidClientInfo androidClientInfo) {
        this.f7899a = clientType;
        this.f7900b = androidClientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final AndroidClientInfo b() {
        return this.f7900b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final ClientInfo.ClientType c() {
        return this.f7899a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f7899a;
        if (clientType == null) {
            if (clientInfo.c() != null) {
                return false;
            }
        } else if (!clientType.equals(clientInfo.c())) {
            return false;
        }
        AndroidClientInfo androidClientInfo = this.f7900b;
        if (androidClientInfo == null) {
            return clientInfo.b() == null;
        }
        return androidClientInfo.equals(clientInfo.b());
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f7899a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AndroidClientInfo androidClientInfo = this.f7900b;
        return (androidClientInfo != null ? androidClientInfo.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f7899a + ", androidClientInfo=" + this.f7900b + "}";
    }
}
