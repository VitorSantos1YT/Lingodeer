package p7;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h0, k7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k7.c f46395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k7.c f46396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f46397d;

    public i(k kVar, Object obj) {
        this.f46397d = kVar;
        int i11 = 0;
        b0 b0Var = null;
        this.f46395b = new k7.c(kVar.f46320c.f37958c, i11, b0Var);
        this.f46396c = new k7.c(kVar.f46321d.f37958c, i11, b0Var);
        this.f46394a = obj;
    }

    @Override // p7.h0
    public final void F(int i11, b0 b0Var, x xVar) {
        if (a(i11, b0Var)) {
            k7.c cVar = this.f46395b;
            x xVarB = b(xVar, b0Var);
            cVar.getClass();
            cVar.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(15, cVar, xVarB));
        }
    }

    @Override // p7.h0
    public final void G(int i11, b0 b0Var, s sVar, x xVar, int i12) {
        if (a(i11, b0Var)) {
            k7.c cVar = this.f46395b;
            x xVarB = b(xVar, b0Var);
            cVar.getClass();
            cVar.a(new d0(cVar, sVar, xVarB, i12));
        }
    }

    public final boolean a(int i11, b0 b0Var) {
        b0 b0VarS;
        Object obj = this.f46394a;
        k kVar = this.f46397d;
        if (b0Var != null) {
            b0VarS = kVar.s(obj, b0Var);
            if (b0VarS == null) {
                return false;
            }
        } else {
            b0VarS = null;
        }
        int iU = kVar.u(i11, obj);
        k7.c cVar = this.f46395b;
        if (cVar.f37956a != iU || !Objects.equals(cVar.f37957b, b0VarS)) {
            this.f46395b = new k7.c(kVar.f46320c.f37958c, iU, b0VarS);
        }
        k7.c cVar2 = this.f46396c;
        if (cVar2.f37956a == iU && Objects.equals(cVar2.f37957b, b0VarS)) {
            return true;
        }
        this.f46396c = new k7.c(kVar.f46321d.f37958c, iU, b0VarS);
        return true;
    }

    public final x b(x xVar, b0 b0Var) {
        long j11 = xVar.f46534f;
        k kVar = this.f46397d;
        Object obj = this.f46394a;
        long jT = kVar.t(j11, obj);
        long j12 = xVar.f46535g;
        long jT2 = kVar.t(j12, obj);
        return (jT == j11 && jT2 == j12) ? xVar : new x(xVar.f46529a, xVar.f46530b, xVar.f46531c, xVar.f46532d, xVar.f46533e, jT, jT2);
    }

    @Override // p7.h0
    public final void c(int i11, b0 b0Var, s sVar, x xVar) {
        if (a(i11, b0Var)) {
            k7.c cVar = this.f46395b;
            x xVarB = b(xVar, b0Var);
            cVar.getClass();
            cVar.a(new e0(cVar, sVar, xVarB, 1));
        }
    }

    @Override // p7.h0
    public final void l(int i11, b0 b0Var, s sVar, x xVar, IOException iOException, boolean z11) {
        if (a(i11, b0Var)) {
            k7.c cVar = this.f46395b;
            x xVarB = b(xVar, b0Var);
            cVar.getClass();
            cVar.a(new f0(cVar, sVar, xVarB, iOException, z11));
        }
    }

    @Override // p7.h0
    public final void m(int i11, b0 b0Var, x xVar) {
        if (a(i11, b0Var)) {
            k7.c cVar = this.f46395b;
            x xVarB = b(xVar, b0Var);
            b0 b0Var2 = cVar.f37957b;
            b0Var2.getClass();
            cVar.a(new com.google.firebase.crashlytics.internal.concurrency.a(cVar, b0Var2, xVarB, 7));
        }
    }

    @Override // p7.h0
    public final void o(int i11, b0 b0Var, s sVar, x xVar) {
        if (a(i11, b0Var)) {
            k7.c cVar = this.f46395b;
            x xVarB = b(xVar, b0Var);
            cVar.getClass();
            cVar.a(new e0(cVar, sVar, xVarB, 0));
        }
    }
}
