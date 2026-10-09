package bh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gp.r f4291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f4292c;

    public /* synthetic */ m0(gp.r rVar, a1 a1Var, int i11) {
        this.f4290a = i11;
        this.f4291b = rVar;
        this.f4292c = a1Var;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) throws Throwable {
        switch (this.f4290a) {
            case 0:
                Object objCollect = this.f4291b.collect(new l0(jVar, this.f4292c, 0), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            case 1:
                Object objCollect2 = this.f4291b.collect(new l0(jVar, this.f4292c, 1), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
            case 2:
                Object objCollect3 = this.f4291b.collect(new l0(jVar, this.f4292c, 2), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : qy.b0.f48488a;
            case 3:
                Object objCollect4 = this.f4291b.collect(new l0(jVar, this.f4292c, 3), dVar);
                return objCollect4 == wy.a.COROUTINE_SUSPENDED ? objCollect4 : qy.b0.f48488a;
            case 4:
                Object objCollect5 = this.f4291b.collect(new l0(jVar, this.f4292c, 4), dVar);
                return objCollect5 == wy.a.COROUTINE_SUSPENDED ? objCollect5 : qy.b0.f48488a;
            case 5:
                Object objCollect6 = this.f4291b.collect(new l0(jVar, this.f4292c, 5), dVar);
                return objCollect6 == wy.a.COROUTINE_SUSPENDED ? objCollect6 : qy.b0.f48488a;
            case 6:
                Object objCollect7 = this.f4291b.collect(new l0(jVar, this.f4292c, 6), dVar);
                return objCollect7 == wy.a.COROUTINE_SUSPENDED ? objCollect7 : qy.b0.f48488a;
            case 7:
                Object objCollect8 = this.f4291b.collect(new l0(jVar, this.f4292c, 7), dVar);
                return objCollect8 == wy.a.COROUTINE_SUSPENDED ? objCollect8 : qy.b0.f48488a;
            case 8:
                Object objCollect9 = this.f4291b.collect(new l0(jVar, this.f4292c, 8), dVar);
                return objCollect9 == wy.a.COROUTINE_SUSPENDED ? objCollect9 : qy.b0.f48488a;
            default:
                Object objCollect10 = this.f4291b.collect(new l0(jVar, this.f4292c, 9), dVar);
                return objCollect10 == wy.a.COROUTINE_SUSPENDED ? objCollect10 : qy.b0.f48488a;
        }
    }
}
