package mw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f42685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f42686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f42687c = new ArrayList();

    public t0(y yVar) {
        this.f42685a = yVar;
    }

    public final void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f42686b) {
                    runnable.run();
                } else {
                    this.f42687c.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mw.y
    public final void e(dm.a aVar) {
        if (this.f42686b) {
            this.f42685a.e(aVar);
        } else {
            a(new i0(11, this, aVar));
        }
    }

    @Override // mw.y
    public final void f(lw.q1 q1Var, x xVar, lw.c1 c1Var) {
        a(new a(this, q1Var, xVar, c1Var, 1));
    }

    @Override // mw.y
    public final void h() {
        if (this.f42686b) {
            this.f42685a.h();
        } else {
            a(new aj.i(this, 10));
        }
    }

    @Override // mw.y
    public final void j(lw.c1 c1Var) {
        a(new i0(12, this, c1Var));
    }
}
