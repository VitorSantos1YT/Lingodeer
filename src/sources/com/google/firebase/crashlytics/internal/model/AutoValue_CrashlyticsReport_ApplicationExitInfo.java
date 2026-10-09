package com.google.firebase.crashlytics.internal.model;

import b7.e0;
import com.google.android.material.datepicker.d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f18625i;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f18630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f18631f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f18632g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f18633h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f18634i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f18635j;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo a() {
            String str;
            if (this.f18635j == 63 && (str = this.f18627b) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.f18626a, str, this.f18628c, this.f18629d, this.f18630e, this.f18631f, this.f18632g, this.f18633h, this.f18634i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f18635j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f18627b == null) {
                sb2.append(" processName");
            }
            if ((this.f18635j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f18635j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f18635j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f18635j & 16) == 0) {
                sb2.append(" rss");
            }
            if ((this.f18635j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder b(List list) {
            this.f18634i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder c(int i11) {
            this.f18629d = i11;
            this.f18635j = (byte) (this.f18635j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder d(int i11) {
            this.f18626a = i11;
            this.f18635j = (byte) (this.f18635j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f18627b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder f(long j11) {
            this.f18630e = j11;
            this.f18635j = (byte) (this.f18635j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder g(int i11) {
            this.f18628c = i11;
            this.f18635j = (byte) (this.f18635j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder h(long j11) {
            this.f18631f = j11;
            this.f18635j = (byte) (this.f18635j | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder i(long j11) {
            this.f18632g = j11;
            this.f18635j = (byte) (this.f18635j | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder j(String str) {
            this.f18633h = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo(int i11, String str, int i12, int i13, long j11, long j12, long j13, String str2, List list) {
        this.f18617a = i11;
        this.f18618b = str;
        this.f18619c = i12;
        this.f18620d = i13;
        this.f18621e = j11;
        this.f18622f = j12;
        this.f18623g = j13;
        this.f18624h = str2;
        this.f18625i = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final List b() {
        return this.f18625i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int c() {
        return this.f18620d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int d() {
        return this.f18617a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final String e() {
        return this.f18618b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.f18617a != applicationExitInfo.d() || !this.f18618b.equals(applicationExitInfo.e()) || this.f18619c != applicationExitInfo.g() || this.f18620d != applicationExitInfo.c() || this.f18621e != applicationExitInfo.f() || this.f18622f != applicationExitInfo.h() || this.f18623g != applicationExitInfo.i()) {
            return false;
        }
        String str = this.f18624h;
        if (str == null) {
            if (applicationExitInfo.j() != null) {
                return false;
            }
        } else if (!str.equals(applicationExitInfo.j())) {
            return false;
        }
        List list = this.f18625i;
        if (list == null) {
            return applicationExitInfo.b() == null;
        }
        return list.equals(applicationExitInfo.b());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long f() {
        return this.f18621e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int g() {
        return this.f18619c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long h() {
        return this.f18622f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f18617a ^ 1000003) * 1000003) ^ this.f18618b.hashCode()) * 1000003) ^ this.f18619c) * 1000003) ^ this.f18620d) * 1000003;
        long j11 = this.f18621e;
        int i11 = (iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f18622f;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f18623g;
        int i13 = (i12 ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        String str = this.f18624h;
        int iHashCode2 = (i13 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f18625i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long i() {
        return this.f18623g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final String j() {
        return this.f18624h;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationExitInfo{pid=");
        sb2.append(this.f18617a);
        sb2.append(", processName=");
        sb2.append(this.f18618b);
        sb2.append(", reasonCode=");
        sb2.append(this.f18619c);
        sb2.append(", importance=");
        sb2.append(this.f18620d);
        sb2.append(", pss=");
        sb2.append(this.f18621e);
        sb2.append(", rss=");
        sb2.append(this.f18622f);
        sb2.append(", timestamp=");
        sb2.append(this.f18623g);
        sb2.append(", traceFile=");
        sb2.append(this.f18624h);
        sb2.append(", buildIdMappingForArch=");
        return e0.n(sb2, this.f18625i, "}");
    }
}
