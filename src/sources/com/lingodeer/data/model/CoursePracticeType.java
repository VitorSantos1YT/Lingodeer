package com.lingodeer.data.model;

import yy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum CoursePracticeType {
    SYLLABLE("syllable"),
    COURSE("course"),
    COURSE_REDO("course_redo"),
    COURSE_PRACTICE_LISTENING("course_practice_listening"),
    COURSE_PRACTICE_SPEAKING("course_practice_speaking"),
    COURSE_PRACTICE_SPELLING("course_practice_spelling"),
    COURSE_PRACTICE_CHARACTER_DRILL("course_practice_character_drill"),
    COURSE_PRACTICE_COMPREHENSIVE("course_practice_comprehensive"),
    COURSE_STORY_READING("course_story_reading"),
    COURSE_STORY_SPEAKING("course_story_speaking"),
    COURSE_STORY_LEADERBOARD("course_story_leaderboard"),
    COURSE_DIALOG_WARM_UP("course_dialog_warm_up"),
    COURSE_DIALOG_PRACTICE("course_dialog_practice"),
    COURSE_DIALOG_SPEAKING("course_dialog_speaking"),
    COURSE_REVIEW_FLASHCARD("course_review_flashcard"),
    COURSE_REVIEW_WORD_SENT("course_review_word_sent"),
    COURSE_REVIEW_5_MIN_QUIZ("course_review_5_min_quiz"),
    COURSE_TEST_OUT("course_test_out"),
    COURSE_TEST_OUT_REVIEW("course_test_out_review"),
    FLUENT_READING("fluent_reading"),
    FLUENT_SPEAKING("fluent_speaking"),
    FLUENT_WRITING("fluent_writing"),
    CHARACTER_DRILL("character_drill");

    private static final /* synthetic */ a $ENTRIES = ub.a.U(values());
    private final String value;

    CoursePracticeType(String str) {
        this.value = str;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
