package com.google.firebase.crashlytics.internal.model;

import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18814a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18815a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public final CrashlyticsReport.Session.Event.Log a() {
            String str = this.f18815a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Log(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public final CrashlyticsReport.Session.Event.Log.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f18815a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.f18814a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    public final String b() {
        return this.f18814a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.f18814a.equals(((CrashlyticsReport.Session.Event.Log) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f18814a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.k(new StringBuilder("Log{content="), this.f18814a, "}");
    }
}
