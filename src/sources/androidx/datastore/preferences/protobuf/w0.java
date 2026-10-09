package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f1575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f1576b;

    static {
        a1 a1Var = a1.f1445c;
        v0 v0Var = null;
        try {
            v0Var = (v0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1575a = v0Var;
        f1576b = new v0();
    }
}
