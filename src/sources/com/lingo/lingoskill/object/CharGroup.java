package com.lingo.lingoskill.object;

import android.os.Parcel;
import android.os.Parcelable;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CharGroup implements Parcelable {
    public static final Parcelable.Creator<CharGroup> CREATOR = new Parcelable.Creator<CharGroup>() { // from class: com.lingo.lingoskill.object.CharGroup.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CharGroup createFromParcel(Parcel parcel) {
            return new CharGroup(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CharGroup[] newArray(int i11) {
            return new CharGroup[i11];
        }
    };
    private String desc;
    private List<Long> ids;
    private int index;
    private String name;

    public CharGroup() {
        this.index = 0;
        this.name = BuildConfig.VERSION_NAME;
        this.desc = BuildConfig.VERSION_NAME;
        this.ids = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<Long> getIds() {
        return this.ids;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIds(List<Long> list) {
        this.ids = list;
    }

    public void setIndex(int i11) {
        this.index = i11;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.index);
        parcel.writeString(this.name);
        parcel.writeString(this.desc);
        parcel.writeList(this.ids);
    }

    public CharGroup(Parcel parcel) {
        this.index = 0;
        this.name = BuildConfig.VERSION_NAME;
        this.desc = BuildConfig.VERSION_NAME;
        this.ids = new ArrayList();
        this.index = parcel.readInt();
        this.name = parcel.readString();
        this.desc = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.ids = arrayList;
        parcel.readList(arrayList, Long.class.getClassLoader());
    }
}
