package wz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import rz.c2;
import rz.e0;
import rz.g1;
import rz.h2;
import rz.y;
import rz.y0;
import rz.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.android.billingclient.api.a f55501a = new com.android.billingclient.api.a("CLOSED", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.android.billingclient.api.a f55502b = new com.android.billingclient.api.a("UNDEFINED", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.android.billingclient.api.a f55503c = new com.android.billingclient.api.a("REUSABLE_CLAIMED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.android.billingclient.api.a f55504d = new com.android.billingclient.api.a("NO_THREAD_ELEMENTS", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wr.a f55505e = new wr.a(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wr.a f55506f = new wr.a(5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wr.a f55507g = new wr.a(6);

    public static final void a(int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException(nv.p.j(i11, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j11, fz.e eVar) {
        while (true) {
            if (rVar.f55543c >= j11 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f55508a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            com.android.billingclient.api.a aVar = f55501a;
            if (obj == aVar) {
                return aVar;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) eVar.invoke(Long.valueOf(rVar.f55543c + 1), rVar);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                        if (rVar.d()) {
                            rVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(rVar) == null);
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f55501a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th2, vy.i iVar) {
        Throwable runtimeException;
        Iterator it = e.f55511a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).c(th2, iVar);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    cf.x.b(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            cf.x.b(th2, new DiagnosticCoroutineContextException(iVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean e(Object obj) {
        return obj == f55501a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(vy.i iVar, Object obj) {
        if (obj == f55504d) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objFold = iVar.fold(null, f55506f);
            kotlin.jvm.internal.m.d(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((u) objFold).a(obj);
            return;
        }
        x xVar = (x) obj;
        u[] uVarArr = xVar.f55554c;
        int length = uVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            u uVar = uVarArr[length];
            kotlin.jvm.internal.m.c(uVar);
            uVar.a(xVar.f55553b[length]);
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }

    public static final void h(Object obj, vy.d dVar) throws DispatchException {
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        y yVar = fVar.f55512d;
        vy.d dVar2 = fVar.f55513e;
        Throwable thA = qy.o.a(obj);
        Object vVar = thA == null ? obj : new rz.v(thA, false);
        if (j(yVar, dVar2.getContext())) {
            fVar.f55514f = vVar;
            fVar.f50932c = 1;
            i(yVar, dVar2.getContext(), fVar);
            return;
        }
        y0 y0VarA = c2.a();
        if (y0VarA.f50974a >= 4294967296L) {
            fVar.f55514f = vVar;
            fVar.f50932c = 1;
            y0VarA.f(fVar);
            return;
        }
        y0VarA.i(true);
        try {
            g1 g1Var = (g1) dVar2.getContext().get(z.f50978b);
            if (g1Var == null || g1Var.isActive()) {
                Object obj2 = fVar.f55515t;
                vy.i context = dVar2.getContext();
                Object objN = n(context, obj2);
                h2 h2VarL = objN != f55504d ? e0.L(dVar2, context, objN) : null;
                try {
                    dVar2.resumeWith(obj);
                    if (h2VarL == null || h2VarL.b0()) {
                        g(context, objN);
                    }
                } catch (Throwable th2) {
                    if (h2VarL == null || h2VarL.b0()) {
                        g(context, objN);
                    }
                    throw th2;
                }
            } else {
                fVar.resumeWith(com.bumptech.glide.e.l(g1Var.getCancellationException()));
            }
            while (y0VarA.v()) {
            }
        } catch (Throwable th3) {
            try {
                fVar.g(th3);
            } finally {
                y0VarA.d(true);
            }
        }
    }

    public static final void i(y yVar, vy.i iVar, Runnable runnable) throws DispatchException {
        try {
            yVar.dispatch(iVar, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, yVar, iVar);
        }
    }

    public static final boolean j(y yVar, vy.i iVar) throws DispatchException {
        try {
            return yVar.isDispatchNeeded(iVar);
        } catch (Throwable th2) {
            throw new DispatchException(th2, yVar, iVar);
        }
    }

    public static final long k(long j11, long j12, long j13, String str) {
        String property;
        int i11 = t.f55545a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j11;
        }
        Long lU0 = oz.x.u0(property);
        if (lU0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lU0.longValue();
        if (j12 <= jLongValue && jLongValue <= j13) {
            return jLongValue;
        }
        StringBuilder sbM = com.google.android.material.datepicker.d.m(j12, "System property '", str, "' should be in range ");
        ep.a.y(j13, "..", ", but is '", sbM);
        sbM.append(jLongValue);
        sbM.append('\'');
        throw new IllegalStateException(sbM.toString().toString());
    }

    public static int l(int i11, int i12, String str) {
        return (int) k(i11, 1, (i12 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final Object m(vy.i iVar) {
        Object objFold = iVar.fold(0, f55505e);
        kotlin.jvm.internal.m.c(objFold);
        return objFold;
    }

    public static final Object n(vy.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return f55504d;
        }
        return obj instanceof Integer ? iVar.fold(new x(((Number) obj).intValue(), iVar), f55507g) : ((u) obj).b(iVar);
    }
}
