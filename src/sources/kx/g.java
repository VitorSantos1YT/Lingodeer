package kx;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends uw.m implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f38897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f38898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f38899d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ww.a f38896a = new ww.a(0);

    public g(f fVar) {
        h hVar;
        h hVar2;
        this.f38897b = fVar;
        if (fVar.f38892c.f55492b) {
            hVar2 = i.f38905f;
        } else {
            do {
                if (fVar.f38891b.isEmpty()) {
                    hVar = new h(fVar.f38895f);
                    fVar.f38892c.a(hVar);
                    break;
                }
                hVar = (h) fVar.f38891b.poll();
            } while (hVar == null);
            hVar2 = hVar;
        }
        this.f38898c = hVar2;
    }

    @Override // uw.m
    public final ww.b a(Runnable runnable, TimeUnit timeUnit) {
        return this.f38896a.f55492b ? zw.b.INSTANCE : this.f38898c.c(runnable, TimeUnit.NANOSECONDS, this.f38896a);
    }

    @Override // ww.b
    public final void dispose() {
        if (this.f38899d.compareAndSet(false, true)) {
            this.f38896a.dispose();
            boolean z11 = i.f38906g;
            h hVar = this.f38898c;
            if (z11) {
                hVar.c(this, TimeUnit.NANOSECONDS, null);
                return;
            }
            f fVar = this.f38897b;
            fVar.getClass();
            hVar.f38900c = System.nanoTime() + fVar.f38890a;
            fVar.f38891b.offer(hVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f38897b;
        fVar.getClass();
        long jNanoTime = System.nanoTime() + fVar.f38890a;
        h hVar = this.f38898c;
        hVar.f38900c = jNanoTime;
        fVar.f38891b.offer(hVar);
    }
}
