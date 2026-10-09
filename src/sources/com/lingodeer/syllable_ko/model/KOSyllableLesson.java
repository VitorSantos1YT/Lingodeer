package com.lingodeer.syllable_ko.model;

import com.lingodeer.data.model.SyllableLessonStatus;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class KOSyllableLesson {
    public static final int $stable = 8;
    private final String lessonID;
    private final List<KOSyllableModel> models;
    private final int sortIndex;
    private final SyllableLessonStatus status;
    private final KOSyllableLessonType type;

    public KOSyllableLesson(String lessonID, KOSyllableLessonType type, List<KOSyllableModel> models, SyllableLessonStatus status, int i11) {
        m.f(lessonID, "lessonID");
        m.f(type, "type");
        m.f(models, "models");
        m.f(status, "status");
        this.lessonID = lessonID;
        this.type = type;
        this.models = models;
        this.status = status;
        this.sortIndex = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KOSyllableLesson copy$default(KOSyllableLesson kOSyllableLesson, String str, KOSyllableLessonType kOSyllableLessonType, List list, SyllableLessonStatus syllableLessonStatus, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = kOSyllableLesson.lessonID;
        }
        if ((i12 & 2) != 0) {
            kOSyllableLessonType = kOSyllableLesson.type;
        }
        if ((i12 & 4) != 0) {
            list = kOSyllableLesson.models;
        }
        if ((i12 & 8) != 0) {
            syllableLessonStatus = kOSyllableLesson.status;
        }
        if ((i12 & 16) != 0) {
            i11 = kOSyllableLesson.sortIndex;
        }
        int i13 = i11;
        List list2 = list;
        return kOSyllableLesson.copy(str, kOSyllableLessonType, list2, syllableLessonStatus, i13);
    }

    public final String component1() {
        return this.lessonID;
    }

    public final KOSyllableLessonType component2() {
        return this.type;
    }

    public final List<KOSyllableModel> component3() {
        return this.models;
    }

    public final SyllableLessonStatus component4() {
        return this.status;
    }

    public final int component5() {
        return this.sortIndex;
    }

    public final KOSyllableLesson copy(String lessonID, KOSyllableLessonType type, List<KOSyllableModel> models, SyllableLessonStatus status, int i11) {
        m.f(lessonID, "lessonID");
        m.f(type, "type");
        m.f(models, "models");
        m.f(status, "status");
        return new KOSyllableLesson(lessonID, type, models, status, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KOSyllableLesson)) {
            return false;
        }
        KOSyllableLesson kOSyllableLesson = (KOSyllableLesson) obj;
        return m.a(this.lessonID, kOSyllableLesson.lessonID) && this.type == kOSyllableLesson.type && m.a(this.models, kOSyllableLesson.models) && this.status == kOSyllableLesson.status && this.sortIndex == kOSyllableLesson.sortIndex;
    }

    public final String getLessonID() {
        return this.lessonID;
    }

    public final List<KOSyllableModel> getModels() {
        return this.models;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final SyllableLessonStatus getStatus() {
        return this.status;
    }

    public final KOSyllableLessonType getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.sortIndex) + ((this.status.hashCode() + p0.b((this.type.hashCode() + (this.lessonID.hashCode() * 31)) * 31, 31, this.models)) * 31);
    }

    public String toString() {
        String str = this.lessonID;
        KOSyllableLessonType kOSyllableLessonType = this.type;
        List<KOSyllableModel> list = this.models;
        SyllableLessonStatus syllableLessonStatus = this.status;
        int i11 = this.sortIndex;
        StringBuilder sb2 = new StringBuilder("KOSyllableLesson(lessonID=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(kOSyllableLessonType);
        sb2.append(", models=");
        sb2.append(list);
        sb2.append(", status=");
        sb2.append(syllableLessonStatus);
        sb2.append(", sortIndex=");
        return p0.i(i11, ")", sb2);
    }
}
