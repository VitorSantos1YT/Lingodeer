package com.lingodeer.data.model.uistate;

import defpackage.e;
import ep.a;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface LeaderBoardUiState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Hide implements LeaderBoardUiState {
        public static final Hide INSTANCE = new Hide();

        private Hide() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Hide);
        }

        public int hashCode() {
            return -1810966870;
        }

        public String toString() {
            return "Hide";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Loading implements LeaderBoardUiState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -2005692716;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Locked implements LeaderBoardUiState {
        public static final Locked INSTANCE = new Locked();

        private Locked() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Locked);
        }

        public int hashCode() {
            return -757370254;
        }

        public String toString() {
            return "Locked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NeedLogin implements LeaderBoardUiState {
        public static final NeedLogin INSTANCE = new NeedLogin();

        private NeedLogin() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NeedLogin);
        }

        public int hashCode() {
            return 629738507;
        }

        public String toString() {
            return "NeedLogin";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success implements LeaderBoardUiState {
        private final boolean isRefreshing;
        private final boolean isWeeklyXPEmpty;
        private final LeaderBoardClass leaderBoardClass;
        private final List<LeaderBoardClass> leaderBoardClassList;
        private final LeaderBoardRankState leaderBoardRankState;
        private final boolean scrollToUserPos;
        private int todayRankChange;

        public Success(LeaderBoardClass leaderBoardClass, List<LeaderBoardClass> leaderBoardClassList, LeaderBoardRankState leaderBoardRankState, boolean z11, boolean z12, boolean z13, int i11) {
            m.f(leaderBoardClassList, "leaderBoardClassList");
            m.f(leaderBoardRankState, "leaderBoardRankState");
            this.leaderBoardClass = leaderBoardClass;
            this.leaderBoardClassList = leaderBoardClassList;
            this.leaderBoardRankState = leaderBoardRankState;
            this.scrollToUserPos = z11;
            this.isRefreshing = z12;
            this.isWeeklyXPEmpty = z13;
            this.todayRankChange = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, LeaderBoardClass leaderBoardClass, List list, LeaderBoardRankState leaderBoardRankState, boolean z11, boolean z12, boolean z13, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                leaderBoardClass = success.leaderBoardClass;
            }
            if ((i12 & 2) != 0) {
                list = success.leaderBoardClassList;
            }
            if ((i12 & 4) != 0) {
                leaderBoardRankState = success.leaderBoardRankState;
            }
            if ((i12 & 8) != 0) {
                z11 = success.scrollToUserPos;
            }
            if ((i12 & 16) != 0) {
                z12 = success.isRefreshing;
            }
            if ((i12 & 32) != 0) {
                z13 = success.isWeeklyXPEmpty;
            }
            if ((i12 & 64) != 0) {
                i11 = success.todayRankChange;
            }
            boolean z14 = z13;
            int i13 = i11;
            boolean z15 = z12;
            LeaderBoardRankState leaderBoardRankState2 = leaderBoardRankState;
            return success.copy(leaderBoardClass, list, leaderBoardRankState2, z11, z15, z14, i13);
        }

        public final LeaderBoardClass component1() {
            return this.leaderBoardClass;
        }

        public final List<LeaderBoardClass> component2() {
            return this.leaderBoardClassList;
        }

        public final LeaderBoardRankState component3() {
            return this.leaderBoardRankState;
        }

        public final boolean component4() {
            return this.scrollToUserPos;
        }

        public final boolean component5() {
            return this.isRefreshing;
        }

        public final boolean component6() {
            return this.isWeeklyXPEmpty;
        }

        public final int component7() {
            return this.todayRankChange;
        }

        public final Success copy(LeaderBoardClass leaderBoardClass, List<LeaderBoardClass> leaderBoardClassList, LeaderBoardRankState leaderBoardRankState, boolean z11, boolean z12, boolean z13, int i11) {
            m.f(leaderBoardClassList, "leaderBoardClassList");
            m.f(leaderBoardRankState, "leaderBoardRankState");
            return new Success(leaderBoardClass, leaderBoardClassList, leaderBoardRankState, z11, z12, z13, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return m.a(this.leaderBoardClass, success.leaderBoardClass) && m.a(this.leaderBoardClassList, success.leaderBoardClassList) && m.a(this.leaderBoardRankState, success.leaderBoardRankState) && this.scrollToUserPos == success.scrollToUserPos && this.isRefreshing == success.isRefreshing && this.isWeeklyXPEmpty == success.isWeeklyXPEmpty && this.todayRankChange == success.todayRankChange;
        }

        public final LeaderBoardClass getLeaderBoardClass() {
            return this.leaderBoardClass;
        }

        public final List<LeaderBoardClass> getLeaderBoardClassList() {
            return this.leaderBoardClassList;
        }

        public final LeaderBoardRankState getLeaderBoardRankState() {
            return this.leaderBoardRankState;
        }

        public final boolean getScrollToUserPos() {
            return this.scrollToUserPos;
        }

        public final int getTodayRankChange() {
            return this.todayRankChange;
        }

        public int hashCode() {
            LeaderBoardClass leaderBoardClass = this.leaderBoardClass;
            return Integer.hashCode(this.todayRankChange) + e.e(e.e(e.e((this.leaderBoardRankState.hashCode() + p0.b((leaderBoardClass == null ? 0 : leaderBoardClass.hashCode()) * 31, 31, this.leaderBoardClassList)) * 31, 31, this.scrollToUserPos), 31, this.isRefreshing), 31, this.isWeeklyXPEmpty);
        }

        public final boolean isRefreshing() {
            return this.isRefreshing;
        }

        public final boolean isWeeklyXPEmpty() {
            return this.isWeeklyXPEmpty;
        }

        public final void setTodayRankChange(int i11) {
            this.todayRankChange = i11;
        }

        public String toString() {
            LeaderBoardClass leaderBoardClass = this.leaderBoardClass;
            List<LeaderBoardClass> list = this.leaderBoardClassList;
            LeaderBoardRankState leaderBoardRankState = this.leaderBoardRankState;
            boolean z11 = this.scrollToUserPos;
            boolean z12 = this.isRefreshing;
            boolean z13 = this.isWeeklyXPEmpty;
            int i11 = this.todayRankChange;
            StringBuilder sb2 = new StringBuilder("Success(leaderBoardClass=");
            sb2.append(leaderBoardClass);
            sb2.append(", leaderBoardClassList=");
            sb2.append(list);
            sb2.append(", leaderBoardRankState=");
            sb2.append(leaderBoardRankState);
            sb2.append(", scrollToUserPos=");
            sb2.append(z11);
            sb2.append(", isRefreshing=");
            a.B(", isWeeklyXPEmpty=", ", todayRankChange=", sb2, z12, z13);
            return p0.i(i11, ")", sb2);
        }
    }
}
