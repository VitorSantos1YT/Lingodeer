package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import cf.x;
import com.google.gson.annotations.SerializedName;
import com.lingo.lingoskill.LingoSkillApplication;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdLesson implements Parcelable {
    public static final Parcelable.Creator<PdLesson> CREATOR = new Parcelable.Creator<PdLesson>() { // from class: com.lingo.lingoskill.object.PdLesson.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdLesson createFromParcel(Parcel parcel) {
            return new PdLesson(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdLesson[] newArray(int i11) {
            return new PdLesson[i11];
        }
    };
    private String Category;
    private String CreateDate;
    private String Difficuty;
    private String Id;
    private String Lan;

    @SerializedName("EID")
    private Long LessonId;

    @SerializedName("PUBD")
    private String PublishDate;
    private String Tags;
    private String TipsIds;
    private String Title;

    @SerializedName("CHN")
    private String Title_CHN;

    @SerializedName("DEN")
    private String Title_DEN;

    @SerializedName("ENG")
    private String Title_ENG;

    @SerializedName("FRN")
    private String Title_FRN;

    @SerializedName("JPN")
    private String Title_JPN;

    @SerializedName("KRN")
    private String Title_KRN;

    @SerializedName("TCHN")
    private String Title_TCHN;

    @SerializedName("VTN")
    private String Title_VTN;
    private Long Version;
    private PdLessonFav pdLessonFav;
    private List<PdSentence> sentences;
    private List<PdTips> tips;

    public PdLesson(Parcel parcel) {
        this.LessonId = 0L;
        this.Id = parcel.readString();
        this.Lan = parcel.readString();
        this.LessonId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.Title = parcel.readString();
        this.Tags = parcel.readString();
        this.Category = parcel.readString();
        this.Difficuty = parcel.readString();
        this.Title_ENG = parcel.readString();
        this.Title_JPN = parcel.readString();
        this.Title_KRN = parcel.readString();
        this.Title_FRN = parcel.readString();
        this.Title_DEN = parcel.readString();
        this.Title_VTN = parcel.readString();
        this.Title_TCHN = parcel.readString();
        this.Title_CHN = parcel.readString();
        this.PublishDate = parcel.readString();
        this.CreateDate = parcel.readString();
        this.Version = (Long) parcel.readValue(Long.class.getClassLoader());
        this.TipsIds = parcel.readString();
        this.sentences = parcel.createTypedArrayList(PdSentence.CREATOR);
        this.tips = parcel.createTypedArrayList(PdTips.CREATOR);
        this.pdLessonFav = (PdLessonFav) parcel.readParcelable(PdLessonFav.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PdLesson) {
            return ((PdLesson) obj).Id.equals(this.Id);
        }
        return false;
    }

    public String getCategory() {
        return this.Category;
    }

    public String getCreateDate() {
        return this.CreateDate;
    }

    public String getDifficuty() {
        return this.Difficuty;
    }

    public String getId() {
        return this.Id;
    }

    public String getLan() {
        return this.Lan;
    }

    public Long getLessonId() {
        return this.LessonId;
    }

    public PdLessonFav getPdLessonFav() {
        return this.pdLessonFav;
    }

    public String getPublishDate() {
        return this.PublishDate;
    }

    public List<PdSentence> getSentences() {
        return this.sentences;
    }

    public String getTags() {
        return this.Tags;
    }

    public List<PdTips> getTips() {
        return this.tips;
    }

    public String getTipsIds() {
        return this.TipsIds;
    }

    public String getTitle() {
        return this.Title;
    }

    public String getTitleTranslation() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 1) {
            return getTitle_JPN();
        }
        if (x.n().locateLanguage != 7 || getTitle_VTN().isEmpty()) {
            return (x.n().locateLanguage != 5 || getTitle_FRN().isEmpty()) ? getTitle_ENG() : getTitle_FRN();
        }
        return getTitle_VTN();
    }

    public String getTitle_CHN() {
        return this.Title_CHN;
    }

    public String getTitle_DEN() {
        return this.Title_DEN;
    }

    public String getTitle_ENG() {
        return this.Title_ENG;
    }

    public String getTitle_FRN() {
        return this.Title_FRN;
    }

    public String getTitle_JPN() {
        return this.Title_JPN;
    }

    public String getTitle_KRN() {
        return this.Title_KRN;
    }

    public String getTitle_TCHN() {
        return this.Title_TCHN;
    }

    public String getTitle_VTN() {
        return this.Title_VTN;
    }

    public Long getVersion() {
        return this.Version;
    }

    public void setCategory(String str) {
        this.Category = str;
    }

    public void setCreateDate(String str) {
        this.CreateDate = str;
    }

    public void setDifficuty(String str) {
        this.Difficuty = str;
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

    public void setPdLessonFav(PdLessonFav pdLessonFav) {
        this.pdLessonFav = pdLessonFav;
    }

    public void setPublishDate(String str) {
        this.PublishDate = str;
    }

    public void setSentences(List<PdSentence> list) {
        this.sentences = list;
    }

    public void setTags(String str) {
        this.Tags = str;
    }

    public void setTips(List<PdTips> list) {
        this.tips = list;
    }

    public void setTipsIds(String str) {
        this.TipsIds = str;
    }

    public void setTitle(String str) {
        this.Title = str;
    }

    public void setTitle_CHN(String str) {
        this.Title_CHN = str;
    }

    public void setTitle_DEN(String str) {
        this.Title_DEN = str;
    }

    public void setTitle_ENG(String str) {
        this.Title_ENG = str;
    }

    public void setTitle_FRN(String str) {
        this.Title_FRN = str;
    }

    public void setTitle_JPN(String str) {
        this.Title_JPN = str;
    }

    public void setTitle_KRN(String str) {
        this.Title_KRN = str;
    }

    public void setTitle_TCHN(String str) {
        this.Title_TCHN = str;
    }

    public void setTitle_VTN(String str) {
        this.Title_VTN = str;
    }

    public void setVersion(Long l9) {
        this.Version = l9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.Id);
        parcel.writeString(this.Lan);
        parcel.writeValue(this.LessonId);
        parcel.writeString(this.Title);
        parcel.writeString(this.Tags);
        parcel.writeString(this.Category);
        parcel.writeString(this.Difficuty);
        parcel.writeString(this.Title_ENG);
        parcel.writeString(this.Title_JPN);
        parcel.writeString(this.Title_KRN);
        parcel.writeString(this.Title_FRN);
        parcel.writeString(this.Title_DEN);
        parcel.writeString(this.Title_VTN);
        parcel.writeString(this.Title_TCHN);
        parcel.writeString(this.Title_CHN);
        parcel.writeString(this.PublishDate);
        parcel.writeString(this.CreateDate);
        parcel.writeValue(this.Version);
        parcel.writeString(this.TipsIds);
        parcel.writeTypedList(this.sentences);
        parcel.writeTypedList(this.tips);
        parcel.writeParcelable(this.pdLessonFav, i11);
    }

    public PdLesson(String str, String str2, Long l9, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l11, String str17) {
        this.Id = str;
        this.Lan = str2;
        this.LessonId = l9;
        this.Title = str3;
        this.Tags = str4;
        this.Category = str5;
        this.Difficuty = str6;
        this.Title_ENG = str7;
        this.Title_JPN = str8;
        this.Title_KRN = str9;
        this.Title_FRN = str10;
        this.Title_DEN = str11;
        this.Title_VTN = str12;
        this.Title_TCHN = str13;
        this.Title_CHN = str14;
        this.PublishDate = str15;
        this.CreateDate = str16;
        this.Version = l11;
        this.TipsIds = str17;
    }

    public PdLesson() {
        this.LessonId = 0L;
    }
}
