package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class KOCharZhuyin implements MultiItemEntity, Parcelable {
    public static final Parcelable.Creator<KOCharZhuyin> CREATOR = new Parcelable.Creator<KOCharZhuyin>() { // from class: com.lingo.lingoskill.object.KOCharZhuyin.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KOCharZhuyin createFromParcel(Parcel parcel) {
            return new KOCharZhuyin(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KOCharZhuyin[] newArray(int i11) {
            return new KOCharZhuyin[i11];
        }
    };
    private String Character;
    private long ID;
    private String Zhuyin;
    private int itemType;

    public KOCharZhuyin(long j11, String str, String str2) {
        this.itemType = 0;
        this.ID = j11;
        this.Character = str;
        this.Zhuyin = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KOCharZhuyin) {
            KOCharZhuyin kOCharZhuyin = (KOCharZhuyin) obj;
            if (this.Character.equals(kOCharZhuyin.getCharacter()) && this.Zhuyin.equals(kOCharZhuyin.getZhuyin())) {
                return true;
            }
        }
        return false;
    }

    public String getCharacter() {
        return this.Character;
    }

    public long getID() {
        return this.ID;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    public String getZhuyin() {
        return this.Zhuyin;
    }

    public void setCharacter(String str) {
        this.Character = str;
    }

    public void setID(long j11) {
        this.ID = j11;
    }

    public void setItemType(int i11) {
        this.itemType = i11;
    }

    public void setZhuyin(String str) {
        this.Zhuyin = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.ID);
        parcel.writeString(this.Character);
        parcel.writeString(this.Zhuyin);
        parcel.writeInt(this.itemType);
    }

    public KOCharZhuyin() {
        this.itemType = 0;
    }

    public KOCharZhuyin(Parcel parcel) {
        this.itemType = 0;
        this.ID = parcel.readLong();
        this.Character = parcel.readString();
        this.Zhuyin = parcel.readString();
        this.itemType = parcel.readInt();
    }
}
