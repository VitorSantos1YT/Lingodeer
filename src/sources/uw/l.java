package uw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements ww.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f53246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f53247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f53248c;

    public l(Runnable runnable, m mVar) {
        this.f53246a = runnable;
        this.f53247b = mVar;
    }

    @Override // ww.b
    public final void dispose() {
        if (this.f53248c == Thread.currentThread()) {
            m mVar = this.f53247b;
            if (mVar instanceof kx.k) {
                kx.k kVar = (kx.k) mVar;
                if (kVar.f38912b) {
                    return;
                }
                kVar.f38912b = true;
                kVar.f38911a.shutdown();
                return;
            }
        }
        this.f53247b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f53248c = Thread.currentThread();
        try {
            this.f53246a.run();
        } finally {
            dispose();
            this.f53248c = null;
        }
    }
}
