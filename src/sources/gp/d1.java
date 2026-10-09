package gp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.i f29362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f29363c;

    public /* synthetic */ d1(uz.i1 i1Var, l1 l1Var, int i11) {
        this.f29361a = i11;
        this.f29362b = i1Var;
        this.f29363c = l1Var;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        switch (this.f29361a) {
            case 0:
                Object objCollect = this.f29362b.collect(new bh.e0(jVar, this.f29363c, 28), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            default:
                Object objCollect2 = this.f29362b.collect(new bh.e0(jVar, this.f29363c, 29), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
        }
    }
}
