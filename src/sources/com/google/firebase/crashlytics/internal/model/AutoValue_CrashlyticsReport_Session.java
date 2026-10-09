package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f18658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CrashlyticsReport.Session.Application f18660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CrashlyticsReport.Session.User f18661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CrashlyticsReport.Session.OperatingSystem f18662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CrashlyticsReport.Session.Device f18663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f18664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18665l;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f18669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f18670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public CrashlyticsReport.Session.Application f18672g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CrashlyticsReport.Session.User f18673h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CrashlyticsReport.Session.OperatingSystem f18674i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CrashlyticsReport.Session.Device f18675j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List f18676k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f18677l;
        public byte m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session a() {
            String str;
            String str2;
            CrashlyticsReport.Session.Application application;
            if (this.m == 7 && (str = this.f18666a) != null && (str2 = this.f18667b) != null && (application = this.f18672g) != null) {
                return new AutoValue_CrashlyticsReport_Session(str, str2, this.f18668c, this.f18669d, this.f18670e, this.f18671f, application, this.f18673h, this.f18674i, this.f18675j, this.f18676k, this.f18677l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18666a == null) {
                sb2.append(" generator");
            }
            if (this.f18667b == null) {
                sb2.append(" identifier");
            }
            if ((this.m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f18672g == null) {
                sb2.append(" app");
            }
            if ((this.m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder b(CrashlyticsReport.Session.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.f18672g = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder c(String str) {
            this.f18668c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder d(boolean z11) {
            this.f18671f = z11;
            this.m = (byte) (this.m | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder e(CrashlyticsReport.Session.Device device) {
            this.f18675j = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder f(Long l9) {
            this.f18670e = l9;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder g(List list) {
            this.f18676k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f18666a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder i(int i11) {
            this.f18677l = i11;
            this.m = (byte) (this.m | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f18667b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder k(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f18674i = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder l(long j11) {
            this.f18669d = j11;
            this.m = (byte) (this.m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder m(CrashlyticsReport.Session.User user) {
            this.f18673h = user;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j11, Long l9, boolean z11, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List list, int i11) {
        this.f18654a = str;
        this.f18655b = str2;
        this.f18656c = str3;
        this.f18657d = j11;
        this.f18658e = l9;
        this.f18659f = z11;
        this.f18660g = application;
        this.f18661h = user;
        this.f18662i = operatingSystem;
        this.f18663j = device;
        this.f18664k = list;
        this.f18665l = i11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Application b() {
        return this.f18660g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String c() {
        return this.f18656c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Device d() {
        return this.f18663j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final Long e() {
        return this.f18658e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (!this.f18654a.equals(session.g()) || !this.f18655b.equals(session.i())) {
            return false;
        }
        String str = this.f18656c;
        if (str == null) {
            if (session.c() != null) {
                return false;
            }
        } else if (!str.equals(session.c())) {
            return false;
        }
        if (this.f18657d != session.k()) {
            return false;
        }
        Long l9 = this.f18658e;
        if (l9 == null) {
            if (session.e() != null) {
                return false;
            }
        } else if (!l9.equals(session.e())) {
            return false;
        }
        if (this.f18659f != session.m() || !this.f18660g.equals(session.b())) {
            return false;
        }
        CrashlyticsReport.Session.User user = this.f18661h;
        if (user == null) {
            if (session.l() != null) {
                return false;
            }
        } else if (!user.equals(session.l())) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f18662i;
        if (operatingSystem == null) {
            if (session.j() != null) {
                return false;
            }
        } else if (!operatingSystem.equals(session.j())) {
            return false;
        }
        CrashlyticsReport.Session.Device device = this.f18663j;
        if (device == null) {
            if (session.d() != null) {
                return false;
            }
        } else if (!device.equals(session.d())) {
            return false;
        }
        List list = this.f18664k;
        if (list == null) {
            if (session.f() != null) {
                return false;
            }
        } else if (!list.equals(session.f())) {
            return false;
        }
        return this.f18665l == session.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final List f() {
        return this.f18664k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String g() {
        return this.f18654a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final int h() {
        return this.f18665l;
    }

    public final int hashCode() {
        int iHashCode = (((this.f18654a.hashCode() ^ 1000003) * 1000003) ^ this.f18655b.hashCode()) * 1000003;
        String str = this.f18656c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f18657d;
        int i11 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Long l9 = this.f18658e;
        int iHashCode3 = (((((i11 ^ (l9 == null ? 0 : l9.hashCode())) * 1000003) ^ (this.f18659f ? 1231 : 1237)) * 1000003) ^ this.f18660g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.f18661h;
        int iHashCode4 = (iHashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f18662i;
        int iHashCode5 = (iHashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.f18663j;
        int iHashCode6 = (iHashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        List list = this.f18664k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f18665l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String i() {
        return this.f18655b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.OperatingSystem j() {
        return this.f18662i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final long k() {
        return this.f18657d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.User l() {
        return this.f18661h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final boolean m() {
        return this.f18659f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Builder n() {
        Builder builder = new Builder();
        builder.f18666a = g();
        builder.f18667b = i();
        builder.f18668c = c();
        builder.f18669d = k();
        builder.f18670e = e();
        builder.f18671f = m();
        builder.f18672g = b();
        builder.f18673h = l();
        builder.f18674i = j();
        builder.f18675j = d();
        builder.f18676k = f();
        builder.f18677l = h();
        builder.m = (byte) 7;
        return builder;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f18654a);
        sb2.append(", identifier=");
        sb2.append(this.f18655b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f18656c);
        sb2.append(", startedAt=");
        sb2.append(this.f18657d);
        sb2.append(", endedAt=");
        sb2.append(this.f18658e);
        sb2.append(", crashed=");
        sb2.append(this.f18659f);
        sb2.append(", app=");
        sb2.append(this.f18660g);
        sb2.append(", user=");
        sb2.append(this.f18661h);
        sb2.append(", os=");
        sb2.append(this.f18662i);
        sb2.append(", device=");
        sb2.append(this.f18663j);
        sb2.append(", events=");
        sb2.append(this.f18664k);
        sb2.append(", generatorType=");
        return p0.i(this.f18665l, "}", sb2);
    }
}
