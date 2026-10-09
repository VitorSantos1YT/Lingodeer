package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f1578b = new y(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1579a;

    public /* synthetic */ y(int i11) {
        this.f1579a = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final c1 a(Class cls) {
        switch (this.f1579a) {
            case 0:
                if (!c0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (c1) c0.d(cls.asSubclass(c0.class)).c(b0.BUILD_MESSAGE_INFO);
                } catch (Exception e8) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean b(Class cls) {
        switch (this.f1579a) {
            case 0:
                return c0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
