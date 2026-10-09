package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r5 f50191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f50192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(int i11, r5 r5Var, vy.d dVar) {
        super(2, dVar);
        this.f50189a = 0;
        this.f50192d = i11;
        this.f50191c = r5Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50189a) {
            case 0:
                return new o5(this.f50192d, this.f50191c, dVar);
            case 1:
                return new o5(this.f50191c, this.f50192d, dVar, 1);
            default:
                return new o5(this.f50191c, this.f50192d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50189a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((o5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        switch (this.f50189a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50190b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    long j11 = ((long) this.f50192d) * 60000;
                    this.f50190b = 1;
                    if (rz.e0.m(j11, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                r5 r5Var = this.f50191c;
                rz.z1 z1Var = r5Var.O;
                if (z1Var != null) {
                    z1Var.cancel(null);
                }
                r5Var.f50337f.n();
                uz.i1 i1Var = r5Var.M;
                do {
                    value = i1Var.getValue();
                    objA = (c5) value;
                    if (objA instanceof b5) {
                        objA = b5.a((b5) objA, false, null, null, null, null, 0, v4.PAUSED, null, 383);
                    }
                } while (!i1Var.j(value, objA));
                r5Var.q();
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f50190b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f50190b = 1;
                    if (r5.f(this.f50191c, this.f50192d, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f50190b;
                qy.b0 b0Var = qy.b0.f48488a;
                r5 r5Var2 = this.f50191c;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.n0 n0Var = r5Var2.f50336e;
                this.f50190b = 1;
                if (((fr.o0) n0Var).Z(this.f50192d, this) == aVar3) {
                    return aVar3;
                }
                vt.c cVar = r5Var2.f50335d;
                this.f50190b = 2;
                ((vt.d) cVar).k(this);
                if (b0Var == aVar3) {
                    return aVar3;
                }
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5(r5 r5Var, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f50189a = i12;
        this.f50191c = r5Var;
        this.f50192d = i11;
    }
}
