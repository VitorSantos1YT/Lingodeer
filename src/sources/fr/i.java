package fr;

import android.content.Context;
import com.lingodeer.data.model.DayStreakStatus;
import com.lingodeer.data.model.UserInfo;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements vt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.h1 f27578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wt.b0 f27579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.k0 f27580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.c f27581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.n0 f27582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.m f27583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gu.a f27584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f27585h;

    public i(vt.h1 h1Var, wt.b0 b0Var, vt.k0 k0Var, vt.c cVar, vt.n0 n0Var, wt.m mVar, gu.a aVar, Context context) {
        this.f27578a = h1Var;
        this.f27579b = b0Var;
        this.f27580c = k0Var;
        this.f27581d = cVar;
        this.f27582e = n0Var;
        this.f27583f = mVar;
        this.f27584g = aVar;
        this.f27585h = context;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(i iVar, UserInfo userInfo, xy.c cVar) {
        h hVar;
        UserInfo userInfo2;
        int i11;
        UserInfo userInfo3;
        String str;
        Object objU;
        iVar.getClass();
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f27552e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f27552e = i12 - Integer.MIN_VALUE;
            } else {
                hVar = new h(iVar, cVar);
            }
        } else {
            hVar = new h(iVar, cVar);
        }
        Object objU2 = hVar.f27550c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = hVar.f27552e;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objU2);
            bh.i0 i0VarA = ((vt.z0) iVar.f27579b.f55236a).a();
            userInfo2 = userInfo;
            hVar.f27548a = userInfo2;
            hVar.f27552e = 1;
            objU2 = uz.x0.u(i0VarA, hVar);
            if (objU2 != aVar) {
            }
            return aVar;
        }
        if (i13 == 1) {
            userInfo2 = hVar.f27548a;
            com.bumptech.glide.e.F(objU2);
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(objU2);
                return objU2;
            }
            i11 = hVar.f27549b;
            userInfo3 = hVar.f27548a;
            com.bumptech.glide.e.F(objU2);
        }
        int dayStreak = ((DayStreakStatus) objU2).getDayStreak();
        str = (String) o00.a.u(i11, userInfo3.getAchievementTopStudent()).f48495a;
        String str2 = (String) o00.a.t(dayStreak, userInfo3.getAchievementStreakHero()).f48495a;
        UserInfo userInfoCopy$default = UserInfo.copy$default(userInfo3, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, str, null, str2, null, null, null, null, 0, 0, 0, i11, dayStreak, 0, null, null, 30403583, null);
        if (!kotlin.jvm.internal.m.a(str, userInfo3.getAchievementTopStudent()) && kotlin.jvm.internal.m.a(str2, userInfo3.getAchievementStreakHero())) {
            return userInfoCopy$default;
        }
        vt.h1 h1Var = iVar.f27578a;
        au.p0 p0Var = new au.p0(i11, dayStreak, 1);
        hVar.f27548a = null;
        hVar.f27549b = i11;
        hVar.f27552e = 3;
        objU = ((x4) h1Var).u(p0Var, hVar);
        if (objU != aVar) {
            return aVar;
        }
        return objU;
        int size = ((Collection) objU2).size();
        gp.r rVarA = ((gu.f) iVar.f27584g).a();
        hVar.f27548a = userInfo2;
        hVar.f27549b = size;
        hVar.f27552e = 2;
        Object objU3 = uz.x0.u(rVarA, hVar);
        if (objU3 != aVar) {
            UserInfo userInfo4 = userInfo2;
            i11 = size;
            objU2 = objU3;
            userInfo3 = userInfo4;
            int dayStreak2 = ((DayStreakStatus) objU2).getDayStreak();
            str = (String) o00.a.u(i11, userInfo3.getAchievementTopStudent()).f48495a;
            String str3 = (String) o00.a.t(dayStreak2, userInfo3.getAchievementStreakHero()).f48495a;
            UserInfo userInfoCopy$default2 = UserInfo.copy$default(userInfo3, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, str, null, str3, null, null, null, null, 0, 0, 0, i11, dayStreak2, 0, null, null, 30403583, null);
            if (!kotlin.jvm.internal.m.a(str, userInfo3.getAchievementTopStudent())) {
            }
            vt.h1 h1Var2 = iVar.f27578a;
            au.p0 p0Var2 = new au.p0(i11, dayStreak2, 1);
            hVar.f27548a = null;
            hVar.f27549b = i11;
            hVar.f27552e = 3;
            objU = ((x4) h1Var2).u(p0Var2, hVar);
            if (objU != aVar) {
                return objU;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(String str, String str2, xy.c cVar) {
        d dVar;
        kotlin.jvm.internal.u uVar;
        long j11;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f27454e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f27454e = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f27452c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = dVar2.f27454e;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            d0.s sVar = new d0.s(str2, uVar2, jCurrentTimeMillis, str, this);
            dVar2.f27450a = uVar2;
            dVar2.f27451b = jCurrentTimeMillis;
            dVar2.f27454e = 1;
            if (((x4) this.f27578a).u(sVar, dVar2) != aVar) {
                uVar = uVar2;
                j11 = jCurrentTimeMillis;
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        j11 = dVar2.f27451b;
        uVar = dVar2.f27450a;
        com.bumptech.glide.e.F(obj);
        if (uVar.f38357a) {
            dVar2.f27450a = null;
            dVar2.f27451b = j11;
            dVar2.f27454e = 2;
            ((vt.d) this.f27581d).n(dVar2);
            if (b0Var == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }
}
