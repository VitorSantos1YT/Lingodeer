package qx;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements rx.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f48470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f48471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f48472c;

    public l(Runnable runnable, n nVar) {
        this.f48470a = runnable;
        this.f48471b = nVar;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f48471b.b();
    }

    @Override // rx.b
    public final void dispose() {
        if (this.f48472c == Thread.currentThread()) {
            n nVar = this.f48471b;
            if (nVar instanceof dy.l) {
                dy.l lVar = (dy.l) nVar;
                if (lVar.f24598b) {
                    return;
                }
                lVar.f24598b = true;
                lVar.f24597a.shutdown();
                return;
            }
        }
        this.f48471b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48472c = Thread.currentThread();
        try {
            this.f48470a.run();
            dispose();
            this.f48472c = null;
        } catch (Throwable th2) {
            try {
                p.u(th2);
                throw th2;
            } catch (Throwable th3) {
                dispose();
                this.f48472c = null;
                throw th3;
            }
        }
    }
}
