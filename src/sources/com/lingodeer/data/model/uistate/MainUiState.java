package com.lingodeer.data.model.uistate;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MainUiState {
    private final CommonUiState commonUiState;
    private final DailyGoalUiState dailyGoalUiState;
    private final DayStreakUiState dayStreakUiState;
    private final LeaderBoardUiState leaderBoardUiState;

    public MainUiState(DayStreakUiState dayStreakUiState, DailyGoalUiState dailyGoalUiState, CommonUiState commonUiState, LeaderBoardUiState leaderBoardUiState) {
        m.f(dayStreakUiState, "dayStreakUiState");
        m.f(dailyGoalUiState, "dailyGoalUiState");
        m.f(commonUiState, "commonUiState");
        m.f(leaderBoardUiState, "leaderBoardUiState");
        this.dayStreakUiState = dayStreakUiState;
        this.dailyGoalUiState = dailyGoalUiState;
        this.commonUiState = commonUiState;
        this.leaderBoardUiState = leaderBoardUiState;
    }

    public static /* synthetic */ MainUiState copy$default(MainUiState mainUiState, DayStreakUiState dayStreakUiState, DailyGoalUiState dailyGoalUiState, CommonUiState commonUiState, LeaderBoardUiState leaderBoardUiState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dayStreakUiState = mainUiState.dayStreakUiState;
        }
        if ((i11 & 2) != 0) {
            dailyGoalUiState = mainUiState.dailyGoalUiState;
        }
        if ((i11 & 4) != 0) {
            commonUiState = mainUiState.commonUiState;
        }
        if ((i11 & 8) != 0) {
            leaderBoardUiState = mainUiState.leaderBoardUiState;
        }
        return mainUiState.copy(dayStreakUiState, dailyGoalUiState, commonUiState, leaderBoardUiState);
    }

    public final DayStreakUiState component1() {
        return this.dayStreakUiState;
    }

    public final DailyGoalUiState component2() {
        return this.dailyGoalUiState;
    }

    public final CommonUiState component3() {
        return this.commonUiState;
    }

    public final LeaderBoardUiState component4() {
        return this.leaderBoardUiState;
    }

    public final MainUiState copy(DayStreakUiState dayStreakUiState, DailyGoalUiState dailyGoalUiState, CommonUiState commonUiState, LeaderBoardUiState leaderBoardUiState) {
        m.f(dayStreakUiState, "dayStreakUiState");
        m.f(dailyGoalUiState, "dailyGoalUiState");
        m.f(commonUiState, "commonUiState");
        m.f(leaderBoardUiState, "leaderBoardUiState");
        return new MainUiState(dayStreakUiState, dailyGoalUiState, commonUiState, leaderBoardUiState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainUiState)) {
            return false;
        }
        MainUiState mainUiState = (MainUiState) obj;
        return m.a(this.dayStreakUiState, mainUiState.dayStreakUiState) && m.a(this.dailyGoalUiState, mainUiState.dailyGoalUiState) && m.a(this.commonUiState, mainUiState.commonUiState) && m.a(this.leaderBoardUiState, mainUiState.leaderBoardUiState);
    }

    public final CommonUiState getCommonUiState() {
        return this.commonUiState;
    }

    public final DailyGoalUiState getDailyGoalUiState() {
        return this.dailyGoalUiState;
    }

    public final DayStreakUiState getDayStreakUiState() {
        return this.dayStreakUiState;
    }

    public final LeaderBoardUiState getLeaderBoardUiState() {
        return this.leaderBoardUiState;
    }

    public int hashCode() {
        return this.leaderBoardUiState.hashCode() + ((this.commonUiState.hashCode() + ((this.dailyGoalUiState.hashCode() + (this.dayStreakUiState.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MainUiState(dayStreakUiState=" + this.dayStreakUiState + ", dailyGoalUiState=" + this.dailyGoalUiState + ", commonUiState=" + this.commonUiState + ", leaderBoardUiState=" + this.leaderBoardUiState + ")";
    }
}
