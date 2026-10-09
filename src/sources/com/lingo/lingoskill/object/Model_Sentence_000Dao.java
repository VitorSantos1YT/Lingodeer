package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_000Dao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Model_Sentence_000";
    private final kj.a ExplanationConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Explanation;
        public static final d Id;
        public static final d SentenceId;

        static {
            Class cls = Long.TYPE;
            Id = new d(0, cls, "Id", true, "Id");
            SentenceId = new d(1, cls, "SentenceId", false, "SentenceId");
            Explanation = new d(2, String.class, "Explanation", false, "Explanation");
        }
    }

    public Model_Sentence_000Dao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.ExplanationConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Model_Sentence_000 model_Sentence_000) {
        if (model_Sentence_000 != null) {
            return Long.valueOf(model_Sentence_000.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Model_Sentence_000 model_Sentence_000) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Model_Sentence_000 model_Sentence_000, long j11) {
        model_Sentence_000.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Model_Sentence_000 model_Sentence_000) {
        dVar.f();
        dVar.g(1, model_Sentence_000.getId());
        dVar.g(2, model_Sentence_000.getSentenceId());
        String explanation = model_Sentence_000.getExplanation();
        if (explanation != null) {
            com.google.android.material.datepicker.d.A(this.ExplanationConverter, explanation, dVar, 3);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Model_Sentence_000 readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        long j12 = cursor.getLong(i11 + 1);
        int i12 = i11 + 2;
        return new Model_Sentence_000(j11, j12, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.ExplanationConverter));
    }

    public Model_Sentence_000Dao(j10.a aVar) {
        super(aVar, null);
        this.ExplanationConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Model_Sentence_000 model_Sentence_000) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, model_Sentence_000.getId());
        sQLiteStatement.bindLong(2, model_Sentence_000.getSentenceId());
        String explanation = model_Sentence_000.getExplanation();
        if (explanation != null) {
            com.google.android.material.datepicker.d.z(this.ExplanationConverter, explanation, sQLiteStatement, 3);
        }
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Model_Sentence_000 model_Sentence_000, int i11) {
        model_Sentence_000.setId(cursor.getLong(i11));
        model_Sentence_000.setSentenceId(cursor.getLong(i11 + 1));
        int i12 = i11 + 2;
        model_Sentence_000.setExplanation(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.ExplanationConverter));
    }
}
