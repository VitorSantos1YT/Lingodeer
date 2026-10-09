package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements g3.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f58683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f58684b;

    public v(g2.w0 w0Var) {
        this.f58684b = w0Var;
    }

    @Override // g3.b0
    public final void b(g3.a0 a0Var, Object obj) {
        if (obj == this.f58684b) {
            this.f58683a = true;
        }
    }
}
