package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f1994b = new t(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1995a;

    public /* synthetic */ t(int i11) {
        this.f1995a = i11;
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final v0 a(Class cls) {
        switch (this.f1995a) {
            case 0:
                if (!x.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (v0) x.c(cls.asSubclass(x.class)).b(w.BUILD_MESSAGE_INFO);
                } catch (Exception e8) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.glance.appwidget.protobuf.l0
    public final boolean b(Class cls) {
        switch (this.f1995a) {
            case 0:
                return x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
