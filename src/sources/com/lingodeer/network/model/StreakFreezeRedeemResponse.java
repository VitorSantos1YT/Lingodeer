package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import defpackage.e;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class StreakFreezeRedeemResponse {
    private final JsonObject all_streakfreezer_collection;
    private final int total_gems;
    private final int total_streakfreezer;

    public StreakFreezeRedeemResponse(int i11, int i12, JsonObject all_streakfreezer_collection) {
        m.f(all_streakfreezer_collection, "all_streakfreezer_collection");
        this.total_gems = i11;
        this.total_streakfreezer = i12;
        this.all_streakfreezer_collection = all_streakfreezer_collection;
    }

    public static /* synthetic */ StreakFreezeRedeemResponse copy$default(StreakFreezeRedeemResponse streakFreezeRedeemResponse, int i11, int i12, JsonObject jsonObject, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = streakFreezeRedeemResponse.total_gems;
        }
        if ((i13 & 2) != 0) {
            i12 = streakFreezeRedeemResponse.total_streakfreezer;
        }
        if ((i13 & 4) != 0) {
            jsonObject = streakFreezeRedeemResponse.all_streakfreezer_collection;
        }
        return streakFreezeRedeemResponse.copy(i11, i12, jsonObject);
    }

    public final int component1() {
        return this.total_gems;
    }

    public final int component2() {
        return this.total_streakfreezer;
    }

    public final JsonObject component3() {
        return this.all_streakfreezer_collection;
    }

    public final StreakFreezeRedeemResponse copy(int i11, int i12, JsonObject all_streakfreezer_collection) {
        m.f(all_streakfreezer_collection, "all_streakfreezer_collection");
        return new StreakFreezeRedeemResponse(i11, i12, all_streakfreezer_collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakFreezeRedeemResponse)) {
            return false;
        }
        StreakFreezeRedeemResponse streakFreezeRedeemResponse = (StreakFreezeRedeemResponse) obj;
        return this.total_gems == streakFreezeRedeemResponse.total_gems && this.total_streakfreezer == streakFreezeRedeemResponse.total_streakfreezer && m.a(this.all_streakfreezer_collection, streakFreezeRedeemResponse.all_streakfreezer_collection);
    }

    public final JsonObject getAll_streakfreezer_collection() {
        return this.all_streakfreezer_collection;
    }

    public final int getTotal_gems() {
        return this.total_gems;
    }

    public final int getTotal_streakfreezer() {
        return this.total_streakfreezer;
    }

    public int hashCode() {
        return this.all_streakfreezer_collection.hashCode() + e.b(this.total_streakfreezer, Integer.hashCode(this.total_gems) * 31, 31);
    }

    public String toString() {
        int i11 = this.total_gems;
        int i12 = this.total_streakfreezer;
        JsonObject jsonObject = this.all_streakfreezer_collection;
        StringBuilder sbK = c.k("StreakFreezeRedeemResponse(total_gems=", i11, ", total_streakfreezer=", i12, ", all_streakfreezer_collection=");
        sbK.append(jsonObject);
        sbK.append(")");
        return sbK.toString();
    }
}
