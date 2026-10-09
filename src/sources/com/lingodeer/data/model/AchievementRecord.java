package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c00.a;
import c00.e;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class AchievementRecord implements Parcelable {
    private final String className;
    private final String earnDate;
    private final long earnTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22282id;
    private final boolean isActive;
    private final int record;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AchievementRecord> CREATOR = new Creator();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return AchievementRecord$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<AchievementRecord> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchievementRecord createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new AchievementRecord(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AchievementRecord[] newArray(int i11) {
            return new AchievementRecord[i11];
        }
    }

    public /* synthetic */ AchievementRecord(int i11, String str, int i12, boolean z11, long j11, String str2, String str3, o1 o1Var) {
        if (47 != (i11 & 47)) {
            d1.k(i11, 47, AchievementRecord$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f22282id = str;
        this.record = i12;
        this.isActive = z11;
        this.earnTime = j11;
        if ((i11 & 16) == 0) {
            this.className = BuildConfig.VERSION_NAME;
        } else {
            this.className = str2;
        }
        this.earnDate = str3;
    }

    public static /* synthetic */ AchievementRecord copy$default(AchievementRecord achievementRecord, String str, int i11, boolean z11, long j11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = achievementRecord.f22282id;
        }
        if ((i12 & 2) != 0) {
            i11 = achievementRecord.record;
        }
        if ((i12 & 4) != 0) {
            z11 = achievementRecord.isActive;
        }
        if ((i12 & 8) != 0) {
            j11 = achievementRecord.earnTime;
        }
        if ((i12 & 16) != 0) {
            str2 = achievementRecord.className;
        }
        if ((i12 & 32) != 0) {
            str3 = achievementRecord.earnDate;
        }
        long j12 = j11;
        boolean z12 = z11;
        return achievementRecord.copy(str, i11, z12, j12, str2, str3);
    }

    public static final /* synthetic */ void write$Self$data_release(AchievementRecord achievementRecord, b bVar, g gVar) {
        bVar.w(gVar, 0, achievementRecord.f22282id);
        bVar.g(1, achievementRecord.record, gVar);
        bVar.B(gVar, 2, achievementRecord.isActive);
        bVar.v(gVar, 3, achievementRecord.earnTime);
        if (bVar.G(gVar) || !m.a(achievementRecord.className, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, achievementRecord.className);
        }
        bVar.w(gVar, 5, achievementRecord.earnDate);
    }

    public final String component1() {
        return this.f22282id;
    }

    public final int component2() {
        return this.record;
    }

    public final boolean component3() {
        return this.isActive;
    }

    public final long component4() {
        return this.earnTime;
    }

    public final String component5() {
        return this.className;
    }

    public final String component6() {
        return this.earnDate;
    }

    public final AchievementRecord copy(String id2, int i11, boolean z11, long j11, String className, String earnDate) {
        m.f(id2, "id");
        m.f(className, "className");
        m.f(earnDate, "earnDate");
        return new AchievementRecord(id2, i11, z11, j11, className, earnDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AchievementRecord)) {
            return false;
        }
        AchievementRecord achievementRecord = (AchievementRecord) obj;
        return m.a(this.f22282id, achievementRecord.f22282id) && this.record == achievementRecord.record && this.isActive == achievementRecord.isActive && this.earnTime == achievementRecord.earnTime && m.a(this.className, achievementRecord.className) && m.a(this.earnDate, achievementRecord.earnDate);
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getEarnDate() {
        return this.earnDate;
    }

    public final long getEarnTime() {
        return this.earnTime;
    }

    public final String getId() {
        return this.f22282id;
    }

    public final int getRecord() {
        return this.record;
    }

    public int hashCode() {
        return this.earnDate.hashCode() + defpackage.e.d(defpackage.e.f(this.earnTime, defpackage.e.e(defpackage.e.b(this.record, this.f22282id.hashCode() * 31, 31), 31, this.isActive), 31), 31, this.className);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.f22282id;
        int i11 = this.record;
        boolean z11 = this.isActive;
        long j11 = this.earnTime;
        String str2 = this.className;
        String str3 = this.earnDate;
        StringBuilder sbQ = defpackage.e.q(i11, "AchievementRecord(id=", str, ", record=", ", isActive=");
        sbQ.append(z11);
        sbQ.append(", earnTime=");
        sbQ.append(j11);
        d.w(sbQ, ", className=", str2, ", earnDate=", str3);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeString(this.f22282id);
        dest.writeInt(this.record);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeLong(this.earnTime);
        dest.writeString(this.className);
        dest.writeString(this.earnDate);
    }

    public AchievementRecord(String id2, int i11, boolean z11, long j11, String className, String earnDate) {
        m.f(id2, "id");
        m.f(className, "className");
        m.f(earnDate, "earnDate");
        this.f22282id = id2;
        this.record = i11;
        this.isActive = z11;
        this.earnTime = j11;
        this.className = className;
        this.earnDate = earnDate;
    }

    public /* synthetic */ AchievementRecord(String str, int i11, boolean z11, long j11, String str2, String str3, int i12, f fVar) {
        this(str, i11, z11, j11, (i12 & 16) != 0 ? BuildConfig.VERSION_NAME : str2, str3);
    }
}
