package o20;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f44534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f44535c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f44533a = null;
            f44534b = new b(7);
            f44535c = new b(6);
        } else if (property.equals("Dalvik")) {
            f44533a = new a();
            f44534b = new n0(7);
            f44535c = new d(6);
        } else {
            f44533a = null;
            f44534b = new o0(7);
            f44535c = new d(6);
        }
    }
}
