package f7;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f26666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f26667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f26669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f26670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26671f;

    public b1(z0 z0Var, a1 a1Var, y6.o0 o0Var, int i11, Looper looper) {
        this.f26667b = z0Var;
        this.f26666a = a1Var;
        this.f26670e = looper;
    }

    public final synchronized void a(boolean z11) {
        notifyAll();
    }

    public final void b() {
        b7.a.j(!this.f26671f);
        this.f26671f = true;
        g0 g0Var = (g0) this.f26667b;
        if (!g0Var.f26756j0 && g0Var.L.getThread().isAlive()) {
            g0Var.H.a(14, this).b();
        } else {
            b7.a.B("Ignoring messages sent after release.");
            a(false);
        }
    }
}
