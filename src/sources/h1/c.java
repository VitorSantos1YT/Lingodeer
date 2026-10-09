package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.e f30056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f30057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f30060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1.d f30061f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fz.e eVar, fz.e eVar2, long j11, long j12, long j13, long j14, t1.d dVar) {
        super(2);
        this.f30056a = eVar;
        this.f30057b = eVar2;
        this.f30058c = j12;
        this.f30059d = j13;
        this.f30060e = j14;
        this.f30061f = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004b  */
    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0070  */
    /* JADX WARN: Code duplicated, block: B:20:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:33:0x0110  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        fz.e eVar;
        fz.e eVar2;
        int iV2;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                z1.r rVarZ = j0.c.z(z1.o.f58481a, k.f30511e);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
                iV = l1.t.v(nVar);
                sVar = (l1.s) nVar;
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, rVarZ);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                l1.t.J(hVar2, uVarA, nVar);
                y2.h hVar3 = y2.j.f56916e;
                l1.t.J(hVar3, q1VarL, nVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                    defpackage.e.A(iV, sVar, iV, hVar);
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, nVar);
                sVar.d0(-1924971291);
                sVar.p(false);
                sVar.d0(-1924961479);
                eVar = this.f30056a;
                if (eVar != null) {
                    i1.p.a(this.f30058c, fc.a(k1.e.f37499f, nVar), t1.e.d(434448772, new b(0, eVar), nVar), nVar, 384);
                }
                sVar.p(false);
                sVar.d0(-1924936431);
                eVar2 = this.f30057b;
                if (eVar2 != null) {
                    i1.p.a(this.f30059d, fc.a(k1.e.f37501h, nVar), t1.e.d(-796843771, new b(1, eVar2), nVar), nVar, 384);
                }
                sVar.p(false);
                j0.v0 v0Var = new j0.v0(z1.c.Q);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iV2 = l1.t.v(nVar);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(nVar, v0Var);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, q0VarD, nVar);
                l1.t.J(hVar3, q1VarL2, nVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV2))) {
                    defpackage.e.A(iV2, sVar, iV2, hVar);
                }
                l1.t.J(hVar4, rVarC2, nVar);
                i1.p.a(this.f30060e, fc.a(k1.e.f37495b, nVar), this.f30061f, nVar, 0);
                sVar.p(true);
                sVar.p(true);
            }
        } else {
            z1.r rVarZ2 = j0.c.z(z1.o.f58481a, k.f30511e);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, nVar, 0);
            iV = l1.t.v(nVar);
            sVar = (l1.s) nVar;
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(nVar, rVarZ2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar5 = y2.j.f56917f;
            l1.t.J(hVar5, uVarA2, nVar);
            y2.h hVar6 = y2.j.f56916e;
            l1.t.J(hVar6, q1VarL3, nVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iV, sVar, iV, hVar);
            } else {
                defpackage.e.A(iV, sVar, iV, hVar);
            }
            y2.h hVar7 = y2.j.f56915d;
            l1.t.J(hVar7, rVarC3, nVar);
            sVar.d0(-1924971291);
            sVar.p(false);
            sVar.d0(-1924961479);
            eVar = this.f30056a;
            if (eVar != null) {
                i1.p.a(this.f30058c, fc.a(k1.e.f37499f, nVar), t1.e.d(434448772, new b(0, eVar), nVar), nVar, 384);
            }
            sVar.p(false);
            sVar.d0(-1924936431);
            eVar2 = this.f30057b;
            if (eVar2 != null) {
                i1.p.a(this.f30059d, fc.a(k1.e.f37501h, nVar), t1.e.d(-796843771, new b(1, eVar2), nVar), nVar, 384);
            }
            sVar.p(false);
            j0.v0 v0Var2 = new j0.v0(z1.c.Q);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iV2 = l1.t.v(nVar);
            l1.q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(nVar, v0Var2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar5, q0VarD2, nVar);
            l1.t.J(hVar6, q1VarL4, nVar);
            if (sVar.S) {
                defpackage.e.A(iV2, sVar, iV2, hVar);
            } else {
                defpackage.e.A(iV2, sVar, iV2, hVar);
            }
            l1.t.J(hVar7, rVarC4, nVar);
            i1.p.a(this.f30060e, fc.a(k1.e.f37495b, nVar), this.f30061f, nVar, 0);
            sVar.p(true);
            sVar.p(true);
        }
        return qy.b0.f48488a;
    }
}
