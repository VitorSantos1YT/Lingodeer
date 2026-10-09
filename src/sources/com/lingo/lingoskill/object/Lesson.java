package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import bq.p;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ij.c;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Lesson implements Parcelable {
    public static final Parcelable.Creator<Lesson> CREATOR = new Parcelable.Creator<Lesson>() { // from class: com.lingo.lingoskill.object.Lesson.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Lesson createFromParcel(Parcel parcel) {
            return new Lesson(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Lesson[] newArray(int i11) {
            return new Lesson[i11];
        }
    };
    private String ChallengeRegex;
    private String CharacterList;
    private String Description;
    private String LastRegex;
    private long LessonId;
    private String LessonName;
    private long LevelId;
    private String NormalRegex;
    private String RepeatRegex;
    private String SentenceList;
    private int SortIndex;
    private String TDescription;
    private long UnitId;
    private String WordList;
    private HwCharacter[] chCharList;
    private Long[] charIdList;
    private p lessonState;
    private Long[] sentenceIdList;
    private Sentence[] stSentList;
    private Word[] wdWordList;
    private Long[] wordIdList;

    public Lesson(long j11, String str, String str2, String str3, long j12, long j13, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11) {
        this.LessonId = j11;
        this.LessonName = str;
        this.Description = str2;
        this.TDescription = str3;
        this.LevelId = j12;
        this.UnitId = j13;
        this.WordList = str4;
        this.SentenceList = str5;
        this.CharacterList = str6;
        this.NormalRegex = str7;
        this.LastRegex = str8;
        this.RepeatRegex = str9;
        this.ChallengeRegex = str10;
        this.SortIndex = i11;
    }

    public static void loadFullObject(Lesson lesson) {
        lesson.setWordIdList(ew.a.v(lesson.getWordList()));
        lesson.setSentenceIdList(ew.a.v(lesson.getSentenceList()));
        lesson.setCharIdList(ew.a.v(lesson.getCharacterList()));
        ArrayList arrayList = new ArrayList();
        for (Long l9 : lesson.getWordIdList()) {
            Word wordH = c.h(l9.longValue());
            if (wordH != null) {
                arrayList.add(wordH);
            }
        }
        lesson.setWdWordList((Word[]) arrayList.toArray(new Word[0]));
        ArrayList arrayList2 = new ArrayList();
        for (Long l11 : lesson.getSentenceIdList()) {
            Sentence sentenceE = c.e(l11.longValue());
            if (sentenceE != null) {
                arrayList2.add(sentenceE);
            }
        }
        lesson.setStSentList((Sentence[]) arrayList2.toArray(new Sentence[0]));
        ArrayList arrayList3 = new ArrayList();
        for (Long l12 : lesson.getCharIdList()) {
            if (oi.c.f44924t == null) {
                synchronized (oi.c.class) {
                    if (oi.c.f44924t == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication);
                        oi.c.f44924t = new oi.c(lingoSkillApplication);
                    }
                }
            }
            oi.c cVar = oi.c.f44924t;
            m.c(cVar);
            HwCharacter hwCharacter = (HwCharacter) cVar.g().load(l12);
            if (hwCharacter != null) {
                arrayList3.add(hwCharacter);
            }
        }
        lesson.setChCharList((HwCharacter[]) arrayList3.toArray(new HwCharacter[0]));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HwCharacter[] getChCharList() {
        return this.chCharList;
    }

    public String getChallengeRegex() {
        return this.ChallengeRegex;
    }

    public Long[] getCharIdList() {
        return this.charIdList;
    }

    public String getCharacterList() {
        String str = this.CharacterList;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public String getDescription() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().isSChinese || !(x.n().keyLanguage == 0 || x.n().keyLanguage == 11)) {
            String str = this.Description;
            return str != null ? str.replace("; ", "\n\n").replace(";", "\n\n").replace("!@@@!", "\n\n") : BuildConfig.VERSION_NAME;
        }
        String str2 = this.TDescription;
        return str2 != null ? str2.replace(";", "\n\n").replace("!@@@!", "\n\n") : BuildConfig.VERSION_NAME;
    }

    public String getLastRegex() {
        return this.LastRegex;
    }

    public long getLessonId() {
        return this.LessonId;
    }

    public String getLessonName() {
        return this.LessonName;
    }

    public p getLessonState() {
        return this.lessonState;
    }

    public long getLevelId() {
        return this.LevelId;
    }

    public String getNormalRegex() {
        return this.NormalRegex;
    }

    public String getRepeatRegex() {
        return this.RepeatRegex;
    }

    public Long[] getSentenceIdList() {
        return this.sentenceIdList;
    }

    public String getSentenceList() {
        String str = this.SentenceList;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public int getSortIndex() {
        return this.SortIndex;
    }

    public Sentence[] getStSentList() {
        return this.stSentList;
    }

    public String getTDescription() {
        return this.TDescription;
    }

    public long getUnitId() {
        return this.UnitId;
    }

    public Word[] getWdWordList() {
        return this.wdWordList;
    }

    public Long[] getWordIdList() {
        return this.wordIdList;
    }

    public String getWordList() {
        String str = this.WordList;
        return str == null ? BuildConfig.VERSION_NAME : str;
    }

    public void setChCharList(HwCharacter[] hwCharacterArr) {
        this.chCharList = hwCharacterArr;
    }

    public void setChallengeRegex(String str) {
        this.ChallengeRegex = str;
    }

    public void setCharIdList(Long[] lArr) {
        this.charIdList = lArr;
    }

    public void setCharacterList(String str) {
        this.CharacterList = str;
    }

    public void setDescription(String str) {
        this.Description = str;
    }

    public void setLastRegex(String str) {
        this.LastRegex = str;
    }

    public void setLessonId(long j11) {
        this.LessonId = j11;
    }

    public void setLessonName(String str) {
        this.LessonName = str;
    }

    public void setLessonState(p pVar) {
        this.lessonState = pVar;
    }

    public void setLevelId(long j11) {
        this.LevelId = j11;
    }

    public void setNormalRegex(String str) {
        this.NormalRegex = str;
    }

    public void setRepeatRegex(String str) {
        this.RepeatRegex = str;
    }

    public void setSentenceIdList(Long[] lArr) {
        this.sentenceIdList = lArr;
    }

    public void setSentenceList(String str) {
        this.SentenceList = str;
    }

    public void setSortIndex(int i11) {
        this.SortIndex = i11;
    }

    public void setStSentList(Sentence[] sentenceArr) {
        this.stSentList = sentenceArr;
    }

    public void setTDescription(String str) {
        this.TDescription = str;
    }

    public void setUnitId(long j11) {
        this.UnitId = j11;
    }

    public void setWdWordList(Word[] wordArr) {
        this.wdWordList = wordArr;
    }

    public void setWordIdList(Long[] lArr) {
        this.wordIdList = lArr;
    }

    public void setWordList(String str) {
        this.WordList = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.LessonId);
        parcel.writeString(this.LessonName);
        parcel.writeString(this.Description);
        parcel.writeString(this.TDescription);
        parcel.writeLong(this.LevelId);
        parcel.writeLong(this.UnitId);
        parcel.writeString(this.WordList);
        parcel.writeString(this.SentenceList);
        parcel.writeString(this.CharacterList);
        parcel.writeString(this.NormalRegex);
        parcel.writeString(this.LastRegex);
        parcel.writeString(this.RepeatRegex);
        parcel.writeInt(this.SortIndex);
    }

    public Lesson() {
    }

    public Lesson(Parcel parcel) {
        this.LessonId = parcel.readLong();
        this.LessonName = parcel.readString();
        this.Description = parcel.readString();
        this.TDescription = parcel.readString();
        this.LevelId = parcel.readLong();
        this.UnitId = parcel.readLong();
        this.WordList = parcel.readString();
        this.SentenceList = parcel.readString();
        this.CharacterList = parcel.readString();
        this.NormalRegex = parcel.readString();
        this.LastRegex = parcel.readString();
        this.RepeatRegex = parcel.readString();
        this.SortIndex = parcel.readInt();
    }
}
