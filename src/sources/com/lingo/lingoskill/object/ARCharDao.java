package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ARCharDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "ARChar";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d ID = new d(0, Long.TYPE, "ID", true, "ID");
        public static final d Character = new d(1, String.class, HwCharacterDao.TABLENAME, false, HwCharacterDao.TABLENAME);
        public static final d Zhuyin = new d(2, String.class, "Zhuyin", false, "Zhuyin");
        public static final d AudioName = new d(3, String.class, "AudioName", false, "AudioName");
    }

    public ARCharDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ARCharDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(ARChar aRChar) {
        if (aRChar != null) {
            return Long.valueOf(aRChar.getID());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ARChar aRChar) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(ARChar aRChar, long j11) {
        aRChar.setID(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, ARChar aRChar) {
        dVar.f();
        dVar.g(1, aRChar.getID());
        String character = aRChar.getCharacter();
        if (character != null) {
            dVar.l(2, character);
        }
        String zhuyin = aRChar.getZhuyin();
        if (zhuyin != null) {
            dVar.l(3, zhuyin);
        }
        String audioName = aRChar.getAudioName();
        if (audioName != null) {
            dVar.l(4, audioName);
        }
    }

    @Override // org.greenrobot.greendao.a
    public ARChar readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        return new ARChar(j11, cursor.isNull(i12) ? null : cursor.getString(i12), cursor.isNull(i13) ? null : cursor.getString(i13), cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ARChar aRChar, int i11) {
        aRChar.setID(cursor.getLong(i11));
        int i12 = i11 + 1;
        aRChar.setCharacter(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 2;
        aRChar.setZhuyin(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i11 + 3;
        aRChar.setAudioName(cursor.isNull(i14) ? null : cursor.getString(i14));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ARChar aRChar) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, aRChar.getID());
        String character = aRChar.getCharacter();
        if (character != null) {
            sQLiteStatement.bindString(2, character);
        }
        String zhuyin = aRChar.getZhuyin();
        if (zhuyin != null) {
            sQLiteStatement.bindString(3, zhuyin);
        }
        String audioName = aRChar.getAudioName();
        if (audioName != null) {
            sQLiteStatement.bindString(4, audioName);
        }
    }
}
