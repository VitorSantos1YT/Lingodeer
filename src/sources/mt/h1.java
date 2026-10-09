package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.a2 f41508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f41509c;

    public /* synthetic */ h1(rt.a2 a2Var, l1.b3 b3Var, int i11) {
        this.f41507a = i11;
        this.f41508b = a2Var;
        this.f41509c = b3Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41507a) {
            case 0:
                boolean z11 = ((rt.o1) this.f41509c.getValue()).m;
                rt.a2 a2Var = this.f41508b;
                if (z11) {
                    a2Var.d();
                } else {
                    a2Var.i();
                }
                break;
            default:
                boolean z12 = ((rt.o1) this.f41509c.getValue()).m;
                rt.a2 a2Var2 = this.f41508b;
                if (z12) {
                    a2Var2.d();
                } else {
                    a2Var2.i();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
