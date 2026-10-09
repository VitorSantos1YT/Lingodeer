package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ya extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb f50723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya(bb bbVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f50721a = i11;
        this.f50723c = bbVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50721a) {
            case 0:
                return new ya(this.f50723c, dVar, 0);
            default:
                return new ya(this.f50723c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50721a) {
            case 0:
                break;
        }
        return ((ya) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f50721a;
        bb bbVar = this.f50723c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f50722b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.k0 k0Var = bbVar.f49537b;
                long j11 = bbVar.f49542t;
                this.f50722b = 1;
                bh.a1 a1Var = (bh.a1) k0Var;
                a1Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new bh.n0(4, j11, a1Var, null), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f50722b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.k0 k0Var2 = bbVar.f49537b;
                long j12 = bbVar.f49542t;
                this.f50722b = 1;
                bh.a1 a1Var2 = (bh.a1) k0Var2;
                a1Var2.getClass();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new bh.n0(5, j12, a1Var2, null), this);
                if (objM2 != aVar2) {
                    objM2 = b0Var;
                }
                return objM2 == aVar2 ? aVar2 : b0Var;
        }
    }
}
