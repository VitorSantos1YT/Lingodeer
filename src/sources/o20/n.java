package o20;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f44536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f44537b;

    public n(Executor executor, e eVar) {
        this.f44536a = executor;
        this.f44537b = eVar;
    }

    @Override // o20.e
    public final void H0(h hVar) {
        this.f44537b.H0(new ob.u(this, hVar, false, 23));
    }

    @Override // o20.e
    public final boolean b() {
        return this.f44537b.b();
    }

    @Override // o20.e
    public final void cancel() {
        this.f44537b.cancel();
    }

    @Override // o20.e
    public final Request e() {
        return this.f44537b.e();
    }

    @Override // o20.e
    public final e clone() {
        return new n(this.f44536a, this.f44537b.clone());
    }
}
