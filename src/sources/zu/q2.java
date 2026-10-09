package zu;

import com.lingodeer.data.model.AchievementLanguage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q2 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f59538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f59539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f59540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ List f59541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2 f59542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(s2 s2Var, vy.d dVar) {
        super(4, dVar);
        this.f59542e = s2Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        q2 q2Var = new q2(this.f59542e, (vy.d) obj4);
        q2Var.f59539b = (List) obj;
        q2Var.f59540c = (List) obj2;
        q2Var.f59541d = (List) obj3;
        return q2Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        vt.n0 n0Var = this.f59542e.f59559e;
        List list = this.f59539b;
        List list2 = this.f59540c;
        List list3 = this.f59541d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f59538a;
        Object obj2 = null;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            gh.d dVar = new gh.d(list, null, 4);
            this.f59539b = list;
            this.f59540c = list2;
            this.f59541d = list3;
            this.f59538a = 1;
            obj = rz.e0.M(eVar, dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        ArrayList arrayListC1 = ry.m.c1(ry.m.S0(list3, new ua.e(15)));
        int size = arrayListC1.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj3 = arrayListC1.get(i13);
            i13++;
            if (((AchievementLanguage) obj3).getLanguage().c() == ((fr.o0) n0Var).f27733a.keyLanguage) {
                obj2 = obj3;
                break;
            }
        }
        AchievementLanguage achievementLanguage = (AchievementLanguage) obj2;
        Collection collectionK = achievementLanguage != null ? ns.o.K(achievementLanguage) : ry.r.f50854a;
        ArrayList arrayList = new ArrayList();
        int size2 = arrayListC1.size();
        while (i12 < size2) {
            Object obj4 = arrayListC1.get(i12);
            i12++;
            if (((AchievementLanguage) obj4).getLanguage().c() != ((fr.o0) n0Var).f27733a.keyLanguage) {
                arrayList.add(obj4);
            }
        }
        return new s(list, list2, ry.m.H0(collectionK, arrayList), iIntValue);
    }
}
