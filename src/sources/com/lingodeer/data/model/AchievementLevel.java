package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b7.e0;
import c00.a;
import c00.e;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class AchievementLevel implements Parcelable {
    private int currentValue;
    private final String earnDate;
    private final long earnTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22281id;
    private final boolean isActive;
    private final int level;
    private final String levelHistory;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AchievementLevel> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return AchievementLevel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<AchievementLevel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchievementLevel createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new AchievementLevel(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchievementLevel[] newArray(int i11) {
            return new AchievementLevel[i11];
        }
    }

    public /* synthetic */ AchievementLevel(int i11, String str, int i12, boolean z11, String str2, long j11, String str3, int i13, o1 o1Var) {
        if (47 != (i11 & 47)) {
            d1.k(i11, 47, AchievementLevel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f22281id = str;
        this.level = i12;
        this.isActive = z11;
        this.levelHistory = str2;
        if ((i11 & 16) == 0) {
            this.earnTime = 0L;
        } else {
            this.earnTime = j11;
        }
        this.earnDate = str3;
        if ((i11 & 64) == 0) {
            this.currentValue = 0;
        } else {
            this.currentValue = i13;
        }
    }

    public static /* synthetic */ AchievementLevel copy$default(AchievementLevel achievementLevel, String str, int i11, boolean z11, String str2, long j11, String str3, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = achievementLevel.f22281id;
        }
        if ((i13 & 2) != 0) {
            i11 = achievementLevel.level;
        }
        if ((i13 & 4) != 0) {
            z11 = achievementLevel.isActive;
        }
        if ((i13 & 8) != 0) {
            str2 = achievementLevel.levelHistory;
        }
        if ((i13 & 16) != 0) {
            j11 = achievementLevel.earnTime;
        }
        if ((i13 & 32) != 0) {
            str3 = achievementLevel.earnDate;
        }
        if ((i13 & 64) != 0) {
            i12 = achievementLevel.currentValue;
        }
        long j12 = j11;
        boolean z12 = z11;
        String str4 = str2;
        return achievementLevel.copy(str, i11, z12, str4, j12, str3, i12);
    }

    public static final /* synthetic */ void write$Self$data_release(AchievementLevel achievementLevel, b bVar, g gVar) {
        bVar.w(gVar, 0, achievementLevel.f22281id);
        bVar.g(1, achievementLevel.level, gVar);
        bVar.B(gVar, 2, achievementLevel.isActive);
        bVar.w(gVar, 3, achievementLevel.levelHistory);
        if (bVar.G(gVar) || achievementLevel.earnTime != 0) {
            bVar.v(gVar, 4, achievementLevel.earnTime);
        }
        bVar.w(gVar, 5, achievementLevel.earnDate);
        if (!bVar.G(gVar) && achievementLevel.currentValue == 0) {
            return;
        }
        bVar.g(6, achievementLevel.currentValue, gVar);
    }

    public final String component1() {
        return this.f22281id;
    }

    public final int component2() {
        return this.level;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final String component4() {
        return this.levelHistory;
    }

    public final long component5() {
        return this.earnTime;
    }

    public final String component6() {
        return this.earnDate;
    }

    public final int component7() {
        return this.currentValue;
    }

    public final AchievementLevel copy(String id2, int i11, boolean z11, String levelHistory, long j11, String earnDate, int i12) {
        m.f(id2, "id");
        m.f(levelHistory, "levelHistory");
        m.f(earnDate, "earnDate");
        return new AchievementLevel(id2, i11, z11, levelHistory, j11, earnDate, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AchievementLevel)) {
            return false;
        }
        AchievementLevel achievementLevel = (AchievementLevel) obj;
        return m.a(this.f22281id, achievementLevel.f22281id) && this.level == achievementLevel.level && this.isActive == achievementLevel.isActive && m.a(this.levelHistory, achievementLevel.levelHistory) && this.earnTime == achievementLevel.earnTime && m.a(this.earnDate, achievementLevel.earnDate) && this.currentValue == achievementLevel.currentValue;
    }

    public final int getCurrentValue() {
        return this.currentValue;
    }

    public final String getEarnDate() {
        return this.earnDate;
    }

    public final long getEarnTime() {
        return this.earnTime;
    }

    public final String getId() {
        return this.f22281id;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getLevelHistory() {
        return this.levelHistory;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentValue) + defpackage.e.d(defpackage.e.f(this.earnTime, defpackage.e.d(defpackage.e.e(defpackage.e.b(this.level, this.f22281id.hashCode() * 31, 31), 31, this.isActive), 31, this.levelHistory), 31), 31, this.earnDate);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setCurrentValue(int i11) {
        this.currentValue = i11;
    }

    public String toString() {
        String str = this.f22281id;
        int i11 = this.level;
        boolean z11 = this.isActive;
        String str2 = this.levelHistory;
        long j11 = this.earnTime;
        String str3 = this.earnDate;
        int i12 = this.currentValue;
        StringBuilder sbQ = defpackage.e.q(i11, "AchievementLevel(id=", str, ", level=", ", isActive=");
        sbQ.append(z11);
        sbQ.append(", levelHistory=");
        sbQ.append(str2);
        sbQ.append(", earnTime=");
        e0.w(j11, ", earnDate=", str3, sbQ);
        sbQ.append(", currentValue=");
        sbQ.append(i12);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeString(this.f22281id);
        dest.writeInt(this.level);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeString(this.levelHistory);
        dest.writeLong(this.earnTime);
        dest.writeString(this.earnDate);
        dest.writeInt(this.currentValue);
    }

    public AchievementLevel(String id2, int i11, boolean z11, String levelHistory, long j11, String str, int i12) {
        m.f(id2, "id");
        m.f(levelHistory, "levelHistory");
        m.f(str, gkbGsXmgaxRjJ.CfRkFDQydcehMN);
        this.f22281id = id2;
        this.level = i11;
        this.isActive = z11;
        this.levelHistory = levelHistory;
        this.earnTime = j11;
        this.earnDate = str;
        this.currentValue = i12;
    }

    public /* synthetic */ AchievementLevel(String str, int i11, boolean z11, String str2, long j11, String str3, int i12, int i13, f fVar) {
        this(str, i11, z11, str2, (i13 & 16) != 0 ? 0L : j11, str3, (i13 & 64) != 0 ? 0 : i12);
    }
}
