package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz.b0 f39245a;

    public c0(rz.b0 b0Var) {
        this.f39245a = b0Var;
    }

    @Override // l1.f2
    public final void a() {
        rz.b0 b0Var = this.f39245a;
        if (b0Var instanceof i2) {
            ((i2) b0Var).b();
        } else {
            rz.e0.i(b0Var, new l0(1));
        }
    }

    @Override // l1.f2
    public final void d() {
        rz.b0 b0Var = this.f39245a;
        if (b0Var instanceof i2) {
            ((i2) b0Var).b();
        } else {
            rz.e0.i(b0Var, new l0(1));
        }
    }

    @Override // l1.f2
    public final void f() {
    }
}
