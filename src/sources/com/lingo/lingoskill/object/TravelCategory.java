package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TravelCategory implements Parcelable {
    public static final Parcelable.Creator<TravelCategory> CREATOR = new Parcelable.Creator<TravelCategory>() { // from class: com.lingo.lingoskill.object.TravelCategory.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TravelCategory createFromParcel(Parcel parcel) {
            return new TravelCategory(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TravelCategory[] newArray(int i11) {
            return new TravelCategory[i11];
        }
    };
    private String Arabic;
    private String Category;
    private long CategoryId;
    private String English;
    private String French;
    private String German;
    private String Indonesian;
    private String Italian;
    private String Japanese;
    private String Korean;
    private String Polish;
    private String Portuguese;
    private String Russian;
    private String SChinese;
    private String Spanish;
    private String TChinese;
    private String Thai;
    private String Turkish;
    private String Vietnamese;

    public TravelCategory() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getArabic() {
        return this.Arabic;
    }

    public String getCategory() {
        return this.Category;
    }

    public long getCategoryId() {
        return this.CategoryId;
    }

    public String getEnglish() {
        return this.English;
    }

    public String getFrench() {
        return this.French;
    }

    public String getGerman() {
        return this.German;
    }

    public String getIndonesian() {
        return this.Indonesian;
    }

    public String getItalian() {
        return this.Italian;
    }

    public String getJapanese() {
        return this.Japanese;
    }

    public String getKorean() {
        return this.Korean;
    }

    public String getPolish() {
        return this.Polish;
    }

    public String getPortuguese() {
        return this.Portuguese;
    }

    public String getRussian() {
        return this.Russian;
    }

    public String getSChinese() {
        return this.SChinese;
    }

    public String getSpanish() {
        return this.Spanish;
    }

    public String getTChinese() {
        return this.TChinese;
    }

    public String getThai() {
        return this.Thai;
    }

    public String getTranslation() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().locateLanguage;
        if (i11 == 1) {
            return getJapanese();
        }
        if (i11 == 2) {
            return getKorean();
        }
        if (i11 == 18) {
            return getIndonesian();
        }
        if (i11 == 51) {
            return getArabic();
        }
        if (i11 == 57) {
            return getThai();
        }
        if (i11 == 20) {
            return getItalian();
        }
        if (i11 == 21) {
            return getTurkish();
        }
        switch (i11) {
            case 4:
                return getSpanish();
            case 5:
                return getFrench();
            case 6:
                return getGerman();
            case 7:
                return getVietnamese();
            case 8:
                return getPortuguese();
            case 9:
                return getTChinese();
            case 10:
                return getRussian();
            default:
                return getEnglish();
        }
    }

    public String getTurkish() {
        return this.Turkish;
    }

    public String getVietnamese() {
        return this.Vietnamese;
    }

    public void setArabic(String str) {
        this.Arabic = str;
    }

    public void setCategory(String str) {
        this.Category = str;
    }

    public void setCategoryId(long j11) {
        this.CategoryId = j11;
    }

    public void setEnglish(String str) {
        this.English = str;
    }

    public void setFrench(String str) {
        this.French = str;
    }

    public void setGerman(String str) {
        this.German = str;
    }

    public void setIndonesian(String str) {
        this.Indonesian = str;
    }

    public void setItalian(String str) {
        this.Italian = str;
    }

    public void setJapanese(String str) {
        this.Japanese = str;
    }

    public void setKorean(String str) {
        this.Korean = str;
    }

    public void setPolish(String str) {
        this.Polish = str;
    }

    public void setPortuguese(String str) {
        this.Portuguese = str;
    }

    public void setRussian(String str) {
        this.Russian = str;
    }

    public void setSChinese(String str) {
        this.SChinese = str;
    }

    public void setSpanish(String str) {
        this.Spanish = str;
    }

    public void setTChinese(String str) {
        this.TChinese = str;
    }

    public void setThai(String str) {
        this.Thai = str;
    }

    public void setTurkish(String str) {
        this.Turkish = str;
    }

    public void setVietnamese(String str) {
        this.Vietnamese = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.CategoryId);
        parcel.writeString(this.Category);
        parcel.writeString(this.English);
        parcel.writeString(this.SChinese);
        parcel.writeString(this.TChinese);
        parcel.writeString(this.Japanese);
        parcel.writeString(this.Korean);
        parcel.writeString(this.Spanish);
        parcel.writeString(this.French);
        parcel.writeString(this.German);
        parcel.writeString(this.Italian);
        parcel.writeString(this.Portuguese);
        parcel.writeString(this.Vietnamese);
        parcel.writeString(this.Russian);
        parcel.writeString(this.Thai);
        parcel.writeString(this.Indonesian);
        parcel.writeString(this.Arabic);
        parcel.writeString(this.Polish);
        parcel.writeString(this.Turkish);
    }

    public TravelCategory(Parcel parcel) {
        this.CategoryId = parcel.readLong();
        this.Category = parcel.readString();
        this.English = parcel.readString();
        this.SChinese = parcel.readString();
        this.TChinese = parcel.readString();
        this.Japanese = parcel.readString();
        this.Korean = parcel.readString();
        this.Spanish = parcel.readString();
        this.French = parcel.readString();
        this.German = parcel.readString();
        this.Italian = parcel.readString();
        this.Portuguese = parcel.readString();
        this.Vietnamese = parcel.readString();
        this.Russian = parcel.readString();
        this.Thai = parcel.readString();
        this.Indonesian = parcel.readString();
        this.Arabic = parcel.readString();
        this.Polish = parcel.readString();
        this.Turkish = parcel.readString();
    }

    public TravelCategory(long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.CategoryId = j11;
        this.Category = str;
        this.English = str2;
        this.SChinese = str3;
        this.TChinese = str4;
        this.Japanese = str5;
        this.Korean = str6;
        this.Spanish = str7;
        this.French = str8;
        this.German = str9;
        this.Italian = str10;
        this.Portuguese = str11;
        this.Vietnamese = str12;
        this.Russian = str13;
        this.Thai = str14;
        this.Indonesian = str15;
        this.Arabic = str16;
        this.Polish = str17;
        this.Turkish = str18;
    }
}
