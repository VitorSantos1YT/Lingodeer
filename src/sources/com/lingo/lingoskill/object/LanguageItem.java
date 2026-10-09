package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanguageItem implements Parcelable, MultiItemEntity {
    public static final Parcelable.Creator<LanguageItem> CREATOR = new Parcelable.Creator<LanguageItem>() { // from class: com.lingo.lingoskill.object.LanguageItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LanguageItem createFromParcel(Parcel parcel) {
            return new LanguageItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LanguageItem[] newArray(int i11) {
            return new LanguageItem[i11];
        }
    };
    private String description = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21940id;
    private int keyLanguage;
    private int locate;
    private String name;
    private int pic;

    public LanguageItem() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LanguageItem) {
            return getId().equals(((LanguageItem) obj).getId());
        }
        return false;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.f21940id;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 1;
    }

    public int getKeyLanguage() {
        return this.keyLanguage;
    }

    public int getLocate() {
        return this.locate;
    }

    public String getName() {
        return this.name;
    }

    public int getPic() {
        return this.pic;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(String str) {
        this.f21940id = str;
    }

    public void setKeyLanguage(int i11) {
        this.keyLanguage = i11;
    }

    public void setLocate(int i11) {
        this.locate = i11;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPic(int i11) {
        this.pic = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f21940id);
        parcel.writeInt(this.keyLanguage);
        parcel.writeInt(this.locate);
        parcel.writeString(this.name);
        parcel.writeInt(this.pic);
    }

    public LanguageItem(int i11, int i12, String str) {
        this.keyLanguage = i11;
        this.locate = i12;
        this.name = str;
        this.f21940id = this.keyLanguage + ":" + this.locate;
    }

    public LanguageItem(String str, int i11, int i12, String str2, int i13) {
        this.f21940id = str;
        this.keyLanguage = i11;
        this.locate = i12;
        this.name = str2;
        this.pic = i13;
    }

    public LanguageItem(Parcel parcel) {
        this.f21940id = parcel.readString();
        this.keyLanguage = parcel.readInt();
        this.locate = parcel.readInt();
        this.name = parcel.readString();
        this.pic = parcel.readInt();
    }
}
