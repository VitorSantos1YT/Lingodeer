package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserPassChallengeByGemsResponse {
    private final JsonObject all_gems_collection;
    private final int redeem_amount;
    private final boolean redeem_result;
    private final int totalGems;

    public UserPassChallengeByGemsResponse(int i11, boolean z11, int i12, JsonObject all_gems_collection) {
        m.f(all_gems_collection, "all_gems_collection");
        this.redeem_amount = i11;
        this.redeem_result = z11;
        this.totalGems = i12;
        this.all_gems_collection = all_gems_collection;
    }

    public static /* synthetic */ UserPassChallengeByGemsResponse copy$default(UserPassChallengeByGemsResponse userPassChallengeByGemsResponse, int i11, boolean z11, int i12, JsonObject jsonObject, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = userPassChallengeByGemsResponse.redeem_amount;
        }
        if ((i13 & 2) != 0) {
            z11 = userPassChallengeByGemsResponse.redeem_result;
        }
        if ((i13 & 4) != 0) {
            i12 = userPassChallengeByGemsResponse.totalGems;
        }
        if ((i13 & 8) != 0) {
            jsonObject = userPassChallengeByGemsResponse.all_gems_collection;
        }
        return userPassChallengeByGemsResponse.copy(i11, z11, i12, jsonObject);
    }

    public final int component1() {
        return this.redeem_amount;
    }

    public final boolean component2() {
        return this.redeem_result;
    }

    public final int component3() {
        return this.totalGems;
    }

    public final JsonObject component4() {
        return this.all_gems_collection;
    }

    public final UserPassChallengeByGemsResponse copy(int i11, boolean z11, int i12, JsonObject all_gems_collection) {
        m.f(all_gems_collection, "all_gems_collection");
        return new UserPassChallengeByGemsResponse(i11, z11, i12, all_gems_collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPassChallengeByGemsResponse)) {
            return false;
        }
        UserPassChallengeByGemsResponse userPassChallengeByGemsResponse = (UserPassChallengeByGemsResponse) obj;
        return this.redeem_amount == userPassChallengeByGemsResponse.redeem_amount && this.redeem_result == userPassChallengeByGemsResponse.redeem_result && this.totalGems == userPassChallengeByGemsResponse.totalGems && m.a(this.all_gems_collection, userPassChallengeByGemsResponse.all_gems_collection);
    }

    public final JsonObject getAll_gems_collection() {
        return this.all_gems_collection;
    }

    public final int getRedeem_amount() {
        return this.redeem_amount;
    }

    public final boolean getRedeem_result() {
        return this.redeem_result;
    }

    public final int getTotalGems() {
        return this.totalGems;
    }

    public int hashCode() {
        return this.all_gems_collection.hashCode() + e.b(this.totalGems, e.e(Integer.hashCode(this.redeem_amount) * 31, 31, this.redeem_result), 31);
    }

    public String toString() {
        return "UserPassChallengeByGemsResponse(redeem_amount=" + this.redeem_amount + ", redeem_result=" + this.redeem_result + ", totalGems=" + this.totalGems + ", all_gems_collection=" + this.all_gems_collection + ")";
    }
}
