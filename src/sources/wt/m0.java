package wt;

import rt.t6;
import uz.i1;
import zu.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.i f55326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55327c;

    public /* synthetic */ m0(uz.i iVar, Object obj, int i11) {
        this.f55325a = i11;
        this.f55326b = iVar;
        this.f55327c = obj;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        switch (this.f55325a) {
            case 0:
                Object objCollect = this.f55326b.collect(new t6(8, jVar, (o0) this.f55327c), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            case 1:
                Object objCollect2 = ((i1) this.f55326b).collect(new t6(9, jVar, (wu.v) this.f55327c), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
            case 2:
                Object objCollect3 = ((i1) this.f55326b).collect(new t6(10, jVar, (wu.k0) this.f55327c), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : qy.b0.f48488a;
            default:
                Object objCollect4 = this.f55326b.collect(new t6(11, jVar, (i2) this.f55327c), dVar);
                return objCollect4 == wy.a.COROUTINE_SUSPENDED ? objCollect4 : qy.b0.f48488a;
        }
    }
}
