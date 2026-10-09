package com.lingodeer.data.model;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseQuestionPreferenceContext {
    private final int keyLanguage;
    private final CourseQuestionPreferenceKey questionTypeKey;

    public CourseQuestionPreferenceContext(int i11, CourseQuestionPreferenceKey questionTypeKey) {
        m.f(questionTypeKey, "questionTypeKey");
        this.keyLanguage = i11;
        this.questionTypeKey = questionTypeKey;
    }

    public static /* synthetic */ CourseQuestionPreferenceContext copy$default(CourseQuestionPreferenceContext courseQuestionPreferenceContext, int i11, CourseQuestionPreferenceKey courseQuestionPreferenceKey, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = courseQuestionPreferenceContext.keyLanguage;
        }
        if ((i12 & 2) != 0) {
            courseQuestionPreferenceKey = courseQuestionPreferenceContext.questionTypeKey;
        }
        return courseQuestionPreferenceContext.copy(i11, courseQuestionPreferenceKey);
    }

    public final int component1() {
        return this.keyLanguage;
    }

    public final CourseQuestionPreferenceKey component2() {
        return this.questionTypeKey;
    }

    public final CourseQuestionPreferenceContext copy(int i11, CourseQuestionPreferenceKey questionTypeKey) {
        m.f(questionTypeKey, "questionTypeKey");
        return new CourseQuestionPreferenceContext(i11, questionTypeKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseQuestionPreferenceContext)) {
            return false;
        }
        CourseQuestionPreferenceContext courseQuestionPreferenceContext = (CourseQuestionPreferenceContext) obj;
        return this.keyLanguage == courseQuestionPreferenceContext.keyLanguage && this.questionTypeKey == courseQuestionPreferenceContext.questionTypeKey;
    }

    public final int getKeyLanguage() {
        return this.keyLanguage;
    }

    public final CourseQuestionPreferenceKey getQuestionTypeKey() {
        return this.questionTypeKey;
    }

    public int hashCode() {
        return this.questionTypeKey.hashCode() + (Integer.hashCode(this.keyLanguage) * 31);
    }

    public String toString() {
        return "CourseQuestionPreferenceContext(keyLanguage=" + this.keyLanguage + ", questionTypeKey=" + this.questionTypeKey + ")";
    }
}
