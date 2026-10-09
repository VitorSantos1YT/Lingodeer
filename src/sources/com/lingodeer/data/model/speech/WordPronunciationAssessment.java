package com.lingodeer.data.model.speech;

import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class WordPronunciationAssessment {
    public static final Companion Companion = new Companion(null);
    private final double AccuracyScore;
    private final String ErrorType;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return WordPronunciationAssessment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ WordPronunciationAssessment(int i11, double d5, String str, o1 o1Var) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, WordPronunciationAssessment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.AccuracyScore = d5;
        this.ErrorType = str;
    }

    public static /* synthetic */ WordPronunciationAssessment copy$default(WordPronunciationAssessment wordPronunciationAssessment, double d5, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d5 = wordPronunciationAssessment.AccuracyScore;
        }
        if ((i11 & 2) != 0) {
            str = wordPronunciationAssessment.ErrorType;
        }
        return wordPronunciationAssessment.copy(d5, str);
    }

    public static final /* synthetic */ void write$Self$data_release(WordPronunciationAssessment wordPronunciationAssessment, b bVar, g gVar) {
        bVar.q(gVar, 0, wordPronunciationAssessment.AccuracyScore);
        bVar.w(gVar, 1, wordPronunciationAssessment.ErrorType);
    }

    public final double component1() {
        return this.AccuracyScore;
    }

    public final String component2() {
        return this.ErrorType;
    }

    public final WordPronunciationAssessment copy(double d5, String ErrorType) {
        m.f(ErrorType, "ErrorType");
        return new WordPronunciationAssessment(d5, ErrorType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordPronunciationAssessment)) {
            return false;
        }
        WordPronunciationAssessment wordPronunciationAssessment = (WordPronunciationAssessment) obj;
        return Double.compare(this.AccuracyScore, wordPronunciationAssessment.AccuracyScore) == 0 && m.a(this.ErrorType, wordPronunciationAssessment.ErrorType);
    }

    public final double getAccuracyScore() {
        return this.AccuracyScore;
    }

    public final String getErrorType() {
        return this.ErrorType;
    }

    public int hashCode() {
        return this.ErrorType.hashCode() + (Double.hashCode(this.AccuracyScore) * 31);
    }

    public String toString() {
        return "WordPronunciationAssessment(AccuracyScore=" + this.AccuracyScore + ", ErrorType=" + this.ErrorType + ")";
    }

    public WordPronunciationAssessment(double d5, String ErrorType) {
        m.f(ErrorType, "ErrorType");
        this.AccuracyScore = d5;
        this.ErrorType = ErrorType;
    }
}
