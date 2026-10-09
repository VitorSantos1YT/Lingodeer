package rz;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import mt.c4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.android.billingclient.api.a f50882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.android.billingclient.api.a f50883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.android.billingclient.api.a f50884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.android.billingclient.api.a f50885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.android.billingclient.api.a f50886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.android.billingclient.api.a f50887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.android.billingclient.api.a f50888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.android.billingclient.api.a f50889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s0 f50890i = new s0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s0 f50891j = new s0(true);

    static {
        int i11 = 2;
        f50882a = new com.android.billingclient.api.a("RESUME_TOKEN", i11);
        f50883b = new com.android.billingclient.api.a("REMOVED_TASK", i11);
        f50884c = new com.android.billingclient.api.a("CLOSED_EMPTY", i11);
        f50885d = new com.android.billingclient.api.a("COMPLETING_ALREADY", i11);
        f50886e = new com.android.billingclient.api.a("COMPLETING_WAITING_CHILDREN", i11);
        f50887f = new com.android.billingclient.api.a("COMPLETING_RETRY", i11);
        f50888g = new com.android.billingclient.api.a("TOO_LATE_TO_CANCEL", i11);
        f50889h = new com.android.billingclient.api.a("SEALED", i11);
    }

    public static final z1 A(b0 b0Var, vy.i iVar, d0 d0Var, fz.e eVar) {
        vy.i iVarC = C(b0Var, iVar);
        d0Var.getClass();
        z1 s1Var = d0Var == d0.LAZY ? new s1(iVarC, eVar) : new z1(iVarC, true);
        s1Var.Z(d0Var, s1Var, eVar);
        return s1Var;
    }

    public static /* synthetic */ z1 B(b0 b0Var, vy.i iVar, d0 d0Var, fz.e eVar, int i11) {
        if ((i11 & 1) != 0) {
            iVar = vy.j.f54321a;
        }
        if ((i11 & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        return A(b0Var, iVar, d0Var, eVar);
    }

    public static final vy.i C(b0 b0Var, vy.i iVar) {
        vy.i iVarO = o(b0Var.getCoroutineContext(), iVar, true);
        yz.f fVar = o0.f50940a;
        return (iVarO == fVar || iVarO.get(vy.e.f54320a) != null) ? iVarO : iVarO.plus(fVar);
    }

    public static final Object D(Object obj) {
        return obj instanceof v ? com.bumptech.glide.e.l(((v) obj).f50961a) : obj;
    }

    public static final void E(m mVar, vy.d dVar, boolean z11) {
        Object obj = m.f50929t.get(mVar);
        Throwable thE = mVar.e(obj);
        Object objL = thE != null ? com.bumptech.glide.e.l(thE) : mVar.f(obj);
        if (!z11) {
            dVar.resumeWith(objL);
            return;
        }
        kotlin.jvm.internal.m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        wz.f fVar = (wz.f) dVar;
        vy.d dVar2 = fVar.f55513e;
        Object obj2 = fVar.f55515t;
        vy.i context = dVar2.getContext();
        Object objN = wz.b.n(context, obj2);
        h2 h2VarL = objN != wz.b.f55504d ? L(dVar2, context, objN) : null;
        try {
            dVar2.resumeWith(objL);
        } finally {
            if (h2VarL == null || h2VarL.b0()) {
                wz.b.g(context, objN);
            }
        }
    }

    public static final Object F(vy.i iVar, fz.e eVar) throws Throwable {
        y0 y0VarA;
        vy.i iVarO;
        long jQ;
        Thread threadCurrentThread = Thread.currentThread();
        vy.h hVar = vy.e.f54320a;
        vy.f fVar = (vy.f) iVar.get(hVar);
        vy.j jVar = vy.j.f54321a;
        if (fVar == null) {
            y0VarA = c2.a();
            iVarO = o(jVar, iVar.plus(y0VarA), true);
            yz.f fVar2 = o0.f50940a;
            if (iVarO != fVar2 && iVarO.get(hVar) == null) {
                iVarO = iVarO.plus(fVar2);
            }
        } else {
            if (fVar instanceof y0) {
            }
            y0VarA = (y0) c2.f50875a.get();
            iVarO = o(jVar, iVar, true);
            yz.f fVar3 = o0.f50940a;
            if (iVarO != fVar3 && iVarO.get(hVar) == null) {
                iVarO = iVarO.plus(fVar3);
            }
        }
        h hVar2 = new h(iVarO, threadCurrentThread, y0VarA);
        hVar2.Z(d0.DEFAULT, hVar2, eVar);
        y0 y0Var = hVar2.f50910e;
        if (y0Var != null) {
            int i11 = y0.f50973d;
            y0Var.i(false);
        }
        while (true) {
            if (y0Var != null) {
                try {
                    jQ = y0Var.q();
                } catch (Throwable th2) {
                    if (y0Var != null) {
                        int i12 = y0.f50973d;
                        y0Var.d(false);
                    }
                    throw th2;
                }
            } else {
                jQ = Long.MAX_VALUE;
            }
            if (hVar2.H()) {
                break;
            }
            LockSupport.parkNanos(hVar2, jQ);
            if (Thread.interrupted()) {
                hVar2.q(new InterruptedException());
            }
        }
        if (y0Var != null) {
            int i13 = y0.f50973d;
            y0Var.d(false);
        }
        Object objK = K(q1.f50945a.get(hVar2));
        v vVar = objK instanceof v ? (v) objK : null;
        if (vVar == null) {
            return objK;
        }
        throw vVar.f50961a;
    }

    public static final Object H(e2 e2Var, fz.e eVar) {
        v(e2Var, true, new r0(q(e2Var.f55541d.getContext()).b(e2Var.f50893e, e2Var, e2Var.f50863c), 0));
        return ff.h.O(e2Var, false, e2Var, eVar);
    }

    public static final String I(vy.d dVar) {
        Object objL;
        if (dVar instanceof wz.f) {
            return ((wz.f) dVar).toString();
        }
        try {
            objL = dVar + '@' + r(dVar);
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        if (qy.o.a(objL) != null) {
            objL = dVar.getClass().getName() + '@' + r(dVar);
        }
        return (String) objL;
    }

    public static final long J(long j11) {
        int i11 = pz.a.f47220d;
        boolean z11 = j11 > 0;
        if (z11) {
            return pz.a.e(pz.a.h(j11, pz.f.q(999999L, pz.c.NANOSECONDS)));
        }
        if (z11) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }

    public static final Object K(Object obj) {
        d1 d1Var;
        e1 e1Var = obj instanceof e1 ? (e1) obj : null;
        return (e1Var == null || (d1Var = e1Var.f50892a) == null) ? obj : d1Var;
    }

    public static final h2 L(vy.d dVar, vy.i iVar, Object obj) {
        h2 h2Var = null;
        if ((dVar instanceof xy.d) && iVar.get(i2.f50914a) != null) {
            xy.d callerFrame = (xy.d) dVar;
            while (!(callerFrame instanceof l0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof h2) {
                    h2Var = (h2) callerFrame;
                    break;
                }
            }
            if (h2Var != null) {
                h2Var.d0(iVar, obj);
            }
        }
        return h2Var;
    }

    public static final Object M(vy.i iVar, fz.e eVar, vy.d dVar) {
        Object objK;
        vy.i context = dVar.getContext();
        vy.i iVarPlus = !((Boolean) iVar.fold(Boolean.FALSE, new os.a(28))).booleanValue() ? context.plus(iVar) : o(context, iVar, false);
        n(iVarPlus);
        if (iVarPlus == context) {
            wz.q qVar = new wz.q(dVar, iVarPlus);
            objK = ff.h.O(qVar, true, qVar, eVar);
        } else {
            vy.e eVar2 = vy.e.f54320a;
            if (kotlin.jvm.internal.m.a(iVarPlus.get(eVar2), context.get(eVar2))) {
                h2 h2Var = new h2(dVar, iVarPlus);
                vy.i iVar2 = h2Var.f50863c;
                Object objN = wz.b.n(iVar2, null);
                try {
                    Object objO = ff.h.O(h2Var, true, h2Var, eVar);
                    wz.b.g(iVar2, objN);
                    objK = objO;
                } catch (Throwable th2) {
                    wz.b.g(iVar2, objN);
                    throw th2;
                }
            } else {
                l0 l0Var = new l0(dVar, iVarPlus);
                try {
                    wz.b.h(qy.b0.f48488a, ue.f.x(ue.f.o(eVar, l0Var, l0Var)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.f50923e;
                    do {
                        int i11 = atomicIntegerFieldUpdater.get(l0Var);
                        if (i11 != 0) {
                            if (i11 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objK = K(q1.f50945a.get(l0Var));
                            if (objK instanceof v) {
                                throw ((v) objK).f50961a;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(l0Var, 0, 1));
                    objK = wy.a.COROUTINE_SUSPENDED;
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).f38363a;
                    }
                    l0Var.resumeWith(com.bumptech.glide.e.l(th));
                    throw th;
                }
            }
        }
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objK;
    }

    public static final Object N(long j11, fz.e eVar, xy.c cVar) {
        if (j11 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objH = H(new e2(j11, cVar), eVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object O(long j11, fz.e eVar, xy.c cVar) {
        f2 f2Var;
        kotlin.jvm.internal.y yVar;
        if (cVar instanceof f2) {
            f2Var = (f2) cVar;
            int i11 = f2Var.f50903c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f2Var.f50903c = i11 - Integer.MIN_VALUE;
            } else {
                f2Var = new f2(cVar);
            }
        } else {
            f2Var = new f2(cVar);
        }
        Object obj = f2Var.f50902b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = f2Var.f50903c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (j11 <= 0) {
                return null;
            }
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            try {
                f2Var.f50901a = yVar2;
                f2Var.f50903c = 1;
                e2 e2Var = new e2(j11, f2Var);
                yVar2.f38361a = e2Var;
                Object objH = H(e2Var, eVar);
                return objH == aVar ? aVar : objH;
            } catch (TimeoutCancellationException e8) {
                e = e8;
                yVar = yVar2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = f2Var.f50901a;
            try {
                com.bumptech.glide.e.F(obj);
                return obj;
            } catch (TimeoutCancellationException e10) {
                e = e10;
            }
        }
        if (e.f38365a == yVar.f38361a) {
            return null;
        }
        throw e;
    }

    public static final Object P(xy.c cVar) {
        Object obj;
        vy.i context = cVar.getContext();
        n(context);
        vy.d dVarX = ue.f.x(cVar);
        wz.f fVar = dVarX instanceof wz.f ? (wz.f) dVarX : null;
        qy.b0 b0Var = qy.b0.f48488a;
        if (fVar == null) {
            obj = b0Var;
        } else {
            y yVar = fVar.f55512d;
            if (wz.b.j(yVar, context)) {
                fVar.f55514f = b0Var;
                fVar.f50932c = 1;
                yVar.dispatchYield(context, fVar);
            } else {
                vy.i iVarPlus = context.plus(new k2(k2.f50922a));
                fVar.f55514f = b0Var;
                fVar.f50932c = 1;
                yVar.dispatchYield(iVarPlus, fVar);
            }
            obj = wy.a.COROUTINE_SUSPENDED;
        }
        return obj == wy.a.COROUTINE_SUSPENDED ? obj : b0Var;
    }

    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    public static t b() {
        t tVar = new t(true);
        tVar.F(null);
        return tVar;
    }

    public static final wz.d c(vy.i iVar) {
        if (iVar.get(z.f50978b) == null) {
            iVar = iVar.plus(d());
        }
        return new wz.d(iVar);
    }

    public static h1 d() {
        return new h1(null);
    }

    public static b2 e() {
        return new b2(null);
    }

    public static i0 f(b0 b0Var, vy.i iVar, d0 d0Var, fz.e eVar, int i11) {
        if ((i11 & 1) != 0) {
            iVar = vy.j.f54321a;
        }
        if ((i11 & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        vy.i iVarC = C(b0Var, iVar);
        d0Var.getClass();
        i0 r1Var = d0Var == d0.LAZY ? new r1(iVarC, eVar) : new i0(iVarC, true);
        r1Var.Z(d0Var, r1Var, eVar);
        return r1Var;
    }

    public static final Object g(List list, vy.d dVar) {
        return list.isEmpty() ? ry.r.f50854a : new e((h0[]) list.toArray(new h0[0])).a(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final wy.a h(xy.c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i11 = k0Var.f50918b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k0Var.f50918b = i11 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(cVar);
            }
        } else {
            k0Var = new k0(cVar);
        }
        Object obj = k0Var.f50917a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = k0Var.f50918b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            k0Var.f50918b = 1;
            m mVar = new m(1, ue.f.x(k0Var));
            mVar.s();
            if (mVar.r() == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final void i(b0 b0Var, CancellationException cancellationException) {
        g1 g1Var = (g1) b0Var.getCoroutineContext().get(z.f50978b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + b0Var).toString());
        }
    }

    public static final void j(vy.i iVar, CancellationException cancellationException) {
        g1 g1Var = (g1) iVar.get(z.f50978b);
        if (g1Var != null) {
            g1Var.cancel(cancellationException);
        }
    }

    public static final Object k(g1 g1Var, xy.i iVar) {
        g1Var.cancel(null);
        Object objJoin = g1Var.join(iVar);
        return objJoin == wy.a.COROUTINE_SUSPENDED ? objJoin : qy.b0.f48488a;
    }

    public static final Object l(fz.e eVar, vy.d dVar) {
        wz.q qVar = new wz.q(dVar, dVar.getContext());
        Object objO = ff.h.O(qVar, true, qVar, eVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objO;
    }

    public static final Object m(long j11, vy.d dVar) {
        if (j11 > 0) {
            m mVar = new m(1, ue.f.x(dVar));
            mVar.s();
            if (j11 < Long.MAX_VALUE) {
                q(mVar.f50931e).a(j11, mVar);
            }
            Object objR = mVar.r();
            if (objR == wy.a.COROUTINE_SUSPENDED) {
                return objR;
            }
        }
        return qy.b0.f48488a;
    }

    public static final void n(vy.i iVar) {
        g1 g1Var = (g1) iVar.get(z.f50978b);
        if (g1Var != null && !g1Var.isActive()) {
            throw g1Var.getCancellationException();
        }
    }

    public static final vy.i o(vy.i iVar, vy.i iVar2, boolean z11) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) iVar.fold(bool, new os.a(28))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.fold(bool, new os.a(28))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.plus(iVar2);
        }
        os.a aVar = new os.a(29);
        vy.j jVar = vy.j.f54321a;
        vy.i iVar3 = (vy.i) iVar.fold(jVar, aVar);
        Object objFold = iVar2;
        if (zBooleanValue2) {
            objFold = iVar2.fold(jVar, new w(0));
        }
        return iVar3.plus((vy.i) objFold);
    }

    public static final y p(Executor executor) {
        return new a1(executor);
    }

    public static final j0 q(vy.i iVar) {
        vy.g gVar = iVar.get(vy.e.f54320a);
        j0 j0Var = gVar instanceof j0 ? (j0) gVar : null;
        return j0Var == null ? g0.f50907a : j0Var;
    }

    public static final String r(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final g1 s(vy.i iVar) {
        g1 g1Var = (g1) iVar.get(z.f50978b);
        if (g1Var != null) {
            return g1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final m t(vy.d dVar) {
        m mVar;
        m mVar2;
        if (!(dVar instanceof wz.f)) {
            return new m(1, dVar);
        }
        wz.f fVar = (wz.f) dVar;
        com.android.billingclient.api.a aVar = wz.b.f55503c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wz.f.H;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            mVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, aVar);
                mVar2 = null;
                break;
            }
            if (obj instanceof m) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, aVar)) {
                        mVar2 = (m) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == obj);
            } else if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (mVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.f50929t;
            Object obj2 = atomicReferenceFieldUpdater2.get(mVar2);
            if (!(obj2 instanceof u) || ((u) obj2).f50957d == null) {
                m.f50928f.set(mVar2, 536870911);
                atomicReferenceFieldUpdater2.set(mVar2, b.f50868a);
                mVar = mVar2;
            } else {
                mVar2.o();
            }
            if (mVar != null) {
                return mVar;
            }
        }
        return new m(2, dVar);
    }

    public static final void u(Throwable th2, vy.i iVar) throws IllegalAccessException, InvocationTargetException {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).f38363a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) iVar.get(z.f50977a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.c(th2, iVar);
            } else {
                wz.b.d(th2, iVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                cf.x.b(runtimeException, th2);
                th2 = runtimeException;
            }
            wz.b.d(th2, iVar);
        }
    }

    public static final q0 v(g1 g1Var, boolean z11, i1 i1Var) {
        if (g1Var instanceof q1) {
            return ((q1) g1Var).G(z11, i1Var);
        }
        return g1Var.invokeOnCompletion(i1Var.i(), z11, new c4(1, i1Var, i1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 16));
    }

    public static final boolean w(b0 b0Var) {
        g1 g1Var = (g1) b0Var.getCoroutineContext().get(z.f50978b);
        if (g1Var != null) {
            return g1Var.isActive();
        }
        return true;
    }

    public static final boolean x(vy.i iVar) {
        g1 g1Var = (g1) iVar.get(z.f50978b);
        if (g1Var != null) {
            return g1Var.isActive();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(List list, xy.c cVar) {
        g gVar;
        Iterator it;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i11 = gVar.f50906c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f50906c = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar);
            }
        } else {
            gVar = new g(cVar);
        }
        Object obj = gVar.f50905b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = gVar.f50906c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            it = list.iterator();
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = gVar.f50904a;
            com.bumptech.glide.e.F(obj);
        }
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            gVar.f50904a = it;
            gVar.f50906c = 1;
            if (g1Var.join(gVar) == aVar) {
                return aVar;
            }
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object z(rz.g1[] r6, xy.c r7) {
        /*
            boolean r0 = r7 instanceof rz.f
            if (r0 == 0) goto L13
            r0 = r7
            rz.f r0 = (rz.f) r0
            int r1 = r0.f50898e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50898e = r1
            goto L18
        L13:
            rz.f r0 = new rz.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f50897d
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f50898e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f50896c
            int r2 = r0.f50895b
            java.lang.Object[] r4 = r0.f50894a
            rz.g1[] r4 = (rz.g1[]) r4
            com.bumptech.glide.e.F(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            com.bumptech.glide.e.F(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.f50894a = r7
            r0.f50895b = r2
            r0.f50896c = r6
            r0.f50898e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rz.e0.z(rz.g1[], xy.c):java.lang.Object");
    }
}
