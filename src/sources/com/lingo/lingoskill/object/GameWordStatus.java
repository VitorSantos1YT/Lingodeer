package com.lingo.lingoskill.object;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class GameWordStatus {
    private Long correctCount;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21921id;
    private Integer lastStatus;
    private Long lastStudyTime;
    private String lastThreeResult;
    private Long wrongCount;

    public GameWordStatus(String str, Long l9, Integer num, Long l11, Long l12, String str2) {
        this.wrongCount = 0L;
        this.f21921id = str;
        this.lastStudyTime = l9;
        this.lastStatus = num;
        this.wrongCount = l11;
        this.correctCount = l12;
        this.lastThreeResult = str2;
    }

    public Long getCorrectCount() {
        return this.correctCount;
    }

    public String getId() {
        return this.f21921id;
    }

    public Integer getLastStatus() {
        return this.lastStatus;
    }

    public Long getLastStudyTime() {
        return this.lastStudyTime;
    }

    public String getLastThreeResult() {
        return this.lastThreeResult;
    }

    public Long getWrongCount() {
        return this.wrongCount;
    }

    public void setCorrectCount(Long l9) {
        this.correctCount = l9;
    }

    public void setId(String str) {
        this.f21921id = str;
    }

    public void setLastStatus(Integer num) {
        this.lastStatus = num;
    }

    public void setLastStudyTime(Long l9) {
        this.lastStudyTime = l9;
    }

    public void setLastThreeResult(String str) {
        this.lastThreeResult = str;
    }

    public void setWrongCount(Long l9) {
        this.wrongCount = l9;
    }

    public GameWordStatus() {
        this.wrongCount = 0L;
        this.correctCount = 0L;
        this.lastThreeResult = BuildConfig.VERSION_NAME;
    }
}
