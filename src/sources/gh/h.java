package gh;

import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonDao;
import fr.o0;
import java.util.ArrayList;
import java.util.List;
import ry.p;
import ry.r;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.i implements fz.e {
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new h(2, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int size;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        try {
            ArrayList arrayList = new ArrayList();
            List list = uh.a.f52967a;
            for (Long l9 : c.a.n()) {
                long jLongValue = l9.longValue();
                k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdLessonDao().queryBuilder();
                gVarQueryBuilder.f(PdLessonDao.Properties.Lan.b(xt.d.k(((o0) xt.b.c()).f27733a.keyLanguage)), PdLessonDao.Properties.LessonId.b(new Long(jLongValue)));
                StringBuilder sbC = gVarQueryBuilder.c();
                ArrayList arrayList2 = gVarQueryBuilder.f37852c;
                if (gVarQueryBuilder.f37855f != null) {
                    sbC.append(" LIMIT ?");
                    arrayList2.add(gVarQueryBuilder.f37855f);
                    size = arrayList2.size() - 1;
                } else {
                    size = -1;
                }
                k10.f fVar = (k10.f) new k10.c(gVarQueryBuilder.f37854e, sbC.toString(), k10.a.b(arrayList2.toArray()), size).b();
                fVar.a();
                PdLesson pdLesson = (PdLesson) ((org.greenrobot.greendao.a) fVar.f37841b.f40184b).loadUniqueAndCloseCursor(fVar.f37840a.getDatabase().d(fVar.f37842c, fVar.f37843d));
                if (pdLesson != null) {
                    arrayList.add(pdLesson);
                }
            }
            if (arrayList.size() > 1) {
                p.Z(arrayList, new b4.e(28));
            }
            arrayList.size();
            return arrayList;
        } catch (Exception unused) {
            return r.f50854a;
        }
    }
}
