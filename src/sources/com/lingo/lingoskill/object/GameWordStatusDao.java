package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ko.Zea.ealNNtLp;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class GameWordStatusDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "GameWordStatus";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "id", true, "id");
        public static final d LastStudyTime = new d(1, Long.class, "lastStudyTime", false, "lastStudyTime");
        public static final d LastStatus = new d(2, Integer.class, "lastStatus", false, "lastStatus");
        public static final d WrongCount = new d(3, Long.class, "wrongCount", false, "wrongCount");
        public static final d CorrectCount = new d(4, Long.class, ealNNtLp.YCNyCos, false, "correctCount");
        public static final d LastThreeResult = new d(5, String.class, "lastThreeResult", false, "lastThreeResult");
    }

    public GameWordStatusDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"GameWordStatus\" (\"id\" TEXT PRIMARY KEY NOT NULL ,\"lastStudyTime\" INTEGER,\"lastStatus\" INTEGER,\"wrongCount\" INTEGER,\"correctCount\" INTEGER,\"lastThreeResult\" TEXT);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"GameWordStatus\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public GameWordStatusDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(GameWordStatus gameWordStatus) {
        if (gameWordStatus != null) {
            return gameWordStatus.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(GameWordStatus gameWordStatus) {
        return gameWordStatus.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(GameWordStatus gameWordStatus, long j11) {
        return gameWordStatus.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, GameWordStatus gameWordStatus) {
        dVar.f();
        String id2 = gameWordStatus.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        Long lastStudyTime = gameWordStatus.getLastStudyTime();
        if (lastStudyTime != null) {
            dVar.g(2, lastStudyTime.longValue());
        }
        Integer lastStatus = gameWordStatus.getLastStatus();
        if (lastStatus != null) {
            dVar.g(3, lastStatus.intValue());
        }
        Long wrongCount = gameWordStatus.getWrongCount();
        if (wrongCount != null) {
            dVar.g(4, wrongCount.longValue());
        }
        Long correctCount = gameWordStatus.getCorrectCount();
        if (correctCount != null) {
            dVar.g(5, correctCount.longValue());
        }
        String lastThreeResult = gameWordStatus.getLastThreeResult();
        if (lastThreeResult != null) {
            dVar.l(6, lastThreeResult);
        }
    }

    @Override // org.greenrobot.greendao.a
    public GameWordStatus readEntity(Cursor cursor, int i11) {
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        int i16 = i11 + 5;
        return new GameWordStatus(string, cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)), cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)), cursor.isNull(i15) ? null : Long.valueOf(cursor.getLong(i15)), cursor.isNull(i16) ? null : cursor.getString(i16));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, GameWordStatus gameWordStatus, int i11) {
        gameWordStatus.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        gameWordStatus.setLastStudyTime(cursor.isNull(i12) ? null : Long.valueOf(cursor.getLong(i12)));
        int i13 = i11 + 2;
        gameWordStatus.setLastStatus(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
        int i14 = i11 + 3;
        gameWordStatus.setWrongCount(cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
        int i15 = i11 + 4;
        gameWordStatus.setCorrectCount(cursor.isNull(i15) ? null : Long.valueOf(cursor.getLong(i15)));
        int i16 = i11 + 5;
        gameWordStatus.setLastThreeResult(cursor.isNull(i16) ? null : cursor.getString(i16));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, GameWordStatus gameWordStatus) {
        sQLiteStatement.clearBindings();
        String id2 = gameWordStatus.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        Long lastStudyTime = gameWordStatus.getLastStudyTime();
        if (lastStudyTime != null) {
            sQLiteStatement.bindLong(2, lastStudyTime.longValue());
        }
        Integer lastStatus = gameWordStatus.getLastStatus();
        if (lastStatus != null) {
            sQLiteStatement.bindLong(3, lastStatus.intValue());
        }
        Long wrongCount = gameWordStatus.getWrongCount();
        if (wrongCount != null) {
            sQLiteStatement.bindLong(4, wrongCount.longValue());
        }
        Long correctCount = gameWordStatus.getCorrectCount();
        if (correctCount != null) {
            sQLiteStatement.bindLong(5, correctCount.longValue());
        }
        String lastThreeResult = gameWordStatus.getLastThreeResult();
        if (lastThreeResult != null) {
            sQLiteStatement.bindString(6, lastThreeResult);
        }
    }
}
