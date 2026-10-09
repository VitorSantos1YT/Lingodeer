package okhttp3.internal.http;

import cf.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.m;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.CallConnectionUser;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.FastFallbackExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.SequentialExchangeFinder;
import okhttp3.internal.http2.ConnectionShutdownException;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f45358a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        this.f45358a = okHttpClient;
    }

    public static int c(Response response, int i11) {
        String strB = response.f45163f.b("Retry-After");
        if (strB == null) {
            strB = null;
        }
        if (strB == null) {
            return i11;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        m.e(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strB).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        m.e(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:110:0x014e  */
    /* JADX WARN: Code duplicated, block: B:113:0x016b  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    public final Request a(Response response, Exchange exchange) throws ProtocolException {
        OkHttpClient okHttpClient;
        String strB;
        Request request;
        HttpUrl.Builder builderG;
        HttpUrl httpUrlA;
        Request.Builder builderB;
        boolean z11;
        RequestBody requestBody;
        Response response2;
        Route route = exchange != null ? exchange.b().f45291d : null;
        int i11 = response.f45161d;
        Request request2 = response.f45158a;
        String str = request2.f45135b;
        if (i11 == 307 || i11 == 308) {
            okHttpClient = this.f45358a;
            if (okHttpClient.f45091h) {
                strB = response.f45163f.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.LOCATION);
                if (strB == null) {
                    strB = null;
                }
                request = response.f45158a;
                if (strB != null) {
                    HttpUrl httpUrl = request.f45134a;
                    httpUrl.getClass();
                    builderG = httpUrl.g(strB);
                    if (builderG != null) {
                        httpUrlA = builderG.a();
                    } else {
                        httpUrlA = null;
                    }
                    if (httpUrlA != null && (m.a(httpUrlA.f45045a, request.f45134a.f45045a) || okHttpClient.f45092i)) {
                        builderB = request.b();
                        if (HttpMethod.a(str)) {
                            int i12 = response.f45161d;
                            HttpMethod.f45344a.getClass();
                            z11 = !str.equals("PROPFIND") || i12 == 308 || i12 == 307;
                            if (!str.equals("PROPFIND") || i12 == 308 || i12 == 307) {
                                builderB.c(str, z11 ? request.f45137d : null);
                            } else {
                                builderB.c("GET", null);
                            }
                            if (!z11) {
                                builderB.f45142c.e("Transfer-Encoding");
                                builderB.f45142c.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_LENGTH);
                                builderB.f45142c.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_TYPE);
                            }
                        }
                        if (!_UtilJvmKt.a(request.f45134a, httpUrlA)) {
                            builderB.f45142c.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.AUTHORIZATION);
                        }
                        builderB.f45140a = httpUrlA;
                        return new Request(builderB);
                    }
                }
            }
        } else {
            if (i11 == 401) {
                return this.f45358a.f45090g.a(route, response);
            }
            if (i11 == 421) {
                RequestBody requestBody2 = request2.f45137d;
                if ((requestBody2 == null || !requestBody2.isOneShot()) && exchange != null && !m.a(exchange.f45253c.b().c().f44940i.f45048d, exchange.f45254d.h().h().f45185a.f44940i.f45048d)) {
                    RealConnection realConnectionB = exchange.b();
                    synchronized (realConnectionB) {
                        realConnectionB.Q = true;
                    }
                    return response.f45158a;
                }
            } else if (i11 == 503) {
                Response response3 = response.L;
                if ((response3 == null || response3.f45161d != 503) && c(response, Integer.MAX_VALUE) == 0) {
                    return response.f45158a;
                }
            } else {
                if (i11 == 407) {
                    m.c(route);
                    if (route.f45186b.type() == Proxy.Type.HTTP) {
                        return this.f45358a.f45096n.a(route, response);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (i11 != 408) {
                    switch (i11) {
                        case NOTICE_VALUE:
                        case 301:
                        case 302:
                        case 303:
                            okHttpClient = this.f45358a;
                            if (okHttpClient.f45091h) {
                                strB = response.f45163f.b(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.LOCATION);
                                if (strB == null) {
                                    strB = null;
                                }
                                request = response.f45158a;
                                if (strB != null) {
                                    HttpUrl httpUrl2 = request.f45134a;
                                    httpUrl2.getClass();
                                    builderG = httpUrl2.g(strB);
                                    if (builderG != null) {
                                        httpUrlA = builderG.a();
                                    } else {
                                        httpUrlA = null;
                                    }
                                    if (httpUrlA != null) {
                                        builderB = request.b();
                                        if (HttpMethod.a(str)) {
                                            int i13 = response.f45161d;
                                            HttpMethod.f45344a.getClass();
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                builderB.c(str, z11 ? request.f45137d : null);
                                            } else {
                                                builderB.c(str, z11 ? request.f45137d : null);
                                            }
                                            if (!z11) {
                                                builderB.f45142c.e("Transfer-Encoding");
                                                builderB.f45142c.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_LENGTH);
                                                builderB.f45142c.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.CONTENT_TYPE);
                                            }
                                        }
                                        if (!_UtilJvmKt.a(request.f45134a, httpUrlA)) {
                                            builderB.f45142c.e(com.alibaba.sdk.android.oss.common.utils.HttpHeaders.AUTHORIZATION);
                                        }
                                        builderB.f45140a = httpUrlA;
                                        return new Request(builderB);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (this.f45358a.f45088e && (((requestBody = request2.f45137d) == null || !requestBody.isOneShot()) && (((response2 = response.L) == null || response2.f45161d != 408) && c(response, 0) <= 0))) {
                    return response.f45158a;
                }
            }
        }
        return null;
    }

    public final boolean b(IOException iOException, RealCall realCall, Request request) {
        RequestBody requestBody;
        boolean z11 = iOException instanceof ConnectionShutdownException;
        if (!this.f45358a.f45088e) {
            return false;
        }
        if ((!z11 && (((requestBody = request.f45137d) != null && requestBody.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z11) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        Exchange exchange = realCall.R;
        if (exchange == null || !exchange.f45256f) {
            return false;
        }
        ExchangeFinder exchangeFinder = realCall.H;
        m.c(exchangeFinder);
        RoutePlanner routePlannerB = exchangeFinder.b();
        Exchange exchange2 = realCall.R;
        return routePlannerB.a(exchange2 != null ? exchange2.b() : null);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Throwable {
        boolean z11;
        boolean z12;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f45349e;
        RealCall realCall = realInterceptorChain.f45345a;
        List suppressed = r.f50854a;
        Response responseA = null;
        int i11 = 0;
        Request request2 = request;
        while (true) {
            boolean z13 = true;
            while (true) {
                m.f(request2, "request");
                if (realCall.M != null) {
                    throw new IllegalStateException("Check failed.");
                }
                synchronized (realCall) {
                    try {
                        if (realCall.O) {
                            throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                        }
                        if (realCall.N) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z13) {
                    OkHttpClient okHttpClient = realCall.f45278a;
                    TaskRunner taskRunner = okHttpClient.C;
                    RealConnectionPool realConnectionPool = realCall.f45280c;
                    int i12 = okHttpClient.f45106x;
                    int i13 = okHttpClient.f45107y;
                    int i14 = realInterceptorChain.f45350f;
                    int i15 = realInterceptorChain.f45351g;
                    boolean z14 = okHttpClient.f45088e;
                    boolean z15 = okHttpClient.f45089f;
                    HttpUrl url = request2.f45134a;
                    m.f(url, "url");
                    if (url.f()) {
                        SSLSocketFactory sSLSocketFactory2 = okHttpClient.f45098p;
                        if (sSLSocketFactory2 == null) {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                        HostnameVerifier hostnameVerifier2 = okHttpClient.f45102t;
                        certificatePinner = okHttpClient.f45103u;
                        sSLSocketFactory = sSLSocketFactory2;
                        hostnameVerifier = hostnameVerifier2;
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        certificatePinner = null;
                    }
                    RealRoutePlanner realRoutePlanner = new RealRoutePlanner(taskRunner, realConnectionPool, i12, i13, i14, i15, 0, z14, z15, new Address(url.f45048d, url.f45049e, okHttpClient.f45094k, okHttpClient.f45097o, sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.f45096n, okHttpClient.f45095l, okHttpClient.f45101s, okHttpClient.f45100r, okHttpClient.m), realCall.f45278a.B, new CallConnectionUser(realCall, realCall.f45280c.f45297b, realInterceptorChain));
                    OkHttpClient okHttpClient2 = realCall.f45278a;
                    realCall.H = okHttpClient2.f45089f ? new FastFallbackExchangeFinder(realRoutePlanner, okHttpClient2.C) : new SequentialExchangeFinder(realRoutePlanner);
                }
                try {
                    if (realCall.Q) {
                        z11 = true;
                        try {
                            throw new IOException("Canceled");
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        try {
                            try {
                            } catch (IOException e8) {
                                boolean zB = b(e8, realCall, request2);
                                realCall.f45281d.getClass();
                                if (!zB) {
                                    byte[] bArr = _UtilCommonKt.f45202a;
                                    m.f(suppressed, "suppressed");
                                    Iterator it = suppressed.iterator();
                                    while (it.hasNext()) {
                                        x.b(e8, (Exception) it.next());
                                    }
                                    throw e8;
                                }
                                suppressed = ry.m.G0(e8, suppressed);
                                realCall.d(true);
                                z13 = false;
                                z12 = z11;
                                realCall.d(z12);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z12 = true;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z11 = true;
                }
                z12 = z11;
                realCall.d(z12);
                throw th;
            }
            Response.Builder builderA = realInterceptorChain.a(request2).a();
            builderA.f45165a = request2;
            builderA.f45174j = responseA != null ? UnreadableResponseBodyKt.a(responseA) : null;
            responseA = builderA.a();
            Exchange exchange = realCall.M;
            request2 = a(responseA, exchange);
            try {
                if (request2 == null) {
                    if (exchange != null && exchange.f45255e) {
                        if (realCall.L) {
                            throw new IllegalStateException("Check failed.");
                        }
                        realCall.L = true;
                        realCall.f45282e.i();
                    }
                    realCall.f45281d.getClass();
                    EventListener$Companion$NONE$1 eventListener$Companion$NONE$1 = EventListener.f45029a;
                    realCall.d(false);
                    return responseA;
                }
                RequestBody requestBody = request2.f45137d;
                if (requestBody != null && requestBody.isOneShot()) {
                    realCall.f45281d.getClass();
                    EventListener$Companion$NONE$1 eventListener$Companion$NONE$2 = EventListener.f45029a;
                    realCall.d(false);
                    return responseA;
                }
                _UtilCommonKt.b(responseA.f45164t);
                i11++;
                if (i11 > 20) {
                    realCall.f45281d.getClass();
                    EventListener$Companion$NONE$1 eventListener$Companion$NONE$3 = EventListener.f45029a;
                    throw new ProtocolException("Too many follow-up requests: " + i11);
                }
                realCall.f45281d.getClass();
                EventListener$Companion$NONE$1 eventListener$Companion$NONE$4 = EventListener.f45029a;
                realCall.d(true);
            } catch (Throwable th6) {
                th = th6;
                z12 = false;
            }
        }
    }
}
