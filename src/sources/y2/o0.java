package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f56981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f56982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f56983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f56984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, long j11, long j12, x1 x1Var) {
        super(0);
        this.f56981a = q0Var;
        this.f56982b = j11;
        this.f56983c = j12;
        this.f56984d = x1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        q0 q0Var = this.f56981a;
        q0Var.N0().f56976a = false;
        q0Var.N0().f56977b = this.f56982b;
        q0Var.N0().f56978c = this.f56983c;
        fz.c cVarC = this.f56984d.f57038a.c();
        if (cVarC != null) {
            cVarC.invoke(q0Var.N0());
        }
        return qy.b0.f48488a;
    }
}
