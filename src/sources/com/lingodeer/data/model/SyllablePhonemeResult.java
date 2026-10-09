package com.lingodeer.data.model;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import defpackage.e;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SyllablePhonemeResult {
    private final double accuracyScore;
    private final String ipa;
    private final List<PhonemeDetail> phonemes;
    private final List<SyllableDetail> syllables;
    private final List<l> visemes;
    private final String word;

    public SyllablePhonemeResult(String word, double d5, String ipa, List<l> visemes, List<SyllableDetail> syllables, List<PhonemeDetail> phonemes) {
        m.f(word, "word");
        m.f(ipa, "ipa");
        m.f(visemes, "visemes");
        m.f(syllables, "syllables");
        m.f(phonemes, "phonemes");
        this.word = word;
        this.accuracyScore = d5;
        this.ipa = ipa;
        this.visemes = visemes;
        this.syllables = syllables;
        this.phonemes = phonemes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyllablePhonemeResult copy$default(SyllablePhonemeResult syllablePhonemeResult, String str, double d5, String str2, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = syllablePhonemeResult.word;
        }
        if ((i11 & 2) != 0) {
            d5 = syllablePhonemeResult.accuracyScore;
        }
        if ((i11 & 4) != 0) {
            str2 = syllablePhonemeResult.ipa;
        }
        if ((i11 & 8) != 0) {
            list = syllablePhonemeResult.visemes;
        }
        if ((i11 & 16) != 0) {
            list2 = syllablePhonemeResult.syllables;
        }
        if ((i11 & 32) != 0) {
            list3 = syllablePhonemeResult.phonemes;
        }
        return syllablePhonemeResult.copy(str, d5, str2, list, list2, list3);
    }

    public final String component1() {
        return this.word;
    }

    public final double component2() {
        return this.accuracyScore;
    }

    public final String component3() {
        return this.ipa;
    }

    public final List<l> component4() {
        return this.visemes;
    }

    public final List<SyllableDetail> component5() {
        return this.syllables;
    }

    public final List<PhonemeDetail> component6() {
        return this.phonemes;
    }

    public final SyllablePhonemeResult copy(String word, double d5, String ipa, List<l> visemes, List<SyllableDetail> syllables, List<PhonemeDetail> phonemes) {
        m.f(word, "word");
        m.f(ipa, "ipa");
        m.f(visemes, "visemes");
        m.f(syllables, "syllables");
        m.f(phonemes, "phonemes");
        return new SyllablePhonemeResult(word, d5, ipa, visemes, syllables, phonemes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyllablePhonemeResult)) {
            return false;
        }
        SyllablePhonemeResult syllablePhonemeResult = (SyllablePhonemeResult) obj;
        return m.a(this.word, syllablePhonemeResult.word) && Double.compare(this.accuracyScore, syllablePhonemeResult.accuracyScore) == 0 && m.a(this.ipa, syllablePhonemeResult.ipa) && m.a(this.visemes, syllablePhonemeResult.visemes) && m.a(this.syllables, syllablePhonemeResult.syllables) && m.a(this.phonemes, syllablePhonemeResult.phonemes);
    }

    public final double getAccuracyScore() {
        return this.accuracyScore;
    }

    public final String getIpa() {
        return this.ipa;
    }

    public final List<PhonemeDetail> getPhonemes() {
        return this.phonemes;
    }

    public final List<SyllableDetail> getSyllables() {
        return this.syllables;
    }

    public final List<l> getVisemes() {
        return this.visemes;
    }

    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        return this.phonemes.hashCode() + p0.b(p0.b(e.d((Double.hashCode(this.accuracyScore) + (this.word.hashCode() * 31)) * 31, 31, this.ipa), 31, this.visemes), 31, this.syllables);
    }

    public String toString() {
        return "SyllablePhonemeResult(word=" + this.word + ", accuracyScore=" + this.accuracyScore + ", ipa=" + this.ipa + ", visemes=" + this.visemes + ", syllables=" + this.syllables + ", phonemes=" + this.phonemes + SemtNwfPgIhi.PJVFmuacFc;
    }
}
