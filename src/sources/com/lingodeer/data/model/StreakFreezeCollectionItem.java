package com.lingodeer.data.model;

import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class StreakFreezeCollectionItem {
    private final int amount;
    private final String date;
    private final String type;

    public StreakFreezeCollectionItem(String date, String type, int i11) {
        m.f(date, "date");
        m.f(type, "type");
        this.date = date;
        this.type = type;
        this.amount = i11;
    }

    public static /* synthetic */ StreakFreezeCollectionItem copy$default(StreakFreezeCollectionItem streakFreezeCollectionItem, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = streakFreezeCollectionItem.date;
        }
        if ((i12 & 2) != 0) {
            str2 = streakFreezeCollectionItem.type;
        }
        if ((i12 & 4) != 0) {
            i11 = streakFreezeCollectionItem.amount;
        }
        return streakFreezeCollectionItem.copy(str, str2, i11);
    }

    public final String component1() {
        return this.date;
    }

    public final String component2() {
        return this.type;
    }

    public final int component3() {
        return this.amount;
    }

    public final StreakFreezeCollectionItem copy(String date, String type, int i11) {
        m.f(date, "date");
        m.f(type, "type");
        return new StreakFreezeCollectionItem(date, type, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakFreezeCollectionItem)) {
            return false;
        }
        StreakFreezeCollectionItem streakFreezeCollectionItem = (StreakFreezeCollectionItem) obj;
        return m.a(this.date, streakFreezeCollectionItem.date) && m.a(this.type, streakFreezeCollectionItem.type) && this.amount == streakFreezeCollectionItem.amount;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.amount) + e.d(this.date.hashCode() * 31, 31, this.type);
    }

    public String toString() {
        return p0.i(this.amount, ")", e.s("StreakFreezeCollectionItem(date=", this.date, ", type=", this.type, ", amount="));
    }
}
