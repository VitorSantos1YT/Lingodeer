package gp;

import bp.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f29469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(l1 l1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29467a = i11;
        this.f29469c = l1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29467a) {
            case 0:
                return new o0(this.f29469c, dVar, 0);
            case 1:
                return new o0(this.f29469c, dVar, 1);
            case 2:
                return new o0(this.f29469c, dVar, 2);
            default:
                return new o0(this.f29469c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29467a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((o0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f29467a;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        l1 l1Var = this.f29469c;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f29468b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var = ((vt.d) l1Var.f29432a).f54197g;
                br.o oVar = new br.o(l1Var, dVar, i12);
                this.f29468b = 1;
                return uz.x0.i(i1Var, oVar, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f29468b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.r0 r0Var = l1Var.f29440f;
                e6.q0 q0Var = new e6.q0(l1Var, dVar, 27);
                this.f29468b = 1;
                return uz.x0.i(r0Var, q0Var, this) == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f29468b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.r0 r0Var2 = l1Var.f29441t;
                g2 g2Var = new g2(2, 7, dVar);
                this.f29468b = 1;
                return uz.x0.i(r0Var2, g2Var, this) == aVar3 ? aVar3 : b0Var;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f29468b;
                try {
                    if (i16 == 0) {
                        com.bumptech.glide.e.F(obj);
                        this.f29468b = 1;
                        yz.f fVar = rz.o0.f50940a;
                        obj = rz.e0.M(yz.e.f58387a, new bh.l(l1Var, null), this);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    long jLongValue = ((Number) ((qy.l) obj).f48495a).longValue();
                    if (jLongValue == 0) {
                        return b0Var;
                    }
                    jp.o oVar2 = l1Var.f29439e;
                    if (oVar2 != null) {
                        oVar2.cancel();
                    }
                    jp.o oVar3 = new jp.o(jLongValue, l1Var);
                    l1Var.f29439e = oVar3;
                    oVar3.start();
                    return b0Var;
                } catch (Exception unused) {
                    return b0Var;
                }
        }
    }
}
