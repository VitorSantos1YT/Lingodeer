package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f18801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18806f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f18807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f18811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f18812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f18813g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device a() {
            if (this.f18813g == 31) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.f18807a, this.f18808b, this.f18809c, this.f18810d, this.f18811e, this.f18812f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f18813g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f18813g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f18813g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f18813g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f18813g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder b(Double d5) {
            this.f18807a = d5;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder c(int i11) {
            this.f18808b = i11;
            this.f18813g = (byte) (this.f18813g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder d(long j11) {
            this.f18812f = j11;
            this.f18813g = (byte) (this.f18813g | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder e(int i11) {
            this.f18810d = i11;
            this.f18813g = (byte) (this.f18813g | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder f(boolean z11) {
            this.f18809c = z11;
            this.f18813g = (byte) (this.f18813g | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder g(long j11) {
            this.f18811e = j11;
            this.f18813g = (byte) (this.f18813g | 8);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Device(Double d5, int i11, boolean z11, int i12, long j11, long j12) {
        this.f18801a = d5;
        this.f18802b = i11;
        this.f18803c = z11;
        this.f18804d = i12;
        this.f18805e = j11;
        this.f18806f = j12;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final Double b() {
        return this.f18801a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int c() {
        return this.f18802b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long d() {
        return this.f18806f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int e() {
        return this.f18804d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
        Double d5 = this.f18801a;
        if (d5 == null) {
            if (device.b() != null) {
                return false;
            }
        } else if (!d5.equals(device.b())) {
            return false;
        }
        return this.f18802b == device.c() && this.f18803c == device.g() && this.f18804d == device.e() && this.f18805e == device.f() && this.f18806f == device.d();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long f() {
        return this.f18805e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final boolean g() {
        return this.f18803c;
    }

    public final int hashCode() {
        Double d5 = this.f18801a;
        int iHashCode = ((((((((d5 == null ? 0 : d5.hashCode()) ^ 1000003) * 1000003) ^ this.f18802b) * 1000003) ^ (this.f18803c ? 1231 : 1237)) * 1000003) ^ this.f18804d) * 1000003;
        long j11 = this.f18805e;
        long j12 = this.f18806f;
        return ((iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f18801a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f18802b);
        sb2.append(", proximityOn=");
        sb2.append(this.f18803c);
        sb2.append(", orientation=");
        sb2.append(this.f18804d);
        sb2.append(", ramUsed=");
        sb2.append(this.f18805e);
        sb2.append(", diskUsed=");
        return e.i(this.f18806f, "}", sb2);
    }
}
