package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class UnitDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Unit";
    private final kj.a DescriptionConverter;
    private final kj.a LessonListConverter;
    private final kj.a UnitNameConverter;
    private final kj.a iconResSuffixConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d IconResSuffix;
        public static final d LevelId;
        public static final d SortIndex;
        public static final d UnitId = new d(0, Long.TYPE, "UnitId", true, "UnitId");
        public static final d UnitName = new d(1, String.class, "UnitName", false, "UnitName");
        public static final d Description = new d(2, String.class, "Description", false, "Description");
        public static final d LessonList = new d(3, String.class, "LessonList", false, "LessonList");

        static {
            Class cls = Integer.TYPE;
            SortIndex = new d(4, cls, "SortIndex", false, "SortIndex");
            LevelId = new d(5, cls, "LevelId", false, "LevelId");
            IconResSuffix = new d(6, String.class, "iconResSuffix", false, DytezVyM.XfIkSSeZmUYJK);
        }
    }

    public UnitDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.UnitNameConverter = new kj.a();
        this.DescriptionConverter = new kj.a();
        this.LessonListConverter = new kj.a();
        this.iconResSuffixConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Unit unit) {
        if (unit != null) {
            return Long.valueOf(unit.getUnitId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Unit unit) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Unit unit, long j11) {
        unit.setUnitId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Unit unit) {
        dVar.f();
        dVar.g(1, unit.getUnitId());
        String unitName = unit.getUnitName();
        if (unitName != null) {
            com.google.android.material.datepicker.d.A(this.UnitNameConverter, unitName, dVar, 2);
        }
        String description = unit.getDescription();
        if (description != null) {
            com.google.android.material.datepicker.d.A(this.DescriptionConverter, description, dVar, 3);
        }
        String lessonList = unit.getLessonList();
        if (lessonList != null) {
            com.google.android.material.datepicker.d.A(this.LessonListConverter, lessonList, dVar, 4);
        }
        dVar.g(5, unit.getSortIndex());
        dVar.g(6, unit.getLevelId());
        String iconResSuffix = unit.getIconResSuffix();
        if (iconResSuffix != null) {
            com.google.android.material.datepicker.d.A(this.iconResSuffixConverter, iconResSuffix, dVar, 7);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Unit readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        String strJ = cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.UnitNameConverter);
        int i13 = i11 + 2;
        String strJ2 = cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.DescriptionConverter);
        int i14 = i11 + 3;
        String strJ3 = cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.LessonListConverter);
        int i15 = cursor.getInt(i11 + 4);
        int i16 = cursor.getInt(i11 + 5);
        int i17 = i11 + 6;
        return new Unit(j11, strJ, strJ2, strJ3, i15, i16, cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.iconResSuffixConverter));
    }

    public UnitDao(j10.a aVar) {
        super(aVar, null);
        this.UnitNameConverter = new kj.a();
        this.DescriptionConverter = new kj.a();
        this.LessonListConverter = new kj.a();
        this.iconResSuffixConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Unit unit, int i11) {
        unit.setUnitId(cursor.getLong(i11));
        int i12 = i11 + 1;
        unit.setUnitName(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.UnitNameConverter));
        int i13 = i11 + 2;
        unit.setDescription(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.DescriptionConverter));
        int i14 = i11 + 3;
        unit.setLessonList(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.LessonListConverter));
        unit.setSortIndex(cursor.getInt(i11 + 4));
        unit.setLevelId(cursor.getInt(i11 + 5));
        int i15 = i11 + 6;
        unit.setIconResSuffix(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.iconResSuffixConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Unit unit) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, unit.getUnitId());
        String unitName = unit.getUnitName();
        if (unitName != null) {
            com.google.android.material.datepicker.d.z(this.UnitNameConverter, unitName, sQLiteStatement, 2);
        }
        String description = unit.getDescription();
        if (description != null) {
            com.google.android.material.datepicker.d.z(this.DescriptionConverter, description, sQLiteStatement, 3);
        }
        String lessonList = unit.getLessonList();
        if (lessonList != null) {
            com.google.android.material.datepicker.d.z(this.LessonListConverter, lessonList, sQLiteStatement, 4);
        }
        sQLiteStatement.bindLong(5, unit.getSortIndex());
        sQLiteStatement.bindLong(6, unit.getLevelId());
        String iconResSuffix = unit.getIconResSuffix();
        if (iconResSuffix != null) {
            com.google.android.material.datepicker.d.z(this.iconResSuffixConverter, iconResSuffix, sQLiteStatement, 7);
        }
    }
}
