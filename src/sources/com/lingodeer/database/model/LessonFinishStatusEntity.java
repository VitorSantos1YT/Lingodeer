package com.lingodeer.database.model;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LessonFinishStatusEntity {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22380id;
    private final String lan;
    private final boolean pendingUpdate;
    private final boolean practiceComprehensive;
    private final boolean practiceListening;
    private final boolean practiceSpeaking;
    private final boolean practiceSpelling;
    private final long time;

    public LessonFinishStatusEntity(String id2, String lan, boolean z11, boolean z12, boolean z13, boolean z14, long j11, boolean z15) {
        m.f(id2, "id");
        m.f(lan, "lan");
        this.f22380id = id2;
        this.lan = lan;
        this.practiceListening = z11;
        this.practiceSpeaking = z12;
        this.practiceSpelling = z13;
        this.practiceComprehensive = z14;
        this.time = j11;
        this.pendingUpdate = z15;
    }

    public static /* synthetic */ LessonFinishStatusEntity copy$default(LessonFinishStatusEntity lessonFinishStatusEntity, String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, long j11, boolean z15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lessonFinishStatusEntity.f22380id;
        }
        if ((i11 & 2) != 0) {
            str2 = lessonFinishStatusEntity.lan;
        }
        if ((i11 & 4) != 0) {
            z11 = lessonFinishStatusEntity.practiceListening;
        }
        if ((i11 & 8) != 0) {
            z12 = lessonFinishStatusEntity.practiceSpeaking;
        }
        if ((i11 & 16) != 0) {
            z13 = lessonFinishStatusEntity.practiceSpelling;
        }
        if ((i11 & 32) != 0) {
            z14 = lessonFinishStatusEntity.practiceComprehensive;
        }
        if ((i11 & 64) != 0) {
            j11 = lessonFinishStatusEntity.time;
        }
        if ((i11 & 128) != 0) {
            z15 = lessonFinishStatusEntity.pendingUpdate;
        }
        boolean z16 = z15;
        long j12 = j11;
        boolean z17 = z13;
        boolean z18 = z14;
        return lessonFinishStatusEntity.copy(str, str2, z11, z12, z17, z18, j12, z16);
    }

    public final String component1() {
        return this.f22380id;
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

    public final boolean component8() {
        return this.pendingUpdate;
    }

    public final LessonFinishStatusEntity copy(String id2, String lan, boolean z11, boolean z12, boolean z13, boolean z14, long j11, boolean z15) {
        m.f(id2, "id");
        m.f(lan, "lan");
        return new LessonFinishStatusEntity(id2, lan, z11, z12, z13, z14, j11, z15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LessonFinishStatusEntity)) {
            return false;
        }
        LessonFinishStatusEntity lessonFinishStatusEntity = (LessonFinishStatusEntity) obj;
        return m.a(this.f22380id, lessonFinishStatusEntity.f22380id) && m.a(this.lan, lessonFinishStatusEntity.lan) && this.practiceListening == lessonFinishStatusEntity.practiceListening && this.practiceSpeaking == lessonFinishStatusEntity.practiceSpeaking && this.practiceSpelling == lessonFinishStatusEntity.practiceSpelling && this.practiceComprehensive == lessonFinishStatusEntity.practiceComprehensive && this.time == lessonFinishStatusEntity.time && this.pendingUpdate == lessonFinishStatusEntity.pendingUpdate;
    }

    public final String getId() {
        return this.f22380id;
    }

    public final String getLan() {
        return this.lan;
    }

    public final boolean getPendingUpdate() {
        return this.pendingUpdate;
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
        return Boolean.hashCode(this.pendingUpdate) + e.f(this.time, e.e(e.e(e.e(e.e(e.d(this.f22380id.hashCode() * 31, 31, this.lan), 31, this.practiceListening), 31, this.practiceSpeaking), 31, this.practiceSpelling), 31, this.practiceComprehensive), 31);
    }

    public String toString() {
        String str = this.f22380id;
        String str2 = this.lan;
        boolean z11 = this.practiceListening;
        boolean z12 = this.practiceSpeaking;
        boolean z13 = this.practiceSpelling;
        boolean z14 = this.practiceComprehensive;
        long j11 = this.time;
        boolean z15 = this.pendingUpdate;
        StringBuilder sbS = e.s("LessonFinishStatusEntity(id=", str, ", lan=", str2, ", practiceListening=");
        a.B(", practiceSpeaking=", ", practiceSpelling=", sbS, z11, z12);
        a.B(", practiceComprehensive=", ", time=", sbS, z13, z14);
        sbS.append(j11);
        sbS.append(", pendingUpdate=");
        sbS.append(z15);
        sbS.append(")");
        return sbS.toString();
    }
}
