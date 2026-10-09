package bt;

import com.lingodeer.data.model.CourseSentence;
import rt.ec;
import rt.fc;
import rt.gc;
import rt.rc;
import rt.x8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m1 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5694a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f5698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy.e f5699f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5700t;

    public /* synthetic */ m1(CourseSentence courseSentence, jt.h0 h0Var, ht.o oVar, fz.a aVar, fz.e eVar, fz.c cVar, fz.a aVar2, fz.c cVar2, int i11) {
        this.H = courseSentence;
        this.K = h0Var;
        this.f5695b = oVar;
        this.f5698e = aVar;
        this.L = eVar;
        this.f5696c = cVar;
        this.f5699f = aVar2;
        this.f5697d = cVar2;
        this.f5700t = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5694a) {
            case 0:
                ((Integer) obj2).intValue();
                b.n((CourseSentence) this.H, (jt.h0) this.K, (ht.o) this.f5695b, this.f5698e, (fz.e) this.L, (fz.c) this.f5696c, (fz.a) this.f5699f, (fz.c) this.f5697d, (l1.n) obj, l1.t.M(this.f5700t | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                b.K((ht.q) this.H, (ht.l) this.K, (ot.t1) this.L, (ht.o) this.f5695b, (fz.c) this.f5696c, (fz.c) this.f5697d, this.f5698e, (fz.a) this.f5699f, (l1.n) obj, l1.t.M(this.f5700t | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                jr.a.p((kr.c1) this.H, (z1.r) this.K, (fz.c) this.f5696c, (fz.c) this.f5697d, (fz.c) this.f5695b, (fz.c) this.f5699f, (fz.c) this.L, this.f5698e, (l1.n) obj, l1.t.M(1), this.f5700t);
                break;
            case 3:
                ((Integer) obj2).intValue();
                mt.g.s((rt.b0) this.H, (x8) this.K, (fz.c) this.f5696c, (fz.c) this.f5697d, (fz.e) this.L, (fz.c) this.f5695b, this.f5698e, (fz.a) this.f5699f, (l1.n) obj, l1.t.M(this.f5700t | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                mt.l5.s((rt.b5) this.H, this.f5698e, (fz.a) this.f5699f, (fz.c) this.f5696c, (fz.c) this.f5697d, (fz.a) this.K, (fz.a) this.f5695b, (fz.a) this.L, (l1.n) obj, l1.t.M(this.f5700t | 1));
                break;
            case 5:
                gc gcVar = (gc) this.H;
                rz.b0 b0Var = (rz.b0) this.K;
                fz.a aVar = (fz.a) this.f5699f;
                l1.b1 b1Var = (l1.b1) this.f5695b;
                rc rcVar = (rc) this.L;
                l1.b1 b1Var2 = (l1.b1) this.f5696c;
                l1.b1 b1Var3 = (l1.b1) this.f5697d;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else if (kotlin.jvm.internal.m.a(gcVar, ec.f49694a)) {
                    sVar.d0(254684581);
                    sVar.p(false);
                } else {
                    if (!(gcVar instanceof fc)) {
                        throw nv.p.x(sVar, 254685009, false);
                    }
                    sVar.d0(-694551038);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    float f5 = ((fc) gcVar).f49762a;
                    int iIntValue2 = ((Number) this.f5698e.invoke()).intValue();
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    boolean zH = sVar.h(b0Var) | sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new fs.f(b0Var, aVar, 2);
                        sVar.o0(objQ);
                    }
                    ys.a.v(f5, iIntValue2, zBooleanValue, (fz.a) objQ, t1.e.d(-809318966, new fu.v(rcVar, this.f5700t, b1Var2, b1Var3), sVar), sVar, 24576);
                    sVar.p(true);
                    sVar.p(false);
                }
                return qy.b0.f48488a;
            case 6:
                ((Integer) obj2).intValue();
                xu.h1.d((zu.q0) this.H, (zu.m1) this.K, (fz.c) this.f5696c, this.f5698e, (fz.a) this.f5699f, (fz.c) this.f5697d, (fz.c) this.f5695b, (fz.c) this.L, (l1.n) obj, l1.t.M(this.f5700t | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ys.a.d((rt.g4) this.H, (fz.e) this.L, (fz.c) this.f5696c, (fz.c) this.f5697d, (fz.c) this.K, (fz.c) this.f5695b, this.f5698e, (fz.a) this.f5699f, (l1.n) obj, l1.t.M(this.f5700t | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ m1(ht.q qVar, ht.l lVar, ot.t1 t1Var, ht.o oVar, fz.c cVar, fz.c cVar2, fz.a aVar, fz.a aVar2, int i11) {
        this.H = qVar;
        this.K = lVar;
        this.L = t1Var;
        this.f5695b = oVar;
        this.f5696c = cVar;
        this.f5697d = cVar2;
        this.f5698e = aVar;
        this.f5699f = aVar2;
        this.f5700t = i11;
    }

    public /* synthetic */ m1(kr.c1 c1Var, z1.r rVar, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.c cVar5, fz.a aVar, int i11, int i12) {
        this.H = c1Var;
        this.K = rVar;
        this.f5696c = cVar;
        this.f5697d = cVar2;
        this.f5695b = cVar3;
        this.f5699f = cVar4;
        this.L = cVar5;
        this.f5698e = aVar;
        this.f5700t = i12;
    }

    public /* synthetic */ m1(rt.b0 b0Var, x8 x8Var, fz.c cVar, fz.c cVar2, fz.e eVar, fz.c cVar3, fz.a aVar, fz.a aVar2, int i11) {
        this.H = b0Var;
        this.K = x8Var;
        this.f5696c = cVar;
        this.f5697d = cVar2;
        this.L = eVar;
        this.f5695b = cVar3;
        this.f5698e = aVar;
        this.f5699f = aVar2;
        this.f5700t = i11;
    }

    public /* synthetic */ m1(rt.g4 g4Var, fz.e eVar, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.a aVar, fz.a aVar2, int i11) {
        this.H = g4Var;
        this.L = eVar;
        this.f5696c = cVar;
        this.f5697d = cVar2;
        this.K = cVar3;
        this.f5695b = cVar4;
        this.f5698e = aVar;
        this.f5699f = aVar2;
        this.f5700t = i11;
    }

    public /* synthetic */ m1(rt.b5 b5Var, fz.a aVar, fz.a aVar2, fz.c cVar, fz.c cVar2, fz.a aVar3, fz.a aVar4, fz.a aVar5, int i11) {
        this.H = b5Var;
        this.f5698e = aVar;
        this.f5699f = aVar2;
        this.f5696c = cVar;
        this.f5697d = cVar2;
        this.K = aVar3;
        this.f5695b = aVar4;
        this.L = aVar5;
        this.f5700t = i11;
    }

    public /* synthetic */ m1(gc gcVar, fz.a aVar, rz.b0 b0Var, fz.a aVar2, l1.b1 b1Var, rc rcVar, int i11, l1.b1 b1Var2, l1.b1 b1Var3) {
        this.H = gcVar;
        this.f5698e = aVar;
        this.K = b0Var;
        this.f5699f = aVar2;
        this.f5695b = b1Var;
        this.L = rcVar;
        this.f5700t = i11;
        this.f5696c = b1Var2;
        this.f5697d = b1Var3;
    }

    public /* synthetic */ m1(zu.q0 q0Var, zu.m1 m1Var, fz.c cVar, fz.a aVar, fz.a aVar2, fz.c cVar2, fz.c cVar3, fz.c cVar4, int i11) {
        this.H = q0Var;
        this.K = m1Var;
        this.f5696c = cVar;
        this.f5698e = aVar;
        this.f5699f = aVar2;
        this.f5697d = cVar2;
        this.f5695b = cVar3;
        this.L = cVar4;
        this.f5700t = i11;
    }
}
