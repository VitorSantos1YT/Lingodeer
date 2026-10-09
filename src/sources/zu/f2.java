package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i2 f59415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f59416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(i2 i2Var, b2 b2Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f59413a = i11;
        this.f59415c = i2Var;
        this.f59416d = b2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f59413a) {
            case 0:
                return new f2(this.f59415c, this.f59416d, dVar, 0);
            case 1:
                return new f2(this.f59415c, this.f59416d, dVar, 1);
            default:
                return new f2(this.f59415c, this.f59416d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f59413a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((f2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        switch (this.f59413a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f59414b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f59414b = 1;
                    if (this.f59415c.b(this.f59416d, System.currentTimeMillis(), this) == aVar) {
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
                i2 i2Var = this.f59415c;
                uz.i1 i1Var = i2Var.f59451f;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f59414b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    do {
                        value2 = i1Var.getValue();
                        ((Boolean) value2).getClass();
                    } while (!i1Var.j(value2, Boolean.FALSE));
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                do {
                    value = i1Var.getValue();
                    ((Boolean) value).getClass();
                } while (!i1Var.j(value, Boolean.TRUE));
                ru.a aVar3 = i2Var.f59449d;
                boolean z11 = ((q1) this.f59416d).f59537a;
                fr.v1 v1Var = (fr.v1) aVar3;
                v1Var.getClass();
                gp.r rVar = new gp.r(new fr.h1(v1Var, null, 1));
                this.f59414b = 1;
                if (uz.x0.u(rVar, this) == aVar2) {
                    return aVar2;
                }
                vt.c cVar = i2Var.f59448c;
                this.f59414b = 2;
                if (((vt.d) cVar).e(this) == aVar2) {
                    return aVar2;
                }
                do {
                    value2 = i1Var.getValue();
                    ((Boolean) value2).getClass();
                } while (!i1Var.j(value2, Boolean.FALSE));
                return qy.b0.f48488a;
            default:
                i2 i2Var2 = this.f59415c;
                uz.i1 i1Var2 = i2Var2.f59451f;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f59414b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    do {
                        value4 = i1Var2.getValue();
                        ((Boolean) value4).getClass();
                    } while (!i1Var2.j(value4, Boolean.FALSE));
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                do {
                    value3 = i1Var2.getValue();
                    ((Boolean) value3).getClass();
                } while (!i1Var2.j(value3, Boolean.TRUE));
                ru.a aVar5 = i2Var2.f59449d;
                boolean z12 = ((s1) this.f59416d).f59554a;
                fr.v1 v1Var2 = (fr.v1) aVar5;
                v1Var2.getClass();
                gp.r rVar2 = new gp.r(new bh.j0(v1Var2, z12, (vy.d) null));
                this.f59414b = 1;
                if (uz.x0.u(rVar2, this) == aVar4) {
                    return aVar4;
                }
                vt.c cVar2 = i2Var2.f59448c;
                this.f59414b = 2;
                if (((vt.d) cVar2).e(this) == aVar4) {
                    return aVar4;
                }
                do {
                    value4 = i1Var2.getValue();
                    ((Boolean) value4).getClass();
                } while (!i1Var2.j(value4, Boolean.FALSE));
                return qy.b0.f48488a;
        }
    }
}
