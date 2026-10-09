package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdLessonLearnIndexDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "PdLessonLearnIndex";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "id", true, "ID");
        public static final d Index = new d(1, Integer.TYPE, "index", false, "INDEX");
    }

    public PdLessonLearnIndexDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"PdLessonLearnIndex\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"INDEX\" INTEGER NOT NULL );", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"PdLessonLearnIndex\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public PdLessonLearnIndexDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(PdLessonLearnIndex pdLessonLearnIndex) {
        if (pdLessonLearnIndex != null) {
            return pdLessonLearnIndex.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PdLessonLearnIndex pdLessonLearnIndex) {
        return pdLessonLearnIndex.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(PdLessonLearnIndex pdLessonLearnIndex, long j11) {
        return pdLessonLearnIndex.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, PdLessonLearnIndex pdLessonLearnIndex) {
        dVar.f();
        String id2 = pdLessonLearnIndex.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        dVar.g(2, pdLessonLearnIndex.getIndex());
    }

    @Override // org.greenrobot.greendao.a
    public PdLessonLearnIndex readEntity(Cursor cursor, int i11) {
        return new PdLessonLearnIndex(cursor.isNull(i11) ? null : cursor.getString(i11), cursor.getInt(i11 + 1));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PdLessonLearnIndex pdLessonLearnIndex, int i11) {
        pdLessonLearnIndex.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        pdLessonLearnIndex.setIndex(cursor.getInt(i11 + 1));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PdLessonLearnIndex pdLessonLearnIndex) {
        sQLiteStatement.clearBindings();
        String id2 = pdLessonLearnIndex.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        sQLiteStatement.bindLong(2, pdLessonLearnIndex.getIndex());
    }
}
