package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5775a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nu.e f5777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nu.e eVar, boolean z11, vy.d dVar) {
        super(2, dVar);
        this.f5777c = eVar;
        this.f5776b = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5775a) {
            case 0:
                return new o(this.f5777c, this.f5776b, dVar);
            default:
                return new o(this.f5776b, this.f5777c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5775a) {
            case 0:
                o oVar = (o) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                oVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                o oVar2 = (o) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                oVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5775a;
        qy.b0 b0Var = qy.b0.f48488a;
        nu.e eVar = this.f5777c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                pu.b bVar = eVar.f44062a;
                ou.e eVar2 = eVar.f44065d;
                boolean z11 = eVar2.f46089k;
                boolean z12 = this.f5776b;
                if (z11 != z12) {
                    eVar.f44065d = new ou.e(eVar2.f46079a, eVar2.f46080b, eVar2.f46081c, eVar2.f46082d, eVar2.f46083e, eVar2.f46084f, eVar2.f46085g, eVar2.f46086h, eVar2.f46087i, eVar2.f46088j, z12);
                    if (!z12) {
                        l1.k1 k1Var = bVar.E;
                        l1.k1 k1Var2 = bVar.J;
                        if (((Boolean) k1Var.getValue()).booleanValue()) {
                            boolean zBooleanValue = ((Boolean) bVar.G.getValue()).booleanValue();
                            bVar.j(false);
                            rz.g1 g1Var = (rz.g1) k1Var2.getValue();
                            if (g1Var != null) {
                                g1Var.cancel(null);
                            }
                            k1Var2.setValue(null);
                            rz.e0.B(eVar.f44064c, null, null, new nu.c(eVar, null, 1), 3);
                            if (zBooleanValue) {
                                eVar.f44066e.invoke();
                            }
                        }
                    }
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!this.f5776b) {
                    eVar.d(ou.f.Normal);
                } else {
                    eVar.d(ou.f.Anim);
                }
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z11, nu.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f5776b = z11;
        this.f5777c = eVar;
    }
}
