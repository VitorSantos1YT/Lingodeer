package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f3676b;

    public /* synthetic */ s1(c2 c2Var, int i11) {
        this.f3675a = i11;
        this.f3676b = c2Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f3675a) {
            case 0:
                c2 c2Var = this.f3676b;
                return Boolean.valueOf((kotlin.jvm.internal.m.a(c2Var.f3461d.getValue(), c2Var.f3458a.Y()) && c2Var.f3464g.l() == Long.MIN_VALUE && !((Boolean) c2Var.f3465h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f3676b.b());
        }
    }
}
