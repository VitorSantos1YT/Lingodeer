package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f42727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r5 f42728c;

    public /* synthetic */ u4(r5 r5Var, w4 w4Var, int i11) {
        this.f42726a = i11;
        this.f42728c = r5Var;
        this.f42727b = w4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f42726a;
        r5 r5Var = this.f42728c;
        switch (i11) {
            case 0:
                ((n2) r5Var.f42668b).f42573b.execute(new aj.i(this, 21));
                break;
            default:
                n2 n2Var = (n2) r5Var.f42668b;
                lw.x0 x0Var = n2.f42567g0;
                n2Var.m(this.f42727b);
                break;
        }
    }
}
