package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LoginHistoryDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "LoginHistory";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Uid = new d(0, String.class, "uid", true, "UID");
        public static final d NickName = new d(1, String.class, "nickName", false, "nickName");
        public static final d Email = new d(2, String.class, gkbGsXmgaxRjJ.fnRBeLhSbrttyp, false, "email");
        public static final d AccountType = new d(3, String.class, "accountType", false, "accountType");
        public static final d IsMember = new d(4, Boolean.class, "isMember", false, "isMember");
        public static final d LearningLan = new d(5, Integer.class, "learningLan", false, "learningLan");
        public static final d UiLan = new d(6, Integer.class, "uiLan", false, "uiLan");
        public static final d LastLogOutTime = new d(7, Long.class, "lastLogOutTime", false, "lastLogOutTime");
    }

    public LoginHistoryDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"LoginHistory\" (\"UID\" TEXT PRIMARY KEY NOT NULL ,\"nickName\" TEXT,\"email\" TEXT,\"accountType\" TEXT,\"isMember\" INTEGER,\"learningLan\" INTEGER,\"uiLan\" INTEGER,\"lastLogOutTime\" INTEGER);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"LoginHistory\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public LoginHistoryDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(LoginHistory loginHistory) {
        if (loginHistory != null) {
            return loginHistory.getUid();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(LoginHistory loginHistory) {
        return loginHistory.getUid() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(LoginHistory loginHistory, long j11) {
        return loginHistory.getUid();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, LoginHistory loginHistory) {
        dVar.f();
        String uid = loginHistory.getUid();
        if (uid != null) {
            dVar.l(1, uid);
        }
        String nickName = loginHistory.getNickName();
        if (nickName != null) {
            dVar.l(2, nickName);
        }
        String email = loginHistory.getEmail();
        if (email != null) {
            dVar.l(3, email);
        }
        String accountType = loginHistory.getAccountType();
        if (accountType != null) {
            dVar.l(4, accountType);
        }
        Boolean isMember = loginHistory.getIsMember();
        if (isMember != null) {
            dVar.g(5, isMember.booleanValue() ? 1L : 0L);
        }
        Integer learningLan = loginHistory.getLearningLan();
        if (learningLan != null) {
            dVar.g(6, learningLan.intValue());
        }
        Integer uiLan = loginHistory.getUiLan();
        if (uiLan != null) {
            dVar.g(7, uiLan.intValue());
        }
        Long lastLogOutTime = loginHistory.getLastLogOutTime();
        if (lastLogOutTime != null) {
            dVar.g(8, lastLogOutTime.longValue());
        }
    }

    @Override // org.greenrobot.greendao.a
    public LoginHistory readEntity(Cursor cursor, int i11) {
        Boolean boolValueOf;
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i11 + 1;
        String string2 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i11 + 2;
        String string3 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i11 + 3;
        String string4 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i11 + 4;
        if (cursor.isNull(i15)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        int i16 = i11 + 5;
        int i17 = i11 + 6;
        int i18 = i11 + 7;
        return new LoginHistory(string, string2, string3, string4, boolValueOf, cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)), cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)), cursor.isNull(i18) ? null : Long.valueOf(cursor.getLong(i18)));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, LoginHistory loginHistory, int i11) {
        Boolean boolValueOf;
        loginHistory.setUid(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        loginHistory.setNickName(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 2;
        loginHistory.setEmail(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i11 + 3;
        loginHistory.setAccountType(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i11 + 4;
        if (cursor.isNull(i15)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        loginHistory.setIsMember(boolValueOf);
        int i16 = i11 + 5;
        loginHistory.setLearningLan(cursor.isNull(i16) ? null : Integer.valueOf(cursor.getInt(i16)));
        int i17 = i11 + 6;
        loginHistory.setUiLan(cursor.isNull(i17) ? null : Integer.valueOf(cursor.getInt(i17)));
        int i18 = i11 + 7;
        loginHistory.setLastLogOutTime(cursor.isNull(i18) ? null : Long.valueOf(cursor.getLong(i18)));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, LoginHistory loginHistory) {
        sQLiteStatement.clearBindings();
        String uid = loginHistory.getUid();
        if (uid != null) {
            sQLiteStatement.bindString(1, uid);
        }
        String nickName = loginHistory.getNickName();
        if (nickName != null) {
            sQLiteStatement.bindString(2, nickName);
        }
        String email = loginHistory.getEmail();
        if (email != null) {
            sQLiteStatement.bindString(3, email);
        }
        String accountType = loginHistory.getAccountType();
        if (accountType != null) {
            sQLiteStatement.bindString(4, accountType);
        }
        Boolean isMember = loginHistory.getIsMember();
        if (isMember != null) {
            sQLiteStatement.bindLong(5, isMember.booleanValue() ? 1L : 0L);
        }
        Integer learningLan = loginHistory.getLearningLan();
        if (learningLan != null) {
            sQLiteStatement.bindLong(6, learningLan.intValue());
        }
        Integer uiLan = loginHistory.getUiLan();
        if (uiLan != null) {
            sQLiteStatement.bindLong(7, uiLan.intValue());
        }
        Long lastLogOutTime = loginHistory.getLastLogOutTime();
        if (lastLogOutTime != null) {
            sQLiteStatement.bindLong(8, lastLogOutTime.longValue());
        }
    }
}
