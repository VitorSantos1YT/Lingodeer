package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.i1 f27773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f27774c;

    public /* synthetic */ p1(uz.i1 i1Var, v1 v1Var, int i11) {
        this.f27772a = i11;
        this.f27773b = i1Var;
        this.f27774c = v1Var;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) throws Throwable {
        switch (this.f27772a) {
            case 0:
                Object objCollect = this.f27773b.collect(new o1(jVar, this.f27774c, 0), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            default:
                Object objCollect2 = this.f27773b.collect(new o1(jVar, this.f27774c, 1), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
        }
    }
}
