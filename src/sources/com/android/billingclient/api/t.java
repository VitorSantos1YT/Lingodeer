package com.android.billingclient.api;

import android.text.TextUtils;
import hh.p0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7578d;

    public t(String str) {
        this.f7575a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f7576b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f7577c = strOptString;
        this.f7578d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return TextUtils.equals(this.f7575a, ((t) obj).f7575a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7575a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f7576b);
        sb2.append("', productType='");
        sb2.append(this.f7577c);
        sb2.append("', statusCode=");
        return p0.i(this.f7578d, "}", sb2);
    }
}
