package com.google.firebase.crashlytics.internal.model;

import android.os.Build;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_StaticSessionData_DeviceData extends StaticSessionData.DeviceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18859i;

    public AutoValue_StaticSessionData_DeviceData(int i11, int i12, long j11, long j12, boolean z11, int i13) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f18851a = i11;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f18852b = str;
        this.f18853c = i12;
        this.f18854d = j11;
        this.f18855e = j12;
        this.f18856f = z11;
        this.f18857g = i13;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f18858h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f18859i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int a() {
        return this.f18851a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int b() {
        return this.f18853c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final long d() {
        return this.f18855e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final boolean e() {
        return this.f18856f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.DeviceData)) {
            return false;
        }
        StaticSessionData.DeviceData deviceData = (StaticSessionData.DeviceData) obj;
        return this.f18851a == deviceData.a() && this.f18852b.equals(deviceData.g()) && this.f18853c == deviceData.b() && this.f18854d == deviceData.j() && this.f18855e == deviceData.d() && this.f18856f == deviceData.e() && this.f18857g == deviceData.i() && this.f18858h.equals(deviceData.f()) && this.f18859i.equals(deviceData.h());
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String f() {
        return this.f18858h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String g() {
        return this.f18852b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final String h() {
        return this.f18859i;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f18851a ^ 1000003) * 1000003) ^ this.f18852b.hashCode()) * 1000003) ^ this.f18853c) * 1000003;
        long j11 = this.f18854d;
        int i11 = (iHashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f18855e;
        return ((((((((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ (this.f18856f ? 1231 : 1237)) * 1000003) ^ this.f18857g) * 1000003) ^ this.f18858h.hashCode()) * 1000003) ^ this.f18859i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final int i() {
        return this.f18857g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData
    public final long j() {
        return this.f18854d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f18851a);
        sb2.append(", model=");
        sb2.append(this.f18852b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f18853c);
        sb2.append(", totalRam=");
        sb2.append(this.f18854d);
        sb2.append(", diskSpace=");
        sb2.append(this.f18855e);
        sb2.append(", isEmulator=");
        sb2.append(this.f18856f);
        sb2.append(", state=");
        sb2.append(this.f18857g);
        sb2.append(", manufacturer=");
        sb2.append(this.f18858h);
        sb2.append(", modelClass=");
        return a.k(sb2, this.f18859i, "}");
    }
}
