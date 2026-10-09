package mt;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.a2 f41397b;

    public /* synthetic */ f1(rt.a2 a2Var, int i11) {
        this.f41396a = i11;
        this.f41397b = a2Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41396a) {
            case 0:
                this.f41397b.j(null);
                break;
            case 1:
                rt.a2 a2Var = this.f41397b;
                Set set = (Set) a2Var.L.getValue();
                if (!set.isEmpty()) {
                    a2Var.d();
                    a2Var.l(set, false);
                }
                return qy.b0.f48488a;
            case 2:
                this.f41397b.d();
                break;
            default:
                this.f41397b.k();
                break;
        }
        return qy.b0.f48488a;
    }
}
