package pr;

import android.os.Bundle;
import com.lingodeer.data.model.AchievementLevel;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AchievementLevel f47074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ur.a f47075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(AchievementLevel achievementLevel, ur.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47073a = i11;
        this.f47074b = achievementLevel;
        this.f47075c = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f47073a) {
            case 0:
                return new n(this.f47074b, this.f47075c, dVar, 0);
            case 1:
                return new n(this.f47074b, this.f47075c, dVar, 1);
            case 2:
                return new n(this.f47075c, this.f47074b, dVar, 2);
            case 3:
                return new n(this.f47075c, this.f47074b, dVar, 3);
            case 4:
                return new n(this.f47074b, this.f47075c, dVar, 4);
            default:
                return new n(this.f47074b, this.f47075c, dVar, 5);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f47073a) {
            case 0:
                n nVar = (n) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                nVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                n nVar2 = (n) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                nVar2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                n nVar3 = (n) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                nVar3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                n nVar4 = (n) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                nVar4.invokeSuspend(b0Var5);
                return b0Var5;
            case 4:
                n nVar5 = (n) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                nVar5.invokeSuspend(b0Var6);
                return b0Var6;
            default:
                n nVar6 = (n) create(b0Var, dVar);
                qy.b0 b0Var7 = qy.b0.f48488a;
                nVar6.invokeSuspend(b0Var7);
                return b0Var7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(ur.a aVar, AchievementLevel achievementLevel, vy.d dVar, int i11) {
        super(2, dVar);
        this.f47073a = i11;
        this.f47075c = aVar;
        this.f47074b = achievementLevel;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f47073a;
        String str = txBUGYhC.iebGaRPoWaIsov;
        qy.b0 b0Var = qy.b0.f48488a;
        ur.a aVar = this.f47075c;
        final AchievementLevel achievementLevel = this.f47074b;
        switch (i11) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ve.i.F(achievementLevel, str, "more", aVar);
                break;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ve.i.F(achievementLevel, str, "download", aVar);
                break;
            case 2:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                final int i12 = 0;
                aVar.c("ep_badge_receive", new fz.a() { // from class: pr.e0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                Bundle bundle = new Bundle();
                                AchievementLevel achievementLevel2 = achievementLevel;
                                bundle.putString("type", ve.i.A(achievementLevel2));
                                bundle.putString("level", String.valueOf(achievementLevel2.getLevel()));
                                return bundle;
                            default:
                                Bundle bundle2 = new Bundle();
                                AchievementLevel achievementLevel3 = achievementLevel;
                                bundle2.putString("type", ve.i.A(achievementLevel3));
                                bundle2.putString("level", String.valueOf(achievementLevel3.getLevel()));
                                return bundle2;
                        }
                    }
                });
                break;
            case 3:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                final int i13 = 1;
                aVar.c("ep_badge_receive", new fz.a() { // from class: pr.e0
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                Bundle bundle = new Bundle();
                                AchievementLevel achievementLevel2 = achievementLevel;
                                bundle.putString("type", ve.i.A(achievementLevel2));
                                bundle.putString("level", String.valueOf(achievementLevel2.getLevel()));
                                return bundle;
                            default:
                                Bundle bundle2 = new Bundle();
                                AchievementLevel achievementLevel3 = achievementLevel;
                                bundle2.putString("type", ve.i.A(achievementLevel3));
                                bundle2.putString("level", String.valueOf(achievementLevel3.getLevel()));
                                return bundle2;
                        }
                    }
                });
                break;
            case 4:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ve.i.F(achievementLevel, "lesson_complete", "more", aVar);
                break;
            default:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ve.i.F(achievementLevel, "lesson_complete", "download", aVar);
                break;
        }
        return b0Var;
    }
}
