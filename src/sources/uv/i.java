package uv;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadPoolExecutor f53209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f53210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f53211g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53214c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f53215d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f53212a = new Handler(Looper.getMainLooper(), new h(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f53213b = new LinkedBlockingQueue();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ew.b("BlockCompleted"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f53209e = threadPoolExecutor;
        f53210f = 10;
        f53211g = 5;
    }

    public static boolean a(j jVar) {
        if (((aw.p) jVar.f53218c.peek()).k() != 4) {
            return false;
        }
        f53209e.execute(new py.b(jVar, 6));
        return true;
    }

    public final void b() {
        synchronized (this.f53214c) {
            try {
                if (this.f53215d.isEmpty()) {
                    if (this.f53213b.isEmpty()) {
                        return;
                    }
                    int i11 = f53210f;
                    if (i11 > 0) {
                        int iMin = Math.min(this.f53213b.size(), f53211g);
                        for (int i12 = 0; i12 < iMin; i12++) {
                            this.f53215d.add((j) this.f53213b.remove());
                        }
                    } else {
                        this.f53213b.drainTo(this.f53215d);
                        i11 = 0;
                    }
                    Handler handler = this.f53212a;
                    handler.sendMessageDelayed(handler.obtainMessage(2, this.f53215d), i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
