package qu;

import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ur.a f48387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ur.a aVar, vy.d dVar) {
        super(2, dVar);
        this.f48387a = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new j(this.f48387a, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        jVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        this.f48387a.c("ep_leaderboard_user_detail_pop_up", new ns.d(27));
        return qy.b0.f48488a;
    }
}
