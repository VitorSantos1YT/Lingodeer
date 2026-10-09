package l1;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements f2, CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy.i f39479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.e f39480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wz.d f39481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rz.z1 f39482d;

    public u0(vy.i iVar, fz.e eVar) {
        this.f39479a = iVar;
        this.f39480b = eVar;
        this.f39481c = rz.e0.c(iVar.plus(this));
    }

    @Override // l1.f2
    public final void a() {
        rz.z1 z1Var = this.f39482d;
        if (z1Var != null) {
            z1Var.r(new l0(1));
        }
        this.f39482d = null;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void c(Throwable th2, vy.i iVar) throws Throwable {
        y1.d dVar = (y1.d) iVar.get(y1.d.f56814b);
        if (dVar != null) {
            hz.b.T(th2, new pv.c(25, dVar, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.f39479a.get(rz.z.f50977a);
        if (coroutineExceptionHandler == null) {
            throw th2;
        }
        coroutineExceptionHandler.c(th2, iVar);
    }

    @Override // l1.f2
    public final void d() {
        rz.z1 z1Var = this.f39482d;
        if (z1Var != null) {
            z1Var.r(new l0(1));
        }
        this.f39482d = null;
    }

    @Override // l1.f2
    public final void f() {
        rz.z1 z1Var = this.f39482d;
        if (z1Var != null) {
            z1Var.cancel(rz.e0.a("Old job was still running!", null));
        }
        this.f39482d = rz.e0.B(this.f39481c, null, null, this.f39480b, 3);
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
        return rz.z.f50977a;
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
