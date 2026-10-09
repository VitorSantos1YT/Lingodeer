package com.adjust.sdk.network;

import android.content.Context;
import android.net.Uri;
import androidx.drawerlayout.widget.ktFt.FpIL;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustSigner;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageBuilder;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.Util;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import ep.a;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ActivityPackageSender implements IActivityPackageSender {
    private String basePath;
    private String clientSdk;
    private int connectionTimeout;
    private Context context;
    private String gdprPath;
    private String purchaseVerificationPath;
    private String subscriptionPath;
    private UrlStrategy urlStrategy;
    private ILogger logger = AdjustFactory.getLogger();
    private ThreadExecutor executor = new SingleThreadCachedScheduler("ActivityPackageSender");
    private UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = AdjustFactory.getHttpsURLConnectionProvider();
    private UtilNetworking.IConnectionOptions connectionOptions = AdjustFactory.getConnectionOptions();

    public ActivityPackageSender(List<String> list, boolean z11, String str, String str2, String str3, String str4, String str5, int i11, Context context) {
        this.basePath = str;
        this.gdprPath = str2;
        this.subscriptionPath = str3;
        this.purchaseVerificationPath = str4;
        this.clientSdk = str5;
        this.connectionTimeout = i11;
        this.context = context;
        this.urlStrategy = new UrlStrategy(AdjustFactory.getBaseUrl(), AdjustFactory.getGdprUrl(), AdjustFactory.getSubscriptionUrl(), AdjustFactory.getPurchaseVerificationUrl(), list, z11);
    }

    private DataOutputStream configConnectionForGET(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    private DataOutputStream configConnectionForPOST(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws IOException {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String strGeneratePOSTBodyString = generatePOSTBodyString(map, map2, map3);
        if (strGeneratePOSTBodyString == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(strGeneratePOSTBodyString);
        return dataOutputStream;
    }

    private String errorMessage(Throwable th2, String str, ActivityPackage activityPackage) {
        return Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th2));
    }

    private static String extractAuthorizationHeader(Map<String, String> map) {
        return map.remove("authorization");
    }

    private static String extractTargetUrl(Map<String, String> map, ActivityKind activityKind, UrlStrategy urlStrategy) {
        String strRemove = map.remove("endpoint");
        return strRemove != null ? strRemove : urlStrategy.targetUrlByActivityKind(activityKind);
    }

    private String generatePOSTBodyString(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        if (map3 == null || map3.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                injectParametersToPOSTStringBuilder(map, sb2);
            }
            if (map2 != null && !map2.isEmpty()) {
                injectParametersToPOSTStringBuilder(map2, sb2);
            }
        } else {
            injectParametersToPOSTStringBuilder(map3, sb2);
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private String generateUrlStringForPOST(ActivityKind activityKind, String str, Map<String, String> map) {
        String string = Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map, activityKind, this.urlStrategy)), str);
        this.logger.debug("Making request to url : %s", string);
        return string;
    }

    private void injectParametersToPOSTStringBuilder(Map<String, String> map, StringBuilder sb2) throws UnsupportedEncodingException {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strEncode = URLEncoder.encode(entry.getKey(), Constants.ENCODING);
            String value = entry.getValue();
            d.w(sb2, strEncode, "=", value != null ? URLEncoder.encode(value, Constants.ENCODING) : BuildConfig.VERSION_NAME, "&");
        }
    }

    private void localError(Throwable th2, String str, ResponseData responseData, int i11) {
        String strErrorMessage = errorMessage(th2, str, responseData.activityPackage);
        this.logger.error(strErrorMessage, new Object[0]);
        responseData.message = strErrorMessage;
        responseData.willRetry = false;
        responseData.activityPackage.addError(i11);
    }

    private void parseResponse(ResponseData responseData, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e8) {
            this.logger.error(errorMessage(e8, "Failed to parse JSON response", responseData.activityPackage), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        responseData.jsonResponse = jSONObject;
        responseData.message = UtilNetworking.extractJsonString(jSONObject, "message");
        responseData.adid = UtilNetworking.extractJsonString(jSONObject, "adid");
        responseData.timestamp = UtilNetworking.extractJsonString(jSONObject, "timestamp");
        String strExtractJsonString = UtilNetworking.extractJsonString(jSONObject, "tracking_state");
        if (strExtractJsonString != null && strExtractJsonString.equals("opted_out")) {
            responseData.trackingState = TrackingState.OPTED_OUT;
        }
        responseData.askIn = UtilNetworking.extractJsonLong(jSONObject, "ask_in");
        responseData.retryIn = UtilNetworking.extractJsonLong(jSONObject, "retry_in");
        responseData.continueIn = UtilNetworking.extractJsonLong(jSONObject, "continue_in");
        responseData.attribution = Util.attributionFromJson(jSONObject.optJSONObject("attribution"), Util.getSdkPrefixPlatform(this.clientSdk));
        responseData.resolvedDeeplink = UtilNetworking.extractJsonString(jSONObject, "resolved_click_url");
        responseData.controlParams = jSONObject.optJSONObject("control_params");
    }

    private void remoteError(Throwable th2, String str, ResponseData responseData, Integer num) {
        String strK = a.k(new StringBuilder(), errorMessage(th2, str, responseData.activityPackage), " Will retry later");
        this.logger.error(strK, new Object[0]);
        responseData.message = strK;
        responseData.willRetry = true;
        responseData.activityPackage.addError(num.intValue());
    }

    private boolean shouldRetryToSendWithUrlStrategy(ResponseData responseData) {
        if (responseData.jsonResponse != null) {
            this.logger.debug("Will not retry with current url strategy, already got a valid json response", new Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        }
        if (this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind)) {
            this.logger.error("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        }
        this.logger.error("Failed with current url strategy and it will not retry", new Object[0]);
        return false;
    }

    private Map<String, String> signParameters(ActivityPackage activityPackage, Map<String, String> map) {
        HashMap map2 = new HashMap(activityPackage.getParameters());
        if (map != null) {
            map2.putAll(map);
        }
        HashMap map3 = new HashMap();
        map3.put("client_sdk", activityPackage.getClientSdk());
        map3.put("activity_kind", activityPackage.getActivityKind().toString());
        map3.put("endpoint", this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind()));
        JSONObject controlParamsJson = SharedPreferencesManager.getDefaultInstance(this.context).getControlParamsJson();
        if (controlParamsJson != null) {
            Iterator<String> itKeys = controlParamsJson.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (controlParamsJson.get(next) instanceof String) {
                        map3.put(next, (String) controlParamsJson.get(next));
                    }
                } catch (JSONException unused) {
                    this.logger.error("JSONException while iterating control params", new Object[0]);
                }
            }
        }
        return AdjustSigner.sign(map2, map3, this.context, this.logger);
    }

    private Map<String, String> updateSendingParameters(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        PackageBuilder.addString(map, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return map;
    }

    private String urlWithExtraPathByActivityKind(ActivityKind activityKind, String str) {
        if (activityKind == ActivityKind.GDPR) {
            if (this.gdprPath != null) {
                StringBuilder sbN = a.n(str);
                sbN.append(this.gdprPath);
                return sbN.toString();
            }
        } else if (activityKind == ActivityKind.SUBSCRIPTION) {
            if (this.subscriptionPath != null) {
                StringBuilder sbN2 = a.n(str);
                sbN2.append(this.subscriptionPath);
                return sbN2.toString();
            }
        } else if (activityKind == ActivityKind.PURCHASE_VERIFICATION) {
            if (this.purchaseVerificationPath != null) {
                StringBuilder sbN3 = a.n(str);
                sbN3.append(this.purchaseVerificationPath);
                return sbN3.toString();
            }
        } else if (this.basePath != null) {
            StringBuilder sbN4 = a.n(str);
            sbN4.append(this.basePath);
            return sbN4.toString();
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    public Integer readConnectionResponse(HttpsURLConnection httpsURLConnection, ResponseData responseData) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        Integer numValueOf = null;
        try {
            try {
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                numValueOf = Integer.valueOf(responseCode);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(responseCode >= 400 ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                }
            } catch (IOException e8) {
                this.logger.error(errorMessage(e8, "Connecting and reading response", responseData.activityPackage), new Object[0]);
                if (httpsURLConnection != null) {
                    break;
                }
                if (sb2.length() == 0) {
                    this.logger.error("Empty response string buffer", new Object[0]);
                    return numValueOf;
                }
                if (numValueOf.intValue() == 429) {
                    this.logger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                    return numValueOf;
                }
                String string = sb2.toString();
                this.logger.debug("Response string: %s", string);
                parseResponse(responseData, string);
                if (responseData.controlParams != null) {
                    SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
                }
                str = responseData.message;
                if (str != null) {
                    if (numValueOf.intValue() == 200) {
                        this.logger.info("Response message: %s", str);
                    } else {
                        this.logger.error("Response message: %s", str);
                    }
                }
                return numValueOf;
            }
            httpsURLConnection.disconnect();
            if (sb2.length() == 0) {
                this.logger.error("Empty response string buffer", new Object[0]);
                return numValueOf;
            }
            if (numValueOf.intValue() == 429) {
                this.logger.error("Too frequent requests to the endpoint (429)", new Object[0]);
                return numValueOf;
            }
            String string2 = sb2.toString();
            this.logger.debug("Response string: %s", string2);
            parseResponse(responseData, string2);
            if (responseData.controlParams != null) {
                SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
            }
            str = responseData.message;
            if (str != null) {
                if (numValueOf.intValue() == 200) {
                    this.logger.info("Response message: %s", str);
                } else {
                    this.logger.error("Response message: %s", str);
                }
            }
            return numValueOf;
        } catch (Throwable th2) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th2;
        }
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public void sendActivityPackage(final ActivityPackage activityPackage, final Map<String, String> map, final IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new Runnable() { // from class: com.adjust.sdk.network.ActivityPackageSender.1
            @Override // java.lang.Runnable
            public final void run() {
                responseDataCallbackSubscriber.onResponseDataCallback(ActivityPackageSender.this.sendActivityPackageSync(activityPackage, map));
            }
        });
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map) {
        ResponseData responseDataBuildResponseData;
        do {
            Map<String, String> mapUpdateSendingParameters = updateSendingParameters(map);
            responseDataBuildResponseData = ResponseData.buildResponseData(activityPackage, mapUpdateSendingParameters, signParameters(activityPackage, mapUpdateSendingParameters));
            tryToGetResponse(responseDataBuildResponseData);
        } while (shouldRetryToSendWithUrlStrategy(responseDataBuildResponseData));
        return responseDataBuildResponseData;
    }

    private String generateUrlStringForGET(ActivityKind activityKind, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        URL url = new URL(urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map3, activityKind, this.urlStrategy)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.logger.debug(xItStCyvVEZ.avXwsiCKlMLbsMl, builder.toString());
        if (map3 == null || map3.isEmpty()) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                builder.appendQueryParameter(entry3.getKey(), entry3.getValue());
            }
        }
        return builder.build().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void tryToGetResponse(ResponseData responseData) {
        ActivityPackageSender activityPackageSender;
        ActivityPackageSender activityPackageSender2;
        ActivityPackageSender activityPackageSender3;
        ActivityPackageSender activityPackageSender4;
        ActivityPackageSender activityPackageSender5;
        ActivityPackageSender activityPackageSender6;
        ActivityPackageSender activityPackageSender7;
        ActivityPackageSender activityPackageSender8;
        ActivityPackageSender activityPackageSender9;
        String strGenerateUrlStringForPOST;
        String str = FpIL.lgLGLVMGrGq;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                String strExtractAuthorizationHeader = extractAuthorizationHeader(responseData.signedParameters);
                this.logger.verbose("authorizationHeader: %s", strExtractAuthorizationHeader);
                boolean z11 = true;
                boolean z12 = responseData.activityPackage.getActivityKind() == ActivityKind.ATTRIBUTION;
                try {
                    if (z12) {
                        ActivityPackageSender activityPackageSender10 = this;
                        strGenerateUrlStringForPOST = activityPackageSender10.generateUrlStringForGET(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                        activityPackageSender9 = activityPackageSender10;
                    } else {
                        activityPackageSender9 = this;
                        strGenerateUrlStringForPOST = generateUrlStringForPOST(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.signedParameters);
                    }
                    HttpsURLConnection httpsURLConnectionGenerateHttpsURLConnection = activityPackageSender9.httpsURLConnectionProvider.generateHttpsURLConnection(new URL(strGenerateUrlStringForPOST));
                    activityPackageSender9.connectionOptions.applyConnectionOptions(httpsURLConnectionGenerateHttpsURLConnection, activityPackageSender9.clientSdk, activityPackageSender9.connectionTimeout);
                    if (strExtractAuthorizationHeader != null) {
                        httpsURLConnectionGenerateHttpsURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, strExtractAuthorizationHeader);
                    }
                    DataOutputStream dataOutputStreamConfigConnectionForGET = z12 ? configConnectionForGET(httpsURLConnectionGenerateHttpsURLConnection) : configConnectionForPOST(httpsURLConnectionGenerateHttpsURLConnection, responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                    Integer connectionResponse = readConnectionResponse(httpsURLConnectionGenerateHttpsURLConnection, responseData);
                    responseData.success = responseData.jsonResponse != null && responseData.retryIn == null && connectionResponse != null && connectionResponse.intValue() == 200;
                    JSONObject jSONObject = responseData.jsonResponse;
                    if (jSONObject != null && responseData.retryIn == null) {
                        z11 = false;
                    }
                    responseData.willRetry = z11;
                    if (jSONObject == null) {
                        responseData.activityPackage.addError(1000);
                    } else if (responseData.retryIn != null) {
                        responseData.activityPackage.addError(1001);
                    }
                    if (dataOutputStreamConfigConnectionForGET != null) {
                        try {
                            dataOutputStreamConfigConnectionForGET.flush();
                            dataOutputStreamConfigConnectionForGET.close();
                        } catch (IOException e8) {
                            activityPackageSender9.logger.error(errorMessage(e8, str, responseData.activityPackage), new Object[0]);
                        }
                    }
                } catch (UnsupportedEncodingException e10) {
                    e = e10;
                    localError(e, "Failed to encode parameters", responseData, 1002);
                    str = str;
                    activityPackageSender8 = activityPackageSender7;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender7;
                            responseData = responseData;
                        } catch (IOException e11) {
                            String strErrorMessage = errorMessage(e11, str, responseData.activityPackage);
                            Object[] objArr = new Object[0];
                            activityPackageSender7.logger.error(strErrorMessage, objArr);
                            str = objArr;
                            activityPackageSender8 = activityPackageSender7;
                            responseData = strErrorMessage;
                        }
                    }
                } catch (MalformedURLException e12) {
                    e = e12;
                    localError(e, "Malformed URL", responseData, 1003);
                    str = str;
                    activityPackageSender8 = activityPackageSender6;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender6;
                            responseData = responseData;
                        } catch (IOException e13) {
                            String strErrorMessage2 = errorMessage(e13, str, responseData.activityPackage);
                            Object[] objArr2 = new Object[0];
                            activityPackageSender6.logger.error(strErrorMessage2, objArr2);
                            str = objArr2;
                            activityPackageSender8 = activityPackageSender6;
                            responseData = strErrorMessage2;
                        }
                    }
                } catch (ProtocolException e14) {
                    e = e14;
                    localError(e, "Protocol Error", responseData, 1004);
                    str = str;
                    activityPackageSender8 = activityPackageSender5;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender5;
                            responseData = responseData;
                        } catch (IOException e15) {
                            String strErrorMessage3 = errorMessage(e15, str, responseData.activityPackage);
                            Object[] objArr3 = new Object[0];
                            activityPackageSender5.logger.error(strErrorMessage3, objArr3);
                            str = objArr3;
                            activityPackageSender8 = activityPackageSender5;
                            responseData = strErrorMessage3;
                        }
                    }
                } catch (SocketTimeoutException e16) {
                    e = e16;
                    remoteError(e, "Request timed out", responseData, 1005);
                    str = str;
                    activityPackageSender8 = activityPackageSender4;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender4;
                            responseData = responseData;
                        } catch (IOException e17) {
                            String strErrorMessage4 = errorMessage(e17, str, responseData.activityPackage);
                            Object[] objArr4 = new Object[0];
                            activityPackageSender4.logger.error(strErrorMessage4, objArr4);
                            str = objArr4;
                            activityPackageSender8 = activityPackageSender4;
                            responseData = strErrorMessage4;
                        }
                    }
                } catch (SSLHandshakeException e18) {
                    e = e18;
                    remoteError(e, "Certificate failed", responseData, 1006);
                    str = str;
                    activityPackageSender8 = activityPackageSender3;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender3;
                            responseData = responseData;
                        } catch (IOException e19) {
                            String strErrorMessage5 = errorMessage(e19, str, responseData.activityPackage);
                            Object[] objArr5 = new Object[0];
                            activityPackageSender3.logger.error(strErrorMessage5, objArr5);
                            str = objArr5;
                            activityPackageSender8 = activityPackageSender3;
                            responseData = strErrorMessage5;
                        }
                    }
                } catch (IOException e21) {
                    e = e21;
                    remoteError(e, "Request failed", responseData, 1007);
                    str = str;
                    activityPackageSender8 = activityPackageSender2;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender2;
                            responseData = responseData;
                        } catch (IOException e22) {
                            String strErrorMessage6 = errorMessage(e22, str, responseData.activityPackage);
                            Object[] objArr6 = new Object[0];
                            activityPackageSender2.logger.error(strErrorMessage6, objArr6);
                            str = objArr6;
                            activityPackageSender8 = activityPackageSender2;
                            responseData = strErrorMessage6;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    localError(th, "Sending SDK package", responseData, ErrorCodes.THROWABLE);
                    str = str;
                    activityPackageSender8 = activityPackageSender;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender;
                            responseData = responseData;
                        } catch (IOException e23) {
                            String strErrorMessage7 = errorMessage(e23, str, responseData.activityPackage);
                            Object[] objArr7 = new Object[0];
                            activityPackageSender.logger.error(strErrorMessage7, objArr7);
                            str = objArr7;
                            activityPackageSender8 = activityPackageSender;
                            responseData = strErrorMessage7;
                        }
                    }
                }
            } catch (Throwable th3) {
                if (0 == 0) {
                    throw th3;
                }
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    throw th3;
                } catch (IOException e24) {
                    activityPackageSender8.logger.error(errorMessage(e24, str, responseData.activityPackage), new Object[0]);
                    throw th3;
                }
            }
        } catch (UnsupportedEncodingException e25) {
            e = e25;
            activityPackageSender7 = this;
        } catch (MalformedURLException e26) {
            e = e26;
            activityPackageSender6 = this;
        } catch (ProtocolException e27) {
            e = e27;
            activityPackageSender5 = this;
        } catch (SocketTimeoutException e28) {
            e = e28;
            activityPackageSender4 = this;
        } catch (SSLHandshakeException e29) {
            e = e29;
            activityPackageSender3 = this;
        } catch (IOException e30) {
            e = e30;
            activityPackageSender2 = this;
        } catch (Throwable th4) {
            th = th4;
            activityPackageSender = this;
        }
    }
}
