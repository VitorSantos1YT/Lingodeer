package com.lingodeer.data.model;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class TaskLessonCollectionItem {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22324id;
    private final String lan;
    private final boolean practiceComprehensive;
    private final boolean practiceListening;
    private final boolean practiceSpeaking;
    private final boolean practiceSpelling;
    private final long time;

    public TaskLessonCollectionItem(String id2, String lan, boolean z11, boolean z12, boolean z13, boolean z14, long j11) {
        m.f(id2, "id");
        m.f(lan, "lan");
        this.f22324id = id2;
        this.lan = lan;
        this.practiceListening = z11;
        this.practiceSpeaking = z12;
        this.practiceSpelling = z13;
        this.practiceComprehensive = z14;
        this.time = j11;
    }

    public static /* synthetic */ TaskLessonCollectionItem copy$default(TaskLessonCollectionItem taskLessonCollectionItem, String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = taskLessonCollectionItem.f22324id;
        }
        if ((i11 & 2) != 0) {
            str2 = taskLessonCollectionItem.lan;
        }
        if ((i11 & 4) != 0) {
            z11 = taskLessonCollectionItem.practiceListening;
        }
        if ((i11 & 8) != 0) {
            z12 = taskLessonCollectionItem.practiceSpeaking;
        }
        if ((i11 & 16) != 0) {
            z13 = taskLessonCollectionItem.practiceSpelling;
        }
        if ((i11 & 32) != 0) {
            z14 = taskLessonCollectionItem.practiceComprehensive;
        }
        if ((i11 & 64) != 0) {
            j11 = taskLessonCollectionItem.time;
        }
        long j12 = j11;
        boolean z15 = z13;
        boolean z16 = z14;
        return taskLessonCollectionItem.copy(str, str2, z11, z12, z15, z16, j12);
    }

    public final String component1() {
        return this.f22324id;
    }

    public final String component2() {
        return this.lan;
    }

    public final boolean component3() {
        return this.practiceListening;
    }

    public final boolean component4() {
        return this.practiceSpeaking;
    }

    public final boolean component5() {
        return this.practiceSpelling;
    }

    public final boolean component6() {
        return this.practiceComprehensive;
    }

    public final long component7() {
        return this.time;
    }

    public final TaskLessonCollectionItem copy(String id2, String lan, boolean z11, boolean z12, boolean z13, boolean z14, long j11) {
        m.f(id2, "id");
        m.f(lan, "lan");
        return new TaskLessonCollectionItem(id2, lan, z11, z12, z13, z14, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskLessonCollectionItem)) {
            return false;
        }
        TaskLessonCollectionItem taskLessonCollectionItem = (TaskLessonCollectionItem) obj;
        return m.a(this.f22324id, taskLessonCollectionItem.f22324id) && m.a(this.lan, taskLessonCollectionItem.lan) && this.practiceListening == taskLessonCollectionItem.practiceListening && this.practiceSpeaking == taskLessonCollectionItem.practiceSpeaking && this.practiceSpelling == taskLessonCollectionItem.practiceSpelling && this.practiceComprehensive == taskLessonCollectionItem.practiceComprehensive && this.time == taskLessonCollectionItem.time;
    }

    public final String getId() {
        return this.f22324id;
    }

    public final String getLan() {
        return this.lan;
    }

    public final boolean getPracticeComprehensive() {
        return this.practiceComprehensive;
    }

    public final boolean getPracticeListening() {
        return this.practiceListening;
    }

    public final boolean getPracticeSpeaking() {
        return this.practiceSpeaking;
    }

    public final boolean getPracticeSpelling() {
        return this.practiceSpelling;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + e.e(e.e(e.e(e.e(e.d(this.f22324id.hashCode() * 31, 31, this.lan), 31, this.practiceListening), 31, this.practiceSpeaking), 31, this.practiceSpelling), 31, this.practiceComprehensive);
    }

    public String toString() {
        String str = this.f22324id;
        String str2 = this.lan;
        boolean z11 = this.practiceListening;
        boolean z12 = this.practiceSpeaking;
        boolean z13 = this.practiceSpelling;
        boolean z14 = this.practiceComprehensive;
        long j11 = this.time;
        StringBuilder sbS = e.s("TaskLessonCollectionItem(id=", str, ", lan=", str2, ", practiceListening=");
        a.B(", practiceSpeaking=", ", practiceSpelling=", sbS, z11, z12);
        a.B(", practiceComprehensive=", ", time=", sbS, z13, z14);
        return e.i(j11, ")", sbS);
    }

    public static /* synthetic */ void getPracticeComprehensive$annotations() {
    }

    public static /* synthetic */ void getPracticeListening$annotations() {
    }

    public static /* synthetic */ void getPracticeSpeaking$annotations() {
    }

    public static /* synthetic */ void getPracticeSpelling$annotations() {
    }
}
