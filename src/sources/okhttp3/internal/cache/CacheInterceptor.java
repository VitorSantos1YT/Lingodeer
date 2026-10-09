package okhttp3.internal.cache;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import kotlin.jvm.internal.m;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CacheInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f45208a = new Companion(0);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static boolean a(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }

        private Companion() {
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.f45345a;
        System.currentTimeMillis();
        Request request = realInterceptorChain.f45349e;
        m.f(request, "request");
        CacheStrategy cacheStrategy = new CacheStrategy(request, null);
        if (request.a().f44958j) {
            cacheStrategy = new CacheStrategy(null, null);
        }
        EventListener eventListener = realCall.f45281d;
        if (eventListener == null) {
            eventListener = EventListener.f45029a;
        }
        Request request2 = cacheStrategy.f45210a;
        Response response = cacheStrategy.f45211b;
        if (request2 == null && response == null) {
            Response.Builder builder = new Response.Builder();
            Request request3 = realInterceptorChain.f45349e;
            m.f(request3, "request");
            builder.f45165a = request3;
            Protocol protocol = Protocol.HTTP_1_1;
            m.f(protocol, "protocol");
            builder.f45166b = protocol;
            builder.f45167c = 504;
            builder.f45168d = "Unsatisfiable Request (only-if-cached)";
            builder.f45175k = -1L;
            builder.f45176l = System.currentTimeMillis();
            Response responseA = builder.a();
            eventListener.z(realCall, responseA);
            return responseA;
        }
        if (request2 == null) {
            m.c(response);
            Response.Builder builderA = response.a();
            Response responseA2 = UnreadableResponseBodyKt.a(response);
            Response.Builder.b("cacheResponse", responseA2);
            builderA.f45173i = responseA2;
            Response responseA3 = builderA.a();
            eventListener.b(realCall, responseA3);
            return responseA3;
        }
        if (response != null) {
            eventListener.a(realCall, response);
        }
        Response responseA4 = realInterceptorChain.a(request2);
        if (response != null) {
            if (responseA4.f45161d == 304) {
                Response.Builder builderA2 = response.a();
                Headers headers = response.f45163f;
                Headers headers2 = responseA4.f45163f;
                f45208a.getClass();
                Headers.Builder builder2 = new Headers.Builder();
                int size = headers.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String strD = headers.d(i11);
                    String strG = headers.g(i11);
                    if ((!"Warning".equalsIgnoreCase(strD) || !x.s0(strG, "1", false)) && (HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strD) || HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strD) || HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strD) || !Companion.a(strD) || headers2.b(strD) == null)) {
                        builder2.b(strD, strG);
                    }
                }
                int size2 = headers2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    String strD2 = headers2.d(i12);
                    if (!HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strD2) && !HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strD2) && !HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strD2) && Companion.a(strD2)) {
                        builder2.b(strD2, headers2.g(i12));
                    }
                }
                builderA2.c(builder2.d());
                builderA2.f45175k = responseA4.M;
                builderA2.f45176l = responseA4.N;
                Response responseA5 = UnreadableResponseBodyKt.a(response);
                Response.Builder.b("cacheResponse", responseA5);
                builderA2.f45173i = responseA5;
                Response responseA6 = UnreadableResponseBodyKt.a(responseA4);
                Response.Builder.b("networkResponse", responseA6);
                builderA2.f45172h = responseA6;
                builderA2.a();
                responseA4.f45164t.close();
                m.c(null);
                throw null;
            }
            _UtilCommonKt.b(response.f45164t);
        }
        Response.Builder builderA3 = responseA4.a();
        Response responseA7 = response != null ? UnreadableResponseBodyKt.a(response) : null;
        Response.Builder.b("cacheResponse", responseA7);
        builderA3.f45173i = responseA7;
        Response responseA8 = UnreadableResponseBodyKt.a(responseA4);
        Response.Builder.b("networkResponse", responseA8);
        builderA3.f45172h = responseA8;
        return builderA3.a();
    }
}
