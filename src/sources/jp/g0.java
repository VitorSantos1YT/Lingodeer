package jp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f36474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(h0 h0Var, int i11) {
        super(0);
        this.f36473a = i11;
        this.f36474b = h0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36473a) {
            case 0:
                return this.f36474b.requireActivity().getViewModelStore();
            default:
                return this.f36474b.requireActivity().getDefaultViewModelCreationExtras();
        }
    }
}
