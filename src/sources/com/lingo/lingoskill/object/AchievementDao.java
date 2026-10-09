package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AchievementDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Achievement";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Accumulate_daystreak;
        public static final d Accumulate_seconds;
        public static final d Accumulate_xp;
        public static final d Free_time_earned_history;
        public static final d Id;
        public static final d Learning_history;
        public static final d Medals_continue_days;
        public static final d Medals_finished_lans;
        public static final d Updatetime_learnedtime;

        static {
            Class cls = Long.TYPE;
            Id = new d(0, cls, "id", true, "id");
            Class cls2 = Integer.TYPE;
            Accumulate_seconds = new d(1, cls2, "accumulate_seconds", false, "accumulate_seconds");
            Accumulate_daystreak = new d(2, cls2, "accumulate_daystreak", false, "accumulate_daystreak");
            Accumulate_xp = new d(3, cls2, "accumulate_xp", false, "accumulate_xp");
            Medals_continue_days = new d(4, String.class, "medals_continue_days", false, "medals_continue_days");
            Learning_history = new d(5, String.class, "learning_history", false, "learning_history");
            Medals_finished_lans = new d(6, String.class, "medals_finished_lans", false, "medals_finished_lan");
            Updatetime_learnedtime = new d(7, cls, "updatetime_learnedtime", false, "updatetime_learnedtime");
            Free_time_earned_history = new d(8, String.class, "free_time_earned_history", false, "free_time_earned_history");
        }
    }

    public AchievementDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"Achievement\" (\"id\" INTEGER PRIMARY KEY NOT NULL ,\"accumulate_seconds\" INTEGER NOT NULL ,\"accumulate_daystreak\" INTEGER NOT NULL ,\"accumulate_xp\" INTEGER NOT NULL ,\"medals_continue_days\" TEXT,\"learning_history\" TEXT,\"medals_finished_lan\" TEXT,\"updatetime_learnedtime\" INTEGER NOT NULL ,\"free_time_earned_history\" TEXT);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"Achievement\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public AchievementDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Achievement achievement) {
        if (achievement != null) {
            return Long.valueOf(achievement.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Achievement achievement) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Achievement achievement, long j11) {
        achievement.setId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Achievement achievement) {
        dVar.f();
        dVar.g(1, achievement.getId());
        dVar.g(2, achievement.getAccumulate_seconds());
        dVar.g(3, achievement.getAccumulate_daystreak());
        dVar.g(4, achievement.getAccumulate_xp());
        String medals_continue_days = achievement.getMedals_continue_days();
        if (medals_continue_days != null) {
            dVar.l(5, medals_continue_days);
        }
        String learning_history = achievement.getLearning_history();
        if (learning_history != null) {
            dVar.l(6, learning_history);
        }
        String medals_finished_lans = achievement.getMedals_finished_lans();
        if (medals_finished_lans != null) {
            dVar.l(7, medals_finished_lans);
        }
        dVar.g(8, achievement.getUpdatetime_learnedtime());
        String free_time_earned_history = achievement.getFree_time_earned_history();
        if (free_time_earned_history != null) {
            dVar.l(9, free_time_earned_history);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Achievement readEntity(Cursor cursor, int i11) {
        int i12 = i11 + 4;
        int i13 = i11 + 5;
        int i14 = i11 + 6;
        int i15 = i11 + 8;
        return new Achievement(cursor.getLong(i11), cursor.getInt(i11 + 1), cursor.getInt(i11 + 2), cursor.getInt(i11 + 3), cursor.isNull(i12) ? null : cursor.getString(i12), cursor.isNull(i13) ? null : cursor.getString(i13), cursor.isNull(i14) ? null : cursor.getString(i14), cursor.getLong(i11 + 7), cursor.isNull(i15) ? null : cursor.getString(i15));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Achievement achievement, int i11) {
        achievement.setId(cursor.getLong(i11));
        achievement.setAccumulate_seconds(cursor.getInt(i11 + 1));
        achievement.setAccumulate_daystreak(cursor.getInt(i11 + 2));
        achievement.setAccumulate_xp(cursor.getInt(i11 + 3));
        int i12 = i11 + 4;
        achievement.setMedals_continue_days(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 5;
        achievement.setLearning_history(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i11 + 6;
        achievement.setMedals_finished_lans(cursor.isNull(i14) ? null : cursor.getString(i14));
        achievement.setUpdatetime_learnedtime(cursor.getLong(i11 + 7));
        int i15 = i11 + 8;
        achievement.setFree_time_earned_history(cursor.isNull(i15) ? null : cursor.getString(i15));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Achievement achievement) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, achievement.getId());
        sQLiteStatement.bindLong(2, achievement.getAccumulate_seconds());
        sQLiteStatement.bindLong(3, achievement.getAccumulate_daystreak());
        sQLiteStatement.bindLong(4, achievement.getAccumulate_xp());
        String medals_continue_days = achievement.getMedals_continue_days();
        if (medals_continue_days != null) {
            sQLiteStatement.bindString(5, medals_continue_days);
        }
        String learning_history = achievement.getLearning_history();
        if (learning_history != null) {
            sQLiteStatement.bindString(6, learning_history);
        }
        String medals_finished_lans = achievement.getMedals_finished_lans();
        if (medals_finished_lans != null) {
            sQLiteStatement.bindString(7, medals_finished_lans);
        }
        sQLiteStatement.bindLong(8, achievement.getUpdatetime_learnedtime());
        String free_time_earned_history = achievement.getFree_time_earned_history();
        if (free_time_earned_history != null) {
            sQLiteStatement.bindString(9, free_time_earned_history);
        }
    }
}
