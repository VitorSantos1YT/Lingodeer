package bp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b5 f4937b;

    public /* synthetic */ z4(b5 b5Var, int i11) {
        this.f4936a = i11;
        this.f4937b = b5Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4936a) {
            case 0:
                return this.f4937b.requireActivity();
            case 1:
                return this.f4937b.requireActivity();
            case 2:
                return ef.e.q(this.f4937b).a(null, null, kotlin.jvm.internal.z.a(vt.e.class));
            default:
                return ef.e.q(this.f4937b).a(null, null, kotlin.jvm.internal.z.a(vt.d0.class));
        }
    }
}
