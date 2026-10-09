package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AckFavDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "ackFav";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "id", true, "id");
        public static final d Time = new d(1, Long.TYPE, "time", false, "time");
        public static final d IsFav = new d(2, Integer.TYPE, "isFav", false, "isFav");
    }

    public AckFavDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"ackFav\" (\"id\" TEXT PRIMARY KEY NOT NULL ,\"time\" INTEGER NOT NULL ,\"isFav\" INTEGER NOT NULL );", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"ackFav\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AckFavDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(AckFav ackFav) {
        if (ackFav != null) {
            return ackFav.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(AckFav ackFav) {
        return ackFav.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(AckFav ackFav, long j11) {
        return ackFav.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, AckFav ackFav) {
        dVar.f();
        String id2 = ackFav.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        dVar.g(2, ackFav.getTime());
        dVar.g(3, ackFav.getIsFav());
    }

    @Override // org.greenrobot.greendao.a
    public AckFav readEntity(Cursor cursor, int i11) {
        return new AckFav(cursor.isNull(i11) ? null : cursor.getString(i11), cursor.getLong(i11 + 1), cursor.getInt(i11 + 2));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, AckFav ackFav, int i11) {
        ackFav.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        ackFav.setTime(cursor.getLong(i11 + 1));
        ackFav.setIsFav(cursor.getInt(i11 + 2));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, AckFav ackFav) {
        sQLiteStatement.clearBindings();
        String id2 = ackFav.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        sQLiteStatement.bindLong(2, ackFav.getTime());
        sQLiteStatement.bindLong(3, ackFav.getIsFav());
    }
}
