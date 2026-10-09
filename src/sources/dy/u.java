package dy;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24616a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24619d;

    public u(Runnable runnable, w wVar, long j11) {
        this.f24618c = runnable;
        this.f24619d = wVar;
        this.f24617b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24616a) {
            case 0:
                if (!((w) this.f24619d).f24627d) {
                    long jA = ((w) this.f24619d).a(TimeUnit.MILLISECONDS);
                    long j11 = this.f24617b;
                    if (j11 > jA) {
                        try {
                            Thread.sleep(j11 - jA);
                        } catch (InterruptedException e8) {
                            Thread.currentThread().interrupt();
                            qx.p.u(e8);
                            return;
                        }
                    }
                    if (!((w) this.f24619d).f24627d) {
                        ((Runnable) this.f24618c).run();
                    }
                }
                break;
            default:
                pd.h hVar = (pd.h) this.f24619d;
                hVar.mEventLog.a(this.f24617b, (String) this.f24618c);
                hVar.mEventLog.b(hVar.toString());
                break;
        }
    }

    public u(pd.h hVar, String str, long j11) {
        this.f24619d = hVar;
        this.f24618c = str;
        this.f24617b = j11;
    }
}
