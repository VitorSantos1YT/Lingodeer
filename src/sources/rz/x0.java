package rz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 extends y0 implements j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50970e = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50971f = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f50972t = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public final void A() {
        v0 v0VarB;
        w0 w0Var = (w0) f50971f.get(this);
        if (w0Var == null || wz.w.f55550b.get(w0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (w0Var) {
                try {
                    v0[] v0VarArr = w0Var.f55551a;
                    v0VarB = null;
                    v0 v0Var = v0VarArr != null ? v0VarArr[0] : null;
                    if (v0Var != null) {
                        v0VarB = ((jNanoTime - v0Var.f50962a) > 0L ? 1 : ((jNanoTime - v0Var.f50962a) == 0L ? 0 : -1)) >= 0 ? B(v0Var) : false ? w0Var.b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (v0VarB != null);
    }

    public final boolean B(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50970e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f50972t.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof wz.l)) {
                if (obj == e0.f50884c) {
                    return false;
                }
                wz.l lVar = new wz.l(8, true);
                lVar.a((Runnable) obj);
                lVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            wz.l lVar2 = (wz.l) obj;
            int iA = lVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                wz.l lVarC = lVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean C() {
        Object obj;
        long j11;
        ry.k kVar = this.f50976c;
        if (kVar != null ? kVar.isEmpty() : true) {
            w0 w0Var = (w0) f50971f.get(this);
            if (w0Var == null) {
                obj = f50970e.get(this);
                if (obj != null) {
                    if (obj instanceof wz.l) {
                        j11 = wz.l.f55530f.get((wz.l) obj);
                        if (((int) (1073741823 & j11)) == ((int) ((j11 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == e0.f50884c) {
                    }
                }
                return true;
            }
            if (wz.w.f55550b.get(w0Var) == 0) {
                obj = f50970e.get(this);
                if (obj != null) {
                    if (obj instanceof wz.l) {
                        j11 = wz.l.f55530f.get((wz.l) obj);
                        if (((int) (1073741823 & j11)) == ((int) ((j11 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == e0.f50884c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void D(long j11, v0 v0Var) {
        int iB;
        Thread threadH;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50971f;
        v0 v0Var2 = null;
        if (f50972t.get(this) == 1) {
            iB = 1;
        } else {
            w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
            if (w0Var == null) {
                w0 w0Var2 = new w0();
                w0Var2.f50966c = j11;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, w0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.m.c(obj);
                w0Var = (w0) obj;
            }
            iB = v0Var.b(j11, w0Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                x(j11, v0Var);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        w0 w0Var3 = (w0) atomicReferenceFieldUpdater.get(this);
        if (w0Var3 != null) {
            synchronized (w0Var3) {
                v0[] v0VarArr = w0Var3.f55551a;
                v0Var2 = v0VarArr != null ? v0VarArr[0] : null;
            }
        }
        if (v0Var2 != v0Var || Thread.currentThread() == (threadH = h())) {
            return;
        }
        LockSupport.unpark(threadH);
    }

    @Override // rz.j0
    public final void a(long j11, m mVar) {
        long j12 = 0;
        if (j11 > 0) {
            j12 = j11 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j11;
        }
        if (j12 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            t0 t0Var = new t0(this, j12 + jNanoTime, mVar);
            D(jNanoTime, t0Var);
            mVar.v(new j(t0Var, 2));
        }
    }

    public q0 b(long j11, Runnable runnable, vy.i iVar) {
        return g0.f50907a.b(j11, runnable, iVar);
    }

    @Override // rz.y
    public final void dispatch(vy.i iVar, Runnable runnable) {
        y(runnable);
    }

    @Override // rz.y0
    public final long q() {
        Runnable runnable;
        v0 v0Var;
        com.android.billingclient.api.a aVar = e0.f50884c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50970e;
        if (!v()) {
            A();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof wz.l) {
                        wz.l lVar = (wz.l) obj;
                        Object objD = lVar.d();
                        if (objD != wz.l.f55531g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        wz.l lVarC = lVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != aVar) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            ry.k kVar = this.f50976c;
            if (((kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof wz.l) {
                        long j11 = wz.l.f55530f.get((wz.l) obj2);
                        if (((int) (1073741823 & j11)) != ((int) ((j11 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == aVar) {
                        return Long.MAX_VALUE;
                    }
                }
                w0 w0Var = (w0) f50971f.get(this);
                if (w0Var != null) {
                    synchronized (w0Var) {
                        v0[] v0VarArr = w0Var.f55551a;
                        v0Var = v0VarArr != null ? v0VarArr[0] : null;
                    }
                    if (v0Var != null) {
                        long jNanoTime = v0Var.f50962a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // rz.y0
    public void shutdown() {
        v0 v0VarB;
        c2.f50875a.set(null);
        f50972t.set(this, 1);
        com.android.billingclient.api.a aVar = e0.f50884c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50970e;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof wz.l) {
                ((wz.l) obj).b();
                break;
            } else {
                if (obj == aVar) {
                    break;
                }
                wz.l lVar = new wz.l(8, true);
                lVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (q() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            w0 w0Var = (w0) f50971f.get(this);
            if (w0Var == null) {
                return;
            }
            synchronized (w0Var) {
                v0VarB = wz.w.f55550b.get(w0Var) > 0 ? w0Var.b(0) : null;
            }
            if (v0VarB == null) {
                return;
            } else {
                x(jNanoTime, v0VarB);
            }
        }
    }

    public void y(Runnable runnable) {
        A();
        if (!B(runnable)) {
            f0.H.y(runnable);
            return;
        }
        Thread threadH = h();
        if (Thread.currentThread() != threadH) {
            LockSupport.unpark(threadH);
        }
    }
}
