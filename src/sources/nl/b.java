package nl;

import gp.g1;
import qy.b0;
import uz.i;
import uz.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.c f43842b;

    public /* synthetic */ b(uz.c cVar, int i11) {
        this.f43841a = i11;
        this.f43842b = cVar;
    }

    @Override // uz.i
    public final Object collect(j jVar, vy.d dVar) {
        switch (this.f43841a) {
            case 0:
                Object objCollect = this.f43842b.collect(new g1(jVar, 12), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : b0.f48488a;
            case 1:
                Object objCollect2 = this.f43842b.collect(new g1(jVar, 13), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : b0.f48488a;
            case 2:
                Object objCollect3 = this.f43842b.collect(new g1(jVar, 14), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : b0.f48488a;
            default:
                Object objCollect4 = this.f43842b.collect(new g1(jVar, 15), dVar);
                return objCollect4 == wy.a.COROUTINE_SUSPENDED ? objCollect4 : b0.f48488a;
        }
    }
}
