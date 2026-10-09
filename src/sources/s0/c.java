package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f51010a = new c();

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z1.r rVar = (z1.r) obj;
        ((Number) obj3).intValue();
        l1.s sVar = (l1.s) ((l1.n) obj2);
        sVar.d0(-2126899193);
        long j11 = ((d1.g1) sVar.j(d1.h1.f22920a)).f22914a;
        boolean zE = sVar.e(j11);
        Object objQ = sVar.Q();
        if (zE || objQ == l1.m.f39353a) {
            objQ = new au.o(j11, 20);
            sVar.o0(objQ);
        }
        z1.r rVarI = rVar.i(d2.h.e(z1.o.f58481a, (fz.c) objQ));
        sVar.p(false);
        return rVarI;
    }
}
