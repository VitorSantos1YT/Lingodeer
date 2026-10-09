package br;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ur.a f5076b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(ur.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5075a = i11;
        this.f5076b = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5075a) {
            case 0:
                return new p(this.f5076b, dVar, 0);
            case 1:
                return new p(this.f5076b, dVar, 1);
            default:
                return new p(this.f5076b, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5075a) {
            case 0:
                p pVar = (p) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                pVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                p pVar2 = (p) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                pVar2.invokeSuspend(b0Var3);
                return b0Var3;
            default:
                p pVar3 = (p) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                pVar3.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5075a;
        qy.b0 b0Var = qy.b0.f48488a;
        ur.a aVar = this.f5076b;
        switch (i11) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.c("jxz_learn_topbar_click", new bq.u(2));
                break;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b7.e0.A(aVar, "ld_first_enter_subscribe");
                break;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b7.e0.A(aVar, "ep_badge_achievement_detail_enter");
                break;
        }
        return b0Var;
    }
}
