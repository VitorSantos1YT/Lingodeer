package gu;

import androidx.lifecycle.ViewModelKt;
import bh.r;
import bp.g2;
import com.lingodeer.data.model.DailyStreakHistory;
import com.lingodeer.data.model.LearnProgress;
import com.lingodeer.data.model.UserInfo;
import d1.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import mv.x;
import n9.j0;
import ot.d0;
import oz.o;
import ph.a0;
import ph.t;
import ph.w;
import qy.b0;
import qy.l;
import rt.dd;
import rt.e3;
import rt.r8;
import ry.n;
import rz.e0;
import rz.o0;
import uz.i1;
import uz.j;
import uz.l0;
import uz.x0;
import vt.n0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f29849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, Object obj, Object obj2, vy.d dVar) {
        super(3, dVar);
        this.f29844a = i11;
        this.f29848e = obj;
        this.f29849f = obj2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29844a) {
            case 0:
                d dVar = new d((f) this.f29849f, (vy.d) obj3);
                dVar.f29847d = (List) obj;
                dVar.f29848e = (UserInfo) obj2;
                return dVar.invokeSuspend(b0.f48488a);
            case 1:
                int i11 = 1;
                d dVar2 = new d(i11, (a0) this.f29848e, (mh.b) this.f29849f, (vy.d) obj3);
                dVar2.f29846c = (j) obj;
                dVar2.f29847d = obj2;
                return dVar2.invokeSuspend(b0.f48488a);
            case 2:
                int i12 = 2;
                d dVar3 = new d(i12, (vt.e) this.f29848e, (n0) this.f29849f, (vy.d) obj3);
                dVar3.f29846c = (j) obj;
                dVar3.f29847d = obj2;
                return dVar3.invokeSuspend(b0.f48488a);
            case 3:
                d dVar4 = new d((e3) this.f29848e, (vy.d) obj3);
                dVar4.f29846c = (j) obj;
                dVar4.f29847d = obj2;
                return dVar4.invokeSuspend(b0.f48488a);
            default:
                int i13 = 4;
                d dVar5 = new d(i13, (dd) this.f29848e, (n0) this.f29849f, (vy.d) obj3);
                dVar5.f29846c = (j) obj;
                dVar5.f29847d = obj2;
                return dVar5.invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x02a5 A[LOOP:0: B:89:0x029f->B:91:0x02a5, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x02a5, please report this as an issue */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayListO;
        Object objM;
        Object objM2;
        ArrayList arrayList;
        j jVar;
        Object objU;
        int i11 = this.f29844a;
        b0 b0Var = b0.f48488a;
        int i12 = 2;
        vy.d dVar = null;
        switch (i11) {
            case 0:
                List list = (List) this.f29847d;
                UserInfo userInfo = (UserInfo) this.f29848e;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f29845b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        ArrayList arrayList2 = (ArrayList) this.f29846c;
                        com.bumptech.glide.e.F(obj);
                        arrayListO = arrayList2;
                        objM = obj;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        objM2 = obj;
                    }
                    l lVar = (l) objM2;
                    List<DailyStreakHistory> list2 = (List) lVar.f48495a;
                    int iIntValue = ((Number) lVar.f48496b).intValue();
                    arrayList = new ArrayList(n.W(list2, 10));
                    for (DailyStreakHistory dailyStreakHistory : list2) {
                        arrayList.add(dailyStreakHistory.getId() + ":" + dailyStreakHistory.getType());
                    }
                    arrayList.toString();
                    return new l(list2, new Integer(iIntValue));
                }
                arrayListO = ep.a.o(obj);
                for (Object obj2 : list) {
                    if (!m.a(((DailyStreakHistory) obj2).getId(), "olddata")) {
                        arrayListO.add(obj2);
                    }
                }
                yz.f fVar = o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                g2 g2Var = new g2(i12, 25, dVar);
                this.f29847d = null;
                this.f29848e = userInfo;
                this.f29846c = arrayListO;
                this.f29845b = 1;
                objM = e0.M(eVar, g2Var, this);
                if (objM == aVar) {
                    return aVar;
                }
                String str = (String) objM;
                int streakSaver = userInfo.getStreakSaver();
                boolean zIsUnloginUser = ((fr.o0) ((f) this.f29849f).f29859c).f27733a.isUnloginUser();
                o oVar = h.f29861a;
                if (zIsUnloginUser && streakSaver == 0) {
                    streakSaver = 2;
                }
                int iL = hz.b.l(streakSaver, 0, 2);
                ArrayList arrayListC1 = ry.m.c1(arrayListO);
                m.c(str);
                this.f29847d = null;
                this.f29848e = null;
                this.f29846c = null;
                this.f29845b = 2;
                yz.f fVar2 = o0.f50940a;
                objM2 = e0.M(yz.e.f58387a, new b(arrayListC1, str, iL, (vy.d) null), this);
                if (objM2 == aVar) {
                    return aVar;
                }
                l lVar2 = (l) objM2;
                List<DailyStreakHistory> list3 = (List) lVar2.f48495a;
                int iIntValue2 = ((Number) lVar2.f48496b).intValue();
                arrayList = new ArrayList(n.W(list3, 10));
                while (r4.hasNext()) {
                    arrayList.add(dailyStreakHistory.getId() + ":" + dailyStreakHistory.getType());
                }
                arrayList.toString();
                return new l(list3, new Integer(iIntValue2));
            case 1:
                a0 a0Var = (a0) this.f29848e;
                mh.b bVar = (mh.b) this.f29849f;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f29845b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                j jVar2 = (j) this.f29846c;
                boolean zBooleanValue = ((Boolean) this.f29847d).booleanValue();
                int i15 = 4;
                no.g gVar = new no.g(new w(n9.m.a(new j0(new s0(new t(bVar, a0Var, zBooleanValue), dVar, i15), new c7.j(5, 3)).f43607e, ViewModelKt.getViewModelScope(a0Var)), bVar, a0Var, zBooleanValue), a0Var.f46843d, new x(bVar, dVar, 3));
                i1 i1Var = a0Var.f46844e;
                x xVar = new x(bVar, dVar, i15);
                this.f29846c = null;
                this.f29847d = null;
                this.f29845b = 1;
                x0.s(jVar2);
                Object objA = vz.b.a(uz.n0.f53370a, new l0(xVar, (vy.d) null), jVar2, this, new uz.i[]{gVar, i1Var});
                if (objA != wy.a.COROUTINE_SUSPENDED) {
                    objA = b0Var;
                }
                if (objA != wy.a.COROUTINE_SUSPENDED) {
                    objA = b0Var;
                }
                return objA == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f29845b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                j jVar3 = (j) this.f29846c;
                r rVarB = ((fr.r) ((vt.e) this.f29848e)).b(xt.d.k(((fr.o0) ((n0) this.f29849f)).f27733a.keyLanguage), "ack");
                this.f29846c = null;
                this.f29847d = null;
                this.f29845b = 1;
                return x0.q(jVar3, rVarB, this) == aVar3 ? aVar3 : b0Var;
            case 3:
                e3 e3Var = (e3) this.f29848e;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f29845b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    jVar = (j) this.f29846c;
                    ((Boolean) this.f29847d).getClass();
                    wt.o0 o0Var = e3Var.f49667o0;
                    o0Var.getClass();
                    gp.r rVar = new gp.r(new sr.d(o0Var, dVar, 26));
                    this.f29846c = null;
                    this.f29847d = null;
                    this.f29849f = jVar;
                    this.f29845b = 1;
                    objU = x0.u(rVar, this);
                    if (objU != aVar4) {
                    }
                    return aVar4;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                jVar = (j) this.f29849f;
                com.bumptech.glide.e.F(obj);
                objU = obj;
                LearnProgress learnProgress = (LearnProgress) objU;
                ot.e0 e0Var = e3Var.f49669q0;
                List reviews = e3Var.f49673u0;
                r8 r8Var = e3Var.f49674v0;
                e0Var.getClass();
                m.f(reviews, "reviews");
                m.f(learnProgress, "learnProgress");
                gp.r rVar2 = new gp.r(new d0(learnProgress, r8Var, reviews, r8Var != r8.SPEAKING, true, e0Var, null));
                yz.f fVar3 = o0.f50940a;
                uz.i iVarW = x0.w(rVar2, yz.e.f58387a);
                this.f29846c = null;
                this.f29847d = null;
                this.f29849f = null;
                this.f29845b = 2;
                if (x0.q(jVar, iVarW, this) != aVar4) {
                    return b0Var;
                }
                return aVar4;
            default:
                dd ddVar = (dd) this.f29848e;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f29845b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                j jVar4 = (j) this.f29846c;
                String str2 = (String) this.f29847d;
                i1 i1Var2 = ddVar.V;
                i1Var2.getClass();
                i1Var2.l(null, ry.r.f50854a);
                uz.i rVar3 = str2.length() == 0 ? new gp.r(new ds.e(i12, 8, dVar)) : ddVar.I((n0) this.f29849f, ddVar.f49644u0, ddVar.f49646w0, str2, ddVar.f49647x0, ddVar.f49648y0);
                this.f29846c = null;
                this.f29847d = null;
                this.f29845b = 1;
                return x0.q(jVar4, rVar3, this) == aVar5 ? aVar5 : b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, vy.d dVar) {
        super(3, dVar);
        this.f29844a = 0;
        this.f29849f = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e3 e3Var, vy.d dVar) {
        super(3, dVar);
        this.f29844a = 3;
        this.f29848e = e3Var;
    }
}
