package pd;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.android.billingclient.api.b0;
import com.android.volley.VolleyError;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f46778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.e f46779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.d f46780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o20.i f46781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f46782e = false;

    public d(PriorityBlockingQueue priorityBlockingQueue, ob.e eVar, qd.d dVar, o20.i iVar) {
        this.f46778a = priorityBlockingQueue;
        this.f46779b = eVar;
        this.f46780c = dVar;
        this.f46781d = iVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f46782e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                p.a("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() {
        h hVar = (h) this.f46778a.take();
        o20.i iVar = this.f46781d;
        SystemClock.elapsedRealtime();
        hVar.sendEvent(3);
        try {
            hVar.addMarker("network-queue-take");
            if (hVar.isCanceled()) {
                hVar.finish(gkbGsXmgaxRjJ.HsbYvdm);
                hVar.notifyListenerResponseNotUsable();
                return;
            }
            TrafficStats.setThreadStatsTag(hVar.getTrafficStatsTag());
            e eVarV = this.f46779b.v(hVar);
            hVar.addMarker("network-http-complete");
            if (eVarV.f46786d && hVar.hasHadResponseDelivered()) {
                hVar.finish("not-modified");
                hVar.notifyListenerResponseNotUsable();
                return;
            }
            l networkResponse = hVar.parseNetworkResponse(eVarV);
            hVar.addMarker("network-parse-complete");
            if (hVar.shouldCache() && networkResponse.f46799b != null) {
                this.f46780c.f(hVar.getCacheKey(), networkResponse.f46799b);
                hVar.addMarker("network-cache-written");
            }
            hVar.markDelivered();
            iVar.d(hVar, networkResponse, null);
            hVar.notifyListenerResponseReceived(networkResponse);
        } catch (VolleyError e8) {
            SystemClock.elapsedRealtime();
            VolleyError networkError = hVar.parseNetworkError(e8);
            iVar.getClass();
            hVar.addMarker("post-error");
            ((o20.a) iVar.f44522b).execute(new b0(hVar, new l(networkError), null, 8));
            hVar.notifyListenerResponseNotUsable();
        } catch (Exception e10) {
            p.a("Unhandled exception %s", e10.toString());
            VolleyError volleyError = new VolleyError(e10);
            SystemClock.elapsedRealtime();
            iVar.getClass();
            hVar.addMarker("post-error");
            ((o20.a) iVar.f44522b).execute(new b0(hVar, new l(volleyError), null, 8));
            hVar.notifyListenerResponseNotUsable();
        } finally {
            hVar.sendEvent(4);
        }
    }
}
