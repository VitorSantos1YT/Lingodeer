package wz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rz.g0;
import rz.j0;
import rz.q0;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends y implements j0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f55516t = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f55517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f55518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f55521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f55522f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(y yVar, int i11, String str) {
        j0 j0Var = yVar instanceof j0 ? (j0) yVar : null;
        this.f55517a = j0Var == null ? g0.f50907a : j0Var;
        this.f55518b = yVar;
        this.f55519c = i11;
        this.f55520d = str;
        this.f55521e = new j();
        this.f55522f = new Object();
    }

    @Override // rz.j0
    public final void a(long j11, rz.m mVar) {
        this.f55517a.a(j11, mVar);
    }

    @Override // rz.j0
    public final q0 b(long j11, Runnable runnable, vy.i iVar) {
        return this.f55517a.b(j11, runnable, iVar);
    }

    public final Runnable d() {
        while (true) {
            Runnable runnable = (Runnable) this.f55521e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f55522f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f55516t;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f55521e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // rz.y
    public final void dispatch(vy.i iVar, Runnable runnable) {
        Runnable runnableD;
        this.f55521e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f55516t;
        if (atomicIntegerFieldUpdater.get(this) >= this.f55519c || !f() || (runnableD = d()) == null) {
            return;
        }
        try {
            b.i(this.f55518b, this, new aw.t(25, this, runnableD));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // rz.y
    public final void dispatchYield(vy.i iVar, Runnable runnable) {
        Runnable runnableD;
        this.f55521e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f55516t;
        if (atomicIntegerFieldUpdater.get(this) >= this.f55519c || !f() || (runnableD = d()) == null) {
            return;
        }
        try {
            this.f55518b.dispatchYield(this, new aw.t(25, this, runnableD));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    public final boolean f() {
        synchronized (this.f55522f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f55516t;
            if (atomicIntegerFieldUpdater.get(this) >= this.f55519c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // rz.y
    public final y limitedParallelism(int i11, String str) {
        b.a(i11);
        if (i11 >= this.f55519c) {
            return str != null ? new n(this, str) : this;
        }
        return super.limitedParallelism(i11, str);
    }

    @Override // rz.y
    public final String toString() {
        String str = this.f55520d;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f55518b);
        sb2.append(".limitedParallelism(");
        return ep.a.j(sb2, this.f55519c, ')');
    }
}
