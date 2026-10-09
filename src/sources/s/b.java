package s;

import android.os.Looper;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f50980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f50981d = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f50982b = new d();

    public static b M() {
        if (f50980c != null) {
            return f50980c;
        }
        synchronized (b.class) {
            try {
                if (f50980c == null) {
                    f50980c = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f50980c;
    }

    public final void N(Runnable runnable) {
        d dVar = this.f50982b;
        if (dVar.f50986d == null) {
            synchronized (dVar.f50984b) {
                try {
                    if (dVar.f50986d == null) {
                        dVar.f50986d = d.M(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        dVar.f50986d.post(runnable);
    }
}
