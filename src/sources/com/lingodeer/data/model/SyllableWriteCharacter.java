package com.lingodeer.data.model;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import b7.e0;
import com.google.android.material.datepicker.d;
import defpackage.e;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SyllableWriteCharacter {
    private final String audioUri;
    private final String charPath;
    private final String character;
    private final long characterId;
    private final String luoMa;
    private final List<String> partStrings;
    private final List<String> polygonStrings;
    private final String zhuYin;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyllableWriteCharacter copy$default(SyllableWriteCharacter syllableWriteCharacter, long j11, String str, String str2, String str3, String str4, List list, List list2, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = syllableWriteCharacter.characterId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = syllableWriteCharacter.character;
        }
        String str6 = str;
        if ((i11 & 4) != 0) {
            str2 = syllableWriteCharacter.luoMa;
        }
        String str7 = str2;
        if ((i11 & 8) != 0) {
            str3 = syllableWriteCharacter.zhuYin;
        }
        return syllableWriteCharacter.copy(j12, str6, str7, str3, (i11 & 16) != 0 ? syllableWriteCharacter.charPath : str4, (i11 & 32) != 0 ? syllableWriteCharacter.partStrings : list, (i11 & 64) != 0 ? syllableWriteCharacter.polygonStrings : list2, (i11 & 128) != 0 ? syllableWriteCharacter.audioUri : str5);
    }

    public final long component1() {
        return this.characterId;
    }

    public final String component2() {
        return this.character;
    }

    public final String component3() {
        return this.luoMa;
    }

    public final String component4() {
        return this.zhuYin;
    }

    public final String component5() {
        return this.charPath;
    }

    public final List<String> component6() {
        return this.partStrings;
    }

    public final List<String> component7() {
        return this.polygonStrings;
    }

    public final String component8() {
        return this.audioUri;
    }

    public final SyllableWriteCharacter copy(long j11, String character, String luoMa, String zhuYin, String charPath, List<String> partStrings, List<String> polygonStrings, String audioUri) {
        m.f(character, "character");
        m.f(luoMa, "luoMa");
        m.f(zhuYin, "zhuYin");
        m.f(charPath, "charPath");
        m.f(partStrings, "partStrings");
        m.f(polygonStrings, "polygonStrings");
        m.f(audioUri, "audioUri");
        return new SyllableWriteCharacter(j11, character, luoMa, zhuYin, charPath, partStrings, polygonStrings, audioUri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyllableWriteCharacter)) {
            return false;
        }
        SyllableWriteCharacter syllableWriteCharacter = (SyllableWriteCharacter) obj;
        return this.characterId == syllableWriteCharacter.characterId && m.a(this.character, syllableWriteCharacter.character) && m.a(this.luoMa, syllableWriteCharacter.luoMa) && m.a(this.zhuYin, syllableWriteCharacter.zhuYin) && m.a(this.charPath, syllableWriteCharacter.charPath) && m.a(this.partStrings, syllableWriteCharacter.partStrings) && m.a(this.polygonStrings, syllableWriteCharacter.polygonStrings) && m.a(this.audioUri, syllableWriteCharacter.audioUri);
    }

    public final String getAudioUri() {
        return this.audioUri;
    }

    public final String getCharPath() {
        return this.charPath;
    }

    public final String getCharacter() {
        return this.character;
    }

    public final long getCharacterId() {
        return this.characterId;
    }

    public final String getLuoMa() {
        return this.luoMa;
    }

    public final List<String> getPartStrings() {
        return this.partStrings;
    }

    public final List<String> getPolygonStrings() {
        return this.polygonStrings;
    }

    public final String getZhuYin() {
        return this.zhuYin;
    }

    public int hashCode() {
        return this.audioUri.hashCode() + p0.b(p0.b(e.d(e.d(e.d(e.d(Long.hashCode(this.characterId) * 31, 31, this.character), 31, this.luoMa), 31, this.zhuYin), 31, this.charPath), 31, this.partStrings), 31, this.polygonStrings);
    }

    public String toString() {
        long j11 = this.characterId;
        String str = this.character;
        String str2 = this.luoMa;
        String str3 = this.zhuYin;
        String str4 = this.charPath;
        List<String> list = this.partStrings;
        List<String> list2 = this.polygonStrings;
        String str5 = this.audioUri;
        StringBuilder sbP = e0.p(j11, "SyllableWriteCharacter(characterId=", ", character=", str);
        d.w(sbP, ", luoMa=", str2, ", zhuYin=", str3);
        sbP.append(", charPath=");
        sbP.append(str4);
        sbP.append(", partStrings=");
        sbP.append(list);
        sbP.append(", polygonStrings=");
        sbP.append(list2);
        sbP.append(", audioUri=");
        sbP.append(str5);
        sbP.append(")");
        return sbP.toString();
    }

    public SyllableWriteCharacter(long j11, String character, String luoMa, String zhuYin, String charPath, List<String> partStrings, List<String> polygonStrings, String str) {
        m.f(character, "character");
        m.f(luoMa, "luoMa");
        m.f(zhuYin, "zhuYin");
        m.f(charPath, "charPath");
        m.f(partStrings, "partStrings");
        m.f(polygonStrings, "polygonStrings");
        m.f(str, DytezVyM.ExkZeumlysxUSo);
        this.characterId = j11;
        this.character = character;
        this.luoMa = luoMa;
        this.zhuYin = zhuYin;
        this.charPath = charPath;
        this.partStrings = partStrings;
        this.polygonStrings = polygonStrings;
        this.audioUri = str;
    }
}
