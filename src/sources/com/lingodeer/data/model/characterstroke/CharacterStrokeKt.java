package com.lingodeer.data.model.characterstroke;

import com.lingodeer.database.model.CharacterStrokeEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CharacterStrokeKt {
    public static final CharacterStrokeEntity asEntityModel(CharacterStroke characterStroke) {
        m.f(characterStroke, "<this>");
        return new CharacterStrokeEntity(characterStroke.getCharId(), new a(characterStroke.getCharacter()), new a(characterStroke.getZhuyin()), new a(characterStroke.getPinyin()), new a(characterStroke.getLuoma()), new a(characterStroke.getStrokeData()), Integer.valueOf(characterStroke.getVersion()), new a(characterStroke.getTranCHN()), new a(characterStroke.getTranTCHN()), new a(characterStroke.getTranJPN()), new a(characterStroke.getTranKRN()), new a(characterStroke.getTranENG()), new a(characterStroke.getTranSPN()), new a(characterStroke.getTranFRN()), new a(characterStroke.getTranDEN()), new a(characterStroke.getTranITN()), new a(characterStroke.getTranPTG()), new a(characterStroke.getTranVTN()), new a(characterStroke.getTranRUS()), new a(characterStroke.getTranTUR()), new a(characterStroke.getTranIDN()), new a(characterStroke.getTranARA()), new a(characterStroke.getTranPOL()), new a(characterStroke.getTranTHAI()), new a(characterStroke.getTranHINDI()));
    }

    public static final CharacterStroke asExternalModel(CharacterStrokeEntity characterStrokeEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        m.f(characterStrokeEntity, "<this>");
        long charId = characterStrokeEntity.getCharId();
        a character = characterStrokeEntity.getCharacter();
        if (character == null || (str = character.f59371a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        a zhuyin = characterStrokeEntity.getZhuyin();
        if (zhuyin == null || (str2 = zhuyin.f59371a) == null) {
            str2 = BuildConfig.VERSION_NAME;
        }
        a pinyin = characterStrokeEntity.getPinyin();
        if (pinyin == null || (str3 = pinyin.f59371a) == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        a luoma = characterStrokeEntity.getLuoma();
        if (luoma == null || (str4 = luoma.f59371a) == null) {
            str4 = BuildConfig.VERSION_NAME;
        }
        a strokeData = characterStrokeEntity.getStrokeData();
        if (strokeData == null || (str5 = strokeData.f59371a) == null) {
            str5 = BuildConfig.VERSION_NAME;
        }
        Integer version = characterStrokeEntity.getVersion();
        int iIntValue = version != null ? version.intValue() : 0;
        a tranCHN = characterStrokeEntity.getTranCHN();
        if (tranCHN == null || (str6 = tranCHN.f59371a) == null) {
            str6 = BuildConfig.VERSION_NAME;
        }
        a tranTCHN = characterStrokeEntity.getTranTCHN();
        if (tranTCHN == null || (str7 = tranTCHN.f59371a) == null) {
            str7 = BuildConfig.VERSION_NAME;
        }
        a tranJPN = characterStrokeEntity.getTranJPN();
        if (tranJPN == null || (str8 = tranJPN.f59371a) == null) {
            str8 = BuildConfig.VERSION_NAME;
        }
        a tranKRN = characterStrokeEntity.getTranKRN();
        if (tranKRN == null || (str9 = tranKRN.f59371a) == null) {
            str9 = BuildConfig.VERSION_NAME;
        }
        a tranENG = characterStrokeEntity.getTranENG();
        if (tranENG == null || (str10 = tranENG.f59371a) == null) {
            str10 = BuildConfig.VERSION_NAME;
        }
        a tranSPN = characterStrokeEntity.getTranSPN();
        if (tranSPN == null || (str11 = tranSPN.f59371a) == null) {
            str11 = BuildConfig.VERSION_NAME;
        }
        String str26 = str;
        a tranFRN = characterStrokeEntity.getTranFRN();
        String str27 = (tranFRN == null || (str25 = tranFRN.f59371a) == null) ? BuildConfig.VERSION_NAME : str25;
        a tranDEN = characterStrokeEntity.getTranDEN();
        String str28 = (tranDEN == null || (str24 = tranDEN.f59371a) == null) ? BuildConfig.VERSION_NAME : str24;
        a tranITN = characterStrokeEntity.getTranITN();
        String str29 = (tranITN == null || (str23 = tranITN.f59371a) == null) ? BuildConfig.VERSION_NAME : str23;
        a tranPTG = characterStrokeEntity.getTranPTG();
        String str30 = (tranPTG == null || (str22 = tranPTG.f59371a) == null) ? BuildConfig.VERSION_NAME : str22;
        a tranVTN = characterStrokeEntity.getTranVTN();
        String str31 = (tranVTN == null || (str21 = tranVTN.f59371a) == null) ? BuildConfig.VERSION_NAME : str21;
        a tranRUS = characterStrokeEntity.getTranRUS();
        String str32 = (tranRUS == null || (str20 = tranRUS.f59371a) == null) ? BuildConfig.VERSION_NAME : str20;
        a tranTUR = characterStrokeEntity.getTranTUR();
        String str33 = (tranTUR == null || (str19 = tranTUR.f59371a) == null) ? BuildConfig.VERSION_NAME : str19;
        a tranIDN = characterStrokeEntity.getTranIDN();
        String str34 = (tranIDN == null || (str18 = tranIDN.f59371a) == null) ? BuildConfig.VERSION_NAME : str18;
        a tranARA = characterStrokeEntity.getTranARA();
        String str35 = (tranARA == null || (str17 = tranARA.f59371a) == null) ? BuildConfig.VERSION_NAME : str17;
        a tranPOL = characterStrokeEntity.getTranPOL();
        String str36 = (tranPOL == null || (str16 = tranPOL.f59371a) == null) ? BuildConfig.VERSION_NAME : str16;
        a tranTHAI = characterStrokeEntity.getTranTHAI();
        String str37 = (tranTHAI == null || (str15 = tranTHAI.f59371a) == null) ? BuildConfig.VERSION_NAME : str15;
        a tranHINDI = characterStrokeEntity.getTranHINDI();
        if (tranHINDI == null || (str14 = tranHINDI.f59371a) == null) {
            String str38 = str37;
            str12 = BuildConfig.VERSION_NAME;
            str13 = str38;
        } else {
            str13 = str37;
            str12 = str14;
        }
        return new CharacterStroke(charId, str26, str2, str3, str4, str5, iIntValue, str6, str7, str8, str9, str10, str11, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str13, str12);
    }
}
