package com.google.android.datatransport.cct.internal;

import a.ar.MFeWs;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_LogEvent extends LogEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f7916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComplianceData f7917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f7919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NetworkConnectionInfo f7922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExperimentIds f7923i;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends LogEvent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f7924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f7925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ComplianceData f7926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f7927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f7928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f7929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f7930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public NetworkConnectionInfo f7931h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ExperimentIds f7932i;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder b(ComplianceData complianceData) {
            this.f7926c = complianceData;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder c(Integer num) {
            this.f7925b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder d(long j11) {
            this.f7924a = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder e(long j11) {
            this.f7927d = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder f(ExperimentIds experimentIds) {
            this.f7932i = experimentIds;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder g(NetworkConnectionInfo networkConnectionInfo) {
            this.f7931h = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder h(long j11) {
            this.f7930g = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent a() {
            String strM = this.f7924a == null ? MFeWs.ocqUxZ : BuildConfig.VERSION_NAME;
            if (this.f7927d == null) {
                strM = strM.concat(" eventUptimeMs");
            }
            if (this.f7930g == null) {
                strM = e.m(strM, " timezoneOffsetSeconds");
            }
            if (strM.isEmpty()) {
                return new AutoValue_LogEvent(this.f7924a.longValue(), this.f7925b, this.f7926c, this.f7927d.longValue(), this.f7928e, this.f7929f, this.f7930g.longValue(), this.f7931h, this.f7932i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }
    }

    public AutoValue_LogEvent(long j11, Integer num, ComplianceData complianceData, long j12, byte[] bArr, String str, long j13, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds) {
        this.f7915a = j11;
        this.f7916b = num;
        this.f7917c = complianceData;
        this.f7918d = j12;
        this.f7919e = bArr;
        this.f7920f = str;
        this.f7921g = j13;
        this.f7922h = networkConnectionInfo;
        this.f7923i = experimentIds;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final ComplianceData a() {
        return this.f7917c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final Integer b() {
        return this.f7916b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long c() {
        return this.f7915a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long d() {
        return this.f7918d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final ExperimentIds e() {
        return this.f7923i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f7915a != logEvent.c()) {
            return false;
        }
        Integer num = this.f7916b;
        if (num == null) {
            if (logEvent.b() != null) {
                return false;
            }
        } else if (!num.equals(logEvent.b())) {
            return false;
        }
        ComplianceData complianceData = this.f7917c;
        if (complianceData == null) {
            if (logEvent.a() != null) {
                return false;
            }
        } else if (!complianceData.equals(logEvent.a())) {
            return false;
        }
        if (this.f7918d != logEvent.d()) {
            return false;
        }
        if (!Arrays.equals(this.f7919e, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).f7919e : logEvent.g())) {
            return false;
        }
        String str = this.f7920f;
        if (str == null) {
            if (logEvent.h() != null) {
                return false;
            }
        } else if (!str.equals(logEvent.h())) {
            return false;
        }
        if (this.f7921g != logEvent.i()) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = this.f7922h;
        if (networkConnectionInfo == null) {
            if (logEvent.f() != null) {
                return false;
            }
        } else if (!networkConnectionInfo.equals(logEvent.f())) {
            return false;
        }
        ExperimentIds experimentIds = this.f7923i;
        if (experimentIds == null) {
            return logEvent.e() == null;
        }
        return experimentIds.equals(logEvent.e());
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final NetworkConnectionInfo f() {
        return this.f7922h;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final byte[] g() {
        return this.f7919e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final String h() {
        return this.f7920f;
    }

    public final int hashCode() {
        long j11 = this.f7915a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f7916b;
        int iHashCode = (i11 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.f7917c;
        int iHashCode2 = (iHashCode ^ (complianceData == null ? 0 : complianceData.hashCode())) * 1000003;
        long j12 = this.f7918d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f7919e)) * 1000003;
        String str = this.f7920f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j13 = this.f7921g;
        int i12 = (iHashCode4 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f7922h;
        int iHashCode5 = (i12 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        ExperimentIds experimentIds = this.f7923i;
        return iHashCode5 ^ (experimentIds != null ? experimentIds.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long i() {
        return this.f7921g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f7915a + ", eventCode=" + this.f7916b + ", complianceData=" + this.f7917c + ", eventUptimeMs=" + this.f7918d + ", sourceExtension=" + Arrays.toString(this.f7919e) + ", sourceExtensionJsonProto3=" + this.f7920f + ", timezoneOffsetSeconds=" + this.f7921g + ", networkConnectionInfo=" + this.f7922h + ", experimentIds=" + this.f7923i + "}";
    }
}
