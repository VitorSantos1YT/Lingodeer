package com.lingo.lingoskill.object;

import android.database.Cursor;
import com.lingo.lingoskill.LingoSkillApplication;
import ij.c;
import ij.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k10.g;
import k10.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_050 {
    public String Answer;
    public long Id;
    public String Options;
    public long SentenceId;
    private List<List<Long>> answerIdList;
    private List<Word> optionList;
    private Sentence sentence;

    public Model_Sentence_050(long j11, long j12, String str, String str2) {
        this.Id = j11;
        this.SentenceId = j12;
        this.Options = str;
        this.Answer = str2;
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
        Model_Sentence_050Dao model_Sentence_050Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_050Dao();
        m.e(model_Sentence_050Dao, "getModel_Sentence_050Dao(...)");
        g gVarQueryBuilder = model_Sentence_050Dao.queryBuilder();
        gVarQueryBuilder.f(Model_Sentence_050Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        Cursor cursorC = gVarQueryBuilder.b().c();
        if (cursorC.moveToNext()) {
            cursorC.close();
            return true;
        }
        cursorC.close();
        return false;
    }

    public static Model_Sentence_050 loadFullObject(long j11) {
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
            Model_Sentence_050Dao model_Sentence_050Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_050Dao();
            m.e(model_Sentence_050Dao, "getModel_Sentence_050Dao(...)");
            g gVarQueryBuilder = model_Sentence_050Dao.queryBuilder();
            gVarQueryBuilder.f(Model_Sentence_050Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
            gVarQueryBuilder.f37855f = 1;
            Model_Sentence_050 model_Sentence_050 = (Model_Sentence_050) gVarQueryBuilder.d().get(0);
            Sentence sentenceE = c.e(j11);
            if (sentenceE == null) {
                return null;
            }
            model_Sentence_050.setSentence(sentenceE);
            ArrayList arrayList = new ArrayList();
            for (Long l9 : ew.a.v(model_Sentence_050.getOptions())) {
                Word wordH = c.h(l9.longValue());
                if (wordH != null && !wordH.getWord().equals(" ") && wordH.getWordType() != 1) {
                    arrayList.add(wordH);
                }
            }
            model_Sentence_050.setOptionList(arrayList);
            String[] strArrSplit = model_Sentence_050.getAnswer().split("!@@@!");
            ArrayList arrayList2 = new ArrayList();
            for (String str : strArrSplit) {
                arrayList2.add(Arrays.asList(ew.a.v(str)));
            }
            model_Sentence_050.setAnswerList(arrayList2);
            return model_Sentence_050;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public String getAnswer() {
        return this.Answer;
    }

    public List<List<Long>> getAnswerList() {
        return this.answerIdList;
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

    public void setAnswer(String str) {
        this.Answer = str;
    }

    public void setAnswerList(List<List<Long>> list) {
        this.answerIdList = list;
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

    public Model_Sentence_050() {
    }
}
