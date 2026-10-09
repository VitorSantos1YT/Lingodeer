package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18769c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f18772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f18773d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal a() {
            String str;
            String str2;
            if (this.f18773d == 1 && (str = this.f18770a) != null && (str2 = this.f18771b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(str, str2, this.f18772c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18770a == null) {
                sb2.append(" name");
            }
            if (this.f18771b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f18773d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder b(long j11) {
            this.f18772c = j11;
            this.f18773d = (byte) (this.f18773d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f18771b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f18770a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String str, String str2, long j11) {
        this.f18767a = str;
        this.f18768b = str2;
        this.f18769c = j11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final long b() {
        return this.f18769c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final String c() {
        return this.f18768b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final String d() {
        return this.f18767a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        return this.f18767a.equals(signal.d()) && this.f18768b.equals(signal.c()) && this.f18769c == signal.b();
    }

    public final int hashCode() {
        int iHashCode = (((this.f18767a.hashCode() ^ 1000003) * 1000003) ^ this.f18768b.hashCode()) * 1000003;
        long j11 = this.f18769c;
        return iHashCode ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f18767a);
        sb2.append(", code=");
        sb2.append(this.f18768b);
        sb2.append(", address=");
        return e.i(this.f18769c, "}", sb2);
    }
}
