package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f42478b;

    public /* synthetic */ j0(n0 n0Var, int i11) {
        this.f42477a = i11;
        this.f42478b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42477a) {
            case 0:
                this.f42478b.f42560i.l();
                break;
            default:
                this.f42478b.f42560i.g();
                break;
        }
    }
}
