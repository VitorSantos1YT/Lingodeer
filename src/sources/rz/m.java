package rz;

import dl.ExOZ.xItStCyvVEZ;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class m extends m0 implements l, xy.d, j2 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vy.d f50930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vy.i f50931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f50928f = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50929t = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_parentHandle$volatile");

    public m(int i11, vy.d dVar) {
        super(i11);
        this.f50930d = dVar;
        this.f50931e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f50868a;
    }

    public static Object E(x1 x1Var, Object obj, int i11, fz.f fVar) {
        if (obj instanceof v) {
            return obj;
        }
        if (i11 != 1 && i11 != 2) {
            return obj;
        }
        if (fVar != null || (x1Var instanceof k)) {
            return new u(obj, x1Var instanceof k ? (k) x1Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void C(Object obj, int i11, fz.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50929t;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof x1)) {
                if (obj2 instanceof n) {
                    n nVar = (n) obj2;
                    if (n.f50936c.compareAndSet(nVar, 0, 1)) {
                        if (fVar != null) {
                            m(fVar, nVar.f50961a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objE = E((x1) obj2, obj, i11, fVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!y()) {
                        o();
                    }
                    p(i11);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void D(y yVar) {
        vy.d dVar = this.f50930d;
        wz.f fVar = dVar instanceof wz.f ? (wz.f) dVar : null;
        C(qy.b0.f48488a, (fVar != null ? fVar.f55512d : null) == yVar ? 4 : this.f50932c, null);
    }

    public final com.android.billingclient.api.a F(Object obj, fz.f fVar) {
        com.android.billingclient.api.a aVar = e0.f50882a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50929t;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof x1)) {
                return null;
            }
            Object objE = E((x1) obj2, obj, this.f50932c, fVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!y()) {
                        o();
                    }
                    return aVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // rz.l
    public final void a(Object obj, fz.f fVar) {
        C(obj, this.f50932c, fVar);
    }

    @Override // rz.j2
    public final void b(wz.r rVar, int i11) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        do {
            atomicIntegerFieldUpdater = f50928f;
            i12 = atomicIntegerFieldUpdater.get(this);
            if ((i12 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, ((i12 >> 29) << 29) + i11));
        v(rVar);
    }

    @Override // rz.m0
    public final vy.d d() {
        return this.f50930d;
    }

    @Override // rz.m0
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // rz.m0
    public final Object f(Object obj) {
        return obj instanceof u ? ((u) obj).f50954a : obj;
    }

    @Override // xy.d
    public final xy.d getCallerFrame() {
        vy.d dVar = this.f50930d;
        if (dVar instanceof xy.d) {
            return (xy.d) dVar;
        }
        return null;
    }

    @Override // vy.d
    public final vy.i getContext() {
        return this.f50931e;
    }

    @Override // rz.l
    public final com.android.billingclient.api.a h(Object obj, fz.f fVar) {
        return F(obj, fVar);
    }

    @Override // rz.m0
    public final Object i() {
        return f50929t.get(this);
    }

    public final void j(k kVar, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        try {
            kVar.a(th2);
        } catch (Throwable th3) {
            e0.u(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3), this.f50931e);
        }
    }

    @Override // rz.l
    public final boolean k(Throwable th2) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50929t;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof x1)) {
                return false;
            }
            boolean z11 = (obj instanceof k) || (obj instanceof wz.r);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            n nVar = new n(cancellationException, z11);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    x1 x1Var = (x1) obj;
                    if (x1Var instanceof k) {
                        j((k) obj, th2);
                    } else if (x1Var instanceof wz.r) {
                        n((wz.r) obj, th2);
                    }
                    if (!y()) {
                        o();
                    }
                    p(this.f50932c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // rz.l
    public final void l(Object obj) {
        p(this.f50932c);
    }

    public final void m(fz.f fVar, Throwable th2, Object obj) throws IllegalAccessException, InvocationTargetException {
        vy.i iVar = this.f50931e;
        try {
            fVar.invoke(th2, obj, iVar);
        } catch (Throwable th3) {
            e0.u(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3), iVar);
        }
    }

    public final void n(wz.r rVar, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        vy.i iVar = this.f50931e;
        int i11 = f50928f.get(this) & 536870911;
        if (i11 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i11, iVar);
        } catch (Throwable th3) {
            e0.u(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3), iVar);
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        q0 q0Var = (q0) atomicReferenceFieldUpdater.get(this);
        if (q0Var == null) {
            return;
        }
        q0Var.dispose();
        atomicReferenceFieldUpdater.set(this, w1.f50967a);
    }

    public final void p(int i11) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        do {
            atomicIntegerFieldUpdater = f50928f;
            i12 = atomicIntegerFieldUpdater.get(this);
            int i13 = i12 >> 29;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z11 = i11 == 4;
                vy.d dVar = this.f50930d;
                if (!z11 && (dVar instanceof wz.f)) {
                    boolean z12 = i11 == 1 || i11 == 2;
                    int i14 = this.f50932c;
                    if (z12 == (i14 == 1 || i14 == 2)) {
                        wz.f fVar = (wz.f) dVar;
                        y yVar = fVar.f55512d;
                        vy.i context = fVar.f55513e.getContext();
                        if (wz.b.j(yVar, context)) {
                            wz.b.i(yVar, context, this);
                            return;
                        }
                        y0 y0VarA = c2.a();
                        if (y0VarA.f50974a >= 4294967296L) {
                            y0VarA.f(this);
                            return;
                        }
                        y0VarA.i(true);
                        try {
                            e0.E(this, dVar, true);
                            do {
                            } while (y0VarA.v());
                        } catch (Throwable th2) {
                            try {
                                g(th2);
                            } finally {
                                y0VarA.d(true);
                            }
                        }
                        return;
                    }
                }
                e0.E(this, dVar, z11);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, 1073741824 + (536870911 & i12)));
    }

    public Throwable q(q1 q1Var) {
        return q1Var.getCancellationException();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        g1 g1Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f50928f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zY) {
                    B();
                }
                Object obj = f50929t.get(this);
                if (obj instanceof v) {
                    throw ((v) obj).f50961a;
                }
                int i13 = this.f50932c;
                if ((i13 != 1 && i13 != 2) || (g1Var = (g1) this.f50931e.get(z.f50978b)) == null || g1Var.isActive()) {
                    return f(obj);
                }
                CancellationException cancellationException = g1Var.getCancellationException();
                c(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 536870912 + (536870911 & i11)));
        if (((q0) H.get(this)) == null) {
            t();
        }
        if (zY) {
            B();
        }
        return wy.a.COROUTINE_SUSPENDED;
    }

    @Override // vy.d
    public final void resumeWith(Object obj) {
        Throwable thA = qy.o.a(obj);
        if (thA != null) {
            obj = new v(thA, false);
        }
        C(obj, this.f50932c, null);
    }

    public final void s() {
        q0 q0VarT = t();
        if (q0VarT != null && x()) {
            q0VarT.dispose();
            H.set(this, w1.f50967a);
        }
    }

    public final q0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g1 g1Var = (g1) this.f50931e.get(z.f50978b);
        if (g1Var == null) {
            return null;
        }
        q0 q0VarV = e0.v(g1Var, true, new o(this, 0));
        do {
            atomicReferenceFieldUpdater = H;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, q0VarV)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return q0VarV;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A());
        sb2.append('(');
        sb2.append(e0.I(this.f50930d));
        sb2.append("){");
        Object obj = f50929t.get(this);
        if (obj instanceof x1) {
            str = "Active";
        } else {
            str = obj instanceof n ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(e0.r(this));
        return sb2.toString();
    }

    public final void u(fz.c cVar) {
        v(new j(cVar, 1));
    }

    public final void v(x1 x1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50929t;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof k) || (obj instanceof wz.r)) {
                z(x1Var, obj);
                throw null;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (!v.f50960b.compareAndSet(vVar, 0, 1)) {
                    z(x1Var, obj);
                    throw null;
                }
                if (obj instanceof n) {
                    Throwable th2 = vVar.f50961a;
                    if (x1Var instanceof k) {
                        j((k) x1Var, th2);
                        return;
                    } else {
                        kotlin.jvm.internal.m.d(x1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((wz.r) x1Var, th2);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof u)) {
                if (x1Var instanceof wz.r) {
                    return;
                }
                kotlin.jvm.internal.m.d(x1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                u uVar = new u(obj, (k) x1Var, (fz.f) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            u uVar2 = (u) obj;
            if (uVar2.f50955b != null) {
                z(x1Var, obj);
                throw null;
            }
            if (x1Var instanceof wz.r) {
                return;
            }
            kotlin.jvm.internal.m.d(x1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            k kVar = (k) x1Var;
            Throwable th3 = uVar2.f50958e;
            if (th3 != null) {
                j(kVar, th3);
                return;
            }
            u uVarA = u.a(uVar2, kVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean w() {
        return f50929t.get(this) instanceof x1;
    }

    public final boolean x() {
        return !(f50929t.get(this) instanceof x1);
    }

    public final boolean y() {
        if (this.f50932c != 2) {
            return false;
        }
        vy.d dVar = this.f50930d;
        kotlin.jvm.internal.m.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return wz.f.H.get((wz.f) dVar) != null;
    }

    public final void B() {
        vy.d dVar = this.f50930d;
        Throwable th2 = null;
        wz.f fVar = dVar instanceof wz.f ? (wz.f) dVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wz.f.H;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                com.android.billingclient.api.a aVar = wz.b.f55503c;
                if (obj != aVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException((aYZzTH.wHOjLEjlCXLYBvD + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, aVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == aVar);
            }
            if (th2 == null) {
                return;
            }
            o();
            k(th2);
        }
    }

    @Override // rz.m0
    public final void c(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50929t;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof x1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof v) {
                return;
            }
            if (!(obj instanceof u)) {
                cancellationException2 = cancellationException;
                u uVar = new u(obj, (k) null, (fz.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            u uVar2 = (u) obj;
            if (uVar2.f50958e != null) {
                throw new IllegalStateException(xItStCyvVEZ.rziI);
            }
            u uVarA = u.a(uVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, uVarA)) {
                    k kVar = uVar2.f50955b;
                    if (kVar != null) {
                        j(kVar, cancellationException);
                    }
                    fz.f fVar = uVar2.f50956c;
                    if (fVar != null) {
                        m(fVar, cancellationException, uVar2.f50954a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }
}
