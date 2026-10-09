package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y.x f54603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v1[] f54604b;

    static {
        y.x xVar = new y.x(8);
        v1.f54594a.getClass();
        w1 w1Var = u1.f54585g;
        xVar.h(1, w1Var);
        w1 w1Var2 = u1.f54584f;
        xVar.h(2, w1Var2);
        w1 w1Var3 = u1.f54580b;
        xVar.h(4, w1Var3);
        w1 w1Var4 = u1.f54582d;
        xVar.h(8, w1Var4);
        w1 w1Var5 = u1.f54586h;
        xVar.h(16, w1Var5);
        w1 w1Var6 = u1.f54583e;
        xVar.h(32, w1Var6);
        w1 w1Var7 = u1.f54587i;
        xVar.h(64, w1Var7);
        w1 w1Var8 = u1.f54581c;
        xVar.h(128, w1Var8);
        f54603a = xVar;
        f54604b = new v1[]{w1Var, w1Var2, w1Var3, w1Var7, w1Var5, w1Var6, w1Var4, u1.f54588j, w1Var8};
    }

    public static final void a(y2.n0 n0Var, q qVar, long j11, int i11, int i12) {
        if (a0.g(j11, -1L)) {
            return;
        }
        n0Var.a(qVar.b(), (int) ((j11 >>> 48) & 65535));
        n0Var.a(qVar.d(), (int) ((j11 >>> 32) & 65535));
        n0Var.a(qVar.c(), i11 - ((int) ((j11 >>> 16) & 65535)));
        n0Var.a(qVar.a(), i12 - ((int) (j11 & 65535)));
    }
}
