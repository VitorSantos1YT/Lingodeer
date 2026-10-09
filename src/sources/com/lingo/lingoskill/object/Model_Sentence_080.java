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
public class Model_Sentence_080 {
    private long Answer;
    private long Id;
    private String Options;
    private long SentenceId;
    private Sentence answerSentence;
    private List<Sentence> optionList;
    private Sentence sentence;

    public Model_Sentence_080(long j11, long j12, String str, long j13) {
        this.Id = j11;
        this.SentenceId = j12;
        this.Options = str;
        this.Answer = j13;
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
        Model_Sentence_080Dao model_Sentence_080Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_080Dao();
        m.e(model_Sentence_080Dao, "getModel_Sentence_080Dao(...)");
        g gVarQueryBuilder = model_Sentence_080Dao.queryBuilder();
        gVarQueryBuilder.f(Model_Sentence_080Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        Cursor cursorC = gVarQueryBuilder.b().c();
        if (cursorC.moveToNext()) {
            cursorC.close();
            return true;
        }
        cursorC.close();
        return false;
    }

    public static Model_Sentence_080 loadFullObject(long j11) {
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
            Model_Sentence_080Dao model_Sentence_080Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_080Dao();
            m.e(model_Sentence_080Dao, "getModel_Sentence_080Dao(...)");
            g gVarQueryBuilder = model_Sentence_080Dao.queryBuilder();
            gVarQueryBuilder.f(Model_Sentence_080Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
            gVarQueryBuilder.f37855f = 1;
            Model_Sentence_080 model_Sentence_080 = (Model_Sentence_080) gVarQueryBuilder.d().get(0);
            ArrayList arrayList = new ArrayList();
            for (Long l9 : ew.a.v(model_Sentence_080.getOptions())) {
                int size = arrayList.size();
                boolean z11 = false;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if (((Sentence) obj).getSentenceId() == l9.longValue()) {
                        z11 = true;
                    }
                }
                if (!z11) {
                    arrayList.add(c.e(l9.longValue()));
                }
            }
            model_Sentence_080.setOptionList(arrayList);
            model_Sentence_080.setSentence(c.e(j11));
            model_Sentence_080.setAnswerSentence(c.e(model_Sentence_080.getAnswer()));
            return model_Sentence_080;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public long getAnswer() {
        return this.Answer;
    }

    public Sentence getAnswerSentence() {
        return this.answerSentence;
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

    public void setAnswer(long j11) {
        this.Answer = j11;
    }

    public void setAnswerSentence(Sentence sentence) {
        this.answerSentence = sentence;
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

    public Model_Sentence_080() {
    }
}
