package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution f18722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f18725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails f18726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f18727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18728g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution f18729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f18730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f18731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f18732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.ProcessDetails f18733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f18734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18735g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f18736h;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application a() {
            CrashlyticsReport.Session.Event.Application.Execution execution;
            if (this.f18736h == 1 && (execution = this.f18729a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(execution, this.f18730b, this.f18731c, this.f18732d, this.f18733e, this.f18734f, this.f18735g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18729a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f18736h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder b(List list) {
            this.f18734f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder c(Boolean bool) {
            this.f18732d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder d(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.f18733e = processDetails;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder e(List list) {
            this.f18730b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder f(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution == null) {
                throw new NullPointerException("Null execution");
            }
            this.f18729a = execution;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder g(List list) {
            this.f18731c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder h(int i11) {
            this.f18735g = i11;
            this.f18736h = (byte) (this.f18736h | 1);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution, List list, List list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List list3, int i11) {
        this.f18722a = execution;
        this.f18723b = list;
        this.f18724c = list2;
        this.f18725d = bool;
        this.f18726e = processDetails;
        this.f18727f = list3;
        this.f18728g = i11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List b() {
        return this.f18727f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final Boolean c() {
        return this.f18725d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.ProcessDetails d() {
        return this.f18726e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List e() {
        return this.f18723b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (!this.f18722a.equals(application.f())) {
            return false;
        }
        List list = this.f18723b;
        if (list == null) {
            if (application.e() != null) {
                return false;
            }
        } else if (!list.equals(application.e())) {
            return false;
        }
        List list2 = this.f18724c;
        if (list2 == null) {
            if (application.g() != null) {
                return false;
            }
        } else if (!list2.equals(application.g())) {
            return false;
        }
        Boolean bool = this.f18725d;
        if (bool == null) {
            if (application.c() != null) {
                return false;
            }
        } else if (!bool.equals(application.c())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f18726e;
        if (processDetails == null) {
            if (application.d() != null) {
                return false;
            }
        } else if (!processDetails.equals(application.d())) {
            return false;
        }
        List list3 = this.f18727f;
        if (list3 == null) {
            if (application.b() != null) {
                return false;
            }
        } else if (!list3.equals(application.b())) {
            return false;
        }
        return this.f18728g == application.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Execution f() {
        return this.f18722a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final List g() {
        return this.f18724c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final int h() {
        return this.f18728g;
    }

    public final int hashCode() {
        int iHashCode = (this.f18722a.hashCode() ^ 1000003) * 1000003;
        List list = this.f18723b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f18724c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f18725d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.f18726e;
        int iHashCode5 = (iHashCode4 ^ (processDetails == null ? 0 : processDetails.hashCode())) * 1000003;
        List list3 = this.f18727f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f18728g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Builder i() {
        Builder builder = new Builder();
        builder.f18729a = this.f18722a;
        builder.f18730b = this.f18723b;
        builder.f18731c = this.f18724c;
        builder.f18732d = this.f18725d;
        builder.f18733e = this.f18726e;
        builder.f18734f = this.f18727f;
        builder.f18735g = this.f18728g;
        builder.f18736h = (byte) 1;
        return builder;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(gkbGsXmgaxRjJ.xmiCAdcnPTWLVP);
        sb2.append(this.f18722a);
        sb2.append(", customAttributes=");
        sb2.append(this.f18723b);
        sb2.append(", internalKeys=");
        sb2.append(this.f18724c);
        sb2.append(", background=");
        sb2.append(this.f18725d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f18726e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f18727f);
        sb2.append(", uiOrientation=");
        return p0.i(this.f18728g, "}", sb2);
    }
}
