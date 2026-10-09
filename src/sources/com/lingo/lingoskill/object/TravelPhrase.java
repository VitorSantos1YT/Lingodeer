package com.lingo.lingoskill.object;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TravelPhrase {
    private String Arabic;
    private long CID;
    private String English;
    private String French;
    private String German;
    private long ID;
    private String Indonesian;
    private String Italian;
    private String Japanese;
    private String Korean;
    private String Phrase;
    private String PhraseLuoma;
    private String PhraseZhuyin;
    private String Polish;
    private String Portuguese;
    private String Russian;
    private String SChinese;
    private String Spanish;
    private String TChinese;
    private String Thai;
    private String Turkish;
    private String Vietnamese;

    public TravelPhrase(long j11, long j12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        this.ID = j11;
        this.CID = j12;
        this.Phrase = str;
        this.PhraseZhuyin = str2;
        this.PhraseLuoma = str3;
        this.English = str4;
        this.SChinese = str5;
        this.TChinese = str6;
        this.Japanese = str7;
        this.Korean = str8;
        this.Spanish = str9;
        this.French = str10;
        this.German = str11;
        this.Italian = str12;
        this.Portuguese = str13;
        this.Vietnamese = str14;
        this.Russian = str15;
        this.Thai = str16;
        this.Indonesian = str17;
        this.Arabic = str18;
        this.Polish = str19;
        this.Turkish = str20;
    }

    public String getArabic() {
        return this.Arabic;
    }

    public long getCID() {
        return this.CID;
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

    public long getID() {
        return this.ID;
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

    public String getPhrase() {
        return this.Phrase;
    }

    public String getPhraseLuoma() {
        return this.PhraseLuoma;
    }

    public String getPhraseZhuyin() {
        return this.PhraseZhuyin;
    }

    public String getPinyin() {
        if (getPhrase().equals("再见")) {
            return "zài jiàn";
        }
        return getPhrase().equals("我是…人") ? "wǒ shì rén" : getPhraseZhuyin();
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

    public List<Word> getSentenceWords() {
        ArrayList arrayList = new ArrayList();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().keyLanguage != 1 && x.n().keyLanguage != 10 && x.n().keyLanguage != 51) {
            Word word = new Word();
            word.setZhuyin(this.PhraseZhuyin);
            word.setLuoma(this.PhraseLuoma);
            if (x.n().keyLanguage == 2) {
                word.setZhuyin(this.PhraseLuoma);
            }
            word.setWord(this.Phrase);
            arrayList.add(word);
            return arrayList;
        }
        String[] strArrSplit = this.Phrase.split("/");
        String[] strArrSplit2 = this.PhraseZhuyin.split("/");
        String[] strArrSplit3 = this.PhraseLuoma.split("/");
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Word word2 = new Word();
            word2.setWord(strArrSplit[i11]);
            if (i11 < strArrSplit2.length) {
                word2.setZhuyin(strArrSplit2[i11]);
            }
            if (i11 < strArrSplit3.length) {
                word2.setLuoma(strArrSplit3[i11]);
            }
            String str = word2.Word;
            m.f(str, "str");
            if (Pattern.matches("\\p{Punct}", str) || str.equals("...") || str.equals(" ") || str.equals("～")) {
                word2.setWordType(1);
            }
            arrayList.add(word2);
        }
        return arrayList;
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

    public void setCID(long j11) {
        this.CID = j11;
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

    public void setID(long j11) {
        this.ID = j11;
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

    public void setPhrase(String str) {
        this.Phrase = str;
    }

    public void setPhraseLuoma(String str) {
        this.PhraseLuoma = str;
    }

    public void setPhraseZhuyin(String str) {
        this.PhraseZhuyin = str;
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

    public TravelPhrase() {
    }
}
