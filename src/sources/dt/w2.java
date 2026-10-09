package dt;

import android.content.Context;
import com.lingodeer.data.model.CoursePracticeType;
import h1.ua;
import rt.ec;
import rt.fc;
import rt.gc;
import rt.h9;
import rt.pc;
import rt.qc;
import rt.rc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w2 implements fz.f {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24313a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f24314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24318f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f24319t;

    public /* synthetic */ w2(ht.q qVar, Context context, fz.a aVar, ht.l lVar, ns.z zVar, fz.a aVar2, fz.a aVar3, fz.c cVar, t1.d dVar) {
        this.f24315c = qVar;
        this.f24316d = context;
        this.f24314b = aVar;
        this.f24319t = lVar;
        this.H = zVar;
        this.f24317e = aVar2;
        this.f24318f = aVar3;
        this.K = cVar;
        this.L = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        boolean z12;
        switch (this.f24313a) {
            case 0:
                ht.q qVar = (ht.q) this.f24315c;
                Context context = (Context) this.f24316d;
                ht.l lVar = (ht.l) this.f24319t;
                ns.z zVar = (ns.z) this.H;
                fz.a aVar = (fz.a) this.f24317e;
                fz.a aVar2 = (fz.a) this.f24318f;
                fz.c cVar = (fz.c) this.K;
                t1.d dVar = (t1.d) this.L;
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                l1.n nVar = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                w2.q0 q0VarD = j0.o.d(z1.c.H, false);
                l1.s sVar = (l1.s) nVar;
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, z1.o.f58481a);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, nVar);
                l1.t.J(y2.j.f56916e, q1VarL, nVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, nVar);
                sVar.d0(-787109238);
                boolean zD = sVar.d(qVar.ordinal()) | sVar.h(context);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                t1.d dVarD = null;
                Object[] objArr = 0;
                if (zD || objQ == gVar) {
                    objQ = new av.f0(16, qVar, context, objArr == true ? 1 : 0);
                    sVar.o0(objQ);
                }
                l1.t.f((fz.e) objQ, qVar, nVar);
                sVar.p(false);
                boolean z13 = qVar == ht.q.CORRECT;
                int iIntValue = ((Number) this.f24314b.invoke()).intValue();
                n4 n4Var = (n4) sVar.j(k3.f23943a);
                if (n4Var == null) {
                    sVar.d0(-786152486);
                    z11 = false;
                } else {
                    z11 = false;
                    sVar.d0(-786152485);
                    dVarD = t1.e.d(1985173240, new ch.b0(n4Var, 5), nVar);
                }
                sVar.p(z11);
                t1.d dVar2 = dVarD;
                boolean zF = sVar.f(aVar);
                Object objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    objQ2 = new ch.o0(15, aVar);
                    sVar.o0(objQ2);
                }
                v2.j(z13, lVar, iIntValue, null, zVar, (fz.a) objQ2, aVar2, cVar, t1.e.d(2031669553, new b3(dVar, 0), nVar), dVar2, nVar, 805306368);
                sVar.p(true);
                return qy.b0.f48488a;
            default:
                gc gcVar = (gc) this.f24315c;
                rc rcVar = (rc) this.f24316d;
                l1.b1 b1Var = (l1.b1) this.f24317e;
                l1.b1 b1Var2 = (l1.b1) this.f24318f;
                CoursePracticeType coursePracticeType = (CoursePracticeType) this.f24319t;
                h9 h9Var = (h9) this.H;
                l1.b1 b1Var3 = (l1.b1) this.K;
                l1.b1 b1Var4 = (l1.b1) this.L;
                a0.k0 AnimatedVisibility2 = (a0.k0) obj;
                l1.n nVar2 = (l1.n) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                if (kotlin.jvm.internal.m.a(gcVar, ec.f49694a)) {
                    l1.s sVar2 = (l1.s) nVar2;
                    sVar2.d0(-434100327);
                    sVar2.p(false);
                } else {
                    if (!(gcVar instanceof fc)) {
                        throw nv.p.x((l1.s) nVar2, -434096541, false);
                    }
                    l1.s sVar3 = (l1.s) nVar2;
                    sVar3.d0(-571950172);
                    if (rcVar instanceof pc) {
                        sVar3.d0(-434094951);
                        sVar3.p(false);
                        z12 = false;
                    } else {
                        if (!(rcVar instanceof qc)) {
                            throw nv.p.x(sVar3, -434091218, false);
                        }
                        sVar3.d0(-571790212);
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL2 = sVar3.l();
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarC2 = z1.a.c(sVar3, oVar);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar2);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD2, sVar3);
                        l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                        fc fcVar = (fc) gcVar;
                        float f5 = fcVar.f49762a;
                        int i11 = fcVar.f49763b;
                        boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                        Object objQ3 = sVar3.Q();
                        if (objQ3 == l1.m.f39353a) {
                            objQ3 = new ys.d1(15, b1Var2);
                            sVar3.o0(objQ3);
                        }
                        ys.a.v(f5, i11, zBooleanValue, (fz.a) objQ3, t1.e.d(128332191, new ei.l(coursePracticeType, rcVar, h9Var, this.f24314b, gcVar, b1Var3, b1Var4), sVar3), sVar3, 27648);
                        if (((Boolean) sVar3.j(ju.f.f37375i)).booleanValue()) {
                            sVar3.d0(1603363378);
                            ot.j1 j1Var = ((qc) rcVar).f50301a;
                            if (j1Var != null) {
                                sVar3.d0(1603524609);
                                ua.b(j1Var.a().f33753a + ":" + j1Var.a().f33754b + ":" + j1Var.a().f33755c, j0.r.f35391a.a(oVar, z1.c.H), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar3.j(ua.f31167a), ((h1.s1) sVar3.j(h1.v1.f31180a)).f31036s, fr.j3.A(10), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar3, 0, 0, 65532);
                                z12 = false;
                            } else {
                                z12 = false;
                                sVar3.d0(1565526917);
                            }
                            sVar3.p(z12);
                        } else {
                            z12 = false;
                            sVar3.d0(1565526917);
                        }
                        sVar3.p(z12);
                        sVar3.p(true);
                        sVar3.p(z12);
                    }
                    sVar3.p(z12);
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ w2(gc gcVar, rc rcVar, l1.b1 b1Var, l1.b1 b1Var2, CoursePracticeType coursePracticeType, h9 h9Var, fz.a aVar, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f24315c = gcVar;
        this.f24316d = rcVar;
        this.f24317e = b1Var;
        this.f24318f = b1Var2;
        this.f24319t = coursePracticeType;
        this.H = h9Var;
        this.f24314b = aVar;
        this.K = b1Var3;
        this.L = b1Var4;
    }
}
