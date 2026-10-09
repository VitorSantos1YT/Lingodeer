package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f35382b;

    public /* synthetic */ p2(n2 n2Var, int i11) {
        this.f35381a = i11;
        this.f35382b = n2Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f35381a) {
            case 0:
                ((Number) obj3).intValue();
                l1.s sVar = (l1.s) ((l1.n) obj2);
                sVar.d0(788931215);
                n2 n2Var = this.f35382b;
                boolean zF = sVar.f(n2Var);
                Object objQ = sVar.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new h2(n2Var);
                    sVar.o0(objQ);
                }
                h2 h2Var = (h2) objQ;
                sVar.p(false);
                return h2Var;
            default:
                ((Number) obj3).intValue();
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                sVar2.d0(-1415685722);
                n2 n2Var2 = this.f35382b;
                boolean zF2 = sVar2.f(n2Var2);
                Object objQ2 = sVar2.Q();
                if (zF2 || objQ2 == l1.m.f39353a) {
                    objQ2 = new z0(n2Var2);
                    sVar2.o0(objQ2);
                }
                z0 z0Var = (z0) objQ2;
                sVar2.p(false);
                return z0Var;
        }
    }
}
