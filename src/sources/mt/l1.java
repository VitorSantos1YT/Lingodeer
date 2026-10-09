package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.g1 f41614b;

    public /* synthetic */ l1(l1.g1 g1Var, int i11) {
        this.f41613a = i11;
        this.f41614b = g1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f41613a) {
            case 0:
                w2.x coordinates = (w2.x) obj;
                kotlin.jvm.internal.m.f(coordinates, "coordinates");
                this.f41614b.m(Float.intBitsToFloat((int) (coordinates.P(0L) & 4294967295L)));
                break;
            default:
                this.f41614b.m(((Float) obj).floatValue());
                break;
        }
        return qy.b0.f48488a;
    }
}
