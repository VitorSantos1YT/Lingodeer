package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.a f22916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22917b;

    public h(fz.a aVar, boolean z11) {
        this.f22916a = aVar;
        this.f22917b = z11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z1.r rVar = (z1.r) obj;
        ((Number) obj3).intValue();
        l1.s sVar = (l1.s) ((l1.n) obj2);
        sVar.d0(-196777734);
        long j11 = ((g1) sVar.j(h1.f22920a)).f22914a;
        boolean zE = sVar.e(j11);
        fz.a aVar = this.f22916a;
        boolean zF = zE | sVar.f(aVar);
        boolean z11 = this.f22917b;
        boolean zG = zF | sVar.g(z11);
        Object objQ = sVar.Q();
        if (zG || objQ == l1.m.f39353a) {
            objQ = new f(j11, aVar, z11);
            sVar.o0(objQ);
        }
        z1.r rVarE = d2.h.e(rVar, (fz.c) objQ);
        sVar.p(false);
        return rVarE;
    }
}
