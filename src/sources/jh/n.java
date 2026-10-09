package jh;

import a.ar.MFeWs;
import androidx.lifecycle.ViewModelKt;
import cf.x;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonDao;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.PdSentenceDao;
import com.lingo.lingoskill.object.PdTips;
import com.lingo.lingoskill.object.PdTipsDao;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.PdWordDao;
import fr.o0;
import java.util.ArrayList;
import java.util.List;
import rz.b0;
import rz.e0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdLesson f36371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f36372c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PdLesson pdLesson, o oVar, vy.d dVar) {
        super(2, dVar);
        this.f36371b = pdLesson;
        this.f36372c = oVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new n(this.f36371b, this.f36372c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String tipsIds;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36370a;
        o oVar = this.f36372c;
        PdLesson pdLesson = this.f36371b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            k10.g gVarQueryBuilder = PdLessonDbHelper.INSTANCE.pdSentenceDao().queryBuilder();
            gVarQueryBuilder.f(PdSentenceDao.Properties.LessonId.b(pdLesson.getLessonId()), PdSentenceDao.Properties.Lan.b(pdLesson.getLan()));
            List<PdSentence> listD = gVarQueryBuilder.d();
            kotlin.jvm.internal.m.e(listD, "list(...)");
            ArrayList arrayList = new ArrayList(ry.n.W(listD, 10));
            for (PdSentence pdSentence : listD) {
                pdSentence.setLessonId(pdLesson.getLessonId());
                Long[] lArrV = ew.a.v(pdSentence.getWordList());
                kotlin.jvm.internal.m.e(lArrV, "parseIdLst(...)");
                ArrayList arrayList2 = new ArrayList(lArrV.length);
                int length = lArrV.length;
                int i12 = 0;
                while (i12 < length) {
                    Long l9 = lArrV[i12];
                    PdWordDao pdWordDao = PdLessonDbHelper.INSTANCE.pdWordDao();
                    int[] iArr = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    int i13 = x.n().keyLanguage;
                    kotlin.jvm.internal.m.c(l9);
                    arrayList2.add((PdWord) pdWordDao.load(bq.m.l(i13, l9.longValue())));
                    i12++;
                    pdSentence = pdSentence;
                }
                pdSentence.setWords(arrayList2);
                arrayList.add(pdSentence);
            }
            PdLessonDao pdLessonDao = PdLessonDbHelper.INSTANCE.pdLessonDao();
            int[] iArr2 = bq.r.f4959a;
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            int i14 = x.n().keyLanguage;
            Long lessonId = pdLesson.getLessonId();
            kotlin.jvm.internal.m.e(lessonId, "getLessonId(...)");
            PdLesson pdLesson2 = (PdLesson) pdLessonDao.load(bq.m.l(i14, lessonId.longValue()));
            if (pdLesson2 != null && (tipsIds = pdLesson2.getTipsIds()) != null) {
                List listW0 = oz.q.W0(tipsIds, new String[]{";"}, 0, 6);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listW0) {
                    if (((String) obj2).length() > 0) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList3.get(i15);
                    i15++;
                    PdTipsDao pdTipsDao = PdLessonDbHelper.INSTANCE.pdTipsDao();
                    int[] iArr3 = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    PdTips pdTips = (PdTips) pdTipsDao.load(bq.m.l(x.n().keyLanguage, Long.parseLong((String) obj3)));
                    if (pdTips != null) {
                        arrayList4.add(pdTips);
                    }
                }
                pdLesson.setTipsIds(tipsIds);
                pdLesson.setTips(arrayList4);
            }
            pdLesson.setSentences(arrayList);
            String strI = ((o0) xt.b.c()).i();
            int[] iArr4 = bq.r.f4959a;
            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
            String str2 = bq.m.r(x.n().keyLanguage) + "_" + pdLesson.getLessonId();
            List listW1 = oz.q.W0(strI, new String[]{";"}, 0, 6);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : listW1) {
                if (((String) obj4).length() > 0) {
                    arrayList5.add(obj4);
                }
            }
            ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
            int size2 = arrayList5.size();
            int i16 = 0;
            while (true) {
                str = MFeWs.bfKcIUr;
                if (i16 >= size2) {
                    break;
                }
                Object obj5 = arrayList5.get(i16);
                i16++;
                arrayList6.add((String) oz.q.W0((String) obj5, new String[]{str}, 0, 6).get(1));
            }
            if (!arrayList6.contains(str2)) {
                n0 n0VarC = xt.b.c();
                String str3 = strI + (System.currentTimeMillis() / 1000) + str + str2 + ";";
                this.f36370a = 1;
                if (((o0) n0VarC).G(str3, this) == aVar) {
                    return aVar;
                }
            }
            kotlin.jvm.internal.m.f(pdLesson, "<set-?>");
            oVar.f36374b = pdLesson;
            List<PdSentence> sentences = pdLesson.getSentences();
            kotlin.jvm.internal.m.e(sentences, "getSentences(...)");
            sentences.isEmpty();
            return Boolean.TRUE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        e0.B(ViewModelKt.getViewModelScope(oVar), null, null, new m(oVar, null, 0), 3);
        kotlin.jvm.internal.m.f(pdLesson, "<set-?>");
        oVar.f36374b = pdLesson;
        List<PdSentence> sentences2 = pdLesson.getSentences();
        kotlin.jvm.internal.m.e(sentences2, "getSentences(...)");
        sentences2.isEmpty();
        return Boolean.TRUE;
    }
}
