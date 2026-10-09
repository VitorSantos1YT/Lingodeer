package com.lingodeer.data.model;

import defpackage.e;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class PhonemeDetail {
    private final double accuracyScore;
    private final boolean isFistPhoneme;
    private final String phoneme;
    private final PhonemeType type;
    private final List<String> words;

    public PhonemeDetail(String phoneme, double d5, List<String> words, boolean z11, PhonemeType type) {
        m.f(phoneme, "phoneme");
        m.f(words, "words");
        m.f(type, "type");
        this.phoneme = phoneme;
        this.accuracyScore = d5;
        this.words = words;
        this.isFistPhoneme = z11;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhonemeDetail copy$default(PhonemeDetail phonemeDetail, String str, double d5, List list, boolean z11, PhonemeType phonemeType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = phonemeDetail.phoneme;
        }
        if ((i11 & 2) != 0) {
            d5 = phonemeDetail.accuracyScore;
        }
        if ((i11 & 4) != 0) {
            list = phonemeDetail.words;
        }
        if ((i11 & 8) != 0) {
            z11 = phonemeDetail.isFistPhoneme;
        }
        if ((i11 & 16) != 0) {
            phonemeType = phonemeDetail.type;
        }
        PhonemeType phonemeType2 = phonemeType;
        List list2 = list;
        return phonemeDetail.copy(str, d5, list2, z11, phonemeType2);
    }

    public final String component1() {
        return this.phoneme;
    }

    public final double component2() {
        return this.accuracyScore;
    }

    public final List<String> component3() {
        return this.words;
    }

    public final boolean component4() {
        return this.isFistPhoneme;
    }

    public final PhonemeType component5() {
        return this.type;
    }

    public final PhonemeDetail copy(String phoneme, double d5, List<String> words, boolean z11, PhonemeType type) {
        m.f(phoneme, "phoneme");
        m.f(words, "words");
        m.f(type, "type");
        return new PhonemeDetail(phoneme, d5, words, z11, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonemeDetail)) {
            return false;
        }
        PhonemeDetail phonemeDetail = (PhonemeDetail) obj;
        return m.a(this.phoneme, phonemeDetail.phoneme) && Double.compare(this.accuracyScore, phonemeDetail.accuracyScore) == 0 && m.a(this.words, phonemeDetail.words) && this.isFistPhoneme == phonemeDetail.isFistPhoneme && this.type == phonemeDetail.type;
    }

    public final double getAccuracyScore() {
        return this.accuracyScore;
    }

    public final String getPhoneme() {
        return this.phoneme;
    }

    public final PhonemeType getType() {
        return this.type;
    }

    public final List<String> getWords() {
        return this.words;
    }

    public int hashCode() {
        return this.type.hashCode() + e.e(p0.b((Double.hashCode(this.accuracyScore) + (this.phoneme.hashCode() * 31)) * 31, 31, this.words), 31, this.isFistPhoneme);
    }

    public final boolean isFistPhoneme() {
        return this.isFistPhoneme;
    }

    public String toString() {
        return "PhonemeDetail(phoneme=" + this.phoneme + ", accuracyScore=" + this.accuracyScore + ", words=" + this.words + ", isFistPhoneme=" + this.isFistPhoneme + ", type=" + this.type + ")";
    }
}
