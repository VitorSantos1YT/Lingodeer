package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f1537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f1538b;

    static {
        a1 a1Var = a1.f1445c;
        p0 p0Var = null;
        try {
            p0Var = (p0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1537a = p0Var;
        f1538b = new p0();
    }
}
