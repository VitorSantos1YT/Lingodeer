package pr;

import com.lingodeer.data.model.AchievementLevel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AchievementLevel f47070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f47071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur.a f47072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(AchievementLevel achievementLevel, String str, ur.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47069a = i11;
        this.f47070b = achievementLevel;
        this.f47071c = str;
        this.f47072d = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47069a) {
            case 0:
                return new m(this.f47070b, this.f47071c, this.f47072d, dVar, 0);
            default:
                return new m(this.f47070b, this.f47071c, this.f47072d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f47069a) {
            case 0:
                m mVar = (m) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                mVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                m mVar2 = (m) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                mVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f47069a;
        qy.b0 b0Var = qy.b0.f48488a;
        ur.a aVar = this.f47072d;
        String str = this.f47071c;
        AchievementLevel achievementLevel = this.f47070b;
        switch (i11) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ve.i.F(achievementLevel, "me_achievement_detail", tv.j.d(str), aVar);
                break;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ve.i.F(achievementLevel, "lesson_complete", tv.j.d(str), aVar);
                break;
        }
        return b0Var;
    }
}
