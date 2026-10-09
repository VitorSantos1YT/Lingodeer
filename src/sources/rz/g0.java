package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f50907a;

    static {
        String property;
        sz.c cVar;
        j0 j0Var;
        int i11 = wz.t.f55545a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            yz.f fVar = o0.f50940a;
            cVar = wz.m.f55536a;
            sz.c cVar2 = cVar.f51961d;
            if (cVar == null) {
                j0Var = cVar;
                j0Var = f0.H;
            }
        } else {
            j0Var = f0.H;
        }
        j0Var = cVar;
        f50907a = j0Var;
    }
}
