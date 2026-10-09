package com.lingodeer.data.model.uistate;

import defpackage.e;
import ep.a;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class LeaderBoardRankState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DowngradeStatus extends LeaderBoardRankState {
        public static final DowngradeStatus INSTANCE = new DowngradeStatus();

        private DowngradeStatus() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DowngradeStatus);
        }

        public int hashCode() {
            return -1408657017;
        }

        public String toString() {
            return "DowngradeStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Empty extends LeaderBoardRankState {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public int hashCode() {
            return -91288051;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class KeepStatus extends LeaderBoardRankState {
        public static final KeepStatus INSTANCE = new KeepStatus();

        private KeepStatus() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof KeepStatus);
        }

        public int hashCode() {
            return -740270313;
        }

        public String toString() {
            return "KeepStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NewCircleStatus extends LeaderBoardRankState {
        public static final NewCircleStatus INSTANCE = new NewCircleStatus();

        private NewCircleStatus() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NewCircleStatus);
        }

        public int hashCode() {
            return -1569275038;
        }

        public String toString() {
            return "NewCircleStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RankIncrease extends LeaderBoardRankState {
        private final String currentRegion;
        private final int increase;
        private final boolean increaseRegion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RankIncrease(int i11, String currentRegion, boolean z11) {
            super(null);
            m.f(currentRegion, "currentRegion");
            this.increase = i11;
            this.currentRegion = currentRegion;
            this.increaseRegion = z11;
        }

        public static /* synthetic */ RankIncrease copy$default(RankIncrease rankIncrease, int i11, String str, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = rankIncrease.increase;
            }
            if ((i12 & 2) != 0) {
                str = rankIncrease.currentRegion;
            }
            if ((i12 & 4) != 0) {
                z11 = rankIncrease.increaseRegion;
            }
            return rankIncrease.copy(i11, str, z11);
        }

        public final int component1() {
            return this.increase;
        }

        public final String component2() {
            return this.currentRegion;
        }

        public final boolean component3() {
            return this.increaseRegion;
        }

        public final RankIncrease copy(int i11, String currentRegion, boolean z11) {
            m.f(currentRegion, "currentRegion");
            return new RankIncrease(i11, currentRegion, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RankIncrease)) {
                return false;
            }
            RankIncrease rankIncrease = (RankIncrease) obj;
            return this.increase == rankIncrease.increase && m.a(this.currentRegion, rankIncrease.currentRegion) && this.increaseRegion == rankIncrease.increaseRegion;
        }

        public final String getCurrentRegion() {
            return this.currentRegion;
        }

        public final int getIncrease() {
            return this.increase;
        }

        public final boolean getIncreaseRegion() {
            return this.increaseRegion;
        }

        public int hashCode() {
            return Boolean.hashCode(this.increaseRegion) + e.d(Integer.hashCode(this.increase) * 31, 31, this.currentRegion);
        }

        public String toString() {
            int i11 = this.increase;
            String str = this.currentRegion;
            boolean z11 = this.increaseRegion;
            StringBuilder sb2 = new StringBuilder("RankIncrease(increase=");
            sb2.append(i11);
            sb2.append(", currentRegion=");
            sb2.append(str);
            sb2.append(", increaseRegion=");
            return p0.p(sb2, z11, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Top3UpgradeStatus extends LeaderBoardRankState {
        private final String previousClass;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Top3UpgradeStatus(String previousClass) {
            super(null);
            m.f(previousClass, "previousClass");
            this.previousClass = previousClass;
        }

        public static /* synthetic */ Top3UpgradeStatus copy$default(Top3UpgradeStatus top3UpgradeStatus, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = top3UpgradeStatus.previousClass;
            }
            return top3UpgradeStatus.copy(str);
        }

        public final String component1() {
            return this.previousClass;
        }

        public final Top3UpgradeStatus copy(String previousClass) {
            m.f(previousClass, "previousClass");
            return new Top3UpgradeStatus(previousClass);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Top3UpgradeStatus) && m.a(this.previousClass, ((Top3UpgradeStatus) obj).previousClass);
        }

        public final String getPreviousClass() {
            return this.previousClass;
        }

        public int hashCode() {
            return this.previousClass.hashCode();
        }

        public String toString() {
            return a.g("Top3UpgradeStatus(previousClass=", this.previousClass, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UpgradeStatus extends LeaderBoardRankState {
        public static final UpgradeStatus INSTANCE = new UpgradeStatus();

        private UpgradeStatus() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UpgradeStatus);
        }

        public int hashCode() {
            return 1012275694;
        }

        public String toString() {
            return "UpgradeStatus";
        }
    }

    public /* synthetic */ LeaderBoardRankState(f fVar) {
        this();
    }

    private LeaderBoardRankState() {
    }
}
