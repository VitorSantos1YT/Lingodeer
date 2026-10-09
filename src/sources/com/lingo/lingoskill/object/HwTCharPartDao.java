package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HwTCharPartDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "TCharPart";
    private final kj.a PartDirectionConverter;
    private final kj.a PartPathConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d CharId;
        public static final d PartDirection;
        public static final d PartId;
        public static final d PartIndex;
        public static final d PartPath;

        static {
            Class cls = Long.TYPE;
            CharId = new d(0, cls, "CharId", false, "CharId");
            PartDirection = new d(1, String.class, "PartDirection", false, "PartDirection");
            PartId = new d(2, cls, "PartId", true, "PartId");
            PartIndex = new d(3, Integer.TYPE, "PartIndex", false, "PartIndex");
            PartPath = new d(4, String.class, "PartPath", false, "PartPath");
        }
    }

    public HwTCharPartDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PartDirectionConverter = new kj.a();
        this.PartPathConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(HwTCharPart hwTCharPart) {
        if (hwTCharPart != null) {
            return Long.valueOf(hwTCharPart.getPartId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(HwTCharPart hwTCharPart) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11 + 2));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(HwTCharPart hwTCharPart, long j11) {
        hwTCharPart.setPartId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, HwTCharPart hwTCharPart) {
        dVar.f();
        dVar.g(1, hwTCharPart.getCharId());
        String partDirection = hwTCharPart.getPartDirection();
        if (partDirection != null) {
            com.google.android.material.datepicker.d.A(this.PartDirectionConverter, partDirection, dVar, 2);
        }
        dVar.g(3, hwTCharPart.getPartId());
        dVar.g(4, hwTCharPart.getPartIndex());
        String partPath = hwTCharPart.getPartPath();
        if (partPath != null) {
            com.google.android.material.datepicker.d.A(this.PartPathConverter, partPath, dVar, 5);
        }
    }

    @Override // org.greenrobot.greendao.a
    public HwTCharPart readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        String strJ = cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PartDirectionConverter);
        long j12 = cursor.getLong(i11 + 2);
        int i13 = cursor.getInt(i11 + 3);
        int i14 = i11 + 4;
        return new HwTCharPart(j11, strJ, j12, i13, cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.PartPathConverter));
    }

    public HwTCharPartDao(j10.a aVar) {
        super(aVar, null);
        this.PartDirectionConverter = new kj.a();
        this.PartPathConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, HwTCharPart hwTCharPart, int i11) {
        hwTCharPart.setCharId(cursor.getLong(i11));
        int i12 = i11 + 1;
        hwTCharPart.setPartDirection(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PartDirectionConverter));
        hwTCharPart.setPartId(cursor.getLong(i11 + 2));
        hwTCharPart.setPartIndex(cursor.getInt(i11 + 3));
        int i13 = i11 + 4;
        hwTCharPart.setPartPath(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartPathConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, HwTCharPart hwTCharPart) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, hwTCharPart.getCharId());
        String partDirection = hwTCharPart.getPartDirection();
        if (partDirection != null) {
            com.google.android.material.datepicker.d.z(this.PartDirectionConverter, partDirection, sQLiteStatement, 2);
        }
        sQLiteStatement.bindLong(3, hwTCharPart.getPartId());
        sQLiteStatement.bindLong(4, hwTCharPart.getPartIndex());
        String partPath = hwTCharPart.getPartPath();
        if (partPath != null) {
            com.google.android.material.datepicker.d.z(this.PartPathConverter, partPath, sQLiteStatement, 5);
        }
    }
}
