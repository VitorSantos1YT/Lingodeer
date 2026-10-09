package wz;

import kotlinx.coroutines.DispatchException;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class q extends rz.a implements xy.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vy.d f55541d;

    public q(vy.d dVar, vy.i iVar) {
        super(iVar, true);
        this.f55541d = dVar;
    }

    @Override // rz.q1
    public final boolean I() {
        return true;
    }

    @Override // xy.d
    public final xy.d getCallerFrame() {
        vy.d dVar = this.f55541d;
        if (dVar instanceof xy.d) {
            return (xy.d) dVar;
        }
        return null;
    }

    @Override // rz.q1
    public void m(Object obj) throws DispatchException {
        b.h(e0.D(obj), ue.f.x(this.f55541d));
    }

    @Override // rz.q1
    public void n(Object obj) {
        this.f55541d.resumeWith(e0.D(obj));
    }

    public void a0() {
    }
}
