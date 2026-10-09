package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.d0 f22650a = new l1.d0(new cr.m(3));

    public static final z1.r a(z1.r rVar, h0.i iVar, z0 z0Var) {
        if (z0Var == null) {
            return rVar;
        }
        return z0Var instanceof g1 ? rVar.i(new e1(iVar, (g1) z0Var)) : z1.a.a(rVar, new b1(0, z0Var, iVar));
    }
}
