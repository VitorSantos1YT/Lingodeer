package com.lingodeer.syllable_ko.model;

import c00.a;
import c00.e;
import com.google.android.material.datepicker.d;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class KOSyllableSoundChangeLessonData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String lesson;
    private final String pronunciation;
    private final String romanization;
    private final String type;
    private final String word;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return KOSyllableSoundChangeLessonData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ KOSyllableSoundChangeLessonData(int i11, String str, String str2, String str3, String str4, String str5, o1 o1Var) {
        if (31 != (i11 & 31)) {
            d1.k(i11, 31, KOSyllableSoundChangeLessonData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.lesson = str;
        this.type = str2;
        this.word = str3;
        this.pronunciation = str4;
        this.romanization = str5;
    }

    public static /* synthetic */ KOSyllableSoundChangeLessonData copy$default(KOSyllableSoundChangeLessonData kOSyllableSoundChangeLessonData, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kOSyllableSoundChangeLessonData.lesson;
        }
        if ((i11 & 2) != 0) {
            str2 = kOSyllableSoundChangeLessonData.type;
        }
        if ((i11 & 4) != 0) {
            str3 = kOSyllableSoundChangeLessonData.word;
        }
        if ((i11 & 8) != 0) {
            str4 = kOSyllableSoundChangeLessonData.pronunciation;
        }
        if ((i11 & 16) != 0) {
            str5 = kOSyllableSoundChangeLessonData.romanization;
        }
        String str6 = str5;
        String str7 = str3;
        return kOSyllableSoundChangeLessonData.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$syllable_ko_release(KOSyllableSoundChangeLessonData kOSyllableSoundChangeLessonData, b bVar, g gVar) {
        bVar.w(gVar, 0, kOSyllableSoundChangeLessonData.lesson);
        bVar.w(gVar, 1, kOSyllableSoundChangeLessonData.type);
        bVar.w(gVar, 2, kOSyllableSoundChangeLessonData.word);
        bVar.w(gVar, 3, kOSyllableSoundChangeLessonData.pronunciation);
        bVar.w(gVar, 4, kOSyllableSoundChangeLessonData.romanization);
    }

    public final String component1() {
        return this.lesson;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.word;
    }

    public final String component4() {
        return this.pronunciation;
    }

    public final String component5() {
        return this.romanization;
    }

    public final KOSyllableSoundChangeLessonData copy(String lesson, String type, String word, String pronunciation, String romanization) {
        m.f(lesson, "lesson");
        m.f(type, "type");
        m.f(word, "word");
        m.f(pronunciation, "pronunciation");
        m.f(romanization, "romanization");
        return new KOSyllableSoundChangeLessonData(lesson, type, word, pronunciation, romanization);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KOSyllableSoundChangeLessonData)) {
            return false;
        }
        KOSyllableSoundChangeLessonData kOSyllableSoundChangeLessonData = (KOSyllableSoundChangeLessonData) obj;
        return m.a(this.lesson, kOSyllableSoundChangeLessonData.lesson) && m.a(this.type, kOSyllableSoundChangeLessonData.type) && m.a(this.word, kOSyllableSoundChangeLessonData.word) && m.a(this.pronunciation, kOSyllableSoundChangeLessonData.pronunciation) && m.a(this.romanization, kOSyllableSoundChangeLessonData.romanization);
    }

    public final String getLesson() {
        return this.lesson;
    }

    public final String getPronunciation() {
        return this.pronunciation;
    }

    public final String getRomanization() {
        return this.romanization;
    }

    public final String getType() {
        return this.type;
    }

    public final String getWord() {
        return this.word;
    }

    public int hashCode() {
        return this.romanization.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(this.lesson.hashCode() * 31, 31, this.type), 31, this.word), 31, this.pronunciation);
    }

    public String toString() {
        String str = this.lesson;
        String str2 = this.type;
        String str3 = this.word;
        String str4 = this.pronunciation;
        String str5 = this.romanization;
        StringBuilder sbS = defpackage.e.s("KOSyllableSoundChangeLessonData(lesson=", str, ", type=", str2, ", word=");
        d.w(sbS, str3, ", pronunciation=", str4, ", romanization=");
        return ep.a.k(sbS, str5, ")");
    }

    public KOSyllableSoundChangeLessonData(String lesson, String type, String word, String pronunciation, String romanization) {
        m.f(lesson, "lesson");
        m.f(type, "type");
        m.f(word, "word");
        m.f(pronunciation, "pronunciation");
        m.f(romanization, "romanization");
        this.lesson = lesson;
        this.type = type;
        this.word = word;
        this.pronunciation = pronunciation;
        this.romanization = romanization;
    }

    public static /* synthetic */ void getLesson$annotations() {
    }

    public static /* synthetic */ void getPronunciation$annotations() {
    }

    public static /* synthetic */ void getRomanization$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getWord$annotations() {
    }
}
