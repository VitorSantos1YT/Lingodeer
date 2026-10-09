package rz;

import java.lang.reflect.InvocationTargetException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends q1 implements vy.d, b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vy.i f50863c;

    public a(vy.i iVar, boolean z11) {
        super(z11);
        F((g1) iVar.get(z.f50978b));
        this.f50863c = iVar.plus(this);
    }

    @Override // rz.q1
    public final void E(CompletionHandlerException completionHandlerException) throws IllegalAccessException, InvocationTargetException {
        e0.u(completionHandlerException, this.f50863c);
    }

    @Override // rz.q1
    public final void O(Object obj) {
        if (!(obj instanceof v)) {
            Y(obj);
        } else {
            v vVar = (v) obj;
            X(vVar.f50961a, v.f50960b.get(vVar) == 1);
        }
    }

    public final void Z(d0 d0Var, a aVar, fz.e eVar) {
        Object objInvoke;
        d0Var.getClass();
        int i11 = c0.f50873a[d0Var.ordinal()];
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 1) {
            try {
                wz.b.h(b0Var, ue.f.x(ue.f.o(eVar, aVar, this)));
                return;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).f38363a;
                }
                resumeWith(com.bumptech.glide.e.l(th));
                throw th;
            }
        }
        if (i11 == 2) {
            kotlin.jvm.internal.m.f(eVar, "<this>");
            ue.f.x(ue.f.o(eVar, aVar, this)).resumeWith(b0Var);
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        try {
            vy.i iVar = this.f50863c;
            Object objN = wz.b.n(iVar, null);
            try {
                if (eVar instanceof xy.a) {
                    kotlin.jvm.internal.c0.d(2, eVar);
                    objInvoke = eVar.invoke(aVar, this);
                } else {
                    objInvoke = ue.f.F(eVar, aVar, this);
                }
                wz.b.g(iVar, objN);
                if (objInvoke != wy.a.COROUTINE_SUSPENDED) {
                    resumeWith(objInvoke);
                }
            } catch (Throwable th3) {
                wz.b.g(iVar, objN);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f38363a;
            }
            resumeWith(com.bumptech.glide.e.l(th));
        }
    }

    @Override // vy.d
    public final vy.i getContext() {
        return this.f50863c;
    }

    @Override // rz.b0
    public final vy.i getCoroutineContext() {
        return this.f50863c;
    }

    @Override // vy.d
    public final void resumeWith(Object obj) {
        Throwable thA = qy.o.a(obj);
        if (thA != null) {
            obj = new v(thA, false);
        }
        Object objK = K(obj);
        if (objK == e0.f50886e) {
            return;
        }
        n(objK);
    }

    @Override // rz.q1
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void Y(Object obj) {
    }

    public void X(Throwable th2, boolean z11) {
    }
}
