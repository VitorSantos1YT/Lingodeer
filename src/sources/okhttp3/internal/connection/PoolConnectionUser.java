package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.m;
import okhttp3.Connection;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Route;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class PoolConnectionUser implements ConnectionUser {
    static {
        new PoolConnectionUser();
    }

    private PoolConnectionUser() {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void a(RealConnection connection) {
        m.f(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean b() {
        return false;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final boolean d() {
        return false;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void e(RealConnection connection) {
        m.f(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void f(Route route, Protocol protocol) {
        m.f(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void l(Route route, IOException iOException) {
        m.f(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void m(HttpUrl url) {
        m.f(url, "url");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void n(HttpUrl url, List list) {
        m.f(url, "url");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final Socket p() {
        return null;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final RealConnection r() {
        return null;
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void t(Connection connection, Route route) {
        m.f(connection, "connection");
        m.f(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void u(Route route) {
        m.f(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void v(Connection connection) {
        m.f(connection, "connection");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void w(Route route) {
        m.f(route, "route");
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void o() {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void c(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void g(String str) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void h(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void j(Handshake handshake) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void k(ConnectPlan connectPlan) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void q(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void s(RealConnection realConnection) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void x(ConnectPlan connectPlan) {
    }

    @Override // okhttp3.internal.connection.ConnectionUser
    public final void i(String str, List list) {
    }
}
