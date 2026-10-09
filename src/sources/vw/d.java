package vw;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Runnable, ww.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f54308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f54309b;

    public d(Handler handler, Runnable runnable) {
        this.f54308a = handler;
        this.f54309b = runnable;
    }

    @Override // ww.b
    public final void dispose() {
        this.f54308a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f54309b.run();
        } catch (Throwable th2) {
            qx.b.B(th2);
        }
    }
}
