package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdLessonDlVersionDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "PdLessonDlVersion";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "id", true, "ID");
        public static final d Version = new d(1, Long.class, "version", false, "VERSION");
    }

    public PdLessonDlVersionDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"PdLessonDlVersion\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"VERSION\" INTEGER);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"PdLessonDlVersion\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public PdLessonDlVersionDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(PdLessonDlVersion pdLessonDlVersion) {
        if (pdLessonDlVersion != null) {
            return pdLessonDlVersion.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PdLessonDlVersion pdLessonDlVersion) {
        return pdLessonDlVersion.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(PdLessonDlVersion pdLessonDlVersion, long j11) {
        return pdLessonDlVersion.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, PdLessonDlVersion pdLessonDlVersion) {
        dVar.f();
        String id2 = pdLessonDlVersion.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        Long version = pdLessonDlVersion.getVersion();
        if (version != null) {
            dVar.g(2, version.longValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public PdLessonDlVersion readEntity(Cursor cursor, int i11) {
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i11 + 1;
        return new PdLessonDlVersion(string, cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PdLessonDlVersion pdLessonDlVersion, int i11) {
        pdLessonDlVersion.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        pdLessonDlVersion.setVersion(cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PdLessonDlVersion pdLessonDlVersion) {
        sQLiteStatement.clearBindings();
        String id2 = pdLessonDlVersion.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        Long version = pdLessonDlVersion.getVersion();
        if (version != null) {
            sQLiteStatement.bindLong(2, version.longValue());
        }
    }
}
