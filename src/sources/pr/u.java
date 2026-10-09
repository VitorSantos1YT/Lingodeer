package pr;

import com.lingodeer.data.model.AchievementLanguage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AchievementLanguage f47103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ur.a f47104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(AchievementLanguage achievementLanguage, ur.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47102a = i11;
        this.f47103b = achievementLanguage;
        this.f47104c = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47102a) {
            case 0:
                return new u(this.f47103b, this.f47104c, dVar, 0);
            default:
                return new u(this.f47103b, this.f47104c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f47102a) {
            case 0:
                u uVar = (u) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                uVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                u uVar2 = (u) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                uVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f47102a;
        qy.b0 b0Var = qy.b0.f48488a;
        ur.a aVar = this.f47104c;
        AchievementLanguage achievementLanguage = this.f47103b;
        switch (i11) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                v10.c.E(achievementLanguage, "more", aVar);
                break;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                v10.c.E(achievementLanguage, "download", aVar);
                break;
        }
        return b0Var;
    }
}
