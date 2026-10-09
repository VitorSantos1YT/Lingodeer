package qx;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f48473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ux.d f48474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f48476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f48477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f48478f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f48479t;

    public m(n nVar, long j11, Runnable runnable, long j12, ux.d dVar, long j13) {
        this.f48479t = nVar;
        this.f48473a = runnable;
        this.f48474b = dVar;
        this.f48475c = j13;
        this.f48477e = j12;
        this.f48478f = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j11;
        this.f48473a.run();
        ux.d dVar = this.f48474b;
        if (dVar.b()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        n nVar = this.f48479t;
        long jA = nVar.a(timeUnit);
        long j12 = o.f48481b;
        long j13 = jA + j12;
        long j14 = this.f48477e;
        long j15 = this.f48475c;
        if (j13 < j14 || jA >= j14 + j15 + j12) {
            j11 = jA + j15;
            long j16 = this.f48476d + 1;
            this.f48476d = j16;
            this.f48478f = j11 - (j15 * j16);
        } else {
            long j17 = this.f48478f;
            long j18 = this.f48476d + 1;
            this.f48476d = j18;
            j11 = (j18 * j15) + j17;
        }
        this.f48477e = jA;
        rx.b bVarC = nVar.c(this, j11 - jA, timeUnit);
        dVar.getClass();
        ux.b.c(dVar, bVarC);
    }
}
