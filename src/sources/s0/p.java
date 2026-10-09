package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f51128b;

    public /* synthetic */ p(q1 q1Var, int i11) {
        this.f51127a = i11;
        this.f51128b = q1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        j3.t0 t0Var;
        switch (this.f51127a) {
            case 0:
                q1 q1Var = this.f51128b;
                return Boolean.valueOf(q1Var != null ? ((Boolean) new p(q1Var, 2).invoke()).booleanValue() : false);
            case 1:
                q1 q1Var2 = this.f51128b;
                return Boolean.valueOf(q1Var2 != null ? ((Boolean) new p(q1Var2, 2).invoke()).booleanValue() : false);
            default:
                q1 q1Var3 = this.f51128b;
                j3.h hVar = q1Var3.f51144b;
                j3.u0 u0Var = (j3.u0) q1Var3.f51143a.getValue();
                return Boolean.valueOf(kotlin.jvm.internal.m.a(hVar, (u0Var == null || (t0Var = u0Var.f35797a) == null) ? null : t0Var.f35784a));
        }
    }
}
