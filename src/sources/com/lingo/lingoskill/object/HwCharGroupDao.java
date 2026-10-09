package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HwCharGroupDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "CharGroup";
    private final kj.a PartGroupListConverter;
    private final kj.a PartGroupNameConverter;
    private final kj.a TPartGroupListConverter;
    private final kj.a TPartGroupNameConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d PartGroupId = new d(0, Long.TYPE, "PartGroupId", true, "PartGroupId");
        public static final d PartGroupIndex = new d(1, Integer.TYPE, "PartGroupIndex", false, "PartGroupIndex");
        public static final d PartGroupList = new d(2, String.class, "PartGroupList", false, "PartGroupList");
        public static final d PartGroupName = new d(3, String.class, "PartGroupName", false, "PartGroupName");
        public static final d TPartGroupList = new d(4, String.class, "TPartGroupList", false, "TPartGroupList");
        public static final d TPartGroupName = new d(5, String.class, "TPartGroupName", false, "TPartGroupName");
    }

    public HwCharGroupDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PartGroupListConverter = new kj.a();
        this.PartGroupNameConverter = new kj.a();
        this.TPartGroupListConverter = new kj.a();
        this.TPartGroupNameConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(HwCharGroup hwCharGroup) {
        if (hwCharGroup != null) {
            return Long.valueOf(hwCharGroup.getPartGroupId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(HwCharGroup hwCharGroup) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(HwCharGroup hwCharGroup, long j11) {
        hwCharGroup.setPartGroupId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, HwCharGroup hwCharGroup) {
        dVar.f();
        dVar.g(1, hwCharGroup.getPartGroupId());
        dVar.g(2, hwCharGroup.getPartGroupIndex());
        String partGroupList = hwCharGroup.getPartGroupList();
        if (partGroupList != null) {
            com.google.android.material.datepicker.d.A(this.PartGroupListConverter, partGroupList, dVar, 3);
        }
        String partGroupName = hwCharGroup.getPartGroupName();
        if (partGroupName != null) {
            com.google.android.material.datepicker.d.A(this.PartGroupNameConverter, partGroupName, dVar, 4);
        }
        String tPartGroupList = hwCharGroup.getTPartGroupList();
        if (tPartGroupList != null) {
            com.google.android.material.datepicker.d.A(this.TPartGroupListConverter, tPartGroupList, dVar, 5);
        }
        String tPartGroupName = hwCharGroup.getTPartGroupName();
        if (tPartGroupName != null) {
            com.google.android.material.datepicker.d.A(this.TPartGroupNameConverter, tPartGroupName, dVar, 6);
        }
    }

    @Override // org.greenrobot.greendao.a
    public HwCharGroup readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = cursor.getInt(i11 + 1);
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        int i16 = i11 + 5;
        return new HwCharGroup(j11, i12, cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartGroupListConverter), cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.PartGroupNameConverter), cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TPartGroupListConverter), cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.TPartGroupNameConverter));
    }

    public HwCharGroupDao(j10.a aVar) {
        super(aVar, null);
        this.PartGroupListConverter = new kj.a();
        this.PartGroupNameConverter = new kj.a();
        this.TPartGroupListConverter = new kj.a();
        this.TPartGroupNameConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, HwCharGroup hwCharGroup, int i11) {
        hwCharGroup.setPartGroupId(cursor.getLong(i11));
        hwCharGroup.setPartGroupIndex(cursor.getInt(i11 + 1));
        int i12 = i11 + 2;
        hwCharGroup.setPartGroupList(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PartGroupListConverter));
        int i13 = i11 + 3;
        hwCharGroup.setPartGroupName(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PartGroupNameConverter));
        int i14 = i11 + 4;
        hwCharGroup.setTPartGroupList(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.TPartGroupListConverter));
        int i15 = i11 + 5;
        hwCharGroup.setTPartGroupName(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TPartGroupNameConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, HwCharGroup hwCharGroup) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, hwCharGroup.getPartGroupId());
        sQLiteStatement.bindLong(2, hwCharGroup.getPartGroupIndex());
        String partGroupList = hwCharGroup.getPartGroupList();
        if (partGroupList != null) {
            com.google.android.material.datepicker.d.z(this.PartGroupListConverter, partGroupList, sQLiteStatement, 3);
        }
        String partGroupName = hwCharGroup.getPartGroupName();
        if (partGroupName != null) {
            com.google.android.material.datepicker.d.z(this.PartGroupNameConverter, partGroupName, sQLiteStatement, 4);
        }
        String tPartGroupList = hwCharGroup.getTPartGroupList();
        if (tPartGroupList != null) {
            com.google.android.material.datepicker.d.z(this.TPartGroupListConverter, tPartGroupList, sQLiteStatement, 5);
        }
        String tPartGroupName = hwCharGroup.getTPartGroupName();
        if (tPartGroupName != null) {
            com.google.android.material.datepicker.d.z(this.TPartGroupNameConverter, tPartGroupName, sQLiteStatement, 6);
        }
    }
}
