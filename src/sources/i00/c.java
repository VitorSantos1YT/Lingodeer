package i00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f33899a;

    static {
        Object objL;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objL = property != null ? oz.x.t0(property) : null;
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        Integer num = (Integer) (objL instanceof qy.n ? null : objL);
        f33899a = num != null ? num.intValue() : 2097152;
    }
}
