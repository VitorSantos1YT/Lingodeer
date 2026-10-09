package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Sentence_010Dao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Model_Sentence_010";
    private final kj.a AnswerConverter;
    private final kj.a OptionsConverter;
    private final kj.a SentenceStemConverter;
    private final kj.a TOptionsConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Answer;
        public static final d Id;
        public static final d Options;
        public static final d SentenceId;
        public static final d SentenceStem;
        public static final d TOptions;

        static {
            String str = EHjhWcesDUIsIw.RceI;
            Class cls = Long.TYPE;
            Id = new d(0, cls, "Id", true, str);
            SentenceId = new d(1, cls, "SentenceId", false, "SentenceId");
            SentenceStem = new d(2, String.class, "SentenceStem", false, "SentenceStem");
            Options = new d(3, String.class, "Options", false, "Options");
            TOptions = new d(4, String.class, "TOptions", false, "TOptions");
            Answer = new d(5, String.class, "Answer", false, "Answer");
        }
    }

    public Model_Sentence_010Dao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.SentenceStemConverter = new kj.a();
        this.OptionsConverter = new kj.a();
        this.TOptionsConverter = new kj.a();
        this.AnswerConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Model_Sentence_010 model_Sentence_010) {
        if (model_Sentence_010 != null) {
            return Long.valueOf(model_Sentence_010.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Model_Sentence_010 model_Sentence_010) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Model_Sentence_010 model_Sentence_010, long j11) {
        model_Sentence_010.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Model_Sentence_010 model_Sentence_010) {
        dVar.f();
        dVar.g(1, model_Sentence_010.getId());
        dVar.g(2, model_Sentence_010.getSentenceId());
        String sentenceStem = model_Sentence_010.getSentenceStem();
        if (sentenceStem != null) {
            com.google.android.material.datepicker.d.A(this.SentenceStemConverter, sentenceStem, dVar, 3);
        }
        String options = model_Sentence_010.getOptions();
        if (options != null) {
            com.google.android.material.datepicker.d.A(this.OptionsConverter, options, dVar, 4);
        }
        String tOptions = model_Sentence_010.getTOptions();
        if (tOptions != null) {
            com.google.android.material.datepicker.d.A(this.TOptionsConverter, tOptions, dVar, 5);
        }
        String answer = model_Sentence_010.getAnswer();
        if (answer != null) {
            com.google.android.material.datepicker.d.A(this.AnswerConverter, answer, dVar, 6);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Model_Sentence_010 readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        long j12 = cursor.getLong(i11 + 1);
        int i12 = i11 + 2;
        int i13 = i11 + 3;
        int i14 = i11 + 4;
        int i15 = i11 + 5;
        return new Model_Sentence_010(j11, j12, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.SentenceStemConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.OptionsConverter), cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.TOptionsConverter), cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.AnswerConverter));
    }

    public Model_Sentence_010Dao(j10.a aVar) {
        super(aVar, null);
        this.SentenceStemConverter = new kj.a();
        this.OptionsConverter = new kj.a();
        this.TOptionsConverter = new kj.a();
        this.AnswerConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Model_Sentence_010 model_Sentence_010, int i11) {
        model_Sentence_010.setId(cursor.getLong(i11));
        model_Sentence_010.setSentenceId(cursor.getLong(i11 + 1));
        int i12 = i11 + 2;
        model_Sentence_010.setSentenceStem(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.SentenceStemConverter));
        int i13 = i11 + 3;
        model_Sentence_010.setOptions(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.OptionsConverter));
        int i14 = i11 + 4;
        model_Sentence_010.setTOptions(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.TOptionsConverter));
        int i15 = i11 + 5;
        model_Sentence_010.setAnswer(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.AnswerConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Model_Sentence_010 model_Sentence_010) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, model_Sentence_010.getId());
        sQLiteStatement.bindLong(2, model_Sentence_010.getSentenceId());
        String sentenceStem = model_Sentence_010.getSentenceStem();
        if (sentenceStem != null) {
            com.google.android.material.datepicker.d.z(this.SentenceStemConverter, sentenceStem, sQLiteStatement, 3);
        }
        String options = model_Sentence_010.getOptions();
        if (options != null) {
            com.google.android.material.datepicker.d.z(this.OptionsConverter, options, sQLiteStatement, 4);
        }
        String tOptions = model_Sentence_010.getTOptions();
        if (tOptions != null) {
            com.google.android.material.datepicker.d.z(this.TOptionsConverter, tOptions, sQLiteStatement, 5);
        }
        String answer = model_Sentence_010.getAnswer();
        if (answer != null) {
            com.google.android.material.datepicker.d.z(this.AnswerConverter, answer, sQLiteStatement, 6);
        }
    }
}
