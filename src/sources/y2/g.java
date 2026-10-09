package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f56862a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f56863b;

    @Override // e2.r
    public final boolean a() {
        Boolean bool = f56863b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw defpackage.e.t("canFocus is read before it is written");
    }

    @Override // e2.r
    public final void c(boolean z11) {
        f56863b = Boolean.valueOf(z11);
    }
}
