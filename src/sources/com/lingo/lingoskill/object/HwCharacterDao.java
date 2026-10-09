package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import fa.EQx.nuRcCS;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HwCharacterDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Character";
    private final kj.a AnimationTipsTranARAConverter;
    private final kj.a AnimationTipsTranCHNConverter;
    private final kj.a AnimationTipsTranDENConverter;
    private final kj.a AnimationTipsTranENGConverter;
    private final kj.a AnimationTipsTranFRNConverter;
    private final kj.a AnimationTipsTranHINDIConverter;
    private final kj.a AnimationTipsTranIDNConverter;
    private final kj.a AnimationTipsTranITNConverter;
    private final kj.a AnimationTipsTranJPNConverter;
    private final kj.a AnimationTipsTranKRNConverter;
    private final kj.a AnimationTipsTranPOLConverter;
    private final kj.a AnimationTipsTranPTGConverter;
    private final kj.a AnimationTipsTranRUSConverter;
    private final kj.a AnimationTipsTranSPNConverter;
    private final kj.a AnimationTipsTranTCHNConverter;
    private final kj.a AnimationTipsTranTHAIConverter;
    private final kj.a AnimationTipsTranTURConverter;
    private final kj.a AnimationTipsTranVTNConverter;
    private final kj.a CharPathConverter;
    private final kj.a CharacterConverter;
    private final kj.a PinyinConverter;
    private final kj.a TCharPathConverter;
    private final kj.a TCharacterConverter;
    private final kj.a TranARAConverter;
    private final kj.a TranCHNConverter;
    private final kj.a TranDENConverter;
    private final kj.a TranENGConverter;
    private final kj.a TranFRNConverter;
    private final kj.a TranHINDIConverter;
    private final kj.a TranIDNConverter;
    private final kj.a TranITNConverter;
    private final kj.a TranJPNConverter;
    private final kj.a TranKRNConverter;
    private final kj.a TranPOLConverter;
    private final kj.a TranPTGConverter;
    private final kj.a TranRUSConverter;
    private final kj.a TranSPNConverter;
    private final kj.a TranTCHNConverter;
    private final kj.a TranTHAIConverter;
    private final kj.a TranTURConverter;
    private final kj.a TranVTNConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Animation;
        public static final d AnimationTipsTranARA;
        public static final d AnimationTipsTranCHN;
        public static final d AnimationTipsTranDEN;
        public static final d AnimationTipsTranENG;
        public static final d AnimationTipsTranFRN;
        public static final d AnimationTipsTranHINDI;
        public static final d AnimationTipsTranIDN;
        public static final d AnimationTipsTranITN;
        public static final d AnimationTipsTranJPN;
        public static final d AnimationTipsTranKRN;
        public static final d AnimationTipsTranPOL;
        public static final d AnimationTipsTranPTG;
        public static final d AnimationTipsTranRUS;
        public static final d AnimationTipsTranSPN;
        public static final d AnimationTipsTranTCHN;
        public static final d AnimationTipsTranTHAI;
        public static final d AnimationTipsTranTUR;
        public static final d AnimationTipsTranVTN;
        public static final d CharIdInLGCharacter;
        public static final d LevelIndex;
        public static final d TranARA;
        public static final d TranCHN;
        public static final d TranDEN;
        public static final d TranENG;
        public static final d TranFRN;
        public static final d TranHINDI;
        public static final d TranIDN;
        public static final d TranITN;
        public static final d TranJPN;
        public static final d TranKRN;
        public static final d TranPOL;
        public static final d TranPTG;
        public static final d TranRUS;
        public static final d TranSPN;
        public static final d TranTCHN;
        public static final d TranTHAI;
        public static final d TranTUR;
        public static final d TranVTN;
        public static final d CharId = new d(0, Long.TYPE, "CharId", true, "CharId");
        public static final d Character = new d(1, String.class, HwCharacterDao.TABLENAME, false, HwCharacterDao.TABLENAME);
        public static final d TCharacter = new d(2, String.class, "TCharacter", false, "TCharacter");
        public static final d CharPath = new d(3, String.class, "CharPath", false, "CharPath");
        public static final d TCharPath = new d(4, String.class, "TCharPath", false, "TCharPath");
        public static final d Pinyin = new d(5, String.class, "Pinyin", false, "Pinyin");

        static {
            Class cls = Integer.TYPE;
            Animation = new d(6, cls, "Animation", false, "Animation");
            TranCHN = new d(7, String.class, "TranCHN", false, "TranCHN");
            TranTCHN = new d(8, String.class, "TranTCHN", false, "TranTCHN");
            TranJPN = new d(9, String.class, "TranJPN", false, "TranJPN");
            TranKRN = new d(10, String.class, "TranKRN", false, "TranKRN");
            TranENG = new d(11, String.class, "TranENG", false, "TranENG");
            TranSPN = new d(12, String.class, "TranSPN", false, "TranSPN");
            TranFRN = new d(13, String.class, "TranFRN", false, "TranFRN");
            TranDEN = new d(14, String.class, xTCJ.WHXUXcEZTNYohj, false, "TranDEN");
            TranITN = new d(15, String.class, "TranITN", false, "TranITN");
            TranPTG = new d(16, String.class, "TranPTG", false, "TranPTG");
            TranVTN = new d(17, String.class, "TranVTN", false, "TranVTN");
            TranRUS = new d(18, String.class, "TranRUS", false, "TranRUS");
            TranTUR = new d(19, String.class, "TranTUR", false, nuRcCS.lbFciILAz);
            TranIDN = new d(20, String.class, "TranIDN", false, "TranIDN");
            TranARA = new d(21, String.class, "TranARA", false, "TranARA");
            TranPOL = new d(22, String.class, "TranPOL", false, "TranPOL");
            TranTHAI = new d(23, String.class, "TranTHAI", false, "TranTHAI");
            TranHINDI = new d(24, String.class, "TranHINDI", false, "TranHINDI");
            AnimationTipsTranCHN = new d(25, String.class, "AnimationTipsTranCHN", false, "AnimationTipsTranCHN");
            AnimationTipsTranTCHN = new d(26, String.class, "AnimationTipsTranTCHN", false, "AnimationTipsTranTCHN");
            AnimationTipsTranJPN = new d(27, String.class, "AnimationTipsTranJPN", false, "AnimationTipsTranJPN");
            AnimationTipsTranKRN = new d(28, String.class, "AnimationTipsTranKRN", false, "AnimationTipsTranKRN");
            AnimationTipsTranENG = new d(29, String.class, "AnimationTipsTranENG", false, "AnimationTipsTranENG");
            AnimationTipsTranSPN = new d(30, String.class, "AnimationTipsTranSPN", false, "AnimationTipsTranSPN");
            AnimationTipsTranFRN = new d(31, String.class, "AnimationTipsTranFRN", false, "AnimationTipsTranFRN");
            AnimationTipsTranDEN = new d(32, String.class, "AnimationTipsTranDEN", false, "AnimationTipsTranDEN");
            AnimationTipsTranITN = new d(33, String.class, "AnimationTipsTranITN", false, "AnimationTipsTranITN");
            AnimationTipsTranPTG = new d(34, String.class, "AnimationTipsTranPTG", false, "AnimationTipsTranPTG");
            AnimationTipsTranVTN = new d(35, String.class, "AnimationTipsTranVTN", false, "AnimationTipsTranVTN");
            AnimationTipsTranRUS = new d(36, String.class, "AnimationTipsTranRUS", false, "AnimationTipsTranRUS");
            AnimationTipsTranTUR = new d(37, String.class, "AnimationTipsTranTUR", false, "AnimationTipsTranTUR");
            AnimationTipsTranIDN = new d(38, String.class, "AnimationTipsTranIDN", false, "AnimationTipsTranIDN");
            AnimationTipsTranARA = new d(39, String.class, "AnimationTipsTranARA", false, "AnimationTipsTranARA");
            AnimationTipsTranPOL = new d(40, String.class, "AnimationTipsTranPOL", false, "AnimationTipsTranPOL");
            AnimationTipsTranTHAI = new d(41, String.class, "AnimationTipsTranTHAI", false, "AnimationTipsTranTHAI");
            AnimationTipsTranHINDI = new d(42, String.class, "AnimationTipsTranHINDI", false, "AnimationTipsTranHINDI");
            LevelIndex = new d(43, cls, "LevelIndex", false, "LevelIndex");
            CharIdInLGCharacter = new d(44, cls, "CharIdInLGCharacter", false, "CharIdInLGCharacter");
        }
    }

    public HwCharacterDao(j10.a aVar) {
        super(aVar, null);
        this.CharacterConverter = new kj.a();
        this.TCharacterConverter = new kj.a();
        this.CharPathConverter = new kj.a();
        this.TCharPathConverter = new kj.a();
        this.PinyinConverter = new kj.a();
        this.TranCHNConverter = new kj.a();
        this.TranTCHNConverter = new kj.a();
        this.TranJPNConverter = new kj.a();
        this.TranKRNConverter = new kj.a();
        this.TranENGConverter = new kj.a();
        this.TranSPNConverter = new kj.a();
        this.TranFRNConverter = new kj.a();
        this.TranDENConverter = new kj.a();
        this.TranITNConverter = new kj.a();
        this.TranPTGConverter = new kj.a();
        this.TranVTNConverter = new kj.a();
        this.TranRUSConverter = new kj.a();
        this.TranTURConverter = new kj.a();
        this.TranIDNConverter = new kj.a();
        this.TranARAConverter = new kj.a();
        this.TranPOLConverter = new kj.a();
        this.TranTHAIConverter = new kj.a();
        this.TranHINDIConverter = new kj.a();
        this.AnimationTipsTranCHNConverter = new kj.a();
        this.AnimationTipsTranTCHNConverter = new kj.a();
        this.AnimationTipsTranJPNConverter = new kj.a();
        this.AnimationTipsTranKRNConverter = new kj.a();
        this.AnimationTipsTranENGConverter = new kj.a();
        this.AnimationTipsTranSPNConverter = new kj.a();
        this.AnimationTipsTranFRNConverter = new kj.a();
        this.AnimationTipsTranDENConverter = new kj.a();
        this.AnimationTipsTranITNConverter = new kj.a();
        this.AnimationTipsTranPTGConverter = new kj.a();
        this.AnimationTipsTranVTNConverter = new kj.a();
        this.AnimationTipsTranRUSConverter = new kj.a();
        this.AnimationTipsTranTURConverter = new kj.a();
        this.AnimationTipsTranIDNConverter = new kj.a();
        this.AnimationTipsTranARAConverter = new kj.a();
        this.AnimationTipsTranPOLConverter = new kj.a();
        this.AnimationTipsTranTHAIConverter = new kj.a();
        this.AnimationTipsTranHINDIConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(HwCharacter hwCharacter) {
        if (hwCharacter != null) {
            return Long.valueOf(hwCharacter.getCharId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(HwCharacter hwCharacter) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(HwCharacter hwCharacter, long j11) {
        hwCharacter.setCharId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, HwCharacter hwCharacter) {
        dVar.f();
        dVar.g(1, hwCharacter.getCharId());
        String character = hwCharacter.getCharacter();
        if (character != null) {
            com.google.android.material.datepicker.d.A(this.CharacterConverter, character, dVar, 2);
        }
        String tCharacter = hwCharacter.getTCharacter();
        if (tCharacter != null) {
            com.google.android.material.datepicker.d.A(this.TCharacterConverter, tCharacter, dVar, 3);
        }
        String charPath = hwCharacter.getCharPath();
        if (charPath != null) {
            com.google.android.material.datepicker.d.A(this.CharPathConverter, charPath, dVar, 4);
        }
        String tCharPath = hwCharacter.getTCharPath();
        if (tCharPath != null) {
            com.google.android.material.datepicker.d.A(this.TCharPathConverter, tCharPath, dVar, 5);
        }
        String pinyin = hwCharacter.getPinyin();
        if (pinyin != null) {
            com.google.android.material.datepicker.d.A(this.PinyinConverter, pinyin, dVar, 6);
        }
        dVar.g(7, hwCharacter.getAnimation());
        String tranCHN = hwCharacter.getTranCHN();
        if (tranCHN != null) {
            com.google.android.material.datepicker.d.A(this.TranCHNConverter, tranCHN, dVar, 8);
        }
        String tranTCHN = hwCharacter.getTranTCHN();
        if (tranTCHN != null) {
            com.google.android.material.datepicker.d.A(this.TranTCHNConverter, tranTCHN, dVar, 9);
        }
        String tranJPN = hwCharacter.getTranJPN();
        if (tranJPN != null) {
            com.google.android.material.datepicker.d.A(this.TranJPNConverter, tranJPN, dVar, 10);
        }
        String tranKRN = hwCharacter.getTranKRN();
        if (tranKRN != null) {
            com.google.android.material.datepicker.d.A(this.TranKRNConverter, tranKRN, dVar, 11);
        }
        String tranENG = hwCharacter.getTranENG();
        if (tranENG != null) {
            com.google.android.material.datepicker.d.A(this.TranENGConverter, tranENG, dVar, 12);
        }
        String tranSPN = hwCharacter.getTranSPN();
        if (tranSPN != null) {
            com.google.android.material.datepicker.d.A(this.TranSPNConverter, tranSPN, dVar, 13);
        }
        String tranFRN = hwCharacter.getTranFRN();
        if (tranFRN != null) {
            com.google.android.material.datepicker.d.A(this.TranFRNConverter, tranFRN, dVar, 14);
        }
        String tranDEN = hwCharacter.getTranDEN();
        if (tranDEN != null) {
            com.google.android.material.datepicker.d.A(this.TranDENConverter, tranDEN, dVar, 15);
        }
        String tranITN = hwCharacter.getTranITN();
        if (tranITN != null) {
            com.google.android.material.datepicker.d.A(this.TranITNConverter, tranITN, dVar, 16);
        }
        String tranPTG = hwCharacter.getTranPTG();
        if (tranPTG != null) {
            com.google.android.material.datepicker.d.A(this.TranPTGConverter, tranPTG, dVar, 17);
        }
        String tranVTN = hwCharacter.getTranVTN();
        if (tranVTN != null) {
            com.google.android.material.datepicker.d.A(this.TranVTNConverter, tranVTN, dVar, 18);
        }
        String tranRUS = hwCharacter.getTranRUS();
        if (tranRUS != null) {
            com.google.android.material.datepicker.d.A(this.TranRUSConverter, tranRUS, dVar, 19);
        }
        String tranTUR = hwCharacter.getTranTUR();
        if (tranTUR != null) {
            com.google.android.material.datepicker.d.A(this.TranTURConverter, tranTUR, dVar, 20);
        }
        String tranIDN = hwCharacter.getTranIDN();
        if (tranIDN != null) {
            com.google.android.material.datepicker.d.A(this.TranIDNConverter, tranIDN, dVar, 21);
        }
        String tranARA = hwCharacter.getTranARA();
        if (tranARA != null) {
            com.google.android.material.datepicker.d.A(this.TranARAConverter, tranARA, dVar, 22);
        }
        String tranPOL = hwCharacter.getTranPOL();
        if (tranPOL != null) {
            com.google.android.material.datepicker.d.A(this.TranPOLConverter, tranPOL, dVar, 23);
        }
        String tranTHAI = hwCharacter.getTranTHAI();
        if (tranTHAI != null) {
            com.google.android.material.datepicker.d.A(this.TranTHAIConverter, tranTHAI, dVar, 24);
        }
        String tranHINDI = hwCharacter.getTranHINDI();
        if (tranHINDI != null) {
            com.google.android.material.datepicker.d.A(this.TranHINDIConverter, tranHINDI, dVar, 25);
        }
        String animationTipsTranCHN = hwCharacter.getAnimationTipsTranCHN();
        if (animationTipsTranCHN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranCHNConverter, animationTipsTranCHN, dVar, 26);
        }
        String animationTipsTranTCHN = hwCharacter.getAnimationTipsTranTCHN();
        if (animationTipsTranTCHN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranTCHNConverter, animationTipsTranTCHN, dVar, 27);
        }
        String animationTipsTranJPN = hwCharacter.getAnimationTipsTranJPN();
        if (animationTipsTranJPN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranJPNConverter, animationTipsTranJPN, dVar, 28);
        }
        String animationTipsTranKRN = hwCharacter.getAnimationTipsTranKRN();
        if (animationTipsTranKRN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranKRNConverter, animationTipsTranKRN, dVar, 29);
        }
        String animationTipsTranENG = hwCharacter.getAnimationTipsTranENG();
        if (animationTipsTranENG != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranENGConverter, animationTipsTranENG, dVar, 30);
        }
        String animationTipsTranSPN = hwCharacter.getAnimationTipsTranSPN();
        if (animationTipsTranSPN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranSPNConverter, animationTipsTranSPN, dVar, 31);
        }
        String animationTipsTranFRN = hwCharacter.getAnimationTipsTranFRN();
        if (animationTipsTranFRN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranFRNConverter, animationTipsTranFRN, dVar, 32);
        }
        String animationTipsTranDEN = hwCharacter.getAnimationTipsTranDEN();
        if (animationTipsTranDEN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranDENConverter, animationTipsTranDEN, dVar, 33);
        }
        String animationTipsTranITN = hwCharacter.getAnimationTipsTranITN();
        if (animationTipsTranITN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranITNConverter, animationTipsTranITN, dVar, 34);
        }
        String animationTipsTranPTG = hwCharacter.getAnimationTipsTranPTG();
        if (animationTipsTranPTG != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranPTGConverter, animationTipsTranPTG, dVar, 35);
        }
        String animationTipsTranVTN = hwCharacter.getAnimationTipsTranVTN();
        if (animationTipsTranVTN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranVTNConverter, animationTipsTranVTN, dVar, 36);
        }
        String animationTipsTranRUS = hwCharacter.getAnimationTipsTranRUS();
        if (animationTipsTranRUS != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranRUSConverter, animationTipsTranRUS, dVar, 37);
        }
        String animationTipsTranTUR = hwCharacter.getAnimationTipsTranTUR();
        if (animationTipsTranTUR != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranTURConverter, animationTipsTranTUR, dVar, 38);
        }
        String animationTipsTranIDN = hwCharacter.getAnimationTipsTranIDN();
        if (animationTipsTranIDN != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranIDNConverter, animationTipsTranIDN, dVar, 39);
        }
        String animationTipsTranARA = hwCharacter.getAnimationTipsTranARA();
        if (animationTipsTranARA != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranARAConverter, animationTipsTranARA, dVar, 40);
        }
        String animationTipsTranPOL = hwCharacter.getAnimationTipsTranPOL();
        if (animationTipsTranPOL != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranPOLConverter, animationTipsTranPOL, dVar, 41);
        }
        String animationTipsTranTHAI = hwCharacter.getAnimationTipsTranTHAI();
        if (animationTipsTranTHAI != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranTHAIConverter, animationTipsTranTHAI, dVar, 42);
        }
        String animationTipsTranHINDI = hwCharacter.getAnimationTipsTranHINDI();
        if (animationTipsTranHINDI != null) {
            com.google.android.material.datepicker.d.A(this.AnimationTipsTranHINDIConverter, animationTipsTranHINDI, dVar, 43);
        }
        dVar.g(44, hwCharacter.getLevelIndex());
        dVar.g(45, hwCharacter.getCharIdInLGCharacter());
    }

    @Override // org.greenrobot.greendao.a
    public HwCharacter readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        String strJ = cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.CharacterConverter);
        int i13 = i11 + 2;
        String strJ2 = cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TCharacterConverter);
        int i14 = i11 + 3;
        String strJ3 = cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.CharPathConverter);
        int i15 = i11 + 4;
        String strJ4 = cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TCharPathConverter);
        int i16 = i11 + 5;
        String strJ5 = cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.PinyinConverter);
        int i17 = cursor.getInt(i11 + 6);
        int i18 = i11 + 7;
        String strJ6 = cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.TranCHNConverter);
        int i19 = i11 + 8;
        String strJ7 = cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.TranTCHNConverter);
        int i21 = i11 + 9;
        String strJ8 = cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.TranJPNConverter);
        int i22 = i11 + 10;
        String strJ9 = cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.TranKRNConverter);
        int i23 = i11 + 11;
        String strJ10 = cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.TranENGConverter);
        int i24 = i11 + 12;
        String strJ11 = cursor.isNull(i24) ? null : com.google.android.material.datepicker.d.j(cursor, i24, this.TranSPNConverter);
        int i25 = i11 + 13;
        String strJ12 = cursor.isNull(i25) ? null : com.google.android.material.datepicker.d.j(cursor, i25, this.TranFRNConverter);
        int i26 = i11 + 14;
        String strJ13 = cursor.isNull(i26) ? null : com.google.android.material.datepicker.d.j(cursor, i26, this.TranDENConverter);
        int i27 = i11 + 15;
        String strJ14 = cursor.isNull(i27) ? null : com.google.android.material.datepicker.d.j(cursor, i27, this.TranITNConverter);
        int i28 = i11 + 16;
        String strJ15 = cursor.isNull(i28) ? null : com.google.android.material.datepicker.d.j(cursor, i28, this.TranPTGConverter);
        int i29 = i11 + 17;
        String strJ16 = cursor.isNull(i29) ? null : com.google.android.material.datepicker.d.j(cursor, i29, this.TranVTNConverter);
        int i30 = i11 + 18;
        String strJ17 = cursor.isNull(i30) ? null : com.google.android.material.datepicker.d.j(cursor, i30, this.TranRUSConverter);
        int i31 = i11 + 19;
        String strJ18 = cursor.isNull(i31) ? null : com.google.android.material.datepicker.d.j(cursor, i31, this.TranTURConverter);
        int i32 = i11 + 20;
        String strJ19 = cursor.isNull(i32) ? null : com.google.android.material.datepicker.d.j(cursor, i32, this.TranIDNConverter);
        int i33 = i11 + 21;
        String strJ20 = cursor.isNull(i33) ? null : com.google.android.material.datepicker.d.j(cursor, i33, this.TranARAConverter);
        int i34 = i11 + 22;
        String strJ21 = cursor.isNull(i34) ? null : com.google.android.material.datepicker.d.j(cursor, i34, this.TranPOLConverter);
        int i35 = i11 + 23;
        String strJ22 = cursor.isNull(i35) ? null : com.google.android.material.datepicker.d.j(cursor, i35, this.TranTHAIConverter);
        int i36 = i11 + 24;
        String strJ23 = cursor.isNull(i36) ? null : com.google.android.material.datepicker.d.j(cursor, i36, this.TranHINDIConverter);
        int i37 = i11 + 25;
        String strJ24 = cursor.isNull(i37) ? null : com.google.android.material.datepicker.d.j(cursor, i37, this.AnimationTipsTranCHNConverter);
        int i38 = i11 + 26;
        String strJ25 = cursor.isNull(i38) ? null : com.google.android.material.datepicker.d.j(cursor, i38, this.AnimationTipsTranTCHNConverter);
        int i39 = i11 + 27;
        String strJ26 = cursor.isNull(i39) ? null : com.google.android.material.datepicker.d.j(cursor, i39, this.AnimationTipsTranJPNConverter);
        int i40 = i11 + 28;
        String strJ27 = cursor.isNull(i40) ? null : com.google.android.material.datepicker.d.j(cursor, i40, this.AnimationTipsTranKRNConverter);
        int i41 = i11 + 29;
        String strJ28 = cursor.isNull(i41) ? null : com.google.android.material.datepicker.d.j(cursor, i41, this.AnimationTipsTranENGConverter);
        int i42 = i11 + 30;
        String strJ29 = cursor.isNull(i42) ? null : com.google.android.material.datepicker.d.j(cursor, i42, this.AnimationTipsTranSPNConverter);
        int i43 = i11 + 31;
        String strJ30 = cursor.isNull(i43) ? null : com.google.android.material.datepicker.d.j(cursor, i43, this.AnimationTipsTranFRNConverter);
        int i44 = i11 + 32;
        String strJ31 = cursor.isNull(i44) ? null : com.google.android.material.datepicker.d.j(cursor, i44, this.AnimationTipsTranDENConverter);
        int i45 = i11 + 33;
        String strJ32 = cursor.isNull(i45) ? null : com.google.android.material.datepicker.d.j(cursor, i45, this.AnimationTipsTranITNConverter);
        int i46 = i11 + 34;
        String strJ33 = cursor.isNull(i46) ? null : com.google.android.material.datepicker.d.j(cursor, i46, this.AnimationTipsTranPTGConverter);
        int i47 = i11 + 35;
        String strJ34 = cursor.isNull(i47) ? null : com.google.android.material.datepicker.d.j(cursor, i47, this.AnimationTipsTranVTNConverter);
        int i48 = i11 + 36;
        String strJ35 = cursor.isNull(i48) ? null : com.google.android.material.datepicker.d.j(cursor, i48, this.AnimationTipsTranRUSConverter);
        int i49 = i11 + 37;
        String strJ36 = cursor.isNull(i49) ? null : com.google.android.material.datepicker.d.j(cursor, i49, this.AnimationTipsTranTURConverter);
        int i50 = i11 + 38;
        String strJ37 = cursor.isNull(i50) ? null : com.google.android.material.datepicker.d.j(cursor, i50, this.AnimationTipsTranIDNConverter);
        int i51 = i11 + 39;
        String strJ38 = cursor.isNull(i51) ? null : com.google.android.material.datepicker.d.j(cursor, i51, this.AnimationTipsTranARAConverter);
        int i52 = i11 + 40;
        String strJ39 = cursor.isNull(i52) ? null : com.google.android.material.datepicker.d.j(cursor, i52, this.AnimationTipsTranPOLConverter);
        int i53 = i11 + 41;
        String strJ40 = cursor.isNull(i53) ? null : com.google.android.material.datepicker.d.j(cursor, i53, this.AnimationTipsTranTHAIConverter);
        int i54 = i11 + 42;
        return new HwCharacter(j11, strJ, strJ2, strJ3, strJ4, strJ5, i17, strJ6, strJ7, strJ8, strJ9, strJ10, strJ11, strJ12, strJ13, strJ14, strJ15, strJ16, strJ17, strJ18, strJ19, strJ20, strJ21, strJ22, strJ23, strJ24, strJ25, strJ26, strJ27, strJ28, strJ29, strJ30, strJ31, strJ32, strJ33, strJ34, strJ35, strJ36, strJ37, strJ38, strJ39, strJ40, cursor.isNull(i54) ? null : com.google.android.material.datepicker.d.j(cursor, i54, this.AnimationTipsTranHINDIConverter), cursor.getInt(i11 + 43), cursor.getInt(i11 + 44));
    }

    public HwCharacterDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.CharacterConverter = new kj.a();
        this.TCharacterConverter = new kj.a();
        this.CharPathConverter = new kj.a();
        this.TCharPathConverter = new kj.a();
        this.PinyinConverter = new kj.a();
        this.TranCHNConverter = new kj.a();
        this.TranTCHNConverter = new kj.a();
        this.TranJPNConverter = new kj.a();
        this.TranKRNConverter = new kj.a();
        this.TranENGConverter = new kj.a();
        this.TranSPNConverter = new kj.a();
        this.TranFRNConverter = new kj.a();
        this.TranDENConverter = new kj.a();
        this.TranITNConverter = new kj.a();
        this.TranPTGConverter = new kj.a();
        this.TranVTNConverter = new kj.a();
        this.TranRUSConverter = new kj.a();
        this.TranTURConverter = new kj.a();
        this.TranIDNConverter = new kj.a();
        this.TranARAConverter = new kj.a();
        this.TranPOLConverter = new kj.a();
        this.TranTHAIConverter = new kj.a();
        this.TranHINDIConverter = new kj.a();
        this.AnimationTipsTranCHNConverter = new kj.a();
        this.AnimationTipsTranTCHNConverter = new kj.a();
        this.AnimationTipsTranJPNConverter = new kj.a();
        this.AnimationTipsTranKRNConverter = new kj.a();
        this.AnimationTipsTranENGConverter = new kj.a();
        this.AnimationTipsTranSPNConverter = new kj.a();
        this.AnimationTipsTranFRNConverter = new kj.a();
        this.AnimationTipsTranDENConverter = new kj.a();
        this.AnimationTipsTranITNConverter = new kj.a();
        this.AnimationTipsTranPTGConverter = new kj.a();
        this.AnimationTipsTranVTNConverter = new kj.a();
        this.AnimationTipsTranRUSConverter = new kj.a();
        this.AnimationTipsTranTURConverter = new kj.a();
        this.AnimationTipsTranIDNConverter = new kj.a();
        this.AnimationTipsTranARAConverter = new kj.a();
        this.AnimationTipsTranPOLConverter = new kj.a();
        this.AnimationTipsTranTHAIConverter = new kj.a();
        this.AnimationTipsTranHINDIConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, HwCharacter hwCharacter, int i11) {
        hwCharacter.setCharId(cursor.getLong(i11));
        int i12 = i11 + 1;
        hwCharacter.setCharacter(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.CharacterConverter));
        int i13 = i11 + 2;
        hwCharacter.setTCharacter(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TCharacterConverter));
        int i14 = i11 + 3;
        hwCharacter.setCharPath(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.CharPathConverter));
        int i15 = i11 + 4;
        hwCharacter.setTCharPath(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TCharPathConverter));
        int i16 = i11 + 5;
        hwCharacter.setPinyin(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.PinyinConverter));
        hwCharacter.setAnimation(cursor.getInt(i11 + 6));
        int i17 = i11 + 7;
        hwCharacter.setTranCHN(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.TranCHNConverter));
        int i18 = i11 + 8;
        hwCharacter.setTranTCHN(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.TranTCHNConverter));
        int i19 = i11 + 9;
        hwCharacter.setTranJPN(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.TranJPNConverter));
        int i21 = i11 + 10;
        hwCharacter.setTranKRN(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.TranKRNConverter));
        int i22 = i11 + 11;
        hwCharacter.setTranENG(cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.TranENGConverter));
        int i23 = i11 + 12;
        hwCharacter.setTranSPN(cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.TranSPNConverter));
        int i24 = i11 + 13;
        hwCharacter.setTranFRN(cursor.isNull(i24) ? null : com.google.android.material.datepicker.d.j(cursor, i24, this.TranFRNConverter));
        int i25 = i11 + 14;
        hwCharacter.setTranDEN(cursor.isNull(i25) ? null : com.google.android.material.datepicker.d.j(cursor, i25, this.TranDENConverter));
        int i26 = i11 + 15;
        hwCharacter.setTranITN(cursor.isNull(i26) ? null : com.google.android.material.datepicker.d.j(cursor, i26, this.TranITNConverter));
        int i27 = i11 + 16;
        hwCharacter.setTranPTG(cursor.isNull(i27) ? null : com.google.android.material.datepicker.d.j(cursor, i27, this.TranPTGConverter));
        int i28 = i11 + 17;
        hwCharacter.setTranVTN(cursor.isNull(i28) ? null : com.google.android.material.datepicker.d.j(cursor, i28, this.TranVTNConverter));
        int i29 = i11 + 18;
        hwCharacter.setTranRUS(cursor.isNull(i29) ? null : com.google.android.material.datepicker.d.j(cursor, i29, this.TranRUSConverter));
        int i30 = i11 + 19;
        hwCharacter.setTranTUR(cursor.isNull(i30) ? null : com.google.android.material.datepicker.d.j(cursor, i30, this.TranTURConverter));
        int i31 = i11 + 20;
        hwCharacter.setTranIDN(cursor.isNull(i31) ? null : com.google.android.material.datepicker.d.j(cursor, i31, this.TranIDNConverter));
        int i32 = i11 + 21;
        hwCharacter.setTranARA(cursor.isNull(i32) ? null : com.google.android.material.datepicker.d.j(cursor, i32, this.TranARAConverter));
        int i33 = i11 + 22;
        hwCharacter.setTranPOL(cursor.isNull(i33) ? null : com.google.android.material.datepicker.d.j(cursor, i33, this.TranPOLConverter));
        int i34 = i11 + 23;
        hwCharacter.setTranTHAI(cursor.isNull(i34) ? null : com.google.android.material.datepicker.d.j(cursor, i34, this.TranTHAIConverter));
        int i35 = i11 + 24;
        hwCharacter.setTranHINDI(cursor.isNull(i35) ? null : com.google.android.material.datepicker.d.j(cursor, i35, this.TranHINDIConverter));
        int i36 = i11 + 25;
        hwCharacter.setAnimationTipsTranCHN(cursor.isNull(i36) ? null : com.google.android.material.datepicker.d.j(cursor, i36, this.AnimationTipsTranCHNConverter));
        int i37 = i11 + 26;
        hwCharacter.setAnimationTipsTranTCHN(cursor.isNull(i37) ? null : com.google.android.material.datepicker.d.j(cursor, i37, this.AnimationTipsTranTCHNConverter));
        int i38 = i11 + 27;
        hwCharacter.setAnimationTipsTranJPN(cursor.isNull(i38) ? null : com.google.android.material.datepicker.d.j(cursor, i38, this.AnimationTipsTranJPNConverter));
        int i39 = i11 + 28;
        hwCharacter.setAnimationTipsTranKRN(cursor.isNull(i39) ? null : com.google.android.material.datepicker.d.j(cursor, i39, this.AnimationTipsTranKRNConverter));
        int i40 = i11 + 29;
        hwCharacter.setAnimationTipsTranENG(cursor.isNull(i40) ? null : com.google.android.material.datepicker.d.j(cursor, i40, this.AnimationTipsTranENGConverter));
        int i41 = i11 + 30;
        hwCharacter.setAnimationTipsTranSPN(cursor.isNull(i41) ? null : com.google.android.material.datepicker.d.j(cursor, i41, this.AnimationTipsTranSPNConverter));
        int i42 = i11 + 31;
        hwCharacter.setAnimationTipsTranFRN(cursor.isNull(i42) ? null : com.google.android.material.datepicker.d.j(cursor, i42, this.AnimationTipsTranFRNConverter));
        int i43 = i11 + 32;
        hwCharacter.setAnimationTipsTranDEN(cursor.isNull(i43) ? null : com.google.android.material.datepicker.d.j(cursor, i43, this.AnimationTipsTranDENConverter));
        int i44 = i11 + 33;
        hwCharacter.setAnimationTipsTranITN(cursor.isNull(i44) ? null : com.google.android.material.datepicker.d.j(cursor, i44, this.AnimationTipsTranITNConverter));
        int i45 = i11 + 34;
        hwCharacter.setAnimationTipsTranPTG(cursor.isNull(i45) ? null : com.google.android.material.datepicker.d.j(cursor, i45, this.AnimationTipsTranPTGConverter));
        int i46 = i11 + 35;
        hwCharacter.setAnimationTipsTranVTN(cursor.isNull(i46) ? null : com.google.android.material.datepicker.d.j(cursor, i46, this.AnimationTipsTranVTNConverter));
        int i47 = i11 + 36;
        hwCharacter.setAnimationTipsTranRUS(cursor.isNull(i47) ? null : com.google.android.material.datepicker.d.j(cursor, i47, this.AnimationTipsTranRUSConverter));
        int i48 = i11 + 37;
        hwCharacter.setAnimationTipsTranTUR(cursor.isNull(i48) ? null : com.google.android.material.datepicker.d.j(cursor, i48, this.AnimationTipsTranTURConverter));
        int i49 = i11 + 38;
        hwCharacter.setAnimationTipsTranIDN(cursor.isNull(i49) ? null : com.google.android.material.datepicker.d.j(cursor, i49, this.AnimationTipsTranIDNConverter));
        int i50 = i11 + 39;
        hwCharacter.setAnimationTipsTranARA(cursor.isNull(i50) ? null : com.google.android.material.datepicker.d.j(cursor, i50, this.AnimationTipsTranARAConverter));
        int i51 = i11 + 40;
        hwCharacter.setAnimationTipsTranPOL(cursor.isNull(i51) ? null : com.google.android.material.datepicker.d.j(cursor, i51, this.AnimationTipsTranPOLConverter));
        int i52 = i11 + 41;
        hwCharacter.setAnimationTipsTranTHAI(cursor.isNull(i52) ? null : com.google.android.material.datepicker.d.j(cursor, i52, this.AnimationTipsTranTHAIConverter));
        int i53 = i11 + 42;
        hwCharacter.setAnimationTipsTranHINDI(cursor.isNull(i53) ? null : com.google.android.material.datepicker.d.j(cursor, i53, this.AnimationTipsTranHINDIConverter));
        hwCharacter.setLevelIndex(cursor.getInt(i11 + 43));
        hwCharacter.setCharIdInLGCharacter(cursor.getInt(i11 + 44));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, HwCharacter hwCharacter) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, hwCharacter.getCharId());
        String character = hwCharacter.getCharacter();
        if (character != null) {
            com.google.android.material.datepicker.d.z(this.CharacterConverter, character, sQLiteStatement, 2);
        }
        String tCharacter = hwCharacter.getTCharacter();
        if (tCharacter != null) {
            com.google.android.material.datepicker.d.z(this.TCharacterConverter, tCharacter, sQLiteStatement, 3);
        }
        String charPath = hwCharacter.getCharPath();
        if (charPath != null) {
            com.google.android.material.datepicker.d.z(this.CharPathConverter, charPath, sQLiteStatement, 4);
        }
        String tCharPath = hwCharacter.getTCharPath();
        if (tCharPath != null) {
            com.google.android.material.datepicker.d.z(this.TCharPathConverter, tCharPath, sQLiteStatement, 5);
        }
        String pinyin = hwCharacter.getPinyin();
        if (pinyin != null) {
            com.google.android.material.datepicker.d.z(this.PinyinConverter, pinyin, sQLiteStatement, 6);
        }
        sQLiteStatement.bindLong(7, hwCharacter.getAnimation());
        String tranCHN = hwCharacter.getTranCHN();
        if (tranCHN != null) {
            com.google.android.material.datepicker.d.z(this.TranCHNConverter, tranCHN, sQLiteStatement, 8);
        }
        String tranTCHN = hwCharacter.getTranTCHN();
        if (tranTCHN != null) {
            com.google.android.material.datepicker.d.z(this.TranTCHNConverter, tranTCHN, sQLiteStatement, 9);
        }
        String tranJPN = hwCharacter.getTranJPN();
        if (tranJPN != null) {
            com.google.android.material.datepicker.d.z(this.TranJPNConverter, tranJPN, sQLiteStatement, 10);
        }
        String tranKRN = hwCharacter.getTranKRN();
        if (tranKRN != null) {
            com.google.android.material.datepicker.d.z(this.TranKRNConverter, tranKRN, sQLiteStatement, 11);
        }
        String tranENG = hwCharacter.getTranENG();
        if (tranENG != null) {
            com.google.android.material.datepicker.d.z(this.TranENGConverter, tranENG, sQLiteStatement, 12);
        }
        String tranSPN = hwCharacter.getTranSPN();
        if (tranSPN != null) {
            com.google.android.material.datepicker.d.z(this.TranSPNConverter, tranSPN, sQLiteStatement, 13);
        }
        String tranFRN = hwCharacter.getTranFRN();
        if (tranFRN != null) {
            com.google.android.material.datepicker.d.z(this.TranFRNConverter, tranFRN, sQLiteStatement, 14);
        }
        String tranDEN = hwCharacter.getTranDEN();
        if (tranDEN != null) {
            com.google.android.material.datepicker.d.z(this.TranDENConverter, tranDEN, sQLiteStatement, 15);
        }
        String tranITN = hwCharacter.getTranITN();
        if (tranITN != null) {
            com.google.android.material.datepicker.d.z(this.TranITNConverter, tranITN, sQLiteStatement, 16);
        }
        String tranPTG = hwCharacter.getTranPTG();
        if (tranPTG != null) {
            com.google.android.material.datepicker.d.z(this.TranPTGConverter, tranPTG, sQLiteStatement, 17);
        }
        String tranVTN = hwCharacter.getTranVTN();
        if (tranVTN != null) {
            com.google.android.material.datepicker.d.z(this.TranVTNConverter, tranVTN, sQLiteStatement, 18);
        }
        String tranRUS = hwCharacter.getTranRUS();
        if (tranRUS != null) {
            com.google.android.material.datepicker.d.z(this.TranRUSConverter, tranRUS, sQLiteStatement, 19);
        }
        String tranTUR = hwCharacter.getTranTUR();
        if (tranTUR != null) {
            com.google.android.material.datepicker.d.z(this.TranTURConverter, tranTUR, sQLiteStatement, 20);
        }
        String tranIDN = hwCharacter.getTranIDN();
        if (tranIDN != null) {
            com.google.android.material.datepicker.d.z(this.TranIDNConverter, tranIDN, sQLiteStatement, 21);
        }
        String tranARA = hwCharacter.getTranARA();
        if (tranARA != null) {
            com.google.android.material.datepicker.d.z(this.TranARAConverter, tranARA, sQLiteStatement, 22);
        }
        String tranPOL = hwCharacter.getTranPOL();
        if (tranPOL != null) {
            com.google.android.material.datepicker.d.z(this.TranPOLConverter, tranPOL, sQLiteStatement, 23);
        }
        String tranTHAI = hwCharacter.getTranTHAI();
        if (tranTHAI != null) {
            com.google.android.material.datepicker.d.z(this.TranTHAIConverter, tranTHAI, sQLiteStatement, 24);
        }
        String tranHINDI = hwCharacter.getTranHINDI();
        if (tranHINDI != null) {
            com.google.android.material.datepicker.d.z(this.TranHINDIConverter, tranHINDI, sQLiteStatement, 25);
        }
        String animationTipsTranCHN = hwCharacter.getAnimationTipsTranCHN();
        if (animationTipsTranCHN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranCHNConverter, animationTipsTranCHN, sQLiteStatement, 26);
        }
        String animationTipsTranTCHN = hwCharacter.getAnimationTipsTranTCHN();
        if (animationTipsTranTCHN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranTCHNConverter, animationTipsTranTCHN, sQLiteStatement, 27);
        }
        String animationTipsTranJPN = hwCharacter.getAnimationTipsTranJPN();
        if (animationTipsTranJPN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranJPNConverter, animationTipsTranJPN, sQLiteStatement, 28);
        }
        String animationTipsTranKRN = hwCharacter.getAnimationTipsTranKRN();
        if (animationTipsTranKRN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranKRNConverter, animationTipsTranKRN, sQLiteStatement, 29);
        }
        String animationTipsTranENG = hwCharacter.getAnimationTipsTranENG();
        if (animationTipsTranENG != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranENGConverter, animationTipsTranENG, sQLiteStatement, 30);
        }
        String animationTipsTranSPN = hwCharacter.getAnimationTipsTranSPN();
        if (animationTipsTranSPN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranSPNConverter, animationTipsTranSPN, sQLiteStatement, 31);
        }
        String animationTipsTranFRN = hwCharacter.getAnimationTipsTranFRN();
        if (animationTipsTranFRN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranFRNConverter, animationTipsTranFRN, sQLiteStatement, 32);
        }
        String animationTipsTranDEN = hwCharacter.getAnimationTipsTranDEN();
        if (animationTipsTranDEN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranDENConverter, animationTipsTranDEN, sQLiteStatement, 33);
        }
        String animationTipsTranITN = hwCharacter.getAnimationTipsTranITN();
        if (animationTipsTranITN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranITNConverter, animationTipsTranITN, sQLiteStatement, 34);
        }
        String animationTipsTranPTG = hwCharacter.getAnimationTipsTranPTG();
        if (animationTipsTranPTG != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranPTGConverter, animationTipsTranPTG, sQLiteStatement, 35);
        }
        String animationTipsTranVTN = hwCharacter.getAnimationTipsTranVTN();
        if (animationTipsTranVTN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranVTNConverter, animationTipsTranVTN, sQLiteStatement, 36);
        }
        String animationTipsTranRUS = hwCharacter.getAnimationTipsTranRUS();
        if (animationTipsTranRUS != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranRUSConverter, animationTipsTranRUS, sQLiteStatement, 37);
        }
        String animationTipsTranTUR = hwCharacter.getAnimationTipsTranTUR();
        if (animationTipsTranTUR != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranTURConverter, animationTipsTranTUR, sQLiteStatement, 38);
        }
        String animationTipsTranIDN = hwCharacter.getAnimationTipsTranIDN();
        if (animationTipsTranIDN != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranIDNConverter, animationTipsTranIDN, sQLiteStatement, 39);
        }
        String animationTipsTranARA = hwCharacter.getAnimationTipsTranARA();
        if (animationTipsTranARA != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranARAConverter, animationTipsTranARA, sQLiteStatement, 40);
        }
        String animationTipsTranPOL = hwCharacter.getAnimationTipsTranPOL();
        if (animationTipsTranPOL != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranPOLConverter, animationTipsTranPOL, sQLiteStatement, 41);
        }
        String animationTipsTranTHAI = hwCharacter.getAnimationTipsTranTHAI();
        if (animationTipsTranTHAI != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranTHAIConverter, animationTipsTranTHAI, sQLiteStatement, 42);
        }
        String animationTipsTranHINDI = hwCharacter.getAnimationTipsTranHINDI();
        if (animationTipsTranHINDI != null) {
            com.google.android.material.datepicker.d.z(this.AnimationTipsTranHINDIConverter, animationTipsTranHINDI, sQLiteStatement, 43);
        }
        sQLiteStatement.bindLong(44, hwCharacter.getLevelIndex());
        sQLiteStatement.bindLong(45, hwCharacter.getCharIdInLGCharacter());
    }
}
