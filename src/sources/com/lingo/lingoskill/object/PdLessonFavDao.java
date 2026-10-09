package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdLessonFavDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "PdLessonFav";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "id", true, "ID");
        public static final d Time = new d(1, Long.class, "time", false, "TIME");
        public static final d Fav = new d(2, Integer.TYPE, "fav", false, "FAV");
    }

    public PdLessonFavDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"PdLessonFav\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"TIME\" INTEGER,\"FAV\" INTEGER NOT NULL );", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"PdLessonFav\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public PdLessonFavDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(PdLessonFav pdLessonFav) {
        if (pdLessonFav != null) {
            return pdLessonFav.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PdLessonFav pdLessonFav) {
        return pdLessonFav.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(PdLessonFav pdLessonFav, long j11) {
        return pdLessonFav.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, PdLessonFav pdLessonFav) {
        dVar.f();
        String id2 = pdLessonFav.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        Long time = pdLessonFav.getTime();
        if (time != null) {
            dVar.g(2, time.longValue());
        }
        dVar.g(3, pdLessonFav.getFav());
    }

    @Override // org.greenrobot.greendao.a
    public PdLessonFav readEntity(Cursor cursor, int i11) {
        int i12 = i11 + 1;
        return new PdLessonFav(cursor.isNull(i11) ? null : cursor.getString(i11), cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)), cursor.getInt(i11 + 2));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PdLessonFav pdLessonFav, int i11) {
        pdLessonFav.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        pdLessonFav.setTime(cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
        pdLessonFav.setFav(cursor.getInt(i11 + 2));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PdLessonFav pdLessonFav) {
        sQLiteStatement.clearBindings();
        String id2 = pdLessonFav.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        Long time = pdLessonFav.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(2, time.longValue());
        }
        sQLiteStatement.bindLong(3, pdLessonFav.getFav());
    }
}
