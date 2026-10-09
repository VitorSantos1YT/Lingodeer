package com.lingodeer.network.model;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SubCourseProgressResponse {
    private final JsonObject subcourse_progress;

    public SubCourseProgressResponse(JsonObject subcourse_progress) {
        m.f(subcourse_progress, "subcourse_progress");
        this.subcourse_progress = subcourse_progress;
    }

    public static /* synthetic */ SubCourseProgressResponse copy$default(SubCourseProgressResponse subCourseProgressResponse, JsonObject jsonObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jsonObject = subCourseProgressResponse.subcourse_progress;
        }
        return subCourseProgressResponse.copy(jsonObject);
    }

    public final JsonObject component1() {
        return this.subcourse_progress;
    }

    public final SubCourseProgressResponse copy(JsonObject subcourse_progress) {
        m.f(subcourse_progress, "subcourse_progress");
        return new SubCourseProgressResponse(subcourse_progress);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubCourseProgressResponse) && m.a(this.subcourse_progress, ((SubCourseProgressResponse) obj).subcourse_progress);
    }

    public final JsonObject getSubcourse_progress() {
        return this.subcourse_progress;
    }

    public int hashCode() {
        return this.subcourse_progress.hashCode();
    }

    public String toString() {
        return "SubCourseProgressResponse(subcourse_progress=" + this.subcourse_progress + ")";
    }
}
