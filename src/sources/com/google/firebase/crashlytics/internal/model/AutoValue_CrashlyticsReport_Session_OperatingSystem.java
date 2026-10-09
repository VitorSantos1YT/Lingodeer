package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18834d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18838d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f18839e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem a() {
            String str;
            String str2;
            if (this.f18839e == 3 && (str = this.f18836b) != null && (str2 = this.f18837c) != null) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(this.f18835a, str, str2, this.f18838d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f18839e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f18836b == null) {
                sb2.append(" version");
            }
            if (this.f18837c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f18839e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f18837c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder c(boolean z11) {
            this.f18838d = z11;
            this.f18839e = (byte) (this.f18839e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder d(int i11) {
            this.f18835a = i11;
            this.f18839e = (byte) (this.f18839e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f18836b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_OperatingSystem(int i11, String str, String str2, boolean z11) {
        this.f18831a = i11;
        this.f18832b = str;
        this.f18833c = str2;
        this.f18834d = z11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final String b() {
        return this.f18833c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final int c() {
        return this.f18831a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final String d() {
        return this.f18832b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final boolean e() {
        return this.f18834d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        return this.f18831a == operatingSystem.c() && this.f18832b.equals(operatingSystem.d()) && this.f18833c.equals(operatingSystem.b()) && this.f18834d == operatingSystem.e();
    }

    public final int hashCode() {
        return ((((((this.f18831a ^ 1000003) * 1000003) ^ this.f18832b.hashCode()) * 1000003) ^ this.f18833c.hashCode()) * 1000003) ^ (this.f18834d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f18831a);
        sb2.append(", version=");
        sb2.append(this.f18832b);
        sb2.append(", buildVersion=");
        sb2.append(this.f18833c);
        sb2.append(", jailbroken=");
        return p0.p(sb2, this.f18834d, "}");
    }
}
