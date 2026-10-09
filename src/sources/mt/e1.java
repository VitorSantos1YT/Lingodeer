package mt;

import java.util.Set;
import rt.ke;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.a2 f41374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41375c;

    public /* synthetic */ e1(rt.a2 a2Var, l1.b1 b1Var, int i11) {
        this.f41373a = i11;
        this.f41374b = a2Var;
        this.f41375c = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41373a) {
            case 0:
                this.f41375c.setValue(Boolean.FALSE);
                rt.a2 a2Var = this.f41374b;
                Set set = (Set) a2Var.L.getValue();
                if (!set.isEmpty() && a2Var.f49423f.getValue() != ke.HIDDEN) {
                    a2Var.d();
                    a2Var.l(set, true);
                }
                return qy.b0.f48488a;
            case 1:
                this.f41375c.setValue(Boolean.FALSE);
                this.f41374b.k();
                break;
            default:
                this.f41375c.setValue(Boolean.FALSE);
                this.f41374b.k();
                break;
        }
        return qy.b0.f48488a;
    }
}
