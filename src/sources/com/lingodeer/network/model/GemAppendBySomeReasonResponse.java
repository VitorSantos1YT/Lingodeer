package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import defpackage.e;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class GemAppendBySomeReasonResponse {
    private final JsonObject all_gems_collection;
    private final String reason_description;
    private final int reason_grant_gem_amount;
    private final int totalGems;

    public GemAppendBySomeReasonResponse(int i11, int i12, String reason_description, JsonObject all_gems_collection) {
        m.f(reason_description, "reason_description");
        m.f(all_gems_collection, "all_gems_collection");
        this.totalGems = i11;
        this.reason_grant_gem_amount = i12;
        this.reason_description = reason_description;
        this.all_gems_collection = all_gems_collection;
    }

    public static /* synthetic */ GemAppendBySomeReasonResponse copy$default(GemAppendBySomeReasonResponse gemAppendBySomeReasonResponse, int i11, int i12, String str, JsonObject jsonObject, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = gemAppendBySomeReasonResponse.totalGems;
        }
        if ((i13 & 2) != 0) {
            i12 = gemAppendBySomeReasonResponse.reason_grant_gem_amount;
        }
        if ((i13 & 4) != 0) {
            str = gemAppendBySomeReasonResponse.reason_description;
        }
        if ((i13 & 8) != 0) {
            jsonObject = gemAppendBySomeReasonResponse.all_gems_collection;
        }
        return gemAppendBySomeReasonResponse.copy(i11, i12, str, jsonObject);
    }

    public final int component1() {
        return this.totalGems;
    }

    public final int component2() {
        return this.reason_grant_gem_amount;
    }

    public final String component3() {
        return this.reason_description;
    }

    public final JsonObject component4() {
        return this.all_gems_collection;
    }

    public final GemAppendBySomeReasonResponse copy(int i11, int i12, String reason_description, JsonObject all_gems_collection) {
        m.f(reason_description, "reason_description");
        m.f(all_gems_collection, "all_gems_collection");
        return new GemAppendBySomeReasonResponse(i11, i12, reason_description, all_gems_collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GemAppendBySomeReasonResponse)) {
            return false;
        }
        GemAppendBySomeReasonResponse gemAppendBySomeReasonResponse = (GemAppendBySomeReasonResponse) obj;
        return this.totalGems == gemAppendBySomeReasonResponse.totalGems && this.reason_grant_gem_amount == gemAppendBySomeReasonResponse.reason_grant_gem_amount && m.a(this.reason_description, gemAppendBySomeReasonResponse.reason_description) && m.a(this.all_gems_collection, gemAppendBySomeReasonResponse.all_gems_collection);
    }

    public final JsonObject getAll_gems_collection() {
        return this.all_gems_collection;
    }

    public final String getReason_description() {
        return this.reason_description;
    }

    public final int getReason_grant_gem_amount() {
        return this.reason_grant_gem_amount;
    }

    public final int getTotalGems() {
        return this.totalGems;
    }

    public int hashCode() {
        return this.all_gems_collection.hashCode() + e.d(e.b(this.reason_grant_gem_amount, Integer.hashCode(this.totalGems) * 31, 31), 31, this.reason_description);
    }

    public String toString() {
        int i11 = this.totalGems;
        int i12 = this.reason_grant_gem_amount;
        String str = this.reason_description;
        JsonObject jsonObject = this.all_gems_collection;
        StringBuilder sbK = c.k("GemAppendBySomeReasonResponse(totalGems=", i11, ", reason_grant_gem_amount=", i12, ", reason_description=");
        sbK.append(str);
        sbK.append(", all_gems_collection=");
        sbK.append(jsonObject);
        sbK.append(")");
        return sbK.toString();
    }
}
