package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class FailedPlan implements RoutePlanner.Plan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoutePlanner.ConnectResult f45268a;

    public FailedPlan(Throwable th2) {
        this.f45268a = new RoutePlanner.ConnectResult(this, null, th2, 2);
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RealConnection b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.Plan c() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult d() {
        return this.f45268a;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final boolean f() {
        return false;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public final RoutePlanner.ConnectResult g() {
        return this.f45268a;
    }
}
