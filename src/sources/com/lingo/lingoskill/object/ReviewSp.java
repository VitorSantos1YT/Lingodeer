package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ReviewSp implements MultiItemEntity, Parcelable {
    public static final Parcelable.Creator<ReviewSp> CREATOR = new Parcelable.Creator<ReviewSp>() { // from class: com.lingo.lingoskill.object.ReviewSp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReviewSp createFromParcel(Parcel parcel) {
            return new ReviewSp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReviewSp[] newArray(int i11) {
            return new ReviewSp[i11];
        }
    };
    private String CWSId;
    private int Lan;
    private String LastStatus;
    private long LastTime;
    private String SRS;
    private String SortIndex;
    private int Unit;
    private int Version;
    private int elemType;
    private boolean isChecked;

    public ReviewSp(String str, int i11, int i12, String str2, String str3, String str4, long j11, int i13, int i14) {
        this.CWSId = str;
        this.Unit = i11;
        this.Version = i12;
        this.SRS = str2;
        this.SortIndex = str3;
        this.LastStatus = str4;
        this.LastTime = j11;
        this.Lan = i13;
        this.elemType = i14;
    }

    public ReviewSp copyClasss() {
        ReviewSp reviewSp = new ReviewSp();
        reviewSp.setLan(this.Lan);
        reviewSp.setElemType(this.elemType);
        reviewSp.setCWSId(this.CWSId);
        reviewSp.setLastTime(this.LastTime);
        reviewSp.setSRS(this.SRS);
        reviewSp.setVersion(this.Version);
        reviewSp.setLastStatus(this.LastStatus);
        reviewSp.setSortIndex(this.SortIndex);
        reviewSp.setUnit(this.Unit);
        return reviewSp;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCWSId() {
        return this.CWSId;
    }

    public int getElemType() {
        return this.elemType;
    }

    public long getId() {
        try {
            return Long.valueOf(this.CWSId.split("_")[2]).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.elemType;
    }

    public int getLan() {
        return this.Lan;
    }

    public String getLastStatus() {
        return this.LastStatus;
    }

    public long getLastTime() {
        return this.LastTime;
    }

    public int getRememberLevelInt() {
        String str = "A";
        if (!TextUtils.isEmpty(this.SRS)) {
            String[] strArrSplit = this.SRS.trim().split(",");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[strArrSplit.length - 1].split(":");
                if (strArrSplit2.length == 3) {
                    str = strArrSplit2[2];
                }
            } else {
                String[] strArrSplit3 = this.SRS.split(":");
                if (strArrSplit3.length == 3) {
                    str = strArrSplit3[2];
                }
            }
        }
        str.getClass();
        if (str.equals("C")) {
            return 0;
        }
        return !str.equals("D") ? -1 : 1;
    }

    public String getSRS() {
        return this.SRS;
    }

    public String getSortIndex() {
        return this.SortIndex;
    }

    public int getUnit() {
        return this.Unit;
    }

    public int getVersion() {
        return this.Version;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setCWSId(String str) {
        this.CWSId = str;
    }

    public void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    public void setElemType(int i11) {
        this.elemType = i11;
    }

    public void setLan(int i11) {
        this.Lan = i11;
    }

    public void setLastStatus(String str) {
        this.LastStatus = str;
    }

    public void setLastTime(long j11) {
        this.LastTime = j11;
    }

    public void setSRS(String str) {
        this.SRS = str;
    }

    public void setSortIndex(String str) {
        this.SortIndex = str;
    }

    public void setUnit(int i11) {
        this.Unit = i11;
    }

    public void setVersion(int i11) {
        this.Version = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.CWSId);
        parcel.writeInt(this.Unit);
        parcel.writeInt(this.Version);
        parcel.writeString(this.SRS);
        parcel.writeString(this.SortIndex);
        parcel.writeString(this.LastStatus);
        parcel.writeLong(this.LastTime);
        parcel.writeInt(this.Lan);
        parcel.writeInt(this.elemType);
    }

    public ReviewSp() {
    }

    public ReviewSp(Parcel parcel) {
        this.CWSId = parcel.readString();
        this.Unit = parcel.readInt();
        this.Version = parcel.readInt();
        this.SRS = parcel.readString();
        this.SortIndex = parcel.readString();
        this.LastStatus = parcel.readString();
        this.LastTime = parcel.readLong();
        this.Lan = parcel.readInt();
        this.elemType = parcel.readInt();
    }
}
