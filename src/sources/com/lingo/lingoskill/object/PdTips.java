package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdTips implements Parcelable {
    public static final Parcelable.Creator<PdTips> CREATOR = new Parcelable.Creator<PdTips>() { // from class: com.lingo.lingoskill.object.PdTips.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdTips createFromParcel(Parcel parcel) {
            return new PdTips(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdTips[] newArray(int i11) {
            return new PdTips[i11];
        }
    };
    private String CHN_Name;
    private String CHN_Tips;
    private Long CardId;
    private String CardName;
    private Long CardTypeId;
    private String CardTypeName;
    private String CardTypeTranCHN;
    private String CardTypeTranDEN;
    private String CardTypeTranENG;
    private String CardTypeTranESO;
    private String CardTypeTranFRN;
    private String CardTypeTranJPN;
    private String CardTypeTranKRN;
    private String CardTypeTranVTN;
    private String DEN_Name;
    private String DEN_Tips;
    private String ENG_Name;
    private String ENG_Tips;
    private String ESO_Name;
    private String ESO_Tips;
    private String FRN_Name;
    private String FRN_Tips;
    private String Id;
    private String JPN_Name;
    private String JPN_Tips;
    private String KRN_Name;
    private String KRN_Tips;
    private String Lan;
    private String LessonIds;
    private String VTN_Name;
    private String VTN_Tips;

    public PdTips(Parcel parcel) {
        this.Id = parcel.readString();
        this.Lan = parcel.readString();
        this.CardId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.LessonIds = parcel.readString();
        this.CardName = parcel.readString();
        this.CHN_Name = parcel.readString();
        this.ENG_Name = parcel.readString();
        this.JPN_Name = parcel.readString();
        this.KRN_Name = parcel.readString();
        this.DEN_Name = parcel.readString();
        this.FRN_Name = parcel.readString();
        this.ESO_Name = parcel.readString();
        this.VTN_Name = parcel.readString();
        this.CHN_Tips = parcel.readString();
        this.ENG_Tips = parcel.readString();
        this.JPN_Tips = parcel.readString();
        this.KRN_Tips = parcel.readString();
        this.DEN_Tips = parcel.readString();
        this.FRN_Tips = parcel.readString();
        this.ESO_Tips = parcel.readString();
        this.VTN_Tips = parcel.readString();
        this.CardTypeId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.CardTypeName = parcel.readString();
        this.CardTypeTranCHN = parcel.readString();
        this.CardTypeTranENG = parcel.readString();
        this.CardTypeTranJPN = parcel.readString();
        this.CardTypeTranKRN = parcel.readString();
        this.CardTypeTranDEN = parcel.readString();
        this.CardTypeTranFRN = parcel.readString();
        this.CardTypeTranESO = parcel.readString();
        this.CardTypeTranVTN = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCHN_Name() {
        return this.CHN_Name;
    }

    public String getCHN_Tips() {
        return this.CHN_Tips;
    }

    public Long getCardId() {
        return this.CardId;
    }

    public String getCardName() {
        return this.CardName;
    }

    public Long getCardTypeId() {
        return this.CardTypeId;
    }

    public String getCardTypeName() {
        return this.CardTypeName;
    }

    public String getCardTypeTranCHN() {
        return this.CardTypeTranCHN;
    }

    public String getCardTypeTranDEN() {
        return this.CardTypeTranDEN;
    }

    public String getCardTypeTranENG() {
        return this.CardTypeTranENG;
    }

    public String getCardTypeTranESO() {
        return this.CardTypeTranESO;
    }

    public String getCardTypeTranFRN() {
        return this.CardTypeTranFRN;
    }

    public String getCardTypeTranJPN() {
        return this.CardTypeTranJPN;
    }

    public String getCardTypeTranKRN() {
        return this.CardTypeTranKRN;
    }

    public String getCardTypeTranVTN() {
        return this.CardTypeTranVTN;
    }

    public String getDEN_Name() {
        return this.DEN_Name;
    }

    public String getDEN_Tips() {
        return this.DEN_Tips;
    }

    public String getENG_Name() {
        return this.ENG_Name;
    }

    public String getENG_Tips() {
        return this.ENG_Tips;
    }

    public String getESO_Name() {
        return this.ESO_Name;
    }

    public String getESO_Tips() {
        return this.ESO_Tips;
    }

    public String getFRN_Name() {
        return this.FRN_Name;
    }

    public String getFRN_Tips() {
        return this.FRN_Tips;
    }

    public String getId() {
        return this.Id;
    }

    public String getJPN_Name() {
        return this.JPN_Name;
    }

    public String getJPN_Tips() {
        return this.JPN_Tips;
    }

    public String getKRN_Name() {
        return this.KRN_Name;
    }

    public String getKRN_Tips() {
        return this.KRN_Tips;
    }

    public String getLan() {
        return this.Lan;
    }

    public String getLessonIds() {
        return this.LessonIds;
    }

    public String getTips() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 1 && !getJPN_Tips().isEmpty()) {
            return getJPN_Tips();
        }
        if (x.n().locateLanguage != 7 || getVTN_Tips().isEmpty()) {
            return (x.n().locateLanguage != 5 || getFRN_Tips().isEmpty()) ? getENG_Tips() : getFRN_Tips();
        }
        return getVTN_Tips();
    }

    public String getTipsName() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 1) {
            return getJPN_Name();
        }
        if (x.n().locateLanguage != 7 || getVTN_Name().isEmpty()) {
            return (x.n().locateLanguage != 5 || getFRN_Name().isEmpty()) ? getENG_Name() : getFRN_Name();
        }
        return getVTN_Name();
    }

    public String getVTN_Name() {
        return this.VTN_Name;
    }

    public String getVTN_Tips() {
        return this.VTN_Tips;
    }

    public void setCHN_Name(String str) {
        this.CHN_Name = str;
    }

    public void setCHN_Tips(String str) {
        this.CHN_Tips = str;
    }

    public void setCardId(Long l9) {
        this.CardId = l9;
    }

    public void setCardName(String str) {
        this.CardName = str;
    }

    public void setCardTypeId(Long l9) {
        this.CardTypeId = l9;
    }

    public void setCardTypeName(String str) {
        this.CardTypeName = str;
    }

    public void setCardTypeTranCHN(String str) {
        this.CardTypeTranCHN = str;
    }

    public void setCardTypeTranDEN(String str) {
        this.CardTypeTranDEN = str;
    }

    public void setCardTypeTranENG(String str) {
        this.CardTypeTranENG = str;
    }

    public void setCardTypeTranESO(String str) {
        this.CardTypeTranESO = str;
    }

    public void setCardTypeTranFRN(String str) {
        this.CardTypeTranFRN = str;
    }

    public void setCardTypeTranJPN(String str) {
        this.CardTypeTranJPN = str;
    }

    public void setCardTypeTranKRN(String str) {
        this.CardTypeTranKRN = str;
    }

    public void setCardTypeTranVTN(String str) {
        this.CardTypeTranVTN = str;
    }

    public void setDEN_Name(String str) {
        this.DEN_Name = str;
    }

    public void setDEN_Tips(String str) {
        this.DEN_Tips = str;
    }

    public void setENG_Name(String str) {
        this.ENG_Name = str;
    }

    public void setENG_Tips(String str) {
        this.ENG_Tips = str;
    }

    public void setESO_Name(String str) {
        this.ESO_Name = str;
    }

    public void setESO_Tips(String str) {
        this.ESO_Tips = str;
    }

    public void setFRN_Name(String str) {
        this.FRN_Name = str;
    }

    public void setFRN_Tips(String str) {
        this.FRN_Tips = str;
    }

    public void setId(String str) {
        this.Id = str;
    }

    public void setJPN_Name(String str) {
        this.JPN_Name = str;
    }

    public void setJPN_Tips(String str) {
        this.JPN_Tips = str;
    }

    public void setKRN_Name(String str) {
        this.KRN_Name = str;
    }

    public void setKRN_Tips(String str) {
        this.KRN_Tips = str;
    }

    public void setLan(String str) {
        this.Lan = str;
    }

    public void setLessonIds(String str) {
        this.LessonIds = str;
    }

    public void setVTN_Name(String str) {
        this.VTN_Name = str;
    }

    public void setVTN_Tips(String str) {
        this.VTN_Tips = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.Id);
        parcel.writeString(this.Lan);
        parcel.writeValue(this.CardId);
        parcel.writeString(this.LessonIds);
        parcel.writeString(this.CardName);
        parcel.writeString(this.CHN_Name);
        parcel.writeString(this.ENG_Name);
        parcel.writeString(this.JPN_Name);
        parcel.writeString(this.KRN_Name);
        parcel.writeString(this.DEN_Name);
        parcel.writeString(this.FRN_Name);
        parcel.writeString(this.ESO_Name);
        parcel.writeString(this.VTN_Name);
        parcel.writeString(this.CHN_Tips);
        parcel.writeString(this.ENG_Tips);
        parcel.writeString(this.JPN_Tips);
        parcel.writeString(this.KRN_Tips);
        parcel.writeString(this.DEN_Tips);
        parcel.writeString(this.FRN_Tips);
        parcel.writeString(this.ESO_Tips);
        parcel.writeString(this.VTN_Tips);
        parcel.writeValue(this.CardTypeId);
        parcel.writeString(this.CardTypeName);
        parcel.writeString(this.CardTypeTranCHN);
        parcel.writeString(this.CardTypeTranENG);
        parcel.writeString(this.CardTypeTranJPN);
        parcel.writeString(this.CardTypeTranKRN);
        parcel.writeString(this.CardTypeTranDEN);
        parcel.writeString(this.CardTypeTranFRN);
        parcel.writeString(this.CardTypeTranESO);
        parcel.writeString(this.CardTypeTranVTN);
    }

    public PdTips(String str, String str2, Long l9, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Long l11, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29) {
        this.Id = str;
        this.Lan = str2;
        this.CardId = l9;
        this.LessonIds = str3;
        this.CardName = str4;
        this.CHN_Name = str5;
        this.ENG_Name = str6;
        this.JPN_Name = str7;
        this.KRN_Name = str8;
        this.DEN_Name = str9;
        this.FRN_Name = str10;
        this.ESO_Name = str11;
        this.VTN_Name = str12;
        this.CHN_Tips = str13;
        this.ENG_Tips = str14;
        this.JPN_Tips = str15;
        this.KRN_Tips = str16;
        this.DEN_Tips = str17;
        this.FRN_Tips = str18;
        this.ESO_Tips = str19;
        this.VTN_Tips = str20;
        this.CardTypeId = l11;
        this.CardTypeName = str21;
        this.CardTypeTranCHN = str22;
        this.CardTypeTranENG = str23;
        this.CardTypeTranJPN = str24;
        this.CardTypeTranKRN = str25;
        this.CardTypeTranDEN = str26;
        this.CardTypeTranFRN = str27;
        this.CardTypeTranESO = str28;
        this.CardTypeTranVTN = str29;
    }

    public PdTips() {
    }
}
