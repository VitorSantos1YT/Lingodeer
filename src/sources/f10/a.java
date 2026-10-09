package f10;

import b1.p;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f26514a = new p(8, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f26515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f26516c;

    public a(e eVar) {
        this.f26515b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVarJ;
        while (true) {
            try {
                try {
                    p pVar = this.f26514a;
                    synchronized (pVar) {
                        try {
                            if (((j) pVar.f3800b) == null) {
                                pVar.wait(1000);
                            }
                            jVarJ = pVar.J();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (jVarJ == null) {
                        synchronized (this) {
                            jVarJ = this.f26514a.J();
                            if (jVarJ == null) {
                                this.f26516c = false;
                                this.f26516c = false;
                                return;
                            }
                        }
                    }
                    this.f26515b.c(jVarJ);
                } catch (InterruptedException e8) {
                    this.f26515b.f26540p.l(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e8);
                    this.f26516c = false;
                    return;
                }
            } catch (Throwable th3) {
                this.f26516c = false;
                throw th3;
            }
        }
    }
}
