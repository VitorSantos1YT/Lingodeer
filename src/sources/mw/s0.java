package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f42674c;

    public /* synthetic */ s0(p0 p0Var, int i11, int i12) {
        this.f42672a = i12;
        this.f42674c = p0Var;
        this.f42673b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42672a) {
            case 0:
                this.f42674c.f42612c.l(this.f42673b);
                break;
            default:
                this.f42674c.f42612c.d(this.f42673b);
                break;
        }
    }
}
