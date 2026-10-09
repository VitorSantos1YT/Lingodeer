package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f23858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f23859e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(boolean z11, d0.d2 d2Var, l1.b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f23855a = i11;
        this.f23857c = z11;
        this.f23858d = d2Var;
        this.f23859e = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23855a) {
            case 0:
                return new h3(this.f23857c, this.f23858d, this.f23859e, dVar, 0);
            default:
                return new h3(this.f23857c, this.f23858d, this.f23859e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23855a) {
            case 0:
                break;
        }
        return ((h3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        int i11 = this.f23855a;
        d0.d2 d2Var = this.f23858d;
        l1.b1 b1Var = this.f23859e;
        boolean z12 = this.f23857c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f23856b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    l1.c3 c3Var = k3.f23943a;
                    if (!((Boolean) b1Var.getValue()).booleanValue()) {
                        this.f23856b = 1;
                        if (rz.e0.m(500L, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                z11 = z12 && d2Var.d();
                l1.c3 c3Var2 = k3.f23943a;
                b1Var.setValue(Boolean.valueOf(z11));
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f23856b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (!z12) {
                        l1.c3 c3Var3 = k3.f23943a;
                        b1Var.setValue(Boolean.FALSE);
                        return b0Var;
                    }
                    l1.c3 c3Var4 = k3.f23943a;
                    if (!((Boolean) b1Var.getValue()).booleanValue()) {
                        this.f23856b = 1;
                        if (rz.e0.m(500L, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                z11 = z12 && d2Var.d();
                l1.c3 c3Var5 = k3.f23943a;
                b1Var.setValue(Boolean.valueOf(z11));
                return b0Var;
        }
    }
}
