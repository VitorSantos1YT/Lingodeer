package com.lingodeer.data.model;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseUnitFinishStatus {
    private final int curEnterLessonIndex;
    private final boolean dialogPractice;
    private final boolean dialogSpeaking;
    private final boolean dialogWarmUp;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22301id;
    private final String lan;
    private final boolean pendingUpdate;
    private final boolean storyReading;
    private final boolean storySpeaking;
    private final long time;
    private final boolean tipsReading;

    public CourseUnitFinishStatus(String id2, String lan, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j11, boolean z17) {
        m.f(id2, "id");
        m.f(lan, "lan");
        this.f22301id = id2;
        this.lan = lan;
        this.curEnterLessonIndex = i11;
        this.storyReading = z11;
        this.storySpeaking = z12;
        this.tipsReading = z13;
        this.dialogWarmUp = z14;
        this.dialogPractice = z15;
        this.dialogSpeaking = z16;
        this.time = j11;
        this.pendingUpdate = z17;
    }

    public static /* synthetic */ CourseUnitFinishStatus copy$default(CourseUnitFinishStatus courseUnitFinishStatus, String str, String str2, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j11, boolean z17, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = courseUnitFinishStatus.f22301id;
        }
        if ((i12 & 2) != 0) {
            str2 = courseUnitFinishStatus.lan;
        }
        if ((i12 & 4) != 0) {
            i11 = courseUnitFinishStatus.curEnterLessonIndex;
        }
        if ((i12 & 8) != 0) {
            z11 = courseUnitFinishStatus.storyReading;
        }
        if ((i12 & 16) != 0) {
            z12 = courseUnitFinishStatus.storySpeaking;
        }
        if ((i12 & 32) != 0) {
            z13 = courseUnitFinishStatus.tipsReading;
        }
        if ((i12 & 64) != 0) {
            z14 = courseUnitFinishStatus.dialogWarmUp;
        }
        if ((i12 & 128) != 0) {
            z15 = courseUnitFinishStatus.dialogPractice;
        }
        if ((i12 & 256) != 0) {
            z16 = courseUnitFinishStatus.dialogSpeaking;
        }
        if ((i12 & 512) != 0) {
            j11 = courseUnitFinishStatus.time;
        }
        if ((i12 & 1024) != 0) {
            z17 = courseUnitFinishStatus.pendingUpdate;
        }
        boolean z18 = z17;
        long j12 = j11;
        boolean z19 = z15;
        boolean z20 = z16;
        boolean z21 = z13;
        boolean z22 = z14;
        boolean z23 = z12;
        int i13 = i11;
        return courseUnitFinishStatus.copy(str, str2, i13, z11, z23, z21, z22, z19, z20, j12, z18);
    }

    public final String component1() {
        return this.f22301id;
    }

    public final long component10() {
        return this.time;
    }

    public final boolean component11() {
        return this.pendingUpdate;
    }

    public final String component2() {
        return this.lan;
    }

    public final int component3() {
        return this.curEnterLessonIndex;
    }

    public final boolean component4() {
        return this.storyReading;
    }

    public final boolean component5() {
        return this.storySpeaking;
    }

    public final boolean component6() {
        return this.tipsReading;
    }

    public final boolean component7() {
        return this.dialogWarmUp;
    }

    public final boolean component8() {
        return this.dialogPractice;
    }

    public final boolean component9() {
        return this.dialogSpeaking;
    }

    public final CourseUnitFinishStatus copy(String id2, String lan, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j11, boolean z17) {
        m.f(id2, "id");
        m.f(lan, "lan");
        return new CourseUnitFinishStatus(id2, lan, i11, z11, z12, z13, z14, z15, z16, j11, z17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseUnitFinishStatus)) {
            return false;
        }
        CourseUnitFinishStatus courseUnitFinishStatus = (CourseUnitFinishStatus) obj;
        return m.a(this.f22301id, courseUnitFinishStatus.f22301id) && m.a(this.lan, courseUnitFinishStatus.lan) && this.curEnterLessonIndex == courseUnitFinishStatus.curEnterLessonIndex && this.storyReading == courseUnitFinishStatus.storyReading && this.storySpeaking == courseUnitFinishStatus.storySpeaking && this.tipsReading == courseUnitFinishStatus.tipsReading && this.dialogWarmUp == courseUnitFinishStatus.dialogWarmUp && this.dialogPractice == courseUnitFinishStatus.dialogPractice && this.dialogSpeaking == courseUnitFinishStatus.dialogSpeaking && this.time == courseUnitFinishStatus.time && this.pendingUpdate == courseUnitFinishStatus.pendingUpdate;
    }

    public final int getCurEnterLessonIndex() {
        return this.curEnterLessonIndex;
    }

    public final boolean getDialogPractice() {
        return this.dialogPractice;
    }

    public final boolean getDialogSpeaking() {
        return this.dialogSpeaking;
    }

    public final boolean getDialogWarmUp() {
        return this.dialogWarmUp;
    }

    public final String getId() {
        return this.f22301id;
    }

    public final String getLan() {
        return this.lan;
    }

    public final boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    public final boolean getStoryReading() {
        return this.storyReading;
    }

    public final boolean getStorySpeaking() {
        return this.storySpeaking;
    }

    public final long getTime() {
        return this.time;
    }

    public final boolean getTipsReading() {
        return this.tipsReading;
    }

    public int hashCode() {
        return Boolean.hashCode(this.pendingUpdate) + e.f(this.time, e.e(e.e(e.e(e.e(e.e(e.e(e.b(this.curEnterLessonIndex, e.d(this.f22301id.hashCode() * 31, 31, this.lan), 31), 31, this.storyReading), 31, this.storySpeaking), 31, this.tipsReading), 31, this.dialogWarmUp), 31, this.dialogPractice), 31, this.dialogSpeaking), 31);
    }

    public String toString() {
        String str = this.f22301id;
        String str2 = this.lan;
        int i11 = this.curEnterLessonIndex;
        boolean z11 = this.storyReading;
        boolean z12 = this.storySpeaking;
        boolean z13 = this.tipsReading;
        boolean z14 = this.dialogWarmUp;
        boolean z15 = this.dialogPractice;
        boolean z16 = this.dialogSpeaking;
        long j11 = this.time;
        boolean z17 = this.pendingUpdate;
        StringBuilder sbS = e.s("CourseUnitFinishStatus(id=", str, ", lan=", str2, ", curEnterLessonIndex=");
        sbS.append(i11);
        sbS.append(", storyReading=");
        sbS.append(z11);
        sbS.append(", storySpeaking=");
        a.B(", tipsReading=", ", dialogWarmUp=", sbS, z12, z13);
        a.B(", dialogPractice=", ", dialogSpeaking=", sbS, z14, z15);
        sbS.append(z16);
        sbS.append(", time=");
        sbS.append(j11);
        sbS.append(", pendingUpdate=");
        sbS.append(z17);
        sbS.append(")");
        return sbS.toString();
    }
}
