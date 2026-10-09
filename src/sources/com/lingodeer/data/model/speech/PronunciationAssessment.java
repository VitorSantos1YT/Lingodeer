package com.lingodeer.data.model.speech;

import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class PronunciationAssessment {
    public static final Companion Companion = new Companion(null);
    private final double AccuracyScore;
    private final double CompletenessScore;
    private final double FluencyScore;
    private final double PronScore;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return PronunciationAssessment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ PronunciationAssessment(int i11, double d5, double d11, double d12, double d13, o1 o1Var) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, PronunciationAssessment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.AccuracyScore = d5;
        this.FluencyScore = d11;
        this.CompletenessScore = d12;
        this.PronScore = d13;
    }

    public static /* synthetic */ PronunciationAssessment copy$default(PronunciationAssessment pronunciationAssessment, double d5, double d11, double d12, double d13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d5 = pronunciationAssessment.AccuracyScore;
        }
        double d14 = d5;
        if ((i11 & 2) != 0) {
            d11 = pronunciationAssessment.FluencyScore;
        }
        double d15 = d11;
        if ((i11 & 4) != 0) {
            d12 = pronunciationAssessment.CompletenessScore;
        }
        return pronunciationAssessment.copy(d14, d15, d12, (i11 & 8) != 0 ? pronunciationAssessment.PronScore : d13);
    }

    public static final /* synthetic */ void write$Self$data_release(PronunciationAssessment pronunciationAssessment, b bVar, g gVar) {
        bVar.q(gVar, 0, pronunciationAssessment.AccuracyScore);
        bVar.q(gVar, 1, pronunciationAssessment.FluencyScore);
        bVar.q(gVar, 2, pronunciationAssessment.CompletenessScore);
        bVar.q(gVar, 3, pronunciationAssessment.PronScore);
    }

    public final double component1() {
        return this.AccuracyScore;
    }

    public final double component2() {
        return this.FluencyScore;
    }

    public final double component3() {
        return this.CompletenessScore;
    }

    public final double component4() {
        return this.PronScore;
    }

    public final PronunciationAssessment copy(double d5, double d11, double d12, double d13) {
        return new PronunciationAssessment(d5, d11, d12, d13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PronunciationAssessment)) {
            return false;
        }
        PronunciationAssessment pronunciationAssessment = (PronunciationAssessment) obj;
        return Double.compare(this.AccuracyScore, pronunciationAssessment.AccuracyScore) == 0 && Double.compare(this.FluencyScore, pronunciationAssessment.FluencyScore) == 0 && Double.compare(this.CompletenessScore, pronunciationAssessment.CompletenessScore) == 0 && Double.compare(this.PronScore, pronunciationAssessment.PronScore) == 0;
    }

    public final double getAccuracyScore() {
        return this.AccuracyScore;
    }

    public final double getCompletenessScore() {
        return this.CompletenessScore;
    }

    public final double getFluencyScore() {
        return this.FluencyScore;
    }

    public final double getPronScore() {
        return this.PronScore;
    }

    public int hashCode() {
        return Double.hashCode(this.PronScore) + ((Double.hashCode(this.CompletenessScore) + ((Double.hashCode(this.FluencyScore) + (Double.hashCode(this.AccuracyScore) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PronunciationAssessment(AccuracyScore=" + this.AccuracyScore + ", FluencyScore=" + this.FluencyScore + ", CompletenessScore=" + this.CompletenessScore + ", PronScore=" + this.PronScore + ")";
    }

    public PronunciationAssessment(double d5, double d11, double d12, double d13) {
        this.AccuracyScore = d5;
        this.FluencyScore = d11;
        this.CompletenessScore = d12;
        this.PronScore = d13;
    }
}
