package com.lingodeer.data.env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ScriptStyleInAnswerKt {
    public static final int SCRIPT_STYLE_IN_ANSWER_FOLLOW_QUESTION = -100;

    public static final boolean isScriptStyleInAnswerFollowingQuestion(int i11) {
        return i11 == -100;
    }

    public static final int resolveScriptStyleInAnswer(int i11, int i12) {
        return i11 == -100 ? i12 : i11;
    }
}
