package com.lingodeer.data.model;

import yy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum CourseQuestionPreferenceKey {
    VOCAB_M5("vocab_m5", true, false, false, false),
    CHAR_CN("char_cn", true, true, false, false),
    VOCAB_M1("vocab_m1", false, false, false, true),
    VOCAB_M2("vocab_m2", false, false, false, true),
    VOCAB_M6("vocab_m6", false, false, false, true),
    VOCAB_M8("vocab_m8", true, false, false, false),
    VOCAB_M9("vocab_m9", true, false, false, false),
    SPEAKING_M7_SHARED("speaking_m7_shared", true, true, true, false),
    TRANSLATION_SPELLING_SHARED("translation_spelling_shared", true, true, false, false),
    SENTENCE_M0("sentence_m0", true, true, false, false),
    SENTENCE_M3("sentence_m3", true, true, false, false),
    SENTENCE_M4("sentence_m4", false, false, false, true),
    SENTENCE_M5("sentence_m5", true, true, false, true),
    SENTENCE_M8("sentence_m8", true, true, false, false),
    SENTENCE_M10("sentence_m10", true, true, false, true),
    SENTENCE_MQA("sentence_mqa", true, true, false, true);

    private static final /* synthetic */ a $ENTRIES = ub.a.U(values());
    private final boolean supportsAudio;
    private final boolean supportsOptionTapAudio;
    private final boolean supportsOriginalSentence;
    private final boolean supportsTranslation;
    private final String wireName;

    CourseQuestionPreferenceKey(String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.wireName = str;
        this.supportsAudio = z11;
        this.supportsTranslation = z12;
        this.supportsOriginalSentence = z13;
        this.supportsOptionTapAudio = z14;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final boolean getSupportsAudio() {
        return this.supportsAudio;
    }

    public final boolean getSupportsOptionTapAudio() {
        return this.supportsOptionTapAudio;
    }

    public final boolean getSupportsOriginalSentence() {
        return this.supportsOriginalSentence;
    }

    public final boolean getSupportsTranslation() {
        return this.supportsTranslation;
    }

    public final String getWireName() {
        return this.wireName;
    }
}
