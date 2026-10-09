package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.g1 f6089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.g1 f6090c;

    public /* synthetic */ v0(l1.g1 g1Var, l1.g1 g1Var2, int i11) {
        this.f6088a = i11;
        this.f6089b = g1Var;
        this.f6090c = g1Var2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        g2.t0 graphicsLayer = (g2.t0) obj;
        switch (this.f6088a) {
            case 0:
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.q(this.f6089b.l());
                graphicsLayer.r(this.f6090c.l());
                break;
            default:
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.q(this.f6089b.l());
                graphicsLayer.r(this.f6090c.l());
                break;
        }
        return qy.b0.f48488a;
    }
}
