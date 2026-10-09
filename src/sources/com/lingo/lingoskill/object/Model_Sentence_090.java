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
public class Model_Sentence_090 {
    private long Id;
    private String Options;
    private long SentenceId;
    private String SentenceStem;
    private List<Word> optionList;
    private Sentence sentence;
    private List<Word> stemList;

    public Model_Sentence_090(long j11, long j12, String str, String str2) {
        this.Id = j11;
        this.SentenceId = j12;
        this.SentenceStem = str;
        this.Options = str2;
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
        g gVarQueryBuilder = dVar.r().queryBuilder();
        gVarQueryBuilder.f(Model_Sentence_100Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        Cursor cursorC = gVarQueryBuilder.b().c();
        if (cursorC.moveToNext()) {
            cursorC.close();
            return true;
        }
        cursorC.close();
        return false;
    }

    public static Model_Sentence_090 loadFullObject(long j11) {
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
            Model_Sentence_090Dao model_Sentence_090Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_090Dao();
            m.e(model_Sentence_090Dao, "getModel_Sentence_090Dao(...)");
            g gVarQueryBuilder = model_Sentence_090Dao.queryBuilder();
            gVarQueryBuilder.f(Model_Sentence_090Dao.Properties.SentenceId.b(Long.valueOf(j11)), new h[0]);
            gVarQueryBuilder.f37855f = 1;
            Model_Sentence_090 model_Sentence_090 = (Model_Sentence_090) gVarQueryBuilder.d().get(0);
            ArrayList arrayList = new ArrayList();
            for (Long l9 : ew.a.v(model_Sentence_090.getSentenceStem())) {
                Word wordH = c.h(l9.longValue());
                if (wordH != null) {
                    arrayList.add(wordH);
                }
            }
            model_Sentence_090.setStemList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Long l11 : ew.a.v(model_Sentence_090.getOptions())) {
                Word wordH2 = c.h(l11.longValue());
                if (wordH2 != null) {
                    arrayList2.add(wordH2);
                }
            }
            model_Sentence_090.setOptionList(arrayList2);
            model_Sentence_090.setSentence(c.e(j11));
            return model_Sentence_090;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
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

    public String getSentenceStem() {
        return this.SentenceStem;
    }

    public List<Word> getStemList() {
        return this.stemList;
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

    public void setSentenceStem(String str) {
        this.SentenceStem = str;
    }

    public void setStemList(List<Word> list) {
        this.stemList = list;
    }

    public Model_Sentence_090() {
    }
}
