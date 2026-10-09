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
public final class KOSyllableLessonData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String character;
    private final String lesson;
    private final String option1;
    private final String option2;
    private final String option3;
    private final String type;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return KOSyllableLessonData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ KOSyllableLessonData(int i11, String str, String str2, String str3, String str4, String str5, String str6, o1 o1Var) {
        if (63 != (i11 & 63)) {
            d1.k(i11, 63, KOSyllableLessonData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.lesson = str;
        this.type = str2;
        this.character = str3;
        this.option1 = str4;
        this.option2 = str5;
        this.option3 = str6;
    }

    public static /* synthetic */ KOSyllableLessonData copy$default(KOSyllableLessonData kOSyllableLessonData, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kOSyllableLessonData.lesson;
        }
        if ((i11 & 2) != 0) {
            str2 = kOSyllableLessonData.type;
        }
        if ((i11 & 4) != 0) {
            str3 = kOSyllableLessonData.character;
        }
        if ((i11 & 8) != 0) {
            str4 = kOSyllableLessonData.option1;
        }
        if ((i11 & 16) != 0) {
            str5 = kOSyllableLessonData.option2;
        }
        if ((i11 & 32) != 0) {
            str6 = kOSyllableLessonData.option3;
        }
        String str7 = str5;
        String str8 = str6;
        return kOSyllableLessonData.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$syllable_ko_release(KOSyllableLessonData kOSyllableLessonData, b bVar, g gVar) {
        bVar.w(gVar, 0, kOSyllableLessonData.lesson);
        bVar.w(gVar, 1, kOSyllableLessonData.type);
        bVar.w(gVar, 2, kOSyllableLessonData.character);
        bVar.w(gVar, 3, kOSyllableLessonData.option1);
        bVar.w(gVar, 4, kOSyllableLessonData.option2);
        bVar.w(gVar, 5, kOSyllableLessonData.option3);
    }

    public final String component1() {
        return this.lesson;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.character;
    }

    public final String component4() {
        return this.option1;
    }

    public final String component5() {
        return this.option2;
    }

    public final String component6() {
        return this.option3;
    }

    public final KOSyllableLessonData copy(String lesson, String type, String character, String option1, String option2, String option3) {
        m.f(lesson, "lesson");
        m.f(type, "type");
        m.f(character, "character");
        m.f(option1, "option1");
        m.f(option2, "option2");
        m.f(option3, "option3");
        return new KOSyllableLessonData(lesson, type, character, option1, option2, option3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KOSyllableLessonData)) {
            return false;
        }
        KOSyllableLessonData kOSyllableLessonData = (KOSyllableLessonData) obj;
        return m.a(this.lesson, kOSyllableLessonData.lesson) && m.a(this.type, kOSyllableLessonData.type) && m.a(this.character, kOSyllableLessonData.character) && m.a(this.option1, kOSyllableLessonData.option1) && m.a(this.option2, kOSyllableLessonData.option2) && m.a(this.option3, kOSyllableLessonData.option3);
    }

    public final String getCharacter() {
        return this.character;
    }

    public final String getLesson() {
        return this.lesson;
    }

    public final String getOption1() {
        return this.option1;
    }

    public final String getOption2() {
        return this.option2;
    }

    public final String getOption3() {
        return this.option3;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.option3.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(this.lesson.hashCode() * 31, 31, this.type), 31, this.character), 31, this.option1), 31, this.option2);
    }

    public String toString() {
        String str = this.lesson;
        String str2 = this.type;
        String str3 = this.character;
        String str4 = this.option1;
        String str5 = this.option2;
        String str6 = this.option3;
        StringBuilder sbS = defpackage.e.s("KOSyllableLessonData(lesson=", str, ", type=", str2, ", character=");
        d.w(sbS, str3, ", option1=", str4, ", option2=");
        return defpackage.e.p(sbS, str5, ", option3=", str6, ")");
    }

    public KOSyllableLessonData(String lesson, String type, String character, String option1, String option2, String option3) {
        m.f(lesson, "lesson");
        m.f(type, "type");
        m.f(character, "character");
        m.f(option1, "option1");
        m.f(option2, "option2");
        m.f(option3, "option3");
        this.lesson = lesson;
        this.type = type;
        this.character = character;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    public static /* synthetic */ void getCharacter$annotations() {
    }

    public static /* synthetic */ void getLesson$annotations() {
    }

    public static /* synthetic */ void getOption1$annotations() {
    }

    public static /* synthetic */ void getOption2$annotations() {
    }

    public static /* synthetic */ void getOption3$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }
}
