package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_050Dao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Model_Sentence_050";
    private final kj.a AnswerConverter;
    private final kj.a OptionsConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Answer;
        public static final d Id;
        public static final d Options;
        public static final d SentenceId;

        static {
            Class cls = Long.TYPE;
            Id = new d(0, cls, "Id", true, "Id");
            SentenceId = new d(1, cls, "SentenceId", false, "SentenceId");
            Options = new d(2, String.class, "Options", false, "Options");
            Answer = new d(3, String.class, "Answer", false, "Answer");
        }
    }

    public Model_Sentence_050Dao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.OptionsConverter = new kj.a();
        this.AnswerConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Model_Sentence_050 model_Sentence_050) {
        if (model_Sentence_050 != null) {
            return Long.valueOf(model_Sentence_050.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Model_Sentence_050 model_Sentence_050) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Model_Sentence_050 model_Sentence_050, long j11) {
        model_Sentence_050.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Model_Sentence_050 model_Sentence_050) {
        dVar.f();
        dVar.g(1, model_Sentence_050.getId());
        dVar.g(2, model_Sentence_050.getSentenceId());
        String options = model_Sentence_050.getOptions();
        if (options != null) {
            com.google.android.material.datepicker.d.A(this.OptionsConverter, options, dVar, 3);
        }
        String answer = model_Sentence_050.getAnswer();
        if (answer != null) {
            com.google.android.material.datepicker.d.A(this.AnswerConverter, answer, dVar, 4);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Model_Sentence_050 readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        long j12 = cursor.getLong(i11 + 1);
        int i12 = i11 + 2;
        int i13 = i11 + 3;
        return new Model_Sentence_050(j11, j12, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.OptionsConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.AnswerConverter));
    }

    public Model_Sentence_050Dao(j10.a aVar) {
        super(aVar, null);
        this.OptionsConverter = new kj.a();
        this.AnswerConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Model_Sentence_050 model_Sentence_050, int i11) {
        model_Sentence_050.setId(cursor.getLong(i11));
        model_Sentence_050.setSentenceId(cursor.getLong(i11 + 1));
        int i12 = i11 + 2;
        model_Sentence_050.setOptions(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.OptionsConverter));
        int i13 = i11 + 3;
        model_Sentence_050.setAnswer(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.AnswerConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Model_Sentence_050 model_Sentence_050) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, model_Sentence_050.getId());
        sQLiteStatement.bindLong(2, model_Sentence_050.getSentenceId());
        String options = model_Sentence_050.getOptions();
        if (options != null) {
            com.google.android.material.datepicker.d.z(this.OptionsConverter, options, sQLiteStatement, 3);
        }
        String answer = model_Sentence_050.getAnswer();
        if (answer != null) {
            com.google.android.material.datepicker.d.z(this.AnswerConverter, answer, sQLiteStatement, 4);
        }
    }
}
