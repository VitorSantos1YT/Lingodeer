package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w1 f42688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f42689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f42690c;

    public t1(a2 a2Var, w1 w1Var, boolean z11) {
        this.f42690c = a2Var;
        this.f42688a = w1Var;
        this.f42689b = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42690c.f42327t.r0(this.f42688a, this.f42689b);
    }
}
