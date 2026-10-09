package com.lingo.lingoskill.http.model;

import com.lingo.lingoskill.object.PdLesson;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FluentGetOneLessonResponse {
    public static final int $stable = 8;
    private final PdLesson podLesson;

    public FluentGetOneLessonResponse(PdLesson podLesson) {
        m.f(podLesson, "podLesson");
        this.podLesson = podLesson;
    }

    public static /* synthetic */ FluentGetOneLessonResponse copy$default(FluentGetOneLessonResponse fluentGetOneLessonResponse, PdLesson pdLesson, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pdLesson = fluentGetOneLessonResponse.podLesson;
        }
        return fluentGetOneLessonResponse.copy(pdLesson);
    }

    public final PdLesson component1() {
        return this.podLesson;
    }

    public final FluentGetOneLessonResponse copy(PdLesson podLesson) {
        m.f(podLesson, "podLesson");
        return new FluentGetOneLessonResponse(podLesson);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FluentGetOneLessonResponse) && m.a(this.podLesson, ((FluentGetOneLessonResponse) obj).podLesson);
    }

    public final PdLesson getPodLesson() {
        return this.podLesson;
    }

    public int hashCode() {
        return this.podLesson.hashCode();
    }

    public String toString() {
        return "FluentGetOneLessonResponse(podLesson=" + this.podLesson + ")";
    }
}
