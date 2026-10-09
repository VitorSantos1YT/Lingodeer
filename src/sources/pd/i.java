package pd;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f46787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f46788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f46789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f46790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd.d f46791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ob.e f46792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o20.i f46793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d[] f46794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f46795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f46796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f46797k;

    public i(qd.d dVar, ob.e eVar) {
        o20.i iVar = new o20.i(new Handler(Looper.getMainLooper()));
        this.f46787a = new AtomicInteger();
        this.f46788b = new HashSet();
        this.f46789c = new PriorityBlockingQueue();
        this.f46790d = new PriorityBlockingQueue();
        this.f46796j = new ArrayList();
        this.f46797k = new ArrayList();
        this.f46791e = dVar;
        this.f46792f = eVar;
        this.f46794h = new d[4];
        this.f46793g = iVar;
    }

    public final void a(h hVar) {
        hVar.setRequestQueue(this);
        synchronized (this.f46788b) {
            this.f46788b.add(hVar);
        }
        hVar.setSequence(this.f46787a.incrementAndGet());
        hVar.addMarker("add-to-queue");
        b();
        if (hVar.shouldCache()) {
            this.f46789c.add(hVar);
        } else {
            this.f46790d.add(hVar);
        }
    }

    public final void b() {
        synchronized (this.f46797k) {
            try {
                Iterator it = this.f46797k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
