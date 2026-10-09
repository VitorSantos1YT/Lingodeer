package yx;

import ef.e;
import java.util.concurrent.Callable;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends qx.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f58360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f58361f;

    public /* synthetic */ a(Object obj, int i11) {
        this.f58360e = i11;
        this.f58361f = obj;
    }

    @Override // qx.b
    public final void L(qx.c cVar) {
        switch (this.f58360e) {
            case 0:
                rx.d dVar = new rx.d(vx.b.f54313b);
                cVar.c(dVar);
                if (!dVar.b()) {
                    try {
                        ((tx.a) this.f58361f).run();
                        if (!dVar.b()) {
                            cVar.onComplete();
                        }
                        break;
                    } catch (Throwable th2) {
                        e.E(th2);
                        if (dVar.b()) {
                            p.u(th2);
                            return;
                        } else {
                            cVar.onError(th2);
                            return;
                        }
                    }
                }
                break;
            default:
                rx.d dVar2 = new rx.d(vx.b.f54313b);
                cVar.c(dVar2);
                try {
                    ((Callable) this.f58361f).call();
                    if (!dVar2.b()) {
                        cVar.onComplete();
                    }
                    break;
                } catch (Throwable th3) {
                    e.E(th3);
                    if (!dVar2.b()) {
                        cVar.onError(th3);
                        return;
                    }
                    p.u(th3);
                }
                break;
        }
    }
}
