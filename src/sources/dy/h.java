package dy;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends qx.n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f24583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f24584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24585d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rx.a f24582a = new rx.a(0);

    public h(g gVar) {
        i iVar;
        i iVar2;
        this.f24583b = gVar;
        if (gVar.f24578c.f50825b) {
            iVar2 = j.f24591h;
        } else {
            do {
                if (gVar.f24577b.isEmpty()) {
                    iVar = new i(gVar.f24581f);
                    gVar.f24578c.a(iVar);
                    break;
                }
                iVar = (i) gVar.f24577b.poll();
            } while (iVar == null);
            iVar2 = iVar;
        }
        this.f24584c = iVar2;
    }

    @Override // rx.b
    public final boolean b() {
        return this.f24585d.get();
    }

    @Override // qx.n
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f24582a.f50825b ? ux.c.INSTANCE : this.f24584c.f(runnable, j11, timeUnit, this.f24582a);
    }

    @Override // rx.b
    public final void dispose() {
        if (this.f24585d.compareAndSet(false, true)) {
            this.f24582a.dispose();
            if (j.f24592i) {
                this.f24584c.f(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            g gVar = this.f24583b;
            gVar.getClass();
            long jNanoTime = System.nanoTime() + gVar.f24576a;
            i iVar = this.f24584c;
            iVar.f24586c = jNanoTime;
            gVar.f24577b.offer(iVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f24583b;
        gVar.getClass();
        long jNanoTime = System.nanoTime() + gVar.f24576a;
        i iVar = this.f24584c;
        iVar.f24586c = jNanoTime;
        gVar.f24577b.offer(iVar);
    }
}
