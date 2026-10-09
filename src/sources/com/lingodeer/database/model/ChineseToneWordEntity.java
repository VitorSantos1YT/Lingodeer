package com.lingodeer.database.model;

import a.ar.MFeWs;
import com.google.android.material.datepicker.d;
import kotlin.jvm.internal.m;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneWordEntity {
    private final a audio;
    private final a character;
    private final a qingSheng;
    private final a shengDiao;
    private final a shengMu;
    private final a type;
    private final a word;
    private final long wordId;
    private final a yunMu;

    public ChineseToneWordEntity(long j11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        this.wordId = j11;
        this.word = aVar;
        this.character = aVar2;
        this.shengMu = aVar3;
        this.yunMu = aVar4;
        this.qingSheng = aVar5;
        this.shengDiao = aVar6;
        this.audio = aVar7;
        this.type = aVar8;
    }

    public static /* synthetic */ ChineseToneWordEntity copy$default(ChineseToneWordEntity chineseToneWordEntity, long j11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = chineseToneWordEntity.wordId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            aVar = chineseToneWordEntity.word;
        }
        a aVar9 = aVar;
        if ((i11 & 4) != 0) {
            aVar2 = chineseToneWordEntity.character;
        }
        return chineseToneWordEntity.copy(j12, aVar9, aVar2, (i11 & 8) != 0 ? chineseToneWordEntity.shengMu : aVar3, (i11 & 16) != 0 ? chineseToneWordEntity.yunMu : aVar4, (i11 & 32) != 0 ? chineseToneWordEntity.qingSheng : aVar5, (i11 & 64) != 0 ? chineseToneWordEntity.shengDiao : aVar6, (i11 & 128) != 0 ? chineseToneWordEntity.audio : aVar7, (i11 & 256) != 0 ? chineseToneWordEntity.type : aVar8);
    }

    public final long component1() {
        return this.wordId;
    }

    public final a component2() {
        return this.word;
    }

    public final a component3() {
        return this.character;
    }

    public final a component4() {
        return this.shengMu;
    }

    public final a component5() {
        return this.yunMu;
    }

    public final a component6() {
        return this.qingSheng;
    }

    public final a component7() {
        return this.shengDiao;
    }

    public final a component8() {
        return this.audio;
    }

    public final a component9() {
        return this.type;
    }

    public final ChineseToneWordEntity copy(long j11, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8) {
        return new ChineseToneWordEntity(j11, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneWordEntity)) {
            return false;
        }
        ChineseToneWordEntity chineseToneWordEntity = (ChineseToneWordEntity) obj;
        return this.wordId == chineseToneWordEntity.wordId && m.a(this.word, chineseToneWordEntity.word) && m.a(this.character, chineseToneWordEntity.character) && m.a(this.shengMu, chineseToneWordEntity.shengMu) && m.a(this.yunMu, chineseToneWordEntity.yunMu) && m.a(this.qingSheng, chineseToneWordEntity.qingSheng) && m.a(this.shengDiao, chineseToneWordEntity.shengDiao) && m.a(this.audio, chineseToneWordEntity.audio) && m.a(this.type, chineseToneWordEntity.type);
    }

    public final a getAudio() {
        return this.audio;
    }

    public final a getCharacter() {
        return this.character;
    }

    public final a getQingSheng() {
        return this.qingSheng;
    }

    public final a getShengDiao() {
        return this.shengDiao;
    }

    public final a getShengMu() {
        return this.shengMu;
    }

    public final a getType() {
        return this.type;
    }

    public final a getWord() {
        return this.word;
    }

    public final long getWordId() {
        return this.wordId;
    }

    public final a getYunMu() {
        return this.yunMu;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.wordId) * 31;
        a aVar = this.word;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.character;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.shengMu;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.yunMu;
        int iHashCode5 = (iHashCode4 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        a aVar5 = this.qingSheng;
        int iHashCode6 = (iHashCode5 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        a aVar6 = this.shengDiao;
        int iHashCode7 = (iHashCode6 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        a aVar7 = this.audio;
        int iHashCode8 = (iHashCode7 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        a aVar8 = this.type;
        return iHashCode8 + (aVar8 != null ? aVar8.hashCode() : 0);
    }

    public String toString() {
        long j11 = this.wordId;
        a aVar = this.word;
        a aVar2 = this.character;
        a aVar3 = this.shengMu;
        a aVar4 = this.yunMu;
        a aVar5 = this.qingSheng;
        a aVar6 = this.shengDiao;
        a aVar7 = this.audio;
        a aVar8 = this.type;
        StringBuilder sb2 = new StringBuilder("ChineseToneWordEntity(wordId=");
        sb2.append(j11);
        sb2.append(", word=");
        sb2.append(aVar);
        d.y(sb2, ", character=", aVar2, ", shengMu=", aVar3);
        d.y(sb2, ", yunMu=", aVar4, ", qingSheng=", aVar5);
        d.y(sb2, ", shengDiao=", aVar6, ", audio=", aVar7);
        sb2.append(MFeWs.RudvTcsavQnjAF);
        sb2.append(aVar8);
        sb2.append(")");
        return sb2.toString();
    }
}
