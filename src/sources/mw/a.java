package mw;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f42302e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f42298a = i11;
        this.f42302e = obj;
        this.f42299b = obj2;
        this.f42300c = obj3;
        this.f42301d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42298a) {
            case 0:
                ((b) this.f42302e).b((lw.q1) this.f42299b, (x) this.f42300c, (lw.c1) this.f42301d);
                return;
            case 1:
                ((t0) this.f42302e).f42685a.f((lw.q1) this.f42299b, (x) this.f42300c, (lw.c1) this.f42301d);
                return;
            case 2:
                n2 n2Var = (n2) this.f42302e;
                n2Var.f42574b0 = true;
                n2Var.W.f((lw.q1) this.f42299b, (x) this.f42300c, (lw.c1) this.f42301d);
                return;
            case 3:
                synchronized (((m5) this.f42302e)) {
                    try {
                        if (((k5) this.f42299b).f42517b == 0) {
                            try {
                                ((l5) this.f42300c).g(this.f42301d);
                                ((m5) this.f42302e).f42550a.remove((l5) this.f42300c);
                                if (((m5) this.f42302e).f42550a.isEmpty()) {
                                    ((m5) this.f42302e).f42552c.shutdown();
                                    ((m5) this.f42302e).f42552c = null;
                                }
                            } catch (Throwable th2) {
                                ((m5) this.f42302e).f42550a.remove((l5) this.f42300c);
                                if (((m5) this.f42302e).f42550a.isEmpty()) {
                                    ((m5) this.f42302e).f42552c.shutdown();
                                    ((m5) this.f42302e).f42552c = null;
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 4:
                q.f fVar = (q.f) ((o20.i) this.f42302e).f44522b;
                q.n nVar = (q.n) this.f42300c;
                q.e eVar = (q.e) this.f42299b;
                if (eVar != null) {
                    fVar.f47259b0 = true;
                    eVar.f47255b.c(false);
                    fVar.f47259b0 = false;
                }
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((q.l) this.f42301d).q(nVar, null, 4);
                    return;
                }
                return;
            case 5:
                rz.m mVar = (rz.m) this.f42300c;
                try {
                    rz.e0.F(((vy.i) this.f42299b).minusKey(vy.e.f54320a), new uz.h0((w9.s) this.f42301d, mVar, (ca.d) this.f42302e, (vy.d) null, 3));
                    return;
                } catch (Throwable th4) {
                    mVar.k(th4);
                    return;
                }
            default:
                z4.a1.i((View) this.f42299b, (z4.g1) this.f42300c, (qp.o2) this.f42301d);
                ((ValueAnimator) this.f42302e).start();
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i11, boolean z11) {
        this.f42298a = i11;
        this.f42299b = obj;
        this.f42300c = obj2;
        this.f42301d = obj3;
        this.f42302e = obj4;
    }
}
