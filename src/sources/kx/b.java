package kx;

import ex.u0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends uw.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ww.a f38877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ww.a f38878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ww.a f38879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f38880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f38881e;

    public b(d dVar) {
        this.f38880d = dVar;
        ww.a aVar = new ww.a(1);
        this.f38877a = aVar;
        ww.a aVar2 = new ww.a(0);
        this.f38878b = aVar2;
        ww.a aVar3 = new ww.a(1);
        this.f38879c = aVar3;
        aVar3.a(aVar);
        aVar3.a(aVar2);
    }

    @Override // uw.m
    public final ww.b a(Runnable runnable, TimeUnit timeUnit) {
        return this.f38881e ? zw.b.INSTANCE : this.f38880d.c(runnable, TimeUnit.NANOSECONDS, this.f38878b);
    }

    @Override // uw.m
    public final void b(u0 u0Var) {
        if (this.f38881e) {
            return;
        }
        this.f38880d.c(u0Var, TimeUnit.MILLISECONDS, this.f38877a);
    }

    @Override // ww.b
    public final void dispose() {
        if (this.f38881e) {
            return;
        }
        this.f38881e = true;
        this.f38879c.dispose();
    }
}
