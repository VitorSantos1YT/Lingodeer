package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception extends CrashlyticsReport.Session.Event.Application.Execution.Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception f18759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18760e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f18763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application.Execution.Exception f18764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f18766f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception a() {
            String str;
            List list;
            if (this.f18766f == 1 && (str = this.f18761a) != null && (list = this.f18763c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(str, this.f18762b, list, this.f18764d, this.f18765e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18761a == null) {
                sb2.append(" type");
            }
            if (this.f18763c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f18766f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder b(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.f18764d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f18763c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder d(int i11) {
            this.f18765e = i11;
            this.f18766f = (byte) (this.f18766f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder e(String str) {
            this.f18762b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f18761a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception(String str, String str2, List list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i11) {
        this.f18756a = str;
        this.f18757b = str2;
        this.f18758c = list;
        this.f18759d = exception;
        this.f18760e = i11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception b() {
        return this.f18759d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final List c() {
        return this.f18758c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final int d() {
        return this.f18760e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final String e() {
        return this.f18757b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        if (!this.f18756a.equals(exception.f())) {
            return false;
        }
        String str = this.f18757b;
        if (str == null) {
            if (exception.e() != null) {
                return false;
            }
        } else if (!str.equals(exception.e())) {
            return false;
        }
        if (!this.f18758c.equals(exception.c())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = this.f18759d;
        if (exception2 == null) {
            if (exception.b() != null) {
                return false;
            }
        } else if (!exception2.equals(exception.b())) {
            return false;
        }
        return this.f18760e == exception.d();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final String f() {
        return this.f18756a;
    }

    public final int hashCode() {
        int iHashCode = (this.f18756a.hashCode() ^ 1000003) * 1000003;
        String str = this.f18757b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f18758c.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.f18759d;
        return ((iHashCode2 ^ (exception != null ? exception.hashCode() : 0)) * 1000003) ^ this.f18760e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f18756a);
        sb2.append(", reason=");
        sb2.append(this.f18757b);
        sb2.append(", frames=");
        sb2.append(this.f18758c);
        sb2.append(", causedBy=");
        sb2.append(this.f18759d);
        sb2.append(", overflowCount=");
        return p0.i(this.f18760e, "}", sb2);
    }
}
