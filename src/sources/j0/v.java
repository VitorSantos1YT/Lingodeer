package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f35424a = new v();

    public static z1.r a(z1.r rVar, float f5) {
        if (f5 <= 0.0d) {
            k0.a.a("invalid weight; must be greater than zero");
        }
        if (f5 > Float.MAX_VALUE) {
            f5 = Float.MAX_VALUE;
        }
        return rVar.i(new i1(f5, true));
    }
}
