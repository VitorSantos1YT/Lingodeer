package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18683f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Application.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f18687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f18688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f18689f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application a() {
            String str;
            String str2 = this.f18684a;
            if (str2 != null && (str = this.f18685b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Application(str2, str, this.f18686c, this.f18687d, this.f18688e, this.f18689f);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18684a == null) {
                sb2.append(" identifier");
            }
            if (this.f18685b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder b(String str) {
            this.f18688e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder c(String str) {
            this.f18689f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder d(String str) {
            this.f18686c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f18684a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder f(String str) {
            this.f18687d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException(kHfjNGauVgdF.AoJRBNWtD);
            }
            this.f18685b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Application(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f18678a = str;
        this.f18679b = str2;
        this.f18680c = str3;
        this.f18681d = str4;
        this.f18682e = str5;
        this.f18683f = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String b() {
        return this.f18682e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String c() {
        return this.f18683f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String d() {
        return this.f18680c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String e() {
        return this.f18678a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (!this.f18678a.equals(application.e()) || !this.f18679b.equals(application.h())) {
            return false;
        }
        String str = this.f18680c;
        if (str == null) {
            if (application.d() != null) {
                return false;
            }
        } else if (!str.equals(application.d())) {
            return false;
        }
        if (application.g() != null) {
            return false;
        }
        String str2 = this.f18681d;
        if (str2 == null) {
            if (application.f() != null) {
                return false;
            }
        } else if (!str2.equals(application.f())) {
            return false;
        }
        String str3 = this.f18682e;
        if (str3 == null) {
            if (application.b() != null) {
                return false;
            }
        } else if (!str3.equals(application.b())) {
            return false;
        }
        String str4 = this.f18683f;
        if (str4 == null) {
            return application.c() == null;
        }
        return str4.equals(application.c());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String f() {
        return this.f18681d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final CrashlyticsReport.Session.Application.Organization g() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String h() {
        return this.f18679b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f18678a.hashCode() ^ 1000003) * 1000003) ^ this.f18679b.hashCode()) * 1000003;
        String str = this.f18680c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f18681d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18682e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f18683f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f18678a);
        sb2.append(", version=");
        sb2.append(this.f18679b);
        sb2.append(", displayVersion=");
        sb2.append(this.f18680c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f18681d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f18682e);
        sb2.append(", developmentPlatformVersion=");
        return a.k(sb2, this.f18683f, "}");
    }
}
