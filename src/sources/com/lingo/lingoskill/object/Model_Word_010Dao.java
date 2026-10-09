package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Model_Word_010Dao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Model_Word_010";
    private final kj.a AnswerConverter;
    private final kj.a ImageOptionsConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Answer;
        public static final d Id;
        public static final d ImageOptions;
        public static final d WordId;

        static {
            Class cls = Long.TYPE;
            Id = new d(0, cls, "Id", true, "Id");
            WordId = new d(1, cls, "WordId", false, "WordId");
            ImageOptions = new d(2, String.class, "ImageOptions", false, "ImageOptions");
            Answer = new d(3, String.class, "Answer", false, "Answer");
        }
    }

    public Model_Word_010Dao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.ImageOptionsConverter = new kj.a();
        this.AnswerConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Model_Word_010 model_Word_010) {
        if (model_Word_010 != null) {
            return Long.valueOf(model_Word_010.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Model_Word_010 model_Word_010) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Model_Word_010 model_Word_010, long j11) {
        model_Word_010.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Model_Word_010 model_Word_010) {
        dVar.f();
        dVar.g(1, model_Word_010.getId());
        dVar.g(2, model_Word_010.getWordId());
        String imageOptions = model_Word_010.getImageOptions();
        if (imageOptions != null) {
            com.google.android.material.datepicker.d.A(this.ImageOptionsConverter, imageOptions, dVar, 3);
        }
        String answer = model_Word_010.getAnswer();
        if (answer != null) {
            com.google.android.material.datepicker.d.A(this.AnswerConverter, answer, dVar, 4);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Model_Word_010 readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        long j12 = cursor.getLong(i11 + 1);
        int i12 = i11 + 2;
        int i13 = i11 + 3;
        return new Model_Word_010(j11, j12, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.ImageOptionsConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.AnswerConverter));
    }

    public Model_Word_010Dao(j10.a aVar) {
        super(aVar, null);
        this.ImageOptionsConverter = new kj.a();
        this.AnswerConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Model_Word_010 model_Word_010, int i11) {
        model_Word_010.setId(cursor.getLong(i11));
        model_Word_010.setWordId(cursor.getLong(i11 + 1));
        int i12 = i11 + 2;
        model_Word_010.setImageOptions(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.ImageOptionsConverter));
        int i13 = i11 + 3;
        model_Word_010.setAnswer(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.AnswerConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Model_Word_010 model_Word_010) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, model_Word_010.getId());
        sQLiteStatement.bindLong(2, model_Word_010.getWordId());
        String imageOptions = model_Word_010.getImageOptions();
        if (imageOptions != null) {
            com.google.android.material.datepicker.d.z(this.ImageOptionsConverter, imageOptions, sQLiteStatement, 3);
        }
        String answer = model_Word_010.getAnswer();
        if (answer != null) {
            com.google.android.material.datepicker.d.z(this.AnswerConverter, answer, sQLiteStatement, 4);
        }
    }
}
