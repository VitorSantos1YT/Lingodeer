package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseQuestionPreference {
    private final CourseAudioMode audioMode;
    private final int keyLanguage;
    private final boolean optionTapAudioEnabled;
    private final CourseVisibilityMode originalVisibility;
    private final CourseQuestionPreferenceKey questionTypeKey;
    private final CourseVisibilityMode translationVisibility;
    private final long updatedAt;

    public CourseQuestionPreference(int i11, CourseQuestionPreferenceKey questionTypeKey, CourseAudioMode audioMode, CourseVisibilityMode translationVisibility, CourseVisibilityMode originalVisibility, boolean z11, long j11) {
        m.f(questionTypeKey, "questionTypeKey");
        m.f(audioMode, "audioMode");
        m.f(translationVisibility, "translationVisibility");
        m.f(originalVisibility, "originalVisibility");
        this.keyLanguage = i11;
        this.questionTypeKey = questionTypeKey;
        this.audioMode = audioMode;
        this.translationVisibility = translationVisibility;
        this.originalVisibility = originalVisibility;
        this.optionTapAudioEnabled = z11;
        this.updatedAt = j11;
    }

    public static /* synthetic */ CourseQuestionPreference copy$default(CourseQuestionPreference courseQuestionPreference, int i11, CourseQuestionPreferenceKey courseQuestionPreferenceKey, CourseAudioMode courseAudioMode, CourseVisibilityMode courseVisibilityMode, CourseVisibilityMode courseVisibilityMode2, boolean z11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = courseQuestionPreference.keyLanguage;
        }
        if ((i12 & 2) != 0) {
            courseQuestionPreferenceKey = courseQuestionPreference.questionTypeKey;
        }
        if ((i12 & 4) != 0) {
            courseAudioMode = courseQuestionPreference.audioMode;
        }
        if ((i12 & 8) != 0) {
            courseVisibilityMode = courseQuestionPreference.translationVisibility;
        }
        if ((i12 & 16) != 0) {
            courseVisibilityMode2 = courseQuestionPreference.originalVisibility;
        }
        if ((i12 & 32) != 0) {
            z11 = courseQuestionPreference.optionTapAudioEnabled;
        }
        if ((i12 & 64) != 0) {
            j11 = courseQuestionPreference.updatedAt;
        }
        long j12 = j11;
        CourseVisibilityMode courseVisibilityMode3 = courseVisibilityMode2;
        boolean z12 = z11;
        return courseQuestionPreference.copy(i11, courseQuestionPreferenceKey, courseAudioMode, courseVisibilityMode, courseVisibilityMode3, z12, j12);
    }

    public final int component1() {
        return this.keyLanguage;
    }

    public final CourseQuestionPreferenceKey component2() {
        return this.questionTypeKey;
    }

    public final CourseAudioMode component3() {
        return this.audioMode;
    }

    public final CourseVisibilityMode component4() {
        return this.translationVisibility;
    }

    public final CourseVisibilityMode component5() {
        return this.originalVisibility;
    }

    public final boolean component6() {
        return this.optionTapAudioEnabled;
    }

    public final long component7() {
        return this.updatedAt;
    }

    public final CourseQuestionPreference copy(int i11, CourseQuestionPreferenceKey questionTypeKey, CourseAudioMode audioMode, CourseVisibilityMode translationVisibility, CourseVisibilityMode originalVisibility, boolean z11, long j11) {
        m.f(questionTypeKey, "questionTypeKey");
        m.f(audioMode, "audioMode");
        m.f(translationVisibility, "translationVisibility");
        m.f(originalVisibility, "originalVisibility");
        return new CourseQuestionPreference(i11, questionTypeKey, audioMode, translationVisibility, originalVisibility, z11, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseQuestionPreference)) {
            return false;
        }
        CourseQuestionPreference courseQuestionPreference = (CourseQuestionPreference) obj;
        return this.keyLanguage == courseQuestionPreference.keyLanguage && this.questionTypeKey == courseQuestionPreference.questionTypeKey && this.audioMode == courseQuestionPreference.audioMode && this.translationVisibility == courseQuestionPreference.translationVisibility && this.originalVisibility == courseQuestionPreference.originalVisibility && this.optionTapAudioEnabled == courseQuestionPreference.optionTapAudioEnabled && this.updatedAt == courseQuestionPreference.updatedAt;
    }

    public final CourseAudioMode getAudioMode() {
        return this.audioMode;
    }

    public final int getKeyLanguage() {
        return this.keyLanguage;
    }

    public final boolean getOptionTapAudioEnabled() {
        return this.optionTapAudioEnabled;
    }

    public final CourseVisibilityMode getOriginalVisibility() {
        return this.originalVisibility;
    }

    public final CourseQuestionPreferenceKey getQuestionTypeKey() {
        return this.questionTypeKey;
    }

    public final CourseVisibilityMode getTranslationVisibility() {
        return this.translationVisibility;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return Long.hashCode(this.updatedAt) + e.e((this.originalVisibility.hashCode() + ((this.translationVisibility.hashCode() + ((this.audioMode.hashCode() + ((this.questionTypeKey.hashCode() + (Integer.hashCode(this.keyLanguage) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.optionTapAudioEnabled);
    }

    public String toString() {
        int i11 = this.keyLanguage;
        CourseQuestionPreferenceKey courseQuestionPreferenceKey = this.questionTypeKey;
        CourseAudioMode courseAudioMode = this.audioMode;
        CourseVisibilityMode courseVisibilityMode = this.translationVisibility;
        CourseVisibilityMode courseVisibilityMode2 = this.originalVisibility;
        boolean z11 = this.optionTapAudioEnabled;
        long j11 = this.updatedAt;
        StringBuilder sb2 = new StringBuilder("CourseQuestionPreference(keyLanguage=");
        sb2.append(i11);
        sb2.append(", questionTypeKey=");
        sb2.append(courseQuestionPreferenceKey);
        sb2.append(", audioMode=");
        sb2.append(courseAudioMode);
        sb2.append(", translationVisibility=");
        sb2.append(courseVisibilityMode);
        sb2.append(", originalVisibility=");
        sb2.append(courseVisibilityMode2);
        sb2.append(", optionTapAudioEnabled=");
        sb2.append(z11);
        sb2.append(", updatedAt=");
        return e.i(j11, ")", sb2);
    }
}
