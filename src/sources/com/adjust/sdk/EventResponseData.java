package com.adjust.sdk;

import com.tbruyelle.rxpermissions3.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class EventResponseData extends ResponseData {
    private String callbackId;
    private String eventToken;
    private String sdkPlatform;

    public EventResponseData(ActivityPackage activityPackage) {
        this.eventToken = activityPackage.getParameters().get("event_token");
        this.callbackId = activityPackage.getParameters().get("event_callback_id");
        this.sdkPlatform = Util.getSdkPrefixPlatform(activityPackage.getClientSdk());
    }

    public AdjustEventFailure getFailureResponseData() {
        if (this.success) {
            return null;
        }
        AdjustEventFailure adjustEventFailure = new AdjustEventFailure();
        if (!"unity".equals(this.sdkPlatform)) {
            adjustEventFailure.eventToken = this.eventToken;
            adjustEventFailure.message = this.message;
            adjustEventFailure.timestamp = this.timestamp;
            adjustEventFailure.adid = this.adid;
            adjustEventFailure.callbackId = this.callbackId;
            adjustEventFailure.willRetry = this.willRetry;
            adjustEventFailure.jsonResponse = this.jsonResponse;
            return adjustEventFailure;
        }
        String str = this.eventToken;
        String str2 = BuildConfig.VERSION_NAME;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        adjustEventFailure.eventToken = str;
        String str3 = this.message;
        if (str3 == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        adjustEventFailure.message = str3;
        String str4 = this.timestamp;
        if (str4 == null) {
            str4 = BuildConfig.VERSION_NAME;
        }
        adjustEventFailure.timestamp = str4;
        String str5 = this.adid;
        if (str5 == null) {
            str5 = BuildConfig.VERSION_NAME;
        }
        adjustEventFailure.adid = str5;
        String str6 = this.callbackId;
        if (str6 != null) {
            str2 = str6;
        }
        adjustEventFailure.callbackId = str2;
        adjustEventFailure.willRetry = this.willRetry;
        JSONObject jSONObject = this.jsonResponse;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        adjustEventFailure.jsonResponse = jSONObject;
        return adjustEventFailure;
    }

    public AdjustEventSuccess getSuccessResponseData() {
        if (!this.success) {
            return null;
        }
        AdjustEventSuccess adjustEventSuccess = new AdjustEventSuccess();
        if (!"unity".equals(this.sdkPlatform)) {
            adjustEventSuccess.eventToken = this.eventToken;
            adjustEventSuccess.message = this.message;
            adjustEventSuccess.timestamp = this.timestamp;
            adjustEventSuccess.adid = this.adid;
            adjustEventSuccess.callbackId = this.callbackId;
            adjustEventSuccess.jsonResponse = this.jsonResponse;
            return adjustEventSuccess;
        }
        String str = this.eventToken;
        String str2 = BuildConfig.VERSION_NAME;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        adjustEventSuccess.eventToken = str;
        String str3 = this.message;
        if (str3 == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        adjustEventSuccess.message = str3;
        String str4 = this.timestamp;
        if (str4 == null) {
            str4 = BuildConfig.VERSION_NAME;
        }
        adjustEventSuccess.timestamp = str4;
        String str5 = this.adid;
        if (str5 == null) {
            str5 = BuildConfig.VERSION_NAME;
        }
        adjustEventSuccess.adid = str5;
        String str6 = this.callbackId;
        if (str6 != null) {
            str2 = str6;
        }
        adjustEventSuccess.callbackId = str2;
        JSONObject jSONObject = this.jsonResponse;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        adjustEventSuccess.jsonResponse = jSONObject;
        return adjustEventSuccess;
    }
}
