package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d8 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5329b;

    public /* synthetic */ d8(ys.d0 d0Var, int i11) {
        this.f5328a = i11;
        this.f5329b = d0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5328a) {
            case 0:
                ys.d0 d0Var = this.f5329b;
                return Long.valueOf(d0Var != null ? d0Var.f57964g.c() : 0L);
            default:
                ys.d0 d0Var2 = this.f5329b;
                if (d0Var2 != null) {
                    d0Var2.f();
                }
                return qy.b0.f48488a;
        }
    }
}
