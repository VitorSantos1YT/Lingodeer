package zu;

import fr.i3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s2 f59503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(int i11, vy.d dVar, s2 s2Var) {
        super(2, dVar);
        this.f59501a = i11;
        this.f59503c = s2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f59501a) {
            case 0:
                return new n2(0, dVar, this.f59503c);
            case 1:
                return new n2(1, dVar, this.f59503c);
            default:
                return new n2(2, dVar, this.f59503c);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f59501a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((n2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f59501a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f59502b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    s2 s2Var = this.f59503c;
                    uz.i1 i1Var = ((vt.d) s2Var.f59558d).f54196f;
                    km.s0 s0Var = new km.s0(s2Var, null, 21);
                    this.f59502b = 1;
                    if (uz.x0.i(i1Var, s0Var, this) == aVar) {
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
                int i12 = this.f59502b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var = (i3) this.f59503c.f59560f;
                    i3Var.getClass();
                    gp.r rVar = new gp.r(new fr.i2(1, i3Var, null));
                    this.f59502b = 1;
                    if (uz.x0.u(rVar, this) == aVar2) {
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
                int i13 = this.f59502b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var2 = (i3) this.f59503c.f59560f;
                    i3Var2.getClass();
                    gp.r rVar2 = new gp.r(new fr.i2(3, i3Var2, null));
                    this.f59502b = 1;
                    if (uz.x0.u(rVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
