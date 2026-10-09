package com.lingodeer.data.model;

import yy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum DailyStreakType {
    STUDY("study"),
    STREAK_SAVED("streaksaved"),
    STREAK_FREEZER("streakfreezed");

    private static final /* synthetic */ a $ENTRIES = ub.a.U(values());
    private final String value;

    DailyStreakType(String str) {
        this.value = str;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
