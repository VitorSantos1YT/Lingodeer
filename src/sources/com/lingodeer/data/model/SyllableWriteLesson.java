package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SyllableWriteLesson {
    private final String lessonDescription;
    private final int lessonId;
    private final int sortIndex;
    private final SyllableLessonStatus status;
    private final List<String> writeCharacters;

    public SyllableWriteLesson(int i11, int i12, String lessonDescription, SyllableLessonStatus status, List<String> writeCharacters) {
        m.f(lessonDescription, "lessonDescription");
        m.f(status, "status");
        m.f(writeCharacters, "writeCharacters");
        this.lessonId = i11;
        this.sortIndex = i12;
        this.lessonDescription = lessonDescription;
        this.status = status;
        this.writeCharacters = writeCharacters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyllableWriteLesson copy$default(SyllableWriteLesson syllableWriteLesson, int i11, int i12, String str, SyllableLessonStatus syllableLessonStatus, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = syllableWriteLesson.lessonId;
        }
        if ((i13 & 2) != 0) {
            i12 = syllableWriteLesson.sortIndex;
        }
        if ((i13 & 4) != 0) {
            str = syllableWriteLesson.lessonDescription;
        }
        if ((i13 & 8) != 0) {
            syllableLessonStatus = syllableWriteLesson.status;
        }
        if ((i13 & 16) != 0) {
            list = syllableWriteLesson.writeCharacters;
        }
        List list2 = list;
        String str2 = str;
        return syllableWriteLesson.copy(i11, i12, str2, syllableLessonStatus, list2);
    }

    public final int component1() {
        return this.lessonId;
    }

    public final int component2() {
        return this.sortIndex;
    }

    public final String component3() {
        return this.lessonDescription;
    }

    public final SyllableLessonStatus component4() {
        return this.status;
    }

    public final List<String> component5() {
        return this.writeCharacters;
    }

    public final SyllableWriteLesson copy(int i11, int i12, String lessonDescription, SyllableLessonStatus status, List<String> writeCharacters) {
        m.f(lessonDescription, "lessonDescription");
        m.f(status, "status");
        m.f(writeCharacters, "writeCharacters");
        return new SyllableWriteLesson(i11, i12, lessonDescription, status, writeCharacters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyllableWriteLesson)) {
            return false;
        }
        SyllableWriteLesson syllableWriteLesson = (SyllableWriteLesson) obj;
        return this.lessonId == syllableWriteLesson.lessonId && this.sortIndex == syllableWriteLesson.sortIndex && m.a(this.lessonDescription, syllableWriteLesson.lessonDescription) && this.status == syllableWriteLesson.status && m.a(this.writeCharacters, syllableWriteLesson.writeCharacters);
    }

    public final String getLessonDescription() {
        return this.lessonDescription;
    }

    public final int getLessonId() {
        return this.lessonId;
    }

    public final int getSortIndex() {
        return this.sortIndex;
    }

    public final SyllableLessonStatus getStatus() {
        return this.status;
    }

    public final List<String> getWriteCharacters() {
        return this.writeCharacters;
    }

    public int hashCode() {
        return this.writeCharacters.hashCode() + ((this.status.hashCode() + e.d(e.b(this.sortIndex, Integer.hashCode(this.lessonId) * 31, 31), 31, this.lessonDescription)) * 31);
    }

    public String toString() {
        int i11 = this.lessonId;
        int i12 = this.sortIndex;
        String str = this.lessonDescription;
        SyllableLessonStatus syllableLessonStatus = this.status;
        List<String> list = this.writeCharacters;
        StringBuilder sbK = c.k("SyllableWriteLesson(lessonId=", i11, ", sortIndex=", i12, ", lessonDescription=");
        sbK.append(str);
        sbK.append(", status=");
        sbK.append(syllableLessonStatus);
        sbK.append(", writeCharacters=");
        return e0.n(sbK, list, ")");
    }
}
