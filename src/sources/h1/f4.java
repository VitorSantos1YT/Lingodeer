package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f30233a = k1.o.f37654a;

    public static r7 a(long j11, long j12, l1.s sVar) {
        long j13 = g2.x.f28622i;
        s1 s1Var = (s1) sVar.j(v1.f31180a);
        r7 r7Var = s1Var.P;
        if (r7Var == null) {
            long j14 = g2.x.f28621h;
            long jC = v1.c(s1Var, k1.o.f37671s);
            k1.c cVar = k1.o.f37675w;
            long jC2 = v1.c(s1Var, cVar);
            long jC3 = v1.c(s1Var, cVar);
            long jC4 = g2.x.c(v1.c(s1Var, k1.o.f37656c), 0.38f);
            k1.c cVar2 = k1.o.f37672t;
            long jC5 = v1.c(s1Var, cVar2);
            float f5 = k1.o.f37673u;
            long jC6 = g2.x.c(jC5, f5);
            long jC7 = g2.x.c(v1.c(s1Var, cVar2), f5);
            long jC8 = v1.c(s1Var, k1.o.f37663j);
            long jC9 = g2.x.c(v1.c(s1Var, k1.o.f37659f), k1.o.f37660g);
            long jC10 = v1.c(s1Var, k1.o.f37670r);
            k1.c cVar3 = k1.o.f37674v;
            r7 r7Var2 = new r7(j14, jC, jC2, jC3, j14, jC4, jC6, jC7, jC8, jC9, jC10, v1.c(s1Var, cVar3), v1.c(s1Var, cVar3));
            s1Var.P = r7Var2;
            r7Var = r7Var2;
        }
        return new r7(j13 != 16 ? j13 : r7Var.f30981a, j13 != 16 ? j13 : r7Var.f30982b, j13 != 16 ? j13 : r7Var.f30983c, j13 != 16 ? j13 : r7Var.f30984d, j13 != 16 ? j13 : r7Var.f30985e, j13 != 16 ? j13 : r7Var.f30986f, j13 != 16 ? j13 : r7Var.f30987g, j13 != 16 ? j13 : r7Var.f30988h, j11 != 16 ? j11 : r7Var.f30989i, j13 != 16 ? j13 : r7Var.f30990j, j12 != 16 ? j12 : r7Var.f30991k, j13 != 16 ? j13 : r7Var.f30992l, j13 != 16 ? j13 : r7Var.m);
    }
}
