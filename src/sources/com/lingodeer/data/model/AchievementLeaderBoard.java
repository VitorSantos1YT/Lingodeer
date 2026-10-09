package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c00.a;
import c00.e;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class AchievementLeaderBoard implements Parcelable {
    private final int count;
    private final String earnDate;
    private final long earnTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22280id;
    private final boolean isActive;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AchievementLeaderBoard> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return AchievementLeaderBoard$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<AchievementLeaderBoard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchievementLeaderBoard createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new AchievementLeaderBoard(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchievementLeaderBoard[] newArray(int i11) {
            return new AchievementLeaderBoard[i11];
        }
    }

    public /* synthetic */ AchievementLeaderBoard(int i11, String str, int i12, boolean z11, long j11, String str2, o1 o1Var) {
        if (23 != (i11 & 23)) {
            d1.k(i11, 23, AchievementLeaderBoard$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f22280id = str;
        this.count = i12;
        this.isActive = z11;
        if ((i11 & 8) == 0) {
            this.earnTime = 0L;
        } else {
            this.earnTime = j11;
        }
        this.earnDate = str2;
    }

    public static /* synthetic */ AchievementLeaderBoard copy$default(AchievementLeaderBoard achievementLeaderBoard, String str, int i11, boolean z11, long j11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = achievementLeaderBoard.f22280id;
        }
        if ((i12 & 2) != 0) {
            i11 = achievementLeaderBoard.count;
        }
        if ((i12 & 4) != 0) {
            z11 = achievementLeaderBoard.isActive;
        }
        if ((i12 & 8) != 0) {
            j11 = achievementLeaderBoard.earnTime;
        }
        if ((i12 & 16) != 0) {
            str2 = achievementLeaderBoard.earnDate;
        }
        String str3 = str2;
        boolean z12 = z11;
        return achievementLeaderBoard.copy(str, i11, z12, j11, str3);
    }

    public static final /* synthetic */ void write$Self$data_release(AchievementLeaderBoard achievementLeaderBoard, b bVar, g gVar) {
        bVar.w(gVar, 0, achievementLeaderBoard.f22280id);
        bVar.g(1, achievementLeaderBoard.count, gVar);
        bVar.B(gVar, 2, achievementLeaderBoard.isActive);
        if (bVar.G(gVar) || achievementLeaderBoard.earnTime != 0) {
            bVar.v(gVar, 3, achievementLeaderBoard.earnTime);
        }
        bVar.w(gVar, 4, achievementLeaderBoard.earnDate);
    }

    public final String component1() {
        return this.f22280id;
    }

    public final int component2() {
        return this.count;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final long component4() {
        return this.earnTime;
    }

    public final String component5() {
        return this.earnDate;
    }

    public final AchievementLeaderBoard copy(String id2, int i11, boolean z11, long j11, String earnDate) {
        m.f(id2, "id");
        m.f(earnDate, "earnDate");
        return new AchievementLeaderBoard(id2, i11, z11, j11, earnDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AchievementLeaderBoard)) {
            return false;
        }
        AchievementLeaderBoard achievementLeaderBoard = (AchievementLeaderBoard) obj;
        return m.a(this.f22280id, achievementLeaderBoard.f22280id) && this.count == achievementLeaderBoard.count && this.isActive == achievementLeaderBoard.isActive && this.earnTime == achievementLeaderBoard.earnTime && m.a(this.earnDate, achievementLeaderBoard.earnDate);
    }

    public final int getCount() {
        return this.count;
    }

    public final String getEarnDate() {
        return this.earnDate;
    }

    public final long getEarnTime() {
        return this.earnTime;
    }

    public final String getId() {
        return this.f22280id;
    }

    public int hashCode() {
        return this.earnDate.hashCode() + defpackage.e.f(this.earnTime, defpackage.e.e(defpackage.e.b(this.count, this.f22280id.hashCode() * 31, 31), 31, this.isActive), 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.f22280id;
        int i11 = this.count;
        boolean z11 = this.isActive;
        long j11 = this.earnTime;
        String str2 = this.earnDate;
        StringBuilder sbQ = defpackage.e.q(i11, "AchievementLeaderBoard(id=", str, ", count=", ", isActive=");
        sbQ.append(z11);
        sbQ.append(", earnTime=");
        sbQ.append(j11);
        return p.u(sbQ, ", earnDate=", str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeString(this.f22280id);
        dest.writeInt(this.count);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeLong(this.earnTime);
        dest.writeString(this.earnDate);
    }

    public AchievementLeaderBoard(String id2, int i11, boolean z11, long j11, String earnDate) {
        m.f(id2, "id");
        m.f(earnDate, "earnDate");
        this.f22280id = id2;
        this.count = i11;
        this.isActive = z11;
        this.earnTime = j11;
        this.earnDate = earnDate;
    }

    public /* synthetic */ AchievementLeaderBoard(String str, int i11, boolean z11, long j11, String str2, int i12, f fVar) {
        this(str, i11, z11, (i12 & 8) != 0 ? 0L : j11, str2);
    }
}
