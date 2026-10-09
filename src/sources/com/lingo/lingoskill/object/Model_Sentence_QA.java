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
public class Model_Sentence_QA {
    private String Answer;
    private long Id;
    private String OptPosition;
    private String Options;
    private long SentenceId;
    private long SentenceStem;
    private List<Word> optionList;
    private Sentence sentence;
    private Sentence sentence2;

    public Model_Sentence_QA(long j11, long j12, long j13, String str, String str2, String str3) {
        this.Id = j11;
        this.SentenceId = j12;
        this.SentenceStem = j13;
        this.Options = str;
        this.OptPosition = str2;
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
        Model_Sentence_QADao model_Sentence_QADao = ((DaoSession) dVar.f34423d).getModel_Sentence_QADao();
        m.e(model_Sentence_QADao, "getModel_Sentence_QADao(...)");
        g gVarQueryBuilder = model_Sentence_QADao.queryBuilder();
        gVarQueryBuilder.f(Model_Sentence_QADao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        Cursor cursorC = gVarQueryBuilder.b().c();
        if (cursorC.moveToNext()) {
            cursorC.close();
            return true;
        }
        cursorC.close();
        return false;
    }

    public static Model_Sentence_QA loadFullObject(long j11) {
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
            Model_Sentence_QADao model_Sentence_QADao = ((DaoSession) dVar.f34423d).getModel_Sentence_QADao();
            m.e(model_Sentence_QADao, "getModel_Sentence_QADao(...)");
            g gVarQueryBuilder = model_Sentence_QADao.queryBuilder();
            gVarQueryBuilder.f(Model_Sentence_QADao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
            gVarQueryBuilder.f37855f = 1;
            Model_Sentence_QA model_Sentence_QA = (Model_Sentence_QA) gVarQueryBuilder.d().get(0);
            ArrayList arrayList = new ArrayList();
            for (Long l9 : ew.a.v(model_Sentence_QA.getOptions())) {
                Word wordH = c.h(l9.longValue());
                if (wordH != null && wordH.getWordType() != 1) {
                    arrayList.add(wordH);
                }
            }
            model_Sentence_QA.setOptionList(arrayList);
            model_Sentence_QA.setSentence(c.e(j11));
            model_Sentence_QA.setSentence2(c.e(model_Sentence_QA.getSentenceStem()));
            return model_Sentence_QA;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public String getAnswer() {
        return this.Answer;
    }

    public long getId() {
        return this.Id;
    }

    public String getOptPosition() {
        return this.OptPosition;
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

    public Sentence getSentence2() {
        return this.sentence2;
    }

    public long getSentenceId() {
        return this.SentenceId;
    }

    public long getSentenceStem() {
        return this.SentenceStem;
    }

    public void setAnswer(String str) {
        this.Answer = str;
    }

    public void setId(long j11) {
        this.Id = j11;
    }

    public void setOptPosition(String str) {
        this.OptPosition = str;
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

    public void setSentence2(Sentence sentence) {
        this.sentence2 = sentence;
    }

    public void setSentenceId(long j11) {
        this.SentenceId = j11;
    }

    public void setSentenceStem(long j11) {
        this.SentenceStem = j11;
    }

    public Model_Sentence_QA() {
    }
}
