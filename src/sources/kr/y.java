package kr;

import rt.zc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ no.g f38614b;

    public /* synthetic */ y(no.g gVar, int i11) {
        this.f38613a = i11;
        this.f38614b = gVar;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        switch (this.f38613a) {
            case 0:
                Object objCollect = this.f38614b.collect(new gp.g1(jVar, 8), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            case 1:
                Object objCollect2 = this.f38614b.collect(new zc(jVar, 9), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
            default:
                Object objCollect3 = this.f38614b.collect(new zc(jVar, 11), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : qy.b0.f48488a;
        }
    }
}
