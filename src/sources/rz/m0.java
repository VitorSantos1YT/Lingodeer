package rz;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 extends yz.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50932c;

    public m0(int i11) {
        super(0L, false);
        this.f50932c = i11;
    }

    public abstract vy.d d();

    public Throwable e(Object obj) {
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            return vVar.f50961a;
        }
        return null;
    }

    public final void g(Throwable th2) throws IllegalAccessException, InvocationTargetException {
        e0.u(new ez.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), d().getContext());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        try {
            vy.d dVarD = d();
            kotlin.jvm.internal.m.d(dVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            wz.f fVar = (wz.f) dVarD;
            vy.d dVar = fVar.f55513e;
            Object obj = fVar.f55515t;
            vy.i context = dVar.getContext();
            Object objN = wz.b.n(context, obj);
            g1 g1Var = null;
            h2 h2VarL = objN != wz.b.f55504d ? e0.L(dVar, context, objN) : null;
            try {
                vy.i context2 = dVar.getContext();
                Object objI = i();
                Throwable thE = e(objI);
                if (thE == null) {
                    int i11 = this.f50932c;
                    boolean z11 = true;
                    if (i11 != 1 && i11 != 2) {
                        z11 = false;
                    }
                    if (z11) {
                        g1Var = (g1) context2.get(z.f50978b);
                    }
                }
                if (g1Var != null && !g1Var.isActive()) {
                    CancellationException cancellationException = g1Var.getCancellationException();
                    c(cancellationException);
                    dVar.resumeWith(com.bumptech.glide.e.l(cancellationException));
                } else if (thE != null) {
                    dVar.resumeWith(com.bumptech.glide.e.l(thE));
                } else {
                    dVar.resumeWith(f(objI));
                }
            } finally {
                if (h2VarL == null || h2VarL.b0()) {
                    wz.b.g(context, objN);
                }
            }
        } catch (DispatchException e8) {
            e0.u(e8.f38363a, d().getContext());
        } catch (Throwable th2) {
            g(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
