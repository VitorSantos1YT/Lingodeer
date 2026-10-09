package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b5 extends f1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lw.a f42363g = new lw.a("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f42364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lw.t1 f42365f;

    public b5(w0 w0Var, j jVar, lw.t1 t1Var) {
        super(w0Var);
        this.f42364e = jVar;
        this.f42365f = t1Var;
    }

    @Override // mw.f1, lw.f
    public final void n() {
        super.n();
        j jVar = this.f42364e;
        lw.t1 t1Var = jVar.f42474b;
        t1Var.d();
        t1Var.execute(new lf.i0(jVar, 2));
    }

    @Override // mw.f1, lw.f
    public final void o(lw.y yVar) {
        super.o(new a5(this, yVar));
    }
}
