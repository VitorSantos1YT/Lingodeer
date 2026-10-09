package dy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // java.lang.Runnable
    public final void run() {
        this.f24556c = Thread.currentThread();
        try {
            this.f24554a.run();
            this.f24556c = null;
        } catch (Throwable th2) {
            dispose();
            this.f24556c = null;
            qx.p.u(th2);
            throw th2;
        }
    }
}
