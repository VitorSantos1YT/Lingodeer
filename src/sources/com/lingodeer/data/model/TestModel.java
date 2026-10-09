package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class TestModel implements Parcelable {
    public static final Parcelable.Creator<TestModel> CREATOR = new Parcelable.Creator<TestModel>() { // from class: com.lingodeer.data.model.TestModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TestModel createFromParcel(Parcel parcel) {
            return new TestModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TestModel[] newArray(int i11) {
            return new TestModel[i11];
        }
    };
    public long elemId;
    public int elemType;
    public long lessonId;
    public int modelType;
    public List<Long> optionIds;
    public List<Integer> typeList;
    public long unitId;

    public TestModel() {
        this.lessonId = -1L;
        this.unitId = -1L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "TestModel{elemType=" + this.elemType + ", elemId=" + this.elemId + ", modelType=" + this.modelType + ", optionIds=" + this.optionIds + ", typeList=" + this.typeList + ", lessonId=" + this.lessonId + ", unitId=" + this.unitId + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.elemType);
        parcel.writeLong(this.elemId);
        parcel.writeInt(this.modelType);
        parcel.writeList(this.optionIds);
        parcel.writeList(this.typeList);
        parcel.writeLong(this.lessonId);
        parcel.writeLong(this.unitId);
    }

    public TestModel(Parcel parcel) {
        this.lessonId = -1L;
        this.unitId = -1L;
        this.elemType = parcel.readInt();
        this.elemId = parcel.readLong();
        this.modelType = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.optionIds = arrayList;
        parcel.readList(arrayList, Long.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.typeList = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        if (parcel.dataAvail() >= 16) {
            this.lessonId = parcel.readLong();
            this.unitId = parcel.readLong();
        }
    }
}
