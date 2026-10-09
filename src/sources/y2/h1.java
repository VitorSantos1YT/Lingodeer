package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f56871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(k1 k1Var, int i11) {
        super(0);
        this.f56870a = i11;
        this.f56871b = k1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f56870a) {
            case 0:
                k1 k1Var = this.f56871b;
                g2.v vVar = k1Var.f56953j0;
                kotlin.jvm.internal.m.c(vVar);
                k1Var.W0(vVar, k1Var.f56952i0);
                break;
            default:
                k1 k1Var2 = this.f56871b.S;
                if (k1Var2 != null) {
                    k1Var2.j1();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
