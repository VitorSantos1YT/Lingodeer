package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DevelopmentPlatformProvider f18850f;

    public AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i11, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f18845a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f18846b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f18847c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f18848d = str4;
        this.f18849e = i11;
        this.f18850f = developmentPlatformProvider;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String a() {
        return this.f18845a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final int c() {
        return this.f18849e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final DevelopmentPlatformProvider d() {
        return this.f18850f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String e() {
        return this.f18848d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.AppData)) {
            return false;
        }
        StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
        return this.f18845a.equals(appData.a()) && this.f18846b.equals(appData.f()) && this.f18847c.equals(appData.g()) && this.f18848d.equals(appData.e()) && this.f18849e == appData.c() && this.f18850f.equals(appData.d());
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String f() {
        return this.f18846b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public final String g() {
        return this.f18847c;
    }

    public final int hashCode() {
        return ((((((((((this.f18845a.hashCode() ^ 1000003) * 1000003) ^ this.f18846b.hashCode()) * 1000003) ^ this.f18847c.hashCode()) * 1000003) ^ this.f18848d.hashCode()) * 1000003) ^ this.f18849e) * 1000003) ^ this.f18850f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f18845a + ", versionCode=" + this.f18846b + ", versionName=" + this.f18847c + ", installUuid=" + this.f18848d + ", deliveryMechanism=" + this.f18849e + ", developmentPlatformProvider=" + this.f18850f + "}";
    }
}
