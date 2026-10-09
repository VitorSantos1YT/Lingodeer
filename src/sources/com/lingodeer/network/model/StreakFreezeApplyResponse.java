package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import defpackage.e;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class StreakFreezeApplyResponse {
    private final JsonObject all_streakFreezer_collection;
    private final JsonObject all_streak_collection;
    private final int max_streak;
    private final int total_streakfreezer;

    public StreakFreezeApplyResponse(int i11, int i12, JsonObject all_streak_collection, JsonObject all_streakFreezer_collection) {
        m.f(all_streak_collection, "all_streak_collection");
        m.f(all_streakFreezer_collection, "all_streakFreezer_collection");
        this.max_streak = i11;
        this.total_streakfreezer = i12;
        this.all_streak_collection = all_streak_collection;
        this.all_streakFreezer_collection = all_streakFreezer_collection;
    }

    public static /* synthetic */ StreakFreezeApplyResponse copy$default(StreakFreezeApplyResponse streakFreezeApplyResponse, int i11, int i12, JsonObject jsonObject, JsonObject jsonObject2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = streakFreezeApplyResponse.max_streak;
        }
        if ((i13 & 2) != 0) {
            i12 = streakFreezeApplyResponse.total_streakfreezer;
        }
        if ((i13 & 4) != 0) {
            jsonObject = streakFreezeApplyResponse.all_streak_collection;
        }
        if ((i13 & 8) != 0) {
            jsonObject2 = streakFreezeApplyResponse.all_streakFreezer_collection;
        }
        return streakFreezeApplyResponse.copy(i11, i12, jsonObject, jsonObject2);
    }

    public final int component1() {
        return this.max_streak;
    }

    public final int component2() {
        return this.total_streakfreezer;
    }

    public final JsonObject component3() {
        return this.all_streak_collection;
    }

    public final JsonObject component4() {
        return this.all_streakFreezer_collection;
    }

    public final StreakFreezeApplyResponse copy(int i11, int i12, JsonObject all_streak_collection, JsonObject all_streakFreezer_collection) {
        m.f(all_streak_collection, "all_streak_collection");
        m.f(all_streakFreezer_collection, "all_streakFreezer_collection");
        return new StreakFreezeApplyResponse(i11, i12, all_streak_collection, all_streakFreezer_collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakFreezeApplyResponse)) {
            return false;
        }
        StreakFreezeApplyResponse streakFreezeApplyResponse = (StreakFreezeApplyResponse) obj;
        return this.max_streak == streakFreezeApplyResponse.max_streak && this.total_streakfreezer == streakFreezeApplyResponse.total_streakfreezer && m.a(this.all_streak_collection, streakFreezeApplyResponse.all_streak_collection) && m.a(this.all_streakFreezer_collection, streakFreezeApplyResponse.all_streakFreezer_collection);
    }

    public final JsonObject getAll_streakFreezer_collection() {
        return this.all_streakFreezer_collection;
    }

    public final JsonObject getAll_streak_collection() {
        return this.all_streak_collection;
    }

    public final int getMax_streak() {
        return this.max_streak;
    }

    public final int getTotal_streakfreezer() {
        return this.total_streakfreezer;
    }

    public int hashCode() {
        return this.all_streakFreezer_collection.hashCode() + ((this.all_streak_collection.hashCode() + e.b(this.total_streakfreezer, Integer.hashCode(this.max_streak) * 31, 31)) * 31);
    }

    public String toString() {
        int i11 = this.max_streak;
        int i12 = this.total_streakfreezer;
        JsonObject jsonObject = this.all_streak_collection;
        JsonObject jsonObject2 = this.all_streakFreezer_collection;
        StringBuilder sbK = c.k("StreakFreezeApplyResponse(max_streak=", i11, ", total_streakfreezer=", i12, ", all_streak_collection=");
        sbK.append(jsonObject);
        sbK.append(", all_streakFreezer_collection=");
        sbK.append(jsonObject2);
        sbK.append(")");
        return sbK.toString();
    }
}
