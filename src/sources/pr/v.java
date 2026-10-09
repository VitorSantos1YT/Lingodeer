package pr;

import com.lingodeer.data.model.AchievementLeaderBoard;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AchievementLeaderBoard f47106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ur.a f47107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(AchievementLeaderBoard achievementLeaderBoard, ur.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47105a = i11;
        this.f47106b = achievementLeaderBoard;
        this.f47107c = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47105a) {
            case 0:
                return new v(this.f47106b, this.f47107c, dVar, 0);
            default:
                return new v(this.f47106b, this.f47107c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f47105a) {
            case 0:
                v vVar = (v) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                vVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                v vVar2 = (v) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                vVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f47105a;
        qy.b0 b0Var = qy.b0.f48488a;
        ur.a aVar = this.f47107c;
        AchievementLeaderBoard achievementLeaderBoard = this.f47106b;
        switch (i11) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                vc.a.w(achievementLeaderBoard, "more", aVar);
                break;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                vc.a.w(achievementLeaderBoard, "download", aVar);
                break;
        }
        return b0Var;
    }
}
