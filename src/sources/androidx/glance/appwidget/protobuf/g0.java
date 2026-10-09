package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0[] f1932a;

    @Override // androidx.glance.appwidget.protobuf.l0
    public final v0 a(Class cls) {
        for (l0 l0Var : this.f1932a) {
            if (l0Var.b(cls)) {
                return l0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final boolean b(Class cls) {
        for (l0 l0Var : this.f1932a) {
            if (l0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
