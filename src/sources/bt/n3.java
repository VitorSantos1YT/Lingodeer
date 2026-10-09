package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.j0 f5754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f5755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(jt.j0 j0Var, fz.c cVar, l1.b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5752a = i11;
        this.f5754c = j0Var;
        this.f5755d = cVar;
        this.f5756e = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5752a) {
            case 0:
                return new n3(this.f5754c, this.f5755d, this.f5756e, dVar, 0);
            default:
                return new n3(this.f5754c, this.f5755d, this.f5756e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5752a) {
            case 0:
                break;
        }
        return ((n3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5752a;
        l1.b1 b1Var = this.f5756e;
        fz.c cVar = this.f5755d;
        int i12 = 27;
        vy.d dVar = null;
        jt.j0 j0Var = this.f5754c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f5753b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f5753b = 1;
                    j0Var.getClass();
                    yz.f fVar = rz.o0.f50940a;
                    Object objM = rz.e0.M(yz.e.f58387a, new av.p(j0Var, dVar, i12), this);
                    if (objM != aVar) {
                        objM = b0Var;
                    }
                    if (objM == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                cVar.invoke(Boolean.valueOf(b1Var.getValue() == ht.q.CORRECT));
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f5753b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f5753b = 1;
                    j0Var.getClass();
                    yz.f fVar2 = rz.o0.f50940a;
                    Object objM2 = rz.e0.M(yz.e.f58387a, new av.p(j0Var, dVar, i12), this);
                    if (objM2 != aVar2) {
                        objM2 = b0Var;
                    }
                    if (objM2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                cVar.invoke(Boolean.valueOf(b1Var.getValue() == ht.q.CORRECT));
                return b0Var;
        }
    }
}
