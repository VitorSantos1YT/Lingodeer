package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import m00.j;
import m00.k;
import m00.k0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConnectInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConnectInterceptor f45239a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        ExchangeCodec http1ExchangeCodec;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.f45345a;
        synchronized (realCall) {
            try {
                if (!realCall.P) {
                    throw new IllegalStateException("released");
                }
                if (realCall.O) {
                    throw new IllegalStateException("Check failed.");
                }
                if (realCall.N) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ExchangeFinder exchangeFinder = realCall.H;
        m.c(exchangeFinder);
        RealConnection realConnectionA = exchangeFinder.a();
        OkHttpClient okHttpClient = realCall.f45278a;
        realConnectionA.getClass();
        int i11 = realInterceptorChain.f45351g;
        Socket socket = realConnectionA.f45293f;
        k kVar = realConnectionA.K;
        j jVar = realConnectionA.L;
        Http2Connection http2Connection = realConnectionA.O;
        if (http2Connection != null) {
            http1ExchangeCodec = new Http2ExchangeCodec(okHttpClient, realConnectionA, realInterceptorChain, http2Connection);
        } else {
            socket.setSoTimeout(i11);
            k0 k0VarTimeout = kVar.timeout();
            long j11 = i11;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            k0VarTimeout.g(j11, timeUnit);
            jVar.timeout().g(realInterceptorChain.f45352h, timeUnit);
            http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, realConnectionA, kVar, jVar);
        }
        Exchange exchange = new Exchange(realCall, realCall.f45281d, exchangeFinder, http1ExchangeCodec);
        realCall.M = exchange;
        realCall.R = exchange;
        synchronized (realCall) {
            realCall.N = true;
            realCall.O = true;
        }
        if (realCall.Q) {
            throw new IOException("Canceled");
        }
        return RealInterceptorChain.b(realInterceptorChain, 0, exchange, null, 61).a(realInterceptorChain.f45349e);
    }
}
