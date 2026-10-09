package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.ExperimentIds;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;
import com.google.android.datatransport.cct.internal.ExternalPrivacyContext;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.type.bACG.scNRoQgKSYX;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class CctTransportBackend implements TransportBackend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataEncoder f7811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f7812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f7814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Clock f7815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Clock f7816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7817g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class HttpRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f7818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BatchedLogRequest f7819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7820c;

        public HttpRequest(URL url, BatchedLogRequest batchedLogRequest, String str) {
            this.f7818a = url;
            this.f7819b = batchedLogRequest;
            this.f7820c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class HttpResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f7822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7823c;

        public HttpResponse(int i11, URL url, long j11) {
            this.f7821a = i11;
            this.f7822b = url;
            this.f7823c = j11;
        }
    }

    public CctTransportBackend(Context context, Clock clock, Clock clock2) {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoBatchedLogRequestEncoder.f7825a.a(jsonDataEncoderBuilder);
        jsonDataEncoderBuilder.f19633d = true;
        this.f7811a = jsonDataEncoderBuilder.a();
        this.f7813c = context;
        this.f7812b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7814d = c(CCTDestination.f7805c);
        this.f7815e = clock2;
        this.f7816f = clock;
        this.f7817g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException(ep.a.e("Invalid url: ", str), e8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.datatransport.cct.a] */
    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public final BackendResponse a(BackendRequest backendRequest) {
        int i11;
        String str;
        Object objA;
        LogEvent.Builder builderK;
        HashMap map = new HashMap();
        for (EventInternal eventInternal : backendRequest.b()) {
            String strL = eventInternal.l();
            if (map.containsKey(strL)) {
                ((List) map.get(strL)).add(eventInternal);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                map.put(strL, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (true) {
            i11 = 5;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder builderA = LogRequest.a();
            builderA.f(QosTier.DEFAULT);
            builderA.g(this.f7816f.a());
            builderA.h(this.f7815e.a());
            ClientInfo.Builder builderA2 = ClientInfo.a();
            builderA2.c(ClientInfo.ClientType.ANDROID_FIREBASE);
            AndroidClientInfo.Builder builderA3 = AndroidClientInfo.a();
            builderA3.m(Integer.valueOf(eventInternal2.i("sdk-version")));
            builderA3.j(eventInternal2.b("model"));
            builderA3.f(eventInternal2.b("hardware"));
            builderA3.d(eventInternal2.b("device"));
            builderA3.l(eventInternal2.b("product"));
            builderA3.k(eventInternal2.b(anrPHlQ.LAJtpf));
            builderA3.h(eventInternal2.b("manufacturer"));
            builderA3.e(eventInternal2.b("fingerprint"));
            builderA3.c(eventInternal2.b("country"));
            builderA3.g(eventInternal2.b("locale"));
            builderA3.i(eventInternal2.b("mcc_mnc"));
            builderA3.b(eventInternal2.b("application_build"));
            builderA2.b(builderA3.a());
            builderA.b(builderA2.a());
            try {
                builderA.d(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException unused) {
                builderA.e((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload encodedPayloadE = eventInternal3.e();
                Encoding encoding = encodedPayloadE.f8018a;
                byte[] bArr = encodedPayloadE.f8019b;
                if (encoding.equals(new Encoding("proto"))) {
                    builderK = LogEvent.k(bArr);
                } else if (encoding.equals(new Encoding("json"))) {
                    builderK = LogEvent.j(new String(bArr, Charset.forName(Constants.ENCODING)));
                } else if (Log.isLoggable(Logging.b("CctTransportBackend"), 5)) {
                    new StringBuilder("Received event of unsupported encoding ").append(encoding);
                }
                builderK.d(eventInternal3.f());
                builderK.e(eventInternal3.m());
                String str2 = (String) eventInternal3.c().get("tz-offset");
                builderK.h(str2 == null ? 0L : Long.valueOf(str2).longValue());
                NetworkConnectionInfo.Builder builderA4 = NetworkConnectionInfo.a();
                builderA4.c(NetworkConnectionInfo.NetworkType.a(eventInternal3.i("net-type")));
                builderA4.b(NetworkConnectionInfo.MobileSubtype.a(eventInternal3.i("mobile-subtype")));
                builderK.g(builderA4.a());
                if (eventInternal3.d() != null) {
                    builderK.c(eventInternal3.d());
                }
                if (eventInternal3.j() != null) {
                    ComplianceData.Builder builderA5 = ComplianceData.a();
                    ExternalPrivacyContext.Builder builderA6 = ExternalPrivacyContext.a();
                    ExternalPRequestContext.Builder builderA7 = ExternalPRequestContext.a();
                    builderA7.b(eventInternal3.j());
                    builderA6.b(builderA7.a());
                    builderA5.b(builderA6.a());
                    builderA5.c(ComplianceData.ProductIdOrigin.EVENT_OVERRIDE);
                    builderK.b(builderA5.a());
                }
                if (eventInternal3.g() != null || eventInternal3.h() != null) {
                    ExperimentIds.Builder builderA8 = ExperimentIds.a();
                    if (eventInternal3.g() != null) {
                        builderA8.b(eventInternal3.g());
                    }
                    if (eventInternal3.h() != null) {
                        builderA8.c(eventInternal3.h());
                    }
                    builderK.f(builderA8.a());
                }
                arrayList3.add(builderK.a());
            }
            builderA.c(arrayList3);
            arrayList2.add(builderA.a());
        }
        BatchedLogRequest batchedLogRequestA = BatchedLogRequest.a(arrayList2);
        byte[] bArrC = backendRequest.c();
        URL urlC = this.f7814d;
        if (bArrC != null) {
            try {
                CCTDestination cCTDestinationB = CCTDestination.b(backendRequest.c());
                str = cCTDestinationB.f7810b;
                if (str == null) {
                    str = null;
                }
                String str3 = cCTDestinationB.f7809a;
                if (str3 != null) {
                    urlC = c(str3);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.a();
            }
        } else {
            str = null;
        }
        try {
            HttpRequest httpRequest = new HttpRequest(urlC, batchedLogRequestA, str);
            ?? r9 = new Function() { // from class: com.google.android.datatransport.cct.a
                public final Object a(Object obj) {
                    CctTransportBackend.HttpRequest httpRequest2 = (CctTransportBackend.HttpRequest) obj;
                    URL url = httpRequest2.f7818a;
                    if (Log.isLoggable(Logging.b("CctTransportBackend"), 4)) {
                        String.format("Making request to: %s", url);
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(30000);
                    CctTransportBackend cctTransportBackend = this.f7824a;
                    httpURLConnection.setReadTimeout(cctTransportBackend.f7817g);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, "datatransport/3.3.0 android/");
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                    String str4 = httpRequest2.f7820c;
                    if (str4 != null) {
                        httpURLConnection.setRequestProperty("X-Goog-Api-Key", str4);
                    }
                    try {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                cctTransportBackend.f7811a.a(new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)), httpRequest2.f7819b);
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                Integer numValueOf = Integer.valueOf(responseCode);
                                if (Log.isLoggable(Logging.b("CctTransportBackend"), 4)) {
                                    String.format("Status Code: %d", numValueOf);
                                }
                                Logging.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_TYPE));
                                Logging.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
                                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                    return new CctTransportBackend.HttpResponse(responseCode, new URL(httpURLConnection.getHeaderField(HttpHeaders.LOCATION)), 0L);
                                }
                                if (responseCode != 200) {
                                    return new CctTransportBackend.HttpResponse(responseCode, null, 0L);
                                }
                                InputStream inputStream = httpURLConnection.getInputStream();
                                try {
                                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
                                        CctTransportBackend.HttpResponse httpResponse = new CctTransportBackend.HttpResponse(responseCode, null, LogResponse.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).b());
                                        if (gZIPInputStream != null) {
                                            gZIPInputStream.close();
                                        }
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        return httpResponse;
                                    } catch (Throwable th2) {
                                        if (gZIPInputStream != null) {
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                        }
                                    }
                                    throw th4;
                                }
                            } catch (Throwable th6) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                }
                                throw th6;
                            }
                        } catch (Throwable th8) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                            }
                            throw th8;
                        }
                    } catch (EncodingException | IOException unused3) {
                        Logging.b("CctTransportBackend");
                        return new CctTransportBackend.HttpResponse(400, null, 0L);
                    } catch (ConnectException | UnknownHostException unused4) {
                        Logging.b("CctTransportBackend");
                        return new CctTransportBackend.HttpResponse(500, null, 0L);
                    }
                }
            };
            do {
                objA = r9.a(httpRequest);
                URL url = ((HttpResponse) objA).f7822b;
                if (url != null) {
                    Logging.a("CctTransportBackend", "Following redirect to: %s", url);
                    httpRequest = new HttpRequest(url, httpRequest.f7819b, httpRequest.f7820c);
                } else {
                    httpRequest = null;
                }
                if (httpRequest == null) {
                    break;
                }
                i11--;
            } while (i11 >= 1);
            HttpResponse httpResponse = (HttpResponse) objA;
            int i12 = httpResponse.f7821a;
            if (i12 == 200) {
                return BackendResponse.e(httpResponse.f7823c);
            }
            if (i12 < 500 && i12 != 404) {
                return i12 == 400 ? BackendResponse.d() : BackendResponse.a();
            }
            return BackendResponse.f();
        } catch (IOException unused3) {
            Logging.b("CctTransportBackend");
            return BackendResponse.f();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public final EventInternal b(EventInternal eventInternal) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f7812b.getActiveNetworkInfo();
        EventInternal.Builder builderN = eventInternal.n();
        ((HashMap) builderN.c()).put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        builderN.a("model", Build.MODEL);
        builderN.a("hardware", Build.HARDWARE);
        builderN.a("device", Build.DEVICE);
        builderN.a("product", Build.PRODUCT);
        builderN.a("os-uild", Build.ID);
        builderN.a("manufacturer", Build.MANUFACTURER);
        builderN.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        builderN.c().put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        ((HashMap) builderN.c()).put("net-type", String.valueOf(activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.b() : activeNetworkInfo.getType()));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.b();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.b();
            } else if (NetworkConnectionInfo.MobileSubtype.a(subtype) == null) {
                subtype = 0;
            }
        }
        ((HashMap) builderN.c()).put(scNRoQgKSYX.DjzrWBsjd, String.valueOf(subtype));
        builderN.a("country", Locale.getDefault().getCountry());
        builderN.a("locale", Locale.getDefault().getLanguage());
        Context context = this.f7813c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = BuildConfig.VERSION_NAME;
        }
        builderN.a("mcc_mnc", simOperator);
        try {
            i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Logging.b("CctTransportBackend");
        }
        builderN.a("application_build", Integer.toString(i11));
        return builderN.b();
    }
}
