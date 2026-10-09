package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AckDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Ack";
    private final kj.a ExamplesConverter;
    private final kj.a ExplanationConverter;
    private final kj.a GrammarACKConverter;
    private final kj.a TransaltionConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Examples;
        public static final d Explanation;
        public static final d GrammarACK;
        public static final d Id;
        public static final d Transaltion;
        public static final d UnitId;

        static {
            Class cls = Long.TYPE;
            Id = new d(0, cls, "Id", true, "Id");
            GrammarACK = new d(1, String.class, "GrammarACK", false, "GrammarACK");
            Transaltion = new d(2, String.class, "Transaltion", false, "Transaltion");
            Explanation = new d(3, String.class, "Explanation", false, "Explanation");
            UnitId = new d(4, cls, "UnitId", false, "UnitId");
            Examples = new d(5, String.class, "Examples", false, "Examples");
        }
    }

    public AckDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.GrammarACKConverter = new kj.a();
        this.TransaltionConverter = new kj.a();
        this.ExplanationConverter = new kj.a();
        this.ExamplesConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Ack ack) {
        if (ack != null) {
            return Long.valueOf(ack.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Ack ack) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Ack ack, long j11) {
        ack.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Ack ack) {
        dVar.f();
        dVar.g(1, ack.getId());
        String grammarACK = ack.getGrammarACK();
        if (grammarACK != null) {
            com.google.android.material.datepicker.d.A(this.GrammarACKConverter, grammarACK, dVar, 2);
        }
        String transaltion = ack.getTransaltion();
        if (transaltion != null) {
            com.google.android.material.datepicker.d.A(this.TransaltionConverter, transaltion, dVar, 3);
        }
        String explanation = ack.getExplanation();
        if (explanation != null) {
            com.google.android.material.datepicker.d.A(this.ExplanationConverter, explanation, dVar, 4);
        }
        dVar.g(5, ack.getUnitId());
        String examples = ack.getExamples();
        if (examples != null) {
            com.google.android.material.datepicker.d.A(this.ExamplesConverter, examples, dVar, 6);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Ack readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        String strJ = cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.GrammarACKConverter);
        int i13 = i11 + 2;
        String strJ2 = cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TransaltionConverter);
        int i14 = i11 + 3;
        String strJ3 = cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.ExplanationConverter);
        long j12 = cursor.getLong(i11 + 4);
        int i15 = i11 + 5;
        return new Ack(j11, strJ, strJ2, strJ3, j12, cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.ExamplesConverter));
    }

    public AckDao(j10.a aVar) {
        super(aVar, null);
        this.GrammarACKConverter = new kj.a();
        this.TransaltionConverter = new kj.a();
        this.ExplanationConverter = new kj.a();
        this.ExamplesConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Ack ack, int i11) {
        ack.setId(cursor.getLong(i11));
        int i12 = i11 + 1;
        ack.setGrammarACK(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.GrammarACKConverter));
        int i13 = i11 + 2;
        ack.setTransaltion(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TransaltionConverter));
        int i14 = i11 + 3;
        ack.setExplanation(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.ExplanationConverter));
        ack.setUnitId(cursor.getLong(i11 + 4));
        int i15 = i11 + 5;
        ack.setExamples(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.ExamplesConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Ack ack) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, ack.getId());
        String grammarACK = ack.getGrammarACK();
        if (grammarACK != null) {
            com.google.android.material.datepicker.d.z(this.GrammarACKConverter, grammarACK, sQLiteStatement, 2);
        }
        String transaltion = ack.getTransaltion();
        if (transaltion != null) {
            com.google.android.material.datepicker.d.z(this.TransaltionConverter, transaltion, sQLiteStatement, 3);
        }
        String explanation = ack.getExplanation();
        if (explanation != null) {
            com.google.android.material.datepicker.d.z(this.ExplanationConverter, explanation, sQLiteStatement, 4);
        }
        sQLiteStatement.bindLong(5, ack.getUnitId());
        String examples = ack.getExamples();
        if (examples != null) {
            com.google.android.material.datepicker.d.z(this.ExamplesConverter, examples, sQLiteStatement, 6);
        }
    }
}
