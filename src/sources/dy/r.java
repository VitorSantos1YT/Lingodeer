package dy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f24609a;

    static {
        boolean zEquals = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                zEquals = "true".equals(property);
            }
        } catch (Throwable th2) {
            ef.e.E(th2);
        }
        f24609a = zEquals;
    }
}
