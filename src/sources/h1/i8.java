package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f30425a = 0;

    static {
        float f5 = k1.f0.f37521k;
        g2.o.a();
    }

    public static g8 a(long j11, long j12, long j13, long j14, long j15, l1.n nVar) {
        long j16 = g2.x.f28622i;
        g8 g8VarB = b((s1) ((l1.s) nVar).j(v1.f31180a));
        long j17 = j11 != 16 ? j11 : g8VarB.f30288a;
        long j18 = j12 != 16 ? j12 : g8VarB.f30289b;
        long j19 = j13 != 16 ? j13 : g8VarB.f30290c;
        long j21 = j14 != 16 ? j14 : g8VarB.f30291d;
        long j22 = j15 != 16 ? j15 : g8VarB.f30292e;
        long j23 = j16 != 16 ? j16 : g8VarB.f30293f;
        long j24 = j16 != 16 ? j16 : g8VarB.f30294g;
        long j25 = j16 != 16 ? j16 : g8VarB.f30295h;
        long j26 = j16 != 16 ? j16 : g8VarB.f30296i;
        if (j16 == 16) {
            j16 = g8VarB.f30297j;
        }
        return new g8(j17, j18, j19, j21, j22, j23, j24, j25, j26, j16);
    }

    public static g8 b(s1 s1Var) {
        g8 g8Var = s1Var.X;
        if (g8Var != null) {
            return g8Var;
        }
        long jC = v1.c(s1Var, k1.f0.f37516f);
        k1.c cVar = k1.f0.f37512b;
        long jC2 = v1.c(s1Var, cVar);
        k1.c cVar2 = k1.f0.f37519i;
        long jC3 = v1.c(s1Var, cVar2);
        long jC4 = v1.c(s1Var, cVar2);
        long jC5 = v1.c(s1Var, cVar);
        long jL = g2.f0.l(g2.x.c(v1.c(s1Var, k1.f0.f37514d), 0.38f), s1Var.f31033p);
        k1.c cVar3 = k1.f0.f37513c;
        long jC6 = g2.x.c(v1.c(s1Var, cVar3), 0.38f);
        k1.c cVar4 = k1.f0.f37515e;
        g8 g8Var2 = new g8(jC, jC2, jC3, jC4, jC5, jL, jC6, g2.x.c(v1.c(s1Var, cVar4), 0.12f), g2.x.c(v1.c(s1Var, cVar4), 0.12f), g2.x.c(v1.c(s1Var, cVar3), 0.38f));
        s1Var.X = g8Var2;
        return g8Var2;
    }
}
