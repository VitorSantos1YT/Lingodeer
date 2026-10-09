package com.google.firebase.sessions;

import android.os.Build;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LogEnvironment f20814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidApplicationInfo f20815c;

    public ApplicationInfo(String appId, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        m.f(appId, "appId");
        m.f(deviceModel, "deviceModel");
        m.f(osVersion, "osVersion");
        m.f(logEnvironment, "logEnvironment");
        this.f20813a = appId;
        this.f20814b = logEnvironment;
        this.f20815c = androidApplicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        if (!m.a(this.f20813a, applicationInfo.f20813a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!m.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return m.a(str2, str2) && this.f20814b == applicationInfo.f20814b && this.f20815c.equals(applicationInfo.f20815c);
    }

    public final int hashCode() {
        return this.f20815c.hashCode() + ((this.f20814b.hashCode() + e.d((((Build.MODEL.hashCode() + (this.f20813a.hashCode() * 31)) * 31) + 48517565) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f20813a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.6, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.f20814b + ", androidAppInfo=" + this.f20815c + ')';
    }
}
