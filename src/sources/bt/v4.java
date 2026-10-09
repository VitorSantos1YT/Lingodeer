package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f6107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(l1.b3 b3Var, l1.b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6106a = i11;
        this.f6107b = b3Var;
        this.f6108c = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6106a) {
            case 0:
                return new v4(this.f6107b, this.f6108c, dVar, 0);
            default:
                return new v4(this.f6107b, this.f6108c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6106a) {
            case 0:
                v4 v4Var = (v4) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                v4Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                v4 v4Var2 = (v4) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                v4Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f6106a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b3 b3Var = this.f6107b;
        l1.b1 b1Var = this.f6108c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!((Boolean) b3Var.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.FALSE);
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((Boolean) b3Var.getValue()).booleanValue() && ((Boolean) b1Var.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.FALSE);
                }
                break;
        }
        return b0Var;
    }
}
