package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_StaticSessionData extends StaticSessionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StaticSessionData.AppData f18842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StaticSessionData.OsData f18843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StaticSessionData.DeviceData f18844c;

    public AutoValue_StaticSessionData(StaticSessionData.AppData appData, StaticSessionData.OsData osData, StaticSessionData.DeviceData deviceData) {
        this.f18842a = appData;
        this.f18843b = osData;
        this.f18844c = deviceData;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.AppData a() {
        return this.f18842a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.DeviceData c() {
        return this.f18844c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData
    public final StaticSessionData.OsData d() {
        return this.f18843b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData)) {
            return false;
        }
        StaticSessionData staticSessionData = (StaticSessionData) obj;
        return this.f18842a.equals(staticSessionData.a()) && this.f18843b.equals(staticSessionData.d()) && this.f18844c.equals(staticSessionData.c());
    }

    public final int hashCode() {
        return ((((this.f18842a.hashCode() ^ 1000003) * 1000003) ^ this.f18843b.hashCode()) * 1000003) ^ this.f18844c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f18842a + ", osData=" + this.f18843b + ", deviceData=" + this.f18844c + "}";
    }
}
