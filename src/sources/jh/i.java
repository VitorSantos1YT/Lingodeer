package jh;

import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdTips;
import com.lingo.lingoskill.object.PdTipsDao;
import fr.o0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36358b;

    public /* synthetic */ i(String str, int i11) {
        this.f36357a = i11;
        this.f36358b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i11 = this.f36357a;
        String str = this.f36358b;
        switch (i11) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = nz.n.Z(new nz.c(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new th.i()), new st.a(14)), new st.a(15), 0)).iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Number) it.next()).longValue();
                    k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdTipsDao().queryBuilder();
                    k10.h hVarE = PdTipsDao.Properties.LessonIds.e("%;" + jLongValue + ";%");
                    org.greenrobot.greendao.d dVar = PdTipsDao.Properties.Lan;
                    int[] iArr = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    gVarQueryBuilder.f(hVarE, dVar.b(bq.m.k(x.n().keyLanguage)));
                    arrayList.addAll(gVarQueryBuilder.d());
                }
                Collections.reverse(arrayList);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    if (hashSet.add(((PdTips) obj).getCardId())) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayListC1 = ry.m.c1(arrayList2);
                Collections.reverse(arrayListC1);
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayListC1.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayListC1.get(i13);
                    i13++;
                    String cardName = ((PdTips) obj2).getCardName();
                    kotlin.jvm.internal.m.e(cardName, "getCardName(...)");
                    if (oz.q.v0(cardName, str, false)) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 1:
                int[] iArr2 = bq.r.f4959a;
                return bq.m.n(str);
            case 2:
                int[] iArr3 = bq.r.f4959a;
                return bq.m.n(str);
            case 3:
                int[] iArr4 = bq.r.f4959a;
                return bq.m.n(str);
            case 4:
                int[] iArr5 = bq.r.f4959a;
                return bq.m.n(str);
            default:
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                return Boolean.valueOf(new File(defpackage.e.m(x.n().tempDir, str)).exists());
        }
    }
}
