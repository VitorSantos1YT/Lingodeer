package s0;

import f0.t2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2.w f51022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f51023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(s2.w wVar, a1 a1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f51020a = i11;
        this.f51022c = wVar;
        this.f51023d = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f51020a) {
            case 0:
                return new e0(this.f51022c, this.f51023d, dVar, 0);
            case 1:
                return new e0(this.f51022c, this.f51023d, dVar, 1);
            default:
                return new e0(this.f51022c, this.f51023d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f51020a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((e0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f51020a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f51021b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f51021b = 1;
                    Object objL = rz.e0.l(new qg.e(4, this.f51022c, this.f51023d, null), this);
                    if (objL != aVar) {
                        objL = b0Var;
                    }
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f51021b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f51021b = 1;
                    Object objC = t2.c(this.f51022c, new f0.v0(this.f51023d, (vy.d) null, 3), this);
                    if (objC != aVar2) {
                        objC = b0Var2;
                    }
                    if (objC == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f51021b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f51021b = 1;
                    final a1 a1Var = this.f51023d;
                    d1.z zVar = new d1.z(a1Var, 1);
                    final int i14 = 0;
                    fz.a aVar4 = new fz.a() { // from class: s0.u0
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    a1Var.a();
                                    break;
                                default:
                                    a1Var.onCancel();
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    final int i15 = 1;
                    Object objE = f0.g0.e(this.f51022c, zVar, aVar4, new fz.a() { // from class: s0.u0
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    a1Var.a();
                                    break;
                                default:
                                    a1Var.onCancel();
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    }, new mt.r(a1Var, 14), this);
                    if (objE != aVar3) {
                        objE = b0Var3;
                    }
                    if (objE == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var3;
        }
    }
}
