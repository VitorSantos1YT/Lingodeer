package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements rz.b0, tz.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tz.h f43739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f43740b;

    public y1(rz.b0 scope, tz.h hVar) {
        kotlin.jvm.internal.m.f(scope, "scope");
        this.f43739a = hVar;
        this.f43740b = scope;
    }

    @Override // tz.w
    public final Object f(Object obj, vy.d dVar) {
        return this.f43739a.f(obj, dVar);
    }

    @Override // rz.b0
    public final vy.i getCoroutineContext() {
        return this.f43740b.getCoroutineContext();
    }

    @Override // tz.w
    public final Object i(Object obj) {
        return this.f43739a.i(obj);
    }
}
