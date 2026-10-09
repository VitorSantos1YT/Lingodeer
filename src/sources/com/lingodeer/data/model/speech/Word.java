package com.lingodeer.data.model.speech;

import c00.a;
import c00.e;
import com.bumptech.glide.d;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class Word {
    private final long Duration;
    private final long Offset;
    private final List<Phoneme> Phonemes;
    private final WordPronunciationAssessment PronunciationAssessment;
    private final String Word;
    public static final Companion Companion = new Companion(null);
    private static final h[] $childSerializers = {null, null, null, null, d.u(j.PUBLICATION, new m9(29))};

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Word$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ Word(int i11, String str, long j11, long j12, WordPronunciationAssessment wordPronunciationAssessment, List list, o1 o1Var) {
        if (31 != (i11 & 31)) {
            d1.k(i11, 31, Word$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.Word = str;
        this.Offset = j11;
        this.Duration = j12;
        this.PronunciationAssessment = wordPronunciationAssessment;
        this.Phonemes = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_() {
        return new g00.d(Phoneme$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Word copy$default(Word word, String str, long j11, long j12, WordPronunciationAssessment wordPronunciationAssessment, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = word.Word;
        }
        if ((i11 & 2) != 0) {
            j11 = word.Offset;
        }
        if ((i11 & 4) != 0) {
            j12 = word.Duration;
        }
        if ((i11 & 8) != 0) {
            wordPronunciationAssessment = word.PronunciationAssessment;
        }
        if ((i11 & 16) != 0) {
            list = word.Phonemes;
        }
        long j13 = j12;
        return word.copy(str, j11, j13, wordPronunciationAssessment, list);
    }

    public static final /* synthetic */ void write$Self$data_release(Word word, b bVar, g gVar) {
        h[] hVarArr = $childSerializers;
        bVar.w(gVar, 0, word.Word);
        bVar.v(gVar, 1, word.Offset);
        bVar.v(gVar, 2, word.Duration);
        bVar.A(gVar, 3, WordPronunciationAssessment$$serializer.INSTANCE, word.PronunciationAssessment);
        bVar.A(gVar, 4, (a) hVarArr[4].getValue(), word.Phonemes);
    }

    public final String component1() {
        return this.Word;
    }

    public final long component2() {
        return this.Offset;
    }

    public final long component3() {
        return this.Duration;
    }

    public final WordPronunciationAssessment component4() {
        return this.PronunciationAssessment;
    }

    public final List<Phoneme> component5() {
        return this.Phonemes;
    }

    public final Word copy(String Word, long j11, long j12, WordPronunciationAssessment PronunciationAssessment, List<Phoneme> Phonemes) {
        m.f(Word, "Word");
        m.f(PronunciationAssessment, "PronunciationAssessment");
        m.f(Phonemes, "Phonemes");
        return new Word(Word, j11, j12, PronunciationAssessment, Phonemes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Word)) {
            return false;
        }
        Word word = (Word) obj;
        return m.a(this.Word, word.Word) && this.Offset == word.Offset && this.Duration == word.Duration && m.a(this.PronunciationAssessment, word.PronunciationAssessment) && m.a(this.Phonemes, word.Phonemes);
    }

    public final long getDuration() {
        return this.Duration;
    }

    public final long getOffset() {
        return this.Offset;
    }

    public final List<Phoneme> getPhonemes() {
        return this.Phonemes;
    }

    public final WordPronunciationAssessment getPronunciationAssessment() {
        return this.PronunciationAssessment;
    }

    public final String getWord() {
        return this.Word;
    }

    public int hashCode() {
        return this.Phonemes.hashCode() + ((this.PronunciationAssessment.hashCode() + defpackage.e.f(this.Duration, defpackage.e.f(this.Offset, this.Word.hashCode() * 31, 31), 31)) * 31);
    }

    public String toString() {
        String str = this.Word;
        long j11 = this.Offset;
        long j12 = this.Duration;
        WordPronunciationAssessment wordPronunciationAssessment = this.PronunciationAssessment;
        List<Phoneme> list = this.Phonemes;
        StringBuilder sbM = com.google.android.material.datepicker.d.m(j11, "Word(Word=", str, ", Offset=");
        ep.a.y(j12, ", Duration=", ", PronunciationAssessment=", sbM);
        sbM.append(wordPronunciationAssessment);
        sbM.append(", Phonemes=");
        sbM.append(list);
        sbM.append(")");
        return sbM.toString();
    }

    public Word(String Word, long j11, long j12, WordPronunciationAssessment PronunciationAssessment, List<Phoneme> Phonemes) {
        m.f(Word, "Word");
        m.f(PronunciationAssessment, "PronunciationAssessment");
        m.f(Phonemes, "Phonemes");
        this.Word = Word;
        this.Offset = j11;
        this.Duration = j12;
        this.PronunciationAssessment = PronunciationAssessment;
        this.Phonemes = Phonemes;
    }
}
