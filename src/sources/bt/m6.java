package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m6 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot.u1 f5722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f5723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5724d;

    public /* synthetic */ m6(ot.u1 u1Var, ht.o oVar, ys.d0 d0Var, int i11, int i12) {
        this.f5721a = i12;
        this.f5722b = u1Var;
        this.f5723c = oVar;
        this.f5724d = d0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5721a;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                b.N(this.f5722b, this.f5723c, this.f5724d, nVar, l1.t.M(1));
                break;
            case 1:
                b.Q(this.f5722b, this.f5723c, this.f5724d, nVar, l1.t.M(1));
                break;
            case 2:
                b.T(this.f5722b, this.f5723c, this.f5724d, nVar, l1.t.M(1));
                break;
            case 3:
                b.V(this.f5722b, this.f5723c, this.f5724d, nVar, l1.t.M(1));
                break;
            default:
                e8.c(this.f5722b, this.f5723c, this.f5724d, nVar, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }
}
