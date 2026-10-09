package okhttp3.internal.http;

import cf.x;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.m;
import m00.b;
import m00.c0;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.TrailersSource;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CallServerInterceptor implements Interceptor {

    /* JADX INFO: renamed from: okhttp3.internal.http.CallServerInterceptor$intercept$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class AnonymousClass1 implements TrailersSource {
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0169 A[Catch: IOException -> 0x00e6, TryCatch #3 {IOException -> 0x00e6, blocks: (B:58:0x00d8, B:60:0x00e1, B:63:0x00e9, B:71:0x010e, B:73:0x0117, B:74:0x011a, B:75:0x0133, B:77:0x0159, B:81:0x0163, B:88:0x0178, B:91:0x0185, B:92:0x01a9, B:83:0x0169), top: B:104:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b2 A[ADDED_TO_REGION, REMOVE] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Throwable {
        Response.Builder builderD;
        IOException iOException;
        boolean z11;
        Response responseA;
        int i11;
        boolean z12;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.f45348d;
        m.c(exchange);
        ExchangeCodec exchangeCodec = exchange.f45254d;
        EventListener eventListener = exchange.f45252b;
        RealCall realCall = exchange.f45251a;
        Request request = realInterceptorChain.f45349e;
        RequestBody requestBody = request.f45137d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z13 = true;
        String str = null;
        try {
            try {
                eventListener.t(realCall);
                exchangeCodec.b(request);
                eventListener.s(realCall, request);
                if (!HttpMethod.a(request.f45135b) || requestBody == null) {
                    realCall.g(exchange, true, false, null);
                    builderD = null;
                } else {
                    if ("100-continue".equalsIgnoreCase(request.f45136c.b("Expect"))) {
                        try {
                            exchangeCodec.f();
                            builderD = exchange.d(true);
                            try {
                                eventListener.y(realCall);
                                z12 = false;
                            } catch (IOException e8) {
                                e = e8;
                                if (e instanceof ConnectionShutdownException) {
                                    throw e;
                                }
                                throw e;
                            }
                        } catch (IOException e10) {
                            eventListener.r(realCall, e10);
                            exchange.e(e10);
                            throw e10;
                        }
                    } else {
                        z12 = true;
                        builderD = null;
                    }
                    try {
                        if (builderD != null) {
                            realCall.g(exchange, true, false, null);
                            if (exchange.b().O == null) {
                                z13 = false;
                            }
                            if (!z13) {
                                exchangeCodec.h().e();
                            }
                        } else if (requestBody.isDuplex()) {
                            try {
                                exchangeCodec.f();
                                requestBody.writeTo(b.b(exchange.a(request, true)));
                            } catch (IOException e11) {
                                eventListener.r(realCall, e11);
                                exchange.e(e11);
                                throw e11;
                            }
                        } else {
                            c0 c0VarB = b.b(exchange.a(request, false));
                            requestBody.writeTo(c0VarB);
                            c0VarB.close();
                        }
                        z13 = z12;
                    } catch (IOException e12) {
                        e = e12;
                        z13 = z12;
                        if ((e instanceof ConnectionShutdownException) || !exchange.f45256f) {
                            throw e;
                        }
                        boolean z14 = z13;
                        iOException = e;
                        z11 = z14;
                    }
                }
                if (requestBody == null || !requestBody.isDuplex()) {
                    try {
                        exchangeCodec.a();
                    } catch (IOException e13) {
                        eventListener.r(realCall, e13);
                        exchange.e(e13);
                        throw e13;
                    }
                }
                z11 = z13;
                iOException = null;
                while (true) {
                    if (i11 != 100 && (102 > i11 || i11 >= 200)) {
                        break;
                    }
                    Response.Builder builderD2 = exchange.d(false);
                    m.c(builderD2);
                    if (z11) {
                        eventListener.y(realCall);
                    }
                    builderD2.f45165a = request;
                    builderD2.f45169e = exchange.b().f45294t;
                    builderD2.f45175k = jCurrentTimeMillis;
                    builderD2.f45176l = System.currentTimeMillis();
                    responseA = builderD2.a();
                    i11 = responseA.f45161d;
                }
            } catch (IOException e14) {
                eventListener.r(realCall, e14);
                exchange.e(e14);
                throw e14;
            }
        } catch (IOException e15) {
            e = e15;
            builderD = null;
            if (e instanceof ConnectionShutdownException) {
                throw e;
            }
            throw e;
        }
        if (builderD == null) {
            try {
                builderD = exchange.d(false);
                m.c(builderD);
                if (z11) {
                    eventListener.y(realCall);
                    z11 = false;
                }
            } catch (IOException e16) {
                if (iOException == null) {
                    throw e16;
                }
                x.b(iOException, e16);
                throw iOException;
            }
        }
        builderD.f45165a = request;
        builderD.f45169e = exchange.b().f45294t;
        builderD.f45175k = jCurrentTimeMillis;
        builderD.f45176l = System.currentTimeMillis();
        responseA = builderD.a();
        i11 = responseA.f45161d;
        eventListener.x(realCall, responseA);
        RealResponseBody realResponseBodyC = exchange.c(responseA);
        Response.Builder builderA = responseA.a();
        builderA.f45171g = realResponseBodyC;
        builderA.f45177n = new AnonymousClass1();
        Response responseA2 = builderA.a();
        if ("close".equalsIgnoreCase(responseA2.f45158a.f45136c.b("Connection"))) {
            exchangeCodec.h().e();
        } else {
            String strB = responseA2.f45163f.b("Connection");
            if (strB != null) {
                str = strB;
            }
            if ("close".equalsIgnoreCase(str)) {
                exchangeCodec.h().e();
            }
        }
        if ((i11 != 204 && i11 != 205) || responseA2.f45164t.contentLength() <= 0) {
            return responseA2;
        }
        throw new ProtocolException("HTTP " + i11 + " had non-zero Content-Length: " + responseA2.f45164t.contentLength());
    }
}
