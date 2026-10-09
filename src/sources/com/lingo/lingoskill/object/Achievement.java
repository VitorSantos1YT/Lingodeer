package com.lingo.lingoskill.object;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Achievement {
    private int accumulate_daystreak;
    private int accumulate_seconds;
    private int accumulate_xp;
    private String free_time_earned_history;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private long f21915id;
    private String learning_history;
    private String medals_continue_days;
    private String medals_finished_lans;
    private long updatetime_learnedtime;

    public Achievement(long j11, int i11, int i12, int i13, String str, String str2, String str3, long j12, String str4) {
        this.f21915id = j11;
        this.accumulate_seconds = i11;
        this.accumulate_daystreak = i12;
        this.accumulate_xp = i13;
        this.medals_continue_days = str;
        this.learning_history = str2;
        this.medals_finished_lans = str3;
        this.updatetime_learnedtime = j12;
        this.free_time_earned_history = str4;
    }

    public int getAccumulate_daystreak() {
        return this.accumulate_daystreak;
    }

    public int getAccumulate_seconds() {
        return this.accumulate_seconds;
    }

    public int getAccumulate_xp() {
        return this.accumulate_xp;
    }

    public String getFree_time_earned_history() {
        return this.free_time_earned_history;
    }

    public long getId() {
        return this.f21915id;
    }

    public String getLearning_history() {
        return this.learning_history;
    }

    public int getLevel() {
        long accumulate_xp = getAccumulate_xp();
        int i11 = 0;
        if (accumulate_xp < 100) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 1; i13 < 11; i13++) {
            int i14 = i13 * 100;
            for (int i15 = 1; i15 < 11; i15++) {
                i11 = ((i13 - 1) * 10) + i15;
                i12 += i14;
                if (accumulate_xp < i12) {
                    return i11 - 1;
                }
            }
        }
        return i11;
    }

    public String getMedals_continue_days() {
        return this.medals_continue_days;
    }

    public String getMedals_finished_lans() {
        return this.medals_finished_lans.replace("oc", BuildConfig.VERSION_NAME);
    }

    public long getUpdatetime_learnedtime() {
        return this.updatetime_learnedtime;
    }

    public void setAccumulate_daystreak(int i11) {
        this.accumulate_daystreak = i11;
    }

    public void setAccumulate_seconds(int i11) {
        this.accumulate_seconds = i11;
    }

    public void setAccumulate_xp(int i11) {
        this.accumulate_xp = i11;
    }

    public void setFree_time_earned_history(String str) {
        this.free_time_earned_history = str;
    }

    public void setId(long j11) {
        this.f21915id = j11;
    }

    public void setLearning_history(String str) {
        this.learning_history = str;
    }

    public void setMedals_continue_days(String str) {
        this.medals_continue_days = str;
    }

    public void setMedals_finished_lans(String str) {
        this.medals_finished_lans = str;
    }

    public void setUpdatetime_learnedtime(long j11) {
        this.updatetime_learnedtime = j11;
    }

    public Achievement() {
        this.f21915id = 0L;
        this.accumulate_seconds = 0;
        this.accumulate_daystreak = 0;
        this.accumulate_xp = 0;
        this.medals_continue_days = BuildConfig.VERSION_NAME;
        this.learning_history = BuildConfig.VERSION_NAME;
        this.medals_finished_lans = BuildConfig.VERSION_NAME;
        this.updatetime_learnedtime = 0L;
        this.free_time_earned_history = BuildConfig.VERSION_NAME;
    }
}
