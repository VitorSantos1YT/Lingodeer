package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w3 f31185b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(w3 w3Var, int i11) {
        super(0);
        this.f31184a = i11;
        this.f31185b = w3Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f31184a;
        w3 w3Var = this.f31185b;
        switch (i11) {
            case 0:
                return k7.f30545a;
            default:
                if (((j7) y2.f.i(w3Var, l7.f30605b)) == null) {
                    g1.b bVar = w3Var.W;
                    if (bVar != null) {
                        w3Var.U0(bVar);
                    }
                } else if (w3Var.W == null) {
                    u3 u3Var = new u3(w3Var, 0);
                    v3 v3Var = new v3(w3Var, 0);
                    h0.i iVar = w3Var.S;
                    boolean z11 = w3Var.T;
                    float f5 = w3Var.U;
                    b0.i2 i2Var = g1.h.f28524a;
                    g1.b bVar2 = new g1.b(iVar, z11, f5, u3Var, v3Var);
                    w3Var.T0(bVar2);
                    w3Var.W = bVar2;
                }
                return qy.b0.f48488a;
        }
    }
}
