package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f50959c;

    public u0(Runnable runnable, long j11) {
        super(j11);
        this.f50959c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f50959c.run();
    }

    @Override // rz.v0
    public final String toString() {
        return super.toString() + this.f50959c;
    }
}
