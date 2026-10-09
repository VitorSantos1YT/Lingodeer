package com.lingodeer.data.model.chinesetone;

import yy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum ExerciseType {
    IMAGE_SELECTION("010", "图片选择练习"),
    AUDIO_SELECTION("020", "音频选择练习");

    private static final /* synthetic */ a $ENTRIES = ub.a.U(values());
    private final String code;
    private final String displayName;

    ExerciseType(String str, String str2) {
        this.code = str;
        this.displayName = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDisplayName() {
        return this.displayName;
    }
}
