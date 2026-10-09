package mw;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f42483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f42484b = new AtomicInteger(-2147483647);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile lw.q1 f42485c;

    public k(l lVar, f0 f0Var, String str) {
        new n3(this);
        Preconditions.k(f0Var, "delegate");
        this.f42483a = f0Var;
    }

    @Override // mw.z
    public final w b(lw.e1 e1Var, lw.c1 c1Var, lw.c cVar, lw.j[] jVarArr) {
        cVar.getClass();
        return this.f42484b.get() >= 0 ? new z0(this.f42485c, x.PROCESSED, jVarArr) : this.f42483a.b(e1Var, c1Var, cVar, jVarArr);
    }

    @Override // mw.d1, mw.g3
    public final void c(lw.q1 q1Var) {
        Preconditions.k(q1Var, "status");
        synchronized (this) {
            try {
                if (this.f42484b.get() < 0) {
                    this.f42485c = q1Var;
                    this.f42484b.addAndGet(Integer.MAX_VALUE);
                    if (this.f42484b.get() != 0) {
                        return;
                    }
                    super.c(q1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mw.d1
    public final f0 e() {
        return this.f42483a;
    }
}
