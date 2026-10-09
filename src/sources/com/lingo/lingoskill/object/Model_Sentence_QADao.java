package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_QADao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Model_Sentence_QA";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Answer;
        public static final d Id;
        public static final d OptPosition;
        public static final d Options;
        public static final d SentenceId;
        public static final d SentenceStem;

        static {
            Class cls = Long.TYPE;
            Id = new d(0, cls, "Id", true, "Id");
            SentenceId = new d(1, cls, "SentenceId", false, "SentenceId");
            SentenceStem = new d(2, cls, "SentenceStem", false, "SentenceStem");
            Options = new d(3, String.class, "Options", false, "Options");
            OptPosition = new d(4, String.class, "OptPosition", false, "OptPosition");
            Answer = new d(5, String.class, "Answer", false, "Answer");
        }
    }

    public Model_Sentence_QADao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public Model_Sentence_QADao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Model_Sentence_QA model_Sentence_QA) {
        if (model_Sentence_QA != null) {
            return Long.valueOf(model_Sentence_QA.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Model_Sentence_QA model_Sentence_QA) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Model_Sentence_QA model_Sentence_QA, long j11) {
        model_Sentence_QA.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Model_Sentence_QA model_Sentence_QA) {
        dVar.f();
        dVar.g(1, model_Sentence_QA.getId());
        dVar.g(2, model_Sentence_QA.getSentenceId());
        dVar.g(3, model_Sentence_QA.getSentenceStem());
        String options = model_Sentence_QA.getOptions();
        if (options != null) {
            dVar.l(4, options);
        }
        String optPosition = model_Sentence_QA.getOptPosition();
        if (optPosition != null) {
            dVar.l(5, optPosition);
        }
        String answer = model_Sentence_QA.getAnswer();
        if (answer != null) {
            dVar.l(6, answer);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Model_Sentence_QA readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        long j12 = cursor.getLong(i11 + 1);
        long j13 = cursor.getLong(i11 + 2);
        int i12 = i11 + 3;
        int i13 = i11 + 4;
        int i14 = i11 + 5;
        return new Model_Sentence_QA(j11, j12, j13, cursor.isNull(i12) ? null : cursor.getString(i12), cursor.isNull(i13) ? null : cursor.getString(i13), cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Model_Sentence_QA model_Sentence_QA, int i11) {
        model_Sentence_QA.setId(cursor.getLong(i11));
        model_Sentence_QA.setSentenceId(cursor.getLong(i11 + 1));
        model_Sentence_QA.setSentenceStem(cursor.getLong(i11 + 2));
        int i12 = i11 + 3;
        model_Sentence_QA.setOptions(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 4;
        model_Sentence_QA.setOptPosition(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i11 + 5;
        model_Sentence_QA.setAnswer(cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Model_Sentence_QA model_Sentence_QA) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, model_Sentence_QA.getId());
        sQLiteStatement.bindLong(2, model_Sentence_QA.getSentenceId());
        sQLiteStatement.bindLong(3, model_Sentence_QA.getSentenceStem());
        String options = model_Sentence_QA.getOptions();
        if (options != null) {
            sQLiteStatement.bindString(4, options);
        }
        String optPosition = model_Sentence_QA.getOptPosition();
        if (optPosition != null) {
            sQLiteStatement.bindString(5, optPosition);
        }
        String answer = model_Sentence_QA.getAnswer();
        if (answer != null) {
            sQLiteStatement.bindString(6, answer);
        }
    }
}
