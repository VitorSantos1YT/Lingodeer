package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport extends CrashlyticsReport {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f18602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CrashlyticsReport.Session f18603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CrashlyticsReport.FilesPayload f18604l;
    public final CrashlyticsReport.ApplicationExitInfo m;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f18608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f18609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f18610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f18611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f18612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f18613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CrashlyticsReport.Session f18614j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CrashlyticsReport.FilesPayload f18615k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CrashlyticsReport.ApplicationExitInfo f18616l;
        public byte m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f18616l = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder c(String str) {
            this.f18611g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f18612h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f18613i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder f(String str) {
            this.f18610f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder g(String str) {
            this.f18609e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f18606b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f18608d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder j(CrashlyticsReport.FilesPayload filesPayload) {
            this.f18615k = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder k(int i11) {
            this.f18607c = i11;
            this.m = (byte) (this.m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f18605a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder m(CrashlyticsReport.Session session) {
            this.f18614j = session;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport a() {
            if (this.m == 1 && this.f18605a != null && this.f18606b != null && this.f18608d != null && this.f18612h != null && this.f18613i != null) {
                return new AutoValue_CrashlyticsReport(this.f18605a, this.f18606b, this.f18607c, this.f18608d, this.f18609e, this.f18610f, this.f18611g, this.f18612h, this.f18613i, this.f18614j, this.f18615k, this.f18616l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18605a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f18606b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.m) == 0) {
                sb2.append(" platform");
            }
            if (this.f18608d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f18612h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f18613i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException(d.k(sb2, ealNNtLp.FcBBKWSyovD));
        }
    }

    public AutoValue_CrashlyticsReport(String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.f18594b = str;
        this.f18595c = str2;
        this.f18596d = i11;
        this.f18597e = str3;
        this.f18598f = str4;
        this.f18599g = str5;
        this.f18600h = str6;
        this.f18601i = str7;
        this.f18602j = str8;
        this.f18603k = session;
        this.f18604l = filesPayload;
        this.m = applicationExitInfo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.ApplicationExitInfo b() {
        return this.m;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String c() {
        return this.f18600h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String d() {
        return this.f18601i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String e() {
        return this.f18602j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (!this.f18594b.equals(crashlyticsReport.l()) || !this.f18595c.equals(crashlyticsReport.h()) || this.f18596d != crashlyticsReport.k() || !this.f18597e.equals(crashlyticsReport.i())) {
            return false;
        }
        String str = this.f18598f;
        if (str == null) {
            if (crashlyticsReport.g() != null) {
                return false;
            }
        } else if (!str.equals(crashlyticsReport.g())) {
            return false;
        }
        String str2 = this.f18599g;
        if (str2 == null) {
            if (crashlyticsReport.f() != null) {
                return false;
            }
        } else if (!str2.equals(crashlyticsReport.f())) {
            return false;
        }
        String str3 = this.f18600h;
        if (str3 == null) {
            if (crashlyticsReport.c() != null) {
                return false;
            }
        } else if (!str3.equals(crashlyticsReport.c())) {
            return false;
        }
        if (!this.f18601i.equals(crashlyticsReport.d()) || !this.f18602j.equals(crashlyticsReport.e())) {
            return false;
        }
        CrashlyticsReport.Session session = this.f18603k;
        if (session == null) {
            if (crashlyticsReport.m() != null) {
                return false;
            }
        } else if (!session.equals(crashlyticsReport.m())) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = this.f18604l;
        if (filesPayload == null) {
            if (crashlyticsReport.j() != null) {
                return false;
            }
        } else if (!filesPayload.equals(crashlyticsReport.j())) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.m;
        if (applicationExitInfo == null) {
            return crashlyticsReport.b() == null;
        }
        return applicationExitInfo.equals(crashlyticsReport.b());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String f() {
        return this.f18599g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String g() {
        return this.f18598f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String h() {
        return this.f18595c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f18594b.hashCode() ^ 1000003) * 1000003) ^ this.f18595c.hashCode()) * 1000003) ^ this.f18596d) * 1000003) ^ this.f18597e.hashCode()) * 1000003;
        String str = this.f18598f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f18599g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18600h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f18601i.hashCode()) * 1000003) ^ this.f18602j.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.f18603k;
        int iHashCode5 = (iHashCode4 ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.f18604l;
        int iHashCode6 = (iHashCode5 ^ (filesPayload == null ? 0 : filesPayload.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.m;
        return iHashCode6 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String i() {
        return this.f18597e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.FilesPayload j() {
        return this.f18604l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int k() {
        return this.f18596d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String l() {
        return this.f18594b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Session m() {
        return this.f18603k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Builder n() {
        Builder builder = new Builder();
        builder.f18605a = l();
        builder.f18606b = h();
        builder.f18607c = k();
        builder.f18608d = i();
        builder.f18609e = g();
        builder.f18610f = f();
        builder.f18611g = c();
        builder.f18612h = d();
        builder.f18613i = e();
        builder.f18614j = m();
        builder.f18615k = j();
        builder.f18616l = b();
        builder.m = (byte) 1;
        return builder;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f18594b + ", gmpAppId=" + this.f18595c + ", platform=" + this.f18596d + ", installationUuid=" + this.f18597e + ", firebaseInstallationId=" + this.f18598f + ", firebaseAuthenticationToken=" + this.f18599g + ", appQualitySessionId=" + this.f18600h + ", buildVersion=" + this.f18601i + ", displayVersion=" + this.f18602j + ", session=" + this.f18603k + ", ndkPayload=" + this.f18604l + ", appExitInfo=" + this.m + "}";
    }
}
