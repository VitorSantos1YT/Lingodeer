package jp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f36553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i11) {
        super(0);
        this.f36552a = i11;
        this.f36553b = zVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36552a) {
            case 0:
                return this.f36553b.requireActivity().getViewModelStore();
            default:
                return this.f36553b.requireActivity().getDefaultViewModelCreationExtras();
        }
    }
}
