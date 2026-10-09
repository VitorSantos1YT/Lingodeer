package com.lingo.lingoskill.object;

import android.database.Cursor;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ij.c;
import ij.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import k10.g;
import k10.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_010 {
    private String Answer;
    private long Id;
    private String Options;
    private long SentenceId;
    private String SentenceStem;
    private String TOptions;
    private List<Sentence> optionList;
    private Sentence sentence;

    public Model_Sentence_010(long j11, long j12, String str, String str2, String str3, String str4) {
        this.Id = j11;
        this.SentenceId = j12;
        this.SentenceStem = str;
        this.Options = str2;
        this.TOptions = str3;
        this.Answer = str4;
    }

    public static boolean checkSimpleObject(long j11) {
        if (d.f34419e == null) {
            synchronized (d.class) {
                if (d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    d.f34419e = new d(lingoSkillApplication);
                }
            }
        }
        d dVar = d.f34419e;
        m.c(dVar);
        Model_Sentence_010Dao model_Sentence_010Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_010Dao();
        m.e(model_Sentence_010Dao, "getModel_Sentence_010Dao(...)");
        g gVarQueryBuilder = model_Sentence_010Dao.queryBuilder();
        gVarQueryBuilder.f(Model_Sentence_010Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        Cursor cursorC = gVarQueryBuilder.b().c();
        if (cursorC.moveToNext()) {
            cursorC.close();
            return true;
        }
        cursorC.close();
        return false;
    }

    public static Model_Sentence_010 loadFullObject(long j11) {
        Model_Sentence_010 model_Sentence_010;
        int i11;
        try {
            if (d.f34419e == null) {
                synchronized (d.class) {
                    if (d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication);
                        d.f34419e = new d(lingoSkillApplication);
                    }
                }
            }
            d dVar = d.f34419e;
            m.c(dVar);
            Model_Sentence_010Dao model_Sentence_010Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_010Dao();
            m.e(model_Sentence_010Dao, "getModel_Sentence_010Dao(...)");
            g gVarQueryBuilder = model_Sentence_010Dao.queryBuilder();
            int i12 = 0;
            gVarQueryBuilder.f(Model_Sentence_010Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
            int i13 = 1;
            gVarQueryBuilder.f37855f = 1;
            Model_Sentence_010 model_Sentence_011 = (Model_Sentence_010) gVarQueryBuilder.d().get(0);
            String[] strArrSplit = model_Sentence_011.getOptions().split(";");
            ArrayList arrayList = new ArrayList();
            int length = strArrSplit.length;
            int i14 = 0;
            while (i14 < length) {
                String str = strArrSplit[i14];
                if (str.split("=").length < 2) {
                    i11 = i12;
                    model_Sentence_010 = null;
                } else {
                    long jLongValue = Long.valueOf(str.split("=")[i12]).longValue();
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    model_Sentence_010 = null;
                    i11 = i12;
                    int i15 = i13;
                    int i16 = 55;
                    String[] strArrSplit2 = (x.n().keyLanguage == 13 || x.n().keyLanguage == 2 || x.n().keyLanguage == 11 || x.n().keyLanguage == 0 || x.n().keyLanguage == 55 || x.n().keyLanguage == 51 || x.n().keyLanguage == 57 || x.n().keyLanguage == 61 || x.n().keyLanguage == 63 || x.n().keyLanguage == 65) ? str.split("=")[i15].split("■") : str.split("=")[i15].split(" ");
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = strArrSplit2.length;
                    int i17 = i11;
                    while (i17 < length2) {
                        String str2 = strArrSplit2[i17];
                        if (!str2.trim().isEmpty()) {
                            String[] strArrSplit3 = str2.split("/");
                            if (strArrSplit3.length >= i15) {
                                Word word = new Word();
                                word.setWord(strArrSplit3[i11]);
                                if (strArrSplit3.length >= 2) {
                                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                    if (x.n().keyLanguage != i16 && x.n().keyLanguage != 51 && x.n().keyLanguage != 57 && x.n().keyLanguage != 61 && x.n().keyLanguage != 63) {
                                        if (x.n().keyLanguage != 65) {
                                            word.setZhuyin(strArrSplit3[1]);
                                        }
                                    }
                                    word.setLuoma(strArrSplit3[1]);
                                }
                                if (strArrSplit3.length >= 3) {
                                    LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                                    if (x.n().keyLanguage != 0 && x.n().keyLanguage != 11) {
                                        word.setLuoma(strArrSplit3[2]);
                                    } else if (!x.n().isSChinese) {
                                        word.setWord(strArrSplit3[2]);
                                    }
                                }
                                String str3 = strArrSplit3[i11];
                                String str4 = word.Word;
                                m.f(str4, "str");
                                if (Pattern.matches("\\p{Punct}", str4) || str4.equals("...") || str4.equals(" ") || str4.equals("～")) {
                                    word.setWordType(1);
                                }
                                arrayList2.add(word);
                                LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                                if (x.n().keyLanguage == 2 || x.n().keyLanguage == 13) {
                                    Word word2 = new Word();
                                    word2.setWord(" ");
                                    word2.setWordType(1);
                                    arrayList2.add(word2);
                                }
                            }
                        }
                        i17++;
                        i16 = 55;
                        i15 = 1;
                    }
                    if (arrayList2.size() > 0) {
                        Sentence sentence = new Sentence();
                        sentence.setSentenceId(jLongValue);
                        sentence.setSentWords(arrayList2);
                        sentence.setSentence(BuildConfig.VERSION_NAME);
                        sentence.setWordList(BuildConfig.VERSION_NAME);
                        sentence.setDirCode(BuildConfig.VERSION_NAME);
                        sentence.setTranslations(BuildConfig.VERSION_NAME);
                        arrayList.add(sentence);
                    }
                }
                try {
                    i14++;
                    i12 = i11;
                    i13 = 1;
                } catch (Exception e8) {
                    e = e8;
                    e.printStackTrace();
                    return model_Sentence_010;
                }
            }
            model_Sentence_010 = null;
            if (arrayList.size() <= 1) {
                return null;
            }
            Collections.shuffle(arrayList);
            model_Sentence_011.setOptionList(arrayList);
            model_Sentence_011.Answer = "1";
            model_Sentence_011.setSentence(c.e(j11));
            c.e(j11).getSentence();
            return model_Sentence_011;
        } catch (Exception e10) {
            e = e10;
            model_Sentence_010 = null;
        }
    }

    public String getAnswer() {
        return this.Answer;
    }

    public long getId() {
        return this.Id;
    }

    public List<Sentence> getOptionList() {
        return this.optionList;
    }

    public String getOptions() {
        return this.Options;
    }

    public Sentence getSentence() {
        return this.sentence;
    }

    public long getSentenceId() {
        return this.SentenceId;
    }

    public String getSentenceStem() {
        return this.SentenceStem;
    }

    public String getTOptions() {
        return this.TOptions;
    }

    public void setAnswer(String str) {
        this.Answer = str;
    }

    public void setId(long j11) {
        this.Id = j11;
    }

    public void setOptionList(List<Sentence> list) {
        this.optionList = list;
    }

    public void setOptions(String str) {
        this.Options = str;
    }

    public void setSentence(Sentence sentence) {
        this.sentence = sentence;
    }

    public void setSentenceId(long j11) {
        this.SentenceId = j11;
    }

    public void setSentenceStem(String str) {
        this.SentenceStem = str;
    }

    public void setTOptions(String str) {
        this.TOptions = str;
    }

    public Model_Sentence_010() {
    }
}
