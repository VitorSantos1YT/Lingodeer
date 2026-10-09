package gh;

import bq.r;
import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.object.PdWordFav;
import com.lingo.lingoskill.object.PdWordFavDao;
import java.util.ArrayList;
import java.util.List;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f29196a;

    public static void a(String id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
        PdLessonFav pdLessonFav = (PdLessonFav) pdLessonDbHelper.pdLessonFavDao().load(id2);
        if (pdLessonFav != null) {
            pdLessonFav.setFav(1);
            pdLessonFav.setTime(Long.valueOf(System.currentTimeMillis()));
            pdLessonDbHelper.pdLessonFavDao().insertOrReplace(pdLessonFav);
        } else {
            PdLessonFav pdLessonFav2 = new PdLessonFav();
            pdLessonFav2.setId(id2);
            pdLessonFav2.setFav(1);
            pdLessonFav2.setTime(Long.valueOf(System.currentTimeMillis()));
            pdLessonDbHelper.pdLessonFavDao().insertOrReplace(pdLessonFav2);
        }
    }

    public static void b(String str) {
        PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
        PdWordFav pdWordFav = (PdWordFav) pdLessonDbHelper.pdWordFavDao().load(str);
        if (pdWordFav != null) {
            pdWordFav.setFav(1);
            pdWordFav.setTime(Long.valueOf(System.currentTimeMillis()));
            pdLessonDbHelper.pdWordFavDao().insertOrReplace(pdWordFav);
        } else {
            PdWordFav pdWordFav2 = new PdWordFav();
            pdWordFav2.setId(str);
            pdWordFav2.setFav(1);
            pdWordFav2.setTime(Long.valueOf(System.currentTimeMillis()));
            pdLessonDbHelper.pdWordFavDao().insertOrReplace(pdWordFav2);
        }
    }

    public static ArrayList c() {
        k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdWordFavDao().queryBuilder();
        org.greenrobot.greendao.d dVar = PdWordFavDao.Properties.Id;
        int[] iArr = r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        gVarQueryBuilder.f(dVar.e(bq.m.k(x.n().keyLanguage).concat("%")), PdWordFavDao.Properties.Fav.b(1));
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        List listS0 = ry.m.S0(listD, new b4.e(27));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS0) {
            String id2 = ((PdWordFav) obj).getId();
            kotlin.jvm.internal.m.e(id2, "getId(...)");
            if (!q.v0(id2, "oc", false)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean d(String id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        PdWordFav pdWordFav = (PdWordFav) PdLessonDbHelper.INSTANCE.pdWordFavDao().load(id2);
        return pdWordFav != null && pdWordFav.getFav() == 1;
    }

    public static void e(String id2) {
        kotlin.jvm.internal.m.f(id2, "id");
        PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
        PdLessonFav pdLessonFav = (PdLessonFav) pdLessonDbHelper.pdLessonFavDao().load(id2);
        if (pdLessonFav != null) {
            pdLessonFav.setTime(Long.valueOf(System.currentTimeMillis()));
            pdLessonFav.setFav(0);
            pdLessonDbHelper.pdLessonFavDao().insertOrReplace(pdLessonFav);
        }
    }

    public static void f(String str) {
        PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
        PdWordFav pdWordFav = (PdWordFav) pdLessonDbHelper.pdWordFavDao().load(str);
        if (pdWordFav != null) {
            pdWordFav.setTime(Long.valueOf(System.currentTimeMillis()));
            pdWordFav.setFav(0);
            pdLessonDbHelper.pdWordFavDao().insertOrReplace(pdWordFav);
        }
    }
}
