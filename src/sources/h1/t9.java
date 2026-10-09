package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t9 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31111a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f31112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f31113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f31116f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f31117t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(la laVar, boolean z11, boolean z12, h0.i iVar, ha haVar, g2.w0 w0Var, int i11) {
        super(2);
        la laVar2 = la.f30616a;
        la laVar3 = la.f30616a;
        this.f31114d = laVar;
        this.f31112b = z11;
        this.f31113c = z12;
        this.f31115e = iVar;
        this.f31116f = haVar;
        this.f31117t = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c7  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        int i11 = this.f31111a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f31117t;
        Object obj4 = this.f31116f;
        Object obj5 = this.f31115e;
        Object obj6 = this.f31114d;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    z1.r rVarE = j0.e2.e(q0.c.a((z1.r) obj6, this.f31112b, null, (d0.z0) obj5, this.f31113c, new g3.k(4), (fz.a) obj4), 1.0f);
                    t1.d dVar = (t1.d) obj3;
                    j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, nVar, 54);
                    iV = l1.t.v(nVar);
                    sVar = (l1.s) nVar;
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(nVar, rVarE);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, nVar);
                    l1.t.J(y2.j.f56916e, q1VarL, nVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    } else {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, nVar);
                    dVar.invoke(j0.v.f35424a, nVar, 6);
                    sVar.p(true);
                } else {
                    l1.s sVar2 = (l1.s) nVar;
                    if (!sVar2.F()) {
                        z1.r rVarE2 = j0.e2.e(q0.c.a((z1.r) obj6, this.f31112b, null, (d0.z0) obj5, this.f31113c, new g3.k(4), (fz.a) obj4), 1.0f);
                        t1.d dVar2 = (t1.d) obj3;
                        j0.u uVarA2 = j0.t.a(j0.i.f35307e, z1.c.P, nVar, 54);
                        iV = l1.t.v(nVar);
                        sVar = (l1.s) nVar;
                        l1.q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(nVar, rVarE2);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA2, nVar);
                        l1.t.J(y2.j.f56916e, q1VarL2, nVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, nVar);
                        dVar2.invoke(j0.v.f35424a, nVar, 6);
                        sVar.p(true);
                    } else {
                        sVar2.W();
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                la laVar = la.f30616a;
                la laVar2 = la.f30616a;
                int iM = l1.t.M(114822145);
                boolean z11 = this.f31112b;
                boolean z12 = this.f31113c;
                ((la) obj6).a(z11, z12, (h0.i) obj5, (ha) obj4, (g2.w0) obj3, (l1.n) obj, iM);
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(z1.r rVar, boolean z11, d0.z0 z0Var, boolean z12, fz.a aVar, t1.d dVar) {
        super(2);
        this.f31114d = rVar;
        this.f31112b = z11;
        this.f31115e = z0Var;
        this.f31113c = z12;
        this.f31116f = aVar;
        this.f31117t = dVar;
    }
}
