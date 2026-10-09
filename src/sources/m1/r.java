package m1;

import l1.g2;
import l1.p2;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f40808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f40809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f40810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f40811g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40812c;

    static {
        int i11 = 1;
        f40808d = new r(i11, 2, 0);
        int i12 = 1;
        f40809e = new r(i12, i12, 1);
        f40810f = new r(i11, 2, 2);
        int i13 = 1;
        f40811g = new r(i13, i13, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i11, int i12, int i13) {
        super(i11, i12);
        this.f40812c = i13;
    }

    @Override // m1.j0
    public final void a(d1.t tVar, l1.d dVar, p2 p2Var, t1.j jVar, k0 k0Var) {
        switch (this.f40812c) {
            case 0:
                Object objInvoke = ((fz.a) tVar.f(0)).invoke();
                l1.b bVar = (l1.b) tVar.f(1);
                int iE = tVar.e(0);
                bVar.getClass();
                p2Var.U(p2Var.c(bVar), objInvoke);
                dVar.v(iE, objInvoke);
                dVar.d(objInvoke);
                break;
            case 1:
                l1.b bVar2 = (l1.b) tVar.f(0);
                int iE2 = tVar.e(0);
                dVar.q();
                bVar2.getClass();
                dVar.b(iE2, p2Var.D(p2Var.c(bVar2)));
                break;
            case 2:
                Object objF = tVar.f(0);
                l1.b bVar3 = (l1.b) tVar.f(1);
                int iE3 = tVar.e(0);
                if (objF instanceof g2) {
                    g2 g2Var = (g2) objF;
                    jVar.f51997e.c(g2Var);
                    jVar.f51996d.a(g2Var);
                }
                Object objK = p2Var.K(p2Var.c(bVar3), iE3, objF);
                if (objK instanceof g2) {
                    jVar.e((g2) objK);
                } else if (objK instanceof x1) {
                    ((x1) objK).d();
                }
                break;
            default:
                Object objF2 = tVar.f(0);
                int iE4 = tVar.e(0);
                if (objF2 instanceof g2) {
                    g2 g2Var2 = (g2) objF2;
                    jVar.f51997e.c(g2Var2);
                    jVar.f51996d.a(g2Var2);
                }
                Object objK2 = p2Var.K(p2Var.f39414t, iE4, objF2);
                if (objK2 instanceof g2) {
                    jVar.e((g2) objK2);
                } else if (objK2 instanceof x1) {
                    ((x1) objK2).d();
                }
                break;
        }
    }

    @Override // m1.j0
    public l1.b b(d1.t tVar) {
        switch (this.f40812c) {
            case 0:
                return (l1.b) tVar.f(1);
            case 1:
                return (l1.b) tVar.f(0);
            default:
                return super.b(tVar);
        }
    }
}
