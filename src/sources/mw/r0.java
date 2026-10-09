package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f42656b;

    public /* synthetic */ r0(p0 p0Var, int i11) {
        this.f42655a = i11;
        this.f42656b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42655a) {
            case 0:
                this.f42656b.f42612c.e();
                break;
            case 1:
                this.f42656b.f42612c.q();
                break;
            case 2:
                this.f42656b.b();
                break;
            case 3:
                this.f42656b.f42612c.flush();
                break;
            default:
                this.f42656b.f42612c.h();
                break;
        }
    }
}
