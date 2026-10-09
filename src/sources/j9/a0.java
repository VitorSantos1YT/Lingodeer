package j9;

import android.view.View;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.github.javiersantos.piracychecker.PiracyChecker;
import com.google.api.Service;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.learn.BaseSmartTipsActivity;
import com.lingo.lingoskill.ui.learn.GenFilterSentenceIdActivity;
import com.lingo.story.ui.StoryActivity;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.chinesetone.ChineseToneLevel;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jt.k2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36181a;

    public /* synthetic */ a0(int i11) {
        this.f36181a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f36181a) {
            case 0:
                z zVar = (z) obj;
                kotlin.jvm.internal.m.f(zVar, scNRoQgKSYX.GDjuIGk);
                zVar.f36278b = true;
                return qy.b0.f48488a;
            case 1:
                String lessonItem = (String) obj;
                kotlin.jvm.internal.m.f(lessonItem, "lessonItem");
                int[] iArr = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return Boolean.valueOf(oz.q.v0(lessonItem, bq.m.r(cf.x.n().keyLanguage), false));
            case 2:
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return Long.valueOf(Long.parseLong((String) oz.q.W0((CharSequence) oz.q.W0(it, new String[]{":"}, 0, 6).get(1), new String[]{"_"}, 0, 6).get(1)));
            case 3:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return qy.b0.f48488a;
            case 4:
                m0.t item = (m0.t) obj;
                int i11 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item, "$this$item");
                return new m0.d(ob.f.a(5));
            case 5:
                m0.t item2 = (m0.t) obj;
                int i12 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item2, "$this$item");
                return new m0.d(ob.f.a(5));
            case 6:
                m0.t item3 = (m0.t) obj;
                int i13 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item3, "$this$item");
                return new m0.d(ob.f.a(5));
            case 7:
                m0.t item4 = (m0.t) obj;
                int i14 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item4, "$this$item");
                return new m0.d(ob.f.a(5));
            case 8:
                m0.t item5 = (m0.t) obj;
                int i15 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item5, "$this$item");
                return new m0.d(ob.f.a(5));
            case 9:
                m0.t item6 = (m0.t) obj;
                int i16 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item6, "$this$item");
                return new m0.d(ob.f.a(5));
            case 10:
                m0.t item7 = (m0.t) obj;
                int i17 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(item7, "$this$item");
                return new m0.d(ob.f.a(5));
            case 11:
                PiracyChecker piracyChecker = (PiracyChecker) obj;
                kotlin.jvm.internal.m.f(piracyChecker, "$this$piracyChecker");
                String[] strArr = {w4.c.h(uh.a.f52971e, "+", uh.a.f52972f, "+", uh.a.f52973g)};
                piracyChecker.f7755e = true;
                piracyChecker.f7756f = (String[]) Arrays.copyOf(strArr, 1);
                return qy.b0.f48488a;
            case 12:
                kotlin.jvm.internal.m.f((View) obj, "it");
                return qy.b0.f48488a;
            case 13:
                ((Long) obj).getClass();
                int i18 = BaseSmartTipsActivity.H;
                return qy.b0.f48488a;
            case 14:
                int i19 = GenFilterSentenceIdActivity.Q;
                kotlin.jvm.internal.m.f((View) obj, "it");
                String str = BuildConfig.VERSION_NAME;
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication2);
                            ij.d.f34419e = new ij.d(lingoSkillApplication2);
                        }
                        break;
                    }
                }
                ij.d dVar = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar);
                List<Sentence> listD = dVar.u().queryBuilder().d();
                kotlin.jvm.internal.m.e(listD, "list(...)");
                for (Sentence sentence : listD) {
                    Sentence sentenceE = ij.c.e(sentence.getSentenceId());
                    if (sentenceE != null) {
                        List<Word> sentWordsNOMF = sentenceE.getSentWordsNOMF();
                        ArrayList arrayListR = b7.e0.r("getSentWordsNOMF(...)", sentWordsNOMF);
                        for (Object obj2 : sentWordsNOMF) {
                            if (((Word) obj2).getWordType() != 1) {
                                arrayListR.add(obj2);
                            }
                        }
                        if (arrayListR.size() < 3) {
                            str = ((Object) str) + sentence.getSentenceId() + ";";
                        }
                    }
                }
                return qy.b0.f48488a;
            case 15:
                ((Long) obj).getClass();
                int i21 = StoryActivity.N;
                return qy.b0.f48488a;
            case 16:
                z navigate = (z) obj;
                int i22 = StoryActivity.N;
                kotlin.jvm.internal.m.f(navigate, "$this$navigate");
                String strA = jr.a0.StoryReadingFinish.a();
                kotlin.jvm.internal.m.f(strA, scqhIrGXy.xNJgKzvRsZqTQ);
                if (oz.q.K0(strA)) {
                    throw new IllegalArgumentException("Cannot pop up to an empty route");
                }
                navigate.f36281e = strA;
                navigate.f36280d = -1;
                navigate.f36282f = false;
                e0 e0Var = new e0();
                int i23 = StoryActivity.N;
                e0Var.f36194a = true;
                navigate.f36282f = e0Var.f36194a;
                navigate.f36283g = e0Var.f36195b;
                navigate.f36278b = true;
                return qy.b0.f48488a;
            case 17:
                z navigate2 = (z) obj;
                int i24 = StoryActivity.N;
                kotlin.jvm.internal.m.f(navigate2, "$this$navigate");
                String route = jr.a0.StorySpeakingFinish.a();
                kotlin.jvm.internal.m.f(route, "route");
                if (oz.q.K0(route)) {
                    throw new IllegalArgumentException("Cannot pop up to an empty route");
                }
                navigate2.f36281e = route;
                navigate2.f36280d = -1;
                navigate2.f36282f = false;
                e0 e0Var2 = new e0();
                int i25 = StoryActivity.N;
                e0Var2.f36194a = true;
                navigate2.f36282f = e0Var2.f36194a;
                navigate2.f36283g = e0Var2.f36195b;
                navigate2.f36278b = true;
                return qy.b0.f48488a;
            case 18:
                z navigate3 = (z) obj;
                int i26 = StoryActivity.N;
                kotlin.jvm.internal.m.f(navigate3, "$this$navigate");
                String route2 = jr.a0.StoryReading.a();
                kotlin.jvm.internal.m.f(route2, "route");
                if (oz.q.K0(route2)) {
                    throw new IllegalArgumentException("Cannot pop up to an empty route");
                }
                navigate3.f36281e = route2;
                navigate3.f36280d = -1;
                navigate3.f36282f = false;
                e0 e0Var3 = new e0();
                int i27 = StoryActivity.N;
                e0Var3.f36194a = true;
                navigate3.f36282f = e0Var3.f36194a;
                navigate3.f36283g = e0Var3.f36195b;
                navigate3.f36278b = true;
                return qy.b0.f48488a;
            case 19:
                z navigate4 = (z) obj;
                int i28 = StoryActivity.N;
                kotlin.jvm.internal.m.f(navigate4, "$this$navigate");
                String route3 = jr.a0.StorySpeaking.a();
                kotlin.jvm.internal.m.f(route3, "route");
                if (oz.q.K0(route3)) {
                    throw new IllegalArgumentException("Cannot pop up to an empty route");
                }
                navigate4.f36281e = route3;
                navigate4.f36280d = -1;
                navigate4.f36282f = false;
                e0 e0Var4 = new e0();
                int i29 = StoryActivity.N;
                e0Var4.f36194a = true;
                navigate4.f36282f = e0Var4.f36194a;
                navigate4.f36283g = e0Var4.f36195b;
                navigate4.f36278b = true;
                return qy.b0.f48488a;
            case 20:
                i2.d LinearProgressIndicator = (i2.d) obj;
                kotlin.jvm.internal.m.f(LinearProgressIndicator, "$this$LinearProgressIndicator");
                return qy.b0.f48488a;
            case 21:
                i2.d LinearProgressIndicator2 = (i2.d) obj;
                kotlin.jvm.internal.m.f(LinearProgressIndicator2, "$this$LinearProgressIndicator");
                return qy.b0.f48488a;
            case 22:
                i2.d LinearProgressIndicator3 = (i2.d) obj;
                kotlin.jvm.internal.m.f(LinearProgressIndicator3, "$this$LinearProgressIndicator");
                return qy.b0.f48488a;
            case 23:
                ChineseToneLevel it2 = (ChineseToneLevel) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return ry.m.g0(it2.getUnits());
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ChineseToneUnit it3 = (ChineseToneUnit) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return Boolean.valueOf(it3.getUnitId() != 0);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((CourseWord) obj).getWord();
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((CourseWord) obj).getWord();
            case 27:
                return ((CourseWord) obj).getWord();
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                k2 it4 = (k2) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                return Integer.valueOf(it4.f37013c);
            default:
                k2 it5 = (k2) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                return Integer.valueOf(it5.f37015e);
        }
    }
}
