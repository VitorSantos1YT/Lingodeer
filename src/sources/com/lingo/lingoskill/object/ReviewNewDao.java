package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ReviewNewDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "ReviewNew";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d CwsId = new d(0, String.class, "cwsId", true, "cwsId");
        public static final d Unit = new d(1, Long.class, "unit", false, "unit");
        public static final d LastStudyTime = new d(2, Long.class, "lastStudyTime", false, "lastStudyTime");
        public static final d Status = new d(3, String.class, "status", false, "status");
        public static final d ElemType = new d(4, Integer.class, "elemType", false, "elemType");
    }

    public ReviewNewDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"ReviewNew\" (\"cwsId\" TEXT PRIMARY KEY NOT NULL ,\"unit\" INTEGER,\"lastStudyTime\" INTEGER,\"status\" TEXT,\"elemType\" INTEGER);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"ReviewNew\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ReviewNewDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(ReviewNew reviewNew) {
        if (reviewNew != null) {
            return reviewNew.getCwsId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ReviewNew reviewNew) {
        return reviewNew.getCwsId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(ReviewNew reviewNew, long j11) {
        return reviewNew.getCwsId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, ReviewNew reviewNew) {
        dVar.f();
        String cwsId = reviewNew.getCwsId();
        if (cwsId != null) {
            dVar.l(1, cwsId);
        }
        Long unit = reviewNew.getUnit();
        if (unit != null) {
            dVar.g(2, unit.longValue());
        }
        Long lastStudyTime = reviewNew.getLastStudyTime();
        if (lastStudyTime != null) {
            dVar.g(3, lastStudyTime.longValue());
        }
        String status = reviewNew.getStatus();
        if (status != null) {
            dVar.l(4, status);
        }
        Integer elemType = reviewNew.getElemType();
        if (elemType != null) {
            dVar.g(5, elemType.intValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public ReviewNew readEntity(Cursor cursor, int i11) {
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        return new ReviewNew(string, cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)), cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)), cursor.isNull(i14) ? null : cursor.getString(i14), cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ReviewNew reviewNew, int i11) {
        reviewNew.setCwsId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        reviewNew.setUnit(cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
        int i13 = i11 + 2;
        reviewNew.setLastStudyTime(cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)));
        int i14 = i11 + 3;
        reviewNew.setStatus(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i11 + 4;
        reviewNew.setElemType(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ReviewNew reviewNew) {
        sQLiteStatement.clearBindings();
        String cwsId = reviewNew.getCwsId();
        if (cwsId != null) {
            sQLiteStatement.bindString(1, cwsId);
        }
        Long unit = reviewNew.getUnit();
        if (unit != null) {
            sQLiteStatement.bindLong(2, unit.longValue());
        }
        Long lastStudyTime = reviewNew.getLastStudyTime();
        if (lastStudyTime != null) {
            sQLiteStatement.bindLong(3, lastStudyTime.longValue());
        }
        String status = reviewNew.getStatus();
        if (status != null) {
            sQLiteStatement.bindString(4, status);
        }
        Integer elemType = reviewNew.getElemType();
        if (elemType != null) {
            sQLiteStatement.bindLong(5, elemType.intValue());
        }
    }
}
