package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ float H;
    public final /* synthetic */ g2.w0 K;
    public final /* synthetic */ long L;
    public final /* synthetic */ long M;
    public final /* synthetic */ float N;
    public final /* synthetic */ fz.e O;
    public final /* synthetic */ fz.e P;
    public final /* synthetic */ t1.d Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f30915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f30916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e8 f30917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.d f30918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f30919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f30920f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z1.r f30921t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(long j11, fz.a aVar, e8 e8Var, b0.d dVar, rz.b0 b0Var, fz.c cVar, z1.r rVar, float f5, g2.w0 w0Var, long j12, long j13, float f11, fz.e eVar, fz.e eVar2, t1.d dVar2) {
        super(2);
        this.f30915a = j11;
        this.f30916b = aVar;
        this.f30917c = e8Var;
        this.f30918d = dVar;
        this.f30919e = b0Var;
        this.f30920f = cVar;
        this.f30921t = rVar;
        this.H = f5;
        this.K = w0Var;
        this.L = j12;
        this.M = j13;
        this.N = f11;
        this.O = eVar;
        this.P = eVar2;
        this.Q = dVar2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0058  */
    /* JADX WARN: Code duplicated, block: B:11:0x005c  */
    /* JADX WARN: Code duplicated, block: B:16:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        e8 e8Var;
        boolean z11;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                z1.r rVarB = g3.r.b(j0.c.r(j0.e2.d(z1.o.f58481a, 1.0f)), false, o0.M);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iV = l1.t.v(nVar);
                sVar = (l1.s) nVar;
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, rVarB);
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
                e8Var = this.f30917c;
                if (((f8) ((l1.g0) e8Var.f30211b.f44882h).getValue()) != f8.Hidden) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long j11 = this.f30915a;
                fz.a aVar = this.f30916b;
                a6.c(0, j11, aVar, nVar, z11);
                a6.b(this.f30918d, this.f30919e, aVar, this.f30920f, this.f30921t, e8Var, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, nVar, 70);
                sVar.p(true);
            }
        } else {
            z1.r rVarB2 = g3.r.b(j0.c.r(j0.e2.d(z1.o.f58481a, 1.0f)), false, o0.M);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iV = l1.t.v(nVar);
            sVar = (l1.s) nVar;
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(nVar, rVarB2);
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
            e8Var = this.f30917c;
            if (((f8) ((l1.g0) e8Var.f30211b.f44882h).getValue()) != f8.Hidden) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j12 = this.f30915a;
            fz.a aVar2 = this.f30916b;
            a6.c(0, j12, aVar2, nVar, z11);
            a6.b(this.f30918d, this.f30919e, aVar2, this.f30920f, this.f30921t, e8Var, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, nVar, 70);
            sVar.p(true);
        }
        return qy.b0.f48488a;
    }
}
