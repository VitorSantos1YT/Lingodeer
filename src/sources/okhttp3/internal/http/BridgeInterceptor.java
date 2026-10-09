package okhttp3.internal.http;

import kotlin.jvm.internal.m;
import m00.b;
import m00.u;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BridgeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CookieJar f45338a;

    public BridgeInterceptor(CookieJar cookieJar) {
        m.f(cookieJar, "cookieJar");
        this.f45338a = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        ResponseBody responseBody;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f45349e;
        Request.Builder builderB = request.b();
        Headers headers = request.f45136c;
        HttpUrl httpUrl = request.f45134a;
        RequestBody requestBody = request.f45137d;
        if (requestBody != null) {
            MediaType mediaTypeContentType = requestBody.contentType();
            if (mediaTypeContentType != null) {
                builderB.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_TYPE, mediaTypeContentType.f45065a);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                builderB.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_LENGTH, String.valueOf(jContentLength));
                builderB.f45142c.e("Transfer-Encoding");
            } else {
                builderB.b("Transfer-Encoding", "chunked");
                builderB.f45142c.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z11 = false;
        if (headers.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.HOST) == null) {
            builderB.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.HOST, _UtilJvmKt.i(httpUrl, false));
        }
        if (headers.b("Connection") == null) {
            builderB.b("Connection", "Keep-Alive");
        }
        if (headers.b("Accept-Encoding") == null && headers.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.RANGE) == null) {
            builderB.b("Accept-Encoding", "gzip");
            z11 = true;
        }
        CookieJar cookieJar = this.f45338a;
        cookieJar.b(httpUrl);
        if (headers.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.USER_AGENT) == null) {
            builderB.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.USER_AGENT, "okhttp/5.1.0");
        }
        Request request2 = new Request(builderB);
        Response responseA = realInterceptorChain.a(request2);
        Headers headers2 = responseA.f45163f;
        HttpHeaders.d(cookieJar, request2.f45134a, headers2);
        Response.Builder builderA = responseA.a();
        builderA.f45165a = request2;
        if (z11) {
            String strB = headers2.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_ENCODING);
            if (strB == null) {
                strB = null;
            }
            if ("gzip".equalsIgnoreCase(strB) && HttpHeaders.a(responseA) && (responseBody = responseA.f45164t) != null) {
                u uVar = new u(responseBody.source());
                Headers.Builder builderE = headers2.e();
                builderE.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_ENCODING);
                builderE.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_LENGTH);
                builderA.c(builderE.d());
                String strB2 = headers2.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_TYPE);
                builderA.f45171g = new RealResponseBody(strB2 != null ? strB2 : null, -1L, b.c(uVar));
            }
        }
        return builderA.a();
    }
}
