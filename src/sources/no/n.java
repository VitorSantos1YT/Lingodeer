package no;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.c f43902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f43903c;

    public /* synthetic */ n(uz.c cVar, s sVar, int i11) {
        this.f43901a = i11;
        this.f43902b = cVar;
        this.f43903c = sVar;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        switch (this.f43901a) {
            case 0:
                Object objCollect = this.f43902b.collect(new m(jVar, this.f43903c, 0), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : b0.f48488a;
            default:
                Object objCollect2 = this.f43902b.collect(new m(jVar, this.f43903c, 1), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : b0.f48488a;
        }
    }
}
