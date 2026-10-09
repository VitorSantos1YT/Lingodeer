package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static a0 a(long j11, Object obj) {
        a0 a0Var = (a0) f1.f1926c.h(j11, obj);
        if (((b) a0Var).f1911a) {
            return a0Var;
        }
        u0 u0Var = (u0) a0Var;
        int i11 = u0Var.f2003c;
        u0 u0VarE = u0Var.e(i11 == 0 ? 10 : i11 * 2);
        f1.o(obj, j11, u0VarE);
        return u0VarE;
    }
}
