package hh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f32244b;

    public /* synthetic */ i0(j0 j0Var, int i11) {
        this.f32243a = i11;
        this.f32244b = j0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f32243a) {
            case 0:
                return this.f32244b.requireActivity();
            default:
                return this.f32244b;
        }
    }
}
