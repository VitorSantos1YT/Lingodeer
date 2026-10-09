package ph;

import androidx.lifecycle.ViewModelKt;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.object.PdLessonFavDao;
import java.util.ArrayList;
import rz.b0;
import rz.e0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdLesson f46910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f46911c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(PdLesson pdLesson, s sVar, vy.d dVar) {
        super(2, dVar);
        this.f46910b = pdLesson;
        this.f46911c = sVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new r(this.f46910b, this.f46911c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int size;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f46909a;
        s sVar = this.f46911c;
        PdLesson pdLesson = this.f46910b;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                String str = bq.m.k(cf.x.n().keyLanguage) + "_" + pdLesson.getLessonId();
                PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
                k10.g gVarQueryBuilder = pdLessonDbHelper.pdLessonFavDao().queryBuilder();
                gVarQueryBuilder.f(PdLessonFavDao.Properties.Id.b(str), new k10.h[0]);
                StringBuilder sbC = gVarQueryBuilder.c();
                ArrayList arrayList = gVarQueryBuilder.f37852c;
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
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (pdLessonFav != null) {
                    pdLessonFav.setFav(pdLessonFav.getFav() == 1 ? 0 : 1);
                    pdLessonFav.setTime(new Long(jCurrentTimeMillis));
                    pdLessonDbHelper.pdLessonFavDao().update(pdLessonFav);
                } else {
                    PdLessonFav pdLessonFav2 = new PdLessonFav();
                    pdLessonFav2.setId(str);
                    pdLessonFav2.setFav(1);
                    pdLessonFav2.setTime(new Long(jCurrentTimeMillis));
                    new Long(pdLessonDbHelper.pdLessonFavDao().insert(pdLessonFav2));
                }
                vt.c cVar = sVar.f46912a;
                Long lessonId = pdLesson.getLessonId();
                kotlin.jvm.internal.m.e(lessonId, "getLessonId(...)");
                long jLongValue = lessonId.longValue();
                this.f46909a = 1;
                if (((vt.d) cVar).g(jLongValue, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            e0.B(ViewModelKt.getViewModelScope(sVar), null, null, new q(pdLesson, sVar, null), 3);
        } catch (Exception e8) {
            i1 i1Var = sVar.f46913b;
            p pVarA = p.a((p) i1Var.getValue(), null, false, ep.a.e("更新收藏状态失败: ", e8.getMessage()), 7);
            i1Var.getClass();
            i1Var.l(null, pVarA);
        }
        return qy.b0.f48488a;
    }
}
