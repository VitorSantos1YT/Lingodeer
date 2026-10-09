package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(k1 k1Var, int i11) {
        super(1);
        this.f114a = i11;
        this.f115b = k1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        b0.c0 c0Var;
        b0.c0 c0Var2;
        switch (this.f114a) {
            case 0:
                b0.w1 w1Var = (b0.w1) obj;
                v0 v0Var = v0.PreEnter;
                v0 v0Var2 = v0.Visible;
                boolean zB = w1Var.b(v0Var, v0Var2);
                Object obj2 = null;
                k1 k1Var = this.f115b;
                if (zB) {
                    n0 n0Var = k1Var.V.f132a.f55c;
                    if (n0Var != null) {
                        obj2 = n0Var.f149c;
                    }
                } else if (w1Var.b(v0Var2, v0.PostExit)) {
                    n0 n0Var2 = k1Var.W.f143a.f55c;
                    if (n0Var2 != null) {
                        obj2 = n0Var2.f149c;
                    }
                } else {
                    obj2 = f1.f81d;
                }
                return obj2 == null ? f1.f81d : obj2;
            default:
                b0.w1 w1Var2 = (b0.w1) obj;
                v0 v0Var3 = v0.PreEnter;
                v0 v0Var4 = v0.Visible;
                boolean zB2 = w1Var2.b(v0Var3, v0Var4);
                k1 k1Var2 = this.f115b;
                if (zB2) {
                    a2 a2Var = k1Var2.V.f132a.f54b;
                    return (a2Var == null || (c0Var2 = a2Var.f16b) == null) ? f1.f80c : c0Var2;
                }
                if (!w1Var2.b(v0Var4, v0.PostExit)) {
                    return f1.f80c;
                }
                a2 a2Var2 = k1Var2.W.f143a.f54b;
                return (a2Var2 == null || (c0Var = a2Var2.f16b) == null) ? f1.f80c : c0Var;
        }
    }
}
