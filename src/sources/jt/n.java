package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements l1.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av.j0 f37077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ av.i f37078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ av.n f37079d;

    public /* synthetic */ n(av.j0 j0Var, av.i iVar, av.n nVar, int i11) {
        this.f37076a = i11;
        this.f37077b = j0Var;
        this.f37078c = iVar;
        this.f37079d = nVar;
    }

    @Override // l1.i0
    public final void dispose() {
        switch (this.f37076a) {
            case 0:
                this.f37077b.b();
                this.f37078c.c();
                this.f37079d.b();
                break;
            case 1:
                this.f37077b.b();
                this.f37078c.c();
                this.f37079d.b();
                break;
            default:
                this.f37077b.b();
                this.f37078c.c();
                this.f37079d.b();
                break;
        }
    }
}
