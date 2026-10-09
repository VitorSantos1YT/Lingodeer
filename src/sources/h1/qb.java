package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class qb extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb f30938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(int i11, yb ybVar, int i12, long j11) {
        super(2);
        this.f30937a = i11;
        this.f30938b = ybVar;
        this.f30939c = i12;
        this.f30940d = j11;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0056  */
    /* JADX WARN: Code duplicated, block: B:11:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x007b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String strS;
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        boolean zF;
        Object objQ;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                boolean zG = this.f30938b.g();
                int i11 = this.f30937a;
                int i12 = this.f30939c;
                strS = wb.s(i11, zG, i12, nVar);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                iV = l1.t.v(nVar);
                sVar = (l1.s) nVar;
                l1.q1 q1VarL = sVar.l();
                z1.o oVar = z1.o.f58481a;
                z1.r rVarC = z1.a.c(nVar, oVar);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, nVar);
                l1.t.J(y2.j.f56916e, q1VarL, nVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                    defpackage.e.A(iV, sVar, iV, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, nVar);
                zF = sVar.f(strS);
                objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new c6.o(strS, 10);
                    sVar.o0(objQ);
                }
                ua.b(s0.a(i12, 6), g3.r.b(oVar, false, (fz.c) objQ), this.f30940d, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar, 0, 0, 131064);
                sVar.p(true);
            }
        } else {
            boolean zG2 = this.f30938b.g();
            int i13 = this.f30937a;
            int i14 = this.f30939c;
            strS = wb.s(i13, zG2, i14, nVar);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            iV = l1.t.v(nVar);
            sVar = (l1.s) nVar;
            l1.q1 q1VarL2 = sVar.l();
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC2 = z1.a.c(nVar, oVar2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD2, nVar);
            l1.t.J(y2.j.f56916e, q1VarL2, nVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iV, sVar, iV, hVar);
            } else {
                defpackage.e.A(iV, sVar, iV, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, nVar);
            zF = sVar.f(strS);
            objQ = sVar.Q();
            if (zF) {
                objQ = new c6.o(strS, 10);
                sVar.o0(objQ);
            } else {
                objQ = new c6.o(strS, 10);
                sVar.o0(objQ);
            }
            ua.b(s0.a(i14, 6), g3.r.b(oVar2, false, (fz.c) objQ), this.f30940d, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, nVar, 0, 0, 131064);
            sVar.p(true);
        }
        return qy.b0.f48488a;
    }
}
