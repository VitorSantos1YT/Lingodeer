package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ReviewSpDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "ReviewSp";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d CWSId = new d(0, String.class, "CWSId", true, "CWSID");
        public static final d ElemType;
        public static final d Lan;
        public static final d LastStatus;
        public static final d LastTime;
        public static final d SRS;
        public static final d SortIndex;
        public static final d Unit;
        public static final d Version;

        static {
            Class cls = Integer.TYPE;
            Unit = new d(1, cls, UnitDao.TABLENAME, false, UnitDao.TABLENAME);
            Version = new d(2, cls, "Version", false, "Version");
            SRS = new d(3, String.class, "SRS", false, "SRS");
            SortIndex = new d(4, String.class, "SortIndex", false, "SortIndex");
            LastStatus = new d(5, String.class, "LastStatus", false, "LastStatus");
            LastTime = new d(6, Long.TYPE, "LastTime", false, "LastTime");
            Lan = new d(7, cls, "Lan", false, "Lan");
            ElemType = new d(8, cls, "elemType", false, "elemType");
        }
    }

    public ReviewSpDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ReviewSpDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(ReviewSp reviewSp) {
        if (reviewSp != null) {
            return reviewSp.getCWSId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(ReviewSp reviewSp) {
        return reviewSp.getCWSId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(ReviewSp reviewSp, long j11) {
        return reviewSp.getCWSId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, ReviewSp reviewSp) {
        dVar.f();
        String cWSId = reviewSp.getCWSId();
        if (cWSId != null) {
            dVar.l(1, cWSId);
        }
        dVar.g(2, reviewSp.getUnit());
        dVar.g(3, reviewSp.getVersion());
        String srs = reviewSp.getSRS();
        if (srs != null) {
            dVar.l(4, srs);
        }
        String sortIndex = reviewSp.getSortIndex();
        if (sortIndex != null) {
            dVar.l(5, sortIndex);
        }
        String lastStatus = reviewSp.getLastStatus();
        if (lastStatus != null) {
            dVar.l(6, lastStatus);
        }
        dVar.g(7, reviewSp.getLastTime());
        dVar.g(8, reviewSp.getLan());
        dVar.g(9, reviewSp.getElemType());
    }

    @Override // org.greenrobot.greendao.a
    public ReviewSp readEntity(Cursor cursor, int i11) {
        int i12 = i11 + 3;
        int i13 = i11 + 4;
        int i14 = i11 + 5;
        return new ReviewSp(cursor.isNull(i11) ? null : cursor.getString(i11), cursor.getInt(i11 + 1), cursor.getInt(i11 + 2), cursor.isNull(i12) ? null : cursor.getString(i12), cursor.isNull(i13) ? null : cursor.getString(i13), cursor.isNull(i14) ? null : cursor.getString(i14), cursor.getLong(i11 + 6), cursor.getInt(i11 + 7), cursor.getInt(i11 + 8));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, ReviewSp reviewSp, int i11) {
        reviewSp.setCWSId(cursor.isNull(i11) ? null : cursor.getString(i11));
        reviewSp.setUnit(cursor.getInt(i11 + 1));
        reviewSp.setVersion(cursor.getInt(i11 + 2));
        int i12 = i11 + 3;
        reviewSp.setSRS(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 4;
        reviewSp.setSortIndex(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i11 + 5;
        reviewSp.setLastStatus(cursor.isNull(i14) ? null : cursor.getString(i14));
        reviewSp.setLastTime(cursor.getLong(i11 + 6));
        reviewSp.setLan(cursor.getInt(i11 + 7));
        reviewSp.setElemType(cursor.getInt(i11 + 8));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, ReviewSp reviewSp) {
        sQLiteStatement.clearBindings();
        String cWSId = reviewSp.getCWSId();
        if (cWSId != null) {
            sQLiteStatement.bindString(1, cWSId);
        }
        sQLiteStatement.bindLong(2, reviewSp.getUnit());
        sQLiteStatement.bindLong(3, reviewSp.getVersion());
        String srs = reviewSp.getSRS();
        if (srs != null) {
            sQLiteStatement.bindString(4, srs);
        }
        String sortIndex = reviewSp.getSortIndex();
        if (sortIndex != null) {
            sQLiteStatement.bindString(5, sortIndex);
        }
        String lastStatus = reviewSp.getLastStatus();
        if (lastStatus != null) {
            sQLiteStatement.bindString(6, lastStatus);
        }
        sQLiteStatement.bindLong(7, reviewSp.getLastTime());
        sQLiteStatement.bindLong(8, reviewSp.getLan());
        sQLiteStatement.bindLong(9, reviewSp.getElemType());
    }
}
