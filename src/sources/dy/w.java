package dy;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends qx.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f24624a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f24625b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f24626c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f24627d;

    @Override // rx.b
    public final boolean b() {
        return this.f24627d;
    }

    @Override // qx.n
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j11) + a(TimeUnit.MILLISECONDS);
        return f(new u(runnable, this, millis), millis);
    }

    @Override // qx.n
    public final void d(Runnable runnable) {
        f(runnable, a(TimeUnit.MILLISECONDS));
    }

    @Override // rx.b
    public final void dispose() {
        this.f24627d = true;
    }

    public final rx.b f(Runnable runnable, long j11) {
        if (this.f24627d) {
            return ux.c.INSTANCE;
        }
        v vVar = new v(runnable, Long.valueOf(j11), this.f24626c.incrementAndGet());
        this.f24624a.add(vVar);
        if (this.f24625b.getAndIncrement() != 0) {
            return new rx.d(new aw.t(7, this, vVar));
        }
        int iAddAndGet = 1;
        while (!this.f24627d) {
            v vVar2 = (v) this.f24624a.poll();
            if (vVar2 == null) {
                iAddAndGet = this.f24625b.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return ux.c.INSTANCE;
                }
            } else if (!vVar2.f24623d) {
                vVar2.f24620a.run();
            }
        }
        this.f24624a.clear();
        return ux.c.INSTANCE;
    }
}
