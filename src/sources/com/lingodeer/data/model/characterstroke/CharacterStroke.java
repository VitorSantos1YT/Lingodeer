package com.lingodeer.data.model.characterstroke;

import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import defpackage.e;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CharacterStroke {
    private final long charId;
    private final String character;
    private final String luoma;
    private final String pinyin;
    private final String strokeData;
    private final String tranARA;
    private final String tranCHN;
    private final String tranDEN;
    private final String tranENG;
    private final String tranFRN;
    private final String tranHINDI;
    private final String tranIDN;
    private final String tranITN;
    private final String tranJPN;
    private final String tranKRN;
    private final String tranPOL;
    private final String tranPTG;
    private final String tranRUS;
    private final String tranSPN;
    private final String tranTCHN;
    private final String tranTHAI;
    private final String tranTUR;
    private final String tranVTN;
    private final int version;
    private final String zhuyin;

    public CharacterStroke(long j11, String character, String zhuyin, String pinyin, String luoma, String strokeData, int i11, String tranCHN, String tranTCHN, String tranJPN, String tranKRN, String tranENG, String tranSPN, String tranFRN, String tranDEN, String tranITN, String tranPTG, String tranVTN, String tranRUS, String tranTUR, String tranIDN, String tranARA, String tranPOL, String tranTHAI, String tranHINDI) {
        m.f(character, "character");
        m.f(zhuyin, "zhuyin");
        m.f(pinyin, "pinyin");
        m.f(luoma, "luoma");
        m.f(strokeData, "strokeData");
        m.f(tranCHN, "tranCHN");
        m.f(tranTCHN, "tranTCHN");
        m.f(tranJPN, "tranJPN");
        m.f(tranKRN, "tranKRN");
        m.f(tranENG, "tranENG");
        m.f(tranSPN, "tranSPN");
        m.f(tranFRN, "tranFRN");
        m.f(tranDEN, "tranDEN");
        m.f(tranITN, "tranITN");
        m.f(tranPTG, "tranPTG");
        m.f(tranVTN, "tranVTN");
        m.f(tranRUS, "tranRUS");
        m.f(tranTUR, "tranTUR");
        m.f(tranIDN, "tranIDN");
        m.f(tranARA, "tranARA");
        m.f(tranPOL, "tranPOL");
        m.f(tranTHAI, "tranTHAI");
        m.f(tranHINDI, "tranHINDI");
        this.charId = j11;
        this.character = character;
        this.zhuyin = zhuyin;
        this.pinyin = pinyin;
        this.luoma = luoma;
        this.strokeData = strokeData;
        this.version = i11;
        this.tranCHN = tranCHN;
        this.tranTCHN = tranTCHN;
        this.tranJPN = tranJPN;
        this.tranKRN = tranKRN;
        this.tranENG = tranENG;
        this.tranSPN = tranSPN;
        this.tranFRN = tranFRN;
        this.tranDEN = tranDEN;
        this.tranITN = tranITN;
        this.tranPTG = tranPTG;
        this.tranVTN = tranVTN;
        this.tranRUS = tranRUS;
        this.tranTUR = tranTUR;
        this.tranIDN = tranIDN;
        this.tranARA = tranARA;
        this.tranPOL = tranPOL;
        this.tranTHAI = tranTHAI;
        this.tranHINDI = tranHINDI;
    }

    public static /* synthetic */ CharacterStroke copy$default(CharacterStroke characterStroke, long j11, String str, String str2, String str3, String str4, String str5, int i11, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, int i12, Object obj) {
        String str24;
        String str25;
        long j12 = (i12 & 1) != 0 ? characterStroke.charId : j11;
        String str26 = (i12 & 2) != 0 ? characterStroke.character : str;
        String str27 = (i12 & 4) != 0 ? characterStroke.zhuyin : str2;
        String str28 = (i12 & 8) != 0 ? characterStroke.pinyin : str3;
        String str29 = (i12 & 16) != 0 ? characterStroke.luoma : str4;
        String str30 = (i12 & 32) != 0 ? characterStroke.strokeData : str5;
        int i13 = (i12 & 64) != 0 ? characterStroke.version : i11;
        String str31 = (i12 & 128) != 0 ? characterStroke.tranCHN : str6;
        String str32 = (i12 & 256) != 0 ? characterStroke.tranTCHN : str7;
        String str33 = (i12 & 512) != 0 ? characterStroke.tranJPN : str8;
        String str34 = (i12 & 1024) != 0 ? characterStroke.tranKRN : str9;
        String str35 = (i12 & 2048) != 0 ? characterStroke.tranENG : str10;
        String str36 = (i12 & 4096) != 0 ? characterStroke.tranSPN : str11;
        long j13 = j12;
        String str37 = (i12 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? characterStroke.tranFRN : str12;
        String str38 = (i12 & 16384) != 0 ? characterStroke.tranDEN : str13;
        String str39 = (i12 & 32768) != 0 ? characterStroke.tranITN : str14;
        String str40 = (i12 & 65536) != 0 ? characterStroke.tranPTG : str15;
        String str41 = (i12 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? characterStroke.tranVTN : str16;
        String str42 = (i12 & 262144) != 0 ? characterStroke.tranRUS : str17;
        String str43 = (i12 & 524288) != 0 ? characterStroke.tranTUR : str18;
        String str44 = (i12 & 1048576) != 0 ? characterStroke.tranIDN : str19;
        String str45 = (i12 & 2097152) != 0 ? characterStroke.tranARA : str20;
        String str46 = (i12 & 4194304) != 0 ? characterStroke.tranPOL : str21;
        String str47 = (i12 & 8388608) != 0 ? characterStroke.tranTHAI : str22;
        if ((i12 & 16777216) != 0) {
            str25 = str47;
            str24 = characterStroke.tranHINDI;
        } else {
            str24 = str23;
            str25 = str47;
        }
        return characterStroke.copy(j13, str26, str27, str28, str29, str30, i13, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str25, str24);
    }

    public final long component1() {
        return this.charId;
    }

    public final String component10() {
        return this.tranJPN;
    }

    public final String component11() {
        return this.tranKRN;
    }

    public final String component12() {
        return this.tranENG;
    }

    public final String component13() {
        return this.tranSPN;
    }

    public final String component14() {
        return this.tranFRN;
    }

    public final String component15() {
        return this.tranDEN;
    }

    public final String component16() {
        return this.tranITN;
    }

    public final String component17() {
        return this.tranPTG;
    }

    public final String component18() {
        return this.tranVTN;
    }

    public final String component19() {
        return this.tranRUS;
    }

    public final String component2() {
        return this.character;
    }

    public final String component20() {
        return this.tranTUR;
    }

    public final String component21() {
        return this.tranIDN;
    }

    public final String component22() {
        return this.tranARA;
    }

    public final String component23() {
        return this.tranPOL;
    }

    public final String component24() {
        return this.tranTHAI;
    }

    public final String component25() {
        return this.tranHINDI;
    }

    public final String component3() {
        return this.zhuyin;
    }

    public final String component4() {
        return this.pinyin;
    }

    public final String component5() {
        return this.luoma;
    }

    public final String component6() {
        return this.strokeData;
    }

    public final int component7() {
        return this.version;
    }

    public final String component8() {
        return this.tranCHN;
    }

    public final String component9() {
        return this.tranTCHN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CharacterStroke)) {
            return false;
        }
        CharacterStroke characterStroke = (CharacterStroke) obj;
        return this.charId == characterStroke.charId && m.a(this.character, characterStroke.character) && m.a(this.zhuyin, characterStroke.zhuyin) && m.a(this.pinyin, characterStroke.pinyin) && m.a(this.luoma, characterStroke.luoma) && m.a(this.strokeData, characterStroke.strokeData) && this.version == characterStroke.version && m.a(this.tranCHN, characterStroke.tranCHN) && m.a(this.tranTCHN, characterStroke.tranTCHN) && m.a(this.tranJPN, characterStroke.tranJPN) && m.a(this.tranKRN, characterStroke.tranKRN) && m.a(this.tranENG, characterStroke.tranENG) && m.a(this.tranSPN, characterStroke.tranSPN) && m.a(this.tranFRN, characterStroke.tranFRN) && m.a(this.tranDEN, characterStroke.tranDEN) && m.a(this.tranITN, characterStroke.tranITN) && m.a(this.tranPTG, characterStroke.tranPTG) && m.a(this.tranVTN, characterStroke.tranVTN) && m.a(this.tranRUS, characterStroke.tranRUS) && m.a(this.tranTUR, characterStroke.tranTUR) && m.a(this.tranIDN, characterStroke.tranIDN) && m.a(this.tranARA, characterStroke.tranARA) && m.a(this.tranPOL, characterStroke.tranPOL) && m.a(this.tranTHAI, characterStroke.tranTHAI) && m.a(this.tranHINDI, characterStroke.tranHINDI);
    }

    public final long getCharId() {
        return this.charId;
    }

    public final String getCharacter() {
        return this.character;
    }

    public final String getLuoma() {
        return this.luoma;
    }

    public final String getPinyin() {
        return this.pinyin;
    }

    public final String getStrokeData() {
        return this.strokeData;
    }

    public final String getTranARA() {
        return this.tranARA;
    }

    public final String getTranCHN() {
        return this.tranCHN;
    }

    public final String getTranDEN() {
        return this.tranDEN;
    }

    public final String getTranENG() {
        return this.tranENG;
    }

    public final String getTranFRN() {
        return this.tranFRN;
    }

    public final String getTranHINDI() {
        return this.tranHINDI;
    }

    public final String getTranIDN() {
        return this.tranIDN;
    }

    public final String getTranITN() {
        return this.tranITN;
    }

    public final String getTranJPN() {
        return this.tranJPN;
    }

    public final String getTranKRN() {
        return this.tranKRN;
    }

    public final String getTranPOL() {
        return this.tranPOL;
    }

    public final String getTranPTG() {
        return this.tranPTG;
    }

    public final String getTranRUS() {
        return this.tranRUS;
    }

    public final String getTranSPN() {
        return this.tranSPN;
    }

    public final String getTranTCHN() {
        return this.tranTCHN;
    }

    public final String getTranTHAI() {
        return this.tranTHAI;
    }

    public final String getTranTUR() {
        return this.tranTUR;
    }

    public final String getTranVTN() {
        return this.tranVTN;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getZhuyin() {
        return this.zhuyin;
    }

    public int hashCode() {
        return this.tranHINDI.hashCode() + e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.b(this.version, e.d(e.d(e.d(e.d(e.d(Long.hashCode(this.charId) * 31, 31, this.character), 31, this.zhuyin), 31, this.pinyin), 31, this.luoma), 31, this.strokeData), 31), 31, this.tranCHN), 31, this.tranTCHN), 31, this.tranJPN), 31, this.tranKRN), 31, this.tranENG), 31, this.tranSPN), 31, this.tranFRN), 31, this.tranDEN), 31, this.tranITN), 31, this.tranPTG), 31, this.tranVTN), 31, this.tranRUS), 31, this.tranTUR), 31, this.tranIDN), 31, this.tranARA), 31, this.tranPOL), 31, this.tranTHAI);
    }

    public String toString() {
        long j11 = this.charId;
        String str = this.character;
        String str2 = this.zhuyin;
        String str3 = this.pinyin;
        String str4 = this.luoma;
        String str5 = this.strokeData;
        int i11 = this.version;
        String str6 = this.tranCHN;
        String str7 = this.tranTCHN;
        String str8 = this.tranJPN;
        String str9 = this.tranKRN;
        String str10 = this.tranENG;
        String str11 = this.tranSPN;
        String str12 = this.tranFRN;
        String str13 = this.tranDEN;
        String str14 = this.tranITN;
        String str15 = this.tranPTG;
        String str16 = this.tranVTN;
        String str17 = this.tranRUS;
        String str18 = this.tranTUR;
        String str19 = this.tranIDN;
        String str20 = this.tranARA;
        String str21 = this.tranPOL;
        String str22 = this.tranTHAI;
        String str23 = this.tranHINDI;
        StringBuilder sbP = e0.p(j11, "CharacterStroke(charId=", ", character=", str);
        d.w(sbP, ", zhuyin=", str2, ", pinyin=", str3);
        d.w(sbP, ", luoma=", str4, ", strokeData=", str5);
        sbP.append(", version=");
        sbP.append(i11);
        sbP.append(", tranCHN=");
        sbP.append(str6);
        d.w(sbP, ", tranTCHN=", str7, ", tranJPN=", str8);
        d.w(sbP, ", tranKRN=", str9, ", tranENG=", str10);
        d.w(sbP, ", tranSPN=", str11, ", tranFRN=", str12);
        d.w(sbP, ", tranDEN=", str13, ", tranITN=", str14);
        d.w(sbP, ", tranPTG=", str15, ", tranVTN=", str16);
        d.w(sbP, ", tranRUS=", str17, ", tranTUR=", str18);
        d.w(sbP, ", tranIDN=", str19, ", tranARA=", str20);
        d.w(sbP, ", tranPOL=", str21, ", tranTHAI=", str22);
        return p.u(sbP, ", tranHINDI=", str23, ")");
    }

    public final CharacterStroke copy(long j11, String character, String zhuyin, String pinyin, String luoma, String strokeData, int i11, String tranCHN, String tranTCHN, String tranJPN, String tranKRN, String tranENG, String tranSPN, String tranFRN, String tranDEN, String tranITN, String tranPTG, String tranVTN, String tranRUS, String str, String tranIDN, String tranARA, String tranPOL, String tranTHAI, String tranHINDI) {
        m.f(character, "character");
        m.f(zhuyin, "zhuyin");
        m.f(pinyin, "pinyin");
        m.f(luoma, "luoma");
        m.f(strokeData, "strokeData");
        m.f(tranCHN, "tranCHN");
        m.f(tranTCHN, "tranTCHN");
        m.f(tranJPN, "tranJPN");
        m.f(tranKRN, "tranKRN");
        m.f(tranENG, "tranENG");
        m.f(tranSPN, "tranSPN");
        m.f(tranFRN, "tranFRN");
        m.f(tranDEN, "tranDEN");
        m.f(tranITN, "tranITN");
        m.f(tranPTG, "tranPTG");
        m.f(tranVTN, "tranVTN");
        m.f(tranRUS, "tranRUS");
        m.f(str, kHfjNGauVgdF.tTOapURXRTZX);
        m.f(tranIDN, "tranIDN");
        m.f(tranARA, "tranARA");
        m.f(tranPOL, "tranPOL");
        m.f(tranTHAI, "tranTHAI");
        m.f(tranHINDI, "tranHINDI");
        return new CharacterStroke(j11, character, zhuyin, pinyin, luoma, strokeData, i11, tranCHN, tranTCHN, tranJPN, tranKRN, tranENG, tranSPN, tranFRN, tranDEN, tranITN, tranPTG, tranVTN, tranRUS, str, tranIDN, tranARA, tranPOL, tranTHAI, tranHINDI);
    }
}
