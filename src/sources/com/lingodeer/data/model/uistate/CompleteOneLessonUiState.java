package com.lingodeer.data.model.uistate;

import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import java.util.List;
import kotlin.jvm.internal.m;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface CompleteOneLessonUiState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Idle implements CompleteOneLessonUiState {
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public int hashCode() {
            return 815823972;
        }

        public String toString() {
            return "Idle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success implements CompleteOneLessonUiState {
        private final DayStreakFinishedStatus dayStreakFinishedStatus;
        private final LeaderBoardUiState leaderBoardUiState;
        private final List<AchievementLevel> unLockAchievements;

        public Success(List<AchievementLevel> unLockAchievements, DayStreakFinishedStatus dayStreakFinishedStatus, LeaderBoardUiState leaderBoardUiState) {
            m.f(unLockAchievements, "unLockAchievements");
            this.unLockAchievements = unLockAchievements;
            this.dayStreakFinishedStatus = dayStreakFinishedStatus;
            this.leaderBoardUiState = leaderBoardUiState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, DayStreakFinishedStatus dayStreakFinishedStatus, LeaderBoardUiState leaderBoardUiState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = success.unLockAchievements;
            }
            if ((i11 & 2) != 0) {
                dayStreakFinishedStatus = success.dayStreakFinishedStatus;
            }
            if ((i11 & 4) != 0) {
                leaderBoardUiState = success.leaderBoardUiState;
            }
            return success.copy(list, dayStreakFinishedStatus, leaderBoardUiState);
        }

        public final List<AchievementLevel> component1() {
            return this.unLockAchievements;
        }

        public final DayStreakFinishedStatus component2() {
            return this.dayStreakFinishedStatus;
        }

        public final LeaderBoardUiState component3() {
            return this.leaderBoardUiState;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return m.a(this.unLockAchievements, success.unLockAchievements) && m.a(this.dayStreakFinishedStatus, success.dayStreakFinishedStatus) && m.a(this.leaderBoardUiState, success.leaderBoardUiState);
        }

        public final DayStreakFinishedStatus getDayStreakFinishedStatus() {
            return this.dayStreakFinishedStatus;
        }

        public final LeaderBoardUiState getLeaderBoardUiState() {
            return this.leaderBoardUiState;
        }

        public final List<AchievementLevel> getUnLockAchievements() {
            return this.unLockAchievements;
        }

        public int hashCode() {
            int iHashCode = this.unLockAchievements.hashCode() * 31;
            DayStreakFinishedStatus dayStreakFinishedStatus = this.dayStreakFinishedStatus;
            int iHashCode2 = (iHashCode + (dayStreakFinishedStatus == null ? 0 : dayStreakFinishedStatus.hashCode())) * 31;
            LeaderBoardUiState leaderBoardUiState = this.leaderBoardUiState;
            return iHashCode2 + (leaderBoardUiState != null ? leaderBoardUiState.hashCode() : 0);
        }

        public String toString() {
            return "Success(unLockAchievements=" + this.unLockAchievements + ", dayStreakFinishedStatus=" + this.dayStreakFinishedStatus + ", leaderBoardUiState=" + this.leaderBoardUiState + ")";
        }

        public final Success copy(List<AchievementLevel> list, DayStreakFinishedStatus dayStreakFinishedStatus, LeaderBoardUiState leaderBoardUiState) {
            m.f(list, PQgum.CEQdVn);
            return new Success(list, dayStreakFinishedStatus, leaderBoardUiState);
        }
    }
}
