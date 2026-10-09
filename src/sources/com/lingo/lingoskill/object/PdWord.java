package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.o0;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import xt.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdWord implements Parcelable {
    public static final Parcelable.Creator<PdWord> CREATOR = new Parcelable.Creator<PdWord>() { // from class: com.lingo.lingoskill.object.PdWord.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdWord createFromParcel(Parcel parcel) {
            return new PdWord(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PdWord[] newArray(int i11) {
            return new PdWord[i11];
        }
    };
    private String Answer;
    private int Flag;
    private String Id;
    private String Lan;
    private Long LessonId;
    private String Luoma;
    private String Options;
    private String TranCHN;
    private String TranDEN;
    private String TranENG;
    private String TranFRN;
    private String TranJPN;
    private String TranKRN;
    private String TranTCHN;
    private String TranVTN;
    private String UpdateDate;
    private String WTranCHN;
    private String WTranDEN;
    private String WTranENG;
    private String WTranFRN;
    private String WTranJPN;
    private String WTranKRN;
    private String WTranTCHN;
    private String WTranVTN;
    private String Word;
    private Long WordId;
    private String WordRoot;
    private String WordRootLuoma;
    private String WordRootZhuyin;
    private int WordStruct;
    private String Zhuyin;
    private Float correctRate;
    private Long finishSortIndex;

    public PdWord() {
        this.correctRate = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        this.finishSortIndex = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PdWord) {
            return ((PdWord) obj).Id.equals(this.Id);
        }
        return false;
    }

    public String getAnswer() {
        return this.Answer;
    }

    public Float getCorrectRate() {
        return this.correctRate;
    }

    public String getDetailLuoma() {
        return this.WordStruct == 1 ? getOriginLuoma() : getShowLuoma();
    }

    public String getDetailTrans() {
        return this.WordStruct == 1 ? getOriginTrans() : getShowTrans();
    }

    public String getDetailWord() {
        if (this.WordStruct == 1) {
            return getOriginWord();
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return x.n().keyLanguage == 5 ? getShowWord().toLowerCase() : getShowWord();
    }

    public String getDetailZhuyin() {
        return this.WordStruct == 1 ? getOriginZhuyin() : getShowZhuyin();
    }

    public String getDictationWord() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().keyLanguage == 1 && ((o0) b.c()).h()) {
            return this.Zhuyin;
        }
        return (x.n().keyLanguage == 0 && ((o0) b.c()).t() == 2) ? this.Luoma : this.Word.replace("■", " ");
    }

    public String getFavId() {
        if (this.WordStruct == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getOriginWord());
            String str = this.WTranENG;
            m.f(str, "str");
            Pattern patternCompile = Pattern.compile("\\p{Punct}");
            m.e(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(str).replaceAll(BuildConfig.VERSION_NAME);
            m.e(strReplaceAll, "replaceAll(...)");
            sb2.append(oz.x.q0(strReplaceAll, " ", BuildConfig.VERSION_NAME));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getShowWord().toLowerCase());
        String str2 = this.TranENG;
        m.f(str2, "str");
        Pattern patternCompile2 = Pattern.compile("\\p{Punct}");
        m.e(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(str2).replaceAll(BuildConfig.VERSION_NAME);
        m.e(strReplaceAll2, "replaceAll(...)");
        sb3.append(oz.x.q0(strReplaceAll2, " ", BuildConfig.VERSION_NAME));
        return sb3.toString();
    }

    public Long getFinishSortIndex() {
        return this.finishSortIndex;
    }

    public int getFlag() {
        return this.Flag;
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

    public String getLuoma() {
        return this.Luoma;
    }

    public String getOptions() {
        return this.Options;
    }

    public String getOriginLuoma() {
        String strReplace = this.WordRootLuoma.replace("0", "-");
        return strReplace.split("#").length > 1 ? strReplace.split("#")[1] : strReplace;
    }

    public String getOriginTrans() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 1) {
            return this.WTranJPN;
        }
        if (x.n().locateLanguage != 7 || this.WTranVTN.isEmpty()) {
            return (x.n().locateLanguage != 5 || this.WTranFRN.isEmpty()) ? this.WTranENG : this.WTranFRN;
        }
        return this.WTranVTN;
    }

    public String getOriginWord() {
        return this.WordRoot.replace("■", " ");
    }

    public String getOriginZhuyin() {
        return this.WordRootZhuyin;
    }

    public String getShowLuoma() {
        String strReplace = this.Luoma.replace("0", "-");
        return strReplace.split("#").length > 1 ? strReplace.split("#")[1] : strReplace;
    }

    public String getShowTrans() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 1) {
            return this.TranJPN;
        }
        if (x.n().locateLanguage != 7 || this.TranVTN.isEmpty()) {
            return (x.n().locateLanguage != 5 || this.TranFRN.isEmpty()) ? this.TranENG : this.TranFRN;
        }
        return this.TranVTN;
    }

    public String getShowWord() {
        return this.Word.replace("■", " ");
    }

    public String getShowZhuyin() {
        return this.Zhuyin;
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

    public String getUpdateDate() {
        return this.UpdateDate;
    }

    public String getWTranCHN() {
        return this.WTranCHN;
    }

    public String getWTranDEN() {
        return this.WTranDEN;
    }

    public String getWTranENG() {
        return this.WTranENG;
    }

    public String getWTranFRN() {
        return this.WTranFRN;
    }

    public String getWTranJPN() {
        return this.WTranJPN;
    }

    public String getWTranKRN() {
        return this.WTranKRN;
    }

    public String getWTranTCHN() {
        return this.WTranTCHN;
    }

    public String getWTranVTN() {
        return this.WTranVTN;
    }

    public String getWord() {
        return this.Word;
    }

    public Long getWordId() {
        return this.WordId;
    }

    public String getWordRoot() {
        return this.WordRoot;
    }

    public String getWordRootLuoma() {
        return this.WordRootLuoma;
    }

    public String getWordRootZhuyin() {
        return this.WordRootZhuyin;
    }

    public int getWordStruct() {
        return this.WordStruct;
    }

    public String getZhuyin() {
        return this.Zhuyin;
    }

    public void setAnswer(String str) {
        this.Answer = str;
    }

    public void setCorrectRate(Float f5) {
        this.correctRate = f5;
    }

    public void setFinishSortIndex(Long l9) {
        this.finishSortIndex = l9;
    }

    public void setFlag(int i11) {
        this.Flag = i11;
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

    public void setLuoma(String str) {
        this.Luoma = str;
    }

    public void setOptions(String str) {
        this.Options = str;
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

    public void setWTranCHN(String str) {
        this.WTranCHN = str;
    }

    public void setWTranDEN(String str) {
        this.WTranDEN = str;
    }

    public void setWTranENG(String str) {
        this.WTranENG = str;
    }

    public void setWTranFRN(String str) {
        this.WTranFRN = str;
    }

    public void setWTranJPN(String str) {
        this.WTranJPN = str;
    }

    public void setWTranKRN(String str) {
        this.WTranKRN = str;
    }

    public void setWTranTCHN(String str) {
        this.WTranTCHN = str;
    }

    public void setWTranVTN(String str) {
        this.WTranVTN = str;
    }

    public void setWord(String str) {
        this.Word = str;
    }

    public void setWordId(Long l9) {
        this.WordId = l9;
    }

    public void setWordRoot(String str) {
        this.WordRoot = str;
    }

    public void setWordRootLuoma(String str) {
        this.WordRootLuoma = str;
    }

    public void setWordRootZhuyin(String str) {
        this.WordRootZhuyin = str;
    }

    public void setWordStruct(int i11) {
        this.WordStruct = i11;
    }

    public void setZhuyin(String str) {
        this.Zhuyin = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.Id);
        parcel.writeString(this.Lan);
        parcel.writeValue(this.WordId);
        parcel.writeValue(this.LessonId);
        parcel.writeString(this.Word);
        parcel.writeString(this.Zhuyin);
        parcel.writeString(this.Luoma);
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
        parcel.writeInt(this.Flag);
        parcel.writeString(this.UpdateDate);
        parcel.writeString(this.WordRoot);
        parcel.writeString(this.WordRootZhuyin);
        parcel.writeString(this.WordRootLuoma);
        parcel.writeString(this.WTranENG);
        parcel.writeString(this.WTranJPN);
        parcel.writeString(this.WTranKRN);
        parcel.writeString(this.WTranFRN);
        parcel.writeString(this.WTranDEN);
        parcel.writeString(this.WTranVTN);
        parcel.writeString(this.WTranTCHN);
        parcel.writeString(this.WTranCHN);
        parcel.writeInt(this.WordStruct);
        parcel.writeValue(this.correctRate);
        parcel.writeValue(this.finishSortIndex);
    }

    public PdWord(Parcel parcel) {
        this.correctRate = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        this.finishSortIndex = 0L;
        this.Id = parcel.readString();
        this.Lan = parcel.readString();
        this.WordId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.LessonId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.Word = parcel.readString();
        this.Zhuyin = parcel.readString();
        this.Luoma = parcel.readString();
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
        this.Flag = parcel.readInt();
        this.UpdateDate = parcel.readString();
        this.WordRoot = parcel.readString();
        this.WordRootZhuyin = parcel.readString();
        this.WordRootLuoma = parcel.readString();
        this.WTranENG = parcel.readString();
        this.WTranJPN = parcel.readString();
        this.WTranKRN = parcel.readString();
        this.WTranFRN = parcel.readString();
        this.WTranDEN = parcel.readString();
        this.WTranVTN = parcel.readString();
        this.WTranTCHN = parcel.readString();
        this.WTranCHN = parcel.readString();
        this.WordStruct = parcel.readInt();
        this.correctRate = (Float) parcel.readValue(Float.class.getClassLoader());
        this.finishSortIndex = (Long) parcel.readValue(Long.class.getClassLoader());
    }

    public PdWord(String str, String str2, Long l9, Long l11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i12) {
        this.correctRate = Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
        this.finishSortIndex = 0L;
        this.Id = str;
        this.Lan = str2;
        this.WordId = l9;
        this.LessonId = l11;
        this.Word = str3;
        this.Zhuyin = str4;
        this.Luoma = str5;
        this.TranENG = str6;
        this.TranJPN = str7;
        this.TranKRN = str8;
        this.TranFRN = str9;
        this.TranDEN = str10;
        this.TranVTN = str11;
        this.TranTCHN = str12;
        this.TranCHN = str13;
        this.Options = str14;
        this.Answer = str15;
        this.Flag = i11;
        this.UpdateDate = str16;
        this.WordRoot = str17;
        this.WordRootZhuyin = str18;
        this.WordRootLuoma = str19;
        this.WTranENG = str20;
        this.WTranJPN = str21;
        this.WTranKRN = str22;
        this.WTranFRN = str23;
        this.WTranDEN = str24;
        this.WTranVTN = str25;
        this.WTranTCHN = str26;
        this.WTranCHN = str27;
        this.WordStruct = i12;
    }
}
