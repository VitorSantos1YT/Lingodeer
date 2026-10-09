package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class KOCharPartDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "koCharPart";
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
            PartPath = new d(3, String.class, "PartPath", false, "PartPath");
            PartDirection = new d(4, String.class, "PartDirection", false, "PartDirection");
        }
    }

    public KOCharPartDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PartPathConverter = new kj.a();
        this.PartDirectionConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(KOCharPart kOCharPart) {
        if (kOCharPart != null) {
            return Long.valueOf(kOCharPart.getPartId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(KOCharPart kOCharPart) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(KOCharPart kOCharPart, long j11) {
        kOCharPart.setPartId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, KOCharPart kOCharPart) {
        dVar.f();
        dVar.g(1, kOCharPart.getPartId());
        dVar.g(2, kOCharPart.getCharId());
        dVar.g(3, kOCharPart.getPartIndex());
        String partPath = kOCharPart.getPartPath();
        if (partPath != null) {
            com.google.android.material.datepicker.d.A(this.PartPathConverter, partPath, dVar, 4);
        }
        String partDirection = kOCharPart.getPartDirection();
        if (partDirection != null) {
            com.google.android.material.datepicker.d.A(this.PartDirectionConverter, partDirection, dVar, 5);
        }
    }

    @Override // org.greenrobot.greendao.a
    public KOCharPart readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        long j12 = cursor.getLong(i11 + 1);
        int i12 = cursor.getInt(i11 + 2);
        int i13 = i11 + 3;
        int i14 = i11 + 4;
        return new KOCharPart(j11, j12, i12, cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartPathConverter), cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.PartDirectionConverter));
    }

    public KOCharPartDao(j10.a aVar) {
        super(aVar, null);
        this.PartPathConverter = new kj.a();
        this.PartDirectionConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, KOCharPart kOCharPart, int i11) {
        kOCharPart.setPartId(cursor.getLong(i11));
        kOCharPart.setCharId(cursor.getLong(i11 + 1));
        kOCharPart.setPartIndex(cursor.getInt(i11 + 2));
        int i12 = i11 + 3;
        kOCharPart.setPartPath(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PartPathConverter));
        int i13 = i11 + 4;
        kOCharPart.setPartDirection(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartDirectionConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, KOCharPart kOCharPart) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, kOCharPart.getPartId());
        sQLiteStatement.bindLong(2, kOCharPart.getCharId());
        sQLiteStatement.bindLong(3, kOCharPart.getPartIndex());
        String partPath = kOCharPart.getPartPath();
        if (partPath != null) {
            com.google.android.material.datepicker.d.z(this.PartPathConverter, partPath, sQLiteStatement, 4);
        }
        String partDirection = kOCharPart.getPartDirection();
        if (partDirection != null) {
            com.google.android.material.datepicker.d.z(this.PartDirectionConverter, partDirection, sQLiteStatement, 5);
        }
    }
}
