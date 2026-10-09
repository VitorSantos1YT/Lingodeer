package uz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53347a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ j f53349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object[] f53350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xy.i f53351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(fz.f fVar, vy.d dVar) {
        super(3, dVar);
        this.f53351e = (xy.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.g, xy.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fz.h, xy.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [fz.i, xy.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fz.f, xy.i] */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar = (j) obj;
        Object[] objArr = (Object[]) obj2;
        vy.d dVar = (vy.d) obj3;
        switch (this.f53347a) {
            case 0:
                l0 l0Var = new l0(dVar, (fz.g) this.f53351e);
                l0Var.f53349c = jVar;
                l0Var.f53350d = objArr;
                return l0Var.invokeSuspend(qy.b0.f48488a);
            case 1:
                l0 l0Var2 = new l0(dVar, (fz.h) this.f53351e);
                l0Var2.f53349c = jVar;
                l0Var2.f53350d = objArr;
                return l0Var2.invokeSuspend(qy.b0.f48488a);
            case 2:
                l0 l0Var3 = new l0(dVar, (fz.i) this.f53351e);
                l0Var3.f53349c = jVar;
                l0Var3.f53350d = objArr;
                return l0Var3.invokeSuspend(qy.b0.f48488a);
            default:
                l0 l0Var4 = new l0((fz.f) this.f53351e, dVar);
                l0Var4.f53349c = jVar;
                l0Var4.f53350d = objArr;
                return l0Var4.invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fz.g, xy.i] */
    /* JADX WARN: Type inference failed for: r3v4, types: [fz.h, xy.i] */
    /* JADX WARN: Type inference failed for: r3v9, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r5v2, types: [fz.i, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        j jVar2;
        j jVar3;
        l0 l0Var;
        j jVar4;
        switch (this.f53347a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f53348b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        jVar = this.f53349c;
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                jVar = this.f53349c;
                Object[] objArr = this.f53350d;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f53349c = jVar;
                this.f53348b = 1;
                obj = this.f53351e.f(obj2, obj3, obj4, this);
                if (obj == aVar) {
                    return aVar;
                }
                this.f53349c = null;
                this.f53348b = 2;
                if (jVar.emit(obj, this) == aVar) {
                    return aVar;
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f53348b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        jVar2 = this.f53349c;
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                jVar2 = this.f53349c;
                Object[] objArr2 = this.f53350d;
                Object obj5 = objArr2[0];
                Object obj6 = objArr2[1];
                Object obj7 = objArr2[2];
                Object obj8 = objArr2[3];
                this.f53349c = jVar2;
                this.f53348b = 1;
                obj = this.f53351e.i(obj5, obj6, obj7, obj8, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                this.f53349c = null;
                this.f53348b = 2;
                if (jVar2.emit(obj, this) == aVar2) {
                    return aVar2;
                }
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f53348b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        jVar3 = this.f53349c;
                        com.bumptech.glide.e.F(obj);
                        l0Var = this;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                jVar3 = this.f53349c;
                Object[] objArr3 = this.f53350d;
                Object obj9 = objArr3[0];
                Object obj10 = objArr3[1];
                Object obj11 = objArr3[2];
                Object obj12 = objArr3[3];
                Object obj13 = objArr3[4];
                this.f53349c = jVar3;
                this.f53348b = 1;
                obj = this.f53351e.g(obj9, obj10, obj11, obj12, obj13, this);
                l0Var = this;
                if (obj == aVar3) {
                    return aVar3;
                }
                l0Var.f53349c = null;
                l0Var.f53348b = 2;
                if (jVar3.emit(obj, this) == aVar3) {
                    return aVar3;
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f53348b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        jVar4 = this.f53349c;
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                jVar4 = this.f53349c;
                Object[] objArr4 = this.f53350d;
                Object obj14 = objArr4[0];
                Object obj15 = objArr4[1];
                this.f53349c = jVar4;
                this.f53348b = 1;
                obj = this.f53351e.invoke(obj14, obj15, this);
                if (obj == aVar4) {
                    return aVar4;
                }
                this.f53349c = null;
                this.f53348b = 2;
                if (jVar4.emit(obj, this) == aVar4) {
                    return aVar4;
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(vy.d dVar, fz.g gVar) {
        super(3, dVar);
        this.f53351e = (xy.i) gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(vy.d dVar, fz.h hVar) {
        super(3, dVar);
        this.f53351e = (xy.i) hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l0(vy.d dVar, fz.i iVar) {
        super(3, dVar);
        this.f53351e = (xy.i) iVar;
    }
}
