package com.lingo.lingoskill.http.model;

import com.google.android.material.datepicker.d;
import com.google.gson.annotations.SerializedName;
import com.lingo.lingoskill.object.PdLesson;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FluentGetLessonSummaryWithIdsResponse {
    public static final int $stable = 8;

    @SerializedName("Elements")
    private final List<PdLesson> elements;

    /* JADX WARN: Multi-variable type inference failed */
    public FluentGetLessonSummaryWithIdsResponse(List<? extends PdLesson> elements) {
        m.f(elements, "elements");
        this.elements = elements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FluentGetLessonSummaryWithIdsResponse copy$default(FluentGetLessonSummaryWithIdsResponse fluentGetLessonSummaryWithIdsResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = fluentGetLessonSummaryWithIdsResponse.elements;
        }
        return fluentGetLessonSummaryWithIdsResponse.copy(list);
    }

    public final List<PdLesson> component1() {
        return this.elements;
    }

    public final FluentGetLessonSummaryWithIdsResponse copy(List<? extends PdLesson> elements) {
        m.f(elements, "elements");
        return new FluentGetLessonSummaryWithIdsResponse(elements);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FluentGetLessonSummaryWithIdsResponse) && m.a(this.elements, ((FluentGetLessonSummaryWithIdsResponse) obj).elements);
    }

    public final List<PdLesson> getElements() {
        return this.elements;
    }

    public int hashCode() {
        return this.elements.hashCode();
    }

    public String toString() {
        return d.l(this.elements, "FluentGetLessonSummaryWithIdsResponse(elements=", ")");
    }
}
