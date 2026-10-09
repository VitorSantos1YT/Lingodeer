package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d4 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ no.g f27470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27471c;

    public /* synthetic */ d4(no.g gVar, String str, int i11) {
        this.f27469a = i11;
        this.f27470b = gVar;
        this.f27471c = str;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) throws Throwable {
        switch (this.f27469a) {
            case 0:
                Object objCollect = this.f27470b.collect(new o(jVar, this.f27471c, 1), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            default:
                Object objCollect2 = this.f27470b.collect(new o(jVar, this.f27471c, 2), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
        }
    }
}
