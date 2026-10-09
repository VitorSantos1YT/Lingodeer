package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdSentenceDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "PdSentence";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "Id", true, "ID");
        public static final d Lan = new d(1, String.class, "Lan", false, "LAN");
        public static final d SentenceId = new d(2, Long.class, "SentenceId", false, "SENTENCE_ID");
        public static final d LessonId = new d(3, Long.class, "LessonId", false, "LESSON_ID");
        public static final d Sentence = new d(4, String.class, SentenceDao.TABLENAME, false, "SENTENCE");
        public static final d WordList = new d(5, String.class, "WordList", false, "WORD_LIST");
        public static final d TranENG = new d(6, String.class, "TranENG", false, "TRAN_ENG");
        public static final d TranJPN = new d(7, String.class, "TranJPN", false, "TRAN_JPN");
        public static final d TranKRN = new d(8, String.class, "TranKRN", false, "TRAN_KRN");
        public static final d TranFRN = new d(9, String.class, "TranFRN", false, "TRAN_FRN");
        public static final d TranDEN = new d(10, String.class, "TranDEN", false, "TRAN_DEN");
        public static final d TranVTN = new d(11, String.class, "TranVTN", false, "TRAN_VTN");
        public static final d TranTCHN = new d(12, String.class, "TranTCHN", false, "TRAN_TCHN");
        public static final d TranCHN = new d(13, String.class, "TranCHN", false, "TRAN_CHN");
        public static final d Options = new d(14, String.class, "Options", false, "OPTIONS");
        public static final d Answer = new d(15, String.class, "Answer", false, "ANSWER");
        public static final d MF = new d(16, String.class, "MF", false, "MF");
        public static final d Flag = new d(17, String.class, "Flag", false, "FLAG");
        public static final d UpdateDate = new d(18, String.class, "UpdateDate", false, "UPDATE_DATE");
    }

    public PdSentenceDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"PdSentence\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"LAN\" TEXT,\"SENTENCE_ID\" INTEGER,\"LESSON_ID\" INTEGER,\"SENTENCE\" TEXT,\"WORD_LIST\" TEXT,\"TRAN_ENG\" TEXT,\"TRAN_JPN\" TEXT,\"TRAN_KRN\" TEXT,\"TRAN_FRN\" TEXT,\"TRAN_DEN\" TEXT,\"TRAN_VTN\" TEXT,\"TRAN_TCHN\" TEXT,\"TRAN_CHN\" TEXT,\"OPTIONS\" TEXT,\"ANSWER\" TEXT,\"MF\" TEXT,\"FLAG\" TEXT,\"UPDATE_DATE\" TEXT);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"PdSentence\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public PdSentenceDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(PdSentence pdSentence) {
        if (pdSentence != null) {
            return pdSentence.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PdSentence pdSentence) {
        return pdSentence.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(PdSentence pdSentence, long j11) {
        return pdSentence.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, PdSentence pdSentence) {
        dVar.f();
        String id2 = pdSentence.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        String lan = pdSentence.getLan();
        if (lan != null) {
            dVar.l(2, lan);
        }
        Long sentenceId = pdSentence.getSentenceId();
        if (sentenceId != null) {
            dVar.g(3, sentenceId.longValue());
        }
        Long lessonId = pdSentence.getLessonId();
        if (lessonId != null) {
            dVar.g(4, lessonId.longValue());
        }
        String sentence = pdSentence.getSentence();
        if (sentence != null) {
            dVar.l(5, sentence);
        }
        String wordList = pdSentence.getWordList();
        if (wordList != null) {
            dVar.l(6, wordList);
        }
        String tranENG = pdSentence.getTranENG();
        if (tranENG != null) {
            dVar.l(7, tranENG);
        }
        String tranJPN = pdSentence.getTranJPN();
        if (tranJPN != null) {
            dVar.l(8, tranJPN);
        }
        String tranKRN = pdSentence.getTranKRN();
        if (tranKRN != null) {
            dVar.l(9, tranKRN);
        }
        String tranFRN = pdSentence.getTranFRN();
        if (tranFRN != null) {
            dVar.l(10, tranFRN);
        }
        String tranDEN = pdSentence.getTranDEN();
        if (tranDEN != null) {
            dVar.l(11, tranDEN);
        }
        String tranVTN = pdSentence.getTranVTN();
        if (tranVTN != null) {
            dVar.l(12, tranVTN);
        }
        String tranTCHN = pdSentence.getTranTCHN();
        if (tranTCHN != null) {
            dVar.l(13, tranTCHN);
        }
        String tranCHN = pdSentence.getTranCHN();
        if (tranCHN != null) {
            dVar.l(14, tranCHN);
        }
        String options = pdSentence.getOptions();
        if (options != null) {
            dVar.l(15, options);
        }
        String answer = pdSentence.getAnswer();
        if (answer != null) {
            dVar.l(16, answer);
        }
        String mf2 = pdSentence.getMF();
        if (mf2 != null) {
            dVar.l(17, mf2);
        }
        String flag = pdSentence.getFlag();
        if (flag != null) {
            dVar.l(18, flag);
        }
        String updateDate = pdSentence.getUpdateDate();
        if (updateDate != null) {
            dVar.l(19, updateDate);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x0153: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // org.greenrobot.greendao.a
    public com.lingo.lingoskill.object.PdSentence readEntity(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x0153: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PdSentence pdSentence, int i11) {
        pdSentence.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        pdSentence.setLan(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 2;
        pdSentence.setSentenceId(cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)));
        int i14 = i11 + 3;
        pdSentence.setLessonId(cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
        int i15 = i11 + 4;
        pdSentence.setSentence(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i11 + 5;
        pdSentence.setWordList(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i11 + 6;
        pdSentence.setTranENG(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i11 + 7;
        pdSentence.setTranJPN(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i11 + 8;
        pdSentence.setTranKRN(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i21 = i11 + 9;
        pdSentence.setTranFRN(cursor.isNull(i21) ? null : cursor.getString(i21));
        int i22 = i11 + 10;
        pdSentence.setTranDEN(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i11 + 11;
        pdSentence.setTranVTN(cursor.isNull(i23) ? null : cursor.getString(i23));
        int i24 = i11 + 12;
        pdSentence.setTranTCHN(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i11 + 13;
        pdSentence.setTranCHN(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i11 + 14;
        pdSentence.setOptions(cursor.isNull(i26) ? null : cursor.getString(i26));
        int i27 = i11 + 15;
        pdSentence.setAnswer(cursor.isNull(i27) ? null : cursor.getString(i27));
        int i28 = i11 + 16;
        pdSentence.setMF(cursor.isNull(i28) ? null : cursor.getString(i28));
        int i29 = i11 + 17;
        pdSentence.setFlag(cursor.isNull(i29) ? null : cursor.getString(i29));
        int i30 = i11 + 18;
        pdSentence.setUpdateDate(cursor.isNull(i30) ? null : cursor.getString(i30));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PdSentence pdSentence) {
        sQLiteStatement.clearBindings();
        String id2 = pdSentence.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        String lan = pdSentence.getLan();
        if (lan != null) {
            sQLiteStatement.bindString(2, lan);
        }
        Long sentenceId = pdSentence.getSentenceId();
        if (sentenceId != null) {
            sQLiteStatement.bindLong(3, sentenceId.longValue());
        }
        Long lessonId = pdSentence.getLessonId();
        if (lessonId != null) {
            sQLiteStatement.bindLong(4, lessonId.longValue());
        }
        String sentence = pdSentence.getSentence();
        if (sentence != null) {
            sQLiteStatement.bindString(5, sentence);
        }
        String wordList = pdSentence.getWordList();
        if (wordList != null) {
            sQLiteStatement.bindString(6, wordList);
        }
        String tranENG = pdSentence.getTranENG();
        if (tranENG != null) {
            sQLiteStatement.bindString(7, tranENG);
        }
        String tranJPN = pdSentence.getTranJPN();
        if (tranJPN != null) {
            sQLiteStatement.bindString(8, tranJPN);
        }
        String tranKRN = pdSentence.getTranKRN();
        if (tranKRN != null) {
            sQLiteStatement.bindString(9, tranKRN);
        }
        String tranFRN = pdSentence.getTranFRN();
        if (tranFRN != null) {
            sQLiteStatement.bindString(10, tranFRN);
        }
        String tranDEN = pdSentence.getTranDEN();
        if (tranDEN != null) {
            sQLiteStatement.bindString(11, tranDEN);
        }
        String tranVTN = pdSentence.getTranVTN();
        if (tranVTN != null) {
            sQLiteStatement.bindString(12, tranVTN);
        }
        String tranTCHN = pdSentence.getTranTCHN();
        if (tranTCHN != null) {
            sQLiteStatement.bindString(13, tranTCHN);
        }
        String tranCHN = pdSentence.getTranCHN();
        if (tranCHN != null) {
            sQLiteStatement.bindString(14, tranCHN);
        }
        String options = pdSentence.getOptions();
        if (options != null) {
            sQLiteStatement.bindString(15, options);
        }
        String answer = pdSentence.getAnswer();
        if (answer != null) {
            sQLiteStatement.bindString(16, answer);
        }
        String mf2 = pdSentence.getMF();
        if (mf2 != null) {
            sQLiteStatement.bindString(17, mf2);
        }
        String flag = pdSentence.getFlag();
        if (flag != null) {
            sQLiteStatement.bindString(18, flag);
        }
        String updateDate = pdSentence.getUpdateDate();
        if (updateDate != null) {
            sQLiteStatement.bindString(19, updateDate);
        }
    }
}
