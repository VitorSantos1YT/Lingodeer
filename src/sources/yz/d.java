package yz;

import fa.EQx.nuRcCS;
import hh.p0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import rz.e0;
import wz.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater H = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater K = AtomicLongFieldUpdater.newUpdater(d.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater L = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated$volatile");
    public static final com.android.billingclient.api.a M = new com.android.billingclient.api.a("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f58382c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f58383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f58384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f58385f;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f58386t;

    public static /* synthetic */ void c(d dVar, Runnable runnable, int i11) {
        dVar.b(runnable, false, (i11 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f58386t) {
            try {
                if (L.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = K;
                long j11 = atomicLongFieldUpdater.get(this);
                int i11 = (int) (j11 & 2097151);
                int i12 = i11 - ((int) ((j11 & 4398044413952L) >> 21));
                if (i12 < 0) {
                    i12 = 0;
                }
                if (i12 >= this.f58380a) {
                    return 0;
                }
                if (i11 >= this.f58381b) {
                    return 0;
                }
                int i13 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i13 <= 0 || this.f58386t.b(i13) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(this, i13);
                this.f58386t.c(i13, bVar);
                if (i13 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i14 = i12 + 1;
                bVar.start();
                return i14;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable, boolean z11, boolean z12) {
        j kVar;
        c cVar;
        l.f58400f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof j) {
            kVar = (j) runnable;
            kVar.f58392a = jNanoTime;
            kVar.f58393b = z11;
        } else {
            kVar = new k(runnable, jNanoTime, z11);
        }
        boolean z13 = kVar.f58393b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = K;
        long jAddAndGet = z13 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
        if (bVar == null || !kotlin.jvm.internal.m.a(bVar.H, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f58375c) != c.TERMINATED && (kVar.f58393b || cVar != c.BLOCKING)) {
            bVar.f58379t = true;
            n nVar = bVar.f58373a;
            if (z12) {
                kVar = nVar.a(kVar);
            } else {
                nVar.getClass();
                j jVar = (j) n.f58402b.getAndSet(nVar, kVar);
                kVar = jVar == null ? null : nVar.a(jVar);
            }
        }
        if (kVar != null) {
            if (!(kVar.f58393b ? this.f58385f.a(kVar) : this.f58384e.a(kVar))) {
                throw new RejectedExecutionException(ep.a.k(new StringBuilder(), this.f58383d, " was terminated"));
            }
        }
        if (z13) {
            if (f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i11;
        j jVarA;
        if (L.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
            if (bVar == null || !kotlin.jvm.internal.m.a(bVar.H, this)) {
                bVar = null;
            }
            synchronized (this.f58386t) {
                i11 = (int) (K.get(this) & 2097151);
            }
            if (1 <= i11) {
                int i12 = 1;
                while (true) {
                    Object objB = this.f58386t.b(i12);
                    kotlin.jvm.internal.m.c(objB);
                    b bVar2 = (b) objB;
                    if (bVar2 != bVar) {
                        while (bVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(10000L);
                        }
                        n nVar = bVar2.f58373a;
                        g gVar = this.f58385f;
                        nVar.getClass();
                        j jVar = (j) n.f58402b.getAndSet(nVar, null);
                        if (jVar != null) {
                            gVar.a(jVar);
                        }
                        while (true) {
                            j jVarB = nVar.b();
                            if (jVarB == null) {
                                break;
                            } else {
                                gVar.a(jVarB);
                            }
                        }
                    }
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f58385f.b();
            this.f58384e.b();
            while (true) {
                if (bVar != null) {
                    jVarA = bVar.a(true);
                    if (jVarA == null) {
                        jVarA = (j) this.f58384e.d();
                        if (jVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    jVarA = (j) this.f58384e.d();
                    if (jVarA == null && (jVarA = (j) this.f58385f.d()) == null) {
                        break;
                    }
                }
                try {
                    jVarA.run();
                } catch (Throwable th2) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                }
            }
            if (bVar != null) {
                bVar.h(c.TERMINATED);
            }
            H.set(this, 0L);
            K.set(this, 0L);
        }
    }

    public final void d(b bVar, int i11, int i12) {
        while (true) {
            long j11 = H.get(this);
            int i13 = (int) (2097151 & j11);
            long j12 = (2097152 + j11) & (-2097152);
            if (i13 == i11) {
                if (i12 == 0) {
                    Object objC = bVar.c();
                    while (true) {
                        if (objC == M) {
                            i13 = -1;
                            break;
                        }
                        if (objC == null) {
                            i13 = 0;
                            break;
                        }
                        b bVar2 = (b) objC;
                        int iB = bVar2.b();
                        if (iB != 0) {
                            i13 = iB;
                            break;
                        }
                        objC = bVar2.c();
                    }
                } else {
                    i13 = i12;
                }
            }
            if (i13 >= 0) {
                if (H.compareAndSet(this, j11, ((long) i13) | j12)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j11) {
        int i11 = ((int) (2097151 & j11)) - ((int) ((j11 & 4398044413952L) >> 21));
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = this.f58380a;
        if (i11 < i12) {
            int iA = a();
            if (iA == 1 && i12 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        com.android.billingclient.api.a aVar;
        int iB;
        while (true) {
            long j11 = H.get(this);
            b bVar = (b) this.f58386t.b((int) (2097151 & j11));
            if (bVar == null) {
                bVar = null;
            } else {
                long j12 = (2097152 + j11) & (-2097152);
                Object objC = bVar.c();
                while (true) {
                    aVar = M;
                    if (objC == aVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    b bVar2 = (b) objC;
                    iB = bVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = bVar2.c();
                }
                if (iB >= 0) {
                    if (H.compareAndSet(this, j11, ((long) iB) | j12)) {
                        bVar.g(aVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (bVar == null) {
                return false;
            }
            if (b.K.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f58386t;
        int iA = pVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < iA; i16++) {
            b bVar = (b) pVar.b(i16);
            if (bVar != null) {
                n nVar = bVar.f58373a;
                nVar.getClass();
                int i17 = n.f58402b.get(nVar) != null ? (n.f58403c.get(nVar) - n.f58404d.get(nVar)) + 1 : n.f58403c.get(nVar) - n.f58404d.get(nVar);
                int i18 = a.f58372a[bVar.f58375c.ordinal()];
                if (i18 == 1) {
                    i13++;
                } else if (i18 == 2) {
                    i12++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i17);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i18 == 3) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i17);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i18 == 4) {
                    i14++;
                    if (i17 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i17);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i18 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i15++;
                }
            }
        }
        long j11 = K.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f58383d);
        sb5.append('@');
        sb5.append(e0.r(this));
        sb5.append("[Pool Size {core = ");
        int i19 = this.f58380a;
        sb5.append(i19);
        sb5.append(", max = ");
        ep.a.v(this.f58381b, i11, "}, Worker States {CPU = ", ", blocking = ", sb5);
        ep.a.v(i12, i13, ", parked = ", ", dormant = ", sb5);
        ep.a.v(i14, i15, ", terminated = ", "}, running workers queues = ", sb5);
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f58384e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f58385f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j11));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j11) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i19 - ((int) ((j11 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public d(int i11, int i12, long j11, String str) {
        this.f58380a = i11;
        this.f58381b = i12;
        this.f58382c = j11;
        this.f58383d = str;
        if (i11 >= 1) {
            if (i12 >= i11) {
                if (i12 <= 2097150) {
                    if (j11 > 0) {
                        this.f58384e = new g();
                        this.f58385f = new g();
                        this.f58386t = new p((i11 + 1) * 2);
                        this.controlState$volatile = ((long) i11) << 42;
                        return;
                    }
                    throw new IllegalArgumentException(nv.p.m(j11, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(p0.h(i12, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(nv.p.p("Max pool size ", i12, i11, " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(p0.h(i11, "Core pool size ", nuRcCS.QdKHoDMvMPrr).toString());
    }
}
