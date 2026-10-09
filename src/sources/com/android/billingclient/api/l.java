package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7550c;

    public l(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        this.f7550c = jSONObject.optString("priceCurrencyCode");
        this.f7548a = jSONObject.optString("formattedPrice");
        this.f7549b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
