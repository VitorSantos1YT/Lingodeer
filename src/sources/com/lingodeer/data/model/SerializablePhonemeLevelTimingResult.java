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
public final class SerializablePhonemeLevelTimingResult {
    public static final Companion Companion = new Companion(null);
    private final double accuracyScore;
    private final String phoneme;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return SerializablePhonemeLevelTimingResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ SerializablePhonemeLevelTimingResult(int i11, String str, double d5, o1 o1Var) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, SerializablePhonemeLevelTimingResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.phoneme = str;
        this.accuracyScore = d5;
    }

    public static /* synthetic */ SerializablePhonemeLevelTimingResult copy$default(SerializablePhonemeLevelTimingResult serializablePhonemeLevelTimingResult, String str, double d5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = serializablePhonemeLevelTimingResult.phoneme;
        }
        if ((i11 & 2) != 0) {
            d5 = serializablePhonemeLevelTimingResult.accuracyScore;
        }
        return serializablePhonemeLevelTimingResult.copy(str, d5);
    }

    public static final /* synthetic */ void write$Self$data_release(SerializablePhonemeLevelTimingResult serializablePhonemeLevelTimingResult, b bVar, g gVar) {
        bVar.w(gVar, 0, serializablePhonemeLevelTimingResult.phoneme);
        bVar.q(gVar, 1, serializablePhonemeLevelTimingResult.accuracyScore);
    }

    public final String component1() {
        return this.phoneme;
    }

    public final double component2() {
        return this.accuracyScore;
    }

    public final SerializablePhonemeLevelTimingResult copy(String phoneme, double d5) {
        m.f(phoneme, "phoneme");
        return new SerializablePhonemeLevelTimingResult(phoneme, d5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializablePhonemeLevelTimingResult)) {
            return false;
        }
        SerializablePhonemeLevelTimingResult serializablePhonemeLevelTimingResult = (SerializablePhonemeLevelTimingResult) obj;
        return m.a(this.phoneme, serializablePhonemeLevelTimingResult.phoneme) && Double.compare(this.accuracyScore, serializablePhonemeLevelTimingResult.accuracyScore) == 0;
    }

    public final double getAccuracyScore() {
        return this.accuracyScore;
    }

    public final String getPhoneme() {
        return this.phoneme;
    }

    public int hashCode() {
        return Double.hashCode(this.accuracyScore) + (this.phoneme.hashCode() * 31);
    }

    public String toString() {
        return "SerializablePhonemeLevelTimingResult(phoneme=" + this.phoneme + ", accuracyScore=" + this.accuracyScore + ")";
    }

    public SerializablePhonemeLevelTimingResult(String phoneme, double d5) {
        m.f(phoneme, "phoneme");
        this.phoneme = phoneme;
        this.accuracyScore = d5;
    }
}
