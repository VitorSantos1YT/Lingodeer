package tz;

import hh.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import qy.b0;
import rz.e0;
import rz.j2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class h implements l {
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52683a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f52677b = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f52678c = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f52679d = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f52680e = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52681f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52682t = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater K = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");

    public h(int i11) {
        this.f52683a = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        p pVar = j.f52685a;
        this.bufferEnd$volatile = i11 != 0 ? i11 != Integer.MAX_VALUE ? i11 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f52679d.get(this);
        p pVar2 = new p(0L, null, this, 3);
        this.sendSegment$volatile = pVar2;
        this.receiveSegment$volatile = pVar2;
        if (z()) {
            pVar2 = j.f52685a;
            kotlin.jvm.internal.m.d(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = pVar2;
        this._closeCause$volatile = j.f52702s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object C(h hVar, xy.c cVar) {
        f fVar;
        p pVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f52673c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f52673c = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(hVar, cVar);
            }
        } else {
            fVar = new f(hVar, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f52671a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar2.f52673c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return ((o) obj).f52707a;
        }
        com.bumptech.glide.e.F(obj);
        p pVar2 = (p) f52682t.get(hVar);
        while (!hVar.w()) {
            long andIncrement = f52678c.getAndIncrement(hVar);
            long j11 = j.f52686b;
            long j12 = andIncrement / j11;
            int i13 = (int) (andIncrement % j11);
            if (pVar2.f55543c != j12) {
                p pVarP = hVar.p(j12, pVar2);
                if (pVarP == null) {
                    continue;
                } else {
                    pVar = pVarP;
                }
            } else {
                pVar = pVar2;
            }
            h hVar2 = hVar;
            Object objH = hVar2.H(pVar, i13, andIncrement, null);
            if (objH == j.m) {
                throw new IllegalStateException("unexpected");
            }
            if (objH != j.f52698o) {
                if (objH != j.f52697n) {
                    pVar.b();
                    return objH;
                }
                fVar2.f52673c = 1;
                Object objD = hVar2.D(pVar, i13, andIncrement, fVar2);
                return objD == aVar ? aVar : objD;
            }
            if (andIncrement < hVar2.t()) {
                pVar.b();
            }
            hVar = hVar2;
            pVar2 = pVar;
        }
        return new m(hVar.q());
    }

    public static final p a(h hVar, long j11, p pVar) {
        Object objB;
        h hVar2;
        p pVar2 = j.f52685a;
        i iVar = i.f52684a;
        loop0: while (true) {
            objB = wz.b.b(pVar, j11, iVar);
            if (!wz.b.e(objB)) {
                wz.r rVarC = wz.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52681f;
                    wz.r rVar = (wz.r) atomicReferenceFieldUpdater.get(hVar);
                    if (rVar.f55543c >= rVarC.f55543c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, rVar, rVarC)) {
                            if (!rVar.f()) {
                                break loop0;
                            }
                            rVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == rVar);
                    if (rVarC.f()) {
                        rVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = wz.b.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f52678c;
        if (zE) {
            hVar.x();
            if (pVar.f55543c * ((long) j.f52686b) < atomicLongFieldUpdater.get(hVar)) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) wz.b.c(objB);
            long j12 = pVar3.f55543c;
            if (j12 <= j11) {
                return pVar3;
            }
            long j13 = ((long) j.f52686b) * j12;
            while (true) {
                long j14 = f52677b.get(hVar);
                long j15 = 1152921504606846975L & j14;
                if (j15 >= j13) {
                    hVar2 = hVar;
                    break;
                }
                hVar2 = hVar;
                if (f52677b.compareAndSet(hVar2, j14, (((long) ((int) (j14 >> 60))) << 60) + j15)) {
                    break;
                }
                hVar = hVar2;
            }
            if (j12 * ((long) j.f52686b) < atomicLongFieldUpdater.get(hVar2)) {
                pVar3.b();
            }
        }
        return null;
    }

    public static final void c(h hVar, Object obj, rz.m mVar) {
        mVar.resumeWith(com.bumptech.glide.e.l(hVar.s()));
    }

    public static final int e(h hVar, p pVar, int i11, Object obj, long j11, Object obj2, boolean z11) {
        pVar.n(i11, obj);
        if (z11) {
            return hVar.I(pVar, i11, obj, j11, obj2, z11);
        }
        Object objL = pVar.l(i11);
        if (objL == null) {
            if (hVar.h(j11)) {
                if (pVar.k(i11, null, j.f52688d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(i11, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof j2) {
            pVar.n(i11, null);
            if (hVar.F(objL, obj)) {
                pVar.o(i11, j.f52693i);
                return 0;
            }
            com.android.billingclient.api.a aVar = j.f52695k;
            if (pVar.f52709f.getAndSet((i11 * 2) + 1, aVar) == aVar) {
                return 5;
            }
            pVar.m(i11, true);
            return 5;
        }
        return hVar.I(pVar, i11, obj, j11, obj2, z11);
    }

    public static void u(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f52680e;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A(long j11, p pVar) {
        p pVar2;
        p pVar3;
        while (pVar.f55543c < j11 && (pVar3 = (p) pVar.c()) != null) {
            pVar = pVar3;
        }
        while (true) {
            if (!pVar.d() || (pVar2 = (p) pVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
                    wz.r rVar = (wz.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f55543c >= pVar.f55543c) {
                        return;
                    }
                    if (!pVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, pVar)) {
                            if (rVar.f()) {
                                rVar.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rVar);
                    if (pVar.f()) {
                        pVar.e();
                    }
                }
            } else {
                pVar = pVar2;
            }
        }
    }

    public final Object B(Object obj, vy.d dVar) {
        rz.m mVar = new rz.m(1, ue.f.x(dVar));
        mVar.s();
        mVar.resumeWith(com.bumptech.glide.e.l(s()));
        Object objR = mVar.r();
        return objR == wy.a.COROUTINE_SUSPENDED ? objR : b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object D(p pVar, int i11, long j11, xy.c cVar) {
        g gVar;
        p pVar2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f52676c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f52676c = i12 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objR = gVar.f52674a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = gVar.f52676c;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objR);
            gVar.f52676c = 1;
            rz.m mVarT = e0.t(ue.f.x(gVar));
            try {
                u uVar = new u(mVarT);
                Object objH = H(pVar, i11, j11, uVar);
                if (objH == j.m) {
                    uVar.b(pVar, i11);
                } else if (objH == j.f52698o) {
                    if (j11 < t()) {
                        pVar.b();
                    }
                    p pVar3 = (p) f52682t.get(this);
                    while (true) {
                        if (w()) {
                            mVarT.resumeWith(new o(new m(q())));
                            break;
                        }
                        long andIncrement = f52678c.getAndIncrement(this);
                        long j12 = j.f52686b;
                        long j13 = andIncrement / j12;
                        int i14 = (int) (andIncrement % j12);
                        if (pVar3.f55543c != j13) {
                            p pVarP = p(j13, pVar3);
                            if (pVarP != null) {
                                pVar2 = pVarP;
                            }
                        } else {
                            pVar2 = pVar3;
                        }
                        Object objH2 = H(pVar2, i14, andIncrement, uVar);
                        p pVar4 = pVar2;
                        if (objH2 == j.m) {
                            uVar.b(pVar4, i14);
                            break;
                        }
                        if (objH2 != j.f52698o) {
                            if (objH2 == j.f52697n) {
                                throw new IllegalStateException("unexpected");
                            }
                            pVar4.b();
                            mVarT.a(new o(objH2), null);
                            break;
                        }
                        if (andIncrement < t()) {
                            pVar4.b();
                        }
                        pVar3 = pVar4;
                    }
                } else {
                    pVar.b();
                    mVarT.a(new o(objH), null);
                }
                objR = mVarT.r();
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                if (objR == aVar) {
                    return aVar;
                }
            } catch (Throwable th2) {
                mVarT.B();
                throw th2;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objR);
        }
        return ((o) objR).f52707a;
    }

    public final void E(j2 j2Var, boolean z11) {
        if (j2Var instanceof rz.l) {
            ((vy.d) j2Var).resumeWith(com.bumptech.glide.e.l(z11 ? r() : s()));
            return;
        }
        if (j2Var instanceof u) {
            ((u) j2Var).f52714a.resumeWith(new o(new m(q())));
            return;
        }
        if (!(j2Var instanceof c)) {
            if (j2Var instanceof zz.i) {
                ((zz.h) ((zz.i) j2Var)).g(this, j.f52696l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + j2Var).toString());
            }
        }
        c cVar = (c) j2Var;
        rz.m mVar = cVar.f52667b;
        kotlin.jvm.internal.m.c(mVar);
        cVar.f52667b = null;
        cVar.f52666a = j.f52696l;
        Throwable thQ = cVar.f52668c.q();
        if (thQ == null) {
            mVar.resumeWith(Boolean.FALSE);
        } else {
            mVar.resumeWith(com.bumptech.glide.e.l(thQ));
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof zz.i) {
            return ((zz.h) ((zz.i) obj)).g(this, obj2);
        }
        if (obj instanceof u) {
            return j.a(((u) obj).f52714a, new o(obj2), null);
        }
        if (!(obj instanceof c)) {
            if (obj instanceof rz.l) {
                return j.a((rz.l) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        c cVar = (c) obj;
        rz.m mVar = cVar.f52667b;
        kotlin.jvm.internal.m.c(mVar);
        cVar.f52667b = null;
        cVar.f52666a = obj2;
        Boolean bool = Boolean.TRUE;
        cVar.f52668c.getClass();
        return j.a(mVar, bool, null);
    }

    public final boolean G(Object obj, p pVar, int i11) {
        zz.l lVar;
        boolean z11 = obj instanceof rz.l;
        b0 b0Var = b0.f48488a;
        if (z11) {
            return j.a((rz.l) obj, b0Var, null);
        }
        if (!(obj instanceof zz.i)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iH = ((zz.h) obj).h(this, b0Var);
        if (iH == 0) {
            lVar = zz.l.SUCCESSFUL;
        } else if (iH == 1) {
            lVar = zz.l.REREGISTER;
        } else if (iH == 2) {
            lVar = zz.l.CANCELLED;
        } else {
            if (iH != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iH).toString());
            }
            lVar = zz.l.ALREADY_SELECTED;
        }
        if (lVar == zz.l.REREGISTER) {
            pVar.n(i11, null);
        }
        return lVar == zz.l.SUCCESSFUL;
    }

    public final Object H(p pVar, int i11, long j11, Object obj) {
        Object objL = pVar.l(i11);
        AtomicReferenceArray atomicReferenceArray = pVar.f52709f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f52677b;
        if (objL == null) {
            if (j11 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f52697n;
                }
                if (pVar.k(i11, objL, obj)) {
                    o();
                    return j.m;
                }
            }
        } else if (objL == j.f52688d && pVar.k(i11, objL, j.f52693i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i11 * 2);
            pVar.n(i11, null);
            return obj2;
        }
        while (true) {
            Object objL2 = pVar.l(i11);
            if (objL2 == null || objL2 == j.f52689e) {
                if (j11 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pVar.k(i11, objL2, j.f52692h)) {
                        o();
                        return j.f52698o;
                    }
                } else {
                    if (obj == null) {
                        return j.f52697n;
                    }
                    if (pVar.k(i11, objL2, obj)) {
                        o();
                        return j.m;
                    }
                }
            } else if (objL2 != j.f52688d) {
                com.android.billingclient.api.a aVar = j.f52694j;
                if (objL2 == aVar) {
                    return j.f52698o;
                }
                if (objL2 == j.f52692h) {
                    return j.f52698o;
                }
                if (objL2 == j.f52696l) {
                    o();
                    return j.f52698o;
                }
                if (objL2 != j.f52691g && pVar.k(i11, objL2, j.f52690f)) {
                    boolean z11 = objL2 instanceof x;
                    if (z11) {
                        objL2 = ((x) objL2).f52715a;
                    }
                    if (G(objL2, pVar, i11)) {
                        pVar.o(i11, j.f52693i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i11 * 2);
                        pVar.n(i11, null);
                        return obj3;
                    }
                    pVar.o(i11, aVar);
                    pVar.i();
                    if (z11) {
                        o();
                    }
                    return j.f52698o;
                }
            } else if (pVar.k(i11, objL2, j.f52693i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i11 * 2);
                pVar.n(i11, null);
                return obj4;
            }
        }
    }

    public final int I(p pVar, int i11, Object obj, long j11, Object obj2, boolean z11) {
        while (true) {
            Object objL = pVar.l(i11);
            if (objL == null) {
                if (!h(j11) || z11) {
                    if (z11) {
                        if (pVar.k(i11, null, j.f52694j)) {
                            pVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pVar.k(i11, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pVar.k(i11, null, j.f52688d)) {
                    break;
                }
            } else {
                if (objL != j.f52689e) {
                    com.android.billingclient.api.a aVar = j.f52695k;
                    if (objL == aVar) {
                        pVar.n(i11, null);
                        return 5;
                    }
                    if (objL == j.f52692h) {
                        pVar.n(i11, null);
                        return 5;
                    }
                    if (objL == j.f52696l) {
                        pVar.n(i11, null);
                        x();
                        return 4;
                    }
                    pVar.n(i11, null);
                    if (objL instanceof x) {
                        objL = ((x) objL).f52715a;
                    }
                    if (F(objL, obj)) {
                        pVar.o(i11, j.f52693i);
                        return 0;
                    }
                    if (pVar.f52709f.getAndSet((i11 * 2) + 1, aVar) != aVar) {
                        pVar.m(i11, true);
                    }
                    return 5;
                }
                if (pVar.k(i11, objL, j.f52688d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void J(long j11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        h hVar = this;
        if (hVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f52679d;
            if (atomicLongFieldUpdater.get(hVar) > j11) {
                break;
            } else {
                hVar = this;
            }
        }
        int i11 = j.f52687c;
        int i12 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f52680e;
            if (i12 < i11) {
                long j12 = atomicLongFieldUpdater.get(hVar);
                if (j12 == (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) && j12 == atomicLongFieldUpdater.get(hVar)) {
                    return;
                } else {
                    i12++;
                }
            } else {
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j13, (j13 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        hVar = this;
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater.get(hVar);
                    long j15 = atomicLongFieldUpdater2.get(hVar);
                    long j16 = j15 & 4611686018427387903L;
                    boolean z11 = (j15 & 4611686018427387904L) != 0;
                    if (j14 == j16 && j14 == atomicLongFieldUpdater.get(hVar)) {
                        break;
                    }
                    if (z11) {
                        hVar = this;
                    } else {
                        hVar = this;
                        atomicLongFieldUpdater2.compareAndSet(hVar, j15, 4611686018427387904L + j16);
                    }
                }
                while (true) {
                    long j17 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j17, j17 & 4611686018427387903L)) {
                        return;
                    } else {
                        hVar = this;
                    }
                }
            }
        }
    }

    @Override // tz.v
    public final zz.e b() {
        d dVar = d.f52669a;
        c0.d(3, dVar);
        e eVar = e.f52670a;
        c0.d(3, eVar);
        return new ob.i(this, dVar, eVar, null, 18);
    }

    @Override // tz.v
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    @Override // tz.v
    public final Object d() {
        p pVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f52678c;
        long j11 = atomicLongFieldUpdater.get(this);
        long j12 = f52677b.get(this);
        if (v(j12, true)) {
            return new m(q());
        }
        long j13 = j12 & 1152921504606846975L;
        n nVar = o.f52706b;
        if (j11 >= j13) {
            return nVar;
        }
        Object obj = j.f52695k;
        p pVar2 = (p) f52682t.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j14 = j.f52686b;
            long j15 = andIncrement / j14;
            int i11 = (int) (andIncrement % j14);
            if (pVar2.f55543c != j15) {
                p pVarP = p(j15, pVar2);
                if (pVarP == null) {
                    continue;
                } else {
                    pVar = pVarP;
                }
            } else {
                pVar = pVar2;
            }
            Object objH = H(pVar, i11, andIncrement, obj);
            p pVar3 = pVar;
            if (objH == j.m) {
                j2 j2Var = obj instanceof j2 ? (j2) obj : null;
                if (j2Var != null) {
                    j2Var.b(pVar3, i11);
                }
                J(andIncrement);
                pVar3.i();
                return nVar;
            }
            if (objH != j.f52698o) {
                if (objH == j.f52697n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.b();
                return objH;
            }
            if (andIncrement < t()) {
                pVar3.b();
            }
            pVar2 = pVar3;
        }
        return new m(q());
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173 A[RETURN] */
    @Override // tz.w
    public Object f(Object obj, vy.d dVar) throws Throwable {
        b0 b0Var;
        Object objR;
        wy.a aVar;
        Object obj2;
        h hVar;
        p pVar;
        boolean z11;
        h hVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52681f;
        p pVar2 = (p) atomicReferenceFieldUpdater.get(hVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f52677b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(hVar2);
            long j11 = andIncrement & 1152921504606846975L;
            boolean zV = hVar2.v(andIncrement, false);
            int i11 = j.f52686b;
            long j12 = i11;
            long j13 = j11 / j12;
            int i12 = (int) (j11 % j12);
            long j14 = pVar2.f55543c;
            b0Var = b0.f48488a;
            if (j14 != j13) {
                p pVarA = a(hVar2, j13, pVar2);
                if (pVarA != null) {
                    pVar2 = pVarA;
                } else if (zV) {
                    Object objB = B(obj, dVar);
                    if (objB != wy.a.COROUTINE_SUSPENDED) {
                        break;
                    }
                    return objB;
                }
            }
            int iE = e(hVar2, pVar2, i12, obj, j11, null, zV);
            if (iE == 0) {
                pVar2.b();
                return b0Var;
            }
            if (iE == 1) {
                break;
            }
            if (iE != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f52678c;
                if (iE == 3) {
                    rz.m mVarT = e0.t(ue.f.x(dVar));
                    Object obj3 = obj;
                    try {
                        int iE2 = e(hVar2, pVar2, i12, obj3, j11, mVarT, false);
                        try {
                            if (iE2 != 0) {
                                if (iE2 == 1) {
                                    mVarT.resumeWith(b0Var);
                                } else if (iE2 != 2) {
                                    if (iE2 != 4) {
                                        String str = "unexpected";
                                        if (iE2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar2.b();
                                        p pVar3 = (p) atomicReferenceFieldUpdater.get(hVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hVar2);
                                            long j15 = andIncrement2 & 1152921504606846975L;
                                            boolean zV2 = hVar2.v(andIncrement2, false);
                                            int i13 = j.f52686b;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j16 = i13;
                                            str = str;
                                            long j17 = j15 / j16;
                                            int i14 = (int) (j15 % j16);
                                            atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                            if (pVar3.f55543c != j17) {
                                                p pVarA2 = a(hVar2, j17, pVar3);
                                                if (pVarA2 != null) {
                                                    z11 = zV2;
                                                    pVar = pVarA2;
                                                } else if (zV2) {
                                                    c(hVar2, obj3, mVarT);
                                                    break;
                                                }
                                            } else {
                                                pVar = pVar3;
                                                z11 = zV2;
                                            }
                                            int iE3 = e(hVar2, pVar, i14, obj3, j15, mVarT, z11);
                                            Object obj4 = obj3;
                                            hVar = hVar2;
                                            p pVar4 = pVar;
                                            obj2 = obj4;
                                            if (iE3 == 0) {
                                                pVar4.b();
                                            } else if (iE3 != 1) {
                                                if (iE3 == 2) {
                                                    if (!z11) {
                                                        mVarT.b(pVar4, i14 + i13);
                                                        break;
                                                    }
                                                    pVar4.i();
                                                } else {
                                                    if (iE3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iE3 != 4) {
                                                        if (iE3 == 5) {
                                                            pVar4.b();
                                                        }
                                                        pVar3 = pVar4;
                                                        hVar2 = hVar;
                                                        obj3 = obj2;
                                                    } else if (j15 < atomicLongFieldUpdater2.get(hVar)) {
                                                        pVar4.b();
                                                    }
                                                }
                                            }
                                        }
                                        mVarT.B();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    hVar = hVar2;
                                    if (j11 < atomicLongFieldUpdater2.get(hVar)) {
                                        pVar2.b();
                                    }
                                    c(hVar, obj2, mVarT);
                                    break;
                                } else {
                                    mVarT.b(pVar2, i12 + i11);
                                }
                                objR = mVarT.r();
                                aVar = wy.a.COROUTINE_SUSPENDED;
                                if (objR != aVar) {
                                    objR = b0Var;
                                }
                                if (objR == aVar) {
                                    return objR;
                                }
                            } else {
                                pVar2.b();
                            }
                            mVarT.resumeWith(b0Var);
                            objR = mVarT.r();
                            aVar = wy.a.COROUTINE_SUSPENDED;
                            if (objR != aVar) {
                                objR = b0Var;
                            }
                            if (objR == aVar) {
                                return objR;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    if (iE == 4) {
                        if (j11 < atomicLongFieldUpdater2.get(hVar2)) {
                            pVar2.b();
                        }
                        Object objB2 = B(obj, dVar);
                        if (objB2 != wy.a.COROUTINE_SUSPENDED) {
                            break;
                        }
                        return objB2;
                    }
                    if (iE == 5) {
                        pVar2.b();
                    }
                }
            } else if (zV) {
                pVar2.i();
                Object objB3 = B(obj, dVar);
                if (objB3 == wy.a.COROUTINE_SUSPENDED) {
                    return objB3;
                }
            }
            return b0Var;
        }
        return b0Var;
    }

    @Override // tz.v
    public final Object g(vy.d dVar) throws Throwable {
        p pVar;
        Throwable th2;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52682t;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f52678c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = j.f52686b;
            long j12 = andIncrement / j11;
            int i11 = (int) (andIncrement % j11);
            if (pVar3.f55543c != j12) {
                p pVarP = p(j12, pVar3);
                if (pVarP == null) {
                    continue;
                } else {
                    pVar = pVarP;
                }
            } else {
                pVar = pVar3;
            }
            Object objH = H(pVar, i11, andIncrement, null);
            com.android.billingclient.api.a aVar = j.m;
            if (objH == aVar) {
                throw new IllegalStateException("unexpected");
            }
            com.android.billingclient.api.a aVar2 = j.f52698o;
            if (objH == aVar2) {
                if (andIncrement < t()) {
                    pVar.b();
                }
                pVar3 = pVar;
            } else {
                if (objH != j.f52697n) {
                    pVar.b();
                    return objH;
                }
                rz.m mVarT = e0.t(ue.f.x(dVar));
                h hVar = this;
                try {
                    Object objH2 = hVar.H(pVar, i11, andIncrement, mVarT);
                    if (objH2 != aVar) {
                        if (objH2 == aVar2) {
                            if (andIncrement < t()) {
                                pVar.b();
                            }
                            p pVar4 = (p) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (w()) {
                                    mVarT.resumeWith(com.bumptech.glide.e.l(r()));
                                    break;
                                }
                                rz.m mVar = mVarT;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j13 = j.f52686b;
                                    long j14 = andIncrement2 / j13;
                                    int i12 = (int) (andIncrement2 % j13);
                                    if (pVar4.f55543c != j14) {
                                        try {
                                            p pVarP2 = p(j14, pVar4);
                                            if (pVarP2 == null) {
                                                mVarT = mVar;
                                            } else {
                                                pVar2 = pVarP2;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            mVarT = mVar;
                                            mVarT.B();
                                            throw th2;
                                        }
                                    } else {
                                        pVar2 = pVar4;
                                    }
                                    objH2 = hVar.H(pVar2, i12, andIncrement2, mVar);
                                    p pVar5 = pVar2;
                                    mVarT = mVar;
                                    if (objH2 == j.m) {
                                        mVarT.b(pVar5, i12);
                                        break;
                                    }
                                    if (objH2 == j.f52698o) {
                                        if (andIncrement2 < t()) {
                                            pVar5.b();
                                        }
                                        hVar = this;
                                        pVar4 = pVar5;
                                    } else {
                                        if (objH2 == j.f52697n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar5.b();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    mVarT = mVar;
                                    th2 = th;
                                    mVarT.B();
                                    throw th2;
                                }
                            }
                        } else {
                            pVar.b();
                        }
                        mVarT.a(objH2, null);
                        break;
                    }
                    mVarT.b(pVar, i11);
                    Object objR = mVarT.r();
                    wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                    return objR;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        Throwable thR = r();
        int i13 = wz.s.f55544a;
        throw thR;
    }

    public final boolean h(long j11) {
        return j11 < f52679d.get(this) || j11 < f52678c.get(this) + ((long) this.f52683a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // tz.w
    public Object i(Object obj) {
        int iE;
        b0 b0Var;
        j2 j2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f52677b;
        long j11 = atomicLongFieldUpdater.get(this);
        boolean z11 = false;
        long j12 = 1152921504606846975L;
        boolean z12 = v(j11, false) ? false : !h(j11 & 1152921504606846975L);
        n nVar = o.f52706b;
        if (z12) {
            return nVar;
        }
        v5.n nVar2 = j.f52694j;
        p pVar = (p) f52681f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = andIncrement & j12;
            boolean zV = v(andIncrement, z11);
            int i11 = j.f52686b;
            long j14 = i11;
            long j15 = j13 / j14;
            int i12 = (int) (j13 % j14);
            if (pVar.f55543c == j15) {
                iE = e(this, pVar, i12, obj, j13, nVar2, zV);
                b0Var = b0.f48488a;
                if (iE != 0) {
                    pVar.b();
                    return b0Var;
                }
                if (iE != 1) {
                    return b0Var;
                }
                if (iE != 2) {
                    if (zV) {
                        pVar.i();
                        return new m(s());
                    }
                    if (nVar2 instanceof j2) {
                        j2Var = (j2) nVar2;
                    } else {
                        j2Var = null;
                    }
                    if (j2Var != null) {
                        j2Var.b(pVar, i12 + i11);
                    }
                    pVar.i();
                    return nVar;
                }
                if (iE != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iE != 4) {
                    if (j13 < f52678c.get(this)) {
                        pVar.b();
                    }
                    return new m(s());
                }
                if (iE == 5) {
                    pVar.b();
                }
                z11 = false;
            } else {
                p pVarA = a(this, j15, pVar);
                if (pVarA != null) {
                    pVar = pVarA;
                    iE = e(this, pVar, i12, obj, j13, nVar2, zV);
                    b0Var = b0.f48488a;
                    if (iE != 0) {
                        pVar.b();
                        return b0Var;
                    }
                    if (iE != 1) {
                        return b0Var;
                    }
                    if (iE != 2) {
                        if (zV) {
                            pVar.i();
                            return new m(s());
                        }
                        if (nVar2 instanceof j2) {
                            j2Var = (j2) nVar2;
                        } else {
                            j2Var = null;
                        }
                        if (j2Var != null) {
                            j2Var.b(pVar, i12 + i11);
                        }
                        pVar.i();
                        return nVar;
                    }
                    if (iE != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iE != 4) {
                        if (j13 < f52678c.get(this)) {
                            pVar.b();
                        }
                        return new m(s());
                    }
                    if (iE == 5) {
                        pVar.b();
                    }
                    z11 = false;
                } else {
                    if (zV) {
                        return new m(s());
                    }
                    z11 = false;
                }
            }
            j12 = 1152921504606846975L;
        }
    }

    @Override // tz.v
    public final c iterator() {
        return new c(this);
    }

    @Override // tz.v
    public final Object j(mi.b bVar) {
        return C(this, bVar);
    }

    public final boolean k(Throwable th2) {
        return l(th2, false);
    }

    public final boolean l(Throwable th2, boolean z11) {
        h hVar;
        boolean z12;
        long j11;
        long j12;
        long j13;
        Object obj;
        long j14;
        long j15;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f52677b;
        if (!z11) {
            hVar = this;
            break;
        }
        do {
            j15 = atomicLongFieldUpdater.get(this);
            if (((int) (j15 >> 60)) != 0) {
                hVar = this;
                break;
            }
            p pVar = j.f52685a;
            hVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(hVar, j15, (j15 & 1152921504606846975L) + (((long) 1) << 60)));
        com.android.billingclient.api.a aVar = j.f52702s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K;
            if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, th2)) {
                z12 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != aVar) {
                z12 = false;
                break;
            }
        }
        if (z11) {
            do {
                j14 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j14, (((long) 3) << 60) + (j14 & 1152921504606846975L)));
        } else {
            do {
                j11 = atomicLongFieldUpdater.get(this);
                int i11 = (int) (j11 >> 60);
                if (i11 == 0) {
                    j12 = j11 & 1152921504606846975L;
                    j13 = 2;
                } else {
                    if (i11 != 1) {
                        break;
                    }
                    j12 = j11 & 1152921504606846975L;
                    j13 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j11, (j13 << 60) + j12));
        }
        x();
        if (z12) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = L;
                obj = atomicReferenceFieldUpdater2.get(this);
                com.android.billingclient.api.a aVar2 = obj == null ? j.f52700q : j.f52701r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, aVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                c0.d(1, obj);
                ((fz.c) obj).invoke(q());
                return z12;
            }
        }
        return z12;
    }

    public final p m(long j11) {
        Object objF;
        long j12;
        Object obj = H.get(this);
        p pVar = (p) f52681f.get(this);
        if (pVar.f55543c > ((p) obj).f55543c) {
            obj = pVar;
        }
        p pVar2 = (p) f52682t.get(this);
        if (pVar2.f55543c > ((p) obj).f55543c) {
            obj = pVar2;
        }
        wz.c cVar = (wz.c) obj;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wz.c.f55508a;
            Object obj2 = atomicReferenceFieldUpdater.get(cVar);
            com.android.billingclient.api.a aVar = wz.b.f55501a;
            objF = null;
            if (obj2 == aVar) {
                break;
            }
            wz.c cVar2 = (wz.c) obj2;
            if (cVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, aVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(cVar) == null);
            } else {
                cVar = cVar2;
            }
        }
        p pVar3 = (p) cVar;
        if (y()) {
            p pVar4 = pVar3;
            loop2: while (true) {
                int i11 = j.f52686b - 1;
                while (true) {
                    if (-1 < i11) {
                        j12 = (pVar4.f55543c * ((long) j.f52686b)) + ((long) i11);
                        if (j12 >= f52678c.get(this)) {
                            while (true) {
                                Object objL = pVar4.l(i11);
                                if (objL != null && objL != j.f52689e) {
                                    if (objL != j.f52688d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (pVar4.k(i11, objL, j.f52696l)) {
                                    pVar4.i();
                                    break;
                                }
                            }
                            i11--;
                        }
                    } else {
                        pVar4 = (p) ((wz.c) wz.c.f55509b.get(pVar4));
                        if (pVar4 == null) {
                        }
                    }
                    j12 = -1;
                    break;
                }
            }
            if (j12 != -1) {
                n(j12);
            }
        }
        loop5: for (p pVar5 = pVar3; pVar5 != null; pVar5 = (p) ((wz.c) wz.c.f55509b.get(pVar5))) {
            for (int i12 = j.f52686b - 1; -1 < i12; i12--) {
                if ((pVar5.f55543c * ((long) j.f52686b)) + ((long) i12) < j11) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = pVar5.l(i12);
                    if (objL2 != null && objL2 != j.f52689e) {
                        if (!(objL2 instanceof x)) {
                            if (!(objL2 instanceof j2)) {
                                break;
                            }
                            if (pVar5.k(i12, objL2, j.f52696l)) {
                                objF = wz.b.f(objF, objL2);
                                pVar5.m(i12, true);
                                break;
                            }
                        } else {
                            if (pVar5.k(i12, objL2, j.f52696l)) {
                                objF = wz.b.f(objF, ((x) objL2).f52715a);
                                pVar5.m(i12, true);
                                break;
                            }
                        }
                    } else {
                        if (pVar5.k(i12, objL2, j.f52696l)) {
                            pVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                E((j2) objF, true);
                return pVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                E((j2) arrayList.get(size), true);
            }
        }
        return pVar3;
    }

    public final void n(long j11) {
        p pVar = (p) f52682t.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f52678c;
            long j12 = atomicLongFieldUpdater.get(this);
            if (j11 < Math.max(((long) this.f52683a) + j12, f52679d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j12, 1 + j12)) {
                long j13 = j.f52686b;
                long j14 = j12 / j13;
                int i11 = (int) (j12 % j13);
                if (pVar.f55543c != j14) {
                    p pVarP = p(j14, pVar);
                    if (pVarP != null) {
                        pVar = pVarP;
                    }
                }
                p pVar2 = pVar;
                if (H(pVar2, i11, j12, null) != j.f52698o || j12 < t()) {
                    pVar2.b();
                }
                pVar = pVar2;
            }
        }
    }

    public final void o() {
        Object objB;
        if (z()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f52679d.getAndIncrement(this);
            long j11 = andIncrement / ((long) j.f52686b);
            if (t() <= andIncrement) {
                if (pVar.f55543c < j11 && pVar.c() != null) {
                    A(j11, pVar);
                }
                u(this);
                return;
            }
            if (pVar.f55543c != j11) {
                i iVar = i.f52684a;
                while (true) {
                    objB = wz.b.b(pVar, j11, iVar);
                    if (!wz.b.e(objB)) {
                        wz.r rVarC = wz.b.c(objB);
                        while (true) {
                            wz.r rVar = (wz.r) atomicReferenceFieldUpdater.get(this);
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
                p pVar2 = null;
                if (wz.b.e(objB)) {
                    x();
                    A(j11, pVar);
                    u(this);
                } else {
                    p pVar3 = (p) wz.b.c(objB);
                    long j12 = pVar3.f55543c;
                    if (j12 > j11) {
                        long j13 = j12 * ((long) j.f52686b);
                        if (f52679d.compareAndSet(this, 1 + andIncrement, j13)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f52680e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j13 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            u(this);
                        }
                    } else {
                        pVar2 = pVar3;
                    }
                }
                if (pVar2 == null) {
                    continue;
                } else {
                    pVar = pVar2;
                }
            }
            int i11 = (int) (andIncrement % ((long) j.f52686b));
            Object objL = pVar.l(i11);
            boolean z11 = objL instanceof j2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f52678c;
            if (!z11 || andIncrement < atomicLongFieldUpdater2.get(this) || !pVar.k(i11, objL, j.f52691g)) {
                while (true) {
                    Object objL2 = pVar.l(i11);
                    if (objL2 instanceof j2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (pVar.k(i11, objL2, new x((j2) objL2))) {
                                u(this);
                                return;
                            }
                        } else if (pVar.k(i11, objL2, j.f52691g)) {
                            if (!G(objL2, pVar, i11)) {
                                pVar.o(i11, j.f52694j);
                                pVar.i();
                                break;
                            } else {
                                pVar.o(i11, j.f52688d);
                                u(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == j.f52694j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (pVar.k(i11, objL2, j.f52689e)) {
                                u(this);
                                return;
                            }
                        } else if (objL2 == j.f52688d || objL2 == j.f52692h || objL2 == j.f52693i || objL2 == j.f52695k || objL2 == j.f52696l) {
                            u(this);
                            return;
                        } else if (objL2 != j.f52690f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                u(this);
            } else if (G(objL, pVar, i11)) {
                pVar.o(i11, j.f52688d);
                u(this);
                return;
            } else {
                pVar.o(i11, j.f52694j);
                pVar.i();
                u(this);
            }
        }
    }

    public final p p(long j11, p pVar) {
        Object objB;
        long j12;
        p pVar2 = j.f52685a;
        i iVar = i.f52684a;
        loop0: while (true) {
            objB = wz.b.b(pVar, j11, iVar);
            if (!wz.b.e(objB)) {
                wz.r rVarC = wz.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52682t;
                    wz.r rVar = (wz.r) atomicReferenceFieldUpdater.get(this);
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
        if (wz.b.e(objB)) {
            x();
            if (pVar.f55543c * ((long) j.f52686b) < t()) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) wz.b.c(objB);
            long j13 = pVar3.f55543c;
            if (!z() && j11 <= f52679d.get(this) / ((long) j.f52686b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = H;
                    wz.r rVar2 = (wz.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f55543c >= j13 || !pVar3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, pVar3)) {
                            if (!rVar2.f()) {
                                break loop3;
                            }
                            rVar2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == rVar2);
                    if (pVar3.f()) {
                        pVar3.e();
                    }
                }
            }
            if (j13 <= j11) {
                return pVar3;
            }
            long j14 = j13 * ((long) j.f52686b);
            do {
                j12 = f52678c.get(this);
                if (j12 >= j14) {
                    break;
                }
            } while (!f52678c.compareAndSet(this, j12, j14));
            if (j13 * ((long) j.f52686b) < t()) {
                pVar3.b();
            }
        }
        return null;
    }

    public final Throwable q() {
        return (Throwable) K.get(this);
    }

    public final Throwable r() {
        Throwable thQ = q();
        return thQ == null ? new ClosedReceiveChannelException("Channel was closed") : thQ;
    }

    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new ClosedSendChannelException("Channel was closed") : thQ;
    }

    public final long t() {
        return f52677b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i11 = (int) (f52677b.get(this) >> 60);
        if (i11 == 2) {
            sb2.append("closed,");
        } else if (i11 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f52683a + ',');
        sb2.append("data=[");
        int i12 = 0;
        boolean z11 = true;
        List listL = ns.o.L(f52682t.get(this), f52681f.get(this), H.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (((p) obj) != j.f52685a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j11 = ((p) next).f55543c;
            do {
                Object next2 = it.next();
                long j12 = ((p) next2).f55543c;
                if (j11 > j12) {
                    next = next2;
                    j11 = j12;
                }
            } while (it.hasNext());
        }
        p pVar = (p) next;
        long j13 = f52678c.get(this);
        long jT = t();
        loop2: while (true) {
            int i13 = j.f52686b;
            int i14 = i12;
            while (i14 < i13) {
                long j14 = (pVar.f55543c * ((long) j.f52686b)) + ((long) i14);
                if (j14 >= jT && j14 >= j13) {
                    break loop2;
                }
                Object objL = pVar.l(i14);
                boolean z12 = z11;
                Object obj2 = pVar.f52709f.get(i14 * 2);
                if (objL instanceof rz.l) {
                    string = (j14 >= j13 || j14 < jT) ? (j14 >= jT || j14 < j13) ? "cont" : "send" : "receive";
                } else if (objL instanceof zz.i) {
                    string = (j14 >= j13 || j14 < jT) ? (j14 >= jT || j14 < j13) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof u) {
                    string = "receiveCatching";
                } else if (objL instanceof x) {
                    string = "EB(" + objL + ')';
                } else if (kotlin.jvm.internal.m.a(objL, j.f52690f) || kotlin.jvm.internal.m.a(objL, j.f52691g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(j.f52689e) && !objL.equals(j.f52693i) && !objL.equals(j.f52692h) && !objL.equals(j.f52695k) && !objL.equals(j.f52694j) && !objL.equals(j.f52696l)) {
                        string = objL.toString();
                    }
                    i14++;
                    z11 = z12;
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
                i14++;
                z11 = z12;
            }
            boolean z13 = z11;
            pVar = (p) pVar.c();
            if (pVar == null) {
                break;
            }
            z11 = z13;
            i12 = 0;
        }
        if (oz.q.L0(sb2) == ',') {
            kotlin.jvm.internal.m.e(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean v(long j11, boolean z11) {
        int i11 = (int) (j11 >> 60);
        if (i11 != 0 && i11 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f52678c;
            if (i11 == 2) {
                m(1152921504606846975L & j11);
                if (z11) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52682t;
                        p pVarP = (p) atomicReferenceFieldUpdater.get(this);
                        long j12 = atomicLongFieldUpdater.get(this);
                        if (t() <= j12) {
                            break;
                        }
                        long j13 = j.f52686b;
                        long j14 = j12 / j13;
                        if (pVarP.f55543c != j14 && (pVarP = p(j14, pVarP)) == null) {
                            if (((p) atomicReferenceFieldUpdater.get(this)).f55543c < j14) {
                                break;
                            }
                        } else {
                            pVarP.b();
                            int i12 = (int) (j12 % j13);
                            while (true) {
                                Object objL = pVarP.l(i12);
                                if (objL != null && objL != j.f52689e) {
                                    if (objL != j.f52688d && (objL == j.f52694j || objL == j.f52696l || objL == j.f52693i || objL == j.f52692h || (objL != j.f52691g && (objL == j.f52690f || j12 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (pVarP.k(i12, objL, j.f52692h)) {
                                    o();
                                    break;
                                }
                            }
                            f52678c.compareAndSet(this, j12, j12 + 1);
                        }
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException(nv.p.j(i11, "unexpected close status: ").toString());
                }
                p pVarM = m(1152921504606846975L & j11);
                Object objF = null;
                loop0: do {
                    for (int i13 = j.f52686b - 1; -1 < i13; i13--) {
                        long j15 = (pVarM.f55543c * ((long) j.f52686b)) + ((long) i13);
                        while (true) {
                            Object objL2 = pVarM.l(i13);
                            if (objL2 == j.f52693i) {
                                break loop0;
                            }
                            if (objL2 != j.f52688d) {
                                if (objL2 != j.f52689e && objL2 != null) {
                                    if (!(objL2 instanceof j2) && !(objL2 instanceof x)) {
                                        com.android.billingclient.api.a aVar = j.f52691g;
                                        if (objL2 == aVar || objL2 == j.f52690f) {
                                            break loop0;
                                        }
                                        if (objL2 != aVar) {
                                            break;
                                        }
                                    } else {
                                        if (j15 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        j2 j2Var = objL2 instanceof x ? ((x) objL2).f52715a : (j2) objL2;
                                        if (pVarM.k(i13, objL2, j.f52696l)) {
                                            objF = wz.b.f(objF, j2Var);
                                            pVarM.n(i13, null);
                                            pVarM.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (pVarM.k(i13, objL2, j.f52696l)) {
                                        pVarM.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j15 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (pVarM.k(i13, objL2, j.f52696l)) {
                                    pVarM.n(i13, null);
                                    pVarM.i();
                                    break;
                                }
                            }
                        }
                    }
                    pVarM = (p) ((wz.c) wz.c.f55509b.get(pVarM));
                } while (pVarM != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            E((j2) arrayList.get(size), false);
                        }
                    } else {
                        E((j2) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean w() {
        return v(f52677b.get(this), true);
    }

    public final boolean x() {
        return v(f52677b.get(this), false);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j11 = f52679d.get(this);
        return j11 == 0 || j11 == Long.MAX_VALUE;
    }
}
