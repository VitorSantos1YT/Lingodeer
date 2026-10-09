package okhttp3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.m;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EventListener$Companion$NONE$1 f45029a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Factory {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.EventListener$Companion$NONE$1] */
    static {
        new Companion(0);
        f45029a = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
        };
    }

    public void a(Call call, Response cachedResponse) {
        m.f(call, "call");
        m.f(cachedResponse, "cachedResponse");
    }

    public void b(Call call, Response response) {
        m.f(call, "call");
    }

    public void g(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        m.f(inetSocketAddress, "inetSocketAddress");
    }

    public void h(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        m.f(inetSocketAddress, "inetSocketAddress");
    }

    public void i(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        m.f(inetSocketAddress, "inetSocketAddress");
    }

    public void j(Call call, Connection connection) {
        m.f(connection, "connection");
    }

    public void k(Call call, Connection connection) {
        m.f(connection, "connection");
    }

    public void n(Call call, HttpUrl url, List list) {
        m.f(url, "url");
    }

    public void o(Call call, HttpUrl url) {
        m.f(url, "url");
    }

    public void r(Call call, IOException ioe) {
        m.f(ioe, "ioe");
    }

    public void s(Call call, Request request) {
        m.f(request, "request");
    }

    public void w(Call call, IOException ioe) {
        m.f(ioe, "ioe");
    }

    public void z(Call call, Response response) {
        m.f(call, "call");
    }

    public void B(Call call) {
    }

    public void c(RealCall realCall) {
    }

    public void e(RealCall realCall) {
    }

    public void f(RealCall realCall) {
    }

    public void q(Call call) {
    }

    public void t(Call call) {
    }

    public void v(Call call) {
    }

    public void y(Call call) {
    }

    public void A(Call call, Handshake handshake) {
    }

    public void d(RealCall realCall, IOException iOException) {
    }

    public void m(Call call, String str) {
    }

    public void p(Call call, long j11) {
    }

    public void u(Call call, long j11) {
    }

    public void x(Call call, Response response) {
    }

    public void l(Call call, String str, List list) {
    }
}
