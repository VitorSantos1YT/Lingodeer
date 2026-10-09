package com.lingodeer.data.model.uistate;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import hh.p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeaderBoardClass {
    private final String className;
    private final int greyIconRes;
    private final boolean isActiveClass;
    private final boolean isCurClass;
    private final List<LeaderBoardUser> leaderBoardUserList;
    private final int mediumIconRes;
    private final List<LeaderBoardUser> preLeaderBoardUserList;
    private final int preRank;
    private final int rank;
    private final int smallIconRes;

    public LeaderBoardClass() {
        this(null, 0, 0, 0, false, false, 0, 0, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeaderBoardClass copy$default(LeaderBoardClass leaderBoardClass, String str, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15, List list, List list2, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = leaderBoardClass.className;
        }
        if ((i16 & 2) != 0) {
            i11 = leaderBoardClass.mediumIconRes;
        }
        if ((i16 & 4) != 0) {
            i12 = leaderBoardClass.smallIconRes;
        }
        if ((i16 & 8) != 0) {
            i13 = leaderBoardClass.greyIconRes;
        }
        if ((i16 & 16) != 0) {
            z11 = leaderBoardClass.isCurClass;
        }
        if ((i16 & 32) != 0) {
            z12 = leaderBoardClass.isActiveClass;
        }
        if ((i16 & 64) != 0) {
            i14 = leaderBoardClass.rank;
        }
        if ((i16 & 128) != 0) {
            i15 = leaderBoardClass.preRank;
        }
        if ((i16 & 256) != 0) {
            list = leaderBoardClass.leaderBoardUserList;
        }
        if ((i16 & 512) != 0) {
            list2 = leaderBoardClass.preLeaderBoardUserList;
        }
        List list3 = list;
        List list4 = list2;
        int i17 = i14;
        int i18 = i15;
        boolean z13 = z11;
        boolean z14 = z12;
        return leaderBoardClass.copy(str, i11, i12, i13, z13, z14, i17, i18, list3, list4);
    }

    public final String component1() {
        return this.className;
    }

    public final List<LeaderBoardUser> component10() {
        return this.preLeaderBoardUserList;
    }

    public final int component2() {
        return this.mediumIconRes;
    }

    public final int component3() {
        return this.smallIconRes;
    }

    public final int component4() {
        return this.greyIconRes;
    }

    public final boolean component5() {
        return this.isCurClass;
    }

    public final boolean component6() {
        return this.isActiveClass;
    }

    public final int component7() {
        return this.rank;
    }

    public final int component8() {
        return this.preRank;
    }

    public final List<LeaderBoardUser> component9() {
        return this.leaderBoardUserList;
    }

    public final LeaderBoardClass copy(String className, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15, List<LeaderBoardUser> leaderBoardUserList, List<LeaderBoardUser> preLeaderBoardUserList) {
        m.f(className, "className");
        m.f(leaderBoardUserList, "leaderBoardUserList");
        m.f(preLeaderBoardUserList, "preLeaderBoardUserList");
        return new LeaderBoardClass(className, i11, i12, i13, z11, z12, i14, i15, leaderBoardUserList, preLeaderBoardUserList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderBoardClass)) {
            return false;
        }
        LeaderBoardClass leaderBoardClass = (LeaderBoardClass) obj;
        return m.a(this.className, leaderBoardClass.className) && this.mediumIconRes == leaderBoardClass.mediumIconRes && this.smallIconRes == leaderBoardClass.smallIconRes && this.greyIconRes == leaderBoardClass.greyIconRes && this.isCurClass == leaderBoardClass.isCurClass && this.isActiveClass == leaderBoardClass.isActiveClass && this.rank == leaderBoardClass.rank && this.preRank == leaderBoardClass.preRank && m.a(this.leaderBoardUserList, leaderBoardClass.leaderBoardUserList) && m.a(this.preLeaderBoardUserList, leaderBoardClass.preLeaderBoardUserList);
    }

    public final String getClassName() {
        return this.className;
    }

    public final int getGreyIconRes() {
        return this.greyIconRes;
    }

    public final List<LeaderBoardUser> getLeaderBoardUserList() {
        return this.leaderBoardUserList;
    }

    public final int getMediumIconRes() {
        return this.mediumIconRes;
    }

    public final List<LeaderBoardUser> getPreLeaderBoardUserList() {
        return this.preLeaderBoardUserList;
    }

    public final int getPreRank() {
        return this.preRank;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getSmallIconRes() {
        return this.smallIconRes;
    }

    public int hashCode() {
        return this.preLeaderBoardUserList.hashCode() + p0.b(e.b(this.preRank, e.b(this.rank, e.e(e.e(e.b(this.greyIconRes, e.b(this.smallIconRes, e.b(this.mediumIconRes, this.className.hashCode() * 31, 31), 31), 31), 31, this.isCurClass), 31, this.isActiveClass), 31), 31), 31, this.leaderBoardUserList);
    }

    public final boolean isActiveClass() {
        return this.isActiveClass;
    }

    public final boolean isCurClass() {
        return this.isCurClass;
    }

    public String toString() {
        String str = this.className;
        int i11 = this.mediumIconRes;
        int i12 = this.smallIconRes;
        int i13 = this.greyIconRes;
        boolean z11 = this.isCurClass;
        boolean z12 = this.isActiveClass;
        int i14 = this.rank;
        int i15 = this.preRank;
        List<LeaderBoardUser> list = this.leaderBoardUserList;
        List<LeaderBoardUser> list2 = this.preLeaderBoardUserList;
        StringBuilder sbQ = e.q(i11, "LeaderBoardClass(className=", str, ", mediumIconRes=", ", smallIconRes=");
        a.v(i12, i13, ", greyIconRes=", ", isCurClass=", sbQ);
        a.B(", isActiveClass=", ", rank=", sbQ, z11, z12);
        a.v(i14, i15, ", preRank=", ", leaderBoardUserList=", sbQ);
        sbQ.append(list);
        sbQ.append(", preLeaderBoardUserList=");
        sbQ.append(list2);
        sbQ.append(")");
        return sbQ.toString();
    }

    public LeaderBoardClass(String className, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15, List<LeaderBoardUser> leaderBoardUserList, List<LeaderBoardUser> preLeaderBoardUserList) {
        m.f(className, "className");
        m.f(leaderBoardUserList, "leaderBoardUserList");
        m.f(preLeaderBoardUserList, "preLeaderBoardUserList");
        this.className = className;
        this.mediumIconRes = i11;
        this.smallIconRes = i12;
        this.greyIconRes = i13;
        this.isCurClass = z11;
        this.isActiveClass = z12;
        this.rank = i14;
        this.preRank = i15;
        this.leaderBoardUserList = leaderBoardUserList;
        this.preLeaderBoardUserList = preLeaderBoardUserList;
    }

    public /* synthetic */ LeaderBoardClass(String str, int i11, int i12, int i13, boolean z11, boolean z12, int i14, int i15, List list, List list2, int i16, f fVar) {
        this((i16 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i16 & 2) != 0 ? 0 : i11, (i16 & 4) != 0 ? 0 : i12, (i16 & 8) != 0 ? 0 : i13, (i16 & 16) != 0 ? false : z11, (i16 & 32) != 0 ? false : z12, (i16 & 64) != 0 ? 0 : i14, (i16 & 128) != 0 ? 0 : i15, (i16 & 256) != 0 ? new ArrayList() : list, (i16 & 512) != 0 ? new ArrayList() : list2);
    }
}
