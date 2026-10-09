package dy;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends qx.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rx.a f24557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rx.a f24558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rx.a f24559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f24560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f24561e;

    public b(d dVar) {
        this.f24560d = dVar;
        rx.a aVar = new rx.a(1);
        this.f24557a = aVar;
        rx.a aVar2 = new rx.a(0);
        this.f24558b = aVar2;
        rx.a aVar3 = new rx.a(1);
        this.f24559c = aVar3;
        aVar3.a(aVar);
        aVar3.a(aVar2);
    }

    @Override // rx.b
    public final boolean b() {
        return this.f24561e;
    }

    @Override // qx.n
    public final rx.b c(Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.f24561e ? ux.c.INSTANCE : this.f24560d.f(runnable, j11, timeUnit, this.f24558b);
    }

    @Override // qx.n
    public final void d(Runnable runnable) {
        if (this.f24561e) {
            return;
        }
        this.f24560d.f(runnable, 0L, TimeUnit.MILLISECONDS, this.f24557a);
    }

    @Override // rx.b
    public final void dispose() {
        if (this.f24561e) {
            return;
        }
        this.f24561e = true;
        this.f24559c.dispose();
    }
}
