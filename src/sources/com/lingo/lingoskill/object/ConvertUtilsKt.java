package com.lingo.lingoskill.object;

import android.net.Uri;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import b7.e0;
import bp.h1;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.object.PodQuestion;
import com.lingo.lingoskill.speak.object.PodSelect;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.speak.object.PodTrans;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseSentenceModel000;
import com.lingodeer.data.model.CourseSentenceModel010;
import com.lingodeer.data.model.CourseSentenceModel020;
import com.lingodeer.data.model.CourseSentenceModel030;
import com.lingodeer.data.model.CourseSentenceModel040;
import com.lingodeer.data.model.CourseSentenceModel050;
import com.lingodeer.data.model.CourseSentenceModel060;
import com.lingodeer.data.model.CourseSentenceModel070;
import com.lingodeer.data.model.CourseSentenceModel080;
import com.lingodeer.data.model.CourseSentenceModel090;
import com.lingodeer.data.model.CourseSentenceModel100;
import com.lingodeer.data.model.CourseSentenceModelQA;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.CourseWordModel010;
import com.lingodeer.data.model.SentenceMFType;
import com.lingodeer.data.model.WordSentenceSourceKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.o0;
import fz.c;
import fz.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jh.h;
import k10.g;
import l0.Eeqr.HOBXIlHxIkMBEA;
import ns.o;
import oz.x;
import qy.q;
import ry.l;
import ry.m;
import ry.n;
import ry.r;
import xt.b;
import xt.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConvertUtilsKt {
    private static final CourseWord mergeWords(List<CourseWord> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        String strY0 = m.y0(list, BuildConfig.VERSION_NAME, null, null, new a(0), 30);
        CourseWord courseWord = list.get(0);
        return new CourseWord(courseWord.getWordId(), strY0, m.y0(list, " ", null, null, new a(2), 30), m.y0(list, " ", null, null, new a(3), 30), m.y0(list, " ", null, null, new a(4), 30), m.y0(list, " ", null, null, new a(5), 30), courseWord.getWordType(), courseWord.getAnimation(), null, null, courseWord.getMainPic(), courseWord.getPos(), courseWord.getFeatured(), null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -7424, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mergeWords$lambda$61(CourseWord it) {
        kotlin.jvm.internal.m.f(it, "it");
        return it.getWord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mergeWords$lambda$62(CourseWord it) {
        kotlin.jvm.internal.m.f(it, "it");
        return it.getZhuYin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mergeWords$lambda$63(CourseWord it) {
        kotlin.jvm.internal.m.f(it, "it");
        return it.getLuoMa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mergeWords$lambda$64(CourseWord it) {
        kotlin.jvm.internal.m.f(it, "it");
        return it.getTranslation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence mergeWords$lambda$65(CourseWord it) {
        kotlin.jvm.internal.m.f(it, "it");
        return it.getExplain();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x009a A[RETURN] */
    private static final List<CourseWord> reChunkSentence(List<CourseWord> list, c cVar, boolean z11) {
        int iNextIndex;
        Object obj;
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        for (CourseWord courseWord : list) {
            arrayList.add(CourseWord.copy$default(courseWord, 0L, null, courseWord.getFixedZhuYin(), null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -5, 63, null));
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i11 = 0;
            do {
                if (i11 >= size) {
                    if (z11) {
                        break;
                    }
                    return arrayList;
                }
                obj = arrayList.get(i11);
                i11++;
            } while (!((Boolean) cVar.invoke((CourseWord) obj)).booleanValue());
        } else if (z11) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            CourseWord courseWord2 = (CourseWord) obj2;
            if (((Boolean) cVar.invoke(courseWord2)).booleanValue()) {
                if (!arrayList3.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        arrayList2.add(mergeWords(arrayList3));
                        break;
                    }
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size3) {
                            arrayList2.add(mergeWords(arrayList3));
                            break;
                        }
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        if (((CourseWord) obj3).getWordType() == 1) {
                            arrayList2.addAll(arrayList3);
                            break;
                        }
                    }
                    arrayList3.clear();
                }
                arrayList2.add(CourseWord.copy$default(courseWord2, 0L, null, courseWord2.getFixedZhuYin(), null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -5, 63, null));
            } else {
                arrayList3.add(courseWord2);
            }
        }
        if (!arrayList3.isEmpty()) {
            ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                if (((CourseWord) listIterator.previous()).getWordType() == 1) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex != -1) {
                if (iNextIndex > 0) {
                    arrayList2.add(mergeWords(arrayList3.subList(0, iNextIndex)));
                }
                arrayList2.add(arrayList3.get(iNextIndex));
                return arrayList2;
            }
            arrayList2.add(mergeWords(arrayList3));
        }
        return arrayList2;
    }

    public static final CourseACK toACKItem(Ack ack) {
        kotlin.jvm.internal.m.f(ack, "<this>");
        long id2 = ack.getId();
        String grammarACK = ack.getGrammarACK();
        kotlin.jvm.internal.m.e(grammarACK, "getGrammarACK(...)");
        String transaltion = ack.getTransaltion();
        kotlin.jvm.internal.m.e(transaltion, "getTransaltion(...)");
        String explanation = ack.getExplanation();
        kotlin.jvm.internal.m.e(explanation, "getExplanation(...)");
        long unitId = ack.getUnitId();
        String examples = ack.getExamples();
        kotlin.jvm.internal.m.e(examples, "getExamples(...)");
        return new CourseACK(id2, grammarACK, transaltion, explanation, unitId, examples, 0, false, null, false, null, null, null, 8128, null);
    }

    public static final CourseCharacter toCharacterItem(HwCharacter hwCharacter, int i11, boolean z11) {
        List listD;
        List listD2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String animationExplanation;
        kotlin.jvm.internal.m.f(hwCharacter, "<this>");
        r rVar = r.f50854a;
        if (d.v(i11)) {
            Object value = ((q) h.p().f44927c).getValue();
            kotlin.jvm.internal.m.e(value, "getValue(...)");
            g gVarQueryBuilder = ((HwCharPartDao) value).queryBuilder();
            gVarQueryBuilder.f(HwCharPartDao.Properties.CharId.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
            listD2 = gVarQueryBuilder.d();
            kotlin.jvm.internal.m.e(listD2, "list(...)");
            Object value2 = ((q) h.p().f44928d).getValue();
            kotlin.jvm.internal.m.e(value2, "getValue(...)");
            g gVarQueryBuilder2 = ((HwTCharPartDao) value2).queryBuilder();
            gVarQueryBuilder2.f(HwTCharPartDao.Properties.CharId.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
            listD = gVarQueryBuilder2.d();
            kotlin.jvm.internal.m.e(listD, "list(...)");
        } else {
            if (dm.c.f23488f == null) {
                synchronized (dm.c.class) {
                    if (dm.c.f23488f == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        dm.c.f23488f = new dm.c(lingoSkillApplication);
                    }
                }
            }
            dm.c cVar = dm.c.f23488f;
            kotlin.jvm.internal.m.c(cVar);
            Object value3 = ((q) cVar.f23493e).getValue();
            kotlin.jvm.internal.m.e(value3, "getValue(...)");
            g gVarQueryBuilder3 = ((HwCharPartDao) value3).queryBuilder();
            gVarQueryBuilder3.f(HwCharPartDao.Properties.CharId.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
            List listD3 = gVarQueryBuilder3.d();
            kotlin.jvm.internal.m.e(listD3, "list(...)");
            listD = rVar;
            listD2 = listD3;
        }
        try {
            if (d.w(i11) && z11) {
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication2);
                            ij.d.f34419e = new ij.d(lingoSkillApplication2);
                        }
                    }
                }
                kotlin.jvm.internal.m.c(ij.d.f34419e);
                g gVarQueryBuilder4 = ij.d.j().queryBuilder();
                gVarQueryBuilder4.e(" ASC", JPCharPartDao.Properties.PartIndex);
                gVarQueryBuilder4.f(JPCharPartDao.Properties.CharId.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
                List<JPCharPart> listD4 = gVarQueryBuilder4.d();
                arrayList = e0.r("list(...)", listD4);
                arrayList2 = new ArrayList();
                for (JPCharPart jPCharPart : listD4) {
                    String partDirection = jPCharPart.getPartDirection();
                    kotlin.jvm.internal.m.e(partDirection, "getPartDirection(...)");
                    arrayList.add(partDirection);
                    String partPath = jPCharPart.getPartPath();
                    kotlin.jvm.internal.m.e(partPath, "getPartPath(...)");
                    arrayList2.add(partPath);
                }
            } else {
                if (!d.x(i11) || !z11) {
                    int i12 = 1;
                    if (((o0) b.c()).s() == 1 && !kotlin.jvm.internal.m.a(hwCharacter.getTCharacter(), hwCharacter.getCharacter()) && d.v(i11)) {
                        Collections.sort(listD, new com.google.android.material.button.a(new h1(24), i12));
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it = listD.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(((HwTCharPart) it.next()).getPartDirection());
                        }
                        arrayList2 = new ArrayList();
                        Iterator it2 = listD.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((HwTCharPart) it2.next()).getPartPath());
                        }
                        arrayList3 = arrayList4;
                    } else {
                        Collections.sort(listD2, new com.google.android.material.button.a(new h1(25), 2));
                        arrayList = new ArrayList();
                        Iterator it3 = listD2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((HwCharPart) it3.next()).getPartDirection());
                        }
                        arrayList2 = new ArrayList();
                        Iterator it4 = listD2.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((HwCharPart) it4.next()).getPartPath());
                        }
                    }
                    ArrayList arrayList5 = arrayList2;
                    long charId = hwCharacter.getCharId();
                    if (((o0) b.c()).s() == 0 ? (tCharacter = hwCharacter.getTCharacter()) == null : (tCharacter = hwCharacter.getCharacter()) == null) {
                    }
                    String str = tCharacter;
                    if (((o0) b.c()).s() == 0 ? (tCharPath = hwCharacter.getTCharPath()) == null : (tCharPath = hwCharacter.getCharPath()) == null) {
                    }
                    String str2 = tCharPath;
                    String pinyin = hwCharacter.getPinyin();
                    kotlin.jvm.internal.m.e(pinyin, "getPinyin(...)");
                    int animation = hwCharacter.getAnimation();
                    String translation = hwCharacter.getTranslation();
                    kotlin.jvm.internal.m.e(translation, "getTranslation(...)");
                    animationExplanation = hwCharacter.getAnimationExplanation();
                    String str3 = animationExplanation;
                    kotlin.jvm.internal.m.c(str3);
                    q qVar = fv.b.f28186a;
                    String pinyin2 = hwCharacter.getPinyin();
                    kotlin.jvm.internal.m.e(pinyin2, "getPinyin(...)");
                    Uri uri = Uri.parse(fv.b.l0(pinyin2));
                    kotlin.jvm.internal.m.e(uri, "parse(...)");
                    long charId2 = hwCharacter.getCharId();
                    Uri uri2 = Uri.parse(b.a().k() + fv.g.g(charId2));
                    kotlin.jvm.internal.m.e(uri2, "parse(...)");
                    return new CourseCharacter(charId, str, str2, pinyin, animation, translation, str3, arrayList3, arrayList5, null, uri, uri2, null, 4608, null);
                }
                if (wm.a.f55177e == null) {
                    synchronized (wm.a.class) {
                        if (wm.a.f55177e == null) {
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication3);
                            wm.a.f55177e = new wm.a(lingoSkillApplication3);
                        }
                    }
                }
                wm.a aVar = wm.a.f55177e;
                kotlin.jvm.internal.m.c(aVar);
                g gVarQueryBuilder5 = aVar.f55180c.queryBuilder();
                gVarQueryBuilder5.e(" ASC", KOCharPartDao.Properties.PartIndex);
                gVarQueryBuilder5.f(KOCharPartDao.Properties.CharId.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
                List<KOCharPart> listD5 = gVarQueryBuilder5.d();
                arrayList = e0.r("list(...)", listD5);
                arrayList2 = new ArrayList();
                for (KOCharPart kOCharPart : listD5) {
                    String partDirection2 = kOCharPart.getPartDirection();
                    kotlin.jvm.internal.m.e(partDirection2, "getPartDirection(...)");
                    arrayList.add(partDirection2);
                    String partPath2 = kOCharPart.getPartPath();
                    kotlin.jvm.internal.m.e(partPath2, "getPartPath(...)");
                    arrayList2.add(partPath2);
                }
            }
            animationExplanation = hwCharacter.getAnimationExplanation();
        } catch (Exception unused) {
            animationExplanation = BuildConfig.VERSION_NAME;
        }
        arrayList3 = arrayList;
        ArrayList arrayList6 = arrayList2;
        long charId3 = hwCharacter.getCharId();
        String tCharacter = ((o0) b.c()).s() == 0 ? BuildConfig.VERSION_NAME : BuildConfig.VERSION_NAME;
        String str4 = tCharacter;
        String tCharPath = ((o0) b.c()).s() == 0 ? BuildConfig.VERSION_NAME : BuildConfig.VERSION_NAME;
        String str5 = tCharPath;
        String pinyin3 = hwCharacter.getPinyin();
        kotlin.jvm.internal.m.e(pinyin3, "getPinyin(...)");
        int animation2 = hwCharacter.getAnimation();
        String translation2 = hwCharacter.getTranslation();
        kotlin.jvm.internal.m.e(translation2, "getTranslation(...)");
        String str6 = animationExplanation;
        kotlin.jvm.internal.m.c(str6);
        q qVar2 = fv.b.f28186a;
        String pinyin4 = hwCharacter.getPinyin();
        kotlin.jvm.internal.m.e(pinyin4, "getPinyin(...)");
        Uri uri3 = Uri.parse(fv.b.l0(pinyin4));
        kotlin.jvm.internal.m.e(uri3, "parse(...)");
        long charId4 = hwCharacter.getCharId();
        Uri uri4 = Uri.parse(b.a().k() + fv.g.g(charId4));
        kotlin.jvm.internal.m.e(uri4, "parse(...)");
        return new CourseCharacter(charId3, str4, str5, pinyin3, animation2, translation2, str6, arrayList3, arrayList6, null, uri3, uri4, null, 4608, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toCharacterItem$lambda$3(e eVar, Object obj, Object obj2) {
        return ((Number) eVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toCharacterItem$lambda$5(e eVar, Object obj, Object obj2) {
        return ((Number) eVar.invoke(obj, obj2)).intValue();
    }

    public static final CourseLesson toCourseLesson(Lesson lesson) {
        String str;
        String strQ0;
        String str2;
        String str3;
        String str4;
        kotlin.jvm.internal.m.f(lesson, "<this>");
        long lessonId = lesson.getLessonId();
        try {
            String lessonName = lesson.getLessonName();
            if (lessonName == null) {
                lessonName = BuildConfig.VERSION_NAME;
            }
            str = lessonName;
        } catch (Exception unused) {
            str = BuildConfig.VERSION_NAME;
        }
        try {
            String description = lesson.getDescription();
            kotlin.jvm.internal.m.e(description, "getDescription(...)");
            strQ0 = x.q0(description, "\n\n", "\n");
        } catch (Exception unused2) {
            strQ0 = BuildConfig.VERSION_NAME;
        }
        int sortIndex = lesson.getSortIndex();
        try {
            String normalRegex = lesson.getNormalRegex();
            if (normalRegex == null) {
                normalRegex = BuildConfig.VERSION_NAME;
            }
            str2 = normalRegex;
        } catch (Exception unused3) {
            str2 = BuildConfig.VERSION_NAME;
        }
        try {
            String lastRegex = lesson.getLastRegex();
            if (lastRegex == null) {
                lastRegex = BuildConfig.VERSION_NAME;
            }
            str3 = lastRegex;
        } catch (Exception unused4) {
            str3 = BuildConfig.VERSION_NAME;
        }
        try {
            String repeatRegex = lesson.getRepeatRegex();
            if (repeatRegex == null) {
                repeatRegex = BuildConfig.VERSION_NAME;
            }
            str4 = repeatRegex;
        } catch (Exception unused5) {
            str4 = BuildConfig.VERSION_NAME;
        }
        String challengeRegex = lesson.getChallengeRegex();
        String str5 = challengeRegex == null ? BuildConfig.VERSION_NAME : challengeRegex;
        String wordList = lesson.getWordList();
        kotlin.jvm.internal.m.e(wordList, "getWordList(...)");
        String sentenceList = lesson.getSentenceList();
        kotlin.jvm.internal.m.e(sentenceList, "getSentenceList(...)");
        String characterList = lesson.getCharacterList();
        kotlin.jvm.internal.m.e(characterList, "getCharacterList(...)");
        return new CourseLesson(lessonId, str, strQ0, sortIndex, str2, str3, str4, str5, wordList, sentenceList, characterList, lesson.getUnitId(), null, 0, false, false, false, null, false, false, false, 0, null, null, null, 33550336, null);
    }

    public static final CourseSentenceModel000 toCourseSentenceModel000(Model_Sentence_000 model_Sentence_000) {
        kotlin.jvm.internal.m.f(model_Sentence_000, "<this>");
        long id2 = model_Sentence_000.getId();
        long sentenceId = model_Sentence_000.getSentenceId();
        String explanation = model_Sentence_000.getExplanation();
        kotlin.jvm.internal.m.e(explanation, "getExplanation(...)");
        return new CourseSentenceModel000(id2, sentenceId, explanation);
    }

    public static final CourseSentenceModel010 toCourseSentenceModel010(Model_Sentence_010 model_Sentence_010) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_010, "<this>");
        long id2 = model_Sentence_010.getId();
        long sentenceId = model_Sentence_010.getSentenceId();
        String sentenceStem = model_Sentence_010.getSentenceStem();
        kotlin.jvm.internal.m.e(sentenceStem, "getSentenceStem(...)");
        String options = model_Sentence_010.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        String tOptions = model_Sentence_010.getTOptions();
        if (tOptions == null) {
            tOptions = BuildConfig.VERSION_NAME;
        }
        String str = tOptions;
        String answer = model_Sentence_010.getAnswer();
        kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
        Sentence sentence = model_Sentence_010.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Sentence> optionList = model_Sentence_010.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList = new ArrayList(n.W(optionList, 10));
        for (Sentence sentence2 : optionList) {
            kotlin.jvm.internal.m.c(sentence2);
            arrayList.add(toSentenceItem(sentence2));
        }
        return new CourseSentenceModel010(id2, sentenceId, sentenceStem, options, str, answer, sentenceItem, arrayList);
    }

    public static final CourseSentenceModel020 toCourseSentenceModel020(Model_Sentence_020 model_Sentence_020) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_020, "<this>");
        long id2 = model_Sentence_020.getId();
        long sentenceId = model_Sentence_020.getSentenceId();
        String answer = model_Sentence_020.getAnswer();
        kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
        Sentence sentence = model_Sentence_020.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Word> answerList = model_Sentence_020.getAnswerList();
        kotlin.jvm.internal.m.e(answerList, "getAnswerList(...)");
        ArrayList arrayList = new ArrayList(n.W(answerList, 10));
        for (Word word : answerList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        return new CourseSentenceModel020(id2, sentenceId, answer, sentenceItem, arrayList);
    }

    public static final CourseSentenceModel030 toCourseSentenceModel030(Model_Sentence_030 model_Sentence_030) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_030, "<this>");
        long id2 = model_Sentence_030.getId();
        long sentenceId = model_Sentence_030.getSentenceId();
        String stem = model_Sentence_030.getStem();
        kotlin.jvm.internal.m.e(stem, "getStem(...)");
        String options = model_Sentence_030.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        String answer = model_Sentence_030.getAnswer();
        kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
        Sentence sentence = model_Sentence_030.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Word> stemList = model_Sentence_030.getStemList();
        kotlin.jvm.internal.m.e(stemList, "getStemList(...)");
        ArrayList arrayList = new ArrayList(n.W(stemList, 10));
        for (Word word : stemList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        List<Word> optionList = model_Sentence_030.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList2 = new ArrayList(n.W(optionList, 10));
        for (Word word2 : optionList) {
            kotlin.jvm.internal.m.c(word2);
            arrayList2.add(toWordItem(word2));
        }
        List<Word> answerList = model_Sentence_030.getAnswerList();
        kotlin.jvm.internal.m.e(answerList, "getAnswerList(...)");
        ArrayList arrayList3 = new ArrayList(n.W(answerList, 10));
        for (Word word3 : answerList) {
            kotlin.jvm.internal.m.c(word3);
            arrayList3.add(toWordItem(word3));
        }
        return new CourseSentenceModel030(id2, sentenceId, stem, options, answer, sentenceItem, arrayList, arrayList2, arrayList3);
    }

    public static final CourseSentenceModel040 toCourseSentenceModel040(Model_Sentence_040 model_Sentence_040) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_040, "<this>");
        long id2 = model_Sentence_040.getId();
        long sentenceId = model_Sentence_040.getSentenceId();
        String options = model_Sentence_040.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        long answer = model_Sentence_040.getAnswer();
        Sentence sentence = model_Sentence_040.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Word> optionList = model_Sentence_040.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList = new ArrayList(n.W(optionList, 10));
        for (Word word : optionList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        return new CourseSentenceModel040(id2, sentenceId, options, answer, sentenceItem, arrayList);
    }

    public static final CourseSentenceModel050 toCourseSentenceModel050(Model_Sentence_050 model_Sentence_050) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_050, "<this>");
        long id2 = model_Sentence_050.getId();
        long sentenceId = model_Sentence_050.getSentenceId();
        String options = model_Sentence_050.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        String answer = model_Sentence_050.getAnswer();
        kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
        Sentence sentence = model_Sentence_050.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Word> optionList = model_Sentence_050.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList = new ArrayList(n.W(optionList, 10));
        for (Word word : optionList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        List<List<Long>> answerList = model_Sentence_050.getAnswerList();
        kotlin.jvm.internal.m.e(answerList, "getAnswerList(...)");
        return new CourseSentenceModel050(id2, sentenceId, options, answer, sentenceItem, arrayList, answerList);
    }

    public static final CourseSentenceModel060 toCourseSentenceModel060(Model_Sentence_060 model_Sentence_060) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_060, "<this>");
        long id2 = model_Sentence_060.getId();
        long sentenceId = model_Sentence_060.getSentenceId();
        String sentenceStem = model_Sentence_060.getSentenceStem();
        kotlin.jvm.internal.m.e(sentenceStem, "getSentenceStem(...)");
        String options = model_Sentence_060.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        Sentence sentence = model_Sentence_060.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Word> stemList = model_Sentence_060.getStemList();
        kotlin.jvm.internal.m.e(stemList, "getStemList(...)");
        ArrayList arrayList = new ArrayList(n.W(stemList, 10));
        for (Word word : stemList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        List<Word> optionList = model_Sentence_060.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList2 = new ArrayList(n.W(optionList, 10));
        for (Word word2 : optionList) {
            kotlin.jvm.internal.m.c(word2);
            arrayList2.add(toWordItem(word2));
        }
        return new CourseSentenceModel060(id2, sentenceId, sentenceStem, options, sentenceItem, arrayList, arrayList2);
    }

    public static final CourseSentenceModel070 toCourseSentenceModel070(Model_Sentence_070 model_Sentence_070) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_070, "<this>");
        long id2 = model_Sentence_070.getId();
        long sentenceId = model_Sentence_070.getSentenceId();
        String options = model_Sentence_070.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        String answer = model_Sentence_070.getAnswer();
        kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
        Sentence sentence = model_Sentence_070.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Word> optionList = model_Sentence_070.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList = new ArrayList(n.W(optionList, 10));
        for (Word word : optionList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        return new CourseSentenceModel070(id2, sentenceId, options, answer, sentenceItem, arrayList);
    }

    public static final CourseSentenceModel080 toCourseSentenceModel080(Model_Sentence_080 model_Sentence_080) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_080, "<this>");
        long id2 = model_Sentence_080.getId();
        long sentenceId = model_Sentence_080.getSentenceId();
        String options = model_Sentence_080.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        long answer = model_Sentence_080.getAnswer();
        Sentence sentence = model_Sentence_080.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Sentence> optionList = model_Sentence_080.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList = new ArrayList(n.W(optionList, 10));
        for (Sentence sentence2 : optionList) {
            kotlin.jvm.internal.m.c(sentence2);
            arrayList.add(toSentenceItem(sentence2));
        }
        Sentence answerSentence = model_Sentence_080.getAnswerSentence();
        kotlin.jvm.internal.m.e(answerSentence, "getAnswerSentence(...)");
        return new CourseSentenceModel080(id2, sentenceId, options, answer, sentenceItem, arrayList, toSentenceItem(answerSentence));
    }

    public static final CourseSentenceModel090 toCourseSentenceModel090(Model_Sentence_090 model_Sentence_090) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_090, "<this>");
        long id2 = model_Sentence_090.getId();
        long sentenceId = model_Sentence_090.getSentenceId();
        String sentenceStem = model_Sentence_090.getSentenceStem();
        kotlin.jvm.internal.m.e(sentenceStem, "getSentenceStem(...)");
        String options = model_Sentence_090.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        Sentence sentence = model_Sentence_090.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Word> stemList = model_Sentence_090.getStemList();
        kotlin.jvm.internal.m.e(stemList, "getStemList(...)");
        ArrayList arrayList = new ArrayList(n.W(stemList, 10));
        for (Word word : stemList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        List<Word> optionList = model_Sentence_090.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList2 = new ArrayList(n.W(optionList, 10));
        for (Word word2 : optionList) {
            kotlin.jvm.internal.m.c(word2);
            arrayList2.add(toWordItem(word2));
        }
        return new CourseSentenceModel090(id2, sentenceId, sentenceStem, options, sentenceItem, arrayList, arrayList2);
    }

    public static final CourseSentenceModel100 toCourseSentenceModel100(Model_Sentence_100 model_Sentence_100) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_100, "<this>");
        long id2 = model_Sentence_100.getId();
        long sentenceId = model_Sentence_100.getSentenceId();
        String sentenceStem = model_Sentence_100.getSentenceStem();
        kotlin.jvm.internal.m.e(sentenceStem, "getSentenceStem(...)");
        String options = model_Sentence_100.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        Sentence sentence = model_Sentence_100.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        List<Word> stemList = model_Sentence_100.getStemList();
        kotlin.jvm.internal.m.e(stemList, "getStemList(...)");
        ArrayList arrayList = new ArrayList(n.W(stemList, 10));
        for (Word word : stemList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        List<Word> optionList = model_Sentence_100.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList2 = new ArrayList(n.W(optionList, 10));
        for (Word word2 : optionList) {
            kotlin.jvm.internal.m.c(word2);
            arrayList2.add(toWordItem(word2));
        }
        return new CourseSentenceModel100(id2, sentenceId, sentenceStem, options, sentenceItem, arrayList, arrayList2);
    }

    public static final CourseSentenceModelQA toCourseSentenceModelQA(Model_Sentence_QA model_Sentence_QA) throws Throwable {
        kotlin.jvm.internal.m.f(model_Sentence_QA, "<this>");
        long id2 = model_Sentence_QA.getId();
        long sentenceId = model_Sentence_QA.getSentenceId();
        long sentenceStem = model_Sentence_QA.getSentenceStem();
        String options = model_Sentence_QA.getOptions();
        kotlin.jvm.internal.m.e(options, "getOptions(...)");
        String optPosition = model_Sentence_QA.getOptPosition();
        kotlin.jvm.internal.m.e(optPosition, "getOptPosition(...)");
        String answer = model_Sentence_QA.getAnswer();
        kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
        Sentence sentence = model_Sentence_QA.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        CourseSentence sentenceItem = toSentenceItem(sentence);
        Sentence sentence2 = model_Sentence_QA.getSentence2();
        kotlin.jvm.internal.m.e(sentence2, "getSentence2(...)");
        CourseSentence sentenceItem2 = toSentenceItem(sentence2);
        List<Word> optionList = model_Sentence_QA.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList = new ArrayList(n.W(optionList, 10));
        for (Word word : optionList) {
            kotlin.jvm.internal.m.c(word);
            arrayList.add(toWordItem(word));
        }
        return new CourseSentenceModelQA(id2, sentenceId, sentenceStem, options, optPosition, answer, sentenceItem, sentenceItem2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ry.r] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    public static final <T extends op.b, F extends op.a> ir.b toCourseStorySentence(PodSentence<T, F> podSentence, int i11) {
        Collection determine;
        CourseWord spaceCourseWord;
        Object objL;
        String answer;
        List options;
        op.a title;
        List determine2;
        Collection select;
        CourseWord spaceCourseWord2;
        Object objL2;
        String answer2;
        List options2;
        op.a title2;
        List select2;
        kotlin.jvm.internal.m.f(podSentence, "<this>");
        PodQuestion<F> questions = podSentence.getQuestions();
        String str = "0";
        ?? arrayList = r.f50854a;
        int i12 = 0;
        ir.a aVar = null;
        if (questions == null || (select = questions.getSelect()) == null || !(!select.isEmpty())) {
            PodQuestion<F> questions2 = podSentence.getQuestions();
            if (questions2 != null && (determine = questions2.getDetermine()) != null && (!determine.isEmpty())) {
                PodQuestion<F> questions3 = podSentence.getQuestions();
                PodSelect podSelect = (questions3 == null || (determine2 = questions3.getDetermine()) == null) ? null : (PodSelect) m.q0(determine2);
                if (podSelect == null || (title = podSelect.getTitle()) == null || (spaceCourseWord = toWordItem(title)) == null) {
                    spaceCourseWord = WordSentenceSourceKt.getSpaceCourseWord();
                }
                if (podSelect != null && (options = podSelect.getOptions()) != null) {
                    arrayList = new ArrayList(n.W(options, 10));
                    for (Object obj : options) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            o.V();
                            throw null;
                        }
                        op.a aVar2 = (op.a) obj;
                        kotlin.jvm.internal.m.c(aVar2);
                        arrayList.add(CourseWord.copy$default(toWordItem(aVar2), i13, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                        i12 = i13;
                    }
                }
                if (podSelect != null && (answer = podSelect.getAnswer()) != null) {
                    str = answer;
                }
                if (podSelect != null) {
                    try {
                        PodTrans trans = podSelect.getTrans();
                        if (trans == null || (objL = trans.getTrans()) == null) {
                            objL = BuildConfig.VERSION_NAME;
                        }
                    } catch (Throwable th2) {
                        objL = com.bumptech.glide.e.l(th2);
                    }
                } else {
                    objL = BuildConfig.VERSION_NAME;
                }
                aVar = new ir.a(spaceCourseWord, arrayList, str, qy.o.a(objL) == null ? (String) objL : BuildConfig.VERSION_NAME);
            }
        } else {
            PodQuestion<F> questions4 = podSentence.getQuestions();
            PodSelect podSelect2 = (questions4 == null || (select2 = questions4.getSelect()) == null) ? null : (PodSelect) m.q0(select2);
            if (podSelect2 == null || (title2 = podSelect2.getTitle()) == null || (spaceCourseWord2 = toWordItem(title2)) == null) {
                spaceCourseWord2 = WordSentenceSourceKt.getSpaceCourseWord();
            }
            if (podSelect2 != null && (options2 = podSelect2.getOptions()) != null) {
                arrayList = new ArrayList(n.W(options2, 10));
                for (Object obj2 : options2) {
                    int i14 = i12 + 1;
                    if (i12 < 0) {
                        o.V();
                        throw null;
                    }
                    op.a aVar3 = (op.a) obj2;
                    kotlin.jvm.internal.m.c(aVar3);
                    arrayList.add(CourseWord.copy$default(toWordItem(aVar3), i14, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                    i12 = i14;
                }
            }
            if (podSelect2 != null && (answer2 = podSelect2.getAnswer()) != null) {
                str = answer2;
            }
            if (podSelect2 != null) {
                try {
                    PodTrans trans2 = podSelect2.getTrans();
                    if (trans2 == null || (objL2 = trans2.getTrans()) == null) {
                        objL2 = BuildConfig.VERSION_NAME;
                    }
                } catch (Throwable th3) {
                    objL2 = com.bumptech.glide.e.l(th3);
                }
            } else {
                objL2 = BuildConfig.VERSION_NAME;
            }
            aVar = new ir.a(spaceCourseWord2, arrayList, str, qy.o.a(objL2) == null ? (String) objL2 : BuildConfig.VERSION_NAME);
        }
        CourseSentence courseSentence = new CourseSentence(podSentence.getSid());
        List<T> words = podSentence.getWords();
        kotlin.jvm.internal.m.e(words, "getWords(...)");
        ArrayList arrayList2 = new ArrayList(n.W(words, 10));
        for (T t6 : words) {
            kotlin.jvm.internal.m.c(t6);
            arrayList2.add(toWordItem(t6));
        }
        ArrayList arrayListG = c.a.G(((o0) b.c()).f27733a.keyLanguage, arrayList2);
        q qVar = fv.b.f28186a;
        long sid = podSentence.getSid();
        String strO = b.a().o();
        String str2 = fv.b.w().f() ? "m" : "f";
        Uri uri = Uri.parse(strO + (d.e(fv.b.k().keyLanguage) + "-" + str2 + "-s-" + i11 + "-" + sid + ".mp3"));
        kotlin.jvm.internal.m.e(uri, "parse(...)");
        String trans3 = podSentence.getTrans().getTrans();
        return new ir.b(CourseSentence.copy$default(courseSentence, 0L, null, null, null, trans3 == null ? BuildConfig.VERSION_NAME : trans3, null, null, uri, null, false, false, false, null, arrayListG, null, null, null, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8380271, null), aVar);
    }

    public static final CourseWordModel010 toCourseWordModel010(Model_Word_010 model_Word_010) {
        kotlin.jvm.internal.m.f(model_Word_010, "<this>");
        long id2 = model_Word_010.getId();
        long wordId = model_Word_010.getWordId();
        String imageOptions = model_Word_010.getImageOptions();
        kotlin.jvm.internal.m.e(imageOptions, "getImageOptions(...)");
        String answer = model_Word_010.getAnswer();
        kotlin.jvm.internal.m.e(answer, "getAnswer(...)");
        Word word = model_Word_010.getWord();
        kotlin.jvm.internal.m.e(word, "getWord(...)");
        CourseWord wordItem = toWordItem(word);
        List<Word> optionList = model_Word_010.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList = new ArrayList(n.W(optionList, 10));
        for (Word word2 : optionList) {
            kotlin.jvm.internal.m.c(word2);
            arrayList.add(toWordItem(word2));
        }
        return new CourseWordModel010(id2, wordId, imageOptions, answer, wordItem, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0453  */
    /* JADX WARN: Code duplicated, block: B:104:0x0467  */
    /* JADX WARN: Code duplicated, block: B:119:0x050c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0523  */
    /* JADX WARN: Code duplicated, block: B:123:0x052d A[LOOP:6: B:120:0x0521->B:123:0x052d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x0593  */
    /* JADX WARN: Code duplicated, block: B:128:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:130:0x05b4 A[LOOP:7: B:127:0x05a8->B:130:0x05b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x061a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0633  */
    /* JADX WARN: Code duplicated, block: B:137:0x063d A[LOOP:8: B:134:0x0631->B:137:0x063d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:150:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:151:0x0724  */
    /* JADX WARN: Code duplicated, block: B:153:0x0734  */
    /* JADX WARN: Code duplicated, block: B:154:0x075a  */
    /* JADX WARN: Code duplicated, block: B:157:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:159:0x07be  */
    /* JADX WARN: Code duplicated, block: B:161:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:162:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x06b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x0449  */
    /* JADX WARN: Instruction removed from duplicated block: B:150:0x06fe, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x0734, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.lang.Integer, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.util.ArrayList] */
    public static final CourseSentence toSentenceItem(Sentence sentence) throws Throwable {
        int i11;
        boolean z11;
        int i12;
        Throwable th2;
        int i13;
        ArrayList arrayListG;
        int i14;
        int i15;
        int i16;
        ?? K;
        int i17;
        CourseWord courseWord;
        ?? K2;
        ArrayList arrayList;
        int size;
        int i18;
        int i19;
        Uri uri;
        int itemType;
        SentenceMFType sentenceMFType;
        Object obj;
        int i21;
        CourseWord courseWord2;
        int i22;
        ?? K3;
        ArrayList arrayListB;
        int size2;
        int i23;
        int i24;
        Object obj2;
        int i25;
        ArrayList arrayListD;
        int size3;
        int i26;
        int i27;
        Object obj3;
        int i28;
        ArrayList arrayListF;
        int size4;
        int i29;
        int i30;
        Object obj4;
        int i31;
        kotlin.jvm.internal.m.f(sentence, "<this>");
        List<Word> sentWords = sentence.getSentWords();
        kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
        ArrayList arrayList2 = new ArrayList(n.W(sentWords, 10));
        for (Word word : sentWords) {
            kotlin.jvm.internal.m.c(word);
            arrayList2.add(toWordItem(word));
        }
        ArrayList arrayList3 = new ArrayList();
        int size5 = arrayList2.size();
        boolean z12 = false;
        int i32 = 0;
        while (true) {
            i11 = 1;
            if (i32 >= size5) {
                break;
            }
            Object obj5 = arrayList2.get(i32);
            i32++;
            if (((CourseWord) obj5).getWordType() != 1) {
                arrayList3.add(obj5);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size6 = arrayList3.size();
        int i33 = 0;
        while (i33 < size6) {
            Object obj6 = arrayList3.get(i33);
            i33++;
            if (((CourseWord) obj6).getWord().length() == 1) {
                arrayList4.add(obj6);
            }
        }
        int size7 = arrayList4.size();
        if (!l.D(new Integer[]{11, 0}, Integer.valueOf(((o0) b.c()).f27733a.keyLanguage)) || size7 / arrayList3.size() < 0.8f) {
            z11 = false;
        } else {
            int size8 = arrayList3.size();
            int length = 0;
            int i34 = 0;
            while (i34 < size8) {
                Object obj7 = arrayList3.get(i34);
                i34++;
                length += ((CourseWord) obj7).getWord().length();
            }
            if (length < 8) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        int i35 = 6;
        if (!l.D(new Integer[]{13, 2}, Integer.valueOf(((o0) b.c()).f27733a.keyLanguage))) {
            if (z11) {
                arrayListG = c.a.G(((o0) b.c()).f27733a.keyLanguage, reChunkSentence(arrayList2, new a(i11), true));
            } else {
                ArrayList arrayList5 = new ArrayList(n.W(arrayList2, 10));
                int size9 = arrayList2.size();
                int i36 = 0;
                while (i36 < size9) {
                    Object obj8 = arrayList2.get(i36);
                    int i37 = i36 + 1;
                    CourseWord courseWord3 = (CourseWord) obj8;
                    if (!oz.q.v0(courseWord3.getWord(), " ", z12) || kotlin.jvm.internal.m.a(courseWord3.getWord(), " ")) {
                        i14 = i11;
                        i15 = i37;
                        if (!oz.q.v0(courseWord3.getWord(), "-", false) || kotlin.jvm.internal.m.a(courseWord3.getWord(), "-")) {
                            i16 = 6;
                            K = o.K(courseWord3);
                        } else {
                            K = new ArrayList();
                            int i38 = 0;
                            for (Object obj9 : oz.q.W0(courseWord3.getWord(), new String[]{"-"}, 0, 6)) {
                                int i39 = i38 + 1;
                                if (i38 < 0) {
                                    o.V();
                                    throw null;
                                }
                                K.add(new CourseWord(courseWord3.getWordId(), (String) obj9, courseWord3.getWordType()));
                                if (i38 != oz.q.W0(courseWord3.getWord(), new String[]{"-"}, 0, 6).size() - 1) {
                                    K.add(CourseWord.copy$default(WordSentenceSourceKt.getSpaceCourseWord(), 0L, "-", null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -3, 63, null));
                                }
                                i38 = i39;
                            }
                            i16 = 6;
                        }
                    } else {
                        List<String> listW0 = oz.q.W0(courseWord3.getWord(), new String[]{" "}, z12 ? 1 : 0, i35);
                        K = new ArrayList();
                        ?? r9 = z12;
                        for (String str : listW0) {
                            if (oz.q.v0(str, "-", r9)) {
                                K2 = new ArrayList();
                                ?? r11 = r9;
                                for (Object obj10 : oz.q.W0(str, new String[]{"-"}, r9, i35)) {
                                    int i40 = r11 + 1;
                                    if (r11 < 0) {
                                        o.V();
                                        throw null;
                                    }
                                    int i41 = i37;
                                    CourseWord courseWord4 = courseWord3;
                                    K2.add(new CourseWord(courseWord4.getWordId(), (String) obj10, courseWord4.getWordType()));
                                    if (r11 != oz.q.W0(str, new String[]{"-"}, 0, 6).size() - 1) {
                                        K2.add(CourseWord.copy$default(WordSentenceSourceKt.getSpaceCourseWord(), 0L, "-", null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -3, 63, null));
                                    }
                                    r11 = i40;
                                    i37 = i41;
                                    courseWord3 = courseWord4;
                                }
                                i17 = i37;
                                courseWord = courseWord3;
                            } else {
                                i17 = i37;
                                courseWord = courseWord3;
                                K2 = o.K(new CourseWord(courseWord.getWordId(), str, courseWord.getWordType()));
                            }
                            m.d0(K, K2);
                            r9 = 0;
                            i35 = 6;
                            i11 = i11;
                            i37 = i17;
                            courseWord3 = courseWord;
                        }
                        i14 = i11;
                        i15 = i37;
                        i16 = i35;
                    }
                    arrayList5.add(K);
                    z12 = false;
                    i35 = i16;
                    i11 = i14;
                    i36 = i15;
                }
                i12 = i11;
                th2 = null;
                ArrayList arrayListX = n.X(arrayList5);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                int size10 = arrayListX.size();
                int i42 = 0;
                int i43 = 0;
                while (i42 < size10) {
                    Object obj11 = arrayListX.get(i42);
                    i42++;
                    int i44 = i43 + 1;
                    if (i43 < 0) {
                        o.V();
                        throw null;
                    }
                    CourseWord courseWord5 = (CourseWord) obj11;
                    if (!arrayList7.contains(Integer.valueOf(i43))) {
                        if (!x.k0(courseWord5.getWord(), "'", false)) {
                            arrayList6.add(courseWord5);
                        } else if (i44 < arrayListX.size()) {
                            CourseWord courseWord6 = (CourseWord) arrayListX.get(i44);
                            arrayList7.add(Integer.valueOf(i44));
                            arrayList6.add(CourseWord.copy$default(courseWord5, 0L, defpackage.e.m(courseWord5.getWord(), courseWord6.getWord()), null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -3, 63, null));
                        } else {
                            arrayList6.add(courseWord5);
                        }
                    }
                    i43 = i44;
                }
                i13 = 0;
                arrayListG = c.a.G(((o0) b.c()).f27733a.keyLanguage, arrayList6);
            }
            arrayList = new ArrayList(n.W(arrayListG, 10));
            size = arrayListG.size();
            long j11 = 10000;
            i18 = i13;
            i19 = i18;
            while (i19 < size) {
                obj = arrayListG.get(i19);
                i19++;
                i21 = i18 + 1;
                if (i18 >= 0) {
                    o.V();
                    throw th2;
                }
                courseWord2 = (CourseWord) obj;
                i22 = i12;
                if (courseWord2.getWordType() == i22 && !kotlin.jvm.internal.m.a(courseWord2.getWord(), " ")) {
                    int i45 = ((o0) b.c()).f27733a.keyLanguage;
                    if (i45 == 0) {
                        arrayListB = pt.g.b(courseWord2);
                        K3 = new ArrayList(n.W(arrayListB, 10));
                        size2 = arrayListB.size();
                        i23 = 0;
                        i24 = 0;
                        while (i24 < size2) {
                            obj2 = arrayListB.get(i24);
                            i24++;
                            i25 = i23 + 1;
                            if (i23 >= 0) {
                                o.V();
                                throw th2;
                            }
                            long j12 = j11 + 1;
                            K3.add(CourseWord.copy$default((CourseWord) obj2, j12, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                            i23 = i25;
                            j11 = j12;
                        }
                        continue;
                    } else if (i45 == i22) {
                        arrayListD = pt.g.d(courseWord2);
                        K3 = new ArrayList(n.W(arrayListD, 10));
                        size3 = arrayListD.size();
                        i26 = 0;
                        i27 = 0;
                        while (i27 < size3) {
                            obj3 = arrayListD.get(i27);
                            i27++;
                            i28 = i26 + 1;
                            if (i26 >= 0) {
                                o.V();
                                throw th2;
                            }
                            long j13 = j11 + 1;
                            K3.add(CourseWord.copy$default((CourseWord) obj3, j13, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                            i26 = i28;
                            j11 = j13;
                        }
                    } else if (i45 != 2) {
                        switch (i45) {
                            case 11:
                                arrayListB = pt.g.b(courseWord2);
                                K3 = new ArrayList(n.W(arrayListB, 10));
                                size2 = arrayListB.size();
                                i23 = 0;
                                i24 = 0;
                                while (i24 < size2) {
                                    obj2 = arrayListB.get(i24);
                                    i24++;
                                    i25 = i23 + 1;
                                    if (i23 >= 0) {
                                        o.V();
                                        throw th2;
                                    }
                                    long j14 = j11 + 1;
                                    K3.add(CourseWord.copy$default((CourseWord) obj2, j14, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                                    i23 = i25;
                                    j11 = j14;
                                }
                                continue;
                            case 12:
                                arrayListD = pt.g.d(courseWord2);
                                K3 = new ArrayList(n.W(arrayListD, 10));
                                size3 = arrayListD.size();
                                i26 = 0;
                                i27 = 0;
                                while (i27 < size3) {
                                    obj3 = arrayListD.get(i27);
                                    i27++;
                                    i28 = i26 + 1;
                                    if (i26 >= 0) {
                                        o.V();
                                        throw th2;
                                    }
                                    long j15 = j11 + 1;
                                    K3.add(CourseWord.copy$default((CourseWord) obj3, j15, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                                    i26 = i28;
                                    j11 = j15;
                                }
                                break;
                            case 13:
                                arrayListF = pt.g.f(courseWord2);
                                K3 = new ArrayList(n.W(arrayListF, 10));
                                size4 = arrayListF.size();
                                i29 = 0;
                                i30 = 0;
                                while (i30 < size4) {
                                    obj4 = arrayListF.get(i30);
                                    i30++;
                                    i31 = i29 + 1;
                                    if (i29 >= 0) {
                                        o.V();
                                        throw th2;
                                    }
                                    long j16 = j11 + 1;
                                    K3.add(CourseWord.copy$default((CourseWord) obj4, j16, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                                    i29 = i31;
                                    j11 = j16;
                                }
                                break;
                            default:
                                ArrayList arrayListC = pt.g.c(courseWord2);
                                K3 = new ArrayList(n.W(arrayListC, 10));
                                int size11 = arrayListC.size();
                                int i46 = 0;
                                int i47 = 0;
                                while (i46 < size11) {
                                    Object obj12 = arrayListC.get(i46);
                                    i46++;
                                    int i48 = i47 + 1;
                                    if (i47 < 0) {
                                        o.V();
                                        throw th2;
                                    }
                                    long j17 = j11 + 1;
                                    K3.add(CourseWord.copy$default((CourseWord) obj12, j17, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                                    i47 = i48;
                                    j11 = j17;
                                }
                                break;
                        }
                    } else {
                        arrayListF = pt.g.f(courseWord2);
                        K3 = new ArrayList(n.W(arrayListF, 10));
                        size4 = arrayListF.size();
                        i29 = 0;
                        i30 = 0;
                        while (i30 < size4) {
                            obj4 = arrayListF.get(i30);
                            i30++;
                            i31 = i29 + 1;
                            if (i29 >= 0) {
                                o.V();
                                throw th2;
                            }
                            long j18 = j11 + 1;
                            K3.add(CourseWord.copy$default((CourseWord) obj4, j18, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -2, 63, null));
                            i29 = i31;
                            j11 = j18;
                        }
                    }
                }
                arrayList.add(K3);
                i18 = i21;
                i12 = 1;
            }
            long sentenceId = sentence.getSentenceId();
            String sentence2 = sentence.getSentence();
            kotlin.jvm.internal.m.e(sentence2, "getSentence(...)");
            String wordList = sentence.getWordList();
            kotlin.jvm.internal.m.e(wordList, "getWordList(...)");
            String dirCode = sentence.getDirCode();
            kotlin.jvm.internal.m.e(dirCode, "getDirCode(...)");
            String translations = sentence.getTranslations();
            kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
            if (!((o0) b.c()).f27733a.enableNativeSpeakerVideos) {
                uri = Uri.EMPTY;
            } else if (d.g(((o0) b.c()).f27733a.keyLanguage)) {
                q qVar = fv.b.f28186a;
                long sentenceId2 = sentence.getSentenceId();
                uri = Uri.parse(b.a().l() + fv.g.s(sentenceId2));
            } else if (d.w(((o0) b.c()).f27733a.keyLanguage)) {
                q qVar2 = fv.b.f28186a;
                long sentenceId3 = sentence.getSentenceId();
                uri = Uri.parse(b.a().m() + fv.g.t(sentenceId3));
            } else {
                uri = Uri.EMPTY;
            }
            Uri uri2 = uri;
            kotlin.jvm.internal.m.c(uri2);
            q qVar3 = fv.b.f28186a;
            ?? r12 = th2;
            Uri uri3 = Uri.parse(fv.b.G(sentence.getSentenceId(), r12, r12));
            kotlin.jvm.internal.m.e(uri3, "parse(...)");
            String str2 = b.b().tempDir + "user_record_" + System.currentTimeMillis() + ".pcm";
            ArrayList arrayListG2 = c.a.G(((o0) b.c()).f27733a.keyLanguage, arrayList2);
            ArrayList arrayListG3 = c.a.G(((o0) b.c()).f27733a.keyLanguage, arrayList2);
            itemType = sentence.getItemType();
            if (itemType != 2) {
                sentenceMFType = SentenceMFType.MALE;
            } else if (itemType != 3) {
                sentenceMFType = SentenceMFType.NORMAL;
            } else {
                sentenceMFType = SentenceMFType.FEMALE;
            }
            return new CourseSentence(sentenceId, sentence2, wordList, dirCode, translations, BuildConfig.VERSION_NAME, uri2, uri3, str2, false, false, false, arrayList2, arrayListG2, arrayListG3, arrayListG, arrayList, null, sentenceMFType, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 7998976, null);
        }
        arrayListG = c.a.G(((o0) b.c()).f27733a.keyLanguage, reChunkSentence(arrayList2, new a(i35), false));
        i13 = 0;
        i12 = 1;
        th2 = null;
        arrayList = new ArrayList(n.W(arrayListG, 10));
        size = arrayListG.size();
        long j19 = 10000;
        i18 = i13;
        i19 = i18;
        while (i19 < size) {
            obj = arrayListG.get(i19);
            i19++;
            i21 = i18 + 1;
            if (i18 >= 0) {
                o.V();
                throw th2;
            }
            courseWord2 = (CourseWord) obj;
            i22 = i12;
            K3 = courseWord2.getWordType() == i22 ? o.K(courseWord2) : o.K(courseWord2);
            arrayList.add(K3);
            i18 = i21;
            i12 = 1;
        }
        long sentenceId4 = sentence.getSentenceId();
        String sentence3 = sentence.getSentence();
        kotlin.jvm.internal.m.e(sentence3, "getSentence(...)");
        String wordList2 = sentence.getWordList();
        kotlin.jvm.internal.m.e(wordList2, "getWordList(...)");
        String dirCode2 = sentence.getDirCode();
        kotlin.jvm.internal.m.e(dirCode2, "getDirCode(...)");
        String translations2 = sentence.getTranslations();
        kotlin.jvm.internal.m.e(translations2, "getTranslations(...)");
        if (!((o0) b.c()).f27733a.enableNativeSpeakerVideos) {
            uri = Uri.EMPTY;
        } else if (d.g(((o0) b.c()).f27733a.keyLanguage)) {
            q qVar4 = fv.b.f28186a;
            long sentenceId5 = sentence.getSentenceId();
            uri = Uri.parse(b.a().l() + fv.g.s(sentenceId5));
        } else if (d.w(((o0) b.c()).f27733a.keyLanguage)) {
            q qVar5 = fv.b.f28186a;
            long sentenceId6 = sentence.getSentenceId();
            uri = Uri.parse(b.a().m() + fv.g.t(sentenceId6));
        } else {
            uri = Uri.EMPTY;
        }
        Uri uri4 = uri;
        kotlin.jvm.internal.m.c(uri4);
        q qVar6 = fv.b.f28186a;
        ?? r13 = th2;
        Uri uri5 = Uri.parse(fv.b.G(sentence.getSentenceId(), r13, r13));
        kotlin.jvm.internal.m.e(uri5, "parse(...)");
        String str3 = b.b().tempDir + "user_record_" + System.currentTimeMillis() + ".pcm";
        ArrayList arrayListG4 = c.a.G(((o0) b.c()).f27733a.keyLanguage, arrayList2);
        ArrayList arrayListG5 = c.a.G(((o0) b.c()).f27733a.keyLanguage, arrayList2);
        itemType = sentence.getItemType();
        if (itemType != 2) {
            sentenceMFType = SentenceMFType.MALE;
        } else if (itemType != 3) {
            sentenceMFType = SentenceMFType.NORMAL;
        } else {
            sentenceMFType = SentenceMFType.FEMALE;
        }
        return new CourseSentence(sentenceId4, sentence3, wordList2, dirCode2, translations2, BuildConfig.VERSION_NAME, uri4, uri5, str3, false, false, false, arrayList2, arrayListG4, arrayListG5, arrayListG, arrayList, null, sentenceMFType, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 7998976, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toSentenceItem$lambda$18(CourseWord it) {
        kotlin.jvm.internal.m.f(it, "it");
        return kotlin.jvm.internal.m.a(it.getWord(), " ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toSentenceItem$lambda$19(CourseWord it) {
        kotlin.jvm.internal.m.f(it, "it");
        return it.getWordType() == 1;
    }

    public static final CourseWord toWordItem(CourseCharacter courseCharacter) {
        kotlin.jvm.internal.m.f(courseCharacter, "<this>");
        return CourseWord.copy$default(CourseWord.copy$default(new CourseWord(courseCharacter.getCharacterId(), courseCharacter.getCharacter(), 3, BuildConfig.VERSION_NAME), 0L, null, courseCharacter.getZhuYin(), courseCharacter.getZhuYin(), null, null, 0, 0, null, null, null, null, null, null, null, courseCharacter.getAudioUri(), null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -32781, 63, null), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, courseCharacter.getCharacter(), false, false, false, false, false, null, null, null, null, null, null, 0, -33554433, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toCharacterItem$lambda$2(HwTCharPart lhs, HwTCharPart hwTCharPart) {
        kotlin.jvm.internal.m.f(lhs, "lhs");
        kotlin.jvm.internal.m.f(hwTCharPart, HOBXIlHxIkMBEA.DoflysZ);
        return lhs.getPartIndex() - hwTCharPart.getPartIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toCharacterItem$lambda$4(HwCharPart lhs, HwCharPart hwCharPart) {
        kotlin.jvm.internal.m.f(lhs, "lhs");
        kotlin.jvm.internal.m.f(hwCharPart, scqhIrGXy.MVOV);
        return lhs.getPartIndex() - hwCharPart.getPartIndex();
    }

    public static final CourseUnit toCourseUnit(Unit unit) {
        String str;
        String str2 = BuildConfig.VERSION_NAME;
        kotlin.jvm.internal.m.f(unit, "<this>");
        long unitId = unit.getUnitId();
        String unitName = unit.getUnitName();
        kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
        try {
            String description = unit.getDescription();
            if (description != null) {
                str2 = description;
            }
        } catch (Exception unused) {
        }
        String str3 = str2;
        int sortIndex = unit.getSortIndex();
        String lessonList = unit.getLessonList();
        kotlin.jvm.internal.m.e(lessonList, "getLessonList(...)");
        long levelId = unit.getLevelId();
        String unitName2 = unit.getUnitName();
        kotlin.jvm.internal.m.e(unitName2, "getUnitName(...)");
        boolean zS0 = x.s0(unitName2, kHfjNGauVgdF.hOeC, false);
        if (unit.getIconResSuffix() != null) {
            String iconResSuffix = unit.getIconResSuffix();
            kotlin.jvm.internal.m.e(iconResSuffix, "getIconResSuffix(...)");
            str = (String) oz.q.W0(iconResSuffix, new String[]{";"}, 0, 6).get(0);
        } else {
            str = "uicon_1";
        }
        return new CourseUnit(unitId, unitName, str3, lessonList, sortIndex, levelId, false, null, false, zS0, false, false, 0L, 0L, null, str, null, null, null, null, null, 0, 0, 0, 16743872, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x0217  */
    /* JADX WARN: Code duplicated, block: B:106:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:0x0249  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00de A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #2 {all -> 0x00e9, blocks: (B:29:0x00d8, B:31:0x00de), top: B:116:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105 A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #0 {all -> 0x0110, blocks: (B:46:0x00ff, B:48:0x0105), top: B:111:0x00ff }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:81:0x015f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x016e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0192  */
    /* JADX WARN: Code duplicated, block: B:95:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01af  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bf  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x01f3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x0223, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x01bf, please report this as an issue */
    public static final CourseWord toWordItem(Word word) {
        String word2;
        String str;
        String str2;
        String str3;
        Object objL;
        String str4;
        Object objL2;
        String str5;
        String str6;
        String str7;
        String str8;
        String explanation;
        String str9;
        String str10;
        String mainPic;
        Uri uri;
        Uri uri2;
        String featured;
        String mainPic2;
        String pos;
        String translations;
        String luoma;
        String zhuyin;
        String str11;
        String str12 = BuildConfig.VERSION_NAME;
        kotlin.jvm.internal.m.f(word, "<this>");
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (b.b().isSChinese || !l.D(new Integer[]{11, 0}, Integer.valueOf(b.b().keyLanguage)) || word.getTWord() == null) {
                                        word2 = word.getWord();
                                        if (word2 == null) {
                                            word2 = BuildConfig.VERSION_NAME;
                                        }
                                        str = word2;
                                        if (l.D(new Integer[]{12, 1}, Integer.valueOf(((o0) b.c()).f27733a.keyLanguage)) || (str11 = word.Luoma) == null) {
                                            str2 = BuildConfig.VERSION_NAME;
                                            str3 = str2;
                                        } else if (oz.q.W0(str11, new String[]{"#"}, 0, 6).size() > 1) {
                                            String Luoma = word.Luoma;
                                            kotlin.jvm.internal.m.e(Luoma, "Luoma");
                                            String str13 = (String) oz.q.W0(Luoma, new String[]{"#"}, 0, 6).get(1);
                                            String Luoma2 = word.Luoma;
                                            kotlin.jvm.internal.m.e(Luoma2, "Luoma");
                                            str2 = str13;
                                            str3 = (String) oz.q.W0(Luoma2, new String[]{"#"}, 0, 6).get(0);
                                        } else {
                                            String luoma2 = word.getLuoma();
                                            kotlin.jvm.internal.m.e(luoma2, "getLuoma(...)");
                                            String luoma3 = word.getLuoma();
                                            kotlin.jvm.internal.m.e(luoma3, "getLuoma(...)");
                                            str2 = luoma2;
                                            str3 = luoma3;
                                        }
                                        long wordId = word.getWordId();
                                        kotlin.jvm.internal.m.c(str);
                                        String strQ0 = x.q0(str, "〇", "✓");
                                        zhuyin = word.getZhuyin();
                                        if (zhuyin == null) {
                                            objL = str;
                                        } else {
                                            if (zhuyin.length() <= 0) {
                                                objL = zhuyin;
                                                objL = null;
                                            }
                                            if (objL == null) {
                                                objL = str;
                                            }
                                        }
                                        if (qy.o.a(objL) == null) {
                                            str4 = (String) objL;
                                        } else {
                                            str4 = str;
                                        }
                                        String strQ1 = x.q0(str4, "〇", "✓");
                                        luoma = word.getLuoma();
                                        if (luoma == null) {
                                            objL2 = str;
                                        } else {
                                            if (luoma.length() <= 0) {
                                                objL2 = luoma;
                                                objL2 = null;
                                            }
                                            if (objL2 == null) {
                                                objL2 = str;
                                            }
                                        }
                                        if (qy.o.a(objL2) == null) {
                                            str5 = (String) objL2;
                                        } else {
                                            str5 = str;
                                        }
                                        String strQ2 = x.q0(str5, "〇", "✓");
                                        int wordType = word.getWordType();
                                        translations = word.getTranslations();
                                        if (translations == null) {
                                            translations = BuildConfig.VERSION_NAME;
                                        }
                                        str6 = translations;
                                        CourseWord courseWord = new CourseWord(wordId, strQ0, strQ1, strQ2, wordType, str6);
                                        pos = word.getPos();
                                        if (pos == null) {
                                            pos = BuildConfig.VERSION_NAME;
                                        }
                                        str7 = pos;
                                        mainPic2 = word.getMainPic();
                                        if (mainPic2 == null) {
                                            mainPic2 = BuildConfig.VERSION_NAME;
                                        }
                                        str8 = mainPic2;
                                        boolean zEquals = str.equals("_____");
                                        explanation = word.getExplanation();
                                        if (explanation == null) {
                                            str9 = BuildConfig.VERSION_NAME;
                                        } else {
                                            str9 = explanation;
                                        }
                                        int animation = word.getAnimation();
                                        featured = word.getFeatured();
                                        if (featured == null) {
                                            featured = BuildConfig.VERSION_NAME;
                                        }
                                        str10 = featured;
                                        q qVar = fv.b.f28186a;
                                        Uri uri3 = Uri.parse(fv.b.Y(word.getWordId(), null, null));
                                        kotlin.jvm.internal.m.e(uri3, "parse(...)");
                                        long wordId2 = word.getWordId();
                                        mainPic = word.getMainPic();
                                        if (mainPic != null) {
                                            str12 = mainPic;
                                        }
                                        Uri uri4 = Uri.parse(fv.b.f0(wordId2, str12));
                                        kotlin.jvm.internal.m.e(uri4, "parse(...)");
                                        if (!((o0) b.c()).f27733a.enableNativeSpeakerVideos) {
                                            uri = Uri.EMPTY;
                                        } else if (d.g(((o0) b.c()).f27733a.keyLanguage)) {
                                            long wordId3 = word.getWordId();
                                            uri = Uri.parse(b.a().l() + fv.g.A(wordId3));
                                        } else if (d.w(((o0) b.c()).f27733a.keyLanguage)) {
                                            long wordId4 = word.getWordId();
                                            uri = Uri.parse(b.a().m() + fv.g.B(wordId4));
                                        } else {
                                            uri = Uri.EMPTY;
                                        }
                                        Uri uri5 = uri;
                                        kotlin.jvm.internal.m.c(uri5);
                                        if (word.getAnimation() == 1) {
                                            long wordId5 = word.getWordId();
                                            uri2 = Uri.parse(b.a().k() + fv.g.y(wordId5));
                                        } else {
                                            uri2 = Uri.EMPTY;
                                        }
                                        Uri uri6 = uri2;
                                        kotlin.jvm.internal.m.c(uri6);
                                        return CourseWord.copy$default(CourseWord.copy$default(courseWord, 0L, null, null, null, null, str9, 0, animation, null, null, str8, str7, str10, null, uri5, uri3, uri4, uri6, 0, null, zEquals, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -1301665, 63, null), 0L, null, null, null, null, null, 0, 0, str2, str3, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, str, false, false, false, false, false, null, null, null, null, null, null, 0, -33555201, 63, null);
                                    }
                                    word2 = word.getTWord();
                                    mainPic2 = word.getMainPic();
                                    if (mainPic2 == null) {
                                        mainPic2 = BuildConfig.VERSION_NAME;
                                    }
                                    str8 = mainPic2;
                                } catch (Exception unused) {
                                    str8 = BuildConfig.VERSION_NAME;
                                }
                                featured = word.getFeatured();
                                if (featured == null) {
                                    featured = BuildConfig.VERSION_NAME;
                                }
                                str10 = featured;
                            } catch (Exception unused2) {
                                str10 = BuildConfig.VERSION_NAME;
                            }
                            translations = word.getTranslations();
                            if (translations == null) {
                                translations = BuildConfig.VERSION_NAME;
                            }
                            str6 = translations;
                        } catch (Exception unused3) {
                            str6 = BuildConfig.VERSION_NAME;
                        }
                        pos = word.getPos();
                        if (pos == null) {
                            pos = BuildConfig.VERSION_NAME;
                        }
                        str7 = pos;
                    } catch (Exception unused4) {
                        str7 = BuildConfig.VERSION_NAME;
                    }
                    zhuyin = word.getZhuyin();
                    if (zhuyin == null) {
                        objL = str;
                    } else {
                        if (zhuyin.length() <= 0) {
                            objL = zhuyin;
                            objL = null;
                        }
                        if (objL == null) {
                            objL = str;
                        }
                    }
                } catch (Throwable th2) {
                    objL = com.bumptech.glide.e.l(th2);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                word2 = word.getWord();
                if (word2 == null) {
                    word2 = BuildConfig.VERSION_NAME;
                }
            }
            luoma = word.getLuoma();
            if (luoma == null) {
                objL2 = str;
            } else {
                if (luoma.length() <= 0) {
                    objL2 = luoma;
                    objL2 = null;
                }
                if (objL2 == null) {
                    objL2 = str;
                }
            }
        } catch (Throwable th3) {
            objL2 = com.bumptech.glide.e.l(th3);
        }
        str = word2;
        if (l.D(new Integer[]{12, 1}, Integer.valueOf(((o0) b.c()).f27733a.keyLanguage))) {
            str2 = BuildConfig.VERSION_NAME;
            str3 = str2;
        } else {
            str2 = BuildConfig.VERSION_NAME;
            str3 = str2;
        }
        long wordId6 = word.getWordId();
        kotlin.jvm.internal.m.c(str);
        String strQ3 = x.q0(str, "〇", "✓");
        if (qy.o.a(objL) == null) {
            str4 = (String) objL;
        } else {
            str4 = str;
        }
        String strQ4 = x.q0(str4, "〇", "✓");
        if (qy.o.a(objL2) == null) {
            str5 = (String) objL2;
        } else {
            str5 = str;
        }
        String strQ5 = x.q0(str5, "〇", "✓");
        int wordType2 = word.getWordType();
        CourseWord courseWord2 = new CourseWord(wordId6, strQ3, strQ4, strQ5, wordType2, str6);
        boolean zEquals2 = str.equals("_____");
        explanation = word.getExplanation();
        if (explanation == null) {
            str9 = BuildConfig.VERSION_NAME;
        } else {
            str9 = explanation;
        }
        int animation2 = word.getAnimation();
        q qVar2 = fv.b.f28186a;
        Uri uri7 = Uri.parse(fv.b.Y(word.getWordId(), null, null));
        kotlin.jvm.internal.m.e(uri7, "parse(...)");
        long wordId7 = word.getWordId();
        mainPic = word.getMainPic();
        if (mainPic != null) {
            str12 = mainPic;
        }
        Uri uri8 = Uri.parse(fv.b.f0(wordId7, str12));
        kotlin.jvm.internal.m.e(uri8, "parse(...)");
        if (!((o0) b.c()).f27733a.enableNativeSpeakerVideos) {
            uri = Uri.EMPTY;
        } else if (d.g(((o0) b.c()).f27733a.keyLanguage)) {
            long wordId8 = word.getWordId();
            uri = Uri.parse(b.a().l() + fv.g.A(wordId8));
        } else if (d.w(((o0) b.c()).f27733a.keyLanguage)) {
            long wordId9 = word.getWordId();
            uri = Uri.parse(b.a().m() + fv.g.B(wordId9));
        } else {
            uri = Uri.EMPTY;
        }
        Uri uri9 = uri;
        kotlin.jvm.internal.m.c(uri9);
        if (word.getAnimation() == 1) {
            long wordId10 = word.getWordId();
            uri2 = Uri.parse(b.a().k() + fv.g.y(wordId10));
        } else {
            uri2 = Uri.EMPTY;
        }
        Uri uri10 = uri2;
        kotlin.jvm.internal.m.c(uri10);
        return CourseWord.copy$default(CourseWord.copy$default(courseWord2, 0L, null, null, null, null, str9, 0, animation2, null, null, str8, str7, str10, null, uri9, uri7, uri8, uri10, 0, null, zEquals2, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -1301665, 63, null), 0L, null, null, null, null, null, 0, 0, str2, str3, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, str, false, false, false, false, false, null, null, null, null, null, null, 0, -33555201, 63, null);
    }

    public static final CourseWord toWordItem(Phrase phrase) {
        kotlin.jvm.internal.m.f(phrase, "<this>");
        long phraseId = phrase.getPhraseId();
        String phrase2 = phrase.getPhrase();
        kotlin.jvm.internal.m.e(phrase2, "getPhrase(...)");
        String translations = phrase.getTranslations();
        if (translations == null) {
            translations = BuildConfig.VERSION_NAME;
        }
        CourseWord courseWord = new CourseWord(phraseId, phrase2, 0, translations);
        q qVar = fv.b.f28186a;
        Uri uri = Uri.parse(fv.b.x(phrase.getPhraseId(), null, null));
        kotlin.jvm.internal.m.e(uri, "parse(...)");
        String phrase3 = phrase.getPhrase();
        kotlin.jvm.internal.m.e(phrase3, "getPhrase(...)");
        return CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, uri, null, null, 0, null, false, false, null, null, null, phrase3, false, false, false, false, false, null, null, null, null, null, null, 0, -33587201, 63, null);
    }

    public static final CourseCharacter toCharacterItem(LDCharacter lDCharacter) {
        kotlin.jvm.internal.m.f(lDCharacter, "<this>");
        long charId = lDCharacter.getCharId();
        String character = lDCharacter.getCharacter();
        kotlin.jvm.internal.m.e(character, "getCharacter(...)");
        String pinyin = lDCharacter.getPinyin();
        kotlin.jvm.internal.m.e(pinyin, "getPinyin(...)");
        q qVar = fv.b.f28186a;
        String audioName = lDCharacter.getAudioName();
        kotlin.jvm.internal.m.e(audioName, "getAudioName(...)");
        Uri uri = Uri.parse(fv.b.c(audioName, null, null));
        kotlin.jvm.internal.m.e(uri, "parse(...)");
        r rVar = r.f50854a;
        return new CourseCharacter(charId, character, BuildConfig.VERSION_NAME, pinyin, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, rVar, rVar, null, uri, null, null, 6656, null);
    }
}
