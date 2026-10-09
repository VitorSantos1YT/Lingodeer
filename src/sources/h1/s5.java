package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s5 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e8 f31055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f31056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(e8 e8Var, fz.a aVar, int i11) {
        super(1);
        this.f31054a = i11;
        this.f31055b = e8Var;
        this.f31056c = aVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f31054a) {
            case 0:
                if (!this.f31055b.c()) {
                    this.f31056c.invoke();
                }
                break;
            default:
                if (!this.f31055b.c()) {
                    this.f31056c.invoke();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
