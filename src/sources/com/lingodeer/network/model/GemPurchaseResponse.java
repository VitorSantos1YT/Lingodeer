package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class GemPurchaseResponse {
    private final JsonObject all_gems_collection;
    private final int total_gems;

    public GemPurchaseResponse(int i11, JsonObject all_gems_collection) {
        m.f(all_gems_collection, "all_gems_collection");
        this.total_gems = i11;
        this.all_gems_collection = all_gems_collection;
    }

    public static /* synthetic */ GemPurchaseResponse copy$default(GemPurchaseResponse gemPurchaseResponse, int i11, JsonObject jsonObject, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = gemPurchaseResponse.total_gems;
        }
        if ((i12 & 2) != 0) {
            jsonObject = gemPurchaseResponse.all_gems_collection;
        }
        return gemPurchaseResponse.copy(i11, jsonObject);
    }

    public final int component1() {
        return this.total_gems;
    }

    public final JsonObject component2() {
        return this.all_gems_collection;
    }

    public final GemPurchaseResponse copy(int i11, JsonObject all_gems_collection) {
        m.f(all_gems_collection, "all_gems_collection");
        return new GemPurchaseResponse(i11, all_gems_collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GemPurchaseResponse)) {
            return false;
        }
        GemPurchaseResponse gemPurchaseResponse = (GemPurchaseResponse) obj;
        return this.total_gems == gemPurchaseResponse.total_gems && m.a(this.all_gems_collection, gemPurchaseResponse.all_gems_collection);
    }

    public final JsonObject getAll_gems_collection() {
        return this.all_gems_collection;
    }

    public final int getTotal_gems() {
        return this.total_gems;
    }

    public int hashCode() {
        return this.all_gems_collection.hashCode() + (Integer.hashCode(this.total_gems) * 31);
    }

    public String toString() {
        return "GemPurchaseResponse(total_gems=" + this.total_gems + ", all_gems_collection=" + this.all_gems_collection + ")";
    }
}
