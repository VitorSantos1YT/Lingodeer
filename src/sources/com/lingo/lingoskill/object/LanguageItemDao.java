package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanguageItemDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "userLanguage";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "id", true, "id");
        public static final d KeyLanguage;
        public static final d Locate;
        public static final d Name;
        public static final d Pic;

        static {
            Class cls = Integer.TYPE;
            KeyLanguage = new d(1, cls, "keyLanguage", false, "keyLanguage");
            Locate = new d(2, cls, "locate", false, "locate");
            Name = new d(3, String.class, "name", false, "name");
            Pic = new d(4, cls, "pic", false, "pic");
        }
    }

    public LanguageItemDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"userLanguage\" (\"id\" TEXT PRIMARY KEY NOT NULL UNIQUE ,\"keyLanguage\" INTEGER NOT NULL ,\"locate\" INTEGER NOT NULL ,\"name\" TEXT,\"pic\" INTEGER NOT NULL );", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"userLanguage\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public LanguageItemDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(LanguageItem languageItem) {
        if (languageItem != null) {
            return languageItem.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(LanguageItem languageItem) {
        return languageItem.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(LanguageItem languageItem, long j11) {
        return languageItem.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, LanguageItem languageItem) {
        dVar.f();
        String id2 = languageItem.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        dVar.g(2, languageItem.getKeyLanguage());
        dVar.g(3, languageItem.getLocate());
        String name = languageItem.getName();
        if (name != null) {
            dVar.l(4, name);
        }
        dVar.g(5, languageItem.getPic());
    }

    @Override // org.greenrobot.greendao.a
    public LanguageItem readEntity(Cursor cursor, int i11) {
        int i12 = i11 + 3;
        return new LanguageItem(cursor.isNull(i11) ? null : cursor.getString(i11), cursor.getInt(i11 + 1), cursor.getInt(i11 + 2), cursor.isNull(i12) ? null : cursor.getString(i12), cursor.getInt(i11 + 4));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, LanguageItem languageItem, int i11) {
        languageItem.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        languageItem.setKeyLanguage(cursor.getInt(i11 + 1));
        languageItem.setLocate(cursor.getInt(i11 + 2));
        int i12 = i11 + 3;
        languageItem.setName(cursor.isNull(i12) ? null : cursor.getString(i12));
        languageItem.setPic(cursor.getInt(i11 + 4));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, LanguageItem languageItem) {
        sQLiteStatement.clearBindings();
        String id2 = languageItem.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        sQLiteStatement.bindLong(2, languageItem.getKeyLanguage());
        sQLiteStatement.bindLong(3, languageItem.getLocate());
        String name = languageItem.getName();
        if (name != null) {
            sQLiteStatement.bindString(4, name);
        }
        sQLiteStatement.bindLong(5, languageItem.getPic());
    }
}
