package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r5 f49919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(int i11, r5 r5Var, vy.d dVar) {
        super(2, dVar);
        this.f49917a = i11;
        this.f49919c = r5Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f49917a) {
            case 0:
                return new j5(0, this.f49919c, dVar);
            case 1:
                return new j5(1, this.f49919c, dVar);
            default:
                return new j5(2, this.f49919c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f49917a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((j5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f49917a;
        int i12 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        r5 r5Var = this.f49919c;
        int i13 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f49918b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f49918b = 1;
                Object objB = r5.b(r5Var, this);
                return objB == aVar ? aVar : objB;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f49918b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                n9.n0 n0VarP = uz.x0.p(((vt.d) r5Var.f50335d).f54200j, 1);
                k5 k5Var = new k5(r5Var, i12);
                this.f49918b = 1;
                return n0VarP.collect(k5Var, this) == aVar2 ? aVar2 : b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f49918b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.i iVarJ = ((fr.x4) r5Var.K).j();
                uz.i1 i1Var = ((vt.d) r5Var.f50335d).f54195e;
                c cVar = new c(3, 2, null);
                k5 k5Var2 = new k5(r5Var, i13);
                this.f49918b = 1;
                Object objA = vz.b.a(uz.n0.f53370a, new uz.l0(cVar, (vy.d) null), k5Var2, this, new uz.i[]{iVarJ, i1Var});
                if (objA != wy.a.COROUTINE_SUSPENDED) {
                    objA = b0Var;
                }
                return objA == aVar3 ? aVar3 : b0Var;
        }
    }
}
