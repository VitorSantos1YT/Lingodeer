package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f58601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ da.e f58602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f58603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(boolean z11, da.e eVar, String str) {
        super(0);
        this.f58601a = z11;
        this.f58602b = eVar;
        this.f58603c = str;
    }

    @Override // fz.a
    public final Object invoke() {
        if (this.f58601a) {
            da.e eVar = this.f58602b;
            String str = this.f58603c;
            fa.a aVar = eVar.f23337a;
            synchronized (aVar.f27031c) {
            }
        }
        return qy.b0.f48488a;
    }
}
