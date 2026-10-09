package y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements vy.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final re.q f57461b = new re.q(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f57462a;

    public a(s connectionWrapper) {
        kotlin.jvm.internal.m.f(connectionWrapper, "connectionWrapper");
        this.f57462a = connectionWrapper;
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final vy.g get(vy.h hVar) {
        return ew.a.m(this, hVar);
    }

    @Override // vy.g
    public final vy.h getKey() {
        return f57461b;
    }

    @Override // vy.i
    public final vy.i minusKey(vy.h hVar) {
        return ew.a.s(this, hVar);
    }

    @Override // vy.i
    public final vy.i plus(vy.i iVar) {
        return ew.a.w(this, iVar);
    }
}
