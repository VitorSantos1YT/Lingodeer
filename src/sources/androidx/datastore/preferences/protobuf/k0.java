package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0[] f1502a;

    @Override // androidx.datastore.preferences.protobuf.r0
    public final c1 a(Class cls) {
        for (r0 r0Var : this.f1502a) {
            if (r0Var.b(cls)) {
                return r0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean b(Class cls) {
        for (r0 r0Var : this.f1502a) {
            if (r0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
