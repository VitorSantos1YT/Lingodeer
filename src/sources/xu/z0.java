package xu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f56576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f56577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f56578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f56579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(boolean z11, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f56575a = i11;
        this.f56576b = z11;
        this.f56577c = b1Var;
        this.f56578d = b1Var2;
        this.f56579e = b1Var3;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f56575a) {
            case 0:
                return new z0(this.f56576b, this.f56577c, this.f56578d, this.f56579e, dVar, 0);
            default:
                return new z0(this.f56576b, this.f56577c, this.f56578d, this.f56579e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f56575a) {
            case 0:
                z0 z0Var = (z0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                z0Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                z0 z0Var2 = (z0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                z0Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f56575a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f56579e;
        l1.b1 b1Var2 = this.f56578d;
        boolean z11 = this.f56576b;
        l1.b1 b1Var3 = this.f56577c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1Var3.setValue(new v3.f(z11 ? 0 : 10));
                b1Var2.setValue(new v3.f(z11 ? 0 : 8));
                b1Var.setValue(new v3.f(z11 ? 8 : 0));
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b1Var3.setValue(new v3.f(z11 ? 10 : 0));
                b1Var2.setValue(new v3.f(z11 ? 8 : 0));
                b1Var.setValue(new v3.f(z11 ? 0 : 8));
                break;
        }
        return b0Var;
    }
}
