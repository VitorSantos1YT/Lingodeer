package com.lingodeer.data.model;

import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class StreakCollectionItem {
    private final String date;
    private final String type;

    public StreakCollectionItem(String date, String type) {
        m.f(date, "date");
        m.f(type, "type");
        this.date = date;
        this.type = type;
    }

    public static /* synthetic */ StreakCollectionItem copy$default(StreakCollectionItem streakCollectionItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = streakCollectionItem.date;
        }
        if ((i11 & 2) != 0) {
            str2 = streakCollectionItem.type;
        }
        return streakCollectionItem.copy(str, str2);
    }

    public final String component1() {
        return this.date;
    }

    public final String component2() {
        return this.type;
    }

    public final StreakCollectionItem copy(String date, String type) {
        m.f(date, "date");
        m.f(type, "type");
        return new StreakCollectionItem(date, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakCollectionItem)) {
            return false;
        }
        StreakCollectionItem streakCollectionItem = (StreakCollectionItem) obj;
        return m.a(this.date, streakCollectionItem.date) && m.a(this.type, streakCollectionItem.type);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.date.hashCode() * 31);
    }

    public String toString() {
        return a.h("StreakCollectionItem(date=", this.date, ", type=", this.type, ")");
    }
}
