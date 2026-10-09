package com.lingodeer.data.model.chinesetone;

import com.lingodeer.data.model.LessonState;
import com.lingodeer.database.model.ChineseToneExercise010Entity;
import com.lingodeer.database.model.ChineseToneExercise020Entity;
import com.lingodeer.database.model.ChineseToneLessonEntity;
import com.lingodeer.database.model.ChineseToneLevelEntity;
import com.lingodeer.database.model.ChineseToneUnitEntity;
import com.lingodeer.database.model.ChineseToneWordEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import ry.n;
import ry.r;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneModelExtensionsKt {
    public static final ChineseToneLevelEntity asEntityModel(ChineseToneLevel chineseToneLevel) {
        m.f(chineseToneLevel, "<this>");
        return new ChineseToneLevelEntity(chineseToneLevel.getLevelId(), new a(chineseToneLevel.getLevelName()), new a(chineseToneLevel.getUnitList()));
    }

    public static final ChineseToneExercise010Entity asEntityModel010(ChineseToneExercise chineseToneExercise) {
        m.f(chineseToneExercise, "<this>");
        return new ChineseToneExercise010Entity(chineseToneExercise.getId(), chineseToneExercise.getWordId(), new a(chineseToneExercise.getOptions()), new a(chineseToneExercise.getAnswer()));
    }

    public static final ChineseToneExercise020Entity asEntityModel020(ChineseToneExercise chineseToneExercise) {
        m.f(chineseToneExercise, "<this>");
        return new ChineseToneExercise020Entity(chineseToneExercise.getId(), chineseToneExercise.getWordId(), new a(chineseToneExercise.getOptions()), new a(chineseToneExercise.getAnswer()));
    }

    public static final List<ChineseToneExercise> asExercise010ExternalModelList(List<ChineseToneExercise010Entity> list) {
        m.f(list, "<this>");
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(asExternalModel((ChineseToneExercise010Entity) it.next()));
        }
        return arrayList;
    }

    public static final List<ChineseToneExercise> asExercise020ExternalModelList(List<ChineseToneExercise020Entity> list) {
        m.f(list, "<this>");
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(asExternalModel((ChineseToneExercise020Entity) it.next()));
        }
        return arrayList;
    }

    public static final ChineseToneLevel asExternalModel(ChineseToneLevelEntity chineseToneLevelEntity) {
        String str;
        String str2;
        m.f(chineseToneLevelEntity, "<this>");
        long levelId = chineseToneLevelEntity.getLevelId();
        a levelName = chineseToneLevelEntity.getLevelName();
        if (levelName == null || (str = levelName.f59371a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        a unitList = chineseToneLevelEntity.getUnitList();
        return new ChineseToneLevel(levelId, str, (unitList == null || (str2 = unitList.f59371a) == null) ? BuildConfig.VERSION_NAME : str2, r.f50854a);
    }

    public static final List<ChineseToneLesson> asLessonExternalModelList(List<ChineseToneLessonEntity> list) {
        m.f(list, "<this>");
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(asExternalModel((ChineseToneLessonEntity) it.next()));
        }
        return arrayList;
    }

    public static final List<ChineseToneLevel> asLevelExternalModelList(List<ChineseToneLevelEntity> list) {
        m.f(list, "<this>");
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(asExternalModel((ChineseToneLevelEntity) it.next()));
        }
        return arrayList;
    }

    public static final List<ChineseToneUnit> asUnitExternalModelList(List<ChineseToneUnitEntity> list) {
        m.f(list, "<this>");
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(asExternalModel((ChineseToneUnitEntity) it.next()));
        }
        return arrayList;
    }

    public static final List<ChineseToneWord> asWordExternalModelList(List<ChineseToneWordEntity> list) {
        m.f(list, "<this>");
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(asExternalModel((ChineseToneWordEntity) it.next()));
        }
        return arrayList;
    }

    public static final ChineseToneUnitEntity asEntityModel(ChineseToneUnit chineseToneUnit) {
        m.f(chineseToneUnit, "<this>");
        return new ChineseToneUnitEntity(chineseToneUnit.getUnitId(), new a(chineseToneUnit.getUnitName()), new a(chineseToneUnit.getDescription()), new a(chineseToneUnit.getLessonList()), chineseToneUnit.getSortIndex(), chineseToneUnit.getLevelId(), new a(chineseToneUnit.getIconResSuffix()));
    }

    public static final ChineseToneUnit asExternalModel(ChineseToneUnitEntity chineseToneUnitEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        m.f(chineseToneUnitEntity, "<this>");
        long unitId = chineseToneUnitEntity.getUnitId();
        a unitName = chineseToneUnitEntity.getUnitName();
        if (unitName == null || (str = unitName.f59371a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        a description = chineseToneUnitEntity.getDescription();
        if (description == null || (str2 = description.f59371a) == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        a lessonList = chineseToneUnitEntity.getLessonList();
        if (lessonList == null || (str3 = lessonList.f59371a) == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        int sortIndex = chineseToneUnitEntity.getSortIndex();
        long levelId = chineseToneUnitEntity.getLevelId();
        a iconResSuffix = chineseToneUnitEntity.getIconResSuffix();
        return new ChineseToneUnit(unitId, str, str2, str3, sortIndex, levelId, (iconResSuffix == null || (str4 = iconResSuffix.f59371a) == null) ? BuildConfig.VERSION_NAME : str4, r.f50854a);
    }

    public static final ChineseToneLessonEntity asEntityModel(ChineseToneLesson chineseToneLesson) {
        m.f(chineseToneLesson, "<this>");
        return new ChineseToneLessonEntity(chineseToneLesson.getLessonId(), new a(chineseToneLesson.getLessonName()), new a(chineseToneLesson.getDescription()), new a(chineseToneLesson.getTDescription()), new a(chineseToneLesson.getWordList()), new a(chineseToneLesson.getSentenceList()), new a(chineseToneLesson.getCharacterList()), new a(chineseToneLesson.getRepeatRegex()), new a(chineseToneLesson.getLastRegex()), new a(chineseToneLesson.getNormalRegex()), new a(chineseToneLesson.getChallengeRegex()), chineseToneLesson.getLevelId(), chineseToneLesson.getUnitId(), chineseToneLesson.getSortIndex());
    }

    public static final ChineseToneLesson asExternalModel(ChineseToneLessonEntity chineseToneLessonEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        m.f(chineseToneLessonEntity, "<this>");
        long lessonId = chineseToneLessonEntity.getLessonId();
        a lessonName = chineseToneLessonEntity.getLessonName();
        if (lessonName == null || (str = lessonName.f59371a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        a description = chineseToneLessonEntity.getDescription();
        if (description == null || (str2 = description.f59371a) == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        a tDescription = chineseToneLessonEntity.getTDescription();
        if (tDescription == null || (str3 = tDescription.f59371a) == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        a wordList = chineseToneLessonEntity.getWordList();
        if (wordList == null || (str4 = wordList.f59371a) == null) {
            str4 = BuildConfig.VERSION_NAME;
        }
        a sentenceList = chineseToneLessonEntity.getSentenceList();
        if (sentenceList == null || (str5 = sentenceList.f59371a) == null) {
            str5 = BuildConfig.VERSION_NAME;
        }
        a characterList = chineseToneLessonEntity.getCharacterList();
        if (characterList == null || (str6 = characterList.f59371a) == null) {
            str6 = BuildConfig.VERSION_NAME;
        }
        a repeatRegex = chineseToneLessonEntity.getRepeatRegex();
        if (repeatRegex == null || (str7 = repeatRegex.f59371a) == null) {
            str7 = BuildConfig.VERSION_NAME;
        }
        a lastRegex = chineseToneLessonEntity.getLastRegex();
        if (lastRegex == null || (str8 = lastRegex.f59371a) == null) {
            str8 = BuildConfig.VERSION_NAME;
        }
        a challengeRegex = chineseToneLessonEntity.getChallengeRegex();
        if (challengeRegex == null || (str9 = challengeRegex.f59371a) == null) {
            str9 = BuildConfig.VERSION_NAME;
        }
        return new ChineseToneLesson(lessonId, str, str2, str3, str4, str5, str6, str7, str8, str9, chineseToneLessonEntity.getLevelId(), chineseToneLessonEntity.getUnitId(), chineseToneLessonEntity.getSortIndex(), BuildConfig.VERSION_NAME, LessonState.StateLocked);
    }

    public static final ChineseToneWordEntity asEntityModel(ChineseToneWord chineseToneWord) {
        m.f(chineseToneWord, "<this>");
        return new ChineseToneWordEntity(chineseToneWord.getWordId(), new a(chineseToneWord.getWord()), new a(chineseToneWord.getCharacter()), new a(chineseToneWord.getShengMu()), new a(chineseToneWord.getYunMu()), new a(chineseToneWord.getQingSheng()), new a(chineseToneWord.getShengDiao()), new a(chineseToneWord.getAudio()), new a(chineseToneWord.getType()));
    }

    public static final ChineseToneWord asExternalModel(ChineseToneWordEntity chineseToneWordEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        m.f(chineseToneWordEntity, "<this>");
        long wordId = chineseToneWordEntity.getWordId();
        a word = chineseToneWordEntity.getWord();
        if (word == null || (str = word.f59371a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        a character = chineseToneWordEntity.getCharacter();
        if (character == null || (str2 = character.f59371a) == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        a shengMu = chineseToneWordEntity.getShengMu();
        if (shengMu == null || (str3 = shengMu.f59371a) == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        a yunMu = chineseToneWordEntity.getYunMu();
        if (yunMu == null || (str4 = yunMu.f59371a) == null) {
            str4 = BuildConfig.VERSION_NAME;
        }
        a qingSheng = chineseToneWordEntity.getQingSheng();
        if (qingSheng == null || (str5 = qingSheng.f59371a) == null) {
            str5 = BuildConfig.VERSION_NAME;
        }
        a shengDiao = chineseToneWordEntity.getShengDiao();
        if (shengDiao == null || (str6 = shengDiao.f59371a) == null) {
            str6 = BuildConfig.VERSION_NAME;
        }
        a audio = chineseToneWordEntity.getAudio();
        if (audio == null || (str7 = audio.f59371a) == null) {
            str7 = BuildConfig.VERSION_NAME;
        }
        a type = chineseToneWordEntity.getType();
        return new ChineseToneWord(wordId, str, str2, str3, str4, str5, str6, str7, (type == null || (str8 = type.f59371a) == null) ? BuildConfig.VERSION_NAME : str8);
    }

    public static final ChineseToneExercise asExternalModel(ChineseToneExercise010Entity chineseToneExercise010Entity) {
        String str;
        String str2;
        m.f(chineseToneExercise010Entity, "<this>");
        long id2 = chineseToneExercise010Entity.getId();
        long wordId = chineseToneExercise010Entity.getWordId();
        ExerciseType exerciseType = ExerciseType.IMAGE_SELECTION;
        a imageOptions = chineseToneExercise010Entity.getImageOptions();
        if (imageOptions == null || (str = imageOptions.f59371a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        a answer = chineseToneExercise010Entity.getAnswer();
        return new ChineseToneExercise(id2, wordId, exerciseType, str, (answer == null || (str2 = answer.f59371a) == null) ? BuildConfig.VERSION_NAME : str2);
    }

    public static final ChineseToneExercise asExternalModel(ChineseToneExercise020Entity chineseToneExercise020Entity) {
        String str;
        String str2;
        m.f(chineseToneExercise020Entity, "<this>");
        long id2 = chineseToneExercise020Entity.getId();
        long wordId = chineseToneExercise020Entity.getWordId();
        ExerciseType exerciseType = ExerciseType.AUDIO_SELECTION;
        a options = chineseToneExercise020Entity.getOptions();
        if (options == null || (str = options.f59371a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        a answer = chineseToneExercise020Entity.getAnswer();
        return new ChineseToneExercise(id2, wordId, exerciseType, str, (answer == null || (str2 = answer.f59371a) == null) ? BuildConfig.VERSION_NAME : str2);
    }
}
