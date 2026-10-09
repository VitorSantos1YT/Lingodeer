package okhttp3.logging;

import bw.ORXQ.ADSb;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LoggingEventListener extends EventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45589b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Factory implements EventListener.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpLoggingInterceptor.Logger f45590a;

        public Factory() {
            HttpLoggingInterceptor.Logger logger = HttpLoggingInterceptor.Logger.f45587a;
            m.f(logger, "logger");
            this.f45590a = logger;
        }
    }

    static {
        new Companion(0);
    }

    @Override // okhttp3.EventListener
    public final void A(Call call, Handshake handshake) {
        C("secureConnectEnd: " + handshake);
    }

    @Override // okhttp3.EventListener
    public final void B(Call call) {
        C("secureConnectStart");
    }

    public final void C(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f45589b);
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(millis);
        sb2.append(" ms] ");
        sb2.append(str);
        throw null;
    }

    @Override // okhttp3.EventListener
    public final void a(Call call, Response cachedResponse) {
        m.f(call, "call");
        m.f(cachedResponse, "cachedResponse");
        C("cacheConditionalHit: " + cachedResponse);
    }

    @Override // okhttp3.EventListener
    public final void b(Call call, Response response) {
        m.f(call, "call");
        C("cacheHit: " + response);
    }

    @Override // okhttp3.EventListener
    public final void c(RealCall realCall) {
        C("callEnd");
    }

    @Override // okhttp3.EventListener
    public final void d(RealCall realCall, IOException iOException) {
        C("callFailed: " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void e(RealCall realCall) {
        this.f45589b = System.nanoTime();
        C("callStart: " + realCall.f45279b);
    }

    @Override // okhttp3.EventListener
    public final void f(RealCall realCall) {
        C("canceled");
    }

    @Override // okhttp3.EventListener
    public final void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        m.f(inetSocketAddress, "inetSocketAddress");
        C("connectEnd: " + protocol);
    }

    @Override // okhttp3.EventListener
    public final void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        m.f(inetSocketAddress, "inetSocketAddress");
        C("connectFailed: null " + iOException);
    }

    @Override // okhttp3.EventListener
    public final void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        m.f(inetSocketAddress, "inetSocketAddress");
        C("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public final void j(Call call, Connection connection) {
        m.f(connection, "connection");
        C("connectionAcquired: " + connection);
    }

    @Override // okhttp3.EventListener
    public final void k(Call call, Connection connection) {
        m.f(connection, "connection");
        C("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public final void l(Call call, String str, List list) {
        C("dnsEnd: " + list);
    }

    @Override // okhttp3.EventListener
    public final void m(Call call, String str) {
        C("dnsStart: ".concat(str));
    }

    @Override // okhttp3.EventListener
    public final void o(Call call, HttpUrl url) {
        m.f(url, "url");
        C("proxySelectStart: " + url);
    }

    @Override // okhttp3.EventListener
    public final void p(Call call, long j11) {
        C("requestBodyEnd: byteCount=" + j11);
    }

    @Override // okhttp3.EventListener
    public final void r(Call call, IOException ioe) {
        m.f(ioe, "ioe");
        C("requestFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void s(Call call, Request request) {
        m.f(request, "request");
        C("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public final void t(Call call) {
        C("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void u(Call call, long j11) {
        C("responseBodyEnd: byteCount=" + j11);
    }

    @Override // okhttp3.EventListener
    public final void v(Call call) {
        C("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void w(Call call, IOException ioe) {
        m.f(ioe, "ioe");
        C("responseFailed: " + ioe);
    }

    @Override // okhttp3.EventListener
    public final void x(Call call, Response response) {
        C("responseHeadersEnd: " + response);
    }

    @Override // okhttp3.EventListener
    public final void y(Call call) {
        C("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void z(Call call, Response response) {
        m.f(call, "call");
        C("satisfactionFailure: " + response);
    }

    @Override // okhttp3.EventListener
    public final void n(Call call, HttpUrl url, List list) {
        m.f(url, "url");
        C(ADSb.XPqvykk + list);
    }

    @Override // okhttp3.EventListener
    public final void q(Call call) {
        C(OYAvlbfUyD.nBvyOlpkZGkfzO);
    }
}
