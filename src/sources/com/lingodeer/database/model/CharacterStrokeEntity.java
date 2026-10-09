package com.lingodeer.database.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CharacterStrokeEntity {
    private final long charId;
    private final a character;
    private final a luoma;
    private final a pinyin;
    private final a strokeData;
    private final a tranARA;
    private final a tranCHN;
    private final a tranDEN;
    private final a tranENG;
    private final a tranFRN;
    private final a tranHINDI;
    private final a tranIDN;
    private final a tranITN;
    private final a tranJPN;
    private final a tranKRN;
    private final a tranPOL;
    private final a tranPTG;
    private final a tranRUS;
    private final a tranSPN;
    private final a tranTCHN;
    private final a tranTHAI;
    private final a tranTUR;
    private final a tranVTN;
    private final Integer version;
    private final a zhuyin;

    public CharacterStrokeEntity(long j11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, Integer num, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, a aVar14, a aVar15, a aVar16, a aVar17, a aVar18, a aVar19, a aVar20, a aVar21, a aVar22, a aVar23) {
        this.charId = j11;
        this.character = aVar;
        this.zhuyin = aVar2;
        this.pinyin = aVar3;
        this.luoma = aVar4;
        this.strokeData = aVar5;
        this.version = num;
        this.tranCHN = aVar6;
        this.tranTCHN = aVar7;
        this.tranJPN = aVar8;
        this.tranKRN = aVar9;
        this.tranENG = aVar10;
        this.tranSPN = aVar11;
        this.tranFRN = aVar12;
        this.tranDEN = aVar13;
        this.tranITN = aVar14;
        this.tranPTG = aVar15;
        this.tranVTN = aVar16;
        this.tranRUS = aVar17;
        this.tranTUR = aVar18;
        this.tranIDN = aVar19;
        this.tranARA = aVar20;
        this.tranPOL = aVar21;
        this.tranTHAI = aVar22;
        this.tranHINDI = aVar23;
    }

    public static /* synthetic */ CharacterStrokeEntity copy$default(CharacterStrokeEntity characterStrokeEntity, long j11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, Integer num, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, a aVar14, a aVar15, a aVar16, a aVar17, a aVar18, a aVar19, a aVar20, a aVar21, a aVar22, a aVar23, int i11, Object obj) {
        a aVar24;
        a aVar25;
        long j12 = (i11 & 1) != 0 ? characterStrokeEntity.charId : j11;
        a aVar26 = (i11 & 2) != 0 ? characterStrokeEntity.character : aVar;
        a aVar27 = (i11 & 4) != 0 ? characterStrokeEntity.zhuyin : aVar2;
        a aVar28 = (i11 & 8) != 0 ? characterStrokeEntity.pinyin : aVar3;
        a aVar29 = (i11 & 16) != 0 ? characterStrokeEntity.luoma : aVar4;
        a aVar30 = (i11 & 32) != 0 ? characterStrokeEntity.strokeData : aVar5;
        Integer num2 = (i11 & 64) != 0 ? characterStrokeEntity.version : num;
        a aVar31 = (i11 & 128) != 0 ? characterStrokeEntity.tranCHN : aVar6;
        a aVar32 = (i11 & 256) != 0 ? characterStrokeEntity.tranTCHN : aVar7;
        a aVar33 = (i11 & 512) != 0 ? characterStrokeEntity.tranJPN : aVar8;
        a aVar34 = (i11 & 1024) != 0 ? characterStrokeEntity.tranKRN : aVar9;
        a aVar35 = (i11 & 2048) != 0 ? characterStrokeEntity.tranENG : aVar10;
        a aVar36 = (i11 & 4096) != 0 ? characterStrokeEntity.tranSPN : aVar11;
        long j13 = j12;
        a aVar37 = (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? characterStrokeEntity.tranFRN : aVar12;
        a aVar38 = (i11 & 16384) != 0 ? characterStrokeEntity.tranDEN : aVar13;
        a aVar39 = (i11 & 32768) != 0 ? characterStrokeEntity.tranITN : aVar14;
        a aVar40 = (i11 & 65536) != 0 ? characterStrokeEntity.tranPTG : aVar15;
        a aVar41 = (i11 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? characterStrokeEntity.tranVTN : aVar16;
        a aVar42 = (i11 & 262144) != 0 ? characterStrokeEntity.tranRUS : aVar17;
        a aVar43 = (i11 & 524288) != 0 ? characterStrokeEntity.tranTUR : aVar18;
        a aVar44 = (i11 & 1048576) != 0 ? characterStrokeEntity.tranIDN : aVar19;
        a aVar45 = (i11 & 2097152) != 0 ? characterStrokeEntity.tranARA : aVar20;
        a aVar46 = (i11 & 4194304) != 0 ? characterStrokeEntity.tranPOL : aVar21;
        a aVar47 = (i11 & 8388608) != 0 ? characterStrokeEntity.tranTHAI : aVar22;
        if ((i11 & 16777216) != 0) {
            aVar25 = aVar47;
            aVar24 = characterStrokeEntity.tranHINDI;
        } else {
            aVar24 = aVar23;
            aVar25 = aVar47;
        }
        return characterStrokeEntity.copy(j13, aVar26, aVar27, aVar28, aVar29, aVar30, num2, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar25, aVar24);
    }

    public final long component1() {
        return this.charId;
    }

    public final a component10() {
        return this.tranJPN;
    }

    public final a component11() {
        return this.tranKRN;
    }

    public final a component12() {
        return this.tranENG;
    }

    public final a component13() {
        return this.tranSPN;
    }

    public final a component14() {
        return this.tranFRN;
    }

    public final a component15() {
        return this.tranDEN;
    }

    public final a component16() {
        return this.tranITN;
    }

    public final a component17() {
        return this.tranPTG;
    }

    public final a component18() {
        return this.tranVTN;
    }

    public final a component19() {
        return this.tranRUS;
    }

    public final a component2() {
        return this.character;
    }

    public final a component20() {
        return this.tranTUR;
    }

    public final a component21() {
        return this.tranIDN;
    }

    public final a component22() {
        return this.tranARA;
    }

    public final a component23() {
        return this.tranPOL;
    }

    public final a component24() {
        return this.tranTHAI;
    }

    public final a component25() {
        return this.tranHINDI;
    }

    public final a component3() {
        return this.zhuyin;
    }

    public final a component4() {
        return this.pinyin;
    }

    public final a component5() {
        return this.luoma;
    }

    public final a component6() {
        return this.strokeData;
    }

    public final Integer component7() {
        return this.version;
    }

    public final a component8() {
        return this.tranCHN;
    }

    public final a component9() {
        return this.tranTCHN;
    }

    public final CharacterStrokeEntity copy(long j11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, Integer num, a aVar6, a aVar7, a aVar8, a aVar9, a aVar10, a aVar11, a aVar12, a aVar13, a aVar14, a aVar15, a aVar16, a aVar17, a aVar18, a aVar19, a aVar20, a aVar21, a aVar22, a aVar23) {
        return new CharacterStrokeEntity(j11, aVar, aVar2, aVar3, aVar4, aVar5, num, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CharacterStrokeEntity)) {
            return false;
        }
        CharacterStrokeEntity characterStrokeEntity = (CharacterStrokeEntity) obj;
        return this.charId == characterStrokeEntity.charId && m.a(this.character, characterStrokeEntity.character) && m.a(this.zhuyin, characterStrokeEntity.zhuyin) && m.a(this.pinyin, characterStrokeEntity.pinyin) && m.a(this.luoma, characterStrokeEntity.luoma) && m.a(this.strokeData, characterStrokeEntity.strokeData) && m.a(this.version, characterStrokeEntity.version) && m.a(this.tranCHN, characterStrokeEntity.tranCHN) && m.a(this.tranTCHN, characterStrokeEntity.tranTCHN) && m.a(this.tranJPN, characterStrokeEntity.tranJPN) && m.a(this.tranKRN, characterStrokeEntity.tranKRN) && m.a(this.tranENG, characterStrokeEntity.tranENG) && m.a(this.tranSPN, characterStrokeEntity.tranSPN) && m.a(this.tranFRN, characterStrokeEntity.tranFRN) && m.a(this.tranDEN, characterStrokeEntity.tranDEN) && m.a(this.tranITN, characterStrokeEntity.tranITN) && m.a(this.tranPTG, characterStrokeEntity.tranPTG) && m.a(this.tranVTN, characterStrokeEntity.tranVTN) && m.a(this.tranRUS, characterStrokeEntity.tranRUS) && m.a(this.tranTUR, characterStrokeEntity.tranTUR) && m.a(this.tranIDN, characterStrokeEntity.tranIDN) && m.a(this.tranARA, characterStrokeEntity.tranARA) && m.a(this.tranPOL, characterStrokeEntity.tranPOL) && m.a(this.tranTHAI, characterStrokeEntity.tranTHAI) && m.a(this.tranHINDI, characterStrokeEntity.tranHINDI);
    }

    public final long getCharId() {
        return this.charId;
    }

    public final a getCharacter() {
        return this.character;
    }

    public final a getLuoma() {
        return this.luoma;
    }

    public final a getPinyin() {
        return this.pinyin;
    }

    public final a getStrokeData() {
        return this.strokeData;
    }

    public final a getTranARA() {
        return this.tranARA;
    }

    public final a getTranCHN() {
        return this.tranCHN;
    }

    public final a getTranDEN() {
        return this.tranDEN;
    }

    public final a getTranENG() {
        return this.tranENG;
    }

    public final a getTranFRN() {
        return this.tranFRN;
    }

    public final a getTranHINDI() {
        return this.tranHINDI;
    }

    public final a getTranIDN() {
        return this.tranIDN;
    }

    public final a getTranITN() {
        return this.tranITN;
    }

    public final a getTranJPN() {
        return this.tranJPN;
    }

    public final a getTranKRN() {
        return this.tranKRN;
    }

    public final a getTranPOL() {
        return this.tranPOL;
    }

    public final a getTranPTG() {
        return this.tranPTG;
    }

    public final a getTranRUS() {
        return this.tranRUS;
    }

    public final a getTranSPN() {
        return this.tranSPN;
    }

    public final a getTranTCHN() {
        return this.tranTCHN;
    }

    public final a getTranTHAI() {
        return this.tranTHAI;
    }

    public final a getTranTUR() {
        return this.tranTUR;
    }

    public final a getTranVTN() {
        return this.tranVTN;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final a getZhuyin() {
        return this.zhuyin;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.charId) * 31;
        a aVar = this.character;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.zhuyin;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.pinyin;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.luoma;
        int iHashCode5 = (iHashCode4 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        a aVar5 = this.strokeData;
        int iHashCode6 = (iHashCode5 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        Integer num = this.version;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        a aVar6 = this.tranCHN;
        int iHashCode8 = (iHashCode7 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        a aVar7 = this.tranTCHN;
        int iHashCode9 = (iHashCode8 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        a aVar8 = this.tranJPN;
        int iHashCode10 = (iHashCode9 + (aVar8 == null ? 0 : aVar8.hashCode())) * 31;
        a aVar9 = this.tranKRN;
        int iHashCode11 = (iHashCode10 + (aVar9 == null ? 0 : aVar9.hashCode())) * 31;
        a aVar10 = this.tranENG;
        int iHashCode12 = (iHashCode11 + (aVar10 == null ? 0 : aVar10.hashCode())) * 31;
        a aVar11 = this.tranSPN;
        int iHashCode13 = (iHashCode12 + (aVar11 == null ? 0 : aVar11.hashCode())) * 31;
        a aVar12 = this.tranFRN;
        int iHashCode14 = (iHashCode13 + (aVar12 == null ? 0 : aVar12.hashCode())) * 31;
        a aVar13 = this.tranDEN;
        int iHashCode15 = (iHashCode14 + (aVar13 == null ? 0 : aVar13.hashCode())) * 31;
        a aVar14 = this.tranITN;
        int iHashCode16 = (iHashCode15 + (aVar14 == null ? 0 : aVar14.hashCode())) * 31;
        a aVar15 = this.tranPTG;
        int iHashCode17 = (iHashCode16 + (aVar15 == null ? 0 : aVar15.hashCode())) * 31;
        a aVar16 = this.tranVTN;
        int iHashCode18 = (iHashCode17 + (aVar16 == null ? 0 : aVar16.hashCode())) * 31;
        a aVar17 = this.tranRUS;
        int iHashCode19 = (iHashCode18 + (aVar17 == null ? 0 : aVar17.hashCode())) * 31;
        a aVar18 = this.tranTUR;
        int iHashCode20 = (iHashCode19 + (aVar18 == null ? 0 : aVar18.hashCode())) * 31;
        a aVar19 = this.tranIDN;
        int iHashCode21 = (iHashCode20 + (aVar19 == null ? 0 : aVar19.hashCode())) * 31;
        a aVar20 = this.tranARA;
        int iHashCode22 = (iHashCode21 + (aVar20 == null ? 0 : aVar20.hashCode())) * 31;
        a aVar21 = this.tranPOL;
        int iHashCode23 = (iHashCode22 + (aVar21 == null ? 0 : aVar21.hashCode())) * 31;
        a aVar22 = this.tranTHAI;
        int iHashCode24 = (iHashCode23 + (aVar22 == null ? 0 : aVar22.hashCode())) * 31;
        a aVar23 = this.tranHINDI;
        return iHashCode24 + (aVar23 != null ? aVar23.hashCode() : 0);
    }

    public String toString() {
        long j11 = this.charId;
        a aVar = this.character;
        a aVar2 = this.zhuyin;
        a aVar3 = this.pinyin;
        a aVar4 = this.luoma;
        a aVar5 = this.strokeData;
        Integer num = this.version;
        a aVar6 = this.tranCHN;
        a aVar7 = this.tranTCHN;
        a aVar8 = this.tranJPN;
        a aVar9 = this.tranKRN;
        a aVar10 = this.tranENG;
        a aVar11 = this.tranSPN;
        a aVar12 = this.tranFRN;
        a aVar13 = this.tranDEN;
        a aVar14 = this.tranITN;
        a aVar15 = this.tranPTG;
        a aVar16 = this.tranVTN;
        a aVar17 = this.tranRUS;
        a aVar18 = this.tranTUR;
        a aVar19 = this.tranIDN;
        a aVar20 = this.tranARA;
        a aVar21 = this.tranPOL;
        a aVar22 = this.tranTHAI;
        a aVar23 = this.tranHINDI;
        StringBuilder sb2 = new StringBuilder("CharacterStrokeEntity(charId=");
        sb2.append(j11);
        sb2.append(", character=");
        sb2.append(aVar);
        d.y(sb2, ", zhuyin=", aVar2, ", pinyin=", aVar3);
        d.y(sb2, ealNNtLp.lZjeZsxUJ, aVar4, ", strokeData=", aVar5);
        sb2.append(", version=");
        sb2.append(num);
        sb2.append(", tranCHN=");
        sb2.append(aVar6);
        d.y(sb2, ", tranTCHN=", aVar7, ", tranJPN=", aVar8);
        d.y(sb2, ", tranKRN=", aVar9, ", tranENG=", aVar10);
        d.y(sb2, ", tranSPN=", aVar11, ", tranFRN=", aVar12);
        d.y(sb2, ", tranDEN=", aVar13, ", tranITN=", aVar14);
        d.y(sb2, ", tranPTG=", aVar15, ", tranVTN=", aVar16);
        d.y(sb2, ", tranRUS=", aVar17, ", tranTUR=", aVar18);
        d.y(sb2, ", tranIDN=", aVar19, ", tranARA=", aVar20);
        d.y(sb2, ", tranPOL=", aVar21, ", tranTHAI=", aVar22);
        sb2.append(", tranHINDI=");
        sb2.append(aVar23);
        sb2.append(")");
        return sb2.toString();
    }
}
