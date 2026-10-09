package av;

import aj.uZCn.evRpcb;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.textclassifier.TextClassifier;
import androidx.lifecycle.ViewModelKt;
import bp.d5;
import com.google.api.Service;
import com.google.gson.Gson;
import com.lingo.course.ui.CourseTestActivity;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Level;
import com.lingo.lingoskill.object.PdLessonDao;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.ui.base.LoginCheckLocateAgeActivity;
import com.lingo.lingoskill.ui.base.LoginCheckParentInfoActivity;
import com.lingo.lingoskill.ui.base.MainActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.lingodeer.data.model.PhonemeDetail;
import com.lingodeer.data.model.PhonemeType;
import com.lingodeer.data.model.SerializablePhonemeLevelTimingResult;
import com.lingodeer.data.model.SerializableSyllableLevelTimingResult;
import com.lingodeer.data.model.SerializableTimingResult;
import com.lingodeer.data.model.SyllableDetail;
import com.lingodeer.data.model.SyllablePhonemeResult;
import com.stkouyu.SkEgnManager;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.n2;
import fr.o0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import jp.p0;
import jt.k0;
import jt.l0;
import jt.r2;
import l1.b1;
import ot.x1;
import pt.ImS.aYZzTH;
import uz.i1;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3183b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3182a = i11;
        this.f3183b = obj;
    }

    private final Object e(Object obj) {
        String strY0;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        ArrayList arrayListO = ep.a.o(obj);
        ArrayList arrayList = new ArrayList();
        SerializableTimingResult serializableTimingResult = (SerializableTimingResult) this.f3183b;
        boolean zIsEmpty = serializableTimingResult.getSyllables().isEmpty();
        ry.r rVar = ry.r.f50854a;
        if (zIsEmpty) {
            strY0 = ry.m.y0(serializableTimingResult.getPhonemes(), BuildConfig.VERSION_NAME, null, null, new n2(25), 30);
            arrayList.add(new SyllableDetail(strY0, serializableTimingResult.getWord(), serializableTimingResult.getAccuracyScore()));
            List<SerializablePhonemeLevelTimingResult> phonemes = serializableTimingResult.getPhonemes();
            ArrayList arrayList2 = new ArrayList(ry.n.W(phonemes, 10));
            for (SerializablePhonemeLevelTimingResult serializablePhonemeLevelTimingResult : phonemes) {
                arrayList2.add(new PhonemeDetail(serializablePhonemeLevelTimingResult.getPhoneme(), serializablePhonemeLevelTimingResult.getAccuracyScore(), rVar, false, PhonemeType.Consonant));
            }
            arrayListO.addAll(arrayList2);
        } else {
            List<SerializableSyllableLevelTimingResult> syllables = serializableTimingResult.getSyllables();
            ArrayList arrayList3 = new ArrayList(ry.n.W(syllables, 10));
            for (SerializableSyllableLevelTimingResult serializableSyllableLevelTimingResult : syllables) {
                arrayList3.add(new SyllableDetail(serializableSyllableLevelTimingResult.getSyllable(), serializableSyllableLevelTimingResult.getGrapheme(), serializableSyllableLevelTimingResult.getAccuracyScore()));
            }
            arrayList.addAll(arrayList3);
            List<SerializablePhonemeLevelTimingResult> phonemes2 = serializableTimingResult.getPhonemes();
            ArrayList arrayList4 = new ArrayList(ry.n.W(phonemes2, 10));
            for (SerializablePhonemeLevelTimingResult serializablePhonemeLevelTimingResult2 : phonemes2) {
                arrayList4.add(new PhonemeDetail(serializablePhonemeLevelTimingResult2.getPhoneme(), serializablePhonemeLevelTimingResult2.getAccuracyScore(), rVar, false, PhonemeType.Consonant));
            }
            arrayListO.addAll(arrayList4);
            strY0 = ry.m.y0(serializableTimingResult.getSyllables(), ".", null, null, new n2(26), 30);
        }
        SyllablePhonemeResult syllablePhonemeResult = new SyllablePhonemeResult(serializableTimingResult.getWord(), serializableTimingResult.getAccuracyScore(), strY0, rVar, arrayList, arrayListO);
        syllablePhonemeResult.toString();
        return syllablePhonemeResult;
    }

    private final Object m(Object obj) {
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        jt.u uVar = (jt.u) this.f3183b;
        b1 b1Var = uVar.f37191c;
        b1 b1Var2 = uVar.f37196h;
        b1 b1Var3 = uVar.f37195g;
        b1 b1Var4 = uVar.f37194f;
        if (b1Var.getValue() != ht.q.CORRECT) {
            List list = (List) ry.m.q0(uVar.f37189a);
            CourseWord courseWord = (CourseWord) b1Var4.getValue();
            if (courseWord != null) {
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            CourseWord courseWord2 = (CourseWord) it.next();
                            if (uVar.c(courseWord2) == r2.SHENG_MU) {
                                if (courseWord2.getWordId() != courseWord.getWordId()) {
                                    String word = courseWord2.getWord();
                                    Locale locale = Locale.ROOT;
                                    String lowerCase = word.toLowerCase(locale);
                                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                    String lowerCase2 = courseWord.getWord().toLowerCase(locale);
                                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                    if (lowerCase.equals(lowerCase2)) {
                                    }
                                }
                                z13 = true;
                            }
                        } else {
                            z13 = false;
                        }
                    }
                } else {
                    z13 = false;
                }
                str = "toLowerCase(...)";
                b1Var4.setValue(CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, z13 ? OptionItemSelectedState.CORRECT : OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null));
            } else {
                str = "toLowerCase(...)";
            }
            CourseWord courseWord3 = (CourseWord) b1Var3.getValue();
            if (courseWord3 != null) {
                if (list == null || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            CourseWord courseWord4 = (CourseWord) it2.next();
                            if (uVar.c(courseWord4) == r2.YU_MU) {
                                if (courseWord4.getWordId() != courseWord3.getWordId()) {
                                    String word2 = courseWord4.getWord();
                                    Locale locale2 = Locale.ROOT;
                                    String lowerCase3 = word2.toLowerCase(locale2);
                                    kotlin.jvm.internal.m.e(lowerCase3, str);
                                    String lowerCase4 = courseWord3.getWord().toLowerCase(locale2);
                                    kotlin.jvm.internal.m.e(lowerCase4, str);
                                    if (lowerCase3.equals(lowerCase4)) {
                                    }
                                }
                                z12 = true;
                            }
                        } else {
                            z12 = false;
                        }
                    }
                } else {
                    z12 = false;
                }
                b1Var3.setValue(CourseWord.copy$default(courseWord3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, z12 ? OptionItemSelectedState.CORRECT : OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null));
            }
            CourseWord courseWord5 = (CourseWord) b1Var2.getValue();
            if (courseWord5 != null) {
                if (list == null || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            CourseWord courseWord6 = (CourseWord) it3.next();
                            if (uVar.c(courseWord6) == r2.TONE) {
                                if (courseWord6.getWordId() != courseWord5.getWordId()) {
                                    String word3 = courseWord6.getWord();
                                    Locale locale3 = Locale.ROOT;
                                    String lowerCase5 = word3.toLowerCase(locale3);
                                    kotlin.jvm.internal.m.e(lowerCase5, str);
                                    String lowerCase6 = courseWord5.getWord().toLowerCase(locale3);
                                    kotlin.jvm.internal.m.e(lowerCase6, str);
                                    if (lowerCase5.equals(lowerCase6)) {
                                    }
                                }
                                z11 = true;
                            }
                        } else {
                            z11 = false;
                        }
                    }
                } else {
                    z11 = false;
                }
                b1Var2.setValue(CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, z11 ? OptionItemSelectedState.CORRECT : OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null));
            }
        } else {
            CourseWord courseWord7 = (CourseWord) b1Var4.getValue();
            b1Var4.setValue(courseWord7 != null ? CourseWord.copy$default(courseWord7, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null) : null);
            CourseWord courseWord8 = (CourseWord) b1Var3.getValue();
            b1Var3.setValue(courseWord8 != null ? CourseWord.copy$default(courseWord8, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null) : null);
            CourseWord courseWord9 = (CourseWord) b1Var2.getValue();
            b1Var2.setValue(courseWord9 != null ? CourseWord.copy$default(courseWord9, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null) : null);
        }
        jt.u.a(uVar);
        return qy.b0.f48488a;
    }

    private final Object n(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        jt.v vVar = (jt.v) this.f3183b;
        if (((Boolean) vVar.f37219j.getValue()).booleanValue()) {
            vVar.f37222n.setValue(new Integer(-1));
            vVar.f37223o.setValue(new Integer(-1));
        }
        return qy.b0.f48488a;
    }

    private final Object o(Object obj) {
        int i11;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        ht.q qVar = ht.q.CORRECT;
        jt.h0 h0Var = (jt.h0) this.f3183b;
        List list = h0Var.f36957c;
        int i12 = h0Var.f36955a;
        b1 b1Var = h0Var.f36960f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!kotlin.jvm.internal.m.a(((CourseWord) obj2).getWord(), " ")) {
                arrayList.add(obj2);
            }
        }
        List list2 = h0Var.f36957c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            CourseWord courseWord = (CourseWord) obj3;
            if ((!kotlin.jvm.internal.m.a(courseWord.getWord(), " ") && courseWord.getWordType() != 1) || ry.l.D(new String[]{"–", "-"}, courseWord.getWord())) {
                arrayList2.add(obj3);
            }
        }
        Iterable iterable = (Iterable) b1Var.getValue();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : iterable) {
            CourseWord courseWord2 = (CourseWord) obj4;
            if (!kotlin.jvm.internal.m.a(courseWord2.getWord(), " ") && (courseWord2.getWordType() != 1 || courseWord2.isQuestionWord() || ry.l.D(new String[]{"–", "-"}, courseWord2.getWord()))) {
                arrayList3.add(obj4);
            }
        }
        int size = arrayList3.size();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i15 < size) {
            Object obj5 = arrayList3.get(i15);
            i15++;
            int i16 = i14 + 1;
            if (i14 < 0) {
                ns.o.V();
                throw null;
            }
            CourseWord courseWord3 = (CourseWord) obj5;
            if (i14 < arrayList2.size()) {
                String correctWord = ((CourseWord) arrayList2.get(i14)).getWord();
                String selectedWord = courseWord3.getWord();
                kotlin.jvm.internal.m.f(correctWord, "correctWord");
                kotlin.jvm.internal.m.f(selectedWord, "selectedWord");
                if (!o00.a.z(i12, selectedWord, correctWord)) {
                    qVar = ht.q.WRONG;
                }
            } else {
                qVar = ht.q.WRONG;
            }
            i14 = i16;
        }
        if (qVar == ht.q.WRONG) {
            Iterable iterable2 = (Iterable) b1Var.getValue();
            ArrayList arrayList4 = new ArrayList(ry.n.W(iterable2, 10));
            int i17 = 0;
            for (Object obj6 : iterable2) {
                int i18 = i13 + 1;
                if (i13 < 0) {
                    ns.o.V();
                    throw null;
                }
                CourseWord courseWordCopy$default = (CourseWord) obj6;
                if (kotlin.jvm.internal.m.a(courseWordCopy$default.getWord(), " ")) {
                    i17++;
                }
                if (courseWordCopy$default.isQuestionWord() && (i11 = i13 - i17) < arrayList.size()) {
                    courseWordCopy$default = o00.a.z(i12, courseWordCopy$default.getWord(), ((CourseWord) arrayList.get(i11)).getWord()) ? CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                }
                arrayList4.add(courseWordCopy$default);
                i13 = i18;
            }
            b1Var.setValue(arrayList4);
        }
        h0Var.f36958d.setValue(qVar);
        return qy.b0.f48488a;
    }

    private final Object p(Object obj) {
        CourseSentence courseSentenceCopy$default;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        jt.j0 j0Var = (jt.j0) this.f3183b;
        b1 b1Var = j0Var.f36994f;
        Iterable<CourseSentence> iterable = (Iterable) b1Var.getValue();
        ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
        for (CourseSentence courseSentence : iterable) {
            if (courseSentence.getSelectedState() == OptionItemSelectedState.SELECTED) {
                long sentenceId = courseSentence.getSentenceId();
                long j11 = j0Var.f36990b;
                b1 b1Var2 = j0Var.f36992d;
                if (sentenceId == j11) {
                    b1Var2.setValue(ht.q.CORRECT);
                    courseSentenceCopy$default = CourseSentence.copy$default(courseSentence, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, OptionItemSelectedState.CORRECT, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8257535, null);
                } else {
                    b1Var2.setValue(ht.q.WRONG);
                    courseSentenceCopy$default = CourseSentence.copy$default(courseSentence, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, OptionItemSelectedState.WRONG, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8257535, null);
                }
            } else {
                courseSentenceCopy$default = CourseSentence.copy$default(courseSentence, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, OptionItemSelectedState.DEFAULT, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8257535, null);
            }
            arrayList.add(courseSentenceCopy$default);
        }
        b1Var.setValue(arrayList);
        return qy.b0.f48488a;
    }

    private final Object q(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        k0 k0Var = (k0) this.f3183b;
        CourseSentence courseSentence = k0Var.f37002a;
        b1 b1Var = k0Var.f37005d;
        List<CourseWord> courseWords = courseSentence.getCourseWords();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : courseWords) {
            if (((CourseWord) obj2).getWordType() != 1) {
                arrayList.add(obj2);
            }
        }
        Iterable iterable = (Iterable) k0Var.f37007f.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : iterable) {
            CourseWord courseWord = (CourseWord) obj3;
            if (courseWord.getSelectedState() != OptionItemSelectedState.SELECTED && courseWord.getWordType() != 1) {
                arrayList2.add(obj3);
            }
        }
        int size = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            qy.b0 b0Var = qy.b0.f48488a;
            if (i12 >= size) {
                b1Var.setValue(ht.q.CORRECT);
                return b0Var;
            }
            Object obj4 = arrayList2.get(i12);
            i12++;
            int i13 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            if (!o00.a.z(k0Var.f37003b, ((CourseWord) obj4).getWord(), ((CourseWord) arrayList.get(i11)).getWord())) {
                b1Var.setValue(ht.q.WRONG);
                return b0Var;
            }
            i11 = i13;
        }
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3182a) {
            case 0:
                return new p((q) this.f3183b, dVar, 0);
            case 1:
                return new p((y) this.f3183b, dVar, 1);
            case 2:
                return new p((j0) this.f3183b, dVar, 2);
            case 3:
                return new p((bp.m) this.f3183b, dVar, 3);
            case 4:
                return new p((bp.n) this.f3183b, dVar, 4);
            case 5:
                return new p((LoginCheckLocateAgeActivity) this.f3183b, dVar, 5);
            case 6:
                return new p((LoginCheckParentInfoActivity) this.f3183b, dVar, 6);
            case 7:
                return new p((MainActivity) this.f3183b, dVar, 7);
            case 8:
                return new p((SignUpActivity) this.f3183b, dVar, 8);
            case 9:
                return new p((UpdateLessonActivity) this.f3183b, dVar, 9);
            case 10:
                return new p((x1) this.f3183b, dVar, 10);
            case 11:
                return new p((CourseTestActivity) this.f3183b, dVar, 11);
            case 12:
                return new p((MeAccountSettingsActivity) this.f3183b, dVar, 12);
            case 13:
                return new p((d1.r) this.f3183b, dVar, 13);
            case 14:
                return new p((gi.d) this.f3183b, dVar, 14);
            case 15:
                return new p((gp.b) this.f3183b, dVar, 15);
            case 16:
                return new p((gp.w) this.f3183b, dVar, 16);
            case 17:
                return new p((n0) this.f3183b, dVar, 17);
            case 18:
                return new p((gp.n0) this.f3183b, dVar, 18);
            case 19:
                return new p((SerializableTimingResult) this.f3183b, dVar, 19);
            case 20:
                return new p((PdLearnIndexActivity) this.f3183b, dVar, 20);
            case 21:
                return new p((Date) this.f3183b, dVar, 21);
            case 22:
                return new p((j9.v) this.f3183b, dVar, 22);
            case 23:
                return new p((p0) this.f3183b, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new p((jt.u) this.f3183b, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new p((jt.v) this.f3183b, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new p((jt.h0) this.f3183b, dVar, 26);
            case 27:
                return new p((jt.j0) this.f3183b, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new p((k0) this.f3183b, dVar, 28);
            default:
                return new p((l0) this.f3183b, dVar, 29);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3182a) {
            case 0:
                p pVar = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                pVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
                return null;
            case 3:
                p pVar2 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                pVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 4:
                p pVar3 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                pVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 5:
                p pVar4 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                pVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 6:
                p pVar5 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                pVar5.invokeSuspend(b0Var5);
                return b0Var5;
            case 7:
                p pVar6 = (p) create((tt.a) obj, (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                pVar6.invokeSuspend(b0Var6);
                return b0Var6;
            case 8:
                p pVar7 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var7 = qy.b0.f48488a;
                pVar7.invokeSuspend(b0Var7);
                return b0Var7;
            case 9:
                p pVar8 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var8 = qy.b0.f48488a;
                pVar8.invokeSuspend(b0Var8);
                return b0Var8;
            case 10:
                p pVar9 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var9 = qy.b0.f48488a;
                pVar9.invokeSuspend(b0Var9);
                return b0Var9;
            case 11:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                p pVar10 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var10 = qy.b0.f48488a;
                pVar10.invokeSuspend(b0Var10);
                return b0Var10;
            case 13:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                p pVar11 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var11 = qy.b0.f48488a;
                pVar11.invokeSuspend(b0Var11);
                return b0Var11;
            case 15:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                p pVar12 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var12 = qy.b0.f48488a;
                pVar12.invokeSuspend(b0Var12);
                return b0Var12;
            case 17:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                p pVar13 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var13 = qy.b0.f48488a;
                pVar13.invokeSuspend(b0Var13);
                return b0Var13;
            case 19:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                p pVar14 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var14 = qy.b0.f48488a;
                pVar14.invokeSuspend(b0Var14);
                return b0Var14;
            case 23:
                return ((p) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                p pVar15 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var15 = qy.b0.f48488a;
                pVar15.invokeSuspend(b0Var15);
                return b0Var15;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                p pVar16 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var16 = qy.b0.f48488a;
                pVar16.invokeSuspend(b0Var16);
                return b0Var16;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                p pVar17 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var17 = qy.b0.f48488a;
                pVar17.invokeSuspend(b0Var17);
                return b0Var17;
            case 27:
                p pVar18 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var18 = qy.b0.f48488a;
                pVar18.invokeSuspend(b0Var18);
                return b0Var18;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                p pVar19 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var19 = qy.b0.f48488a;
                pVar19.invokeSuspend(b0Var19);
                return b0Var19;
            default:
                p pVar20 = (p) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var20 = qy.b0.f48488a;
                pVar20.invokeSuspend(b0Var20);
                return b0Var20;
        }
    }

    private final Object j(Object obj) {
        String str;
        int i11;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime((Date) this.f3183b);
        int i12 = calendar.get(1);
        int i13 = 2;
        int i14 = calendar.get(2);
        calendar.set(i12, i14, 1);
        int actualMaximum = calendar.getActualMaximum(5);
        int i15 = -1;
        lz.e eVar = new lz.e(calendar.get(7) - 1, 1, -1);
        ArrayList arrayList = new ArrayList(ry.n.W(eVar, 10));
        Iterator it = eVar.iterator();
        while (true) {
            boolean z11 = ((lz.f) it).f40537c;
            str = evRpcb.lEcqdayVAvTmG;
            Iterator it2 = it;
            i11 = 6;
            if (!z11) {
                break;
            }
            ((ry.w) it2).nextInt();
            calendar.add(6, i15);
            int i16 = calendar.get(5);
            int i17 = calendar.get(2);
            String str2 = new SimpleDateFormat(str, Locale.US).format(calendar.getTime());
            kotlin.jvm.internal.m.e(str2, "format(...)");
            arrayList.add(new hu.b(str2, i16, i17, calendar.get(6), 1776));
            it = it2;
            i15 = -1;
        }
        List listO0 = ry.m.O0(arrayList);
        calendar.set(i12, i14, actualMaximum);
        lz.g gVar = new lz.g(1, 7 - calendar.get(7), 1);
        ArrayList arrayList2 = new ArrayList(ry.n.W(gVar, 10));
        Iterator it3 = gVar.iterator();
        while (((lz.f) it3).f40537c) {
            ((ry.w) it3).nextInt();
            calendar.add(6, 1);
            int i18 = calendar.get(5);
            int i19 = calendar.get(i13);
            String str3 = new SimpleDateFormat(str, Locale.US).format(calendar.getTime());
            kotlin.jvm.internal.m.e(str3, "format(...)");
            arrayList2.add(new hu.b(str3, i18, i19, calendar.get(6), 1520));
            i13 = 2;
        }
        lz.g gVar2 = new lz.g(1, actualMaximum, 1);
        ArrayList arrayList3 = new ArrayList(ry.n.W(gVar2, 10));
        Iterator it4 = gVar2.iterator();
        while (((lz.f) it4).f40537c) {
            int iNextInt = ((ry.w) it4).nextInt();
            calendar.set(i12, i14, iNextInt);
            Locale locale = Locale.US;
            String str4 = new SimpleDateFormat(str, locale).format(calendar.getTime());
            kotlin.jvm.internal.m.c(str4);
            arrayList3.add(hu.b.a(new hu.b(str4, iNextInt, i14, calendar.get(i11), 2032), null, false, false, kotlin.jvm.internal.m.a(new SimpleDateFormat(str, locale).format(Calendar.getInstance().getTime()), str4), null, 1919));
            arrayList2 = arrayList2;
            i11 = i11;
        }
        ArrayList arrayListC1 = ry.m.c1(arrayList3);
        arrayListC1.addAll(0, listO0);
        arrayListC1.addAll(arrayList2);
        return new qy.l(i14 + "/" + i12, arrayListC1);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x050e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0522  */
    /* JADX WARN: Code duplicated, block: B:134:0x052a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0533  */
    /* JADX WARN: Code duplicated, block: B:139:0x0560  */
    /* JADX WARN: Code duplicated, block: B:141:0x056d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0595  */
    /* JADX WARN: Code duplicated, block: B:143:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:149:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:151:0x0601  */
    /* JADX WARN: Code duplicated, block: B:155:0x0608 A[Catch: all -> 0x0610, TRY_LEAVE, TryCatch #1 {, blocks: (B:153:0x0604, B:155:0x0608), top: B:359:0x0604 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0628  */
    /* JADX WARN: Code duplicated, block: B:166:0x062b  */
    /* JADX WARN: Code duplicated, block: B:196:0x0737  */
    /* JADX WARN: Code duplicated, block: B:239:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:242:0x07fc A[PHI: r0 r7
      0x07fc: PHI (r0v104 int) = (r0v94 int), (r0v95 int) binds: [B:241:0x07fa, B:244:0x0802] A[DONT_GENERATE, DONT_INLINE]
      0x07fc: PHI (r7v17 int) = (r7v15 int), (r7v16 int) binds: [B:241:0x07fa, B:244:0x0802] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:248:0x080b  */
    /* JADX WARN: Code duplicated, block: B:249:0x080d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0810  */
    /* JADX WARN: Code duplicated, block: B:252:0x0812  */
    /* JADX WARN: Code duplicated, block: B:267:0x0837  */
    /* JADX WARN: Code duplicated, block: B:279:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:359:0x0604 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x042c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0447  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        long j11;
        long j12;
        int sortIndex;
        eq.b bVar;
        eq.b bVar2;
        long j13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        long j14;
        int length;
        int length2;
        boolean z13;
        String[] strArr;
        cm.a aVar;
        eq.b bVar3;
        boolean z14;
        ij.l lVar;
        Integer num;
        boolean z15;
        int i16 = 25;
        switch (this.f3182a) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q qVar = (q) this.f3183b;
                File file = qVar.f3185b;
                File file2 = qVar.f3184a;
                file2.mkdirs();
                File file3 = new File(file2, "sk_native_assets_cn.zip.part");
                File file4 = new File(file2, ".staging");
                file3.delete();
                cz.k.R(file4);
                file4.mkdirs();
                try {
                    file3.getName();
                    URLConnection uRLConnectionOpenConnection = new URL("https://d27hu3tsvatwlt.cloudfront.net/dtzip/sk_native_assets_cn.zip").openConnection();
                    kotlin.jvm.internal.m.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        httpURLConnection.setConnectTimeout(15000);
                        httpURLConnection.setReadTimeout(120000);
                        httpURLConnection.setInstanceFollowRedirects(true);
                        httpURLConnection.setRequestMethod("GET");
                        int responseCode = httpURLConnection.getResponseCode();
                        long contentLengthLong = httpURLConnection.getContentLengthLong();
                        Long lValueOf = contentLengthLong > 0 ? Long.valueOf(contentLengthLong) : null;
                        if (200 > responseCode || responseCode >= 300) {
                            throw new IllegalStateException(("下载失败，HTTP " + responseCode).toString());
                        }
                        SystemClock.elapsedRealtime();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                            try {
                                kotlin.jvm.internal.m.c(inputStream);
                                qVar.a(inputStream, bufferedOutputStream, lValueOf);
                                q.f(file3);
                                SystemClock.elapsedRealtime();
                                bufferedOutputStream.close();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                SystemClock.elapsedRealtime();
                                q.f(file3);
                                q.g(file3, file4);
                                File fileB = q.b(file4);
                                q.f(fileB);
                                SystemClock.elapsedRealtime();
                                SystemClock.elapsedRealtime();
                                q.f(fileB);
                                file.exists();
                                q.f(file);
                                qVar.c(fileB, file);
                                q.f(file);
                                SystemClock.elapsedRealtime();
                                file3.delete();
                                cz.k.R(file4);
                                return qy.b0.f48488a;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    ns.o.m(bufferedOutputStream, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                ns.o.m(inputStream, th4);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        httpURLConnection.disconnect();
                        throw th6;
                    }
                } catch (Throwable th7) {
                    file3.delete();
                    cz.k.R(file4);
                    throw th7;
                }
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return (SkEgnManager) ((y) this.f3183b).f3218c.getValue();
            case 2:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((j0) this.f3183b).getClass();
                return null;
            case 3:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                bp.m mVar = (bp.m) this.f3183b;
                mVar.r().hasFindPerfectTime = Boolean.TRUE;
                mVar.r().updateEntry("hasFindPerfectTime");
                mVar.r().learnAlarmTime = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
                mVar.r().updateEntry("learnAlarmTime");
                er.c.h();
                return qy.b0.f48488a;
            case 4:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                bp.n nVar = (bp.n) this.f3183b;
                nVar.r().hasFindPerfectTime = Boolean.TRUE;
                nVar.r().updateEntry("hasFindPerfectTime");
                nVar.r().learnAlarmTime = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
                nVar.r().updateEntry("learnAlarmTime");
                er.c.h();
                return qy.b0.f48488a;
            case 5:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b7.e0.A(((LoginCheckLocateAgeActivity) this.f3183b).m(), "jxz_signup_enter_age_page");
                return qy.b0.f48488a;
            case 6:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b7.e0.A(((LoginCheckParentInfoActivity) this.f3183b).m(), "jxz_signup_enter_parent_page");
                return qy.b0.f48488a;
            case 7:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                hh.p0.w(2, f10.e.b());
                MainActivity mainActivity = (MainActivity) this.f3183b;
                int i17 = MainActivity.U;
                gp.w wVarU = mainActivity.u();
                ju.d dVar = new ju.d(i16);
                wVarU.getClass();
                wVarU.d(dVar);
                return qy.b0.f48488a;
            case 8:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                SignUpActivity signUpActivity = (SignUpActivity) this.f3183b;
                signUpActivity.m().c("jxz_enter_signup", new d5(signUpActivity, 5));
                return qy.b0.f48488a;
            case 9:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                UpdateLessonActivity updateLessonActivity = (UpdateLessonActivity) this.f3183b;
                File file5 = new File(defpackage.e.m(updateLessonActivity.getFilesDir().getAbsolutePath(), "koCharacterZhuyin.json"));
                String json = new Gson().toJson(se.p.V().f55181d.loadAll());
                kotlin.jvm.internal.m.e(json, "toJson(...)");
                cz.k.V(file5, json);
                File file6 = new File(defpackage.e.m(updateLessonActivity.getFilesDir().getAbsolutePath(), "koCharacter.json"));
                String json2 = new Gson().toJson(se.p.V().f55179b.loadAll());
                kotlin.jvm.internal.m.e(json2, "toJson(...)");
                cz.k.V(file6, json2);
                File file7 = new File(defpackage.e.m(updateLessonActivity.getFilesDir().getAbsolutePath(), "koCharacterPart.json"));
                String json3 = new Gson().toJson(se.p.V().f55180c.loadAll());
                kotlin.jvm.internal.m.e(json3, "toJson(...)");
                cz.k.V(file7, json3);
                return qy.b0.f48488a;
            case 10:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Objects.toString(((x1) this.f3183b).f46042a);
                return qy.b0.f48488a;
            case 11:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int i18 = CourseTestActivity.R;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                return Boolean.valueOf(!cf.x.n().neverPromptUserReview);
            case 12:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                MeAccountSettingsActivity meAccountSettingsActivity = (MeAccountSettingsActivity) this.f3183b;
                meAccountSettingsActivity.f22214t = new bq.g(meAccountSettingsActivity, meAccountSettingsActivity.Q);
                return qy.b0.f48488a;
            case 13:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                d1.r rVar = (d1.r) this.f3183b;
                TextClassifier textClassifierH = a2.l.h(rVar.f22976b, rVar.f22977c);
                rVar.f22980f = textClassifierH;
                return textClassifierH;
            case 14:
                qy.b0 b0Var = qy.b0.f48488a;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gi.d dVar2 = (gi.d) this.f3183b;
                i1 i1Var = dVar2.f29258c;
                if (dVar2.f29261f.contains(new Integer(-1))) {
                    gi.a aVarA = gi.a.a((gi.a) i1Var.getValue(), null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, true, 63);
                    i1Var.getClass();
                    i1Var.l(null, aVarA);
                } else {
                    long j15 = -1;
                    File file8 = new File(defpackage.e.m(xt.b.a().b(), fv.b.D(j15)));
                    qy.q qVar2 = fv.b.f28186a;
                    fv.a aVar17 = new fv.a(0L, fv.b.E(j15), fv.b.D(j15));
                    if (file8.exists()) {
                        rz.e0.B(ViewModelKt.getViewModelScope(dVar2), null, null, new gi.c(1, dVar2, file8, null), 3);
                    } else {
                        i1Var.l(null, gi.a.a((gi.a) i1Var.getValue(), null, null, null, true, CropImageView.DEFAULT_ASPECT_RATIO, false, 15));
                        dVar2.f29256a.d(aVar17, new fj.a(1, dVar2, file8));
                    }
                }
                return b0Var;
            case 15:
                Integer num2 = 47;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ArrayList arrayListB = ij.c.b();
                Thread.currentThread().getName();
                arrayListB.size();
                if (!arrayListB.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    String strS = com.bumptech.glide.e.s();
                    eq.b bVar4 = new eq.b();
                    bVar4.a(strS);
                    cm.a aVarB = com.bumptech.glide.e.t() != null ? cm.a.b(com.bumptech.glide.e.t()) : null;
                    gp.b bVar5 = (gp.b) this.f3183b;
                    boolean z16 = false;
                    String[] strArr2 = bVar5.f29340b[0];
                    int size = arrayListB.size();
                    int i19 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    while (i21 < size) {
                        Object obj2 = arrayListB.get(i21);
                        int i25 = i21 + 1;
                        int i26 = i19 + 1;
                        if (i19 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        boolean z17 = z16;
                        Unit unit = (Unit) obj2;
                        unit.setDashLineColor((String) ry.l.U(strArr2));
                        int i27 = i22 % 7;
                        unit.setBannerRes(bVar5.f29341c[i27].intValue());
                        unit.setBannerStartColor(bVar5.f29342d[i27][z17 ? 1 : 0]);
                        unit.setBannerEndColor(bVar5.f29342d[i27][1]);
                        String unitName = unit.getUnitName();
                        int i28 = size;
                        kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                        Integer num3 = num2;
                        if (oz.x.s0(unitName, "TESTOUT", z17)) {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList, 10));
                            int size2 = arrayList.size();
                            for (int i29 = 0; i29 < size2; i29++) {
                                b7.e0.x(((Unit) arrayList.get(i29)).getUnitId(), arrayList3);
                                size2 = size2;
                            }
                            arrayList2.addAll(arrayList3);
                            if (i26 < arrayListB.size()) {
                                b7.e0.x(((Unit) arrayListB.get(i26)).getUnitId(), arrayList2);
                            }
                            unit.setUnitList(arrayList2);
                            if (i19 < arrayListB.size() - 1) {
                                Object obj3 = arrayList.get(arrayList.size() - 2);
                                kotlin.jvm.internal.m.e(obj3, "get(...)");
                                if (((Unit) obj3).isActive()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                Object obj4 = arrayList.get(arrayList.size() - 1);
                                kotlin.jvm.internal.m.e(obj4, "get(...)");
                                if (((Unit) obj4).isActive()) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            }
                            Iterator it = arrayList.iterator();
                            kotlin.jvm.internal.m.e(it, "iterator(...)");
                            boolean z18 = false;
                            while (it.hasNext()) {
                                Object next = it.next();
                                kotlin.jvm.internal.m.e(next, "next(...)");
                                if (((Unit) next).isActive()) {
                                    z18 = true;
                                }
                            }
                            unit.setActive(z18);
                            unit.setTestOutReview(z15);
                            arrayList.clear();
                            unit.setType(2);
                            unit.setIconColor(bVar5.f29339a[i27]);
                            unit.getIconColor();
                            i23++;
                            i22++;
                            strArr2 = bVar5.f29340b[i22 % 7];
                            aVar = aVarB;
                            num2 = num3;
                            i24 = 0;
                            bVar3 = bVar4;
                        } else {
                            unit.setType((i19 - i23) % 2 == 0 ? 1 : 0);
                            int i30 = i24;
                            if (i30 < strArr2.length) {
                                unit.setIconColor(strArr2[i30]);
                            } else {
                                if (strArr2.length == 0) {
                                    throw new NoSuchElementException("Array is empty.");
                                }
                                unit.setIconColor(strArr2[strArr2.length - 1]);
                            }
                            i24 = i30 + 1;
                            if (unit.getLevelId() < bVar4.f25737a) {
                                length2 = ew.a.v(unit.getLessonList()).length;
                            } else if (unit.getLevelId() != bVar4.f25737a || unit.getSortIndex() >= bVar4.f25738b) {
                                if (unit.getLevelId() == bVar4.f25737a && unit.getSortIndex() == bVar4.f25738b) {
                                    length2 = bVar4.f25739c - 1;
                                } else {
                                    length2 = 0;
                                    z13 = false;
                                }
                                if (aVarB != null) {
                                    strArr = strArr2;
                                    num = (Integer) aVarB.f7184b.get(Long.valueOf(unit.getUnitId()));
                                    if (num != null) {
                                        if (num.intValue() - 1 > length2) {
                                            length2 = num.intValue() - 1;
                                        }
                                        z13 = true;
                                    }
                                } else {
                                    strArr = strArr2;
                                }
                                unit.setActive(z13);
                                int[] iArr = bq.r.f4959a;
                                num2 = num3;
                                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                if (ry.l.D(new Integer[]{num2, 48, 53, 54, 49, 50}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                    aVar = aVarB;
                                    bVar3 = bVar4;
                                    if (length2 > ew.a.v(unit.getLessonList()).length) {
                                        unit.setProgress(hh.p0.l(" ", ew.a.v(unit.getLessonList()).length, "/", ew.a.v(unit.getLessonList()).length, " "));
                                    } else {
                                        unit.setProgress(hh.p0.l(" ", length2, "/", ew.a.v(unit.getLessonList()).length, " "));
                                    }
                                } else if (length2 > ew.a.v(unit.getLessonList()).length - 1) {
                                    aVar = aVarB;
                                    bVar3 = bVar4;
                                    unit.setProgress(hh.p0.l(" ", ew.a.v(unit.getLessonList()).length - 1, "/", ew.a.v(unit.getLessonList()).length - 1, " "));
                                } else {
                                    aVar = aVarB;
                                    bVar3 = bVar4;
                                    unit.setProgress(hh.p0.l(" ", length2, "/", ew.a.v(unit.getLessonList()).length - 1, " "));
                                }
                                if (unit.isActive()) {
                                    if (ij.l.f34436b == null) {
                                        synchronized (ij.l.class) {
                                            if (ij.l.f34436b == null) {
                                                ij.l.f34436b = new ij.l();
                                            }
                                        }
                                    }
                                    lVar = ij.l.f34436b;
                                    kotlin.jvm.internal.m.c(lVar);
                                    if (lVar.a().getCurrentEnteredUnitId() == i19) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                } else {
                                    z14 = false;
                                }
                                unit.setCurOpen(z14);
                                arrayList.add(unit);
                                strArr2 = strArr;
                            } else {
                                length2 = ew.a.v(unit.getLessonList()).length;
                            }
                            z13 = true;
                            if (aVarB != null) {
                                strArr = strArr2;
                                num = (Integer) aVarB.f7184b.get(Long.valueOf(unit.getUnitId()));
                                if (num != null) {
                                    if (num.intValue() - 1 > length2) {
                                        length2 = num.intValue() - 1;
                                    }
                                    z13 = true;
                                }
                            } else {
                                strArr = strArr2;
                            }
                            unit.setActive(z13);
                            int[] iArr2 = bq.r.f4959a;
                            num2 = num3;
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            if (ry.l.D(new Integer[]{num2, 48, 53, 54, 49, 50}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                aVar = aVarB;
                                bVar3 = bVar4;
                                if (length2 > ew.a.v(unit.getLessonList()).length) {
                                    unit.setProgress(hh.p0.l(" ", ew.a.v(unit.getLessonList()).length, "/", ew.a.v(unit.getLessonList()).length, " "));
                                } else {
                                    unit.setProgress(hh.p0.l(" ", length2, "/", ew.a.v(unit.getLessonList()).length, " "));
                                }
                            } else if (length2 > ew.a.v(unit.getLessonList()).length - 1) {
                                aVar = aVarB;
                                bVar3 = bVar4;
                                unit.setProgress(hh.p0.l(" ", ew.a.v(unit.getLessonList()).length - 1, "/", ew.a.v(unit.getLessonList()).length - 1, " "));
                            } else {
                                aVar = aVarB;
                                bVar3 = bVar4;
                                unit.setProgress(hh.p0.l(" ", length2, "/", ew.a.v(unit.getLessonList()).length - 1, " "));
                            }
                            if (unit.isActive()) {
                                z14 = false;
                            } else {
                                if (ij.l.f34436b == null) {
                                    synchronized (ij.l.class) {
                                        if (ij.l.f34436b == null) {
                                            ij.l.f34436b = new ij.l();
                                        }
                                    }
                                }
                                lVar = ij.l.f34436b;
                                kotlin.jvm.internal.m.c(lVar);
                                if (lVar.a().getCurrentEnteredUnitId() == i19) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            }
                            unit.setCurOpen(z14);
                            arrayList.add(unit);
                            strArr2 = strArr;
                        }
                        i19 = i26;
                        aVarB = aVar;
                        bVar4 = bVar3;
                        i21 = i25;
                        size = i28;
                        z16 = false;
                        break;
                    }
                    int size3 = arrayListB.size();
                    int i31 = 0;
                    int i32 = 0;
                    while (i32 < size3) {
                        Object obj5 = arrayListB.get(i32);
                        i32++;
                        int i33 = i31 + 1;
                        if (i31 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        Unit unit2 = (Unit) obj5;
                        String unitName2 = unit2.getUnitName();
                        kotlin.jvm.internal.m.e(unitName2, "getUnitName(...)");
                        if (oz.x.s0(unitName2, "TESTOUT", false)) {
                            unit2.setPreUnitActive(((Unit) arrayListB.get(i31 - 1)).isActive());
                            if (i33 < arrayListB.size()) {
                                unit2.setNextUnitActive(((Unit) arrayListB.get(i33)).isActive());
                            }
                        }
                        i31 = i33;
                    }
                    Integer[] numArr = {new Integer(0), new Integer(4), new Integer(5), new Integer(6), new Integer(8), new Integer(1), new Integer(10), new Integer(47), new Integer(51), new Integer(2), new Integer(53)};
                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                    if (ry.l.D(numArr, new Integer(cf.x.n().keyLanguage))) {
                        Unit unit3 = new Unit();
                        unit3.setType(3);
                        arrayListB.add(unit3);
                    } else {
                        int i34 = cf.x.n().keyLanguage;
                        if (i34 != 22 && i34 != 40 && i34 != 48 && i34 != 54 && i34 != 55) {
                            switch (i34) {
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                    j11 = 2;
                                    break;
                                default:
                                    j11 = 1;
                                    break;
                            }
                        } else {
                            j11 = 2;
                        }
                        try {
                            if (ij.d.f34419e == null) {
                                synchronized (ij.d.class) {
                                    if (ij.d.f34419e == null) {
                                        LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                                        kotlin.jvm.internal.m.c(lingoSkillApplication5);
                                        ij.d.f34419e = new ij.d(lingoSkillApplication5);
                                    }
                                }
                            }
                            ij.d dVar3 = ij.d.f34419e;
                            kotlin.jvm.internal.m.c(dVar3);
                            Object objLoad = dVar3.q().load(Long.valueOf(j11));
                            kotlin.jvm.internal.m.e(objLoad, "load(...)");
                            Long[] lArrV = ew.a.v(((Level) objLoad).getUnitList());
                            int length3 = lArrV.length;
                            while (true) {
                                length3--;
                                if (-1 < length3) {
                                    Long l9 = lArrV[length3];
                                    kotlin.jvm.internal.m.c(l9);
                                    j12 = 1;
                                    try {
                                        Unit unitF = ij.c.f(l9.longValue(), false);
                                        kotlin.jvm.internal.m.c(unitF);
                                        if (unitF.getSortIndex() > 0) {
                                            sortIndex = unitF.getSortIndex();
                                            break;
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        e.printStackTrace();
                                        sortIndex = 0;
                                    }
                                } else {
                                    j12 = 1;
                                    sortIndex = 0;
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            j12 = 1;
                            e.printStackTrace();
                            sortIndex = 0;
                            bVar = new eq.b();
                            bVar.a(com.bumptech.glide.e.s());
                            bVar2 = new eq.b();
                            if (i34 == 22) {
                                j13 = 2;
                            } else {
                                j13 = 2;
                            }
                            bVar2.a(j13 + aYZzTH.ImXVFNvdhbNLaJF + (sortIndex + 1) + ":1");
                            i11 = bVar.f25737a;
                            i12 = bVar2.f25737a;
                            if (i11 != i12) {
                                i15 = i11 - i12;
                            } else {
                                i13 = bVar.f25739c;
                                i14 = bVar2.f25739c;
                                if (i13 != i14) {
                                    i15 = i13 - i14;
                                } else {
                                    i15 = 0;
                                }
                            }
                            if (i15 >= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                z12 = z11;
                            } else {
                                z12 = z11;
                            }
                            Unit unit4 = new Unit();
                            unit4.setType(4);
                            unit4.setActive(z12);
                            arrayListB.add(unit4);
                            return arrayListB;
                        }
                        bVar = new eq.b();
                        bVar.a(com.bumptech.glide.e.s());
                        bVar2 = new eq.b();
                        if (i34 == 22 && i34 != 40 && i34 != 48 && i34 != 54 && i34 != 55) {
                            switch (i34) {
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                    j13 = 2;
                                    break;
                                default:
                                    j13 = j12;
                                    break;
                            }
                        } else {
                            j13 = 2;
                        }
                        bVar2.a(j13 + aYZzTH.ImXVFNvdhbNLaJF + (sortIndex + 1) + ":1");
                        i11 = bVar.f25737a;
                        i12 = bVar2.f25737a;
                        if (i11 != i12 && (i11 = bVar.f25738b) == (i12 = bVar2.f25738b)) {
                            i13 = bVar.f25739c;
                            i14 = bVar2.f25739c;
                            if (i13 != i14) {
                                i15 = i13 - i14;
                            } else {
                                i15 = 0;
                            }
                        } else {
                            i15 = i11 - i12;
                        }
                        if (i15 >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 || com.bumptech.glide.e.t() == null || com.bumptech.glide.e.q() < j12) {
                            z12 = z11;
                        } else {
                            if (i34 != 22 && i34 != 40 && i34 != 48 && i34 != 54 && i34 != 55) {
                                switch (i34) {
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                        j14 = 2;
                                        break;
                                    default:
                                        j14 = j12;
                                        break;
                                }
                            } else {
                                j14 = 2;
                            }
                            Long[] lArrV2 = ew.a.v(ij.c.d(j14).getUnitList());
                            Long l11 = lArrV2[lArrV2.length - 1];
                            SparseIntArray sparseIntArray = (SparseIntArray) ff.h.G(com.bumptech.glide.e.t()).f40184b;
                            if (sparseIntArray.indexOfKey((int) l11.longValue()) >= 0) {
                                Unit unitF2 = ij.c.f(l11.longValue(), false);
                                int i35 = sparseIntArray.get((int) l11.longValue());
                                LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                                if (ry.l.D(new Integer[]{num2, 48, 53, 54}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                    kotlin.jvm.internal.m.c(unitF2);
                                    length = ew.a.v(unitF2.getLessonList()).length - 1;
                                } else {
                                    kotlin.jvm.internal.m.c(unitF2);
                                    length = ew.a.v(unitF2.getLessonList()).length;
                                }
                                if (i35 > length) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                            } else {
                                z12 = z11;
                            }
                        }
                        Unit unit5 = new Unit();
                        unit5.setType(4);
                        unit5.setActive(z12);
                        arrayListB.add(unit5);
                    }
                    break;
                }
                return arrayListB;
            case 16:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gp.w wVar = (gp.w) this.f3183b;
                if (wVar.S.length() > 0 && !kotlin.jvm.internal.m.a(wVar.S, ks.f.b())) {
                    wVar.d(new ju.d(i16));
                }
                return qy.b0.f48488a;
            case 17:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new Integer(((o0) ((n0) this.f3183b)).f27733a.dailyGoal);
            case 18:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gp.n0 n0Var = (gp.n0) this.f3183b;
                i1 i1Var2 = n0Var.f29460c;
                gp.j0 j0Var = (gp.j0) i1Var2.getValue();
                Env env = ((o0) n0Var.f29458a).f27733a;
                boolean z19 = env.learningRemind;
                String str = env.learnAlarmTime;
                if (str == null) {
                    str = "19:40";
                }
                String str2 = str;
                boolean z20 = env.dailyLearningSkipIfCompleted;
                boolean z21 = env.smartReviewReminderEnabled;
                String str3 = env.smartReviewReminderTime;
                if (str3 == null) {
                    str3 = "21:40";
                }
                gp.j0 j0VarA = gp.j0.a(j0Var, z19, str2, z20, z21, str3, null, 64);
                i1Var2.getClass();
                i1Var2.l(null, j0VarA);
                return qy.b0.f48488a;
            case 19:
                return e(obj);
            case 20:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                PdLessonDao pdLessonDao = PdLessonDbHelper.INSTANCE.pdLessonDao();
                int[] iArr3 = bq.r.f4959a;
                LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                return pdLessonDao.load(bq.m.l(cf.x.n().keyLanguage, ((Number) ((PdLearnIndexActivity) this.f3183b).H.getValue()).longValue()));
            case 21:
                return j(obj);
            case 22:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                j9.v vVar = (j9.v) this.f3183b;
                if (!vVar.c()) {
                    j9.v.b(vVar, "syllable_index");
                }
                return qy.b0.f48488a;
            case 23:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return ij.c.f(((p0) this.f3183b).S, true);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return m(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return n(obj);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return o(obj);
            case 27:
                return p(obj);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return q(obj);
            default:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l0 l0Var = (l0) this.f3183b;
                b1 b1Var = l0Var.f37030h;
                int i36 = l0Var.f37026d;
                List list = l0Var.f37024b;
                Iterable<CourseWord> iterable = (Iterable) b1Var.getValue();
                ArrayList arrayList4 = new ArrayList(ry.n.W(iterable, 10));
                for (CourseWord courseWordCopy$default : iterable) {
                    if (courseWordCopy$default.getSelectedState() == OptionItemSelectedState.SELECTED) {
                        String word = courseWordCopy$default.getWord();
                        b1 b1Var2 = l0Var.f37027e;
                        if (dt.a0.C(i36, word).equals(dt.a0.C(i36, ((CourseWord) ry.m.q0(list)).getWord()))) {
                            b1Var2.setValue(ht.q.CORRECT);
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                        } else {
                            b1Var2.setValue(ht.q.WRONG);
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                        }
                    }
                    arrayList4.add(courseWordCopy$default);
                }
                b1Var.setValue(arrayList4);
                b1 b1Var3 = l0Var.f37029g;
                Iterable<CourseWord> iterable2 = (Iterable) b1Var3.getValue();
                ArrayList arrayList5 = new ArrayList(ry.n.W(iterable2, 10));
                for (CourseWord courseWordCopy$default2 : iterable2) {
                    if (courseWordCopy$default2.isQuestionWord()) {
                        courseWordCopy$default2 = dt.a0.C(i36, courseWordCopy$default2.getWord()).equals(dt.a0.C(i36, ((CourseWord) ry.m.q0(list)).getWord())) ? CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                    }
                    arrayList5.add(courseWordCopy$default2);
                }
                b1Var3.setValue(arrayList5);
                return qy.b0.f48488a;
        }
    }
}
