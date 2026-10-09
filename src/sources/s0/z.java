package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements fz.e {
    public final /* synthetic */ v3.c H;
    public final /* synthetic */ int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1.z0 f51259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f51260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f51261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f51262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f51263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o3.w f51264f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o3.p f51265t;

    public z(d1.z0 z0Var, s0 s0Var, boolean z11, boolean z12, fz.c cVar, o3.w wVar, o3.p pVar, v3.c cVar2, int i11) {
        this.f51259a = z0Var;
        this.f51260b = s0Var;
        this.f51261c = z11;
        this.f51262d = z12;
        this.f51263e = cVar;
        this.f51264f = wVar;
        this.f51265t = pVar;
        this.H = cVar2;
        this.K = i11;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            v3.c cVar = this.H;
            int i11 = this.K;
            s0 s0Var = this.f51260b;
            y yVar = new y(s0Var, this.f51263e, this.f51264f, this.f51265t, cVar, i11);
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
            l1.t.J(y2.j.f56917f, yVar, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.p(true);
            h0 h0VarA = s0Var.a();
            h0 h0Var = h0.None;
            boolean z12 = this.f51261c;
            if (h0VarA != h0Var && s0Var.c() != null) {
                w2.x xVarC = s0Var.c();
                kotlin.jvm.internal.m.c(xVarC);
                z11 = xVarC.k() && z12;
            }
            d1.z0 z0Var = this.f51259a;
            o0.j(z0Var, z11, sVar, 0);
            if (s0Var.a() == h0.Cursor && !this.f51262d && z12) {
                sVar.d0(-714666198);
                o0.k(z0Var, sVar, 0);
                sVar.p(false);
            } else {
                sVar.d0(-714589318);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
