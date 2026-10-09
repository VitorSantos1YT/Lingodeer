package sw;

import lw.k0;
import lw.o0;
import lw.p0;
import lw.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f51863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f51864e;

    public /* synthetic */ k(Object obj, int i11) {
        this.f51863d = i11;
        this.f51864e = obj;
    }

    @Override // sw.c, lw.f
    public lw.y b(k0 k0Var) {
        switch (this.f51863d) {
            case 0:
                p0 p0Var = (p0) k0Var.a();
                lw.y yVarB = super.b(k0Var);
                if (p0Var != null) {
                    return yVarB.c().f40343a.get(q0.f40430d) == null ? new j(yVarB, p0Var) : yVarB;
                }
                return yVarB;
            default:
                return super.b(k0Var);
        }
    }

    @Override // sw.c, lw.f
    public void q(lw.n nVar, o0 o0Var) {
        switch (this.f51863d) {
            case 1:
                l lVar = (l) this.f51864e;
                z zVar = lVar.f51871g;
                if (zVar.f51913f.containsKey(lVar.f51865a)) {
                    lVar.f51868d = nVar;
                    lVar.f51869e = o0Var;
                    if (!lVar.f51870f && !zVar.f51915h) {
                        if (nVar == lw.n.IDLE) {
                            lVar.f51866b.e();
                        }
                        zVar.j();
                        break;
                    }
                }
                break;
            default:
                super.q(nVar, o0Var);
                break;
        }
    }

    @Override // sw.c
    public final lw.f r() {
        switch (this.f51863d) {
            case 0:
                return (lw.f) this.f51864e;
            default:
                return ((l) this.f51864e).f51871g.f51914g;
        }
    }
}
