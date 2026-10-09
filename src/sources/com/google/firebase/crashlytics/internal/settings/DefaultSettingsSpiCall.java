package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class DefaultSettingsSpiCall implements SettingsSpiCall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18914a;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this.f18914a = str;
    }

    public static void a(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        String str = settingsRequest.f18937a;
        if (str != null) {
            httpGetRequest.c("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        httpGetRequest.c("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        httpGetRequest.c("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.6");
        httpGetRequest.c("Accept", "application/json");
        httpGetRequest.c("X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.f18938b);
        String str2 = settingsRequest.f18939c;
        if (str2 != null) {
            httpGetRequest.c("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = settingsRequest.f18940d;
        if (str3 != null) {
            httpGetRequest.c("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String strA = settingsRequest.f18941e.c().a();
        if (strA != null) {
            httpGetRequest.c("X-CRASHLYTICS-INSTALLATION-ID", strA);
        }
    }

    public static HashMap b(SettingsRequest settingsRequest) {
        HashMap map = new HashMap();
        map.put("build_version", settingsRequest.f18944h);
        map.put("display_version", settingsRequest.f18943g);
        map.put("source", Integer.toString(settingsRequest.f18945i));
        String str = settingsRequest.f18942f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }
}
