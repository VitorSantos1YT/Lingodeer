package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class JPCharDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "JPChar";
    private final kj.a CharPathConverter;
    private final kj.a CharacterConverter;
    private final kj.a LuoMaConverter;
    private final kj.a PianConverter;
    private final kj.a PingConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, Long.TYPE, "id", true, "Id");
        public static final d Ping = new d(1, String.class, "Ping", false, "Ping");
        public static final d Pian = new d(2, String.class, "Pian", false, "Pian");
        public static final d LuoMa = new d(3, String.class, "LuoMa", false, "LuoMa");
        public static final d CharPath = new d(4, String.class, "CharPath", false, "CharPath");
        public static final d Character = new d(5, String.class, HwCharacterDao.TABLENAME, false, HwCharacterDao.TABLENAME);
    }

    public JPCharDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PingConverter = new kj.a();
        this.PianConverter = new kj.a();
        this.LuoMaConverter = new kj.a();
        this.CharPathConverter = new kj.a();
        this.CharacterConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(JPChar jPChar) {
        if (jPChar != null) {
            return Long.valueOf(jPChar.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(JPChar jPChar) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(JPChar jPChar, long j11) {
        jPChar.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, JPChar jPChar) {
        dVar.f();
        dVar.g(1, jPChar.getId());
        String ping = jPChar.getPing();
        if (ping != null) {
            com.google.android.material.datepicker.d.A(this.PingConverter, ping, dVar, 2);
        }
        String pian = jPChar.getPian();
        if (pian != null) {
            com.google.android.material.datepicker.d.A(this.PianConverter, pian, dVar, 3);
        }
        String luoMa = jPChar.getLuoMa();
        if (luoMa != null) {
            com.google.android.material.datepicker.d.A(this.LuoMaConverter, luoMa, dVar, 4);
        }
        String charPath = jPChar.getCharPath();
        if (charPath != null) {
            com.google.android.material.datepicker.d.A(this.CharPathConverter, charPath, dVar, 5);
        }
        String character = jPChar.getCharacter();
        if (character != null) {
            com.google.android.material.datepicker.d.A(this.CharacterConverter, character, dVar, 6);
        }
    }

    @Override // org.greenrobot.greendao.a
    public JPChar readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        int i16 = i11 + 5;
        return new JPChar(j11, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PingConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PianConverter), cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.LuoMaConverter), cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.CharPathConverter), cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.CharacterConverter));
    }

    public JPCharDao(j10.a aVar) {
        super(aVar, null);
        this.PingConverter = new kj.a();
        this.PianConverter = new kj.a();
        this.LuoMaConverter = new kj.a();
        this.CharPathConverter = new kj.a();
        this.CharacterConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, JPChar jPChar, int i11) {
        jPChar.setId(cursor.getLong(i11));
        int i12 = i11 + 1;
        jPChar.setPing(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PingConverter));
        int i13 = i11 + 2;
        jPChar.setPian(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PianConverter));
        int i14 = i11 + 3;
        jPChar.setLuoMa(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.LuoMaConverter));
        int i15 = i11 + 4;
        jPChar.setCharPath(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.CharPathConverter));
        int i16 = i11 + 5;
        jPChar.setCharacter(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.CharacterConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, JPChar jPChar) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, jPChar.getId());
        String ping = jPChar.getPing();
        if (ping != null) {
            com.google.android.material.datepicker.d.z(this.PingConverter, ping, sQLiteStatement, 2);
        }
        String pian = jPChar.getPian();
        if (pian != null) {
            com.google.android.material.datepicker.d.z(this.PianConverter, pian, sQLiteStatement, 3);
        }
        String luoMa = jPChar.getLuoMa();
        if (luoMa != null) {
            com.google.android.material.datepicker.d.z(this.LuoMaConverter, luoMa, sQLiteStatement, 4);
        }
        String charPath = jPChar.getCharPath();
        if (charPath != null) {
            com.google.android.material.datepicker.d.z(this.CharPathConverter, charPath, sQLiteStatement, 5);
        }
        String character = jPChar.getCharacter();
        if (character != null) {
            com.google.android.material.datepicker.d.z(this.CharacterConverter, character, sQLiteStatement, 6);
        }
    }
}
