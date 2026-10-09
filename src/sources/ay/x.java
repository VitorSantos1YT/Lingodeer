package ay;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends qx.h implements tx.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f3400a;

    public x(Callable callable) {
        this.f3400a = callable;
    }

    @Override // tx.f
    public final Object get() throws Exception {
        Object objCall = this.f3400a.call();
        if (objCall == null) {
            throw gy.f.a("The Callable returned a null value.");
        }
        gy.e eVar = gy.f.f29893a;
        return objCall;
    }

    @Override // qx.h
    public final void j(qx.k kVar) {
        xx.e eVar = new xx.e(kVar);
        kVar.c(eVar);
        if (eVar.b()) {
            return;
        }
        try {
            Object objCall = this.f3400a.call();
            if (objCall == null) {
                throw gy.f.a("Callable returned a null value.");
            }
            gy.e eVar2 = gy.f.f29893a;
            eVar.d(objCall);
        } catch (Throwable th2) {
            ef.e.E(th2);
            if (eVar.b()) {
                qx.p.u(th2);
            } else {
                kVar.onError(th2);
            }
        }
    }
}
