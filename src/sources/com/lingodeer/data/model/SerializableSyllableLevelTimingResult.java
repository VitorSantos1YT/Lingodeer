package com.lingodeer.data.model;

import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class SerializableSyllableLevelTimingResult {
    public static final Companion Companion = new Companion(null);
    private final double accuracyScore;
    private final String grapheme;
    private final String syllable;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return SerializableSyllableLevelTimingResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ SerializableSyllableLevelTimingResult(int i11, String str, double d5, String str2, o1 o1Var) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, SerializableSyllableLevelTimingResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.syllable = str;
        this.accuracyScore = d5;
        this.grapheme = str2;
    }

    public static /* synthetic */ SerializableSyllableLevelTimingResult copy$default(SerializableSyllableLevelTimingResult serializableSyllableLevelTimingResult, String str, double d5, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = serializableSyllableLevelTimingResult.syllable;
        }
        if ((i11 & 2) != 0) {
            d5 = serializableSyllableLevelTimingResult.accuracyScore;
        }
        if ((i11 & 4) != 0) {
            str2 = serializableSyllableLevelTimingResult.grapheme;
        }
        return serializableSyllableLevelTimingResult.copy(str, d5, str2);
    }

    public static final /* synthetic */ void write$Self$data_release(SerializableSyllableLevelTimingResult serializableSyllableLevelTimingResult, b bVar, g gVar) {
        bVar.w(gVar, 0, serializableSyllableLevelTimingResult.syllable);
        bVar.q(gVar, 1, serializableSyllableLevelTimingResult.accuracyScore);
        bVar.w(gVar, 2, serializableSyllableLevelTimingResult.grapheme);
    }

    public final String component1() {
        return this.syllable;
    }

    public final double component2() {
        return this.accuracyScore;
    }

    public final String component3() {
        return this.grapheme;
    }

    public final SerializableSyllableLevelTimingResult copy(String syllable, double d5, String grapheme) {
        m.f(syllable, "syllable");
        m.f(grapheme, "grapheme");
        return new SerializableSyllableLevelTimingResult(syllable, d5, grapheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableSyllableLevelTimingResult)) {
            return false;
        }
        SerializableSyllableLevelTimingResult serializableSyllableLevelTimingResult = (SerializableSyllableLevelTimingResult) obj;
        return m.a(this.syllable, serializableSyllableLevelTimingResult.syllable) && Double.compare(this.accuracyScore, serializableSyllableLevelTimingResult.accuracyScore) == 0 && m.a(this.grapheme, serializableSyllableLevelTimingResult.grapheme);
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
        return this.grapheme.hashCode() + ((Double.hashCode(this.accuracyScore) + (this.syllable.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.syllable;
        double d5 = this.accuracyScore;
        String str2 = this.grapheme;
        StringBuilder sb2 = new StringBuilder("SerializableSyllableLevelTimingResult(syllable=");
        sb2.append(str);
        sb2.append(", accuracyScore=");
        sb2.append(d5);
        return p.u(sb2, ", grapheme=", str2, ")");
    }

    public SerializableSyllableLevelTimingResult(String syllable, double d5, String grapheme) {
        m.f(syllable, "syllable");
        m.f(grapheme, "grapheme");
        this.syllable = syllable;
        this.accuracyScore = d5;
        this.grapheme = grapheme;
    }
}
