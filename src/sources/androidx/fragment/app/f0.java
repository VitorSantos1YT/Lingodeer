package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1655b;

    public /* synthetic */ f0(Object obj, int i11) {
        this.f1654a = i11;
        this.f1655b = obj;
    }

    @Override // u.a
    public final Object apply(Object obj) {
        switch (this.f1654a) {
            case 0:
                k0 k0Var = (k0) this.f1655b;
                Object obj2 = k0Var.mHost;
                return obj2 instanceof i.j ? ((i.j) obj2).getActivityResultRegistry() : k0Var.requireActivity().getActivityResultRegistry();
            default:
                return (i.i) this.f1655b;
        }
    }
}
