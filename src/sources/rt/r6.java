package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r6 implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.i f50340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x8 f50341c;

    public /* synthetic */ r6(uz.i iVar, x8 x8Var, int i11) {
        this.f50339a = i11;
        this.f50340b = iVar;
        this.f50341c = x8Var;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        switch (this.f50339a) {
            case 0:
                Object objCollect = this.f50340b.collect(new q6(jVar, this.f50341c, 0), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
            default:
                Object objCollect2 = this.f50340b.collect(new q6(jVar, this.f50341c, 1), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : qy.b0.f48488a;
        }
    }
}
