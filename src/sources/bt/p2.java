package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.d f5831b;

    public /* synthetic */ p2(b0.d dVar, int i11) {
        this.f5830a = i11;
        this.f5831b = dVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f5830a) {
            case 0:
                v3.c offset = (v3.c) obj;
                kotlin.jvm.internal.m.f(offset, "$this$offset");
                return new v3.j((((long) hz.b.Q(((Number) this.f5831b.d()).floatValue() * 5)) << 32) | (((long) 0) & 4294967295L));
            default:
                g2.t0 graphicsLayer = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.q(((Number) this.f5831b.d()).floatValue());
                return qy.b0.f48488a;
        }
    }
}
