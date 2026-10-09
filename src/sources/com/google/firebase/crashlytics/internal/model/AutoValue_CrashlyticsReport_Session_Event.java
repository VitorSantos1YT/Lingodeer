package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application f18711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Device f18712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Log f18713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.RolloutsState f18714f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application f18717c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Device f18718d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Log f18719e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.RolloutsState f18720f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f18721g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event a() {
            String str;
            CrashlyticsReport.Session.Event.Application application;
            CrashlyticsReport.Session.Event.Device device;
            if (this.f18721g == 1 && (str = this.f18716b) != null && (application = this.f18717c) != null && (device = this.f18718d) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.f18715a, str, application, device, this.f18719e, this.f18720f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f18721g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f18716b == null) {
                sb2.append(" type");
            }
            if (this.f18717c == null) {
                sb2.append(" app");
            }
            if (this.f18718d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder b(CrashlyticsReport.Session.Event.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.f18717c = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder c(CrashlyticsReport.Session.Event.Device device) {
            if (device == null) {
                throw new NullPointerException("Null device");
            }
            this.f18718d = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder d(CrashlyticsReport.Session.Event.Log log) {
            this.f18719e = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder e(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.f18720f = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder f(long j11) {
            this.f18715a = j11;
            this.f18721g = (byte) (this.f18721g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f18716b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event(long j11, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, CrashlyticsReport.Session.Event.Log log, CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.f18709a = j11;
        this.f18710b = str;
        this.f18711c = application;
        this.f18712d = device;
        this.f18713e = log;
        this.f18714f = rolloutsState;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Application b() {
        return this.f18711c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Device c() {
        return this.f18712d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Log d() {
        return this.f18713e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.RolloutsState e() {
        return this.f18714f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.f18709a != event.f() || !this.f18710b.equals(event.g()) || !this.f18711c.equals(event.b()) || !this.f18712d.equals(event.c())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Log log = this.f18713e;
        if (log == null) {
            if (event.d() != null) {
                return false;
            }
        } else if (!log.equals(event.d())) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f18714f;
        if (rolloutsState == null) {
            return event.e() == null;
        }
        return rolloutsState.equals(event.e());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final long f() {
        return this.f18709a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final String g() {
        return this.f18710b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Builder h() {
        Builder builder = new Builder();
        builder.f18715a = this.f18709a;
        builder.f18716b = this.f18710b;
        builder.f18717c = this.f18711c;
        builder.f18718d = this.f18712d;
        builder.f18719e = this.f18713e;
        builder.f18720f = this.f18714f;
        builder.f18721g = (byte) 1;
        return builder;
    }

    public final int hashCode() {
        long j11 = this.f18709a;
        int iHashCode = (((((((((int) ((j11 >>> 32) ^ j11)) ^ 1000003) * 1000003) ^ this.f18710b.hashCode()) * 1000003) ^ this.f18711c.hashCode()) * 1000003) ^ this.f18712d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.f18713e;
        int iHashCode2 = (iHashCode ^ (log == null ? 0 : log.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f18714f;
        return iHashCode2 ^ (rolloutsState != null ? rolloutsState.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f18709a + ", type=" + this.f18710b + ", app=" + this.f18711c + ", device=" + this.f18712d + ", log=" + this.f18713e + ", rollouts=" + this.f18714f + "}";
    }
}
