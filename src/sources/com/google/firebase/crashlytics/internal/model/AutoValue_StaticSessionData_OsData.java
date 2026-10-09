package com.google.firebase.crashlytics.internal.model;

import android.os.Build;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_StaticSessionData_OsData extends StaticSessionData.OsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18862c;

    public AutoValue_StaticSessionData_OsData(boolean z11) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f18860a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f18861b = str2;
        this.f18862c = z11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final boolean b() {
        return this.f18862c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final String c() {
        return this.f18861b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData
    public final String d() {
        return this.f18860a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaticSessionData.OsData)) {
            return false;
        }
        StaticSessionData.OsData osData = (StaticSessionData.OsData) obj;
        return this.f18860a.equals(osData.d()) && this.f18861b.equals(osData.c()) && this.f18862c == osData.b();
    }

    public final int hashCode() {
        return ((((this.f18860a.hashCode() ^ 1000003) * 1000003) ^ this.f18861b.hashCode()) * 1000003) ^ (this.f18862c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OsData{osRelease=");
        sb2.append(this.f18860a);
        sb2.append(", osCodeName=");
        sb2.append(this.f18861b);
        sb2.append(", isRooted=");
        return p0.p(sb2, this.f18862c, "}");
    }
}
