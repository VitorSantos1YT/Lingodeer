package ph;

import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.object.PdLessonFavDao;
import java.util.ArrayList;
import rz.b0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PdLesson f46907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f46908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PdLesson pdLesson, s sVar, vy.d dVar) {
        super(2, dVar);
        this.f46907a = pdLesson;
        this.f46908b = sVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new q(this.f46907a, this.f46908b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        q qVar = (q) create((b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        qVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int size;
        i1 i1Var = this.f46908b.f46913b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        try {
            int[] iArr = bq.r.f4959a;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String str = bq.m.k(cf.x.n().keyLanguage) + "_" + this.f46907a.getLessonId();
            k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdLessonFavDao().queryBuilder();
            gVarQueryBuilder.f(PdLessonFavDao.Properties.Id.b(str), new k10.h[0]);
            StringBuilder sbC = gVarQueryBuilder.c();
            ArrayList arrayList = gVarQueryBuilder.f37852c;
            boolean z11 = true;
            if (gVarQueryBuilder.f37855f != null) {
                sbC.append(" LIMIT ?");
                arrayList.add(gVarQueryBuilder.f37855f);
                size = arrayList.size() - 1;
            } else {
                size = -1;
            }
            k10.f fVar = (k10.f) new k10.c(gVarQueryBuilder.f37854e, sbC.toString(), k10.a.b(arrayList.toArray()), size).b();
            fVar.a();
            PdLessonFav pdLessonFav = (PdLessonFav) ((org.greenrobot.greendao.a) fVar.f37841b.f40184b).loadUniqueAndCloseCursor(fVar.f37840a.getDatabase().d(fVar.f37842c, fVar.f37843d));
            if (pdLessonFav == null || pdLessonFav.getFav() != 1) {
                z11 = false;
            }
            p pVarA = p.a((p) i1Var.getValue(), null, z11, null, 3);
            i1Var.getClass();
            i1Var.l(null, pVarA);
        } catch (Exception e8) {
            p pVarA2 = p.a((p) i1Var.getValue(), null, false, ep.a.e("检查收藏状态失败: ", e8.getMessage()), 7);
            i1Var.getClass();
            i1Var.l(null, pVarA2);
        }
        return qy.b0.f48488a;
    }
}
