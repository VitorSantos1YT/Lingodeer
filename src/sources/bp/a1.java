package bp;

import android.content.Context;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.database.model.LanguageHistoryEntity;
import h1.d8;
import h1.m9;
import h1.n9;
import h1.o9;
import java.util.List;
import java.util.Map;
import rt.ed;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements fz.g {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4477a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f4479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4482f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4483t;

    public a1(List list, Map map, vt.n0 n0Var, List list2, l1.b1 b1Var, gp.m mVar, fz.c cVar, Context context) {
        this.f4478b = list;
        this.f4482f = map;
        this.f4483t = n0Var;
        this.f4481e = list2;
        this.f4480d = b1Var;
        this.H = mVar;
        this.K = cVar;
        this.f4479c = context;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        int iQ;
        int i11 = this.f4477a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj6 = this.K;
        Object obj7 = this.H;
        l1.g gVar = l1.m.f39353a;
        Object obj8 = this.f4481e;
        List list = this.f4478b;
        Object obj9 = this.f4483t;
        Object obj10 = this.f4482f;
        switch (i11) {
            case 0:
                l0.c cVar = (l0.c) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                vt.n0 n0Var = (vt.n0) obj9;
                int i12 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((l1.s) nVar).f(cVar) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i12 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(i12 & 1, (i12 & 147) != 146)) {
                    sVar.W();
                } else {
                    LanguageHistoryEntity languageHistoryEntity = (LanguageHistoryEntity) list.get(iIntValue);
                    sVar.d0(1291347551);
                    boolean zF = sVar.f(languageHistoryEntity);
                    Object objQ = sVar.Q();
                    if (zF || objQ == gVar) {
                        obj5 = objQ;
                        LanguageItem languageItem = new LanguageItem(languageHistoryEntity.getKeyLanguage(), languageHistoryEntity.getLocate(), languageHistoryEntity.getTitle());
                        languageItem.setDescription(languageHistoryEntity.getDescription());
                        sVar.o0(languageItem);
                        obj5 = languageItem;
                    }
                    LanguageItem languageItem2 = (LanguageItem) obj5;
                    Float f5 = (Float) ((Map) obj10).get(Integer.valueOf(languageHistoryEntity.getKeyLanguage()));
                    Integer numValueOf = null;
                    if (f5 != null && (iQ = hz.b.Q(f5.floatValue() * 100)) > 0) {
                        numValueOf = Integer.valueOf(iQ);
                    }
                    Integer num = numValueOf;
                    fr.o0 o0Var = (fr.o0) n0Var;
                    Env env = o0Var.f27733a;
                    Env env2 = o0Var.f27733a;
                    boolean zD = sVar.d(env.fluentLanguage) | sVar.f(languageHistoryEntity) | sVar.d(env.keyLanguage) | sVar.d(env.locateLanguage) | sVar.d(env.scLanguage) | sVar.d(env.handWriteLanguage);
                    Object objQ2 = sVar.Q();
                    if (zD || objQ2 == gVar) {
                        objQ2 = Boolean.valueOf((env2.keyLanguage == languageHistoryEntity.getKeyLanguage() && env2.locateLanguage == languageHistoryEntity.getLocate() && env2.fluentLanguage == -1 && env2.scLanguage == -1 && env2.handWriteLanguage == -1) || (env2.fluentLanguage == languageHistoryEntity.getKeyLanguage() && env2.locateLanguage == languageHistoryEntity.getLocate()) || ((env2.scLanguage == languageHistoryEntity.getKeyLanguage() && env2.locateLanguage == languageHistoryEntity.getLocate()) || (env2.handWriteLanguage == languageHistoryEntity.getKeyLanguage() && env2.locateLanguage == languageHistoryEntity.getLocate())));
                        sVar.o0(objQ2);
                    }
                    boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
                    boolean z11 = ((List) obj8).size() > 1 && !zBooleanValue;
                    boolean zG = sVar.g(z11) | sVar.h(languageHistoryEntity);
                    Object objQ3 = sVar.Q();
                    if (zG || objQ3 == gVar) {
                        objQ3 = new z0(z11, languageHistoryEntity, this.f4480d);
                        sVar.o0(objQ3);
                    }
                    fz.c cVar2 = (fz.c) objQ3;
                    float f11 = m9.f30695a;
                    o9 o9Var = o9.Settled;
                    sVar.d0(-1853326336);
                    l1.c3 c3Var = z2.g1.f58547h;
                    v3.c cVar3 = (v3.c) sVar.j(c3Var);
                    boolean zF2 = sVar.f(cVar3);
                    Object objQ4 = sVar.Q();
                    if (zF2 || objQ4 == gVar) {
                        objQ4 = new d8(cVar3, 1);
                        sVar.o0(objQ4);
                    }
                    fz.c cVar4 = (fz.c) objQ4;
                    sVar.p(false);
                    v3.c cVar5 = (v3.c) sVar.j(c3Var);
                    Object[] objArr = new Object[0];
                    qp.o2 o2Var = new qp.o2(6, h1.x1.W, new a0.j(cVar5, cVar2, cVar4, 10));
                    boolean zF3 = sVar.f(o9Var) | sVar.f(cVar5) | sVar.f(cVar2) | sVar.f(cVar4);
                    Object objQ5 = sVar.Q();
                    if (zF3 || objQ5 == gVar) {
                        androidx.fragment.app.p pVar = new androidx.fragment.app.p(o9Var, cVar5, cVar2, cVar4, 5);
                        sVar.o0(pVar);
                        objQ5 = pVar;
                    }
                    boolean z12 = z11;
                    m9.a((n9) w1.j.e(objArr, o2Var, (fz.a) objQ5, sVar, 0, 4), null, false, z12, false, t1.e.d(-452684265, new y0(this.f4479c, languageItem2, languageHistoryEntity, (fz.c) obj6, (gp.m) obj7, num, this.f4480d, zBooleanValue, z12), sVar), sVar, 1575984);
                    sVar.p(false);
                }
                break;
            default:
                l0.c cVar6 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i13 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((l1.s) nVar2).f(cVar6) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i13 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(i13 & 1, (i13 & 147) != 146)) {
                    sVar2.W();
                } else {
                    CourseLesson courseLesson = (CourseLesson) list.get(iIntValue3);
                    sVar2.d0(-415200087);
                    ed edVar = (ed) obj8;
                    boolean zH = sVar2.h(courseLesson) | sVar2.f((fz.e) obj10) | sVar2.f((fz.a) obj9) | sVar2.h(this.f4479c);
                    Object objQ6 = sVar2.Q();
                    if (zH || objQ6 == gVar) {
                        objQ6 = new ys.a2(courseLesson, (fz.e) obj10, this.f4480d, (l1.b1) obj7, (l1.b1) obj6, (fz.a) obj9, this.f4479c, 0);
                        sVar2.o0(objQ6);
                    }
                    at.b.c(courseLesson, edVar, (fz.c) objQ6, sVar2, 0);
                    sVar2.p(false);
                }
                break;
        }
        return b0Var;
    }

    public a1(List list, ed edVar, fz.e eVar, fz.a aVar, Context context, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3) {
        this.f4478b = list;
        this.f4481e = edVar;
        this.f4482f = eVar;
        this.f4483t = aVar;
        this.f4479c = context;
        this.f4480d = b1Var;
        this.H = b1Var2;
        this.K = b1Var3;
    }
}
