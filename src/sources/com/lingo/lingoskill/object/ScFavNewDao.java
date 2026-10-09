package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScFavNewDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "ScFavNew";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "id", true, "id");
        public static final d IsFav;
        public static final d Score;

        static {
            Class cls = Integer.TYPE;
            Score = new d(1, cls, "score", false, "score");
            IsFav = new d(2, cls, "isFav", false, "isFav");
        }
    }

    public ScFavNewDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"ScFavNew\" (\"id\" TEXT PRIMARY KEY NOT NULL ,\"score\" INTEGER NOT NULL ,\"isFav\" INTEGER NOT NULL );", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"ScFavNew\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ScFavNewDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(ScFavNew scFavNew) {
        if (scFavNew != null) {
            return scFavNew.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ScFavNew scFavNew) {
        return scFavNew.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(ScFavNew scFavNew, long j11) {
        return scFavNew.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, ScFavNew scFavNew) {
        dVar.f();
        String id2 = scFavNew.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        dVar.g(2, scFavNew.getScore());
        dVar.g(3, scFavNew.getIsFav());
    }

    @Override // org.greenrobot.greendao.a
    public ScFavNew readEntity(Cursor cursor, int i11) {
        return new ScFavNew(cursor.isNull(i11) ? null : cursor.getString(i11), cursor.getInt(i11 + 1), cursor.getInt(i11 + 2));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ScFavNew scFavNew, int i11) {
        scFavNew.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        scFavNew.setScore(cursor.getInt(i11 + 1));
        scFavNew.setIsFav(cursor.getInt(i11 + 2));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ScFavNew scFavNew) {
        sQLiteStatement.clearBindings();
        String id2 = scFavNew.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        sQLiteStatement.bindLong(2, scFavNew.getScore());
        sQLiteStatement.bindLong(3, scFavNew.getIsFav());
    }
}
