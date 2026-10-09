package px;

import android.os.Handler;
import qx.n;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Runnable, rx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f47203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f47205d;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f47202a = i11;
        this.f47204c = obj;
        this.f47205d = obj2;
    }

    @Override // rx.b
    public final boolean b() {
        switch (this.f47202a) {
            case 0:
                break;
        }
        return this.f47203b;
    }

    @Override // rx.b
    public final void dispose() {
        switch (this.f47202a) {
            case 0:
                ((Handler) this.f47204c).removeCallbacks(this);
                this.f47203b = true;
                break;
            default:
                this.f47203b = true;
                ((n) this.f47205d).dispose();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47202a) {
            case 0:
                try {
                    ((Runnable) this.f47205d).run();
                    return;
                } catch (Throwable th2) {
                    p.u(th2);
                    return;
                }
            default:
                if (this.f47203b) {
                    return;
                }
                try {
                    this.f47204c.run();
                    return;
                } catch (Throwable th3) {
                    dispose();
                    p.u(th3);
                    throw th3;
                }
        }
    }
}
