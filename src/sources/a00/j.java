package a00;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nv.p;
import qy.b0;
import rz.e0;
import rz.j2;
import sz.xej.iFLeRCXvYCGdPW;
import wz.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f255c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, iFLeRCXvYCGdPW.rTFbR);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f256d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f257e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f258f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f259t = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f261b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public j(int i11) {
        this.f260a = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException(p.j(i11, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(p.j(i11, "The number of acquired permits should be in 0..").toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i11;
        this.f261b = new b(this, 1);
    }

    public final Object c(xy.c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i11;
        do {
            atomicIntegerFieldUpdater = f259t;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i11 = this.f260a;
        } while (andDecrement > i11);
        b0 b0Var = b0.f48488a;
        if (andDecrement <= 0) {
            rz.m mVarT = e0.t(ue.f.x(cVar));
            try {
                if (!d(mVarT)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i11) {
                            if (andDecrement2 > 0) {
                                mVarT.a(b0Var, this.f261b);
                                break;
                            }
                            if (d(mVarT)) {
                                break;
                            }
                        }
                    }
                }
                Object objR = mVarT.r();
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                if (objR != aVar) {
                    objR = b0Var;
                }
                if (objR == aVar) {
                    return objR;
                }
            } catch (Throwable th2) {
                mVarT.B();
                throw th2;
            }
        }
        return b0Var;
    }

    public final boolean d(j2 j2Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f257e;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f258f.getAndIncrement(this);
        h hVar = h.f253a;
        long j11 = andIncrement / ((long) l.f267f);
        loop0: while (true) {
            objB = wz.b.b(mVar, j11, hVar);
            if (!wz.b.e(objB)) {
                r rVarC = wz.b.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f55543c >= rVarC.f55543c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                            if (!rVar.f()) {
                                break loop0;
                            }
                            rVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rVar);
                    if (rVarC.f()) {
                        rVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) wz.b.c(objB);
        AtomicReferenceArray atomicReferenceArray = mVar2.f268e;
        int i11 = (int) (andIncrement % ((long) l.f267f));
        while (!atomicReferenceArray.compareAndSet(i11, null, j2Var)) {
            if (atomicReferenceArray.get(i11) != null) {
                com.android.billingclient.api.a aVar = l.f263b;
                com.android.billingclient.api.a aVar2 = l.f264c;
                while (!atomicReferenceArray.compareAndSet(i11, aVar, aVar2)) {
                    if (atomicReferenceArray.get(i11) != aVar) {
                        return false;
                    }
                }
                ((rz.l) j2Var).a(b0.f48488a, this.f261b);
                return true;
            }
        }
        j2Var.b(mVar2, i11);
        return true;
    }

    public final void e() {
        int i11;
        Object objB;
        boolean zG;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f259t;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i12 = this.f260a;
            if (andIncrement >= i12) {
                do {
                    i11 = atomicIntegerFieldUpdater.get(this);
                    if (i11 <= i12) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i12));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i12).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f255c;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f256d.getAndIncrement(this);
            long j11 = andIncrement2 / ((long) l.f267f);
            i iVar = i.f254a;
            while (true) {
                objB = wz.b.b(mVar, j11, iVar);
                if (!wz.b.e(objB)) {
                    r rVarC = wz.b.c(objB);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.f55543c >= rVarC.f55543c) {
                            break;
                        }
                        if (!rVarC.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                                if (!rVar.f()) {
                                    break;
                                }
                                rVar.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == rVar);
                        if (rVarC.f()) {
                            rVarC.e();
                        }
                    }
                } else {
                    break;
                }
            }
            m mVar2 = (m) wz.b.c(objB);
            AtomicReferenceArray atomicReferenceArray = mVar2.f268e;
            mVar2.b();
            zG = false;
            if (mVar2.f55543c <= j11) {
                int i13 = (int) (andIncrement2 % ((long) l.f267f));
                Object andSet = atomicReferenceArray.getAndSet(i13, l.f263b);
                if (andSet == null) {
                    int i14 = l.f262a;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            com.android.billingclient.api.a aVar = l.f263b;
                            com.android.billingclient.api.a aVar2 = l.f265d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i13, aVar, aVar2)) {
                                    zG = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i13) == aVar);
                            zG = !zG;
                            break;
                        }
                        if (atomicReferenceArray.get(i13) == l.f264c) {
                            zG = true;
                            break;
                        }
                        i15++;
                    }
                } else if (andSet != l.f266e) {
                    boolean z11 = andSet instanceof rz.l;
                    b0 b0Var = b0.f48488a;
                    if (z11) {
                        rz.l lVar = (rz.l) andSet;
                        com.android.billingclient.api.a aVarH = lVar.h(b0Var, this.f261b);
                        if (aVarH != null) {
                            lVar.l(aVarH);
                            zG = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof zz.i)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zG = ((zz.h) ((zz.i) andSet)).g(this, b0Var);
                    }
                }
            }
        } while (!zG);
    }
}
