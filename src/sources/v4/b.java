package v4;

import qa.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f53506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f53508c;

    public void a() {
        synchronized (this) {
            try {
                if (this.f53506a) {
                    return;
                }
                this.f53506a = true;
                this.f53507b = true;
                com.google.firebase.crashlytics.internal.concurrency.a aVar = (com.google.firebase.crashlytics.internal.concurrency.a) this.f53508c;
                if (aVar != null) {
                    try {
                        Runnable runnable = (Runnable) aVar.f18380b;
                        v vVar = (v) aVar.f18381c;
                        Runnable runnable2 = (Runnable) aVar.f18382d;
                        if (runnable == null) {
                            vVar.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f53507b = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    this.f53507b = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
