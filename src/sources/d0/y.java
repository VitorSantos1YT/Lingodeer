package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f22838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g3.k f22840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f22841d;

    public y(z0 z0Var, boolean z11, g3.k kVar, fz.a aVar) {
        this.f22838a = z0Var;
        this.f22839b = z11;
        this.f22840c = kVar;
        this.f22841d = aVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        l1.s sVar = (l1.s) ((l1.n) obj2);
        sVar.d0(-1525724089);
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            objQ = com.google.android.material.datepicker.d.f(sVar);
        }
        h0.i iVar = (h0.i) objQ;
        z1.r rVarI = c1.a(z1.o.f58481a, iVar, this.f22838a).i(new x(iVar, null, false, this.f22839b, null, this.f22840c, this.f22841d));
        sVar.p(false);
        return rVarI;
    }
}
