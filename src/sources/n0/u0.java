package n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f43006b;

    public /* synthetic */ u0(v0 v0Var, int i11) {
        this.f43005a = i11;
        this.f43006b = v0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f43005a) {
            case 0:
                return Float.valueOf(this.f43006b.R.b());
            case 1:
                return Float.valueOf(this.f43006b.R.d());
            default:
                v0 v0Var = this.f43006b;
                return Float.valueOf(v0Var.R.a() - v0Var.R.c());
        }
    }
}
