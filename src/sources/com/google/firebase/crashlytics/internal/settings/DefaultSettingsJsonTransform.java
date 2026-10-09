package com.google.firebase.crashlytics.internal.settings;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    public static Settings b(SystemCurrentTimeProvider systemCurrentTimeProvider) {
        return new Settings(System.currentTimeMillis() + ((long) Constants.ONE_HOUR), new Settings.SessionData(8), new Settings.FeatureFlagData(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public final Settings a(SystemCurrentTimeProvider systemCurrentTimeProvider, JSONObject jSONObject) {
        return b(systemCurrentTimeProvider);
    }
}
