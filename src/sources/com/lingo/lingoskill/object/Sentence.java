package com.lingo.lingoskill.object;

import cf.x;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Sentence implements MultiItemEntity {
    public static final int TYPE_FEMALE = 3;
    public static final int TYPE_MALE = 2;
    public static final int TYPE_NORMAL = 1;
    public String DirCode;
    public String Lessons;
    public String Sentence;
    public long SentenceId;
    public String TSentence;
    public String Translations;
    public String WordList;
    private boolean hasChecked;
    private qi.a model;
    private List<Word> sentWords;
    private float speechScore;
    private List<Integer> wordScores;

    public Sentence(long j11, String str, String str2, String str3, String str4, String str5, String str6) {
        this.SentenceId = j11;
        this.Sentence = str;
        this.TSentence = str2;
        this.WordList = str3;
        this.Translations = str4;
        this.DirCode = str5;
        this.Lessons = str6;
    }

    public String genLuoma() {
        StringBuilder sb2 = new StringBuilder();
        for (Word word : getSentWords()) {
            if (word.getLuoma() != null && !word.getLuoma().equals(BuildConfig.VERSION_NAME)) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 1 || x.n().keyLanguage == 12) {
                    sb2.append(word.getLuoma().replace(" ", BuildConfig.VERSION_NAME));
                    sb2.append(" ");
                } else {
                    sb2.append(word.getLuoma());
                    sb2.append(" ");
                }
            } else if (word.getWord().equals(" ")) {
                sb2.append(" ");
            }
        }
        return sb2.toString().trim();
    }

    public String genZhuyin() {
        StringBuilder sb2 = new StringBuilder();
        for (Word word : getSentWords()) {
            if (word.getZhuyin() != null && !word.getZhuyin().equals(BuildConfig.VERSION_NAME)) {
                sb2.append(word.getZhuyin());
                sb2.append(" ");
            }
        }
        return sb2.toString().trim();
    }

    public String getDirCode() {
        return this.DirCode;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        byte b3 = 0;
        String word = this.sentWords.get(0).getWord();
        word.getClass();
        switch (word.hashCode()) {
            case 2228:
                if (!word.equals("F:")) {
                    b3 = -1;
                }
                break;
            case 2290:
                b3 = !word.equals("H:") ? (byte) -1 : (byte) 1;
                break;
            case 2445:
                b3 = !word.equals("M:") ? (byte) -1 : (byte) 2;
                break;
            case 68847:
                b3 = !word.equals("F1:") ? (byte) -1 : (byte) 3;
                break;
            case 2117952:
                b3 = !word.equals("F : ") ? (byte) -1 : (byte) 4;
                break;
            case 2124333:
                b3 = !word.equals("F&M:") ? (byte) -1 : (byte) 5;
                break;
            case 2177534:
                b3 = !word.equals("H : ") ? (byte) -1 : (byte) 6;
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
            case 3:
            case 4:
            case 5:
                return 3;
            case 1:
            case 2:
            case 6:
                return 2;
            default:
                return 1;
        }
    }

    public String getLessons() {
        return this.Lessons;
    }

    public qi.a getModel() {
        return this.model;
    }

    public List<Word> getSentWords() {
        if (getItemType() != 3 && getItemType() != 2) {
            return this.sentWords;
        }
        List<Word> list = this.sentWords;
        return list.subList(1, list.size());
    }

    public List<Word> getSentWordsNOMF() {
        if (getItemType() != 3 && getItemType() != 2) {
            return this.sentWords;
        }
        List<Word> list = this.sentWords;
        return list.subList(1, list.size());
    }

    public String getSentence() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return x.n().keyLanguage == 65 ? this.Sentence.replace("P:", BuildConfig.VERSION_NAME).replace("M:", BuildConfig.VERSION_NAME).replace("F:", BuildConfig.VERSION_NAME).replace("H:", BuildConfig.VERSION_NAME).replace("H : ", BuildConfig.VERSION_NAME).replace("F : ", BuildConfig.VERSION_NAME).replace("F1:", BuildConfig.VERSION_NAME).replace("F&M:", BuildConfig.VERSION_NAME).replace("?", ";") : this.Sentence.replace("P:", BuildConfig.VERSION_NAME).replace("M:", BuildConfig.VERSION_NAME).replace("F:", BuildConfig.VERSION_NAME).replace("H:", BuildConfig.VERSION_NAME).replace("H : ", BuildConfig.VERSION_NAME).replace("F : ", BuildConfig.VERSION_NAME).replace("F1:", BuildConfig.VERSION_NAME).replace("F&M:", BuildConfig.VERSION_NAME);
    }

    public long getSentenceId() {
        return this.SentenceId;
    }

    public float getSpeechScore() {
        return this.speechScore;
    }

    public String getTSentence() {
        return this.TSentence;
    }

    public String getTranslations() {
        return this.Translations.replace("P:", BuildConfig.VERSION_NAME).replace("M:", BuildConfig.VERSION_NAME).replace("F:", BuildConfig.VERSION_NAME).replace("H:", BuildConfig.VERSION_NAME).replace("H : ", BuildConfig.VERSION_NAME).replace("F : ", BuildConfig.VERSION_NAME).replace("F1:", BuildConfig.VERSION_NAME).replace("F&M:", BuildConfig.VERSION_NAME).replace(" ", " ").trim();
    }

    public String getWordList() {
        return this.WordList;
    }

    public List<Integer> getWordScores() {
        return this.wordScores;
    }

    public boolean isHasChecked() {
        return this.hasChecked;
    }

    public void setDirCode(String str) {
        this.DirCode = str;
    }

    public void setHasChecked(boolean z11) {
        this.hasChecked = z11;
    }

    public void setLessons(String str) {
        this.Lessons = str;
    }

    public void setModel(qi.a aVar) {
        this.model = aVar;
    }

    public void setSentWords(List<Word> list) {
        this.sentWords = list;
    }

    public void setSentence(String str) {
        this.Sentence = str;
    }

    public void setSentenceId(long j11) {
        this.SentenceId = j11;
    }

    public void setSpeechScore(float f5) {
        this.speechScore = f5;
    }

    public void setTSentence(String str) {
        this.TSentence = str;
    }

    public void setTranslations(String str) {
        this.Translations = str;
    }

    public void setWordList(String str) {
        this.WordList = str;
    }

    public void setWordScores(List<Integer> list) {
        this.wordScores = list;
    }

    public Sentence() {
    }
}
