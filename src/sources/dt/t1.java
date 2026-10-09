package dt;

import bt.t5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(boolean z11, l1.b1 b1Var, l1.b1 b1Var2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f24209a = i11;
        this.f24211c = z11;
        this.f24212d = b1Var;
        this.f24213e = b1Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f24209a) {
            case 0:
                return new t1(this.f24211c, this.f24212d, this.f24213e, dVar, 0);
            default:
                return new t1(this.f24211c, this.f24212d, this.f24213e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f24209a) {
            case 0:
                break;
        }
        return ((t1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f24209a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f24210b;
                l1.b1 b1Var = this.f24213e;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (!this.f24211c || !((Boolean) this.f24212d.getValue()).booleanValue() || ((Boolean) b1Var.getValue()).booleanValue()) {
                        return b0Var;
                    }
                    com.lingo.lingoskill.object.a aVar2 = new com.lingo.lingoskill.object.a(28);
                    this.f24210b = 1;
                    if (l1.t.x(getContext()).p(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f24210b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                t5 t5Var = new t5(this.f24211c, this.f24212d, this.f24213e, (vy.d) null, 5);
                this.f24210b = 1;
                return rz.e0.M(eVar, t5Var, this) == aVar3 ? aVar3 : b0Var;
        }
    }
}
