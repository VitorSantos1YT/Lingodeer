package rz;

import bw.ORXQ.ADSb;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class q1 implements g1, r, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50945a = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50946b = AtomicReferenceFieldUpdater.newUpdater(q1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public q1(boolean z11) {
        this._state$volatile = z11 ? e0.f50891j : e0.f50890i;
    }

    public static q M(wz.i iVar) {
        while (iVar.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wz.i.f55525b;
            wz.i iVarD = iVar.d();
            if (iVarD == null) {
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (wz.i) obj;
                    if (!iVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarD;
            }
        }
        while (true) {
            iVar = iVar.f();
            if (!iVar.g()) {
                if (iVar instanceof q) {
                    return (q) iVar;
                }
                if (iVar instanceof u1) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (!(obj instanceof l1)) {
            if (obj instanceof d1) {
                return ((d1) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof v ? "Cancelled" : "Completed";
        }
        l1 l1Var = (l1) obj;
        if (l1Var.d()) {
            return "Cancelling";
        }
        return l1.f50924b.get(l1Var) == 1 ? "Completing" : "Active";
    }

    public static CancellationException U(q1 q1Var, Throwable th2) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        return cancellationException == null ? new JobCancellationException(q1Var.t(), th2, q1Var) : cancellationException;
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return this instanceof t;
    }

    public final u1 C(d1 d1Var) {
        u1 u1VarB = d1Var.b();
        if (u1VarB != null) {
            return u1VarB;
        }
        if (d1Var instanceof s0) {
            return new u1();
        }
        if (d1Var instanceof i1) {
            R((i1) d1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + d1Var).toString());
    }

    public boolean D(Throwable th2) {
        return false;
    }

    public void E(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void F(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50946b;
        w1 w1Var = w1.f50967a;
        if (g1Var == null) {
            atomicReferenceFieldUpdater.set(this, w1Var);
            return;
        }
        g1Var.start();
        p pVarAttachChild = g1Var.attachChild(this);
        atomicReferenceFieldUpdater.set(this, pVarAttachChild);
        if (H()) {
            pVarAttachChild.dispose();
            atomicReferenceFieldUpdater.set(this, w1Var);
        }
    }

    public final q0 G(boolean z11, i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z12;
        boolean zC;
        i1Var.f50913d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f50945a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z13 = obj instanceof s0;
            w1 w1Var = w1.f50967a;
            z12 = true;
            if (!z13) {
                if (!(obj instanceof d1)) {
                    z12 = false;
                    break;
                }
                d1 d1Var = (d1) obj;
                u1 u1VarB = d1Var.b();
                if (u1VarB == null) {
                    R((i1) obj);
                } else {
                    if (i1Var.i()) {
                        l1 l1Var = d1Var instanceof l1 ? (l1) d1Var : null;
                        Throwable thC = l1Var != null ? l1Var.c() : null;
                        if (thC == null) {
                            zC = u1VarB.c(i1Var, 5);
                        } else if (z11) {
                            i1Var.j(thC);
                            return w1Var;
                        }
                    } else {
                        zC = u1VarB.c(i1Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                s0 s0Var = (s0) obj;
                if (s0Var.f50950a) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, i1Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    Q(s0Var);
                }
            }
            return w1Var;
        }
        if (z12) {
            return i1Var;
        }
        if (z11) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            i1Var.j(vVar != null ? vVar.f50961a : null);
        }
        return w1Var;
    }

    public final boolean H() {
        return !(f50945a.get(this) instanceof d1);
    }

    public boolean I() {
        return this instanceof h;
    }

    public final boolean J(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objV;
        do {
            objV = V(f50945a.get(this), obj);
            if (objV == e0.f50885d) {
                return false;
            }
            if (objV == e0.f50886e) {
                return true;
            }
        } while (objV == e0.f50887f);
        m(objV);
        return true;
    }

    public String L() {
        return getClass().getSimpleName();
    }

    public final void N(u1 u1Var, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        u1Var.c(new wz.h(4), 4);
        Object obj = wz.i.f55524a.get(u1Var);
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (wz.i iVarF = (wz.i) obj; !iVarF.equals(u1Var); iVarF = iVarF.f()) {
            if ((iVarF instanceof i1) && ((i1) iVarF).i()) {
                try {
                    ((i1) iVarF).j(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        cf.x.b(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + iVarF + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            E(completionHandlerException);
        }
        s(th2);
    }

    public void O(Object obj) {
    }

    public void P() {
    }

    public final void Q(s0 s0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1 u1Var = new u1();
        Object c1Var = u1Var;
        if (!s0Var.f50950a) {
            c1Var = new c1(u1Var);
        }
        do {
            atomicReferenceFieldUpdater = f50945a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, s0Var, c1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == s0Var);
    }

    public final void R(i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1 u1Var = new u1();
        i1Var.getClass();
        wz.i.f55525b.set(u1Var, i1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = wz.i.f55524a;
        atomicReferenceFieldUpdater2.set(u1Var, i1Var);
        loop0: while (atomicReferenceFieldUpdater2.get(i1Var) == i1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(i1Var, i1Var, u1Var)) {
                    u1Var.e(i1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(i1Var) == i1Var);
        }
        wz.i iVarF = i1Var.f();
        do {
            atomicReferenceFieldUpdater = f50945a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, i1Var, iVarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == i1Var);
    }

    public final int S(Object obj) {
        boolean z11 = obj instanceof s0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50945a;
        if (z11) {
            if (((s0) obj).f50950a) {
                return 0;
            }
            s0 s0Var = e0.f50891j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            P();
            return 1;
        }
        if (!(obj instanceof c1)) {
            return 0;
        }
        u1 u1Var = ((c1) obj).f50874a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        P();
        return 1;
    }

    public final Object V(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof d1)) {
            return e0.f50885d;
        }
        if (((obj instanceof s0) || (obj instanceof i1)) && !(obj instanceof q) && !(obj2 instanceof v)) {
            d1 d1Var = (d1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50945a;
            Object e1Var = obj2 instanceof d1 ? new e1((d1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, d1Var, e1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != d1Var) {
                    return e0.f50887f;
                }
            }
            O(obj2);
            v(d1Var, obj2);
            return obj2;
        }
        d1 d1Var2 = (d1) obj;
        u1 u1VarC = C(d1Var2);
        if (u1VarC == null) {
            return e0.f50887f;
        }
        l1 l1Var = d1Var2 instanceof l1 ? (l1) d1Var2 : null;
        if (l1Var == null) {
            l1Var = new l1(u1VarC, null);
        }
        synchronized (l1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l1.f50924b;
            if (atomicIntegerFieldUpdater.get(l1Var) == 1) {
                return e0.f50885d;
            }
            atomicIntegerFieldUpdater.set(l1Var, 1);
            if (l1Var != d1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f50945a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, d1Var2, l1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != d1Var2) {
                        return e0.f50887f;
                    }
                }
            }
            boolean zD = l1Var.d();
            v vVar = obj2 instanceof v ? (v) obj2 : null;
            if (vVar != null) {
                l1Var.a(vVar.f50961a);
            }
            Throwable thC = zD ? null : l1Var.c();
            if (thC != null) {
                N(u1VarC, thC);
            }
            q qVarM = M(u1VarC);
            if (qVarM != null && W(l1Var, qVarM, obj2)) {
                return e0.f50886e;
            }
            u1VarC.c(new wz.h(2), 2);
            q qVarM2 = M(u1VarC);
            return (qVarM2 == null || !W(l1Var, qVarM2, obj2)) ? x(l1Var, obj2) : e0.f50886e;
        }
    }

    public final boolean W(l1 l1Var, q qVar, Object obj) {
        while (e0.v(qVar.f50944e, false, new k1(this, l1Var, qVar, obj)) == w1.f50967a) {
            qVar = M(qVar);
            if (qVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // rz.g1
    public final p attachChild(r rVar) {
        q qVar = new q(rVar);
        qVar.f50913d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50945a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof s0) {
                s0 s0Var = (s0) obj;
                if (s0Var.f50950a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                Q(s0Var);
            } else {
                boolean z11 = obj instanceof d1;
                w1 w1Var = w1.f50967a;
                Throwable thC = null;
                if (!z11) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    v vVar = obj2 instanceof v ? (v) obj2 : null;
                    qVar.j(vVar != null ? vVar.f50961a : null);
                    return w1Var;
                }
                u1 u1VarB = ((d1) obj).b();
                if (u1VarB != null) {
                    if (u1VarB.c(qVar, 7)) {
                        break;
                    }
                    boolean zC = u1VarB.c(qVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof l1) {
                        thC = ((l1) obj3).c();
                    } else {
                        v vVar2 = obj3 instanceof v ? (v) obj3 : null;
                        if (vVar2 != null) {
                            thC = vVar2.f50961a;
                        }
                    }
                    qVar.j(thC);
                    if (zC) {
                        break;
                    }
                    return w1Var;
                }
                R((i1) obj);
            }
        }
        return qVar;
    }

    @Override // rz.g1
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(t(), null, this);
        }
        r(cancellationException);
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final vy.g get(vy.h hVar) {
        return ew.a.m(this, hVar);
    }

    @Override // rz.g1
    public final CancellationException getCancellationException() {
        Object obj = f50945a.get(this);
        if (!(obj instanceof l1)) {
            if (!(obj instanceof d1)) {
                return obj instanceof v ? U(this, ((v) obj).f50961a) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thC = ((l1) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = t();
        }
        return new JobCancellationException(strConcat, thC, this);
    }

    @Override // rz.g1
    public final nz.l getChildren() {
        return new nz.o(new a1.c(this, null, 3));
    }

    public Object getCompleted() {
        return y();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = f50945a.get(this);
        if (obj instanceof d1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.f50961a;
        }
        return null;
    }

    @Override // vy.g
    public final vy.h getKey() {
        return z.f50978b;
    }

    @Override // rz.g1
    public final q0 invokeOnCompletion(fz.c cVar) {
        return G(true, new r0(cVar, 1));
    }

    @Override // rz.g1
    public boolean isActive() {
        Object obj = f50945a.get(this);
        return (obj instanceof d1) && ((d1) obj).isActive();
    }

    @Override // rz.g1
    public final boolean isCancelled() {
        Object obj = f50945a.get(this);
        if (obj instanceof v) {
            return true;
        }
        return (obj instanceof l1) && ((l1) obj).d();
    }

    @Override // rz.g1
    public final Object join(vy.d dVar) {
        Object obj;
        qy.b0 b0Var;
        do {
            obj = f50945a.get(this);
            boolean z11 = obj instanceof d1;
            b0Var = qy.b0.f48488a;
            if (!z11) {
                e0.n(dVar.getContext());
                return b0Var;
            }
        } while (S(obj) < 0);
        m mVar = new m(1, ue.f.x(dVar));
        mVar.s();
        mVar.v(new j(e0.v(this, true, new o(mVar, 1)), 2));
        Object objR = mVar.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        if (objR != aVar) {
            objR = b0Var;
        }
        return objR == aVar ? objR : b0Var;
    }

    public void m(Object obj) {
    }

    @Override // vy.i
    public final vy.i minusKey(vy.h hVar) {
        return ew.a.s(this, hVar);
    }

    public void n(Object obj) {
        m(obj);
    }

    public final Object o(vy.d dVar) throws Throwable {
        Object obj;
        do {
            obj = f50945a.get(this);
            if (!(obj instanceof d1)) {
                if (obj instanceof v) {
                    throw ((v) obj).f50961a;
                }
                return e0.K(obj);
            }
        } while (S(obj) < 0);
        j1 j1Var = new j1(ue.f.x(dVar), this);
        j1Var.s();
        int i11 = 2;
        j1Var.v(new j(e0.v(this, true, new r0(j1Var, i11)), i11));
        Object objR = j1Var.r();
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        return objR;
    }

    @Override // vy.i
    public final vy.i plus(vy.i iVar) {
        return ew.a.w(this, iVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:36:0x0072, B:37:0x0076), top: B:81:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0106  */
    /* JADX WARN: Code duplicated, block: B:81:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b4->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean q(Object obj) {
        Throwable thW;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z11;
        Throwable thC;
        com.android.billingclient.api.a aVar;
        d1 d1Var;
        u1 u1VarC;
        l1 l1Var;
        Object objV;
        Object objV2 = e0.f50885d;
        if (B()) {
            do {
                Object obj3 = f50945a.get(this);
                if (obj3 instanceof d1) {
                    if (obj3 instanceof l1) {
                        if (l1.f50924b.get((l1) obj3) == 1) {
                        }
                    }
                    objV2 = V(obj3, new v(w(obj), false));
                }
                objV2 = e0.f50885d;
                break;
            } while (objV2 == e0.f50887f);
            if (objV2 != e0.f50886e) {
                if (objV2 == e0.f50885d) {
                    thW = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f50945a;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof l1) {
                            synchronized (obj2) {
                                if (l1.f50926d.get((l1) obj2) == e0.f50889h) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    aVar = e0.f50888g;
                                } else {
                                    boolean zD = ((l1) obj2).d();
                                    if (thW == null) {
                                        thW = w(obj);
                                    }
                                    ((l1) obj2).a(thW);
                                    thC = zD ? null : ((l1) obj2).c();
                                    if (thC != null) {
                                        N(((l1) obj2).f50927a, thC);
                                    }
                                    aVar = e0.f50885d;
                                }
                            }
                        } else if (obj2 instanceof d1) {
                            if (thW == null) {
                                thW = w(obj);
                            }
                            d1Var = (d1) obj2;
                            if (d1Var.isActive()) {
                                u1VarC = C(d1Var);
                                if (u1VarC == null) {
                                    continue;
                                } else {
                                    l1Var = new l1(u1VarC, thW);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, d1Var, l1Var)) {
                                            N(u1VarC, thW);
                                            aVar = e0.f50885d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != d1Var) {
                                        }
                                    }
                                }
                            } else {
                                objV = V(obj2, new v(thW, false));
                                if (objV != e0.f50885d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objV != e0.f50887f) {
                                    objV2 = objV;
                                    break;
                                }
                            }
                        } else {
                            aVar = e0.f50888g;
                        }
                        objV2 = aVar;
                        break;
                    }
                }
                if (objV2 != e0.f50885d && objV2 != e0.f50886e) {
                    if (objV2 == e0.f50888g) {
                        return false;
                    }
                    m(objV2);
                    return true;
                }
            }
        } else {
            if (objV2 == e0.f50885d) {
                thW = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f50945a;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof l1) {
                        synchronized (obj2) {
                            if (l1.f50926d.get((l1) obj2) == e0.f50889h) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                aVar = e0.f50888g;
                            } else {
                                boolean zD2 = ((l1) obj2).d();
                                if (thW == null) {
                                    thW = w(obj);
                                }
                                ((l1) obj2).a(thW);
                                if (zD2) {
                                }
                                if (thC != null) {
                                    N(((l1) obj2).f50927a, thC);
                                }
                                aVar = e0.f50885d;
                            }
                        }
                    } else if (obj2 instanceof d1) {
                        if (thW == null) {
                            thW = w(obj);
                        }
                        d1Var = (d1) obj2;
                        if (d1Var.isActive()) {
                            u1VarC = C(d1Var);
                            if (u1VarC == null) {
                                continue;
                            } else {
                                l1Var = new l1(u1VarC, thW);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, d1Var, l1Var)) {
                                        N(u1VarC, thW);
                                        aVar = e0.f50885d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != d1Var) {
                                    }
                                }
                            }
                        } else {
                            objV = V(obj2, new v(thW, false));
                            if (objV != e0.f50885d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objV != e0.f50887f) {
                                objV2 = objV;
                                break;
                            }
                        }
                    } else {
                        aVar = e0.f50888g;
                    }
                    objV2 = aVar;
                    break;
                }
            }
            if (objV2 != e0.f50885d) {
                if (objV2 == e0.f50888g) {
                    return false;
                }
                m(objV2);
                return true;
            }
        }
        return true;
    }

    public void r(CancellationException cancellationException) {
        q(cancellationException);
    }

    public final boolean s(Throwable th2) {
        if (I()) {
            return true;
        }
        boolean z11 = th2 instanceof CancellationException;
        p pVar = (p) f50946b.get(this);
        if (pVar == null || pVar == w1.f50967a) {
            return z11;
        }
        return pVar.a(th2) || z11;
    }

    @Override // rz.g1
    public final boolean start() {
        int iS;
        do {
            iS = S(f50945a.get(this));
            if (iS == 0) {
                return false;
            }
        } while (iS != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(L() + '{' + T(f50945a.get(this)) + '}');
        sb2.append('@');
        sb2.append(e0.r(this));
        return sb2.toString();
    }

    public boolean u(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return q(th2) && A();
    }

    public final void v(d1 d1Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50946b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        if (pVar != null) {
            pVar.dispose();
            atomicReferenceFieldUpdater.set(this, w1.f50967a);
        }
        CompletionHandlerException completionHandlerException = null;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.f50961a : null;
        if (d1Var instanceof i1) {
            try {
                ((i1) d1Var).j(th2);
                return;
            } catch (Throwable th3) {
                E(new CompletionHandlerException("Exception in completion handler " + d1Var + " for " + this, th3));
                return;
            }
        }
        u1 u1VarB = d1Var.b();
        if (u1VarB != null) {
            u1VarB.c(new wz.h(1), 1);
            Object obj2 = wz.i.f55524a.get(u1VarB);
            kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (wz.i iVarF = (wz.i) obj2; !iVarF.equals(u1VarB); iVarF = iVarF.f()) {
                if (iVarF instanceof i1) {
                    try {
                        ((i1) iVarF).j(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != null) {
                            cf.x.b(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + iVarF + " for " + this, th4);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                E(completionHandlerException);
            }
        }
    }

    public final Throwable w(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        q1 q1Var = (q1) ((y1) obj);
        Object obj2 = f50945a.get(q1Var);
        if (obj2 instanceof l1) {
            thC = ((l1) obj2).c();
        } else if (obj2 instanceof v) {
            thC = ((v) obj2).f50961a;
        } else {
            if (obj2 instanceof d1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(T(obj2)), thC, q1Var) : cancellationException;
    }

    public final Object x(l1 l1Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thZ;
        v vVar = obj instanceof v ? (v) obj : null;
        Throwable th2 = vVar != null ? vVar.f50961a : null;
        synchronized (l1Var) {
            l1Var.d();
            ArrayList arrayListE = l1Var.e(th2);
            thZ = z(l1Var, arrayListE);
            if (thZ != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                int size = arrayListE.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayListE.get(i11);
                    i11++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != thZ && th3 != thZ && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        cf.x.b(thZ, th3);
                    }
                }
            }
        }
        if (thZ != null && thZ != th2) {
            obj = new v(thZ, false);
        }
        if (thZ != null && (s(thZ) || D(thZ))) {
            kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            v.f50960b.compareAndSet((v) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50945a;
        Object e1Var = obj instanceof d1 ? new e1((d1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, l1Var, e1Var) && atomicReferenceFieldUpdater.get(this) == l1Var) {
        }
        v(l1Var, obj);
        return obj;
    }

    public final Object y() throws Throwable {
        Object obj = f50945a.get(this);
        if (obj instanceof d1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof v) {
            throw ((v) obj).f50961a;
        }
        return e0.K(obj);
    }

    public final Throwable z(l1 l1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (l1Var.d()) {
                return new JobCancellationException(t(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        do {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i12);
            i12++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            int size2 = arrayList.size();
            while (i11 < size2) {
                Object obj3 = arrayList.get(i11);
                i11++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public final Object K(Object obj) {
        Object objV;
        do {
            objV = V(f50945a.get(this), obj);
            if (objV == e0.f50885d) {
                String str = ADSb.PVeHFxUwgpq + this + " is already complete or completing, but is being completed with " + obj;
                v vVar = obj instanceof v ? (v) obj : null;
                throw new IllegalStateException(str, vVar != null ? vVar.f50961a : null);
            }
        } while (objV == e0.f50887f);
        return objV;
    }

    @Override // rz.g1
    public final q0 invokeOnCompletion(boolean z11, boolean z12, fz.c cVar) {
        i1 r0Var;
        if (z11) {
            r0Var = new f1(cVar);
        } else {
            r0Var = new r0(cVar, 1);
        }
        return G(z12, r0Var);
    }
}
