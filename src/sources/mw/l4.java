package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l4 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42527b;

    public /* synthetic */ l4(Object obj, int i11) {
        this.f42526a = i11;
        this.f42527b = obj;
    }

    @Override // mw.q4
    public final void a(w4 w4Var) {
        switch (this.f42526a) {
            case 0:
                w4Var.f42777a.c((lw.l) this.f42527b);
                break;
            case 1:
                w4Var.f42777a.s((lw.s) this.f42527b);
                break;
            default:
                w4Var.f42777a.r((lw.u) this.f42527b);
                break;
        }
    }
}
