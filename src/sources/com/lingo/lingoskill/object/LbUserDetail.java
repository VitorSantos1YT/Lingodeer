package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LbUserDetail implements Parcelable {
    public static final Parcelable.Creator<LbUserDetail> CREATOR = new Parcelable.Creator<LbUserDetail>() { // from class: com.lingo.lingoskill.object.LbUserDetail.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LbUserDetail createFromParcel(Parcel parcel) {
            return new LbUserDetail(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LbUserDetail[] newArray(int i11) {
            return new LbUserDetail[i11];
        }
    };
    private int accumulate_daystreak;
    private long accumulate_seconds;
    private boolean isFollower;
    private boolean isFollowing;
    private List<String> medals_continue_days;
    private List<String> medals_finished_lans;

    public LbUserDetail() {
        this.accumulate_daystreak = 0;
        this.accumulate_seconds = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAccumulate_daystreak() {
        return this.accumulate_daystreak;
    }

    public long getAccumulate_seconds() {
        return this.accumulate_seconds;
    }

    public List<String> getMedals_continue_days() {
        return this.medals_continue_days;
    }

    public List<String> getMedals_finished_lans() {
        return this.medals_finished_lans;
    }

    public boolean isFollower() {
        return this.isFollower;
    }

    public boolean isFollowing() {
        return this.isFollowing;
    }

    public void setAccumulate_daystreak(int i11) {
        this.accumulate_daystreak = i11;
    }

    public void setAccumulate_seconds(long j11) {
        this.accumulate_seconds = j11;
    }

    public void setFollower(boolean z11) {
        this.isFollower = z11;
    }

    public void setFollowing(boolean z11) {
        this.isFollowing = z11;
    }

    public void setMedals_continue_days(List<String> list) {
        this.medals_continue_days = list;
    }

    public void setMedals_finished_lans(List<String> list) {
        this.medals_finished_lans = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.accumulate_daystreak);
        parcel.writeLong(this.accumulate_seconds);
        parcel.writeStringList(this.medals_continue_days);
        parcel.writeStringList(this.medals_finished_lans);
        parcel.writeByte(this.isFollowing ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFollower ? (byte) 1 : (byte) 0);
    }

    public LbUserDetail(Parcel parcel) {
        this.accumulate_daystreak = 0;
        this.accumulate_seconds = 0L;
        this.accumulate_daystreak = parcel.readInt();
        this.accumulate_seconds = parcel.readLong();
        this.medals_continue_days = parcel.createStringArrayList();
        this.medals_finished_lans = parcel.createStringArrayList();
        this.isFollowing = parcel.readByte() != 0;
        this.isFollower = parcel.readByte() != 0;
    }
}
