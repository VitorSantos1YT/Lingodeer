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
public final class Phoneme {
    public static final Companion Companion = new Companion(null);
    private final long Duration;
    private final long Offset;
    private final String Phoneme;
    private final PhonemePronunciationAssessment PronunciationAssessment;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Phoneme$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ Phoneme(int i11, String str, PhonemePronunciationAssessment phonemePronunciationAssessment, long j11, long j12, o1 o1Var) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, Phoneme$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.Phoneme = str;
        this.PronunciationAssessment = phonemePronunciationAssessment;
        this.Offset = j11;
        this.Duration = j12;
    }

    public static /* synthetic */ Phoneme copy$default(Phoneme phoneme, String str, PhonemePronunciationAssessment phonemePronunciationAssessment, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = phoneme.Phoneme;
        }
        if ((i11 & 2) != 0) {
            phonemePronunciationAssessment = phoneme.PronunciationAssessment;
        }
        if ((i11 & 4) != 0) {
            j11 = phoneme.Offset;
        }
        if ((i11 & 8) != 0) {
            j12 = phoneme.Duration;
        }
        long j13 = j12;
        return phoneme.copy(str, phonemePronunciationAssessment, j11, j13);
    }

    public static final /* synthetic */ void write$Self$data_release(Phoneme phoneme, b bVar, g gVar) {
        bVar.w(gVar, 0, phoneme.Phoneme);
        bVar.A(gVar, 1, PhonemePronunciationAssessment$$serializer.INSTANCE, phoneme.PronunciationAssessment);
        bVar.v(gVar, 2, phoneme.Offset);
        bVar.v(gVar, 3, phoneme.Duration);
    }

    public final String component1() {
        return this.Phoneme;
    }

    public final PhonemePronunciationAssessment component2() {
        return this.PronunciationAssessment;
    }

    public final long component3() {
        return this.Offset;
    }

    public final long component4() {
        return this.Duration;
    }

    public final Phoneme copy(String Phoneme, PhonemePronunciationAssessment PronunciationAssessment, long j11, long j12) {
        m.f(Phoneme, "Phoneme");
        m.f(PronunciationAssessment, "PronunciationAssessment");
        return new Phoneme(Phoneme, PronunciationAssessment, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phoneme)) {
            return false;
        }
        Phoneme phoneme = (Phoneme) obj;
        return m.a(this.Phoneme, phoneme.Phoneme) && m.a(this.PronunciationAssessment, phoneme.PronunciationAssessment) && this.Offset == phoneme.Offset && this.Duration == phoneme.Duration;
    }

    public final long getDuration() {
        return this.Duration;
    }

    public final long getOffset() {
        return this.Offset;
    }

    public final String getPhoneme() {
        return this.Phoneme;
    }

    public final PhonemePronunciationAssessment getPronunciationAssessment() {
        return this.PronunciationAssessment;
    }

    public int hashCode() {
        return Long.hashCode(this.Duration) + defpackage.e.f(this.Offset, (this.PronunciationAssessment.hashCode() + (this.Phoneme.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        return "Phoneme(Phoneme=" + this.Phoneme + ", PronunciationAssessment=" + this.PronunciationAssessment + ", Offset=" + this.Offset + ", Duration=" + this.Duration + ")";
    }

    public Phoneme(String Phoneme, PhonemePronunciationAssessment PronunciationAssessment, long j11, long j12) {
        m.f(Phoneme, "Phoneme");
        m.f(PronunciationAssessment, "PronunciationAssessment");
        this.Phoneme = Phoneme;
        this.PronunciationAssessment = PronunciationAssessment;
        this.Offset = j11;
        this.Duration = j12;
    }
}
