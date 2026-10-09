package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f7563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f7570i;

    public o(String str) {
        this.f7562a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7563b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f7564c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f7565d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f7566e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f7567f = jSONObject.optString("skuDetailsToken");
        this.f7568g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                arrayList.add(new n(jSONArrayOptJSONArray.getJSONObject(i11)));
            }
            this.f7569h = arrayList;
        } else {
            this.f7569h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f7563b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f7563b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i12 = 0; i12 < jSONArrayOptJSONArray2.length(); i12++) {
                arrayList2.add(new k(jSONArrayOptJSONArray2.getJSONObject(i12)));
            }
            this.f7570i = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f7570i = null;
        } else {
            arrayList2.add(new k(jSONObjectOptJSONObject));
            this.f7570i = arrayList2;
        }
    }

    public final k a() {
        ArrayList arrayList = this.f7570i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (k) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return TextUtils.equals(this.f7562a, ((o) obj).f7562a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7562a.hashCode();
    }

    public final String toString() {
        String string = this.f7563b.toString();
        String strValueOf = String.valueOf(this.f7569h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        com.google.android.material.datepicker.d.w(sb2, this.f7562a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f7564c);
        sb2.append("', productType='");
        sb2.append(this.f7565d);
        sb2.append("', title='");
        sb2.append(this.f7566e);
        sb2.append("', productDetailsToken='");
        return defpackage.e.p(sb2, this.f7567f, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
