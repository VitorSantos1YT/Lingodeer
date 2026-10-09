package com.lingodeer.data.model;

import bq.u;
import c00.a;
import c00.e;
import com.bumptech.glide.d;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class SerializableTimingResult {
    private static final h[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final double accuracyScore;
    private final String errorType;
    private final List<SerializablePhonemeLevelTimingResult> phonemes;
    private final List<SerializableSyllableLevelTimingResult> syllables;
    private final String word;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return SerializableTimingResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        j jVar = j.PUBLICATION;
        $childSerializers = new h[]{null, null, null, d.u(jVar, new u(24)), d.u(jVar, new u(25))};
    }

    public /* synthetic */ SerializableTimingResult(int i11, String str, double d5, String str2, List list, List list2, o1 o1Var) {
        if (31 != (i11 & 31)) {
            d1.k(i11, 31, SerializableTimingResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.word = str;
        this.accuracyScore = d5;
        this.errorType = str2;
        this.phonemes = list;
        this.syllables = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_() {
        return new g00.d(SerializablePhonemeLevelTimingResult$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ a _childSerializers$_anonymous_$0() {
        return new g00.d(SerializableSyllableLevelTimingResult$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SerializableTimingResult copy$default(SerializableTimingResult serializableTimingResult, String str, double d5, String str2, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = serializableTimingResult.word;
        }
        if ((i11 & 2) != 0) {
            d5 = serializableTimingResult.accuracyScore;
        }
        if ((i11 & 4) != 0) {
            str2 = serializableTimingResult.errorType;
        }
        if ((i11 & 8) != 0) {
            list = serializableTimingResult.phonemes;
        }
        if ((i11 & 16) != 0) {
            list2 = serializableTimingResult.syllables;
        }
        List list3 = list2;
        String str3 = str2;
        return serializableTimingResult.copy(str, d5, str3, list, list3);
    }

    public static final /* synthetic */ void write$Self$data_release(SerializableTimingResult serializableTimingResult, b bVar, g gVar) {
        h[] hVarArr = $childSerializers;
        bVar.w(gVar, 0, serializableTimingResult.word);
        bVar.q(gVar, 1, serializableTimingResult.accuracyScore);
        bVar.w(gVar, 2, serializableTimingResult.errorType);
        bVar.A(gVar, 3, (a) hVarArr[3].getValue(), serializableTimingResult.phonemes);
        bVar.A(gVar, 4, (a) hVarArr[4].getValue(), serializableTimingResult.syllables);
    }

    public final String component1() {
        return this.word;
    }

    public final double component2() {
        return this.accuracyScore;
    }

    public final String component3() {
        return this.errorType;
    }

    public final List<SerializablePhonemeLevelTimingResult> component4() {
        return this.phonemes;
    }

    public final List<SerializableSyllableLevelTimingResult> component5() {
        return this.syllables;
    }

    public final SerializableTimingResult copy(String word, double d5, String errorType, List<SerializablePhonemeLevelTimingResult> phonemes, List<SerializableSyllableLevelTimingResult> syllables) {
        m.f(word, "word");
        m.f(errorType, "errorType");
        m.f(phonemes, "phonemes");
        m.f(syllables, "syllables");
        return new SerializableTimingResult(word, d5, errorType, phonemes, syllables);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableTimingResult)) {
            return false;
        }
        SerializableTimingResult serializableTimingResult = (SerializableTimingResult) obj;
        return m.a(this.word, serializableTimingResult.word) && Double.compare(this.accuracyScore, serializableTimingResult.accuracyScore) == 0 && m.a(this.errorType, serializableTimingResult.errorType) && m.a(this.phonemes, serializableTimingResult.phonemes) && m.a(this.syllables, serializableTimingResult.syllables);
    }

    public final double getAccuracyScore() {
        return this.accuracyScore;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final List<SerializablePhonemeLevelTimingResult> getPhonemes() {
        return this.phonemes;
    }

    public final List<SerializableSyllableLevelTimingResult> getSyllables() {
        return this.syllables;
    }

    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        return this.syllables.hashCode() + p0.b(defpackage.e.d((Double.hashCode(this.accuracyScore) + (this.word.hashCode() * 31)) * 31, 31, this.errorType), 31, this.phonemes);
    }

    public String toString() {
        return "SerializableTimingResult(word=" + this.word + ", accuracyScore=" + this.accuracyScore + ", errorType=" + this.errorType + ", phonemes=" + this.phonemes + ", syllables=" + this.syllables + ")";
    }

    public SerializableTimingResult(String word, double d5, String errorType, List<SerializablePhonemeLevelTimingResult> phonemes, List<SerializableSyllableLevelTimingResult> syllables) {
        m.f(word, "word");
        m.f(errorType, "errorType");
        m.f(phonemes, "phonemes");
        m.f(syllables, "syllables");
        this.word = word;
        this.accuracyScore = d5;
        this.errorType = errorType;
        this.phonemes = phonemes;
        this.syllables = syllables;
    }
}
