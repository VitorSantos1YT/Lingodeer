package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g3 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f5430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.j0 f5431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f5432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5433e;

    public /* synthetic */ g3(rz.b0 b0Var, jt.j0 j0Var, fz.c cVar, l1.b1 b1Var, int i11) {
        this.f5429a = i11;
        this.f5430b = b0Var;
        this.f5431c = j0Var;
        this.f5432d = cVar;
        this.f5433e = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5429a) {
            case 0:
                rz.e0.B(this.f5430b, null, null, new n3(this.f5431c, this.f5432d, this.f5433e, null, 0), 3);
                break;
            default:
                rz.e0.B(this.f5430b, null, null, new n3(this.f5431c, this.f5432d, this.f5433e, null, 1), 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
