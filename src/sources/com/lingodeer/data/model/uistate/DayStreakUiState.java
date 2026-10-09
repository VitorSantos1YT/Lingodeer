package com.lingodeer.data.model.uistate;

import com.lingodeer.data.model.DayStreakStatus;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface DayStreakUiState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Loading implements DayStreakUiState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -1961568297;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success implements DayStreakUiState {
        private final DayStreakStatus todayStreakStatus;

        public Success(DayStreakStatus todayStreakStatus) {
            m.f(todayStreakStatus, "todayStreakStatus");
            this.todayStreakStatus = todayStreakStatus;
        }

        public static /* synthetic */ Success copy$default(Success success, DayStreakStatus dayStreakStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                dayStreakStatus = success.todayStreakStatus;
            }
            return success.copy(dayStreakStatus);
        }

        public final DayStreakStatus component1() {
            return this.todayStreakStatus;
        }

        public final Success copy(DayStreakStatus todayStreakStatus) {
            m.f(todayStreakStatus, "todayStreakStatus");
            return new Success(todayStreakStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && m.a(this.todayStreakStatus, ((Success) obj).todayStreakStatus);
        }

        public final DayStreakStatus getTodayStreakStatus() {
            return this.todayStreakStatus;
        }

        public int hashCode() {
            return this.todayStreakStatus.hashCode();
        }

        public String toString() {
            return "Success(todayStreakStatus=" + this.todayStreakStatus + ")";
        }
    }
}
