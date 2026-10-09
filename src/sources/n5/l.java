package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f43309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(v vVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43307a = i11;
        this.f43309c = vVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43307a) {
            case 0:
                return new l(this.f43309c, dVar, 0);
            case 1:
                return new l(this.f43309c, dVar, 1);
            default:
                return new l(this.f43309c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43307a) {
            case 0:
                return ((l) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f43307a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43308b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f43308b = 1;
                    if (v.d(this.f43309c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f43308b;
                qy.b0 b0Var = qy.b0.f48488a;
                v vVar = this.f43309c;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                ob.i iVar = vVar.f43406i;
                this.f43308b = 1;
                Object objO = ((rz.t) iVar.f44814c).o(this);
                if (objO != aVar2) {
                    objO = b0Var;
                }
                if (objO == aVar2) {
                    return aVar2;
                }
                uz.i iVarF = uz.x0.f(vVar.g().c(), -1);
                b1.b bVar = new b1.b(vVar, 8);
                this.f43308b = 2;
                if (iVarF.collect(bVar, this) == aVar2) {
                    return aVar2;
                }
                return b0Var;
            default:
                v vVar2 = this.f43309c;
                lp.j jVar = vVar2.f43405h;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f43308b;
                try {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            com.bumptech.glide.e.F(obj);
                        } else {
                            if (i13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.e.F(obj);
                        }
                        return (x0) obj;
                    }
                    com.bumptech.glide.e.F(obj);
                    if (jVar.b() instanceof f0) {
                        return jVar.b();
                    }
                    this.f43308b = 1;
                    if (vVar2.h(this) == aVar3) {
                        return aVar3;
                    }
                    this.f43308b = 2;
                    obj = v.e(vVar2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (x0) obj;
                } catch (Throwable th2) {
                    return new q0(-1, th2);
                }
        }
    }
}
