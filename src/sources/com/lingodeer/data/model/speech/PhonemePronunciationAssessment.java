package com.lingodeer.data.model.speech;

import c00.a;
import c00.e;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class PhonemePronunciationAssessment {
    public static final Companion Companion = new Companion(null);
    private final double AccuracyScore;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return PhonemePronunciationAssessment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ PhonemePronunciationAssessment(int i11, double d5, o1 o1Var) {
        if (1 == (i11 & 1)) {
            this.AccuracyScore = d5;
        } else {
            d1.k(i11, 1, PhonemePronunciationAssessment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ PhonemePronunciationAssessment copy$default(PhonemePronunciationAssessment phonemePronunciationAssessment, double d5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d5 = phonemePronunciationAssessment.AccuracyScore;
        }
        return phonemePronunciationAssessment.copy(d5);
    }

    public final double component1() {
        return this.AccuracyScore;
    }

    public final PhonemePronunciationAssessment copy(double d5) {
        return new PhonemePronunciationAssessment(d5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhonemePronunciationAssessment) && Double.compare(this.AccuracyScore, ((PhonemePronunciationAssessment) obj).AccuracyScore) == 0;
    }

    public final double getAccuracyScore() {
        return this.AccuracyScore;
    }

    public int hashCode() {
        return Double.hashCode(this.AccuracyScore);
    }

    public String toString() {
        return "PhonemePronunciationAssessment(AccuracyScore=" + this.AccuracyScore + ")";
    }

    public PhonemePronunciationAssessment(double d5) {
        this.AccuracyScore = d5;
    }
}
