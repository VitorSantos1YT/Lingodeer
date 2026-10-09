package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdWordDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "PdWord";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Flag;
        public static final d UpdateDate;
        public static final d WTranCHN;
        public static final d WTranDEN;
        public static final d WTranENG;
        public static final d WTranFRN;
        public static final d WTranJPN;
        public static final d WTranKRN;
        public static final d WTranTCHN;
        public static final d WTranVTN;
        public static final d WordRoot;
        public static final d WordRootLuoma;
        public static final d WordRootZhuyin;
        public static final d WordStruct;
        public static final d Id = new d(0, String.class, "Id", true, "ID");
        public static final d Lan = new d(1, String.class, "Lan", false, "LAN");
        public static final d WordId = new d(2, Long.class, "WordId", false, "WORD_ID");
        public static final d LessonId = new d(3, Long.class, "LessonId", false, "LESSON_ID");
        public static final d Word = new d(4, String.class, WordDao.TABLENAME, false, "WORD");
        public static final d Zhuyin = new d(5, String.class, "Zhuyin", false, "ZHUYIN");
        public static final d Luoma = new d(6, String.class, "Luoma", false, "LUOMA");
        public static final d TranENG = new d(7, String.class, "TranENG", false, "TRAN_ENG");
        public static final d TranJPN = new d(8, String.class, "TranJPN", false, "TRAN_JPN");
        public static final d TranKRN = new d(9, String.class, "TranKRN", false, "TRAN_KRN");
        public static final d TranFRN = new d(10, String.class, "TranFRN", false, "TRAN_FRN");
        public static final d TranDEN = new d(11, String.class, "TranDEN", false, "TRAN_DEN");
        public static final d TranVTN = new d(12, String.class, "TranVTN", false, "TRAN_VTN");
        public static final d TranTCHN = new d(13, String.class, "TranTCHN", false, "TRAN_TCHN");
        public static final d TranCHN = new d(14, String.class, "TranCHN", false, "TRAN_CHN");
        public static final d Options = new d(15, String.class, "Options", false, "OPTIONS");
        public static final d Answer = new d(16, String.class, "Answer", false, "ANSWER");

        static {
            Class cls = Integer.TYPE;
            Flag = new d(17, cls, "Flag", false, "FLAG");
            UpdateDate = new d(18, String.class, "UpdateDate", false, "UPDATE_DATE");
            WordRoot = new d(19, String.class, "WordRoot", false, "WORD_ROOT");
            WordRootZhuyin = new d(20, String.class, "WordRootZhuyin", false, "WORD_ROOT_ZHUYIN");
            WordRootLuoma = new d(21, String.class, "WordRootLuoma", false, "WORD_ROOT_LUOMA");
            WTranENG = new d(22, String.class, "WTranENG", false, "WTRAN_ENG");
            WTranJPN = new d(23, String.class, "WTranJPN", false, "WTRAN_JPN");
            WTranKRN = new d(24, String.class, "WTranKRN", false, "WTRAN_KRN");
            WTranFRN = new d(25, String.class, "WTranFRN", false, "WTRAN_FRN");
            WTranDEN = new d(26, String.class, "WTranDEN", false, "WTRAN_DEN");
            WTranVTN = new d(27, String.class, "WTranVTN", false, "WTRAN_VTN");
            WTranTCHN = new d(28, String.class, "WTranTCHN", false, "WTRAN_TCHN");
            WTranCHN = new d(29, String.class, "WTranCHN", false, "WTRAN_CHN");
            WordStruct = new d(30, cls, "WordStruct", false, "WORD_STRUCT");
        }
    }

    public PdWordDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"PdWord\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"LAN\" TEXT,\"WORD_ID\" INTEGER,\"LESSON_ID\" INTEGER,\"WORD\" TEXT,\"ZHUYIN\" TEXT,\"LUOMA\" TEXT,\"TRAN_ENG\" TEXT,\"TRAN_JPN\" TEXT,\"TRAN_KRN\" TEXT,\"TRAN_FRN\" TEXT,\"TRAN_DEN\" TEXT,\"TRAN_VTN\" TEXT,\"TRAN_TCHN\" TEXT,\"TRAN_CHN\" TEXT,\"OPTIONS\" TEXT,\"ANSWER\" TEXT,\"FLAG\" INTEGER NOT NULL ,\"UPDATE_DATE\" TEXT,\"WORD_ROOT\" TEXT,\"WORD_ROOT_ZHUYIN\" TEXT,\"WORD_ROOT_LUOMA\" TEXT,\"WTRAN_ENG\" TEXT,\"WTRAN_JPN\" TEXT,\"WTRAN_KRN\" TEXT,\"WTRAN_FRN\" TEXT,\"WTRAN_DEN\" TEXT,\"WTRAN_VTN\" TEXT,\"WTRAN_TCHN\" TEXT,\"WTRAN_CHN\" TEXT,\"WORD_STRUCT\" INTEGER NOT NULL );", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"PdWord\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public PdWordDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(PdWord pdWord) {
        if (pdWord != null) {
            return pdWord.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PdWord pdWord) {
        return pdWord.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(PdWord pdWord, long j11) {
        return pdWord.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, PdWord pdWord) {
        dVar.f();
        String id2 = pdWord.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        String lan = pdWord.getLan();
        if (lan != null) {
            dVar.l(2, lan);
        }
        Long wordId = pdWord.getWordId();
        if (wordId != null) {
            dVar.g(3, wordId.longValue());
        }
        Long lessonId = pdWord.getLessonId();
        if (lessonId != null) {
            dVar.g(4, lessonId.longValue());
        }
        String word = pdWord.getWord();
        if (word != null) {
            dVar.l(5, word);
        }
        String zhuyin = pdWord.getZhuyin();
        if (zhuyin != null) {
            dVar.l(6, zhuyin);
        }
        String luoma = pdWord.getLuoma();
        if (luoma != null) {
            dVar.l(7, luoma);
        }
        String tranENG = pdWord.getTranENG();
        if (tranENG != null) {
            dVar.l(8, tranENG);
        }
        String tranJPN = pdWord.getTranJPN();
        if (tranJPN != null) {
            dVar.l(9, tranJPN);
        }
        String tranKRN = pdWord.getTranKRN();
        if (tranKRN != null) {
            dVar.l(10, tranKRN);
        }
        String tranFRN = pdWord.getTranFRN();
        if (tranFRN != null) {
            dVar.l(11, tranFRN);
        }
        String tranDEN = pdWord.getTranDEN();
        if (tranDEN != null) {
            dVar.l(12, tranDEN);
        }
        String tranVTN = pdWord.getTranVTN();
        if (tranVTN != null) {
            dVar.l(13, tranVTN);
        }
        String tranTCHN = pdWord.getTranTCHN();
        if (tranTCHN != null) {
            dVar.l(14, tranTCHN);
        }
        String tranCHN = pdWord.getTranCHN();
        if (tranCHN != null) {
            dVar.l(15, tranCHN);
        }
        String options = pdWord.getOptions();
        if (options != null) {
            dVar.l(16, options);
        }
        String answer = pdWord.getAnswer();
        if (answer != null) {
            dVar.l(17, answer);
        }
        dVar.g(18, pdWord.getFlag());
        String updateDate = pdWord.getUpdateDate();
        if (updateDate != null) {
            dVar.l(19, updateDate);
        }
        String wordRoot = pdWord.getWordRoot();
        if (wordRoot != null) {
            dVar.l(20, wordRoot);
        }
        String wordRootZhuyin = pdWord.getWordRootZhuyin();
        if (wordRootZhuyin != null) {
            dVar.l(21, wordRootZhuyin);
        }
        String wordRootLuoma = pdWord.getWordRootLuoma();
        if (wordRootLuoma != null) {
            dVar.l(22, wordRootLuoma);
        }
        String wTranENG = pdWord.getWTranENG();
        if (wTranENG != null) {
            dVar.l(23, wTranENG);
        }
        String wTranJPN = pdWord.getWTranJPN();
        if (wTranJPN != null) {
            dVar.l(24, wTranJPN);
        }
        String wTranKRN = pdWord.getWTranKRN();
        if (wTranKRN != null) {
            dVar.l(25, wTranKRN);
        }
        String wTranFRN = pdWord.getWTranFRN();
        if (wTranFRN != null) {
            dVar.l(26, wTranFRN);
        }
        String wTranDEN = pdWord.getWTranDEN();
        if (wTranDEN != null) {
            dVar.l(27, wTranDEN);
        }
        String wTranVTN = pdWord.getWTranVTN();
        if (wTranVTN != null) {
            dVar.l(28, wTranVTN);
        }
        String wTranTCHN = pdWord.getWTranTCHN();
        if (wTranTCHN != null) {
            dVar.l(29, wTranTCHN);
        }
        String wTranCHN = pdWord.getWTranCHN();
        if (wTranCHN != null) {
            dVar.l(30, wTranCHN);
        }
        dVar.g(31, pdWord.getWordStruct());
    }

    @Override // org.greenrobot.greendao.a
    public PdWord readEntity(Cursor cursor, int i11) {
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i11 + 1;
        String string2 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i11 + 2;
        Long lValueOf = cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13));
        int i14 = i11 + 3;
        Long lValueOf2 = cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14));
        int i15 = i11 + 4;
        String string3 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i11 + 5;
        String string4 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i11 + 6;
        String string5 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i11 + 7;
        String string6 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i11 + 8;
        String string7 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i21 = i11 + 9;
        String string8 = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i11 + 10;
        String string9 = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i11 + 11;
        String string10 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i11 + 12;
        String string11 = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = i11 + 13;
        String string12 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i11 + 14;
        String string13 = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i11 + 15;
        String string14 = cursor.isNull(i27) ? null : cursor.getString(i27);
        int i28 = i11 + 16;
        String string15 = cursor.isNull(i28) ? null : cursor.getString(i28);
        int i29 = cursor.getInt(i11 + 17);
        int i30 = i11 + 18;
        String string16 = cursor.isNull(i30) ? null : cursor.getString(i30);
        int i31 = i11 + 19;
        String string17 = cursor.isNull(i31) ? null : cursor.getString(i31);
        int i32 = i11 + 20;
        String string18 = cursor.isNull(i32) ? null : cursor.getString(i32);
        int i33 = i11 + 21;
        String string19 = cursor.isNull(i33) ? null : cursor.getString(i33);
        int i34 = i11 + 22;
        String string20 = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i11 + 23;
        String string21 = cursor.isNull(i35) ? null : cursor.getString(i35);
        int i36 = i11 + 24;
        String string22 = cursor.isNull(i36) ? null : cursor.getString(i36);
        int i37 = i11 + 25;
        String string23 = cursor.isNull(i37) ? null : cursor.getString(i37);
        int i38 = i11 + 26;
        String string24 = cursor.isNull(i38) ? null : cursor.getString(i38);
        int i39 = i11 + 27;
        String string25 = cursor.isNull(i39) ? null : cursor.getString(i39);
        int i40 = i11 + 28;
        String string26 = cursor.isNull(i40) ? null : cursor.getString(i40);
        int i41 = i11 + 29;
        return new PdWord(string, string2, lValueOf, lValueOf2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, i29, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, cursor.isNull(i41) ? null : cursor.getString(i41), cursor.getInt(i11 + 30));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PdWord pdWord, int i11) {
        pdWord.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        pdWord.setLan(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 2;
        pdWord.setWordId(cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)));
        int i14 = i11 + 3;
        pdWord.setLessonId(cursor.isNull(i14) ? null : Long.valueOf(cursor.getLong(i14)));
        int i15 = i11 + 4;
        pdWord.setWord(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i11 + 5;
        pdWord.setZhuyin(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i11 + 6;
        pdWord.setLuoma(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i11 + 7;
        pdWord.setTranENG(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i11 + 8;
        pdWord.setTranJPN(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i21 = i11 + 9;
        pdWord.setTranKRN(cursor.isNull(i21) ? null : cursor.getString(i21));
        int i22 = i11 + 10;
        pdWord.setTranFRN(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i11 + 11;
        pdWord.setTranDEN(cursor.isNull(i23) ? null : cursor.getString(i23));
        int i24 = i11 + 12;
        pdWord.setTranVTN(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i11 + 13;
        pdWord.setTranTCHN(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i11 + 14;
        pdWord.setTranCHN(cursor.isNull(i26) ? null : cursor.getString(i26));
        int i27 = i11 + 15;
        pdWord.setOptions(cursor.isNull(i27) ? null : cursor.getString(i27));
        int i28 = i11 + 16;
        pdWord.setAnswer(cursor.isNull(i28) ? null : cursor.getString(i28));
        pdWord.setFlag(cursor.getInt(i11 + 17));
        int i29 = i11 + 18;
        pdWord.setUpdateDate(cursor.isNull(i29) ? null : cursor.getString(i29));
        int i30 = i11 + 19;
        pdWord.setWordRoot(cursor.isNull(i30) ? null : cursor.getString(i30));
        int i31 = i11 + 20;
        pdWord.setWordRootZhuyin(cursor.isNull(i31) ? null : cursor.getString(i31));
        int i32 = i11 + 21;
        pdWord.setWordRootLuoma(cursor.isNull(i32) ? null : cursor.getString(i32));
        int i33 = i11 + 22;
        pdWord.setWTranENG(cursor.isNull(i33) ? null : cursor.getString(i33));
        int i34 = i11 + 23;
        pdWord.setWTranJPN(cursor.isNull(i34) ? null : cursor.getString(i34));
        int i35 = i11 + 24;
        pdWord.setWTranKRN(cursor.isNull(i35) ? null : cursor.getString(i35));
        int i36 = i11 + 25;
        pdWord.setWTranFRN(cursor.isNull(i36) ? null : cursor.getString(i36));
        int i37 = i11 + 26;
        pdWord.setWTranDEN(cursor.isNull(i37) ? null : cursor.getString(i37));
        int i38 = i11 + 27;
        pdWord.setWTranVTN(cursor.isNull(i38) ? null : cursor.getString(i38));
        int i39 = i11 + 28;
        pdWord.setWTranTCHN(cursor.isNull(i39) ? null : cursor.getString(i39));
        int i40 = i11 + 29;
        pdWord.setWTranCHN(cursor.isNull(i40) ? null : cursor.getString(i40));
        pdWord.setWordStruct(cursor.getInt(i11 + 30));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PdWord pdWord) {
        sQLiteStatement.clearBindings();
        String id2 = pdWord.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        String lan = pdWord.getLan();
        if (lan != null) {
            sQLiteStatement.bindString(2, lan);
        }
        Long wordId = pdWord.getWordId();
        if (wordId != null) {
            sQLiteStatement.bindLong(3, wordId.longValue());
        }
        Long lessonId = pdWord.getLessonId();
        if (lessonId != null) {
            sQLiteStatement.bindLong(4, lessonId.longValue());
        }
        String word = pdWord.getWord();
        if (word != null) {
            sQLiteStatement.bindString(5, word);
        }
        String zhuyin = pdWord.getZhuyin();
        if (zhuyin != null) {
            sQLiteStatement.bindString(6, zhuyin);
        }
        String luoma = pdWord.getLuoma();
        if (luoma != null) {
            sQLiteStatement.bindString(7, luoma);
        }
        String tranENG = pdWord.getTranENG();
        if (tranENG != null) {
            sQLiteStatement.bindString(8, tranENG);
        }
        String tranJPN = pdWord.getTranJPN();
        if (tranJPN != null) {
            sQLiteStatement.bindString(9, tranJPN);
        }
        String tranKRN = pdWord.getTranKRN();
        if (tranKRN != null) {
            sQLiteStatement.bindString(10, tranKRN);
        }
        String tranFRN = pdWord.getTranFRN();
        if (tranFRN != null) {
            sQLiteStatement.bindString(11, tranFRN);
        }
        String tranDEN = pdWord.getTranDEN();
        if (tranDEN != null) {
            sQLiteStatement.bindString(12, tranDEN);
        }
        String tranVTN = pdWord.getTranVTN();
        if (tranVTN != null) {
            sQLiteStatement.bindString(13, tranVTN);
        }
        String tranTCHN = pdWord.getTranTCHN();
        if (tranTCHN != null) {
            sQLiteStatement.bindString(14, tranTCHN);
        }
        String tranCHN = pdWord.getTranCHN();
        if (tranCHN != null) {
            sQLiteStatement.bindString(15, tranCHN);
        }
        String options = pdWord.getOptions();
        if (options != null) {
            sQLiteStatement.bindString(16, options);
        }
        String answer = pdWord.getAnswer();
        if (answer != null) {
            sQLiteStatement.bindString(17, answer);
        }
        sQLiteStatement.bindLong(18, pdWord.getFlag());
        String updateDate = pdWord.getUpdateDate();
        if (updateDate != null) {
            sQLiteStatement.bindString(19, updateDate);
        }
        String wordRoot = pdWord.getWordRoot();
        if (wordRoot != null) {
            sQLiteStatement.bindString(20, wordRoot);
        }
        String wordRootZhuyin = pdWord.getWordRootZhuyin();
        if (wordRootZhuyin != null) {
            sQLiteStatement.bindString(21, wordRootZhuyin);
        }
        String wordRootLuoma = pdWord.getWordRootLuoma();
        if (wordRootLuoma != null) {
            sQLiteStatement.bindString(22, wordRootLuoma);
        }
        String wTranENG = pdWord.getWTranENG();
        if (wTranENG != null) {
            sQLiteStatement.bindString(23, wTranENG);
        }
        String wTranJPN = pdWord.getWTranJPN();
        if (wTranJPN != null) {
            sQLiteStatement.bindString(24, wTranJPN);
        }
        String wTranKRN = pdWord.getWTranKRN();
        if (wTranKRN != null) {
            sQLiteStatement.bindString(25, wTranKRN);
        }
        String wTranFRN = pdWord.getWTranFRN();
        if (wTranFRN != null) {
            sQLiteStatement.bindString(26, wTranFRN);
        }
        String wTranDEN = pdWord.getWTranDEN();
        if (wTranDEN != null) {
            sQLiteStatement.bindString(27, wTranDEN);
        }
        String wTranVTN = pdWord.getWTranVTN();
        if (wTranVTN != null) {
            sQLiteStatement.bindString(28, wTranVTN);
        }
        String wTranTCHN = pdWord.getWTranTCHN();
        if (wTranTCHN != null) {
            sQLiteStatement.bindString(29, wTranTCHN);
        }
        String wTranCHN = pdWord.getWTranCHN();
        if (wTranCHN != null) {
            sQLiteStatement.bindString(30, wTranCHN);
        }
        sQLiteStatement.bindLong(31, pdWord.getWordStruct());
    }
}
