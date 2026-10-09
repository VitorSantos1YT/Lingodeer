package qh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements tx.c, th.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f47741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f47742c;

    public /* synthetic */ a0(c0 c0Var, boolean z11, int i11) {
        this.f47740a = i11;
        this.f47741b = c0Var;
        this.f47742c = z11;
    }

    @Override // th.c, th.b
    public void a() {
        c0.x(this.f47741b, this.f47742c);
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f47740a) {
            case 0:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                c0 c0Var = this.f47741b;
                sh.c cVar = c0Var.S;
                if (cVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (cVar.f51691f) {
                    cVar.K = true;
                    return;
                } else {
                    c0Var.y(this.f47742c);
                    return;
                }
            case 1:
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                c0.x(this.f47741b, this.f47742c);
                return;
            case 2:
                Long it3 = (Long) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                c0.x(this.f47741b, this.f47742c);
                return;
        }
    }
}
