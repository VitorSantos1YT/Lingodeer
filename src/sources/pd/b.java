package pd;

import android.os.Process;
import aw.t;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f46769t = p.f46808a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f46770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f46771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.d f46772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o20.i f46773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f46774e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ob.i f46775f;

    public b(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, qd.d dVar, o20.i iVar) {
        this.f46770a = priorityBlockingQueue;
        this.f46771b = priorityBlockingQueue2;
        this.f46772c = dVar;
        this.f46773d = iVar;
        this.f46775f = new ob.i(this, priorityBlockingQueue2, iVar);
    }

    private void a() {
        h hVar = (h) this.f46770a.take();
        hVar.addMarker("cache-queue-take");
        hVar.sendEvent(1);
        try {
            if (hVar.isCanceled()) {
                hVar.finish("cache-discard-canceled");
                hVar.sendEvent(2);
                return;
            }
            a aVarA = this.f46772c.a(hVar.getCacheKey());
            if (aVarA == null) {
                hVar.addMarker("cache-miss");
                if (!this.f46775f.q(hVar)) {
                    this.f46771b.put(hVar);
                }
                hVar.sendEvent(2);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVarA.f46765e < jCurrentTimeMillis) {
                hVar.addMarker("cache-hit-expired");
                hVar.setCacheEntry(aVarA);
                if (!this.f46775f.q(hVar)) {
                    this.f46771b.put(hVar);
                }
                hVar.sendEvent(2);
                return;
            }
            hVar.addMarker("cache-hit");
            l networkResponse = hVar.parseNetworkResponse(new e(aVarA.f46761a, aVarA.f46767g));
            hVar.addMarker("cache-hit-parsed");
            if (networkResponse.f46800c == null) {
                if (aVarA.f46766f < jCurrentTimeMillis) {
                    hVar.addMarker("cache-hit-refresh-needed");
                    hVar.setCacheEntry(aVarA);
                    networkResponse.f46801d = true;
                    if (this.f46775f.q(hVar)) {
                        this.f46773d.d(hVar, networkResponse, null);
                    } else {
                        this.f46773d.d(hVar, networkResponse, new t(19, this, hVar));
                    }
                } else {
                    this.f46773d.d(hVar, networkResponse, null);
                }
                hVar.sendEvent(2);
                return;
            }
            hVar.addMarker("cache-parsing-failed");
            qd.d dVar = this.f46772c;
            String cacheKey = hVar.getCacheKey();
            synchronized (dVar) {
                a aVarA2 = dVar.a(cacheKey);
                if (aVarA2 != null) {
                    aVarA2.f46766f = 0L;
                    aVarA2.f46765e = 0L;
                    dVar.f(cacheKey, aVarA2);
                }
            }
            hVar.setCacheEntry(null);
            if (!this.f46775f.q(hVar)) {
                this.f46771b.put(hVar);
            }
            hVar.sendEvent(2);
        } catch (Throwable th2) {
            hVar.sendEvent(2);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f46769t) {
            p.b("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f46772c.d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f46774e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                p.a("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
