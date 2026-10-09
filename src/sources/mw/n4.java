package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n4 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42588b;

    public /* synthetic */ n4(int i11, int i12) {
        this.f42587a = i12;
        this.f42588b = i11;
    }

    @Override // mw.q4
    public final void a(w4 w4Var) {
        switch (this.f42587a) {
            case 0:
                w4Var.f42777a.l(this.f42588b);
                break;
            default:
                w4Var.f42777a.d(this.f42588b);
                break;
        }
    }
}
