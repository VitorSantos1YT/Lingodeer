package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class UnitFinishStatus {
    private Boolean dialogPractice;
    private Boolean dialogWarmUp;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21980id;
    private Boolean speakLesson;
    private Boolean storyReading;
    private Boolean storySpeaking;
    private Boolean tipsReading;

    public UnitFinishStatus(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.f21980id = str;
        this.speakLesson = bool;
        this.dialogWarmUp = bool2;
        this.dialogPractice = bool3;
        this.storyReading = bool4;
        this.storySpeaking = bool5;
        this.tipsReading = bool6;
    }

    public Boolean getDialogPractice() {
        Boolean bool = this.dialogPractice;
        return bool == null ? Boolean.FALSE : bool;
    }

    public Boolean getDialogWarmUp() {
        Boolean bool = this.dialogWarmUp;
        return bool == null ? Boolean.FALSE : bool;
    }

    public String getId() {
        return this.f21980id;
    }

    public Boolean getSpeakLesson() {
        Boolean bool = this.speakLesson;
        return bool == null ? Boolean.FALSE : bool;
    }

    public Boolean getStoryReading() {
        Boolean bool = this.storyReading;
        return bool == null ? Boolean.FALSE : bool;
    }

    public Boolean getStorySpeaking() {
        Boolean bool = this.storySpeaking;
        return bool == null ? Boolean.FALSE : bool;
    }

    public Boolean getTipsReading() {
        Boolean bool = this.tipsReading;
        return bool == null ? Boolean.FALSE : bool;
    }

    public void setDialogPractice(Boolean bool) {
        this.dialogPractice = bool;
    }

    public void setDialogWarmUp(Boolean bool) {
        this.dialogWarmUp = bool;
    }

    public void setId(String str) {
        this.f21980id = str;
    }

    public void setSpeakLesson(Boolean bool) {
        this.speakLesson = bool;
    }

    public void setStoryReading(Boolean bool) {
        this.storyReading = bool;
    }

    public void setStorySpeaking(Boolean bool) {
        this.storySpeaking = bool;
    }

    public void setTipsReading(Boolean bool) {
        this.tipsReading = bool;
    }

    public UnitFinishStatus() {
    }
}
