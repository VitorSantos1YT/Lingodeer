package com.lingo.lingoskill.object;

import android.database.Cursor;
import com.lingo.lingoskill.LingoSkillApplication;
import ij.c;
import ij.d;
import java.util.ArrayList;
import java.util.List;
import k10.g;
import k10.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_030 {
    private String Answer;
    private long Id;
    private String Options;
    private long SentenceId;
    private String Stem;
    private List<Word> answerList;
    private List<Word> optionList;
    private Sentence sentence;
    private List<Word> stemList;

    public Model_Sentence_030(long j11, long j12, String str, String str2, String str3) {
        this.Id = j11;
        this.SentenceId = j12;
        this.Stem = str;
        this.Options = str2;
        this.Answer = str3;
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
        Model_Sentence_030Dao model_Sentence_030Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_030Dao();
        m.e(model_Sentence_030Dao, "getModel_Sentence_030Dao(...)");
        g gVarQueryBuilder = model_Sentence_030Dao.queryBuilder();
        gVarQueryBuilder.f(Model_Sentence_030Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        Cursor cursorC = gVarQueryBuilder.b().c();
        if (cursorC.moveToNext()) {
            cursorC.close();
            return true;
        }
        cursorC.close();
        return false;
    }

    public static Model_Sentence_030 loadFullObject(long j11) {
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
            Model_Sentence_030Dao model_Sentence_030Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_030Dao();
            m.e(model_Sentence_030Dao, "getModel_Sentence_030Dao(...)");
            g gVarQueryBuilder = model_Sentence_030Dao.queryBuilder();
            gVarQueryBuilder.f(Model_Sentence_030Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
            gVarQueryBuilder.f37855f = 1;
            Model_Sentence_030 model_Sentence_030 = (Model_Sentence_030) gVarQueryBuilder.d().get(0);
            Long[] lArrV = ew.a.v(model_Sentence_030.getStem());
            ArrayList arrayList = new ArrayList();
            for (Long l9 : lArrV) {
                if (c.h(l9.longValue()) != null) {
                    arrayList.add(c.h(l9.longValue()));
                }
            }
            model_Sentence_030.setStemList(arrayList);
            Long[] lArrV2 = ew.a.v(model_Sentence_030.getOptions());
            ArrayList arrayList2 = new ArrayList();
            for (Long l11 : lArrV2) {
                Word wordH = c.h(l11.longValue());
                if (wordH != null) {
                    arrayList2.add(wordH);
                }
            }
            model_Sentence_030.setOptionList(arrayList2);
            Long[] lArrV3 = ew.a.v(model_Sentence_030.getAnswer());
            ArrayList arrayList3 = new ArrayList();
            for (Long l12 : lArrV3) {
                Word wordH2 = c.h(l12.longValue());
                if (wordH2 != null) {
                    arrayList3.add(wordH2);
                }
            }
            model_Sentence_030.setAnswerList(arrayList3);
            model_Sentence_030.setSentence(c.e(model_Sentence_030.getSentenceId()));
            return model_Sentence_030;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public String getAnswer() {
        return this.Answer;
    }

    public List<Word> getAnswerList() {
        return this.answerList;
    }

    public long getId() {
        return this.Id;
    }

    public List<Word> getOptionList() {
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

    public String getStem() {
        return this.Stem;
    }

    public List<Word> getStemList() {
        return this.stemList;
    }

    public void setAnswer(String str) {
        this.Answer = str;
    }

    public void setAnswerList(List<Word> list) {
        this.answerList = list;
    }

    public void setId(long j11) {
        this.Id = j11;
    }

    public void setOptionList(List<Word> list) {
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

    public void setStem(String str) {
        this.Stem = str;
    }

    public void setStemList(List<Word> list) {
        this.stemList = list;
    }

    public Model_Sentence_030() {
    }
}
