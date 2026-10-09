package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f22668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f22667a = i11;
        this.f22668b = fVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f22667a) {
            case 0:
                return new e(this.f22668b, dVar, 0);
            default:
                return new e(this.f22668b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f22667a) {
            case 0:
                e eVar = (e) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                eVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                e eVar2 = (e) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                eVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f22667a;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        f fVar = this.f22668b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (fVar.f22688e0 == null) {
                    h0.f fVar2 = new h0.f();
                    h0.i iVar = fVar.S;
                    if (iVar != null) {
                        rz.e0.B(fVar.H0(), null, null, new b1.c(26, iVar, fVar2, dVar), 3);
                    }
                    fVar.f22688e0 = fVar2;
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                h0.f fVar3 = fVar.f22688e0;
                if (fVar3 != null) {
                    h0.g gVar = new h0.g(fVar3);
                    h0.i iVar2 = fVar.S;
                    if (iVar2 != null) {
                        rz.e0.B(fVar.H0(), null, null, new b1.c(27, iVar2, gVar, dVar), 3);
                    }
                    fVar.f22688e0 = null;
                }
                break;
        }
        return b0Var;
    }
}
