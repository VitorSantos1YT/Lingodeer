package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s3 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bh.i0 f50373b;

    public /* synthetic */ s3(bh.i0 i0Var, int i11) {
        this.f50372a = i11;
        this.f50373b = i0Var;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        switch (this.f50372a) {
            case 0:
                Object objCollect = this.f50373b.collect(new gp.g1(jVar, 24), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            case 1:
                Object objCollect2 = this.f50373b.collect(new gp.g1(jVar, 27), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
            default:
                Object objCollect3 = this.f50373b.collect(new gp.g1(jVar, 28), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : qy.b0.f48488a;
        }
    }
}
