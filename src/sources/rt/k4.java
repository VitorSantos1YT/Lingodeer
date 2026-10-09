package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k4 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uz.i f49966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f49967b;

    public k4(no.g gVar, long j11) {
        this.f49966a = gVar;
        this.f49967b = j11;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        Object objCollect = this.f49966a.collect(new j4(jVar, this.f49967b, 0), dVar);
        return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
    }
}
