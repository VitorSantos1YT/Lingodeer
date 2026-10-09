package l0;

import f0.c2;
import f0.n1;
import l1.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f39187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f39188c;

    public /* synthetic */ s(n1 n1Var, c2 c2Var, int i11) {
        this.f39186a = i11;
        this.f39188c = c2Var;
        this.f39187b = n1Var;
    }

    @Override // f0.n1
    public final float a(float f5) {
        switch (this.f39186a) {
            case 0:
                break;
        }
        return this.f39187b.a(f5);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final int b(int i11) {
        Object obj;
        switch (this.f39186a) {
            case 0:
                o oVarH = ((w) this.f39188c).h();
                if (oVarH.f39156k.isEmpty()) {
                    return 0;
                }
                int iC = c();
                if (i11 > e() || iC > i11) {
                    return ((i11 - c()) * vc.a.C(oVarH)) - d();
                }
                ?? r9 = oVarH.f39156k;
                int size = r9.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        obj = r9.get(i12);
                        if (((p) obj).f39162a != i11) {
                            i12++;
                        }
                    } else {
                        obj = null;
                    }
                }
                p pVar = (p) obj;
                if (pVar != null) {
                    return pVar.f39173l;
                }
                return 0;
            default:
                o0.t tVar = (o0.t) this.f39188c;
                return (int) (hz.b.n(cf.x.e(tVar) + ((long) hz.b.Q(((tVar.o() * (i11 - tVar.k())) - (((g1) tVar.f44435d.f7511d).l() * tVar.o())) + 0)), tVar.f44439h, tVar.f44438g) - cf.x.e(tVar));
        }
    }

    public final int c() {
        switch (this.f39186a) {
            case 0:
                return ((w) this.f39188c).f39206e.f39181b.l();
            default:
                return ((o0.t) this.f39188c).f44436e;
        }
    }

    public final int d() {
        switch (this.f39186a) {
            case 0:
                return ((w) this.f39188c).f39206e.f39182c.l();
            default:
                return ((o0.t) this.f39188c).f44437f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    public final int e() {
        switch (this.f39186a) {
            case 0:
                p pVar = (p) ry.m.A0(((w) this.f39188c).h().f39156k);
                if (pVar != null) {
                    return pVar.f39162a;
                }
                return 0;
            default:
                return ((o0.e) ry.m.z0(((o0.t) this.f39188c).l().f44400a)).f44362a;
        }
    }

    public final void f(int i11, int i12) {
        switch (this.f39186a) {
            case 0:
                ((w) this.f39188c).k(i11, i12);
                break;
            default:
                o0.t tVar = (o0.t) this.f39188c;
                tVar.u(i12 / tVar.o(), i11, true);
                break;
        }
    }
}
