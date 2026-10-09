package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x3 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.r0 f50623b;

    public /* synthetic */ x3(uz.r0 r0Var, int i11) {
        this.f50622a = i11;
        this.f50623b = r0Var;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        switch (this.f50622a) {
            case 0:
                Object objCollect = this.f50623b.f53391a.collect(new gp.g1(jVar, 25), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            default:
                Object objCollect2 = this.f50623b.f53391a.collect(new zc(jVar, 0), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
        }
    }
}
