package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdTipsDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "PdTips";

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "Id", true, "ID");
        public static final d Lan = new d(1, String.class, "Lan", false, "LAN");
        public static final d CardId = new d(2, Long.class, "CardId", false, "CARD_ID");
        public static final d LessonIds = new d(3, String.class, "LessonIds", false, "LESSON_IDS");
        public static final d CardName = new d(4, String.class, "CardName", false, "CARD_NAME");
        public static final d CHN_Name = new d(5, String.class, "CHN_Name", false, "CHN__NAME");
        public static final d ENG_Name = new d(6, String.class, "ENG_Name", false, "ENG__NAME");
        public static final d JPN_Name = new d(7, String.class, "JPN_Name", false, "JPN__NAME");
        public static final d KRN_Name = new d(8, String.class, "KRN_Name", false, "KRN__NAME");
        public static final d DEN_Name = new d(9, String.class, "DEN_Name", false, "DEN__NAME");
        public static final d FRN_Name = new d(10, String.class, "FRN_Name", false, "FRN__NAME");
        public static final d ESO_Name = new d(11, String.class, "ESO_Name", false, "ESO__NAME");
        public static final d VTN_Name = new d(12, String.class, "VTN_Name", false, "VTN__NAME");
        public static final d CHN_Tips = new d(13, String.class, "CHN_Tips", false, "CHN__TIPS");
        public static final d ENG_Tips = new d(14, String.class, "ENG_Tips", false, "ENG__TIPS");
        public static final d JPN_Tips = new d(15, String.class, "JPN_Tips", false, "JPN__TIPS");
        public static final d KRN_Tips = new d(16, String.class, "KRN_Tips", false, "KRN__TIPS");
        public static final d DEN_Tips = new d(17, String.class, "DEN_Tips", false, "DEN__TIPS");
        public static final d FRN_Tips = new d(18, String.class, "FRN_Tips", false, "FRN__TIPS");
        public static final d ESO_Tips = new d(19, String.class, "ESO_Tips", false, "ESO__TIPS");
        public static final d VTN_Tips = new d(20, String.class, "VTN_Tips", false, "VTN__TIPS");
        public static final d CardTypeId = new d(21, Long.class, "CardTypeId", false, "CARD_TYPE_ID");
        public static final d CardTypeName = new d(22, String.class, "CardTypeName", false, "CARD_TYPE_NAME");
        public static final d CardTypeTranCHN = new d(23, String.class, "CardTypeTranCHN", false, "CARD_TYPE_TRAN_CHN");
        public static final d CardTypeTranENG = new d(24, String.class, "CardTypeTranENG", false, "CARD_TYPE_TRAN_ENG");
        public static final d CardTypeTranJPN = new d(25, String.class, "CardTypeTranJPN", false, "CARD_TYPE_TRAN_JPN");
        public static final d CardTypeTranKRN = new d(26, String.class, "CardTypeTranKRN", false, "CARD_TYPE_TRAN_KRN");
        public static final d CardTypeTranDEN = new d(27, String.class, "CardTypeTranDEN", false, "CARD_TYPE_TRAN_DEN");
        public static final d CardTypeTranFRN = new d(28, String.class, "CardTypeTranFRN", false, "CARD_TYPE_TRAN_FRN");
        public static final d CardTypeTranESO = new d(29, String.class, "CardTypeTranESO", false, "CARD_TYPE_TRAN_ESO");
        public static final d CardTypeTranVTN = new d(30, String.class, "CardTypeTranVTN", false, "CARD_TYPE_TRAN_VTN");
    }

    public PdTipsDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"PdTips\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"LAN\" TEXT,\"CARD_ID\" INTEGER,\"LESSON_IDS\" TEXT,\"CARD_NAME\" TEXT,\"CHN__NAME\" TEXT,\"ENG__NAME\" TEXT,\"JPN__NAME\" TEXT,\"KRN__NAME\" TEXT,\"DEN__NAME\" TEXT,\"FRN__NAME\" TEXT,\"ESO__NAME\" TEXT,\"VTN__NAME\" TEXT,\"CHN__TIPS\" TEXT,\"ENG__TIPS\" TEXT,\"JPN__TIPS\" TEXT,\"KRN__TIPS\" TEXT,\"DEN__TIPS\" TEXT,\"FRN__TIPS\" TEXT,\"ESO__TIPS\" TEXT,\"VTN__TIPS\" TEXT,\"CARD_TYPE_ID\" INTEGER,\"CARD_TYPE_NAME\" TEXT,\"CARD_TYPE_TRAN_CHN\" TEXT,\"CARD_TYPE_TRAN_ENG\" TEXT,\"CARD_TYPE_TRAN_JPN\" TEXT,\"CARD_TYPE_TRAN_KRN\" TEXT,\"CARD_TYPE_TRAN_DEN\" TEXT,\"CARD_TYPE_TRAN_FRN\" TEXT,\"CARD_TYPE_TRAN_ESO\" TEXT,\"CARD_TYPE_TRAN_VTN\" TEXT);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"PdTips\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    public PdTipsDao(j10.a aVar) {
        super(aVar, null);
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(PdTips pdTips) {
        if (pdTips != null) {
            return pdTips.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PdTips pdTips) {
        return pdTips.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(PdTips pdTips, long j11) {
        return pdTips.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, PdTips pdTips) {
        dVar.f();
        String id2 = pdTips.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        String lan = pdTips.getLan();
        if (lan != null) {
            dVar.l(2, lan);
        }
        Long cardId = pdTips.getCardId();
        if (cardId != null) {
            dVar.g(3, cardId.longValue());
        }
        String lessonIds = pdTips.getLessonIds();
        if (lessonIds != null) {
            dVar.l(4, lessonIds);
        }
        String cardName = pdTips.getCardName();
        if (cardName != null) {
            dVar.l(5, cardName);
        }
        String cHN_Name = pdTips.getCHN_Name();
        if (cHN_Name != null) {
            dVar.l(6, cHN_Name);
        }
        String eNG_Name = pdTips.getENG_Name();
        if (eNG_Name != null) {
            dVar.l(7, eNG_Name);
        }
        String jPN_Name = pdTips.getJPN_Name();
        if (jPN_Name != null) {
            dVar.l(8, jPN_Name);
        }
        String kRN_Name = pdTips.getKRN_Name();
        if (kRN_Name != null) {
            dVar.l(9, kRN_Name);
        }
        String dEN_Name = pdTips.getDEN_Name();
        if (dEN_Name != null) {
            dVar.l(10, dEN_Name);
        }
        String fRN_Name = pdTips.getFRN_Name();
        if (fRN_Name != null) {
            dVar.l(11, fRN_Name);
        }
        String eSO_Name = pdTips.getESO_Name();
        if (eSO_Name != null) {
            dVar.l(12, eSO_Name);
        }
        String vTN_Name = pdTips.getVTN_Name();
        if (vTN_Name != null) {
            dVar.l(13, vTN_Name);
        }
        String cHN_Tips = pdTips.getCHN_Tips();
        if (cHN_Tips != null) {
            dVar.l(14, cHN_Tips);
        }
        String eNG_Tips = pdTips.getENG_Tips();
        if (eNG_Tips != null) {
            dVar.l(15, eNG_Tips);
        }
        String jPN_Tips = pdTips.getJPN_Tips();
        if (jPN_Tips != null) {
            dVar.l(16, jPN_Tips);
        }
        String kRN_Tips = pdTips.getKRN_Tips();
        if (kRN_Tips != null) {
            dVar.l(17, kRN_Tips);
        }
        String dEN_Tips = pdTips.getDEN_Tips();
        if (dEN_Tips != null) {
            dVar.l(18, dEN_Tips);
        }
        String fRN_Tips = pdTips.getFRN_Tips();
        if (fRN_Tips != null) {
            dVar.l(19, fRN_Tips);
        }
        String eSO_Tips = pdTips.getESO_Tips();
        if (eSO_Tips != null) {
            dVar.l(20, eSO_Tips);
        }
        String vTN_Tips = pdTips.getVTN_Tips();
        if (vTN_Tips != null) {
            dVar.l(21, vTN_Tips);
        }
        Long cardTypeId = pdTips.getCardTypeId();
        if (cardTypeId != null) {
            dVar.g(22, cardTypeId.longValue());
        }
        String cardTypeName = pdTips.getCardTypeName();
        if (cardTypeName != null) {
            dVar.l(23, cardTypeName);
        }
        String cardTypeTranCHN = pdTips.getCardTypeTranCHN();
        if (cardTypeTranCHN != null) {
            dVar.l(24, cardTypeTranCHN);
        }
        String cardTypeTranENG = pdTips.getCardTypeTranENG();
        if (cardTypeTranENG != null) {
            dVar.l(25, cardTypeTranENG);
        }
        String cardTypeTranJPN = pdTips.getCardTypeTranJPN();
        if (cardTypeTranJPN != null) {
            dVar.l(26, cardTypeTranJPN);
        }
        String cardTypeTranKRN = pdTips.getCardTypeTranKRN();
        if (cardTypeTranKRN != null) {
            dVar.l(27, cardTypeTranKRN);
        }
        String cardTypeTranDEN = pdTips.getCardTypeTranDEN();
        if (cardTypeTranDEN != null) {
            dVar.l(28, cardTypeTranDEN);
        }
        String cardTypeTranFRN = pdTips.getCardTypeTranFRN();
        if (cardTypeTranFRN != null) {
            dVar.l(29, cardTypeTranFRN);
        }
        String cardTypeTranESO = pdTips.getCardTypeTranESO();
        if (cardTypeTranESO != null) {
            dVar.l(30, cardTypeTranESO);
        }
        String cardTypeTranVTN = pdTips.getCardTypeTranVTN();
        if (cardTypeTranVTN != null) {
            dVar.l(31, cardTypeTranVTN);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x0243: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
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
    public com.lingo.lingoskill.object.PdTips readEntity(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 ??, still in use, count: 1, list:
          (r1v0 ?? I:??[OBJECT, ARRAY]) from 0x0243: RETURN (r1v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v0 ??
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
    public void readEntity(Cursor cursor, PdTips pdTips, int i11) {
        pdTips.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        pdTips.setLan(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 2;
        pdTips.setCardId(cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)));
        int i14 = i11 + 3;
        pdTips.setLessonIds(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i11 + 4;
        pdTips.setCardName(cursor.isNull(i15) ? null : cursor.getString(i15));
        int i16 = i11 + 5;
        pdTips.setCHN_Name(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i11 + 6;
        pdTips.setENG_Name(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i11 + 7;
        pdTips.setJPN_Name(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i11 + 8;
        pdTips.setKRN_Name(cursor.isNull(i19) ? null : cursor.getString(i19));
        int i21 = i11 + 9;
        pdTips.setDEN_Name(cursor.isNull(i21) ? null : cursor.getString(i21));
        int i22 = i11 + 10;
        pdTips.setFRN_Name(cursor.isNull(i22) ? null : cursor.getString(i22));
        int i23 = i11 + 11;
        pdTips.setESO_Name(cursor.isNull(i23) ? null : cursor.getString(i23));
        int i24 = i11 + 12;
        pdTips.setVTN_Name(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i11 + 13;
        pdTips.setCHN_Tips(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i11 + 14;
        pdTips.setENG_Tips(cursor.isNull(i26) ? null : cursor.getString(i26));
        int i27 = i11 + 15;
        pdTips.setJPN_Tips(cursor.isNull(i27) ? null : cursor.getString(i27));
        int i28 = i11 + 16;
        pdTips.setKRN_Tips(cursor.isNull(i28) ? null : cursor.getString(i28));
        int i29 = i11 + 17;
        pdTips.setDEN_Tips(cursor.isNull(i29) ? null : cursor.getString(i29));
        int i30 = i11 + 18;
        pdTips.setFRN_Tips(cursor.isNull(i30) ? null : cursor.getString(i30));
        int i31 = i11 + 19;
        pdTips.setESO_Tips(cursor.isNull(i31) ? null : cursor.getString(i31));
        int i32 = i11 + 20;
        pdTips.setVTN_Tips(cursor.isNull(i32) ? null : cursor.getString(i32));
        int i33 = i11 + 21;
        pdTips.setCardTypeId(cursor.isNull(i33) ? null : Long.valueOf(cursor.getLong(i33)));
        int i34 = i11 + 22;
        pdTips.setCardTypeName(cursor.isNull(i34) ? null : cursor.getString(i34));
        int i35 = i11 + 23;
        pdTips.setCardTypeTranCHN(cursor.isNull(i35) ? null : cursor.getString(i35));
        int i36 = i11 + 24;
        pdTips.setCardTypeTranENG(cursor.isNull(i36) ? null : cursor.getString(i36));
        int i37 = i11 + 25;
        pdTips.setCardTypeTranJPN(cursor.isNull(i37) ? null : cursor.getString(i37));
        int i38 = i11 + 26;
        pdTips.setCardTypeTranKRN(cursor.isNull(i38) ? null : cursor.getString(i38));
        int i39 = i11 + 27;
        pdTips.setCardTypeTranDEN(cursor.isNull(i39) ? null : cursor.getString(i39));
        int i40 = i11 + 28;
        pdTips.setCardTypeTranFRN(cursor.isNull(i40) ? null : cursor.getString(i40));
        int i41 = i11 + 29;
        pdTips.setCardTypeTranESO(cursor.isNull(i41) ? null : cursor.getString(i41));
        int i42 = i11 + 30;
        pdTips.setCardTypeTranVTN(cursor.isNull(i42) ? null : cursor.getString(i42));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PdTips pdTips) {
        sQLiteStatement.clearBindings();
        String id2 = pdTips.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        String lan = pdTips.getLan();
        if (lan != null) {
            sQLiteStatement.bindString(2, lan);
        }
        Long cardId = pdTips.getCardId();
        if (cardId != null) {
            sQLiteStatement.bindLong(3, cardId.longValue());
        }
        String lessonIds = pdTips.getLessonIds();
        if (lessonIds != null) {
            sQLiteStatement.bindString(4, lessonIds);
        }
        String cardName = pdTips.getCardName();
        if (cardName != null) {
            sQLiteStatement.bindString(5, cardName);
        }
        String cHN_Name = pdTips.getCHN_Name();
        if (cHN_Name != null) {
            sQLiteStatement.bindString(6, cHN_Name);
        }
        String eNG_Name = pdTips.getENG_Name();
        if (eNG_Name != null) {
            sQLiteStatement.bindString(7, eNG_Name);
        }
        String jPN_Name = pdTips.getJPN_Name();
        if (jPN_Name != null) {
            sQLiteStatement.bindString(8, jPN_Name);
        }
        String kRN_Name = pdTips.getKRN_Name();
        if (kRN_Name != null) {
            sQLiteStatement.bindString(9, kRN_Name);
        }
        String dEN_Name = pdTips.getDEN_Name();
        if (dEN_Name != null) {
            sQLiteStatement.bindString(10, dEN_Name);
        }
        String fRN_Name = pdTips.getFRN_Name();
        if (fRN_Name != null) {
            sQLiteStatement.bindString(11, fRN_Name);
        }
        String eSO_Name = pdTips.getESO_Name();
        if (eSO_Name != null) {
            sQLiteStatement.bindString(12, eSO_Name);
        }
        String vTN_Name = pdTips.getVTN_Name();
        if (vTN_Name != null) {
            sQLiteStatement.bindString(13, vTN_Name);
        }
        String cHN_Tips = pdTips.getCHN_Tips();
        if (cHN_Tips != null) {
            sQLiteStatement.bindString(14, cHN_Tips);
        }
        String eNG_Tips = pdTips.getENG_Tips();
        if (eNG_Tips != null) {
            sQLiteStatement.bindString(15, eNG_Tips);
        }
        String jPN_Tips = pdTips.getJPN_Tips();
        if (jPN_Tips != null) {
            sQLiteStatement.bindString(16, jPN_Tips);
        }
        String kRN_Tips = pdTips.getKRN_Tips();
        if (kRN_Tips != null) {
            sQLiteStatement.bindString(17, kRN_Tips);
        }
        String dEN_Tips = pdTips.getDEN_Tips();
        if (dEN_Tips != null) {
            sQLiteStatement.bindString(18, dEN_Tips);
        }
        String fRN_Tips = pdTips.getFRN_Tips();
        if (fRN_Tips != null) {
            sQLiteStatement.bindString(19, fRN_Tips);
        }
        String eSO_Tips = pdTips.getESO_Tips();
        if (eSO_Tips != null) {
            sQLiteStatement.bindString(20, eSO_Tips);
        }
        String vTN_Tips = pdTips.getVTN_Tips();
        if (vTN_Tips != null) {
            sQLiteStatement.bindString(21, vTN_Tips);
        }
        Long cardTypeId = pdTips.getCardTypeId();
        if (cardTypeId != null) {
            sQLiteStatement.bindLong(22, cardTypeId.longValue());
        }
        String cardTypeName = pdTips.getCardTypeName();
        if (cardTypeName != null) {
            sQLiteStatement.bindString(23, cardTypeName);
        }
        String cardTypeTranCHN = pdTips.getCardTypeTranCHN();
        if (cardTypeTranCHN != null) {
            sQLiteStatement.bindString(24, cardTypeTranCHN);
        }
        String cardTypeTranENG = pdTips.getCardTypeTranENG();
        if (cardTypeTranENG != null) {
            sQLiteStatement.bindString(25, cardTypeTranENG);
        }
        String cardTypeTranJPN = pdTips.getCardTypeTranJPN();
        if (cardTypeTranJPN != null) {
            sQLiteStatement.bindString(26, cardTypeTranJPN);
        }
        String cardTypeTranKRN = pdTips.getCardTypeTranKRN();
        if (cardTypeTranKRN != null) {
            sQLiteStatement.bindString(27, cardTypeTranKRN);
        }
        String cardTypeTranDEN = pdTips.getCardTypeTranDEN();
        if (cardTypeTranDEN != null) {
            sQLiteStatement.bindString(28, cardTypeTranDEN);
        }
        String cardTypeTranFRN = pdTips.getCardTypeTranFRN();
        if (cardTypeTranFRN != null) {
            sQLiteStatement.bindString(29, cardTypeTranFRN);
        }
        String cardTypeTranESO = pdTips.getCardTypeTranESO();
        if (cardTypeTranESO != null) {
            sQLiteStatement.bindString(30, cardTypeTranESO);
        }
        String cardTypeTranVTN = pdTips.getCardTypeTranVTN();
        if (cardTypeTranVTN != null) {
            sQLiteStatement.bindString(31, cardTypeTranVTN);
        }
    }
}
