package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f1547a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f1548b;

    static {
        a1 a1Var = a1.f1445c;
        r rVar = null;
        try {
            rVar = (r) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1548b = rVar;
    }
}
