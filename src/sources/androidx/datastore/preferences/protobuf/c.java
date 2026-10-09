package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f1452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1453b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f1452a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f1453b = cls2 != null;
    }

    public static boolean a() {
        return (f1452a == null || f1453b) ? false : true;
    }
}
