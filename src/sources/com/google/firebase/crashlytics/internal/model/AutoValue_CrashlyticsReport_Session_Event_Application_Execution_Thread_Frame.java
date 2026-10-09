package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18785e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f18789d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f18791f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame a() {
            String str;
            if (this.f18791f == 7 && (str = this.f18787b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(this.f18786a, this.f18789d, this.f18790e, str, this.f18788c);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f18791f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f18787b == null) {
                sb2.append(" symbol");
            }
            if ((this.f18791f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f18791f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder b(String str) {
            this.f18788c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder c(int i11) {
            this.f18790e = i11;
            this.f18791f = (byte) (this.f18791f | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder d(long j11) {
            this.f18789d = j11;
            this.f18791f = (byte) (this.f18791f | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder e(long j11) {
            this.f18786a = j11;
            this.f18791f = (byte) (this.f18791f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f18787b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long j11, long j12, int i11, String str, String str2) {
        this.f18781a = j11;
        this.f18782b = str;
        this.f18783c = str2;
        this.f18784d = j12;
        this.f18785e = i11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final String b() {
        return this.f18783c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final int c() {
        return this.f18785e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long d() {
        return this.f18784d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long e() {
        return this.f18781a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (this.f18781a != frame.e() || !this.f18782b.equals(frame.f())) {
            return false;
        }
        String str = this.f18783c;
        if (str == null) {
            if (frame.b() != null) {
                return false;
            }
        } else if (!str.equals(frame.b())) {
            return false;
        }
        return this.f18784d == frame.d() && this.f18785e == frame.c();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final String f() {
        return this.f18782b;
    }

    public final int hashCode() {
        long j11 = this.f18781a;
        int iHashCode = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f18782b.hashCode()) * 1000003;
        String str = this.f18783c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j12 = this.f18784d;
        return ((iHashCode2 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f18785e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f18781a);
        sb2.append(", symbol=");
        sb2.append(this.f18782b);
        sb2.append(", file=");
        sb2.append(this.f18783c);
        sb2.append(", offset=");
        sb2.append(this.f18784d);
        sb2.append(", importance=");
        return p0.i(this.f18785e, "}", sb2);
    }
}
