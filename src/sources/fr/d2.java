package fr;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.lingodeer.data.model.UserInfo;
import com.lingodeer.network.model.BooleanResponse;
import com.lingodeer.network.model.ServerJsonResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3 f27464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f27465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(i3 i3Var, kotlin.jvm.internal.y yVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27462a = i11;
        this.f27464c = i3Var;
        this.f27465d = yVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27462a) {
            case 0:
                return new d2(this.f27464c, this.f27465d, dVar, 0);
            case 1:
                return new d2(this.f27464c, this.f27465d, dVar, 1);
            case 2:
                return new d2(this.f27464c, this.f27465d, dVar, 2);
            case 3:
                return new d2(this.f27464c, this.f27465d, dVar, 3);
            case 4:
                return new d2(this.f27464c, this.f27465d, dVar, 4);
            default:
                return new d2(this.f27464c, this.f27465d, dVar, 5);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27462a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((d2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        switch (this.f27462a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27463b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var = this.f27464c;
                    dv.u0 u0Var = i3Var.f27611l;
                    String strW = ((o0) i3Var.f27600a).w();
                    String achievementXPExpert = ((UserInfo) this.f27465d.f38361a).getAchievementXPExpert();
                    this.f27463b = 1;
                    JsonObject jsonObjectC = ep.a.c("uid", strW);
                    jsonObjectC.add(u0Var.f24526e, u0Var.c());
                    jsonObjectC.addProperty("achiev_xpexpert", achievementXPExpert);
                    qy.l lVarY = nv.p.y(jsonObjectC, "toJson(...)", u0Var.a());
                    qy.l lVar = (qy.l) lVarY.f48496b;
                    if (u0Var.v((SecretKey) lVar.f48495a, (SecretKey) lVar.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataAchievementXPExpertSet$2
                    }, new BooleanResponse(false, 1, null), new dv.g0(u0Var, (JsonObject) lVarY.f48495a, null, 10), this) == aVar) {
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
                int i12 = this.f27463b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var2 = this.f27464c;
                    dv.u0 u0Var2 = i3Var2.f27611l;
                    String strW2 = ((o0) i3Var2.f27600a).w();
                    String achievementTopStudent = ((UserInfo) this.f27465d.f38361a).getAchievementTopStudent();
                    this.f27463b = 1;
                    JsonObject jsonObjectC2 = ep.a.c("uid", strW2);
                    jsonObjectC2.add(u0Var2.f24526e, u0Var2.c());
                    jsonObjectC2.addProperty("achiev_topstudent", achievementTopStudent);
                    qy.l lVarY2 = nv.p.y(jsonObjectC2, "toJson(...)", u0Var2.a());
                    qy.l lVar2 = (qy.l) lVarY2.f48496b;
                    if (u0Var2.v((SecretKey) lVar2.f48495a, (SecretKey) lVar2.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataAchievementTopStudentSet$2
                    }, new BooleanResponse(false, 1, null), new dv.g0(u0Var2, (JsonObject) lVarY2.f48495a, null, 9), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27463b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var3 = this.f27464c;
                    dv.u0 u0Var3 = i3Var3.f27611l;
                    String strW3 = ((o0) i3Var3.f27600a).w();
                    String achievementStreakHero = ((UserInfo) this.f27465d.f38361a).getAchievementStreakHero();
                    this.f27463b = 1;
                    JsonObject jsonObjectC3 = ep.a.c("uid", strW3);
                    jsonObjectC3.add(u0Var3.f24526e, u0Var3.c());
                    jsonObjectC3.addProperty("achiev_streakhero", achievementStreakHero);
                    qy.l lVarY3 = nv.p.y(jsonObjectC3, "toJson(...)", u0Var3.a());
                    qy.l lVar3 = (qy.l) lVarY3.f48496b;
                    if (u0Var3.v((SecretKey) lVar3.f48495a, (SecretKey) lVar3.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataAchievementStreakHeroSet$2
                    }, new BooleanResponse(false, 1, null), new dv.g0(u0Var3, (JsonObject) lVarY3.f48495a, null, 8), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f27463b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var4 = this.f27464c;
                    dv.u0 u0Var4 = i3Var4.f27611l;
                    String strW4 = ((o0) i3Var4.f27600a).w();
                    String achievementLeaderboard = ((UserInfo) this.f27465d.f38361a).getAchievementLeaderboard();
                    this.f27463b = 1;
                    JsonObject jsonObjectC4 = ep.a.c("uid", strW4);
                    jsonObjectC4.add(u0Var4.f24526e, u0Var4.c());
                    jsonObjectC4.addProperty("achiev_leaderboard", achievementLeaderboard);
                    qy.l lVarY4 = nv.p.y(jsonObjectC4, "toJson(...)", u0Var4.a());
                    qy.l lVar4 = (qy.l) lVarY4.f48496b;
                    if (u0Var4.v((SecretKey) lVar4.f48495a, (SecretKey) lVar4.f48496b, new TypeToken<ServerJsonResponse<BooleanResponse>>() { // from class: com.lingodeer.network.NetworkClient$meDataAchievementLeaderboardSet$2
                    }, new BooleanResponse(false, 1, null), new dv.g0(u0Var4, (JsonObject) lVarY4.f48495a, null, 7), this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f27463b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var5 = this.f27464c;
                    dv.u0 u0Var5 = i3Var5.f27611l;
                    String strW5 = ((o0) i3Var5.f27600a).w();
                    String skillMastery = ((UserInfo) this.f27465d.f38361a).getSkillMastery();
                    this.f27463b = 1;
                    if (u0Var5.n(strW5, skillMastery, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f27463b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i3 i3Var6 = this.f27464c;
                    dv.u0 u0Var6 = i3Var6.f27611l;
                    String strW6 = ((o0) i3Var6.f27600a).w();
                    String achievementLanguages = ((UserInfo) this.f27465d.f38361a).getAchievementLanguages();
                    this.f27463b = 1;
                    if (u0Var6.g(strW6, achievementLanguages, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
