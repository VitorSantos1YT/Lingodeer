package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HwCharPartDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "CharPart";
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
            PartId = new d(0, cls, "PartId", true, "PartId");
            CharId = new d(1, cls, "CharId", false, "CharId");
            PartIndex = new d(2, Integer.TYPE, "PartIndex", false, "PartIndex");
            PartDirection = new d(3, String.class, "PartDirection", false, "PartDirection");
            PartPath = new d(4, String.class, "PartPath", false, "PartPath");
        }
    }

    public HwCharPartDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PartDirectionConverter = new kj.a();
        this.PartPathConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(HwCharPart hwCharPart) {
        if (hwCharPart != null) {
            return Long.valueOf(hwCharPart.getPartId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(HwCharPart hwCharPart) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(HwCharPart hwCharPart, long j11) {
        hwCharPart.setPartId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, HwCharPart hwCharPart) {
        dVar.f();
        dVar.g(1, hwCharPart.getPartId());
        dVar.g(2, hwCharPart.getCharId());
        dVar.g(3, hwCharPart.getPartIndex());
        String partDirection = hwCharPart.getPartDirection();
        if (partDirection != null) {
            com.google.android.material.datepicker.d.A(this.PartDirectionConverter, partDirection, dVar, 4);
        }
        String partPath = hwCharPart.getPartPath();
        if (partPath != null) {
            com.google.android.material.datepicker.d.A(this.PartPathConverter, partPath, dVar, 5);
        }
    }

    @Override // org.greenrobot.greendao.a
    public HwCharPart readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        long j12 = cursor.getLong(i11 + 1);
        int i12 = cursor.getInt(i11 + 2);
        int i13 = i11 + 3;
        int i14 = i11 + 4;
        return new HwCharPart(j11, j12, i12, cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartDirectionConverter), cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.PartPathConverter));
    }

    public HwCharPartDao(j10.a aVar) {
        super(aVar, null);
        this.PartDirectionConverter = new kj.a();
        this.PartPathConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, HwCharPart hwCharPart, int i11) {
        hwCharPart.setPartId(cursor.getLong(i11));
        hwCharPart.setCharId(cursor.getLong(i11 + 1));
        hwCharPart.setPartIndex(cursor.getInt(i11 + 2));
        int i12 = i11 + 3;
        hwCharPart.setPartDirection(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PartDirectionConverter));
        int i13 = i11 + 4;
        hwCharPart.setPartPath(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartPathConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, HwCharPart hwCharPart) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, hwCharPart.getPartId());
        sQLiteStatement.bindLong(2, hwCharPart.getCharId());
        sQLiteStatement.bindLong(3, hwCharPart.getPartIndex());
        String partDirection = hwCharPart.getPartDirection();
        if (partDirection != null) {
            com.google.android.material.datepicker.d.z(this.PartDirectionConverter, partDirection, sQLiteStatement, 4);
        }
        String partPath = hwCharPart.getPartPath();
        if (partPath != null) {
            com.google.android.material.datepicker.d.z(this.PartPathConverter, partPath, sQLiteStatement, 5);
        }
    }
}
