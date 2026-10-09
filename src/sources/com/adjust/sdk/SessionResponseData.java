package com.adjust.sdk;

import android.net.Uri;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SessionResponseData extends ResponseData {
    public Uri deeplink;
    private String sdkPlatform;

    public SessionResponseData(ActivityPackage activityPackage) {
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustSessionFailure getFailureResponseData() {
        if (this.success) {
            return null;
        }
        AdjustSessionFailure adjustSessionFailure = new AdjustSessionFailure();
        if (!"unity".equals(this.sdkPlatform)) {
            adjustSessionFailure.message = this.message;
            adjustSessionFailure.timestamp = this.timestamp;
            adjustSessionFailure.adid = this.adid;
            adjustSessionFailure.willRetry = this.willRetry;
            adjustSessionFailure.jsonResponse = this.jsonResponse;
            return adjustSessionFailure;
        }
        String str = this.message;
        String str2 = BuildConfig.VERSION_NAME;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        adjustSessionFailure.message = str;
        String str3 = this.timestamp;
        if (str3 == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        adjustSessionFailure.timestamp = str3;
        String str4 = this.adid;
        if (str4 != null) {
            str2 = str4;
        }
        adjustSessionFailure.adid = str2;
        adjustSessionFailure.willRetry = this.willRetry;
        JSONObject jSONObject = this.jsonResponse;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        adjustSessionFailure.jsonResponse = jSONObject;
        return adjustSessionFailure;
    }

    public AdjustSessionSuccess getSuccessResponseData() {
        if (!this.success) {
            return null;
        }
        AdjustSessionSuccess adjustSessionSuccess = new AdjustSessionSuccess();
        if (!"unity".equals(this.sdkPlatform)) {
            adjustSessionSuccess.message = this.message;
            adjustSessionSuccess.timestamp = this.timestamp;
            adjustSessionSuccess.adid = this.adid;
            adjustSessionSuccess.jsonResponse = this.jsonResponse;
            return adjustSessionSuccess;
        }
        String str = this.message;
        String str2 = BuildConfig.VERSION_NAME;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        adjustSessionSuccess.message = str;
        String str3 = this.timestamp;
        if (str3 == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        adjustSessionSuccess.timestamp = str3;
        String str4 = this.adid;
        if (str4 != null) {
            str2 = str4;
        }
        adjustSessionSuccess.adid = str2;
        JSONObject jSONObject = this.jsonResponse;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        adjustSessionSuccess.jsonResponse = jSONObject;
        return adjustSessionSuccess;
    }
}
