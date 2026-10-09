package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AbtExperimentInfo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f17747g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f17748h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f17752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17754f;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j11, long j12) {
        this.f17749a = str;
        this.f17750b = str2;
        this.f17751c = str3;
        this.f17752d = date;
        this.f17753e = j11;
        this.f17754f = j12;
    }

    public static AbtExperimentInfo a(Map map) throws AbtException {
        d(map);
        try {
            return new AbtExperimentInfo((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME, f17748h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e8) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e8);
        } catch (ParseException e10) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e10);
        }
    }

    public static void d(Map map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 5; i11++) {
            String str = f17747g[i11];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    public final AnalyticsConnector.ConditionalUserProperty b(String str) {
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.f17765a = str;
        conditionalUserProperty.m = this.f17752d.getTime();
        conditionalUserProperty.f17766b = this.f17749a;
        conditionalUserProperty.f17767c = this.f17750b;
        String str2 = this.f17751c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        conditionalUserProperty.f17768d = str2;
        conditionalUserProperty.f17769e = this.f17753e;
        conditionalUserProperty.f17774j = this.f17754f;
        return conditionalUserProperty;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        map.put("experimentId", this.f17749a);
        map.put("variantId", this.f17750b);
        map.put("triggerEvent", this.f17751c);
        map.put("experimentStartTime", f17748h.format(this.f17752d));
        map.put("triggerTimeoutMillis", Long.toString(this.f17753e));
        map.put("timeToLiveMillis", Long.toString(this.f17754f));
        return map;
    }
}
