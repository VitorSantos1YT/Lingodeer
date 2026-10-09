package com.lingo.lingoskill.object;

import b7.e0;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JaKanaStrokeData {
    private final String character;
    private final List<List<List<Integer>>> medians;
    private final List<String> strokes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final JaKanaStrokeData fromJson(String json) {
            m.f(json, "json");
            try {
                return (JaKanaStrokeData) new Gson().fromJson(json, JaKanaStrokeData.class);
            } catch (JsonSyntaxException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JaKanaStrokeData(String character, List<String> strokes, List<? extends List<? extends List<Integer>>> medians) {
        m.f(character, "character");
        m.f(strokes, "strokes");
        m.f(medians, "medians");
        this.character = character;
        this.strokes = strokes;
        this.medians = medians;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JaKanaStrokeData copy$default(JaKanaStrokeData jaKanaStrokeData, String str, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jaKanaStrokeData.character;
        }
        if ((i11 & 2) != 0) {
            list = jaKanaStrokeData.strokes;
        }
        if ((i11 & 4) != 0) {
            list2 = jaKanaStrokeData.medians;
        }
        return jaKanaStrokeData.copy(str, list, list2);
    }

    public final String component1() {
        return this.character;
    }

    public final List<String> component2() {
        return this.strokes;
    }

    public final List<List<List<Integer>>> component3() {
        return this.medians;
    }

    public final JaKanaStrokeData copy(String character, List<String> strokes, List<? extends List<? extends List<Integer>>> medians) {
        m.f(character, "character");
        m.f(strokes, "strokes");
        m.f(medians, "medians");
        return new JaKanaStrokeData(character, strokes, medians);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JaKanaStrokeData)) {
            return false;
        }
        JaKanaStrokeData jaKanaStrokeData = (JaKanaStrokeData) obj;
        return m.a(this.character, jaKanaStrokeData.character) && m.a(this.strokes, jaKanaStrokeData.strokes) && m.a(this.medians, jaKanaStrokeData.medians);
    }

    public final String getCharacter() {
        return this.character;
    }

    public final List<List<List<Integer>>> getMedians() {
        return this.medians;
    }

    public final List<String> getStrokes() {
        return this.strokes;
    }

    public int hashCode() {
        return this.medians.hashCode() + p0.b(this.character.hashCode() * 31, 31, this.strokes);
    }

    public final String toDrillJson() {
        try {
            String json = new Gson().toJson(this);
            m.c(json);
            return json;
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public String toString() {
        String str = this.character;
        List<String> list = this.strokes;
        List<List<List<Integer>>> list2 = this.medians;
        StringBuilder sb2 = new StringBuilder("JaKanaStrokeData(character=");
        sb2.append(str);
        sb2.append(", strokes=");
        sb2.append(list);
        sb2.append(", medians=");
        return e0.n(sb2, list2, ")");
    }
}
