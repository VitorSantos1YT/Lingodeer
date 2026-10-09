package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class YouYinDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "YouYin";
    private final kj.a LuoMaConverter;
    private final kj.a PianConverter;
    private final kj.a PingConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, Long.TYPE, "id", true, "Id");
        public static final d Ping = new d(1, String.class, "Ping", false, "Ping");
        public static final d Pian = new d(2, String.class, "Pian", false, "Pian");
        public static final d LuoMa = new d(3, String.class, "LuoMa", false, "LuoMa");
    }

    public YouYinDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PingConverter = new kj.a();
        this.PianConverter = new kj.a();
        this.LuoMaConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(YouYin youYin) {
        if (youYin != null) {
            return Long.valueOf(youYin.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(YouYin youYin) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(YouYin youYin, long j11) {
        youYin.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, YouYin youYin) {
        dVar.f();
        dVar.g(1, youYin.getId());
        String ping = youYin.getPing();
        if (ping != null) {
            com.google.android.material.datepicker.d.A(this.PingConverter, ping, dVar, 2);
        }
        String pian = youYin.getPian();
        if (pian != null) {
            com.google.android.material.datepicker.d.A(this.PianConverter, pian, dVar, 3);
        }
        String luoMa = youYin.getLuoMa();
        if (luoMa != null) {
            com.google.android.material.datepicker.d.A(this.LuoMaConverter, luoMa, dVar, 4);
        }
    }

    @Override // org.greenrobot.greendao.a
    public YouYin readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        return new YouYin(j11, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PingConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PianConverter), cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.LuoMaConverter));
    }

    public YouYinDao(j10.a aVar) {
        super(aVar, null);
        this.PingConverter = new kj.a();
        this.PianConverter = new kj.a();
        this.LuoMaConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, YouYin youYin, int i11) {
        youYin.setId(cursor.getLong(i11));
        int i12 = i11 + 1;
        youYin.setPing(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PingConverter));
        int i13 = i11 + 2;
        youYin.setPian(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PianConverter));
        int i14 = i11 + 3;
        youYin.setLuoMa(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.LuoMaConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, YouYin youYin) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, youYin.getId());
        String ping = youYin.getPing();
        if (ping != null) {
            com.google.android.material.datepicker.d.z(this.PingConverter, ping, sQLiteStatement, 2);
        }
        String pian = youYin.getPian();
        if (pian != null) {
            com.google.android.material.datepicker.d.z(this.PianConverter, pian, sQLiteStatement, 3);
        }
        String luoMa = youYin.getLuoMa();
        if (luoMa != null) {
            com.google.android.material.datepicker.d.z(this.LuoMaConverter, luoMa, sQLiteStatement, 4);
        }
    }
}
