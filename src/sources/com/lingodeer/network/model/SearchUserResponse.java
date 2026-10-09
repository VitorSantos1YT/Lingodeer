package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SearchUserResponse {
    private JsonObject suggest_users;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchUserResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchUserResponse copy$default(SearchUserResponse searchUserResponse, JsonObject jsonObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jsonObject = searchUserResponse.suggest_users;
        }
        return searchUserResponse.copy(jsonObject);
    }

    public final JsonObject component1() {
        return this.suggest_users;
    }

    public final SearchUserResponse copy(JsonObject suggest_users) {
        m.f(suggest_users, "suggest_users");
        return new SearchUserResponse(suggest_users);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchUserResponse) && m.a(this.suggest_users, ((SearchUserResponse) obj).suggest_users);
    }

    public final JsonObject getSuggest_users() {
        return this.suggest_users;
    }

    public int hashCode() {
        return this.suggest_users.hashCode();
    }

    public final void setSuggest_users(JsonObject jsonObject) {
        m.f(jsonObject, "<set-?>");
        this.suggest_users = jsonObject;
    }

    public String toString() {
        return "SearchUserResponse(suggest_users=" + this.suggest_users + ")";
    }

    public SearchUserResponse(JsonObject suggest_users) {
        m.f(suggest_users, "suggest_users");
        this.suggest_users = suggest_users;
    }

    public /* synthetic */ SearchUserResponse(JsonObject jsonObject, int i11, f fVar) {
        this((i11 & 1) != 0 ? new JsonObject() : jsonObject);
    }
}
