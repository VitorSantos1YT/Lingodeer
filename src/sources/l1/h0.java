package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f39311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f39312b;

    public h0(fz.c cVar) {
        this.f39311a = cVar;
    }

    @Override // l1.f2
    public final void d() {
        i0 i0Var = this.f39312b;
        if (i0Var != null) {
            i0Var.dispose();
        }
        this.f39312b = null;
    }

    @Override // l1.f2
    public final void f() {
        this.f39312b = (i0) this.f39311a.invoke(t.f39464c);
    }

    @Override // l1.f2
    public final void a() {
    }
}
