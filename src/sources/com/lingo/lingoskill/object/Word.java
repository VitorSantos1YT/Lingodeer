package com.lingo.lingoskill.object;

import cf.x;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Word implements MultiItemEntity {
    public int Animation;
    public String DirCode;
    public String Explanation;
    public String Featured;
    public String Lessons;
    public String Luoma;
    public String MainPic;
    public String Pos;
    public String TWord;
    public String Translations;
    public String Word;
    public long WordId;
    public int WordType;
    public String Zhuyin;

    public Word(long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, int i12, String str10, String str11) {
        this.WordId = j11;
        this.Word = str;
        this.TWord = str2;
        this.Zhuyin = str3;
        this.Luoma = str4;
        this.Translations = str5;
        this.Explanation = str6;
        this.MainPic = str7;
        this.DirCode = str8;
        this.Lessons = str9;
        this.WordType = i11;
        this.Animation = i12;
        this.Pos = str10;
        this.Featured = str11;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Word) && ((Word) obj).getWordId() == getWordId();
    }

    public int getAnimation() {
        return this.Animation;
    }

    public String getDirCode() {
        return this.DirCode;
    }

    public String getExplanation() {
        String str = this.Explanation;
        return str == null ? BuildConfig.VERSION_NAME : str.replace("https://wap.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css", "https://www.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css").replace("http://wap.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css", "https://www.lingodeer.com/javascript/jsLibrary/richText/css/froala_style.min.css").replace("!@@@!", "/");
    }

    public String getFeatured() {
        return this.Featured;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 0;
    }

    public String getLessons() {
        return this.Lessons;
    }

    public String getLuoma() {
        String str;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 51 || i11 == 55 || i11 == 57 || i11 == 61 || i11 == 63 || i11 == 65) {
                        return this.Luoma;
                    }
                    switch (i11) {
                        case 11:
                        case 13:
                            break;
                        case 12:
                            break;
                        default:
                            return BuildConfig.VERSION_NAME;
                    }
                }
            }
            if (this.Luoma == null) {
                this.Luoma = BuildConfig.VERSION_NAME;
            }
            if (this.Luoma.split("#").length > 1) {
                str = x.n().jsLuomaDisplay == 0 ? this.Luoma.split("#")[1] : this.Luoma.split("#")[0];
            } else {
                str = this.Luoma;
            }
            return str.replace("_", " ");
        }
        return getZhuyin();
    }

    public String getMainPic() {
        return this.MainPic;
    }

    public String getPos() {
        return this.Pos;
    }

    public String getTWord() {
        return this.TWord;
    }

    public String getTranslations() {
        return this.Translations.replace("!@@@!", "/");
    }

    public String getWord() {
        if (this.Word == null) {
            return BuildConfig.VERSION_NAME;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return x.n().keyLanguage == 65 ? this.Word.replace("■", " ").replace("_1", BuildConfig.VERSION_NAME).replace("_2", BuildConfig.VERSION_NAME).replace("_4", BuildConfig.VERSION_NAME).replace("_5", BuildConfig.VERSION_NAME).replace("_6", BuildConfig.VERSION_NAME).replace("_7", BuildConfig.VERSION_NAME).replace("_8", BuildConfig.VERSION_NAME).replace("_9", BuildConfig.VERSION_NAME).replace("?", ";") : this.Word.replace("■", " ").replace("_1", BuildConfig.VERSION_NAME).replace("_2", BuildConfig.VERSION_NAME).replace("_4", BuildConfig.VERSION_NAME).replace("_5", BuildConfig.VERSION_NAME).replace("_6", BuildConfig.VERSION_NAME).replace("_7", BuildConfig.VERSION_NAME).replace("_8", BuildConfig.VERSION_NAME).replace("_9", BuildConfig.VERSION_NAME);
    }

    public long getWordId() {
        return this.WordId;
    }

    public int getWordType() {
        return this.WordType;
    }

    public String getZhuyin() {
        String str = this.Zhuyin;
        return str == null ? BuildConfig.VERSION_NAME : str.replace("■", BuildConfig.VERSION_NAME).replace("_", " ").replace("  ", " ");
    }

    public void setAnimation(int i11) {
        this.Animation = i11;
    }

    public void setDirCode(String str) {
        this.DirCode = str;
    }

    public void setExplanation(String str) {
        this.Explanation = str;
    }

    public void setFeatured(String str) {
        this.Featured = str;
    }

    public void setLessons(String str) {
        this.Lessons = str;
    }

    public void setLuoma(String str) {
        this.Luoma = str;
    }

    public void setMainPic(String str) {
        this.MainPic = str;
    }

    public void setPos(String str) {
        this.Pos = str;
    }

    public void setTWord(String str) {
        this.TWord = str;
    }

    public void setTranslations(String str) {
        this.Translations = str;
    }

    public void setWord(String str) {
        this.Word = str;
    }

    public void setWordId(long j11) {
        this.WordId = j11;
    }

    public void setWordType(int i11) {
        this.WordType = i11;
    }

    public void setZhuyin(String str) {
        this.Zhuyin = str;
    }

    public Word() {
    }
}
