package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.m;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CallConnectionUser implements ConnectionUser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealCall f45236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionListener f45237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RealInterceptorChain f45238c;

    public CallConnectionUser(RealCall realCall, ConnectionListener connectionListener, RealInterceptorChain realInterceptorChain) {
        this.f45236a = realCall;
        this.f45237b = connectionListener;
        this.f45238c = realInterceptorChain;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void a(RealConnection connection) {
        m.f(connection, "connection");
        TimeZone timeZone = _UtilJvmKt.f45204a;
        RealCall realCall = this.f45236a;
        if (realCall.K != null) {
            throw new IllegalStateException("Check failed.");
        }
        realCall.K = connection;
        connection.V.add(new RealCall.CallReference(realCall, realCall.f45284t));
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean b() {
        return this.f45236a.Q;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void c(RealConnection realConnection) {
        realConnection.N.getClass();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean d() {
        return !m.a(this.f45238c.f45349e.f45135b, "GET");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void e(RealConnection connection) {
        m.f(connection, "connection");
        connection.N.getClass();
        RealCall call = this.f45236a;
        m.f(call, "call");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void f(Route route, Protocol protocol) {
        m.f(route, "route");
        RealCall realCall = this.f45236a;
        realCall.f45281d.g(realCall, route.f45187c, route.f45186b, protocol);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void g(String str) {
        RealCall realCall = this.f45236a;
        realCall.f45281d.m(realCall, str);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void h(RealConnection realConnection) {
        realConnection.N.getClass();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void i(String str, List list) {
        RealCall realCall = this.f45236a;
        realCall.f45281d.l(realCall, str, list);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void j(Handshake handshake) {
        RealCall realCall = this.f45236a;
        realCall.f45281d.A(realCall, handshake);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void k(ConnectPlan connectPlan) {
        this.f45236a.S.remove(connectPlan);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void l(Route route, IOException iOException) {
        m.f(route, "route");
        RealCall realCall = this.f45236a;
        realCall.f45281d.h(realCall, route.f45187c, route.f45186b, iOException);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void m(HttpUrl url) {
        m.f(url, "url");
        RealCall realCall = this.f45236a;
        realCall.f45281d.o(realCall, url);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void n(HttpUrl url, List list) {
        m.f(url, "url");
        RealCall realCall = this.f45236a;
        realCall.f45281d.n(realCall, url, list);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void o() {
        RealCall realCall = this.f45236a;
        realCall.f45281d.B(realCall);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final Socket p() {
        return this.f45236a.i();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void q(RealConnection realConnection) {
        realConnection.N.getClass();
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final RealConnection r() {
        return this.f45236a.K;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void s(RealConnection realConnection) {
        RealCall realCall = this.f45236a;
        realCall.f45281d.k(realCall, realConnection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void t(Connection connection, Route route) {
        m.f(connection, "connection");
        m.f(route, "route");
        this.f45237b.getClass();
        RealCall call = this.f45236a;
        m.f(call, "call");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void u(Route route) {
        m.f(route, "route");
        RouteDatabase routeDatabase = this.f45236a.f45278a.B;
        synchronized (routeDatabase) {
            routeDatabase.f45322a.remove(route);
        }
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void v(Connection connection) {
        m.f(connection, "connection");
        RealCall realCall = this.f45236a;
        realCall.f45281d.j(realCall, connection);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void w(Route route) {
        m.f(route, "route");
        RealCall realCall = this.f45236a;
        realCall.f45281d.i(realCall, route.f45187c, route.f45186b);
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void x(ConnectPlan connectPlan) {
        this.f45236a.S.add(connectPlan);
    }
}
