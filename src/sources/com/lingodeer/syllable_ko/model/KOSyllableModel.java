package com.lingodeer.syllable_ko.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class KOSyllableModel {
    public static final int $stable = 0;
    private final String character;
    private final String option1;
    private final String option2;
    private final String option3;
    private final String pronunciation;
    private final String romanization;
    private final KOSyllableModelType type;

    public KOSyllableModel(KOSyllableModelType type, String character, String pronunciation, String romanization, String option1, String option2, String option3) {
        m.f(type, "type");
        m.f(character, "character");
        m.f(pronunciation, "pronunciation");
        m.f(romanization, "romanization");
        m.f(option1, "option1");
        m.f(option2, "option2");
        m.f(option3, "option3");
        this.type = type;
        this.character = character;
        this.pronunciation = pronunciation;
        this.romanization = romanization;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    public static /* synthetic */ KOSyllableModel copy$default(KOSyllableModel kOSyllableModel, KOSyllableModelType kOSyllableModelType, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kOSyllableModelType = kOSyllableModel.type;
        }
        if ((i11 & 2) != 0) {
            str = kOSyllableModel.character;
        }
        if ((i11 & 4) != 0) {
            str2 = kOSyllableModel.pronunciation;
        }
        if ((i11 & 8) != 0) {
            str3 = kOSyllableModel.romanization;
        }
        if ((i11 & 16) != 0) {
            str4 = kOSyllableModel.option1;
        }
        if ((i11 & 32) != 0) {
            str5 = kOSyllableModel.option2;
        }
        if ((i11 & 64) != 0) {
            str6 = kOSyllableModel.option3;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return kOSyllableModel.copy(kOSyllableModelType, str, str10, str3, str9, str7, str8);
    }

    public final KOSyllableModelType component1() {
        return this.type;
    }

    public final String component2() {
        return this.character;
    }

    public final String component3() {
        return this.pronunciation;
    }

    public final String component4() {
        return this.romanization;
    }

    public final String component5() {
        return this.option1;
    }

    public final String component6() {
        return this.option2;
    }

    public final String component7() {
        return this.option3;
    }

    public final KOSyllableModel copy(KOSyllableModelType type, String character, String pronunciation, String romanization, String option1, String option2, String option3) {
        m.f(type, "type");
        m.f(character, "character");
        m.f(pronunciation, "pronunciation");
        m.f(romanization, "romanization");
        m.f(option1, "option1");
        m.f(option2, "option2");
        m.f(option3, "option3");
        return new KOSyllableModel(type, character, pronunciation, romanization, option1, option2, option3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KOSyllableModel)) {
            return false;
        }
        KOSyllableModel kOSyllableModel = (KOSyllableModel) obj;
        return this.type == kOSyllableModel.type && m.a(this.character, kOSyllableModel.character) && m.a(this.pronunciation, kOSyllableModel.pronunciation) && m.a(this.romanization, kOSyllableModel.romanization) && m.a(this.option1, kOSyllableModel.option1) && m.a(this.option2, kOSyllableModel.option2) && m.a(this.option3, kOSyllableModel.option3);
    }

    public final String getCharacter() {
        return this.character;
    }

    public final String getOption1() {
        return this.option1;
    }

    public final String getOption2() {
        return this.option2;
    }

    public final String getOption3() {
        return this.option3;
    }

    public final String getPronunciation() {
        return this.pronunciation;
    }

    public final String getRomanization() {
        return this.romanization;
    }

    public final KOSyllableModelType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.option3.hashCode() + e.d(e.d(e.d(e.d(e.d(this.type.hashCode() * 31, 31, this.character), 31, this.pronunciation), 31, this.romanization), 31, this.option1), 31, this.option2);
    }

    public String toString() {
        KOSyllableModelType kOSyllableModelType = this.type;
        String str = this.character;
        String str2 = this.pronunciation;
        String str3 = this.romanization;
        String str4 = this.option1;
        String str5 = this.option2;
        String str6 = this.option3;
        StringBuilder sb2 = new StringBuilder("KOSyllableModel(type=");
        sb2.append(kOSyllableModelType);
        sb2.append(", character=");
        sb2.append(str);
        sb2.append(", pronunciation=");
        d.w(sb2, str2, ", romanization=", str3, ", option1=");
        d.w(sb2, str4, ", option2=", str5, ", option3=");
        return a.k(sb2, str6, ")");
    }
}
