package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LessonTestProgressEntity {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22381id;
    private final String learnProgress;
    private final String practiceComprehensiveProgress;
    private final String practiceListeningProgress;
    private final String practiceSpeakingProgress;
    private final String practiceSpellingProgress;
    private final String redoProgress;

    public LessonTestProgressEntity(String id2, String learnProgress, String redoProgress, String practiceListeningProgress, String practiceSpeakingProgress, String practiceSpellingProgress, String practiceComprehensiveProgress) {
        m.f(id2, "id");
        m.f(learnProgress, "learnProgress");
        m.f(redoProgress, "redoProgress");
        m.f(practiceListeningProgress, "practiceListeningProgress");
        m.f(practiceSpeakingProgress, "practiceSpeakingProgress");
        m.f(practiceSpellingProgress, "practiceSpellingProgress");
        m.f(practiceComprehensiveProgress, "practiceComprehensiveProgress");
        this.f22381id = id2;
        this.learnProgress = learnProgress;
        this.redoProgress = redoProgress;
        this.practiceListeningProgress = practiceListeningProgress;
        this.practiceSpeakingProgress = practiceSpeakingProgress;
        this.practiceSpellingProgress = practiceSpellingProgress;
        this.practiceComprehensiveProgress = practiceComprehensiveProgress;
    }

    public static /* synthetic */ LessonTestProgressEntity copy$default(LessonTestProgressEntity lessonTestProgressEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lessonTestProgressEntity.f22381id;
        }
        if ((i11 & 2) != 0) {
            str2 = lessonTestProgressEntity.learnProgress;
        }
        if ((i11 & 4) != 0) {
            str3 = lessonTestProgressEntity.redoProgress;
        }
        if ((i11 & 8) != 0) {
            str4 = lessonTestProgressEntity.practiceListeningProgress;
        }
        if ((i11 & 16) != 0) {
            str5 = lessonTestProgressEntity.practiceSpeakingProgress;
        }
        if ((i11 & 32) != 0) {
            str6 = lessonTestProgressEntity.practiceSpellingProgress;
        }
        if ((i11 & 64) != 0) {
            str7 = lessonTestProgressEntity.practiceComprehensiveProgress;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return lessonTestProgressEntity.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public final String component1() {
        return this.f22381id;
    }

    public final String component2() {
        return this.learnProgress;
    }

    public final String component3() {
        return this.redoProgress;
    }

    public final String component4() {
        return this.practiceListeningProgress;
    }

    public final String component5() {
        return this.practiceSpeakingProgress;
    }

    public final String component6() {
        return this.practiceSpellingProgress;
    }

    public final String component7() {
        return this.practiceComprehensiveProgress;
    }

    public final LessonTestProgressEntity copy(String id2, String learnProgress, String redoProgress, String practiceListeningProgress, String practiceSpeakingProgress, String practiceSpellingProgress, String practiceComprehensiveProgress) {
        m.f(id2, "id");
        m.f(learnProgress, "learnProgress");
        m.f(redoProgress, "redoProgress");
        m.f(practiceListeningProgress, "practiceListeningProgress");
        m.f(practiceSpeakingProgress, "practiceSpeakingProgress");
        m.f(practiceSpellingProgress, "practiceSpellingProgress");
        m.f(practiceComprehensiveProgress, "practiceComprehensiveProgress");
        return new LessonTestProgressEntity(id2, learnProgress, redoProgress, practiceListeningProgress, practiceSpeakingProgress, practiceSpellingProgress, practiceComprehensiveProgress);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonTestProgressEntity)) {
            return false;
        }
        LessonTestProgressEntity lessonTestProgressEntity = (LessonTestProgressEntity) obj;
        return m.a(this.f22381id, lessonTestProgressEntity.f22381id) && m.a(this.learnProgress, lessonTestProgressEntity.learnProgress) && m.a(this.redoProgress, lessonTestProgressEntity.redoProgress) && m.a(this.practiceListeningProgress, lessonTestProgressEntity.practiceListeningProgress) && m.a(this.practiceSpeakingProgress, lessonTestProgressEntity.practiceSpeakingProgress) && m.a(this.practiceSpellingProgress, lessonTestProgressEntity.practiceSpellingProgress) && m.a(this.practiceComprehensiveProgress, lessonTestProgressEntity.practiceComprehensiveProgress);
    }

    public final String getId() {
        return this.f22381id;
    }

    public final String getLearnProgress() {
        return this.learnProgress;
    }

    public final String getPracticeComprehensiveProgress() {
        return this.practiceComprehensiveProgress;
    }

    public final String getPracticeListeningProgress() {
        return this.practiceListeningProgress;
    }

    public final String getPracticeSpeakingProgress() {
        return this.practiceSpeakingProgress;
    }

    public final String getPracticeSpellingProgress() {
        return this.practiceSpellingProgress;
    }

    public final String getRedoProgress() {
        return this.redoProgress;
    }

    public int hashCode() {
        return this.practiceComprehensiveProgress.hashCode() + e.d(e.d(e.d(e.d(e.d(this.f22381id.hashCode() * 31, 31, this.learnProgress), 31, this.redoProgress), 31, this.practiceListeningProgress), 31, this.practiceSpeakingProgress), 31, this.practiceSpellingProgress);
    }

    public String toString() {
        String str = this.f22381id;
        String str2 = this.learnProgress;
        String str3 = this.redoProgress;
        String str4 = this.practiceListeningProgress;
        String str5 = this.practiceSpeakingProgress;
        String str6 = this.practiceSpellingProgress;
        String str7 = this.practiceComprehensiveProgress;
        StringBuilder sbS = e.s("LessonTestProgressEntity(id=", str, ", learnProgress=", str2, ", redoProgress=");
        d.w(sbS, str3, ", practiceListeningProgress=", str4, ", practiceSpeakingProgress=");
        d.w(sbS, str5, ", practiceSpellingProgress=", str6, ", practiceComprehensiveProgress=");
        return a.k(sbS, str7, ")");
    }
}
