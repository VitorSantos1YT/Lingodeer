package z2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends rz.y {
    public static final qy.q M = com.bumptech.glide.d.v(h0.f58580t);
    public static final f10.b N = new f10.b(6);
    public boolean H;
    public final l1.f L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f58637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f58638b;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f58643t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f58639c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ry.k f58640d = new ry.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f58641e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f58642f = new ArrayList();
    public final o0 K = new o0(this);

    public p0(Choreographer choreographer, Handler handler) {
        this.f58637a = choreographer;
        this.f58638b = handler;
        this.L = new l1.f(choreographer, this);
    }

    public static final void d(p0 p0Var) {
        Runnable runnable;
        boolean z11;
        do {
            synchronized (p0Var.f58639c) {
                ry.k kVar = p0Var.f58640d;
                runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (p0Var.f58639c) {
                    ry.k kVar2 = p0Var.f58640d;
                    runnable = (Runnable) (kVar2.isEmpty() ? null : kVar2.removeFirst());
                }
            }
            synchronized (p0Var.f58639c) {
                if (p0Var.f58640d.isEmpty()) {
                    z11 = false;
                    p0Var.f58643t = false;
                } else {
                    z11 = true;
                }
            }
        } while (z11);
    }

    @Override // rz.y
    public final void dispatch(vy.i iVar, Runnable runnable) {
        synchronized (this.f58639c) {
            this.f58640d.addLast(runnable);
            if (!this.f58643t) {
                this.f58643t = true;
                this.f58638b.post(this.K);
                if (!this.H) {
                    this.H = true;
                    this.f58637a.postFrameCallback(this.K);
                }
            }
        }
    }
}
