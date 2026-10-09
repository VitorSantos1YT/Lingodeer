package iv;

import rt.xb;
import rt.yb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mv.k0 f34715b;

    public /* synthetic */ e1(mv.k0 k0Var, int i11) {
        this.f34714a = i11;
        this.f34715b = k0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f34714a) {
            case 0:
                this.f34715b.t(xb.f50655a);
                return qy.b0.f48488a;
            case 1:
                this.f34715b.t(yb.f50724a);
                return qy.b0.f48488a;
            case 2:
                return Integer.valueOf(this.f34715b.Q);
            default:
                return this.f34715b.f42235r0;
        }
    }
}
