package yz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.y;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater K = AtomicIntegerFieldUpdater.newUpdater(b.class, HOBXIlHxIkMBEA.vavqlGw);
    public final /* synthetic */ d H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f58373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f58374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f58375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f58376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f58377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f58378f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f58379t;
    private volatile /* synthetic */ int workerCtl$volatile;

    public b(d dVar, int i11) {
        this.H = dVar;
        setDaemon(true);
        setContextClassLoader(d.class.getClassLoader());
        this.f58373a = new n();
        this.f58374b = new y();
        this.f58375c = c.DORMANT;
        this.nextParkedWorker = d.M;
        int iNanoTime = (int) System.nanoTime();
        this.f58378f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i11);
    }

    public final j a(boolean z11) {
        j jVarE;
        j jVarE2;
        long j11;
        c cVar = this.f58375c;
        c cVar2 = c.CPU_ACQUIRED;
        d dVar = this.H;
        j jVar = null;
        n nVar = this.f58373a;
        if (cVar != cVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d.K;
            do {
                j11 = atomicLongFieldUpdater.get(dVar);
                if (((int) ((9223367638808264704L & j11) >> 42)) == 0) {
                    nVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f58402b;
                        j jVar2 = (j) atomicReferenceFieldUpdater.get(nVar);
                        if (jVar2 == null || !jVar2.f58393b) {
                            int i11 = n.f58404d.get(nVar);
                            int i12 = n.f58403c.get(nVar);
                            while (i11 != i12 && n.f58405e.get(nVar) != 0) {
                                i12--;
                                j jVarC = nVar.c(i12, true);
                                if (jVarC != null) {
                                    jVar = jVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(nVar, jVar2, null)) {
                                jVar = jVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(nVar) == jVar2);
                    }
                    if (jVar != null) {
                        return jVar;
                    }
                    j jVar3 = (j) dVar.f58385f.d();
                    return jVar3 == null ? i(1) : jVar3;
                }
            } while (!d.K.compareAndSet(dVar, j11, j11 - 4398046511104L));
            this.f58375c = c.CPU_ACQUIRED;
        }
        if (z11) {
            boolean z12 = d(dVar.f58380a * 2) == 0;
            if (z12 && (jVarE2 = e()) != null) {
                return jVarE2;
            }
            nVar.getClass();
            j jVarB = (j) n.f58402b.getAndSet(nVar, null);
            if (jVarB == null) {
                jVarB = nVar.b();
            }
            if (jVarB != null) {
                return jVarB;
            }
            if (!z12 && (jVarE = e()) != null) {
                return jVarE;
            }
        } else {
            j jVarE3 = e();
            if (jVarE3 != null) {
                return jVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i11) {
        int i12 = this.f58378f;
        int i13 = i12 ^ (i12 << 13);
        int i14 = i13 ^ (i13 >> 17);
        int i15 = i14 ^ (i14 << 5);
        this.f58378f = i15;
        int i16 = i11 - 1;
        return (i16 & i11) == 0 ? i15 & i16 : (i15 & Integer.MAX_VALUE) % i11;
    }

    public final j e() {
        int iD = d(2);
        d dVar = this.H;
        if (iD == 0) {
            j jVar = (j) dVar.f58384e.d();
            return jVar != null ? jVar : (j) dVar.f58385f.d();
        }
        j jVar2 = (j) dVar.f58385f.d();
        return jVar2 != null ? jVar2 : (j) dVar.f58384e.d();
    }

    public final void f(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.H.f58383d);
        sb2.append("-worker-");
        sb2.append(i11 == 0 ? "TERMINATED" : String.valueOf(i11));
        setName(sb2.toString());
        this.indexInArray = i11;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(c cVar) {
        c cVar2 = this.f58375c;
        boolean z11 = cVar2 == c.CPU_ACQUIRED;
        if (z11) {
            d.K.addAndGet(this.H, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.f58375c = cVar;
        }
        return z11;
    }

    public final j i(int i11) {
        long j11;
        j jVarC;
        long j12;
        long j13;
        j jVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d.K;
        d dVar = this.H;
        int i12 = (int) (atomicLongFieldUpdater.get(dVar) & 2097151);
        j jVar2 = null;
        if (i12 < 2) {
            return null;
        }
        int iD = d(i12);
        int i13 = 0;
        long jMin = Long.MAX_VALUE;
        while (i13 < i12) {
            iD++;
            if (iD > i12) {
                iD = 1;
            }
            b bVar = (b) dVar.f58386t.b(iD);
            if (bVar != null && bVar != this) {
                n nVar = bVar.f58373a;
                if (i11 != 3) {
                    nVar.getClass();
                    int i14 = n.f58404d.get(nVar);
                    int i15 = n.f58403c.get(nVar);
                    boolean z11 = i11 == 1;
                    while (true) {
                        if (i14 != i15) {
                            j11 = 0;
                            if (!z11 || n.f58405e.get(nVar) != 0) {
                                int i16 = i14 + 1;
                                jVarC = nVar.c(i14, z11);
                                if (jVarC != null) {
                                    break;
                                }
                                i14 = i16;
                            }
                        } else {
                            j11 = 0;
                        }
                        jVarC = jVar2;
                        break;
                    }
                } else {
                    jVarC = nVar.b();
                    j11 = 0;
                }
                y yVar = this.f58374b;
                if (jVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f58402b;
                        j jVar3 = (j) atomicReferenceFieldUpdater.get(nVar);
                        if (jVar3 == null) {
                            j12 = -1;
                        } else {
                            j12 = -1;
                            if (((jVar3.f58393b ? 1 : 2) & i11) != 0) {
                                l.f58400f.getClass();
                                n nVar2 = nVar;
                                long jNanoTime = System.nanoTime() - jVar3.f58392a;
                                long j14 = l.f58396b;
                                if (jNanoTime < j14) {
                                    j13 = j14 - jNanoTime;
                                    jVar = null;
                                    break;
                                }
                                do {
                                    jVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(nVar2, jVar3, null)) {
                                        yVar.f38361a = jVar3;
                                        j13 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(nVar2) == jVar3);
                                nVar = nVar2;
                                jVar2 = null;
                            }
                        }
                        j13 = -2;
                        jVar = jVar2;
                        break;
                    }
                } else {
                    yVar.f38361a = jVarC;
                    jVar = jVar2;
                    j13 = -1;
                    j12 = -1;
                }
                if (j13 == j12) {
                    j jVar4 = (j) yVar.f38361a;
                    yVar.f38361a = jVar;
                    return jVar4;
                }
                if (j13 > j11) {
                    jMin = Math.min(jMin, j13);
                }
            }
            i13++;
            jVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f58377e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j11;
        loop0: while (true) {
            boolean z11 = false;
            while (true) {
                if (d.L.get(this.H) != 1) {
                    c cVar = this.f58375c;
                    c cVar2 = c.TERMINATED;
                    if (cVar == cVar2) {
                        break loop0;
                    }
                    j jVarA = a(this.f58379t);
                    if (jVarA != null) {
                        this.f58377e = 0L;
                        d dVar = this.H;
                        this.f58376d = 0L;
                        if (this.f58375c == c.PARKING) {
                            this.f58375c = c.BLOCKING;
                        }
                        if (!jVarA.f58393b) {
                            try {
                                jVarA.run();
                                break;
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                break;
                            }
                        }
                        if (h(c.BLOCKING) && !dVar.f() && !dVar.e(d.K.get(dVar))) {
                            dVar.f();
                        }
                        try {
                            jVarA.run();
                        } catch (Throwable th3) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                        d.K.addAndGet(dVar, -2097152L);
                        if (this.f58375c == cVar2) {
                            break;
                        }
                        this.f58375c = c.DORMANT;
                        break;
                    }
                    this.f58379t = false;
                    if (this.f58377e == 0) {
                        Object obj = this.nextParkedWorker;
                        com.android.billingclient.api.a aVar = d.M;
                        if (obj != aVar) {
                            K.set(this, -1);
                            while (this.nextParkedWorker != d.M) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = K;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                d dVar2 = this.H;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = d.L;
                                if (atomicIntegerFieldUpdater2.get(dVar2) == 1) {
                                    break;
                                }
                                c cVar3 = this.f58375c;
                                c cVar4 = c.TERMINATED;
                                if (cVar3 == cVar4) {
                                    break;
                                }
                                h(c.PARKING);
                                Thread.interrupted();
                                if (this.f58376d == 0) {
                                    j11 = 2097151;
                                    this.f58376d = System.nanoTime() + this.H.f58382c;
                                } else {
                                    j11 = 2097151;
                                }
                                LockSupport.parkNanos(this.H.f58382c);
                                if (System.nanoTime() - this.f58376d >= 0) {
                                    this.f58376d = 0L;
                                    d dVar3 = this.H;
                                    synchronized (dVar3.f58386t) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(dVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = d.K;
                                                if (((int) (atomicLongFieldUpdater.get(dVar3) & j11)) > dVar3.f58380a) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i11 = this.indexInArray;
                                                        f(0);
                                                        dVar3.d(this, i11, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(dVar3) & j11);
                                                        if (andDecrement != i11) {
                                                            Object objB = dVar3.f58386t.b(andDecrement);
                                                            kotlin.jvm.internal.m.c(objB);
                                                            b bVar = (b) objB;
                                                            dVar3.f58386t.c(i11, bVar);
                                                            bVar.f(i11);
                                                            dVar3.d(bVar, andDecrement, i11);
                                                        }
                                                        dVar3.f58386t.c(andDecrement, null);
                                                        this.f58375c = cVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                }
                            }
                        } else {
                            d dVar4 = this.H;
                            if (this.nextParkedWorker == aVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = d.H;
                                while (true) {
                                    long j12 = atomicLongFieldUpdater2.get(dVar4);
                                    int i12 = this.indexInArray;
                                    this.nextParkedWorker = dVar4.f58386t.b((int) (j12 & 2097151));
                                    d dVar5 = dVar4;
                                    if (d.H.compareAndSet(dVar5, j12, ((j12 + 2097152) & (-2097152)) | ((long) i12))) {
                                        break;
                                    } else {
                                        dVar4 = dVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z11) {
                            h(c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f58377e);
                            this.f58377e = 0L;
                            break;
                        }
                        z11 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(c.TERMINATED);
    }
}
