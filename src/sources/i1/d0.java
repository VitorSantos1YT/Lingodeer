package i1;

import f0.h1;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends z1.q implements y2.z {
    public ob.s Q;
    public fz.e R;
    public h1 S;
    public boolean T;

    @Override // z1.q
    public final void M0() {
        this.T = false;
    }

    @Override // y2.z
    public final w2.r0 b(w2.s0 s0Var, w2.p0 p0Var, long j11) {
        w2.g1 g1VarB = p0Var.B(j11);
        if (!s0Var.c0() || !this.T) {
            qy.l lVar = (qy.l) this.R.invoke(new v3.l(ff.h.b(g1VarB.f54501a, g1VarB.f54502b)), new v3.a(j11));
            ob.s sVar = this.Q;
            o0 o0Var = (o0) lVar.f48495a;
            Object obj = lVar.f48496b;
            if (!kotlin.jvm.internal.m.a(sVar.h(), o0Var)) {
                ((k1) sVar.m).setValue(o0Var);
                i0 i0Var = (i0) sVar.f44879e;
                d2.c cVar = new d2.c(6, sVar, obj);
                a00.e eVar = i0Var.f34029b;
                boolean zG = eVar.g();
                if (zG) {
                    try {
                        cVar.invoke();
                        eVar.a(null);
                    } catch (Throwable th2) {
                        eVar.a(null);
                        throw th2;
                    }
                }
                if (!zG) {
                    sVar.u(obj);
                }
            }
        }
        this.T = s0Var.c0() || this.T;
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new a0.j(s0Var, this, g1VarB, 11));
    }
}
