package com.google.firebase.sessions.settings;

import android.util.Log;
import java.util.Objects;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.f;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {126}, m = "invokeSuspend")
final class RemoteSettings$updateSettings$2$1 extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RemoteSettings f21068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, d dVar) {
        super(2, dVar);
        this.f21068c = remoteSettings;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.f21068c, dVar);
        remoteSettings$updateSettings$2$1.f21067b = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteSettings$updateSettings$2$1) create((JSONObject) obj, (d) obj2)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Boolean bool;
        Double d5;
        Integer num;
        int iIntValue;
        Integer num2;
        Double d11;
        Boolean bool2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.f21066a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            JSONObject jSONObject = (JSONObject) this.f21067b;
            Objects.toString(jSONObject);
            Integer num3 = null;
            if (jSONObject.has("app_quality")) {
                Object obj2 = jSONObject.get("app_quality");
                m.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject2 = (JSONObject) obj2;
                try {
                    bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d11 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                            try {
                                if (jSONObject2.has("cache_duration")) {
                                    num3 = (Integer) jSONObject2.get("cache_duration");
                                }
                            } catch (JSONException e8) {
                                e = e8;
                                f.a(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            num2 = null;
                        }
                    } catch (JSONException e11) {
                        e = e11;
                        num2 = null;
                        d11 = null;
                    }
                } catch (JSONException e12) {
                    e = e12;
                    num2 = null;
                    d11 = null;
                    bool2 = null;
                }
                num = num2;
                d5 = d11;
                bool = bool2;
            } else {
                bool = null;
                d5 = null;
                num = null;
            }
            RemoteSettings remoteSettings = this.f21068c;
            SettingsCache settingsCache = remoteSettings.f21060e;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                RemoteSettings.f21053g.getClass();
                iIntValue = RemoteSettings.f21054h;
            }
            SessionConfigs sessionConfigs = new SessionConfigs(bool, d5, num, new Integer(iIntValue), new Long(remoteSettings.f21056a.a().f21024c));
            this.f21066a = 1;
            if (settingsCache.d(sessionConfigs, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return b0.f48488a;
    }
}
