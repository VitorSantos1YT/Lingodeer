package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class UnitFinishStatusDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "UnitFinishStatus";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "id", true, "ID");
        public static final d SpeakLesson = new d(1, Boolean.class, "speakLesson", false, "speakLesson");
        public static final d DialogWarmUp = new d(2, Boolean.class, "dialogWarmUp", false, "dialogWarmUp");
        public static final d DialogPractice = new d(3, Boolean.class, "dialogPractice", false, "dialogPractice");
        public static final d StoryReading = new d(4, Boolean.class, "storyReading", false, "storyReading");
        public static final d StorySpeaking = new d(5, Boolean.class, "storySpeaking", false, "storySpeaking");
        public static final d TipsReading = new d(6, Boolean.class, "tipsReading", false, "tipsReading");
    }

    public UnitFinishStatusDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"UnitFinishStatus\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public UnitFinishStatusDao(j10.a aVar) {
        super(aVar, null);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? aYZzTH.wRPagAItUeq : BuildConfig.VERSION_NAME, "\"UnitFinishStatus\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"speakLesson\" INTEGER,\"dialogWarmUp\" INTEGER,\"dialogPractice\" INTEGER,\"storyReading\" INTEGER,\"storySpeaking\" INTEGER,\"tipsReading\" INTEGER);", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(UnitFinishStatus unitFinishStatus) {
        if (unitFinishStatus != null) {
            return unitFinishStatus.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(UnitFinishStatus unitFinishStatus) {
        return unitFinishStatus.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(UnitFinishStatus unitFinishStatus, long j11) {
        return unitFinishStatus.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, UnitFinishStatus unitFinishStatus) {
        dVar.f();
        String id2 = unitFinishStatus.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        Boolean speakLesson = unitFinishStatus.getSpeakLesson();
        if (speakLesson != null) {
            dVar.g(2, speakLesson.booleanValue() ? 1L : 0L);
        }
        Boolean dialogWarmUp = unitFinishStatus.getDialogWarmUp();
        if (dialogWarmUp != null) {
            dVar.g(3, dialogWarmUp.booleanValue() ? 1L : 0L);
        }
        Boolean dialogPractice = unitFinishStatus.getDialogPractice();
        if (dialogPractice != null) {
            dVar.g(4, dialogPractice.booleanValue() ? 1L : 0L);
        }
        Boolean storyReading = unitFinishStatus.getStoryReading();
        if (storyReading != null) {
            dVar.g(5, storyReading.booleanValue() ? 1L : 0L);
        }
        Boolean storySpeaking = unitFinishStatus.getStorySpeaking();
        if (storySpeaking != null) {
            dVar.g(6, storySpeaking.booleanValue() ? 1L : 0L);
        }
        Boolean tipsReading = unitFinishStatus.getTipsReading();
        if (tipsReading != null) {
            dVar.g(7, tipsReading.booleanValue() ? 1L : 0L);
        }
    }

    @Override // org.greenrobot.greendao.a
    public UnitFinishStatus readEntity(Cursor cursor, int i11) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6 = null;
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i11 + 1;
        if (cursor.isNull(i12)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        int i13 = i11 + 2;
        if (cursor.isNull(i13)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        int i14 = i11 + 3;
        if (cursor.isNull(i14)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i14) != 0);
        }
        int i15 = i11 + 4;
        if (cursor.isNull(i15)) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        int i16 = i11 + 5;
        if (cursor.isNull(i16)) {
            boolValueOf5 = null;
        } else {
            boolValueOf5 = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        int i17 = i11 + 6;
        if (!cursor.isNull(i17)) {
            boolValueOf6 = Boolean.valueOf(cursor.getShort(i17) != 0);
        }
        return new UnitFinishStatus(string, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6);
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, UnitFinishStatus unitFinishStatus, int i11) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Boolean boolValueOf5;
        Boolean boolValueOf6 = null;
        unitFinishStatus.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        if (cursor.isNull(i12)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i12) != 0);
        }
        unitFinishStatus.setSpeakLesson(boolValueOf);
        int i13 = i11 + 2;
        if (cursor.isNull(i13)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i13) != 0);
        }
        unitFinishStatus.setDialogWarmUp(boolValueOf2);
        int i14 = i11 + 3;
        if (cursor.isNull(i14)) {
            boolValueOf3 = null;
        } else {
            boolValueOf3 = Boolean.valueOf(cursor.getShort(i14) != 0);
        }
        unitFinishStatus.setDialogPractice(boolValueOf3);
        int i15 = i11 + 4;
        if (cursor.isNull(i15)) {
            boolValueOf4 = null;
        } else {
            boolValueOf4 = Boolean.valueOf(cursor.getShort(i15) != 0);
        }
        unitFinishStatus.setStoryReading(boolValueOf4);
        int i16 = i11 + 5;
        if (cursor.isNull(i16)) {
            boolValueOf5 = null;
        } else {
            boolValueOf5 = Boolean.valueOf(cursor.getShort(i16) != 0);
        }
        unitFinishStatus.setStorySpeaking(boolValueOf5);
        int i17 = i11 + 6;
        if (!cursor.isNull(i17)) {
            boolValueOf6 = Boolean.valueOf(cursor.getShort(i17) != 0);
        }
        unitFinishStatus.setTipsReading(boolValueOf6);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, UnitFinishStatus unitFinishStatus) {
        sQLiteStatement.clearBindings();
        String id2 = unitFinishStatus.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        Boolean speakLesson = unitFinishStatus.getSpeakLesson();
        if (speakLesson != null) {
            sQLiteStatement.bindLong(2, speakLesson.booleanValue() ? 1L : 0L);
        }
        Boolean dialogWarmUp = unitFinishStatus.getDialogWarmUp();
        if (dialogWarmUp != null) {
            sQLiteStatement.bindLong(3, dialogWarmUp.booleanValue() ? 1L : 0L);
        }
        Boolean dialogPractice = unitFinishStatus.getDialogPractice();
        if (dialogPractice != null) {
            sQLiteStatement.bindLong(4, dialogPractice.booleanValue() ? 1L : 0L);
        }
        Boolean storyReading = unitFinishStatus.getStoryReading();
        if (storyReading != null) {
            sQLiteStatement.bindLong(5, storyReading.booleanValue() ? 1L : 0L);
        }
        Boolean storySpeaking = unitFinishStatus.getStorySpeaking();
        if (storySpeaking != null) {
            sQLiteStatement.bindLong(6, storySpeaking.booleanValue() ? 1L : 0L);
        }
        Boolean tipsReading = unitFinishStatus.getTipsReading();
        if (tipsReading != null) {
            sQLiteStatement.bindLong(7, tipsReading.booleanValue() ? 1L : 0L);
        }
    }
}
