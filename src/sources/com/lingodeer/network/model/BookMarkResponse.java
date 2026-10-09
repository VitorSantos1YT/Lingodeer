package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BookMarkResponse {
    private final JsonObject all_bookmark_collection;

    public BookMarkResponse(JsonObject all_bookmark_collection) {
        m.f(all_bookmark_collection, "all_bookmark_collection");
        this.all_bookmark_collection = all_bookmark_collection;
    }

    public static /* synthetic */ BookMarkResponse copy$default(BookMarkResponse bookMarkResponse, JsonObject jsonObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jsonObject = bookMarkResponse.all_bookmark_collection;
        }
        return bookMarkResponse.copy(jsonObject);
    }

    public final JsonObject component1() {
        return this.all_bookmark_collection;
    }

    public final BookMarkResponse copy(JsonObject all_bookmark_collection) {
        m.f(all_bookmark_collection, "all_bookmark_collection");
        return new BookMarkResponse(all_bookmark_collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BookMarkResponse) && m.a(this.all_bookmark_collection, ((BookMarkResponse) obj).all_bookmark_collection);
    }

    public final JsonObject getAll_bookmark_collection() {
        return this.all_bookmark_collection;
    }

    public int hashCode() {
        return this.all_bookmark_collection.hashCode();
    }

    public String toString() {
        return "BookMarkResponse(all_bookmark_collection=" + this.all_bookmark_collection + ")";
    }
}
