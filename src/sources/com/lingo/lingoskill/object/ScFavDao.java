package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ScFavDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "scFav";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, Long.TYPE, "id", true, "id");
        public static final d IsFav;
        public static final d Score;

        static {
            Class cls = Integer.TYPE;
            Score = new d(1, cls, "score", false, "score");
            IsFav = new d(2, cls, "isFav", false, "isFav");
        }
    }

    public ScFavDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"scFav\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ScFavDao(j10.a aVar) {
        super(aVar, null);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v(xTCJ.veUiRjhmIAgg, z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"scFav\" (\"id\" INTEGER PRIMARY KEY NOT NULL ,\"score\" INTEGER NOT NULL ,\"isFav\" INTEGER NOT NULL );", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(ScFav scFav) {
        if (scFav != null) {
            return Long.valueOf(scFav.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ScFav scFav) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(ScFav scFav, long j11) {
        scFav.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, ScFav scFav) {
        dVar.f();
        dVar.g(1, scFav.getId());
        dVar.g(2, scFav.getScore());
        dVar.g(3, scFav.getIsFav());
    }

    @Override // org.greenrobot.greendao.a
    public ScFav readEntity(Cursor cursor, int i11) {
        return new ScFav(cursor.getLong(i11), cursor.getInt(i11 + 1), cursor.getInt(i11 + 2));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ScFav scFav) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, scFav.getId());
        sQLiteStatement.bindLong(2, scFav.getScore());
        sQLiteStatement.bindLong(3, scFav.getIsFav());
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ScFav scFav, int i11) {
        scFav.setId(cursor.getLong(i11));
        scFav.setScore(cursor.getInt(i11 + 1));
        scFav.setIsFav(cursor.getInt(i11 + 2));
    }
}
