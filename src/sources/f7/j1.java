package f7;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.y f26814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y6.e0 f26818e = y6.e0.f57184d;

    public j1(b7.y yVar) {
        this.f26814a = yVar;
    }

    public final void a(long j11) {
        this.f26816c = j11;
        if (this.f26815b) {
            this.f26814a.getClass();
            this.f26817d = SystemClock.elapsedRealtime();
        }
    }

    @Override // f7.k0
    public final y6.e0 b() {
        return this.f26818e;
    }

    @Override // f7.k0
    public final void c(y6.e0 e0Var) {
        if (this.f26815b) {
            a(d());
        }
        this.f26818e = e0Var;
    }

    @Override // f7.k0
    public final long d() {
        long j11 = this.f26816c;
        if (!this.f26815b) {
            return j11;
        }
        this.f26814a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f26817d;
        y6.e0 e0Var = this.f26818e;
        return (e0Var.f57185a == 1.0f ? b7.f0.K(jElapsedRealtime) : jElapsedRealtime * ((long) e0Var.f57187c)) + j11;
    }

    public final void f() {
        if (this.f26815b) {
            return;
        }
        this.f26814a.getClass();
        this.f26817d = SystemClock.elapsedRealtime();
        this.f26815b = true;
    }
}
