package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18698i;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Device.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f18702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f18703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18704f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18705g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f18706h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f18707i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f18708j;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device a() {
            String str;
            String str2;
            String str3;
            if (this.f18708j == 63 && (str = this.f18700b) != null && (str2 = this.f18706h) != null && (str3 = this.f18707i) != null) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.f18699a, str, this.f18701c, this.f18702d, this.f18703e, this.f18704f, this.f18705g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f18708j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f18700b == null) {
                sb2.append(" model");
            }
            if ((this.f18708j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f18708j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f18708j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f18708j & 16) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f18708j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f18706h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f18707i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder b(int i11) {
            this.f18699a = i11;
            this.f18708j = (byte) (this.f18708j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder c(int i11) {
            this.f18701c = i11;
            this.f18708j = (byte) (this.f18708j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder d(long j11) {
            this.f18703e = j11;
            this.f18708j = (byte) (this.f18708j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f18706h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f18700b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f18707i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder h(long j11) {
            this.f18702d = j11;
            this.f18708j = (byte) (this.f18708j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder i(boolean z11) {
            this.f18704f = z11;
            this.f18708j = (byte) (this.f18708j | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder j(int i11) {
            this.f18705g = i11;
            this.f18708j = (byte) (this.f18708j | 32);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Device(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        this.f18690a = i11;
        this.f18691b = str;
        this.f18692c = i12;
        this.f18693d = j11;
        this.f18694e = j12;
        this.f18695f = z11;
        this.f18696g = i13;
        this.f18697h = str2;
        this.f18698i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int b() {
        return this.f18690a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int c() {
        return this.f18692c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final long d() {
        return this.f18694e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String e() {
        return this.f18697h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        return this.f18690a == device.b() && this.f18691b.equals(device.f()) && this.f18692c == device.c() && this.f18693d == device.h() && this.f18694e == device.d() && this.f18695f == device.j() && this.f18696g == device.i() && this.f18697h.equals(device.e()) && this.f18698i.equals(device.g());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String f() {
        return this.f18691b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String g() {
        return this.f18698i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final long h() {
        return this.f18693d;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f18690a ^ 1000003) * 1000003) ^ this.f18691b.hashCode()) * 1000003) ^ this.f18692c) * 1000003;
        long j11 = this.f18693d;
        int i11 = (iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f18694e;
        return ((((((((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ (this.f18695f ? 1231 : 1237)) * 1000003) ^ this.f18696g) * 1000003) ^ this.f18697h.hashCode()) * 1000003) ^ this.f18698i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int i() {
        return this.f18696g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final boolean j() {
        return this.f18695f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f18690a);
        sb2.append(", model=");
        sb2.append(this.f18691b);
        sb2.append(", cores=");
        sb2.append(this.f18692c);
        sb2.append(", ram=");
        sb2.append(this.f18693d);
        sb2.append(", diskSpace=");
        sb2.append(this.f18694e);
        sb2.append(", simulator=");
        sb2.append(this.f18695f);
        sb2.append(", state=");
        sb2.append(this.f18696g);
        sb2.append(", manufacturer=");
        sb2.append(this.f18697h);
        sb2.append(", modelClass=");
        return a.k(sb2, this.f18698i, "}");
    }
}
