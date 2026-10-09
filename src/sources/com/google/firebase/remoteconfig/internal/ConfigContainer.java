package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigContainer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Date f20695h = new Date(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f20696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f20697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f20698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f20699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f20700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JSONArray f20702g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f20703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f20704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JSONArray f20705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public JSONObject f20706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public JSONArray f20708f;

        public /* synthetic */ Builder(int i11) {
            this();
        }

        public final ConfigContainer a() {
            return new ConfigContainer(this.f20703a, this.f20704b, this.f20705c, this.f20706d, this.f20707e, this.f20708f);
        }

        private Builder() {
            this.f20703a = new JSONObject();
            this.f20704b = ConfigContainer.f20695h;
            this.f20705c = new JSONArray();
            this.f20706d = new JSONObject();
            this.f20707e = 0L;
            this.f20708f = new JSONArray();
        }
    }

    public ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j11, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j11);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f20697b = jSONObject;
        this.f20698c = date;
        this.f20699d = jSONArray;
        this.f20700e = jSONObject2;
        this.f20701f = j11;
        this.f20702g = jSONArray2;
        this.f20696a = jSONObject3;
    }

    public static ConfigContainer a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new ConfigContainer(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i11 = 0;
        while (true) {
            JSONArray jSONArray = this.f20699d;
            if (i11 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            if (jSONObject.has("affectedParameterKeys") && !jSONObject.getString("experimentId").startsWith("rollout")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    map.put(jSONArray2.getString(i12), jSONObject);
                }
            }
            i11++;
        }
    }

    public final HashMap c() throws JSONException {
        HashMap map = new HashMap();
        int i11 = 0;
        while (true) {
            JSONArray jSONArray = this.f20702g;
            if (i11 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                String string3 = jSONArray2.getString(i12);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigContainer) {
            return this.f20696a.toString().equals(((ConfigContainer) obj).f20696a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f20696a.hashCode();
    }

    public final String toString() {
        return this.f20696a.toString();
    }
}
