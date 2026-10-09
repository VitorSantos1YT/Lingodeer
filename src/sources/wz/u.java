package wz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements vy.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f55547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f55548c;

    public u(Object obj, ThreadLocal threadLocal) {
        this.f55546a = obj;
        this.f55547b = threadLocal;
        this.f55548c = new v(threadLocal);
    }

    public final void a(Object obj) {
        this.f55547b.set(obj);
    }

    public final Object b(vy.i iVar) {
        ThreadLocal threadLocal = this.f55547b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f55546a);
        return obj;
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final vy.g get(vy.h hVar) {
        if (this.f55548c.equals(hVar)) {
            return this;
        }
        return null;
    }

    @Override // vy.g
    public final vy.h getKey() {
        return this.f55548c;
    }

    @Override // vy.i
    public final vy.i minusKey(vy.h hVar) {
        return this.f55548c.equals(hVar) ? vy.j.f54321a : this;
    }

    @Override // vy.i
    public final vy.i plus(vy.i iVar) {
        return ew.a.w(this, iVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f55546a + ", threadLocal = " + this.f55547b + ')';
    }
}
