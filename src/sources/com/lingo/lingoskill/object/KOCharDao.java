package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class KOCharDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "koChar";
    private final kj.a CharPathConverter;
    private final kj.a CharacterConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d CharId = new d(0, Long.TYPE, "CharId", true, "CharId");
        public static final d Character = new d(1, String.class, HwCharacterDao.TABLENAME, false, HwCharacterDao.TABLENAME);
        public static final d CharPath = new d(2, String.class, "CharPath", false, "CharPath");
    }

    public KOCharDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.CharacterConverter = new kj.a();
        this.CharPathConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(KOChar kOChar) {
        if (kOChar != null) {
            return Long.valueOf(kOChar.getCharId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(KOChar kOChar) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(KOChar kOChar, long j11) {
        kOChar.setCharId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, KOChar kOChar) {
        dVar.f();
        dVar.g(1, kOChar.getCharId());
        String character = kOChar.getCharacter();
        if (character != null) {
            com.google.android.material.datepicker.d.A(this.CharacterConverter, character, dVar, 2);
        }
        String charPath = kOChar.getCharPath();
        if (charPath != null) {
            com.google.android.material.datepicker.d.A(this.CharPathConverter, charPath, dVar, 3);
        }
    }

    @Override // org.greenrobot.greendao.a
    public KOChar readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        return new KOChar(j11, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.CharacterConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.CharPathConverter));
    }

    public KOCharDao(j10.a aVar) {
        super(aVar, null);
        this.CharacterConverter = new kj.a();
        this.CharPathConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, KOChar kOChar, int i11) {
        kOChar.setCharId(cursor.getLong(i11));
        int i12 = i11 + 1;
        kOChar.setCharacter(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.CharacterConverter));
        int i13 = i11 + 2;
        kOChar.setCharPath(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.CharPathConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, KOChar kOChar) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, kOChar.getCharId());
        String character = kOChar.getCharacter();
        if (character != null) {
            com.google.android.material.datepicker.d.z(this.CharacterConverter, character, sQLiteStatement, 2);
        }
        String charPath = kOChar.getCharPath();
        if (charPath != null) {
            com.google.android.material.datepicker.d.z(this.CharPathConverter, charPath, sQLiteStatement, 3);
        }
    }
}
