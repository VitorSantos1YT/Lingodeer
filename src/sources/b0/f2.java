package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements l1.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f3533b;

    public /* synthetic */ f2(c2 c2Var, int i11) {
        this.f3532a = i11;
        this.f3533b = c2Var;
    }

    @Override // l1.i0
    public final void dispose() {
        switch (this.f3532a) {
            case 0:
                c2 c2Var = this.f3533b;
                c2Var.i();
                c2Var.f3458a.q0();
                break;
            default:
                c2 c2Var2 = this.f3533b;
                c2Var2.i();
                c2Var2.f3458a.q0();
                break;
        }
    }
}
