package s0;

import mt.c4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements fz.f {
    public final /* synthetic */ fz.c H;
    public final /* synthetic */ int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f51042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1.z0 f51043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3.w f51044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f51045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f51046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o3.p f51047f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1 f51048t;

    public g1(s0 s0Var, d1.z0 z0Var, o3.w wVar, boolean z11, boolean z12, o3.p pVar, t1 t1Var, fz.c cVar, int i11) {
        this.f51042a = s0Var;
        this.f51043b = z0Var;
        this.f51044c = wVar;
        this.f51045d = z11;
        this.f51046e = z12;
        this.f51047f = pVar;
        this.f51048t = t1Var;
        this.H = cVar;
        this.K = i11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        l1.s sVar = (l1.s) ((l1.n) obj2);
        sVar.d0(851809892);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            objQ = new d1.f1();
            sVar.o0(objQ);
        }
        d1.f1 f1Var = (d1.f1) objQ;
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = new f0();
            sVar.o0(objQ2);
        }
        fz.c cVar = this.H;
        int i11 = this.K;
        f1 f1Var2 = new f1(this.f51042a, this.f51043b, this.f51044c, this.f51045d, this.f51046e, f1Var, this.f51047f, this.f51048t, (f0) objQ2, cVar, i11);
        boolean zH = sVar.h(f1Var2);
        Object objQ3 = sVar.Q();
        if (zH || objQ3 == gVar) {
            c4 c4Var = new c4(1, f1Var2, f1.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 17);
            sVar.o0(c4Var);
            objQ3 = c4Var;
        }
        z1.r rVarD = q2.c.d((fz.c) ((mz.e) objQ3));
        sVar.p(false);
        return rVarD;
    }
}
