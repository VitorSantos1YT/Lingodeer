package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LbUser implements Parcelable {
    public static final Parcelable.Creator<LbUser> CREATOR = new Parcelable.Creator<LbUser>() { // from class: com.lingo.lingoskill.object.LbUser.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LbUser createFromParcel(Parcel parcel) {
            return new LbUser(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LbUser[] newArray(int i11) {
            return new LbUser[i11];
        }
    };
    private LbUserBasic basic;
    private LbUserDetail detail;

    public LbUser() {
        this.basic = new LbUserBasic();
        this.detail = new LbUserDetail();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LbUser) {
            return this.basic.getUid().equals(((LbUser) obj).basic.getUid());
        }
        return false;
    }

    public LbUserBasic getBasic() {
        return this.basic;
    }

    public LbUserDetail getDetail() {
        return this.detail;
    }

    public void setBasic(LbUserBasic lbUserBasic) {
        this.basic = lbUserBasic;
    }

    public void setDetail(LbUserDetail lbUserDetail) {
        this.detail = lbUserDetail;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.basic, i11);
        parcel.writeParcelable(this.detail, i11);
    }

    public LbUser(Parcel parcel) {
        this.basic = new LbUserBasic();
        this.detail = new LbUserDetail();
        this.basic = (LbUserBasic) parcel.readParcelable(LbUserBasic.class.getClassLoader());
        this.detail = (LbUserDetail) parcel.readParcelable(LbUserDetail.class.getClassLoader());
    }
}
