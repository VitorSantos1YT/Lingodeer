package fr;

import com.lingodeer.data.model.uistate.LeaderBoardRankState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LeaderBoardRankState f27987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27989c;

    public /* synthetic */ y1(LeaderBoardRankState leaderBoardRankState, String str, int i11) {
        this(leaderBoardRankState, (i11 & 2) != 0 ? null : str, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return kotlin.jvm.internal.m.a(this.f27987a, y1Var.f27987a) && kotlin.jvm.internal.m.a(this.f27988b, y1Var.f27988b) && kotlin.jvm.internal.m.a(this.f27989c, y1Var.f27989c);
    }

    public final int hashCode() {
        int iHashCode = this.f27987a.hashCode() * 31;
        String str = this.f27988b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27989c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LeaderBoardSettlement(rankState=");
        sb2.append(this.f27987a);
        sb2.append(", achievementClass=");
        sb2.append(this.f27988b);
        sb2.append(", achievementWeek=");
        return ep.a.k(sb2, this.f27989c, ")");
    }

    public y1(LeaderBoardRankState rankState, String str, String str2) {
        kotlin.jvm.internal.m.f(rankState, "rankState");
        this.f27987a = rankState;
        this.f27988b = str;
        this.f27989c = str2;
    }
}
