package t1;

import l1.n;
import l1.s;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f51985a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f51986b = new StackTraceElement[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f51987c = new k(0, new long[0], new Object[0]);

    public static final int a(int i11, int i12) {
        return i11 << (((i12 % 10) * 3) + 1);
    }

    public static final d b(n nVar, int i11, kotlin.jvm.internal.n nVar2) {
        d dVar;
        s sVar = (s) nVar;
        sVar.a0(Integer.rotateLeft(i11, 1), f51985a);
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            dVar = new d(nVar2, true, i11);
            sVar.o0(dVar);
        } else {
            kotlin.jvm.internal.m.d(objQ, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            dVar = (d) objQ;
            dVar.l(nVar2);
        }
        sVar.p(false);
        return dVar;
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final d d(int i11, qy.e eVar, n nVar) {
        s sVar = (s) nVar;
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            objQ = new d(eVar, true, i11);
            sVar.o0(objQ);
        }
        d dVar = (d) objQ;
        dVar.l(eVar);
        return dVar;
    }

    public static final boolean e(x1 x1Var, x1 x1Var2) {
        if (x1Var == null) {
            return true;
        }
        if (x1Var instanceof x1) {
            return !x1Var.b() || x1Var.equals(x1Var2) || kotlin.jvm.internal.m.a(x1Var.f39501c, x1Var2.f39501c);
        }
        return false;
    }
}
