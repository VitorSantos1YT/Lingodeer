package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class vb extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(int i11, int i12) {
        super(0);
        this.f31208a = i11;
        this.f31209b = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        return new zb(this.f31208a, this.f31209b, true);
    }
}
