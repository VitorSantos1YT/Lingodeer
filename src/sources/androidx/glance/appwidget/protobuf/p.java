package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f1987a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f1988b;

    static {
        t0 t0Var = t0.f1996c;
        o oVar = null;
        try {
            oVar = (o) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1988b = oVar;
    }
}
