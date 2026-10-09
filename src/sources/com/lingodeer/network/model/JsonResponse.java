package com.lingodeer.network.model;

import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonResponse {
    private final String json;

    public JsonResponse(String json) {
        m.f(json, "json");
        this.json = json;
    }

    public static /* synthetic */ JsonResponse copy$default(JsonResponse jsonResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jsonResponse.json;
        }
        return jsonResponse.copy(str);
    }

    public final String component1() {
        return this.json;
    }

    public final JsonResponse copy(String json) {
        m.f(json, "json");
        return new JsonResponse(json);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsonResponse) && m.a(this.json, ((JsonResponse) obj).json);
    }

    public final String getJson() {
        return this.json;
    }

    public int hashCode() {
        return this.json.hashCode();
    }

    public String toString() {
        return a.g("JsonResponse(json=", this.json, ")");
    }
}
