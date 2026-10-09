package com.lingodeer.data.model;

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
public final class WordAccuracyScoreTimingResult {
    public static final Companion Companion = new Companion(null);
    private final SerializableTimingResult timingResult;
    private final String word;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return WordAccuracyScoreTimingResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ WordAccuracyScoreTimingResult(int i11, String str, SerializableTimingResult serializableTimingResult, o1 o1Var) {
        if (1 != (i11 & 1)) {
            d1.k(i11, 1, WordAccuracyScoreTimingResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.word = str;
        if ((i11 & 2) == 0) {
            this.timingResult = null;
        } else {
            this.timingResult = serializableTimingResult;
        }
    }

    public static /* synthetic */ WordAccuracyScoreTimingResult copy$default(WordAccuracyScoreTimingResult wordAccuracyScoreTimingResult, String str, SerializableTimingResult serializableTimingResult, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wordAccuracyScoreTimingResult.word;
        }
        if ((i11 & 2) != 0) {
            serializableTimingResult = wordAccuracyScoreTimingResult.timingResult;
        }
        return wordAccuracyScoreTimingResult.copy(str, serializableTimingResult);
    }

    public static final /* synthetic */ void write$Self$data_release(WordAccuracyScoreTimingResult wordAccuracyScoreTimingResult, b bVar, g gVar) {
        bVar.w(gVar, 0, wordAccuracyScoreTimingResult.word);
        if (!bVar.G(gVar) && wordAccuracyScoreTimingResult.timingResult == null) {
            return;
        }
        bVar.x(gVar, 1, SerializableTimingResult$$serializer.INSTANCE, wordAccuracyScoreTimingResult.timingResult);
    }

    public final String component1() {
        return this.word;
    }

    public final SerializableTimingResult component2() {
        return this.timingResult;
    }

    public final WordAccuracyScoreTimingResult copy(String word, SerializableTimingResult serializableTimingResult) {
        m.f(word, "word");
        return new WordAccuracyScoreTimingResult(word, serializableTimingResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordAccuracyScoreTimingResult)) {
            return false;
        }
        WordAccuracyScoreTimingResult wordAccuracyScoreTimingResult = (WordAccuracyScoreTimingResult) obj;
        return m.a(this.word, wordAccuracyScoreTimingResult.word) && m.a(this.timingResult, wordAccuracyScoreTimingResult.timingResult);
    }

    public final SerializableTimingResult getTimingResult() {
        return this.timingResult;
    }

    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        int iHashCode = this.word.hashCode() * 31;
        SerializableTimingResult serializableTimingResult = this.timingResult;
        return iHashCode + (serializableTimingResult == null ? 0 : serializableTimingResult.hashCode());
    }

    public String toString() {
        return "WordAccuracyScoreTimingResult(word=" + this.word + ", timingResult=" + this.timingResult + ")";
    }

    public WordAccuracyScoreTimingResult(String word, SerializableTimingResult serializableTimingResult) {
        m.f(word, "word");
        this.word = word;
        this.timingResult = serializableTimingResult;
    }

    public /* synthetic */ WordAccuracyScoreTimingResult(String str, SerializableTimingResult serializableTimingResult, int i11, f fVar) {
        this(str, (i11 & 2) != 0 ? null : serializableTimingResult);
    }
}
