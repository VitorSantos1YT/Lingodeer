package com.google.firebase.crashlytics.internal.model;

import b7.e0;
import com.google.android.material.datepicker.d;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread extends CrashlyticsReport.Session.Event.Application.Execution.Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f18776c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f18779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f18780d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread a() {
            String str;
            List list;
            if (this.f18780d == 1 && (str = this.f18777a) != null && (list = this.f18779c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(this.f18778b, str, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18777a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f18780d) == 0) {
                sb2.append(" importance");
            }
            if (this.f18779c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f18779c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder c(int i11) {
            this.f18778b = i11;
            this.f18780d = (byte) (this.f18780d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f18777a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread(int i11, String str, List list) {
        this.f18774a = str;
        this.f18775b = i11;
        this.f18776c = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final List b() {
        return this.f18776c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final int c() {
        return this.f18775b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final String d() {
        return this.f18774a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        return this.f18774a.equals(thread.d()) && this.f18775b == thread.c() && this.f18776c.equals(thread.b());
    }

    public final int hashCode() {
        return ((((this.f18774a.hashCode() ^ 1000003) * 1000003) ^ this.f18775b) * 1000003) ^ this.f18776c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread{name=");
        sb2.append(this.f18774a);
        sb2.append(", importance=");
        sb2.append(this.f18775b);
        sb2.append(", frames=");
        return e0.n(sb2, this.f18776c, "}");
    }
}
