package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.firebase.sessions.AndroidApplicationInfo;
import com.google.firebase.sessions.ApplicationInfo;
import fz.e;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.m;
import qy.b0;
import rz.e0;
import vy.d;
import vy.i;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f21070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f21071b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RemoteSettingsFetcher(ApplicationInfo appInfo, i blockingDispatcher) {
        m.f(appInfo, "appInfo");
        m.f(blockingDispatcher, "blockingDispatcher");
        this.f21070a = appInfo;
        this.f21071b = blockingDispatcher;
    }

    public static final URL b(RemoteSettingsFetcher remoteSettingsFetcher) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(Constants.SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ApplicationInfo applicationInfo = remoteSettingsFetcher.f21070a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(applicationInfo.f20813a).appendPath("settings");
        AndroidApplicationInfo androidApplicationInfo = applicationInfo.f20815c;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", androidApplicationInfo.f20810c).appendQueryParameter("display_version", androidApplicationInfo.f20809b).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    public final Object a(Map map, e eVar, e eVar2, d dVar) {
        Object objM = e0.M(this.f21071b, new RemoteSettingsFetcher$doConfigFetch$2(this, map, eVar, eVar2, null), dVar);
        return objM == a.COROUTINE_SUSPENDED ? objM : b0.f48488a;
    }
}
