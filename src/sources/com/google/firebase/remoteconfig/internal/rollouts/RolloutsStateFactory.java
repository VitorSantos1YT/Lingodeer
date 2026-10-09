package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RolloutsStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConfigCacheClient f20782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConfigCacheClient f20783b;

    public final RolloutsState a(ConfigContainer configContainer) {
        String string;
        JSONArray jSONArray = configContainer.f20702g;
        long j11 = configContainer.f20701f;
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2);
                }
                String strOptString = jSONArray2.optString(0, BuildConfig.VERSION_NAME);
                ConfigContainer configContainerC = this.f20782a.c();
                String string3 = null;
                if (configContainerC == null) {
                    string = null;
                } else {
                    try {
                        string = configContainerC.f20697b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    ConfigContainer configContainerC2 = this.f20783b.c();
                    if (configContainerC2 != null) {
                        try {
                            string3 = configContainerC2.f20697b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : BuildConfig.VERSION_NAME;
                }
                RolloutAssignment.Builder builderA = RolloutAssignment.a();
                builderA.d(string2);
                builderA.f(jSONObject.getString("variantId"));
                builderA.b(strOptString);
                builderA.c(string);
                builderA.e(j11);
                hashSet.add(builderA.a());
            } catch (JSONException e8) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e8);
            }
        }
        return RolloutsState.a(hashSet);
    }
}
