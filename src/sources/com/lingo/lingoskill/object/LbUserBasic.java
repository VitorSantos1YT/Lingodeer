package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LbUserBasic implements Parcelable {
    public static final Parcelable.Creator<LbUserBasic> CREATOR = new Parcelable.Creator<LbUserBasic>() { // from class: com.lingo.lingoskill.object.LbUserBasic.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LbUserBasic createFromParcel(Parcel parcel) {
            return new LbUserBasic(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LbUserBasic[] newArray(int i11) {
            return new LbUserBasic[i11];
        }
    };
    private long accumulate_seconds_week;
    private int accumulate_xp;
    private long accumulate_xp_week;

    @SerializedName("UID")
    private String uid;

    @SerializedName("Image")
    private String uimage;

    @SerializedName("NickName")
    private String unickname;
    private long updatetime_learnedtime;
    private long updatetime_weekxp;

    public LbUserBasic() {
        this.accumulate_xp = 0;
        this.uimage = BuildConfig.VERSION_NAME;
        this.unickname = BuildConfig.VERSION_NAME;
        this.accumulate_seconds_week = 0L;
        this.accumulate_xp_week = 0L;
        this.updatetime_learnedtime = 0L;
        this.updatetime_weekxp = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getAccumulate_seconds_week() {
        return this.accumulate_seconds_week;
    }

    public int getAccumulate_xp() {
        return this.accumulate_xp;
    }

    public long getAccumulate_xp_week() {
        return this.accumulate_xp_week;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUimage() {
        return this.uimage;
    }

    public String getUnickname() {
        return this.unickname;
    }

    public long getUpdatetime_learnedtime() {
        return this.updatetime_learnedtime;
    }

    public long getUpdatetime_weekxp() {
        return this.updatetime_weekxp;
    }

    public void setAccumulate_seconds_week(long j11) {
        this.accumulate_seconds_week = j11;
    }

    public void setAccumulate_xp(int i11) {
        this.accumulate_xp = i11;
    }

    public void setAccumulate_xp_week(long j11) {
        this.accumulate_xp_week = j11;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUimage(String str) {
        this.uimage = str;
    }

    public void setUnickname(String str) {
        this.unickname = str;
    }

    public void setUpdatetime_learnedtime(long j11) {
        this.updatetime_learnedtime = j11;
    }

    public void setUpdatetime_weekxp(long j11) {
        this.updatetime_weekxp = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.uid);
        parcel.writeInt(this.accumulate_xp);
        parcel.writeString(this.uimage);
        parcel.writeString(this.unickname);
        parcel.writeLong(this.accumulate_seconds_week);
        parcel.writeLong(this.accumulate_xp_week);
        parcel.writeLong(this.updatetime_learnedtime);
        parcel.writeLong(this.updatetime_weekxp);
    }

    public LbUserBasic(Parcel parcel) {
        this.accumulate_xp = 0;
        this.uimage = BuildConfig.VERSION_NAME;
        this.unickname = BuildConfig.VERSION_NAME;
        this.accumulate_seconds_week = 0L;
        this.accumulate_xp_week = 0L;
        this.updatetime_learnedtime = 0L;
        this.updatetime_weekxp = 0L;
        this.uid = parcel.readString();
        this.accumulate_xp = parcel.readInt();
        this.uimage = parcel.readString();
        this.unickname = parcel.readString();
        this.accumulate_seconds_week = parcel.readLong();
        this.accumulate_xp_week = parcel.readLong();
        this.updatetime_learnedtime = parcel.readLong();
        this.updatetime_weekxp = parcel.readLong();
    }
}
