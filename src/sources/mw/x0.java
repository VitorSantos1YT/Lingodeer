package mw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends lw.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f42781a;

    static {
        boolean z11 = false;
        try {
            Class.forName("android.app.Application", false, x0.class.getClassLoader());
            z11 = true;
        } catch (Exception unused) {
        }
        f42781a = z11;
    }
}
