package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f30232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(t3 t3Var, int i11) {
        super(1);
        this.f30231a = i11;
        this.f30232b = t3Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f30231a) {
            case 0:
                int i11 = ((x3) obj).f31299a;
                t3 t3Var = this.f30232b;
                Long lC = t3Var.c();
                if (lC != null) {
                    t3Var.d(t3Var.f31098b.f(lC.longValue()).f34110e);
                }
                t3Var.f31103g.setValue(new x3(i11));
                break;
            default:
                this.f30232b.d(((Number) obj).longValue());
                break;
        }
        return qy.b0.f48488a;
    }
}
