package bh;

import rt.zc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gp.r f4206b;

    public /* synthetic */ f0(gp.r rVar, int i11) {
        this.f4205a = i11;
        this.f4206b = rVar;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) throws Throwable {
        switch (this.f4205a) {
            case 0:
                Object objCollect = this.f4206b.collect(new e0(jVar, 0), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            case 1:
                Object objCollect2 = this.f4206b.collect(new gp.g1(jVar, 5), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
            case 2:
                Object objCollect3 = this.f4206b.collect(new gp.g1(jVar, 10), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : qy.b0.f48488a;
            case 3:
                Object objCollect4 = this.f4206b.collect(new gp.g1(jVar, 17), dVar);
                return objCollect4 == wy.a.COROUTINE_SUSPENDED ? objCollect4 : qy.b0.f48488a;
            case 4:
                Object objCollect5 = this.f4206b.collect(new gp.g1(jVar, 18), dVar);
                return objCollect5 == wy.a.COROUTINE_SUSPENDED ? objCollect5 : qy.b0.f48488a;
            case 5:
                Object objCollect6 = this.f4206b.collect(new gp.g1(jVar, 19), dVar);
                return objCollect6 == wy.a.COROUTINE_SUSPENDED ? objCollect6 : qy.b0.f48488a;
            case 6:
                Object objCollect7 = this.f4206b.collect(new gp.g1(jVar, 20), dVar);
                return objCollect7 == wy.a.COROUTINE_SUSPENDED ? objCollect7 : qy.b0.f48488a;
            case 7:
                Object objCollect8 = this.f4206b.collect(new gp.g1(jVar, 29), dVar);
                return objCollect8 == wy.a.COROUTINE_SUSPENDED ? objCollect8 : qy.b0.f48488a;
            case 8:
                Object objCollect9 = this.f4206b.collect(new zc(jVar, 1), dVar);
                return objCollect9 == wy.a.COROUTINE_SUSPENDED ? objCollect9 : qy.b0.f48488a;
            case 9:
                Object objCollect10 = this.f4206b.collect(new zc(jVar, 13), dVar);
                return objCollect10 == wy.a.COROUTINE_SUSPENDED ? objCollect10 : qy.b0.f48488a;
            case 10:
                Object objCollect11 = this.f4206b.collect(new zc(jVar, 14), dVar);
                return objCollect11 == wy.a.COROUTINE_SUSPENDED ? objCollect11 : qy.b0.f48488a;
            default:
                Object objCollect12 = this.f4206b.collect(new zc(jVar, 17), dVar);
                return objCollect12 == wy.a.COROUTINE_SUSPENDED ? objCollect12 : qy.b0.f48488a;
        }
    }
}
