package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class JPCharPartDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "JPCharPart";
    private final kj.a PartDirectionConverter;
    private final kj.a PartPathConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d CharId;
        public static final d PartIndex;
        public static final d PartId = new d(0, Long.TYPE, "PartId", true, "PartId");
        public static final d PartDirection = new d(1, String.class, "PartDirection", false, "PartDirection");
        public static final d PartPath = new d(2, String.class, "PartPath", false, "PartPath");

        static {
            Class cls = Integer.TYPE;
            PartIndex = new d(3, cls, "PartIndex", false, "PartIndex");
            CharId = new d(4, cls, "CharId", false, "CharId");
        }
    }

    public JPCharPartDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PartDirectionConverter = new kj.a();
        this.PartPathConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(JPCharPart jPCharPart) {
        if (jPCharPart != null) {
            return Long.valueOf(jPCharPart.getPartId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(JPCharPart jPCharPart) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(JPCharPart jPCharPart, long j11) {
        jPCharPart.setPartId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, JPCharPart jPCharPart) {
        dVar.f();
        dVar.g(1, jPCharPart.getPartId());
        String partDirection = jPCharPart.getPartDirection();
        if (partDirection != null) {
            com.google.android.material.datepicker.d.A(this.PartDirectionConverter, partDirection, dVar, 2);
        }
        String partPath = jPCharPart.getPartPath();
        if (partPath != null) {
            com.google.android.material.datepicker.d.A(this.PartPathConverter, partPath, dVar, 3);
        }
        dVar.g(4, jPCharPart.getPartIndex());
        dVar.g(5, jPCharPart.getCharId());
    }

    @Override // org.greenrobot.greendao.a
    public JPCharPart readEntity(Cursor cursor, int i11) {
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        return new JPCharPart(cursor.getLong(i11), cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PartDirectionConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartPathConverter), cursor.getInt(i11 + 3), cursor.getInt(i11 + 4));
    }

    public JPCharPartDao(j10.a aVar) {
        super(aVar, null);
        this.PartDirectionConverter = new kj.a();
        this.PartPathConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, JPCharPart jPCharPart, int i11) {
        jPCharPart.setPartId(cursor.getLong(i11));
        int i12 = i11 + 1;
        jPCharPart.setPartDirection(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PartDirectionConverter));
        int i13 = i11 + 2;
        jPCharPart.setPartPath(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartPathConverter));
        jPCharPart.setPartIndex(cursor.getInt(i11 + 3));
        jPCharPart.setCharId(cursor.getInt(i11 + 4));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, JPCharPart jPCharPart) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, jPCharPart.getPartId());
        String partDirection = jPCharPart.getPartDirection();
        if (partDirection != null) {
            com.google.android.material.datepicker.d.z(this.PartDirectionConverter, partDirection, sQLiteStatement, 2);
        }
        String partPath = jPCharPart.getPartPath();
        if (partPath != null) {
            com.google.android.material.datepicker.d.z(this.PartPathConverter, partPath, sQLiteStatement, 3);
        }
        sQLiteStatement.bindLong(4, jPCharPart.getPartIndex());
        sQLiteStatement.bindLong(5, jPCharPart.getCharId());
    }
}
