package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f9 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.r f30244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f30245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f30246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.v f30248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f30249f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1.d f30250t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(z1.r rVar, g2.w0 w0Var, long j11, float f5, d0.v vVar, float f11, t1.d dVar) {
        super(2);
        this.f30244a = rVar;
        this.f30245b = w0Var;
        this.f30246c = j11;
        this.f30247d = f5;
        this.f30248e = vVar;
        this.f30249f = f11;
        this.f30250t = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue() & 3;
        qy.b0 b0Var = qy.b0.f48488a;
        if (iIntValue == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
                return b0Var;
            }
        }
        long jE = i9.e(this.f30246c, this.f30247d, nVar);
        l1.s sVar2 = (l1.s) nVar;
        z1.r rVarB = g3.r.b(i9.d(this.f30244a, this.f30245b, jE, this.f30248e, ((v3.c) sVar2.j(z2.g1.f58547h)).e0(this.f30249f)), false, o0.S);
        bp.g2 g2Var = new bp.g2(2, 27, null);
        s2.l lVar = s2.g0.f51302a;
        z1.r rVarI = rVarB.i(new s2.e0(b0Var, null, null, new s2.f0(g2Var), 6));
        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, true);
        int iHashCode = Long.hashCode(sVar2.T);
        l1.q1 q1VarL = sVar2.l();
        z1.r rVarC = z1.a.c(sVar2, rVarI);
        y2.k.J.getClass();
        y2.i iVar = y2.j.f56913b;
        sVar2.h0();
        if (sVar2.S) {
            sVar2.k(iVar);
        } else {
            sVar2.r0();
        }
        l1.t.J(y2.j.f56917f, q0VarD, sVar2);
        l1.t.J(y2.j.f56916e, q1VarL, sVar2);
        y2.h hVar = y2.j.f56918g;
        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
        }
        l1.t.J(y2.j.f56915d, rVarC, sVar2);
        hh.p0.x(0, this.f30250t, sVar2, true);
        return b0Var;
    }
}
