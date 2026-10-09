package mw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends lw.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.y f42529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f42530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f42531c = new ArrayList();

    public m0(lw.y yVar) {
        this.f42529a = yVar;
    }

    @Override // lw.y
    public final void h(lw.q1 q1Var, lw.c1 c1Var) {
        r(new com.android.billingclient.api.b0(5, this, q1Var, c1Var, false));
    }

    @Override // lw.y
    public final void j(lw.c1 c1Var) {
        if (this.f42530b) {
            this.f42529a.j(c1Var);
        } else {
            r(new i0(3, this, c1Var));
        }
    }

    @Override // lw.y
    public final void k(Object obj) {
        if (this.f42530b) {
            this.f42529a.k(obj);
        } else {
            r(new i0(4, this, obj));
        }
    }

    @Override // lw.y
    public final void l() {
        if (this.f42530b) {
            this.f42529a.l();
        } else {
            r(new aj.i(this, 9));
        }
    }

    public final void r(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f42530b) {
                    runnable.run();
                } else {
                    this.f42531c.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
