package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanCustomInfoDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "LanCustomInfo";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d AckEnterPos;
        public static final d AckUnitId;
        public static final d Audio_lesson;
        public static final d CurrentEnteredUnitId;
        public static final d FlashCardFocusUnit;
        public static final d FlashCardIsLearnChar;
        public static final d FlashCardIsLearnSent;
        public static final d FlashCardIsLearnWord;
        public static final d IsStartDownload;
        public static final d Lan;
        public static final d Lesson_exam;
        public static final d Lesson_stars;
        public static final d Main;
        public static final d Main_tt;
        public static final d Pronun;

        static {
            Class cls = Long.TYPE;
            Lan = new d(0, cls, "lan", true, "lan");
            Main = new d(1, String.class, "main", false, "main");
            Main_tt = new d(2, String.class, "main_tt", false, "main_tt");
            Lesson_exam = new d(3, String.class, "lesson_exam", false, "lesson_exam");
            Lesson_stars = new d(4, String.class, "lesson_stars", false, "lesson_stars");
            Audio_lesson = new d(5, String.class, "audio_lesson", false, "audio_lesson");
            Pronun = new d(6, Integer.TYPE, "pronun", false, "pronun");
            Class cls2 = Boolean.TYPE;
            IsStartDownload = new d(7, cls2, "isStartDownload", false, "isStartDownload");
            CurrentEnteredUnitId = new d(8, cls, "currentEnteredUnitId", false, "currentEnteredUnitId");
            FlashCardFocusUnit = new d(9, String.class, "flashCardFocusUnit", false, "flashCardFocusUnit");
            FlashCardIsLearnChar = new d(10, cls2, "flashCardIsLearnChar", false, "flashCardIsLearnChar");
            FlashCardIsLearnWord = new d(11, cls2, "flashCardIsLearnWord", false, "flashCardIsLearnWord");
            FlashCardIsLearnSent = new d(12, cls2, "flashCardIsLearnSent", false, "flashCardIsLearnSent");
            AckEnterPos = new d(13, Integer.class, "ackEnterPos", false, "ackEnterPos");
            AckUnitId = new d(14, Long.class, "ackUnitId", false, "ackUnitId");
        }
    }

    public LanCustomInfoDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"LanCustomInfo\" (\"lan\" INTEGER PRIMARY KEY NOT NULL ,\"main\" TEXT,\"main_tt\" TEXT,\"lesson_exam\" TEXT,\"lesson_stars\" TEXT,\"audio_lesson\" TEXT,\"pronun\" INTEGER NOT NULL ,\"isStartDownload\" INTEGER NOT NULL ,\"currentEnteredUnitId\" INTEGER NOT NULL ,\"flashCardFocusUnit\" TEXT,\"flashCardIsLearnChar\" INTEGER NOT NULL ,\"flashCardIsLearnWord\" INTEGER NOT NULL ,\"flashCardIsLearnSent\" INTEGER NOT NULL ,\"ackEnterPos\" INTEGER,\"ackUnitId\" INTEGER);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"LanCustomInfo\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public LanCustomInfoDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(LanCustomInfo lanCustomInfo) {
        if (lanCustomInfo != null) {
            return Long.valueOf(lanCustomInfo.getLan());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(LanCustomInfo lanCustomInfo) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(LanCustomInfo lanCustomInfo, long j11) {
        lanCustomInfo.setLan(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, LanCustomInfo lanCustomInfo) {
        dVar.f();
        dVar.g(1, lanCustomInfo.getLan());
        String main = lanCustomInfo.getMain();
        if (main != null) {
            dVar.l(2, main);
        }
        String main_tt = lanCustomInfo.getMain_tt();
        if (main_tt != null) {
            dVar.l(3, main_tt);
        }
        String lesson_exam = lanCustomInfo.getLesson_exam();
        if (lesson_exam != null) {
            dVar.l(4, lesson_exam);
        }
        String lesson_stars = lanCustomInfo.getLesson_stars();
        if (lesson_stars != null) {
            dVar.l(5, lesson_stars);
        }
        String audio_lesson = lanCustomInfo.getAudio_lesson();
        if (audio_lesson != null) {
            dVar.l(6, audio_lesson);
        }
        dVar.g(7, lanCustomInfo.getPronun());
        dVar.g(8, lanCustomInfo.getIsStartDownload() ? 1L : 0L);
        dVar.g(9, lanCustomInfo.getCurrentEnteredUnitId());
        String flashCardFocusUnit = lanCustomInfo.getFlashCardFocusUnit();
        if (flashCardFocusUnit != null) {
            dVar.l(10, flashCardFocusUnit);
        }
        dVar.g(11, lanCustomInfo.getFlashCardIsLearnChar() ? 1L : 0L);
        dVar.g(12, lanCustomInfo.getFlashCardIsLearnWord() ? 1L : 0L);
        dVar.g(13, lanCustomInfo.getFlashCardIsLearnSent() ? 1L : 0L);
        Integer ackEnterPos = lanCustomInfo.getAckEnterPos();
        if (ackEnterPos != null) {
            dVar.g(14, ackEnterPos.intValue());
        }
        Long ackUnitId = lanCustomInfo.getAckUnitId();
        if (ackUnitId != null) {
            dVar.g(15, ackUnitId.longValue());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x00e6: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // org.greenrobot.greendao.a
    public com.lingo.lingoskill.object.LanCustomInfo readEntity(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x00e6: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, LanCustomInfo lanCustomInfo, int i11) {
        lanCustomInfo.setLan(cursor.getLong(i11));
        int i12 = i11 + 1;
        lanCustomInfo.setMain(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 2;
        lanCustomInfo.setMain_tt(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i11 + 3;
        lanCustomInfo.setLesson_exam(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i11 + 4;
        lanCustomInfo.setLesson_stars(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i11 + 5;
        lanCustomInfo.setAudio_lesson(cursor.isNull(i16) ? null : cursor.getString(i16));
        lanCustomInfo.setPronun(cursor.getInt(i11 + 6));
        lanCustomInfo.setIsStartDownload(cursor.getShort(i11 + 7) != 0);
        lanCustomInfo.setCurrentEnteredUnitId(cursor.getLong(i11 + 8));
        int i17 = i11 + 9;
        lanCustomInfo.setFlashCardFocusUnit(cursor.isNull(i17) ? null : cursor.getString(i17));
        lanCustomInfo.setFlashCardIsLearnChar(cursor.getShort(i11 + 10) != 0);
        lanCustomInfo.setFlashCardIsLearnWord(cursor.getShort(i11 + 11) != 0);
        lanCustomInfo.setFlashCardIsLearnSent(cursor.getShort(i11 + 12) != 0);
        int i18 = i11 + 13;
        lanCustomInfo.setAckEnterPos(cursor.isNull(i18) ? null : Integer.valueOf(cursor.getInt(i18)));
        int i19 = i11 + 14;
        lanCustomInfo.setAckUnitId(cursor.isNull(i19) ? null : Long.valueOf(cursor.getLong(i19)));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, LanCustomInfo lanCustomInfo) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, lanCustomInfo.getLan());
        String main = lanCustomInfo.getMain();
        if (main != null) {
            sQLiteStatement.bindString(2, main);
        }
        String main_tt = lanCustomInfo.getMain_tt();
        if (main_tt != null) {
            sQLiteStatement.bindString(3, main_tt);
        }
        String lesson_exam = lanCustomInfo.getLesson_exam();
        if (lesson_exam != null) {
            sQLiteStatement.bindString(4, lesson_exam);
        }
        String lesson_stars = lanCustomInfo.getLesson_stars();
        if (lesson_stars != null) {
            sQLiteStatement.bindString(5, lesson_stars);
        }
        String audio_lesson = lanCustomInfo.getAudio_lesson();
        if (audio_lesson != null) {
            sQLiteStatement.bindString(6, audio_lesson);
        }
        sQLiteStatement.bindLong(7, lanCustomInfo.getPronun());
        sQLiteStatement.bindLong(8, lanCustomInfo.getIsStartDownload() ? 1L : 0L);
        sQLiteStatement.bindLong(9, lanCustomInfo.getCurrentEnteredUnitId());
        String flashCardFocusUnit = lanCustomInfo.getFlashCardFocusUnit();
        if (flashCardFocusUnit != null) {
            sQLiteStatement.bindString(10, flashCardFocusUnit);
        }
        sQLiteStatement.bindLong(11, lanCustomInfo.getFlashCardIsLearnChar() ? 1L : 0L);
        sQLiteStatement.bindLong(12, lanCustomInfo.getFlashCardIsLearnWord() ? 1L : 0L);
        sQLiteStatement.bindLong(13, lanCustomInfo.getFlashCardIsLearnSent() ? 1L : 0L);
        Integer ackEnterPos = lanCustomInfo.getAckEnterPos();
        if (ackEnterPos != null) {
            sQLiteStatement.bindLong(14, ackEnterPos.intValue());
        }
        Long ackUnitId = lanCustomInfo.getAckUnitId();
        if (ackUnitId != null) {
            sQLiteStatement.bindLong(15, ackUnitId.longValue());
        }
    }
}
