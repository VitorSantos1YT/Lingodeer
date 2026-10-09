package com.google.firebase.crashlytics.internal.model;

import b7.e0;
import com.google.android.material.datepicker.d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution extends CrashlyticsReport.Session.Event.Application.Execution {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f18738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsReport.ApplicationExitInfo f18739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal f18740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f18741e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f18742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f18743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CrashlyticsReport.ApplicationExitInfo f18744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Signal f18745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f18746e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution a() {
            List list;
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = this.f18745d;
            if (signal != null && (list = this.f18746e) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(this.f18742a, this.f18743b, this.f18744c, signal, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18745d == null) {
                sb2.append(" signal");
            }
            if (this.f18746e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f18744c = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f18746e = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder d(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f18743b = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder e(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal == null) {
                throw new NullPointerException("Null signal");
            }
            this.f18745d = signal;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder f(List list) {
            this.f18742a = list;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution(List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, List list2) {
        this.f18737a = list;
        this.f18738b = exception;
        this.f18739c = applicationExitInfo;
        this.f18740d = signal;
        this.f18741e = list2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.ApplicationExitInfo b() {
        return this.f18739c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final List c() {
        return this.f18741e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception d() {
        return this.f18738b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal e() {
        return this.f18740d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        List list = this.f18737a;
        if (list == null) {
            if (execution.f() != null) {
                return false;
            }
        } else if (!list.equals(execution.f())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f18738b;
        if (exception == null) {
            if (execution.d() != null) {
                return false;
            }
        } else if (!exception.equals(execution.d())) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f18739c;
        if (applicationExitInfo == null) {
            if (execution.b() != null) {
                return false;
            }
        } else if (!applicationExitInfo.equals(execution.b())) {
            return false;
        }
        return this.f18740d.equals(execution.e()) && this.f18741e.equals(execution.c());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final List f() {
        return this.f18737a;
    }

    public final int hashCode() {
        List list = this.f18737a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f18738b;
        int iHashCode2 = (iHashCode ^ (exception == null ? 0 : exception.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.f18739c;
        return (((((applicationExitInfo != null ? applicationExitInfo.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f18740d.hashCode()) * 1000003) ^ this.f18741e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Execution{threads=");
        sb2.append(this.f18737a);
        sb2.append(", exception=");
        sb2.append(this.f18738b);
        sb2.append(", appExitInfo=");
        sb2.append(this.f18739c);
        sb2.append(", signal=");
        sb2.append(this.f18740d);
        sb2.append(", binaries=");
        return e0.n(sb2, this.f18741e, "}");
    }
}
