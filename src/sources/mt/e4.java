package mt;

import rt.xb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.e3 f41383b;

    public /* synthetic */ e4(rt.e3 e3Var, int i11) {
        this.f41382a = i11;
        this.f41383b = e3Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41382a) {
            case 0:
                this.f41383b.t(xb.f50655a);
                return qy.b0.f48488a;
            case 1:
                return Integer.valueOf(this.f41383b.Q);
            default:
                return this.f41383b.f50720t;
        }
    }
}
