package okhttp3.internal.connection;

import kotlin.jvm.internal.m;
import okhttp3.Address;
import okhttp3.HttpUrl;
import ry.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ForceConnectRoutePlanner implements RoutePlanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealRoutePlanner f45277a;

    public ForceConnectRoutePlanner(RealRoutePlanner realRoutePlanner) {
        this.f45277a = realRoutePlanner;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a(RealConnection realConnection) {
        return this.f45277a.a(realConnection);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean b() {
        return this.f45277a.f45317l.b();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final Address c() {
        return this.f45277a.f45315j;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean d(HttpUrl url) {
        m.f(url, "url");
        return this.f45277a.d(url);
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final k e() {
        return this.f45277a.f45320p;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final RoutePlanner.Plan f() {
        return this.f45277a.g();
    }
}
