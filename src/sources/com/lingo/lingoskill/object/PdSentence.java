package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import cf.x;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.LingoSkillApplication;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdSentence implements MultiItemEntity, Parcelable {
    public static final Parcelable.Creator<PdSentence> CREATOR = new Parcelable.Creator<PdSentence>() { // from class: com.lingo.lingoskill.object.PdSentence.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdSentence createFromParcel(Parcel parcel) {
            return new PdSentence(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdSentence[] newArray(int i11) {
            return new PdSentence[i11];
        }
    };
    public static int FEMALE = 2;
    public static int MALE = 1;
    private String Answer;
    private String Flag;
    private String Id;
    private String Lan;
    private Long LessonId;
    private String MF;
    private String Options;
    private String Sentence;
    private Long SentenceId;
    private String TranCHN;
    private String TranDEN;
    private String TranENG;
    private String TranFRN;
    private String TranJPN;
    private String TranKRN;
    private String TranTCHN;
    private String TranVTN;
    private String UpdateDate;
    private String WordList;
    private List<PdWord> words;

    public PdSentence(Parcel parcel) {
        this.Id = parcel.readString();
        this.Lan = parcel.readString();
        this.SentenceId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.LessonId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.Sentence = parcel.readString();
        this.WordList = parcel.readString();
        this.TranENG = parcel.readString();
        this.TranJPN = parcel.readString();
        this.TranKRN = parcel.readString();
        this.TranFRN = parcel.readString();
        this.TranDEN = parcel.readString();
        this.TranVTN = parcel.readString();
        this.TranTCHN = parcel.readString();
        this.TranCHN = parcel.readString();
        this.Options = parcel.readString();
        this.Answer = parcel.readString();
        this.MF = parcel.readString();
        this.Flag = parcel.readString();
        this.UpdateDate = parcel.readString();
        this.words = parcel.createTypedArrayList(PdWord.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAnswer() {
        return this.Answer;
    }

    public String getFlag() {
        return this.Flag;
    }

    public String getId() {
        return this.Id;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return Integer.parseInt(this.MF);
    }

    public String getLan() {
        return this.Lan;
    }

    public Long getLessonId() {
        return this.LessonId;
    }

    public String getMF() {
        return this.MF;
    }

    public String getOptions() {
        return this.Options;
    }

    public String getSentence() {
        return this.Sentence;
    }

    public Long getSentenceId() {
        return this.SentenceId;
    }

    public String getTranCHN() {
        return this.TranCHN;
    }

    public String getTranDEN() {
        return this.TranDEN;
    }

    public String getTranENG() {
        return this.TranENG;
    }

    public String getTranFRN() {
        return this.TranFRN;
    }

    public String getTranJPN() {
        return this.TranJPN;
    }

    public String getTranKRN() {
        return this.TranKRN;
    }

    public String getTranTCHN() {
        return this.TranTCHN;
    }

    public String getTranVTN() {
        return this.TranVTN;
    }

    public String getTranslation() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 1) {
            return getTranJPN();
        }
        if (x.n().locateLanguage != 7 || getTranVTN().isEmpty()) {
            return (x.n().locateLanguage != 5 || getTranFRN().isEmpty()) ? getTranENG() : getTranFRN();
        }
        return getTranVTN();
    }

    public String getUpdateDate() {
        return this.UpdateDate;
    }

    public String getWordList() {
        return this.WordList;
    }

    public List<PdWord> getWords() {
        return this.words;
    }

    public void setAnswer(String str) {
        this.Answer = str;
    }

    public void setFlag(String str) {
        this.Flag = str;
    }

    public void setId(String str) {
        this.Id = str;
    }

    public void setLan(String str) {
        this.Lan = str;
    }

    public void setLessonId(Long l9) {
        this.LessonId = l9;
    }

    public void setMF(String str) {
        this.MF = str;
    }

    public void setOptions(String str) {
        this.Options = str;
    }

    public void setSentence(String str) {
        this.Sentence = str;
    }

    public void setSentenceId(Long l9) {
        this.SentenceId = l9;
    }

    public void setTranCHN(String str) {
        this.TranCHN = str;
    }

    public void setTranDEN(String str) {
        this.TranDEN = str;
    }

    public void setTranENG(String str) {
        this.TranENG = str;
    }

    public void setTranFRN(String str) {
        this.TranFRN = str;
    }

    public void setTranJPN(String str) {
        this.TranJPN = str;
    }

    public void setTranKRN(String str) {
        this.TranKRN = str;
    }

    public void setTranTCHN(String str) {
        this.TranTCHN = str;
    }

    public void setTranVTN(String str) {
        this.TranVTN = str;
    }

    public void setUpdateDate(String str) {
        this.UpdateDate = str;
    }

    public void setWordList(String str) {
        this.WordList = str;
    }

    public void setWords(List<PdWord> list) {
        this.words = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.Id);
        parcel.writeString(this.Lan);
        parcel.writeValue(this.SentenceId);
        parcel.writeValue(this.LessonId);
        parcel.writeString(this.Sentence);
        parcel.writeString(this.WordList);
        parcel.writeString(this.TranENG);
        parcel.writeString(this.TranJPN);
        parcel.writeString(this.TranKRN);
        parcel.writeString(this.TranFRN);
        parcel.writeString(this.TranDEN);
        parcel.writeString(this.TranVTN);
        parcel.writeString(this.TranTCHN);
        parcel.writeString(this.TranCHN);
        parcel.writeString(this.Options);
        parcel.writeString(this.Answer);
        parcel.writeString(this.MF);
        parcel.writeString(this.Flag);
        parcel.writeString(this.UpdateDate);
        parcel.writeTypedList(this.words);
    }

    public PdSentence(String str, String str2, Long l9, Long l11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.Id = str;
        this.Lan = str2;
        this.SentenceId = l9;
        this.LessonId = l11;
        this.Sentence = str3;
        this.WordList = str4;
        this.TranENG = str5;
        this.TranJPN = str6;
        this.TranKRN = str7;
        this.TranFRN = str8;
        this.TranDEN = str9;
        this.TranVTN = str10;
        this.TranTCHN = str11;
        this.TranCHN = str12;
        this.Options = str13;
        this.Answer = str14;
        this.MF = str15;
        this.Flag = str16;
        this.UpdateDate = str17;
    }

    public PdSentence() {
    }
}
