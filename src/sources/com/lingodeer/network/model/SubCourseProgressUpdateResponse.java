package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SubCourseProgressUpdateResponse {
    private final JsonObject merged_subcourse_progress_collection;

    public SubCourseProgressUpdateResponse(JsonObject merged_subcourse_progress_collection) {
        m.f(merged_subcourse_progress_collection, "merged_subcourse_progress_collection");
        this.merged_subcourse_progress_collection = merged_subcourse_progress_collection;
    }

    public static /* synthetic */ SubCourseProgressUpdateResponse copy$default(SubCourseProgressUpdateResponse subCourseProgressUpdateResponse, JsonObject jsonObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jsonObject = subCourseProgressUpdateResponse.merged_subcourse_progress_collection;
        }
        return subCourseProgressUpdateResponse.copy(jsonObject);
    }

    public final JsonObject component1() {
        return this.merged_subcourse_progress_collection;
    }

    public final SubCourseProgressUpdateResponse copy(JsonObject merged_subcourse_progress_collection) {
        m.f(merged_subcourse_progress_collection, "merged_subcourse_progress_collection");
        return new SubCourseProgressUpdateResponse(merged_subcourse_progress_collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubCourseProgressUpdateResponse) && m.a(this.merged_subcourse_progress_collection, ((SubCourseProgressUpdateResponse) obj).merged_subcourse_progress_collection);
    }

    public final JsonObject getMerged_subcourse_progress_collection() {
        return this.merged_subcourse_progress_collection;
    }

    public int hashCode() {
        return this.merged_subcourse_progress_collection.hashCode();
    }

    public String toString() {
        return "SubCourseProgressUpdateResponse(merged_subcourse_progress_collection=" + this.merged_subcourse_progress_collection + ")";
    }
}
