package o20;

import okhttp3.Call;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f44582d;

    public s(s0 s0Var, Call.Factory factory, m mVar, g gVar) {
        super(s0Var, factory, mVar);
        this.f44582d = gVar;
    }

    @Override // o20.t
    public final Object b(b0 b0Var, Object[] objArr) {
        e eVar = (e) this.f44582d.o(b0Var);
        vy.d dVar = (vy.d) objArr[objArr.length - 1];
        try {
            rz.m mVar = new rz.m(1, ue.f.x(dVar));
            mVar.s();
            mVar.u(new v(eVar, 2));
            eVar.H0(new i(mVar, 1));
            Object objR = mVar.r();
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            return objR;
        } catch (Exception e8) {
            return c1.p(e8, dVar);
        }
    }
}
