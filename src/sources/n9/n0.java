package n9;

import rt.k9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uz.i f43650c;

    public /* synthetic */ n0(uz.i iVar, int i11, int i12) {
        this.f43648a = i12;
        this.f43650c = iVar;
        this.f43649b = i11;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) throws Throwable {
        switch (this.f43648a) {
            case 0:
                Object objCollect = ((n0) this.f43650c).collect(new fr.u(jVar, this.f43649b, 1), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            case 1:
                Object objCollect2 = this.f43650c.collect(new k9(new kotlin.jvm.internal.w(), this.f43649b, jVar), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
            default:
                Object objCollect3 = ((gp.r) this.f43650c).collect(new fr.u(jVar, this.f43649b, 2), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : qy.b0.f48488a;
        }
    }
}
