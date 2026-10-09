package n9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f43639a = new Object();

    public static final uz.q0 a(uz.i iVar, rz.b0 scope) {
        kotlin.jvm.internal.m.f(iVar, "<this>");
        kotlin.jvm.internal.m.f(scope, "scope");
        vy.d dVar = null;
        uz.i iVarE = e(iVar, new dt.x(dVar, scope, 10));
        int i11 = 3;
        e6.g0 g0Var = new e6.g0(i11, 5, dVar);
        kotlin.jvm.internal.m.f(iVarE, "<this>");
        gp.r rVar = new gp.r(new k(iVarE, g0Var, null, 0));
        int i12 = 2;
        com.android.billingclient.api.d0 d0VarL = uz.x0.l(new uz.q(new n1(new jp.t0(i12, 4, dVar), new bh.f0(rVar, i12)), new ad.a0(i11, 6, dVar)));
        uz.w0 w0VarA = uz.x0.a(1, d0VarL.f7497a, (tz.a) d0VarL.f7499c);
        vy.i iVar2 = (vy.i) d0VarL.f7500d;
        uz.i iVar3 = (uz.i) d0VarL.f7498b;
        com.android.billingclient.api.a aVar = uz.x0.f53434a;
        uz.c1 c1Var = uz.a1.f53254a;
        uz.c1 c1Var2 = uz.a1.f53255b;
        rz.e0.A(scope, iVar2, c1Var2.equals(c1Var) ? rz.d0.DEFAULT : rz.d0.UNDISPATCHED, new uz.h0(c1Var2, iVar3, w0VarA, aVar, (vy.d) null));
        return new uz.q0(w0VarA);
    }

    public static final e1 b(e1 e1Var, fz.e eVar) {
        kotlin.jvm.internal.m.f(e1Var, "<this>");
        return new e1(new n1(e1Var.f43548a, eVar, 0), e1Var.f43549b, e1Var.f43550c, d1.f43536a);
    }

    public static final boolean c(i2 i2Var, i2 i2Var2, y loadType) {
        kotlin.jvm.internal.m.f(i2Var, "<this>");
        kotlin.jvm.internal.m.f(loadType, "loadType");
        if (i2Var2 == null) {
            return true;
        }
        if ((i2Var2 instanceof g2) && (i2Var instanceof f2)) {
            return true;
        }
        if ((i2Var instanceof g2) && (i2Var2 instanceof f2)) {
            return false;
        }
        return (i2Var.f43596c == i2Var2.f43596c && i2Var.f43597d == i2Var2.f43597d && i2Var2.a(loadType) <= i2Var.a(loadType)) ? false : true;
    }

    public static final uz.i d(fz.e eVar) {
        return uz.x0.f(new gp.r(new ca.d(eVar, (vy.d) null, 2)), -2);
    }

    public static final uz.i e(uz.i iVar, fz.f fVar) {
        kotlin.jvm.internal.m.f(iVar, "<this>");
        return d(new k(iVar, fVar, null, 1));
    }
}
