package com.lingodeer.data.model.chinesetone;

import b7.e0;
import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneWord {
    private final String audio;
    private final String character;
    private final String qingSheng;
    private final String shengDiao;
    private final String shengMu;
    private final String type;
    private final String word;
    private final long wordId;
    private final String yunMu;

    public ChineseToneWord(long j11, String word, String character, String shengMu, String yunMu, String qingSheng, String shengDiao, String audio, String type) {
        m.f(word, "word");
        m.f(character, "character");
        m.f(shengMu, "shengMu");
        m.f(yunMu, "yunMu");
        m.f(qingSheng, "qingSheng");
        m.f(shengDiao, "shengDiao");
        m.f(audio, "audio");
        m.f(type, "type");
        this.wordId = j11;
        this.word = word;
        this.character = character;
        this.shengMu = shengMu;
        this.yunMu = yunMu;
        this.qingSheng = qingSheng;
        this.shengDiao = shengDiao;
        this.audio = audio;
        this.type = type;
    }

    public static /* synthetic */ ChineseToneWord copy$default(ChineseToneWord chineseToneWord, long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = chineseToneWord.wordId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = chineseToneWord.word;
        }
        String str9 = str;
        if ((i11 & 4) != 0) {
            str2 = chineseToneWord.character;
        }
        return chineseToneWord.copy(j12, str9, str2, (i11 & 8) != 0 ? chineseToneWord.shengMu : str3, (i11 & 16) != 0 ? chineseToneWord.yunMu : str4, (i11 & 32) != 0 ? chineseToneWord.qingSheng : str5, (i11 & 64) != 0 ? chineseToneWord.shengDiao : str6, (i11 & 128) != 0 ? chineseToneWord.audio : str7, (i11 & 256) != 0 ? chineseToneWord.type : str8);
    }

    public final long component1() {
        return this.wordId;
    }

    public final String component2() {
        return this.word;
    }

    public final String component3() {
        return this.character;
    }

    public final String component4() {
        return this.shengMu;
    }

    public final String component5() {
        return this.yunMu;
    }

    public final String component6() {
        return this.qingSheng;
    }

    public final String component7() {
        return this.shengDiao;
    }

    public final String component8() {
        return this.audio;
    }

    public final String component9() {
        return this.type;
    }

    public final ChineseToneWord copy(long j11, String word, String character, String shengMu, String yunMu, String qingSheng, String shengDiao, String audio, String type) {
        m.f(word, "word");
        m.f(character, "character");
        m.f(shengMu, "shengMu");
        m.f(yunMu, "yunMu");
        m.f(qingSheng, "qingSheng");
        m.f(shengDiao, "shengDiao");
        m.f(audio, "audio");
        m.f(type, "type");
        return new ChineseToneWord(j11, word, character, shengMu, yunMu, qingSheng, shengDiao, audio, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneWord)) {
            return false;
        }
        ChineseToneWord chineseToneWord = (ChineseToneWord) obj;
        return this.wordId == chineseToneWord.wordId && m.a(this.word, chineseToneWord.word) && m.a(this.character, chineseToneWord.character) && m.a(this.shengMu, chineseToneWord.shengMu) && m.a(this.yunMu, chineseToneWord.yunMu) && m.a(this.qingSheng, chineseToneWord.qingSheng) && m.a(this.shengDiao, chineseToneWord.shengDiao) && m.a(this.audio, chineseToneWord.audio) && m.a(this.type, chineseToneWord.type);
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getCharacter() {
        return this.character;
    }

    public final String getQingSheng() {
        return this.qingSheng;
    }

    public final String getShengDiao() {
        return this.shengDiao;
    }

    public final String getShengMu() {
        return this.shengMu;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWord() {
        return this.word;
    }

    public final long getWordId() {
        return this.wordId;
    }

    public final String getYunMu() {
        return this.yunMu;
    }

    public int hashCode() {
        return this.type.hashCode() + e.d(e.d(e.d(e.d(e.d(e.d(e.d(Long.hashCode(this.wordId) * 31, 31, this.word), 31, this.character), 31, this.shengMu), 31, this.yunMu), 31, this.qingSheng), 31, this.shengDiao), 31, this.audio);
    }

    public String toString() {
        long j11 = this.wordId;
        String str = this.word;
        String str2 = this.character;
        String str3 = this.shengMu;
        String str4 = this.yunMu;
        String str5 = this.qingSheng;
        String str6 = this.shengDiao;
        String str7 = this.audio;
        String str8 = this.type;
        StringBuilder sbP = e0.p(j11, "ChineseToneWord(wordId=", ", word=", str);
        d.w(sbP, ", character=", str2, ", shengMu=", str3);
        d.w(sbP, ", yunMu=", str4, ", qingSheng=", str5);
        d.w(sbP, ", shengDiao=", str6, ", audio=", str7);
        return p.u(sbP, ", type=", str8, ")");
    }
}
