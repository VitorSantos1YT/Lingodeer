package sw;

import com.google.common.base.Preconditions;
import java.util.List;
import lw.k0;
import lw.l0;
import lw.o0;
import lw.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f51846d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f51847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0 f51848f;

    public f(h hVar) {
        this.f51848f = hVar;
    }

    @Override // sw.c, lw.f
    public lw.y b(k0 k0Var) {
        switch (this.f51846d) {
            case 1:
                v vVar = (v) this.f51848f;
                d7.k kVar = vVar.f51903f;
                t tVar = new t(vVar, k0Var, (k) this.f51847e);
                List list = k0Var.f40410a;
                if (v.g(list) && kVar.containsKey(((lw.v) list.get(0)).f40480a.get(0))) {
                    n nVar = (n) kVar.get(((lw.v) list.get(0)).f40480a.get(0));
                    nVar.a(tVar);
                    if (nVar.f51877d != null) {
                        tVar.s();
                    }
                }
                return tVar;
            default:
                return super.b(k0Var);
        }
    }

    @Override // sw.c, lw.f
    public final void q(lw.n nVar, o0 o0Var) {
        switch (this.f51846d) {
            case 0:
                q0 q0Var = (q0) this.f51847e;
                h hVar = (h) this.f51848f;
                q0 q0Var2 = hVar.f51855k;
                if (q0Var == q0Var2) {
                    Preconditions.p("there's pending lb while current lb has been out of READY", hVar.f51857n);
                    hVar.f51856l = nVar;
                    hVar.m = o0Var;
                    if (nVar == lw.n.READY) {
                        hVar.h();
                    }
                } else if (q0Var == hVar.f51853i) {
                    boolean z11 = nVar == lw.n.READY;
                    hVar.f51857n = z11;
                    if (z11 || q0Var2 == hVar.f51850f) {
                        hVar.f51851g.q(nVar, o0Var);
                    } else {
                        hVar.h();
                    }
                }
                break;
            default:
                ((k) this.f51847e).q(nVar, new l0(o0Var, 2));
                break;
        }
    }

    @Override // sw.c
    public final lw.f r() {
        switch (this.f51846d) {
            case 0:
                return ((h) this.f51848f).f51851g;
            default:
                return (k) this.f51847e;
        }
    }

    public f(v vVar, lw.f fVar) {
        this.f51848f = vVar;
        this.f51847e = new k(fVar, 0);
    }
}
