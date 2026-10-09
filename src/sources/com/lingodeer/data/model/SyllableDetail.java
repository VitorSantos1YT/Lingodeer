package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SyllableDetail {
    private final double accuracyScore;
    private final String grapheme;
    private final String syllable;

    public SyllableDetail(String syllable, String grapheme, double d5) {
        m.f(syllable, "syllable");
        m.f(grapheme, "grapheme");
        this.syllable = syllable;
        this.grapheme = grapheme;
        this.accuracyScore = d5;
    }

    public static /* synthetic */ SyllableDetail copy$default(SyllableDetail syllableDetail, String str, String str2, double d5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = syllableDetail.syllable;
        }
        if ((i11 & 2) != 0) {
            str2 = syllableDetail.grapheme;
        }
        if ((i11 & 4) != 0) {
            d5 = syllableDetail.accuracyScore;
        }
        return syllableDetail.copy(str, str2, d5);
    }

    public final String component1() {
        return this.syllable;
    }

    public final String component2() {
        return this.grapheme;
    }

    public final double component3() {
        return this.accuracyScore;
    }

    public final SyllableDetail copy(String syllable, String grapheme, double d5) {
        m.f(syllable, "syllable");
        m.f(grapheme, "grapheme");
        return new SyllableDetail(syllable, grapheme, d5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyllableDetail)) {
            return false;
        }
        SyllableDetail syllableDetail = (SyllableDetail) obj;
        return m.a(this.syllable, syllableDetail.syllable) && m.a(this.grapheme, syllableDetail.grapheme) && Double.compare(this.accuracyScore, syllableDetail.accuracyScore) == 0;
    }

    public final double getAccuracyScore() {
        return this.accuracyScore;
    }

    public final String getGrapheme() {
        return this.grapheme;
    }

    public final String getSyllable() {
        return this.syllable;
    }

    public int hashCode() {
        return Double.hashCode(this.accuracyScore) + e.d(this.syllable.hashCode() * 31, 31, this.grapheme);
    }

    public String toString() {
        String str = this.syllable;
        String str2 = this.grapheme;
        double d5 = this.accuracyScore;
        StringBuilder sbS = e.s("SyllableDetail(syllable=", str, ", grapheme=", str2, ", accuracyScore=");
        sbS.append(d5);
        sbS.append(")");
        return sbS.toString();
    }
}
