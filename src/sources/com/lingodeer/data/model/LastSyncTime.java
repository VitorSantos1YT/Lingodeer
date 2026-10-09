package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.d;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LastSyncTime implements Parcelable {
    public static final Parcelable.Creator<LastSyncTime> CREATOR = new Creator();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22310id;
    private final long lastSyncTime;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<LastSyncTime> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LastSyncTime createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new LastSyncTime(parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LastSyncTime[] newArray(int i11) {
            return new LastSyncTime[i11];
        }
    }

    public LastSyncTime(String id2, long j11) {
        m.f(id2, "id");
        this.f22310id = id2;
        this.lastSyncTime = j11;
    }

    public static /* synthetic */ LastSyncTime copy$default(LastSyncTime lastSyncTime, String str, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lastSyncTime.f22310id;
        }
        if ((i11 & 2) != 0) {
            j11 = lastSyncTime.lastSyncTime;
        }
        return lastSyncTime.copy(str, j11);
    }

    public final String component1() {
        return this.f22310id;
    }

    public final long component2() {
        return this.lastSyncTime;
    }

    public final LastSyncTime copy(String id2, long j11) {
        m.f(id2, "id");
        return new LastSyncTime(id2, j11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastSyncTime)) {
            return false;
        }
        LastSyncTime lastSyncTime = (LastSyncTime) obj;
        return m.a(this.f22310id, lastSyncTime.f22310id) && this.lastSyncTime == lastSyncTime.lastSyncTime;
    }

    public final String getId() {
        return this.f22310id;
    }

    public final long getLastSyncTime() {
        return this.lastSyncTime;
    }

    public int hashCode() {
        return Long.hashCode(this.lastSyncTime) + (this.f22310id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM = d.m(this.lastSyncTime, "LastSyncTime(id=", this.f22310id, ", lastSyncTime=");
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeString(this.f22310id);
        dest.writeLong(this.lastSyncTime);
    }
}
