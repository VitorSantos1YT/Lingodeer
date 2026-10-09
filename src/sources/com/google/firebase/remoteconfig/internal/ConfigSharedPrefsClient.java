package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigSharedPrefsClient {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Date f20761e = new Date(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Date f20762f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20764b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20765c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20766d = new Object();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BackoffMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f20768b;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RealtimeBackoffMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f20770b;
    }

    public ConfigSharedPrefsClient(SharedPreferences sharedPreferences) {
        this.f20763a = sharedPreferences;
    }

    public final BackoffMetadata a() {
        BackoffMetadata backoffMetadata;
        synchronized (this.f20765c) {
            int i11 = this.f20763a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f20763a.getLong("backoff_end_time_in_millis", -1L));
            backoffMetadata = new BackoffMetadata();
            backoffMetadata.f20767a = i11;
            backoffMetadata.f20768b = date;
        }
        return backoffMetadata;
    }

    public final RealtimeBackoffMetadata c() {
        RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.f20766d) {
            int i11 = this.f20763a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f20763a.getLong("realtime_backoff_end_time_in_millis", -1L));
            realtimeBackoffMetadata = new RealtimeBackoffMetadata();
            realtimeBackoffMetadata.f20769a = i11;
            realtimeBackoffMetadata.f20770b = date;
        }
        return realtimeBackoffMetadata;
    }

    public final void d(int i11, Date date) {
        synchronized (this.f20765c) {
            this.f20763a.edit().putInt("num_failed_fetches", i11).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i11, Date date) {
        synchronized (this.f20766d) {
            this.f20763a.edit().putInt("num_failed_realtime_streams", i11).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f20763a.getString("customSignals", xTCJ.OnUAqwrRFUI));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }
}
