package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_020Dao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Model_Sentence_020";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Answer;
        public static final d Id;
        public static final d SentenceId;

        static {
            Class cls = Long.TYPE;
            Id = new d(0, cls, "Id", true, "Id");
            SentenceId = new d(1, cls, "SentenceId", false, "SentenceId");
            Answer = new d(2, String.class, "Answer", false, "Answer");
        }
    }

    public Model_Sentence_020Dao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public Model_Sentence_020Dao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Model_Sentence_020 model_Sentence_020) {
        if (model_Sentence_020 != null) {
            return Long.valueOf(model_Sentence_020.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Model_Sentence_020 model_Sentence_020) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Model_Sentence_020 model_Sentence_020, long j11) {
        model_Sentence_020.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Model_Sentence_020 model_Sentence_020) {
        dVar.f();
        dVar.g(1, model_Sentence_020.getId());
        dVar.g(2, model_Sentence_020.getSentenceId());
        String answer = model_Sentence_020.getAnswer();
        if (answer != null) {
            dVar.l(3, answer);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Model_Sentence_020 readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        long j12 = cursor.getLong(i11 + 1);
        int i12 = i11 + 2;
        return new Model_Sentence_020(j11, j12, cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Model_Sentence_020 model_Sentence_020, int i11) {
        model_Sentence_020.setId(cursor.getLong(i11));
        model_Sentence_020.setSentenceId(cursor.getLong(i11 + 1));
        int i12 = i11 + 2;
        model_Sentence_020.setAnswer(cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Model_Sentence_020 model_Sentence_020) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, model_Sentence_020.getId());
        sQLiteStatement.bindLong(2, model_Sentence_020.getSentenceId());
        String answer = model_Sentence_020.getAnswer();
        if (answer != null) {
            sQLiteStatement.bindString(3, answer);
        }
    }
}
