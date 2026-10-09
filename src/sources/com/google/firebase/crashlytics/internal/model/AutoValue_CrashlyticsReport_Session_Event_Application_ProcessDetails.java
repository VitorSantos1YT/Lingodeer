package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18795d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f18800e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails a() {
            String str;
            if (this.f18800e == 7 && (str = this.f18796a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(this.f18797b, this.f18799d, this.f18798c, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18796a == null) {
                sb2.append(" processName");
            }
            if ((this.f18800e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f18800e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f18800e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder b(boolean z11) {
            this.f18799d = z11;
            this.f18800e = (byte) (this.f18800e | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder c(int i11) {
            this.f18798c = i11;
            this.f18800e = (byte) (this.f18800e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder d(int i11) {
            this.f18797b = i11;
            this.f18800e = (byte) (this.f18800e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f18796a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(int i11, boolean z11, int i12, String str) {
        this.f18792a = str;
        this.f18793b = i11;
        this.f18794c = i12;
        this.f18795d = z11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final int b() {
        return this.f18794c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final int c() {
        return this.f18793b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final String d() {
        return this.f18792a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final boolean e() {
        return this.f18795d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        return this.f18792a.equals(processDetails.d()) && this.f18793b == processDetails.c() && this.f18794c == processDetails.b() && this.f18795d == processDetails.e();
    }

    public final int hashCode() {
        return ((((((this.f18792a.hashCode() ^ 1000003) * 1000003) ^ this.f18793b) * 1000003) ^ this.f18794c) * 1000003) ^ (this.f18795d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.f18792a);
        sb2.append(", pid=");
        sb2.append(this.f18793b);
        sb2.append(", importance=");
        sb2.append(this.f18794c);
        sb2.append(", defaultProcess=");
        return p0.p(sb2, this.f18795d, "}");
    }
}
