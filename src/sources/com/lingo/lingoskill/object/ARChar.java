package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import com.chad.library.adapter.base.entity.MultiItemEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ARChar implements MultiItemEntity, Parcelable {
    public static final Parcelable.Creator<ARChar> CREATOR = new Parcelable.Creator<ARChar>() { // from class: com.lingo.lingoskill.object.ARChar.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ARChar createFromParcel(Parcel parcel) {
            return new ARChar(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ARChar[] newArray(int i11) {
            return new ARChar[i11];
        }
    };
    private String AudioName;
    private String Character;
    private long ID;
    private String Zhuyin;
    private int itemType;

    public ARChar(Parcel parcel) {
        this.itemType = 0;
        this.ID = parcel.readLong();
        this.Character = parcel.readString();
        this.Zhuyin = parcel.readString();
        this.AudioName = parcel.readString();
        this.itemType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ARChar) {
            ARChar aRChar = (ARChar) obj;
            if (this.Character.equals(aRChar.getCharacter()) && this.Zhuyin.equals(aRChar.getZhuyin())) {
                return true;
            }
        }
        return false;
    }

    public String getAudioName() {
        return this.AudioName;
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

    public void setAudioName(String str) {
        this.AudioName = str;
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
        parcel.writeString(this.AudioName);
        parcel.writeInt(this.itemType);
    }

    public ARChar(long j11, String str, String str2, String str3) {
        this.itemType = 0;
        this.ID = j11;
        this.Character = str;
        this.Zhuyin = str2;
        this.AudioName = str3;
    }

    public ARChar() {
        this.itemType = 0;
    }
}
