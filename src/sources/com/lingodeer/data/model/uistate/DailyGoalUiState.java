package com.lingodeer.data.model.uistate;

import defpackage.e;
import hh.p0;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface DailyGoalUiState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Loading implements DailyGoalUiState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -411525371;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success implements DailyGoalUiState {
        private final int dailyGoalXP;
        private final boolean hasSetupUpTodayGoal;
        private final int todayXP;

        public Success(int i11, int i12, boolean z11) {
            this.todayXP = i11;
            this.dailyGoalXP = i12;
            this.hasSetupUpTodayGoal = z11;
        }

        public static /* synthetic */ Success copy$default(Success success, int i11, int i12, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = success.todayXP;
            }
            if ((i13 & 2) != 0) {
                i12 = success.dailyGoalXP;
            }
            if ((i13 & 4) != 0) {
                z11 = success.hasSetupUpTodayGoal;
            }
            return success.copy(i11, i12, z11);
        }

        public final int component1() {
            return this.todayXP;
        }

        public final int component2() {
            return this.dailyGoalXP;
        }

        public final boolean component3() {
            return this.hasSetupUpTodayGoal;
        }

        public final Success copy(int i11, int i12, boolean z11) {
            return new Success(i11, i12, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.todayXP == success.todayXP && this.dailyGoalXP == success.dailyGoalXP && this.hasSetupUpTodayGoal == success.hasSetupUpTodayGoal;
        }

        public final int getDailyGoalXP() {
            return this.dailyGoalXP;
        }

        public final boolean getHasSetupUpTodayGoal() {
            return this.hasSetupUpTodayGoal;
        }

        public final int getTodayXP() {
            return this.todayXP;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasSetupUpTodayGoal) + e.b(this.dailyGoalXP, Integer.hashCode(this.todayXP) * 31, 31);
        }

        public String toString() {
            int i11 = this.todayXP;
            int i12 = this.dailyGoalXP;
            return p0.p(c.k("Success(todayXP=", i11, ", dailyGoalXP=", i12, ", hasSetupUpTodayGoal="), this.hasSetupUpTodayGoal, ")");
        }
    }
}
