package com.lingodeer.data.model.uistate;

import c00.a;
import c00.e;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class LeaderBoardUser {
    public static final Companion Companion = new Companion(null);
    private final String achievementLanguages;
    private final String achievementLeaderboard;
    private final String achievementStreakHero;
    private final String achievementTopStudent;
    private final String achievementXPExpert;
    private final String curLan;
    private final int dayStreak;
    private final int emojiStatus;
    private final String group;
    private final String imageName;
    private final boolean isFriend;
    private final boolean isMe;
    private final String messageToken;
    private final String nickName;
    private final int rank;
    private final boolean shareMe;
    private final int totalTime;
    private final int totalXP;
    private final String uiLan;
    private final String uid;
    private final int weekEarnedXP;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return LeaderBoardUser$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public LeaderBoardUser() {
        this((String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 2097151, (f) null);
    }

    public static /* synthetic */ LeaderBoardUser copy$default(LeaderBoardUser leaderBoardUser, String str, int i11, int i12, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, boolean z13, int i13, int i14, int i15, int i16, String str8, String str9, String str10, String str11, String str12, int i17, Object obj) {
        String str13;
        String str14;
        String str15 = (i17 & 1) != 0 ? leaderBoardUser.uid : str;
        int i18 = (i17 & 2) != 0 ? leaderBoardUser.rank : i11;
        int i19 = (i17 & 4) != 0 ? leaderBoardUser.weekEarnedXP : i12;
        String str16 = (i17 & 8) != 0 ? leaderBoardUser.nickName : str2;
        String str17 = (i17 & 16) != 0 ? leaderBoardUser.imageName : str3;
        String str18 = (i17 & 32) != 0 ? leaderBoardUser.messageToken : str4;
        String str19 = (i17 & 64) != 0 ? leaderBoardUser.uiLan : str5;
        String str20 = (i17 & 128) != 0 ? leaderBoardUser.curLan : str6;
        String str21 = (i17 & 256) != 0 ? leaderBoardUser.group : str7;
        boolean z14 = (i17 & 512) != 0 ? leaderBoardUser.shareMe : z11;
        boolean z15 = (i17 & 1024) != 0 ? leaderBoardUser.isFriend : z12;
        boolean z16 = (i17 & 2048) != 0 ? leaderBoardUser.isMe : z13;
        int i21 = (i17 & 4096) != 0 ? leaderBoardUser.emojiStatus : i13;
        int i22 = (i17 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? leaderBoardUser.dayStreak : i14;
        String str22 = str15;
        int i23 = (i17 & 16384) != 0 ? leaderBoardUser.totalXP : i15;
        int i24 = (i17 & 32768) != 0 ? leaderBoardUser.totalTime : i16;
        String str23 = (i17 & 65536) != 0 ? leaderBoardUser.achievementTopStudent : str8;
        String str24 = (i17 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? leaderBoardUser.achievementXPExpert : str9;
        String str25 = (i17 & 262144) != 0 ? leaderBoardUser.achievementStreakHero : str10;
        String str26 = (i17 & 524288) != 0 ? leaderBoardUser.achievementLeaderboard : str11;
        if ((i17 & 1048576) != 0) {
            str14 = str26;
            str13 = leaderBoardUser.achievementLanguages;
        } else {
            str13 = str12;
            str14 = str26;
        }
        return leaderBoardUser.copy(str22, i18, i19, str16, str17, str18, str19, str20, str21, z14, z15, z16, i21, i22, i23, i24, str23, str24, str25, str14, str13);
    }

    public static final /* synthetic */ void write$Self$data_release(LeaderBoardUser leaderBoardUser, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(leaderBoardUser.uid, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, leaderBoardUser.uid);
        }
        if (bVar.G(gVar) || leaderBoardUser.rank != 0) {
            bVar.g(1, leaderBoardUser.rank, gVar);
        }
        if (bVar.G(gVar) || leaderBoardUser.weekEarnedXP != 0) {
            bVar.g(2, leaderBoardUser.weekEarnedXP, gVar);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.nickName, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, leaderBoardUser.nickName);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.imageName, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, leaderBoardUser.imageName);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.messageToken, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 5, leaderBoardUser.messageToken);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.uiLan, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 6, leaderBoardUser.uiLan);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.curLan, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 7, leaderBoardUser.curLan);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.group, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 8, leaderBoardUser.group);
        }
        if (bVar.G(gVar) || !leaderBoardUser.shareMe) {
            bVar.B(gVar, 9, leaderBoardUser.shareMe);
        }
        if (bVar.G(gVar) || leaderBoardUser.isFriend) {
            bVar.B(gVar, 10, leaderBoardUser.isFriend);
        }
        if (bVar.G(gVar) || leaderBoardUser.isMe) {
            bVar.B(gVar, 11, leaderBoardUser.isMe);
        }
        if (bVar.G(gVar) || leaderBoardUser.emojiStatus != -1) {
            bVar.g(12, leaderBoardUser.emojiStatus, gVar);
        }
        if (bVar.G(gVar) || leaderBoardUser.dayStreak != 0) {
            bVar.g(13, leaderBoardUser.dayStreak, gVar);
        }
        if (bVar.G(gVar) || leaderBoardUser.totalXP != 9) {
            bVar.g(14, leaderBoardUser.totalXP, gVar);
        }
        if (bVar.G(gVar) || leaderBoardUser.totalTime != 0) {
            bVar.g(15, leaderBoardUser.totalTime, gVar);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.achievementTopStudent, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 16, leaderBoardUser.achievementTopStudent);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.achievementXPExpert, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 17, leaderBoardUser.achievementXPExpert);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.achievementStreakHero, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 18, leaderBoardUser.achievementStreakHero);
        }
        if (bVar.G(gVar) || !m.a(leaderBoardUser.achievementLeaderboard, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 19, leaderBoardUser.achievementLeaderboard);
        }
        if (!bVar.G(gVar) && m.a(leaderBoardUser.achievementLanguages, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 20, leaderBoardUser.achievementLanguages);
    }

    public final String component1() {
        return this.uid;
    }

    public final boolean component10() {
        return this.shareMe;
    }

    public final boolean component11() {
        return this.isFriend;
    }

    public final boolean component12() {
        return this.isMe;
    }

    public final int component13() {
        return this.emojiStatus;
    }

    public final int component14() {
        return this.dayStreak;
    }

    public final int component15() {
        return this.totalXP;
    }

    public final int component16() {
        return this.totalTime;
    }

    public final String component17() {
        return this.achievementTopStudent;
    }

    public final String component18() {
        return this.achievementXPExpert;
    }

    public final String component19() {
        return this.achievementStreakHero;
    }

    public final int component2() {
        return this.rank;
    }

    public final String component20() {
        return this.achievementLeaderboard;
    }

    public final String component21() {
        return this.achievementLanguages;
    }

    public final int component3() {
        return this.weekEarnedXP;
    }

    public final String component4() {
        return this.nickName;
    }

    public final String component5() {
        return this.imageName;
    }

    public final String component6() {
        return this.messageToken;
    }

    public final String component7() {
        return this.uiLan;
    }

    public final String component8() {
        return this.curLan;
    }

    public final String component9() {
        return this.group;
    }

    public final LeaderBoardUser copy(String uid, int i11, int i12, String nickName, String imageName, String messageToken, String uiLan, String curLan, String group, boolean z11, boolean z12, boolean z13, int i13, int i14, int i15, int i16, String achievementTopStudent, String achievementXPExpert, String achievementStreakHero, String achievementLeaderboard, String achievementLanguages) {
        m.f(uid, "uid");
        m.f(nickName, "nickName");
        m.f(imageName, "imageName");
        m.f(messageToken, "messageToken");
        m.f(uiLan, "uiLan");
        m.f(curLan, "curLan");
        m.f(group, "group");
        m.f(achievementTopStudent, "achievementTopStudent");
        m.f(achievementXPExpert, "achievementXPExpert");
        m.f(achievementStreakHero, "achievementStreakHero");
        m.f(achievementLeaderboard, "achievementLeaderboard");
        m.f(achievementLanguages, "achievementLanguages");
        return new LeaderBoardUser(uid, i11, i12, nickName, imageName, messageToken, uiLan, curLan, group, z11, z12, z13, i13, i14, i15, i16, achievementTopStudent, achievementXPExpert, achievementStreakHero, achievementLeaderboard, achievementLanguages);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderBoardUser)) {
            return false;
        }
        LeaderBoardUser leaderBoardUser = (LeaderBoardUser) obj;
        return m.a(this.uid, leaderBoardUser.uid) && this.rank == leaderBoardUser.rank && this.weekEarnedXP == leaderBoardUser.weekEarnedXP && m.a(this.nickName, leaderBoardUser.nickName) && m.a(this.imageName, leaderBoardUser.imageName) && m.a(this.messageToken, leaderBoardUser.messageToken) && m.a(this.uiLan, leaderBoardUser.uiLan) && m.a(this.curLan, leaderBoardUser.curLan) && m.a(this.group, leaderBoardUser.group) && this.shareMe == leaderBoardUser.shareMe && this.isFriend == leaderBoardUser.isFriend && this.isMe == leaderBoardUser.isMe && this.emojiStatus == leaderBoardUser.emojiStatus && this.dayStreak == leaderBoardUser.dayStreak && this.totalXP == leaderBoardUser.totalXP && this.totalTime == leaderBoardUser.totalTime && m.a(this.achievementTopStudent, leaderBoardUser.achievementTopStudent) && m.a(this.achievementXPExpert, leaderBoardUser.achievementXPExpert) && m.a(this.achievementStreakHero, leaderBoardUser.achievementStreakHero) && m.a(this.achievementLeaderboard, leaderBoardUser.achievementLeaderboard) && m.a(this.achievementLanguages, leaderBoardUser.achievementLanguages);
    }

    public final String getAchievementLanguages() {
        return this.achievementLanguages;
    }

    public final String getAchievementLeaderboard() {
        return this.achievementLeaderboard;
    }

    public final String getAchievementStreakHero() {
        return this.achievementStreakHero;
    }

    public final String getAchievementTopStudent() {
        return this.achievementTopStudent;
    }

    public final String getAchievementXPExpert() {
        return this.achievementXPExpert;
    }

    public final String getCurLan() {
        return this.curLan;
    }

    public final int getDayStreak() {
        return this.dayStreak;
    }

    public final int getEmojiStatus() {
        return this.emojiStatus;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getImageName() {
        return this.imageName;
    }

    public final String getMessageToken() {
        return this.messageToken;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final int getRank() {
        return this.rank;
    }

    public final boolean getShareMe() {
        return this.shareMe;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public final int getTotalXP() {
        return this.totalXP;
    }

    public final String getUiLan() {
        return this.uiLan;
    }

    public final String getUid() {
        return this.uid;
    }

    public final int getWeekEarnedXP() {
        return this.weekEarnedXP;
    }

    public int hashCode() {
        return this.achievementLanguages.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.b(this.totalTime, defpackage.e.b(this.totalXP, defpackage.e.b(this.dayStreak, defpackage.e.b(this.emojiStatus, defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.b(this.weekEarnedXP, defpackage.e.b(this.rank, this.uid.hashCode() * 31, 31), 31), 31, this.nickName), 31, this.imageName), 31, this.messageToken), 31, this.uiLan), 31, this.curLan), 31, this.group), 31, this.shareMe), 31, this.isFriend), 31, this.isMe), 31), 31), 31), 31), 31, this.achievementTopStudent), 31, this.achievementXPExpert), 31, this.achievementStreakHero), 31, this.achievementLeaderboard);
    }

    public final boolean isFriend() {
        return this.isFriend;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public String toString() {
        String str = this.uid;
        int i11 = this.rank;
        int i12 = this.weekEarnedXP;
        String str2 = this.nickName;
        String str3 = this.imageName;
        String str4 = this.messageToken;
        String str5 = this.uiLan;
        String str6 = this.curLan;
        String str7 = this.group;
        boolean z11 = this.shareMe;
        boolean z12 = this.isFriend;
        boolean z13 = this.isMe;
        int i13 = this.emojiStatus;
        int i14 = this.dayStreak;
        int i15 = this.totalXP;
        int i16 = this.totalTime;
        String str8 = this.achievementTopStudent;
        String str9 = this.achievementXPExpert;
        String str10 = this.achievementStreakHero;
        String str11 = this.achievementLeaderboard;
        String str12 = this.achievementLanguages;
        StringBuilder sbQ = defpackage.e.q(i11, "LeaderBoardUser(uid=", str, ", rank=", ", weekEarnedXP=");
        sbQ.append(i12);
        sbQ.append(", nickName=");
        sbQ.append(str2);
        sbQ.append(", imageName=");
        d.w(sbQ, str3, ", messageToken=", str4, ", uiLan=");
        d.w(sbQ, str5, ", curLan=", str6, ", group=");
        sbQ.append(str7);
        sbQ.append(", shareMe=");
        sbQ.append(z11);
        sbQ.append(", isFriend=");
        ep.a.B(", isMe=", ", emojiStatus=", sbQ, z12, z13);
        ep.a.v(i13, i14, ", dayStreak=", ", totalXP=", sbQ);
        ep.a.v(i15, i16, ", totalTime=", ", achievementTopStudent=", sbQ);
        d.w(sbQ, str8, ", achievementXPExpert=", str9, ", achievementStreakHero=");
        d.w(sbQ, str10, ", achievementLeaderboard=", str11, ", achievementLanguages=");
        return ep.a.k(sbQ, str12, ")");
    }

    public /* synthetic */ LeaderBoardUser(int i11, String str, int i12, int i13, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, String str8, String str9, String str10, String str11, String str12, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.uid = BuildConfig.VERSION_NAME;
        } else {
            this.uid = str;
        }
        if ((i11 & 2) == 0) {
            this.rank = 0;
        } else {
            this.rank = i12;
        }
        if ((i11 & 4) == 0) {
            this.weekEarnedXP = 0;
        } else {
            this.weekEarnedXP = i13;
        }
        if ((i11 & 8) == 0) {
            this.nickName = BuildConfig.VERSION_NAME;
        } else {
            this.nickName = str2;
        }
        if ((i11 & 16) == 0) {
            this.imageName = BuildConfig.VERSION_NAME;
        } else {
            this.imageName = str3;
        }
        if ((i11 & 32) == 0) {
            this.messageToken = BuildConfig.VERSION_NAME;
        } else {
            this.messageToken = str4;
        }
        if ((i11 & 64) == 0) {
            this.uiLan = BuildConfig.VERSION_NAME;
        } else {
            this.uiLan = str5;
        }
        if ((i11 & 128) == 0) {
            this.curLan = BuildConfig.VERSION_NAME;
        } else {
            this.curLan = str6;
        }
        if ((i11 & 256) == 0) {
            this.group = BuildConfig.VERSION_NAME;
        } else {
            this.group = str7;
        }
        if ((i11 & 512) == 0) {
            this.shareMe = true;
        } else {
            this.shareMe = z11;
        }
        if ((i11 & 1024) == 0) {
            this.isFriend = false;
        } else {
            this.isFriend = z12;
        }
        if ((i11 & 2048) == 0) {
            this.isMe = false;
        } else {
            this.isMe = z13;
        }
        this.emojiStatus = (i11 & 4096) == 0 ? -1 : i14;
        if ((i11 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
            this.dayStreak = 0;
        } else {
            this.dayStreak = i15;
        }
        this.totalXP = (i11 & 16384) == 0 ? 9 : i16;
        if ((32768 & i11) == 0) {
            this.totalTime = 0;
        } else {
            this.totalTime = i17;
        }
        if ((65536 & i11) == 0) {
            this.achievementTopStudent = BuildConfig.VERSION_NAME;
        } else {
            this.achievementTopStudent = str8;
        }
        if ((131072 & i11) == 0) {
            this.achievementXPExpert = BuildConfig.VERSION_NAME;
        } else {
            this.achievementXPExpert = str9;
        }
        if ((262144 & i11) == 0) {
            this.achievementStreakHero = BuildConfig.VERSION_NAME;
        } else {
            this.achievementStreakHero = str10;
        }
        if ((524288 & i11) == 0) {
            this.achievementLeaderboard = BuildConfig.VERSION_NAME;
        } else {
            this.achievementLeaderboard = str11;
        }
        if ((i11 & 1048576) == 0) {
            this.achievementLanguages = BuildConfig.VERSION_NAME;
        } else {
            this.achievementLanguages = str12;
        }
    }

    public LeaderBoardUser(String uid, int i11, int i12, String nickName, String imageName, String messageToken, String uiLan, String curLan, String group, boolean z11, boolean z12, boolean z13, int i13, int i14, int i15, int i16, String achievementTopStudent, String achievementXPExpert, String achievementStreakHero, String achievementLeaderboard, String achievementLanguages) {
        m.f(uid, "uid");
        m.f(nickName, "nickName");
        m.f(imageName, "imageName");
        m.f(messageToken, "messageToken");
        m.f(uiLan, "uiLan");
        m.f(curLan, "curLan");
        m.f(group, "group");
        m.f(achievementTopStudent, "achievementTopStudent");
        m.f(achievementXPExpert, "achievementXPExpert");
        m.f(achievementStreakHero, "achievementStreakHero");
        m.f(achievementLeaderboard, "achievementLeaderboard");
        m.f(achievementLanguages, "achievementLanguages");
        this.uid = uid;
        this.rank = i11;
        this.weekEarnedXP = i12;
        this.nickName = nickName;
        this.imageName = imageName;
        this.messageToken = messageToken;
        this.uiLan = uiLan;
        this.curLan = curLan;
        this.group = group;
        this.shareMe = z11;
        this.isFriend = z12;
        this.isMe = z13;
        this.emojiStatus = i13;
        this.dayStreak = i14;
        this.totalXP = i15;
        this.totalTime = i16;
        this.achievementTopStudent = achievementTopStudent;
        this.achievementXPExpert = achievementXPExpert;
        this.achievementStreakHero = achievementStreakHero;
        this.achievementLeaderboard = achievementLeaderboard;
        this.achievementLanguages = achievementLanguages;
    }

    public /* synthetic */ LeaderBoardUser(String str, int i11, int i12, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, boolean z12, boolean z13, int i13, int i14, int i15, int i16, String str8, String str9, String str10, String str11, String str12, int i17, f fVar) {
        this((i17 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i17 & 2) != 0 ? 0 : i11, (i17 & 4) != 0 ? 0 : i12, (i17 & 8) != 0 ? BuildConfig.VERSION_NAME : str2, (i17 & 16) != 0 ? BuildConfig.VERSION_NAME : str3, (i17 & 32) != 0 ? BuildConfig.VERSION_NAME : str4, (i17 & 64) != 0 ? BuildConfig.VERSION_NAME : str5, (i17 & 128) != 0 ? BuildConfig.VERSION_NAME : str6, (i17 & 256) != 0 ? BuildConfig.VERSION_NAME : str7, (i17 & 512) != 0 ? true : z11, (i17 & 1024) != 0 ? false : z12, (i17 & 2048) != 0 ? false : z13, (i17 & 4096) != 0 ? -1 : i13, (i17 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? 0 : i14, (i17 & 16384) != 0 ? 9 : i15, (i17 & 32768) != 0 ? 0 : i16, (i17 & 65536) != 0 ? BuildConfig.VERSION_NAME : str8, (i17 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str9, (i17 & 262144) != 0 ? BuildConfig.VERSION_NAME : str10, (i17 & 524288) != 0 ? BuildConfig.VERSION_NAME : str11, (i17 & 1048576) != 0 ? BuildConfig.VERSION_NAME : str12);
    }

    public static /* synthetic */ void getDayStreak$annotations() {
    }

    public static /* synthetic */ void getMessageToken$annotations() {
    }

    public static /* synthetic */ void getUiLan$annotations() {
    }
}
