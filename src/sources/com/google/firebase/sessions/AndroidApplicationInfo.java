package com.google.firebase.sessions;

import android.os.Build;
import defpackage.e;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProcessDetails f20811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20812e;

    public AndroidApplicationInfo(String str, String versionName, String appBuildVersion, ProcessDetails processDetails, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        m.f(versionName, "versionName");
        m.f(appBuildVersion, "appBuildVersion");
        m.f(deviceManufacturer, "deviceManufacturer");
        this.f20808a = str;
        this.f20809b = versionName;
        this.f20810c = appBuildVersion;
        this.f20811d = processDetails;
        this.f20812e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        if (!this.f20808a.equals(androidApplicationInfo.f20808a) || !m.a(this.f20809b, androidApplicationInfo.f20809b) || !m.a(this.f20810c, androidApplicationInfo.f20810c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return m.a(str, str) && this.f20811d.equals(androidApplicationInfo.f20811d) && this.f20812e.equals(androidApplicationInfo.f20812e);
    }

    public final int hashCode() {
        return this.f20812e.hashCode() + ((this.f20811d.hashCode() + e.d(e.d(e.d(this.f20808a.hashCode() * 31, 31, this.f20809b), 31, this.f20810c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f20808a + ", versionName=" + this.f20809b + ", appBuildVersion=" + this.f20810c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f20811d + ", appProcessDetails=" + this.f20812e + ')';
    }
}
