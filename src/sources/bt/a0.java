package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot.q f5135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f5136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f5138e;

    public /* synthetic */ a0(ot.q qVar, ht.o oVar, ys.d0 d0Var, fz.a aVar, int i11, int i12) {
        this.f5134a = i12;
        this.f5135b = qVar;
        this.f5136c = oVar;
        this.f5137d = d0Var;
        this.f5138e = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5134a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                i0.c(this.f5135b, this.f5136c, this.f5137d, this.f5138e, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                s5.b(this.f5135b, this.f5136c, this.f5137d, this.f5138e, (l1.n) obj, iM2);
                break;
        }
        return qy.b0.f48488a;
    }
}
