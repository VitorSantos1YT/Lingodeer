package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LevelDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Level";
    private final kj.a LevelNameConverter;
    private final kj.a UnitListConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d LevelId = new d(0, Long.TYPE, "LevelId", true, "LevelId");
        public static final d LevelName = new d(1, String.class, "LevelName", false, "LevelName");
        public static final d UnitList = new d(2, String.class, "UnitList", false, "UnitList");
    }

    public LevelDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.LevelNameConverter = new kj.a();
        this.UnitListConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Level level) {
        if (level != null) {
            return Long.valueOf(level.getLevelId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Level level) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Level level, long j11) {
        level.setLevelId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Level level) {
        dVar.f();
        dVar.g(1, level.getLevelId());
        String levelName = level.getLevelName();
        if (levelName != null) {
            com.google.android.material.datepicker.d.A(this.LevelNameConverter, levelName, dVar, 2);
        }
        String unitList = level.getUnitList();
        if (unitList != null) {
            com.google.android.material.datepicker.d.A(this.UnitListConverter, unitList, dVar, 3);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Level readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        return new Level(j11, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.LevelNameConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.UnitListConverter));
    }

    public LevelDao(j10.a aVar) {
        super(aVar, null);
        this.LevelNameConverter = new kj.a();
        this.UnitListConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Level level, int i11) {
        level.setLevelId(cursor.getLong(i11));
        int i12 = i11 + 1;
        level.setLevelName(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.LevelNameConverter));
        int i13 = i11 + 2;
        level.setUnitList(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.UnitListConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Level level) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, level.getLevelId());
        String levelName = level.getLevelName();
        if (levelName != null) {
            com.google.android.material.datepicker.d.z(this.LevelNameConverter, levelName, sQLiteStatement, 2);
        }
        String unitList = level.getUnitList();
        if (unitList != null) {
            com.google.android.material.datepicker.d.z(this.UnitListConverter, unitList, sQLiteStatement, 3);
        }
    }
}
