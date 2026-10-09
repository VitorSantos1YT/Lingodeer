package com.google.android.datatransport.cct.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_LogRequest extends LogRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClientInfo f7935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f7936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final QosTier f7939g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends LogRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f7940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f7941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ClientInfo f7942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f7943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f7944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList f7945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public QosTier f7946g;

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest a() {
            String strConcat = this.f7940a == null ? " requestTimeMs" : BuildConfig.VERSION_NAME;
            if (this.f7941b == null) {
                strConcat = strConcat.concat(" requestUptimeMs");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_LogRequest(this.f7940a.longValue(), this.f7941b.longValue(), this.f7942c, this.f7943d, this.f7944e, this.f7945f, this.f7946g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder b(ClientInfo clientInfo) {
            this.f7942c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder c(ArrayList arrayList) {
            this.f7945f = arrayList;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder d(Integer num) {
            this.f7943d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder e(String str) {
            this.f7944e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder f(QosTier qosTier) {
            this.f7946g = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder g(long j11) {
            this.f7940a = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder h(long j11) {
            this.f7941b = Long.valueOf(j11);
            return this;
        }
    }

    public AutoValue_LogRequest(long j11, long j12, ClientInfo clientInfo, Integer num, String str, ArrayList arrayList, QosTier qosTier) {
        this.f7933a = j11;
        this.f7934b = j12;
        this.f7935c = clientInfo;
        this.f7936d = num;
        this.f7937e = str;
        this.f7938f = arrayList;
        this.f7939g = qosTier;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final ClientInfo b() {
        return this.f7935c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final List c() {
        return this.f7938f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final Integer d() {
        return this.f7936d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final String e() {
        return this.f7937e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f7933a != logRequest.g() || this.f7934b != logRequest.h()) {
            return false;
        }
        ClientInfo clientInfo = this.f7935c;
        if (clientInfo == null) {
            if (logRequest.b() != null) {
                return false;
            }
        } else if (!clientInfo.equals(logRequest.b())) {
            return false;
        }
        Integer num = this.f7936d;
        if (num == null) {
            if (logRequest.d() != null) {
                return false;
            }
        } else if (!num.equals(logRequest.d())) {
            return false;
        }
        String str = this.f7937e;
        if (str == null) {
            if (logRequest.e() != null) {
                return false;
            }
        } else if (!str.equals(logRequest.e())) {
            return false;
        }
        List list = this.f7938f;
        if (list == null) {
            if (logRequest.c() != null) {
                return false;
            }
        } else if (!list.equals(logRequest.c())) {
            return false;
        }
        QosTier qosTier = this.f7939g;
        if (qosTier == null) {
            return logRequest.f() == null;
        }
        return qosTier.equals(logRequest.f());
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final QosTier f() {
        return this.f7939g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long g() {
        return this.f7933a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long h() {
        return this.f7934b;
    }

    public final int hashCode() {
        long j11 = this.f7933a;
        long j12 = this.f7934b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        ClientInfo clientInfo = this.f7935c;
        int iHashCode = (i11 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f7936d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f7937e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f7938f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f7939g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f7933a + ", requestUptimeMs=" + this.f7934b + ", clientInfo=" + this.f7935c + ", logSource=" + this.f7936d + ", logSourceName=" + this.f7937e + ", logEvents=" + this.f7938f + ", qosTier=" + this.f7939g + "}";
    }
}
