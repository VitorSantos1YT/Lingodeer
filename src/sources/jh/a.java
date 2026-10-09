package jh;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.object.PdLessonFavDao;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData f36338a = new MutableLiveData();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData f36339b;

    public a() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdLessonFavDao().queryBuilder();
        org.greenrobot.greendao.d dVar = PdLessonFavDao.Properties.Id;
        int[] iArr = bq.r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        gVarQueryBuilder.f(dVar.e(bq.m.k(x.n().keyLanguage).concat("%")), PdLessonFavDao.Properties.Fav.b(1));
        gVarQueryBuilder.e(" DESC", PdLessonFavDao.Properties.Time);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            String id2 = ((PdLessonFav) obj).getId();
            kotlin.jvm.internal.m.e(id2, "getId(...)");
            if (!oz.q.v0(id2, "oc", false)) {
                arrayList.add(obj);
            }
        }
        mutableLiveData.setValue(arrayList);
        this.f36339b = mutableLiveData;
    }
}
