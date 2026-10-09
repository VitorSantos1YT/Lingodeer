package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseCharacterGroup implements Parcelable {
    public static final Parcelable.Creator<CourseCharacterGroup> CREATOR = new Creator();
    private final long groupId;
    private final int groupIndex;
    private final String groupList;
    private final String groupName;
    private final String tGroupList;
    private final String tGroupName;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<CourseCharacterGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CourseCharacterGroup createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new CourseCharacterGroup(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CourseCharacterGroup[] newArray(int i11) {
            return new CourseCharacterGroup[i11];
        }
    }

    public CourseCharacterGroup(long j11, int i11, String groupList, String groupName, String tGroupList, String tGroupName) {
        m.f(groupList, "groupList");
        m.f(groupName, "groupName");
        m.f(tGroupList, "tGroupList");
        m.f(tGroupName, "tGroupName");
        this.groupId = j11;
        this.groupIndex = i11;
        this.groupList = groupList;
        this.groupName = groupName;
        this.tGroupList = tGroupList;
        this.tGroupName = tGroupName;
    }

    public static /* synthetic */ CourseCharacterGroup copy$default(CourseCharacterGroup courseCharacterGroup, long j11, int i11, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = courseCharacterGroup.groupId;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            i11 = courseCharacterGroup.groupIndex;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = courseCharacterGroup.groupList;
        }
        String str5 = str;
        if ((i12 & 8) != 0) {
            str2 = courseCharacterGroup.groupName;
        }
        String str6 = str2;
        if ((i12 & 16) != 0) {
            str3 = courseCharacterGroup.tGroupList;
        }
        String str7 = str3;
        if ((i12 & 32) != 0) {
            str4 = courseCharacterGroup.tGroupName;
        }
        return courseCharacterGroup.copy(j12, i13, str5, str6, str7, str4);
    }

    public final long component1() {
        return this.groupId;
    }

    public final int component2() {
        return this.groupIndex;
    }

    public final String component3() {
        return this.groupList;
    }

    public final String component4() {
        return this.groupName;
    }

    public final String component5() {
        return this.tGroupList;
    }

    public final String component6() {
        return this.tGroupName;
    }

    public final CourseCharacterGroup copy(long j11, int i11, String groupList, String groupName, String tGroupList, String tGroupName) {
        m.f(groupList, "groupList");
        m.f(groupName, "groupName");
        m.f(tGroupList, "tGroupList");
        m.f(tGroupName, "tGroupName");
        return new CourseCharacterGroup(j11, i11, groupList, groupName, tGroupList, tGroupName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseCharacterGroup)) {
            return false;
        }
        CourseCharacterGroup courseCharacterGroup = (CourseCharacterGroup) obj;
        return this.groupId == courseCharacterGroup.groupId && this.groupIndex == courseCharacterGroup.groupIndex && m.a(this.groupList, courseCharacterGroup.groupList) && m.a(this.groupName, courseCharacterGroup.groupName) && m.a(this.tGroupList, courseCharacterGroup.tGroupList) && m.a(this.tGroupName, courseCharacterGroup.tGroupName);
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final String getGroupList() {
        return this.groupList;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getTGroupList() {
        return this.tGroupList;
    }

    public final String getTGroupName() {
        return this.tGroupName;
    }

    public int hashCode() {
        return this.tGroupName.hashCode() + e.d(e.d(e.d(e.b(this.groupIndex, Long.hashCode(this.groupId) * 31, 31), 31, this.groupList), 31, this.groupName), 31, this.tGroupList);
    }

    public String toString() {
        long j11 = this.groupId;
        int i11 = this.groupIndex;
        String str = this.groupList;
        String str2 = this.groupName;
        String str3 = this.tGroupList;
        String str4 = this.tGroupName;
        StringBuilder sb2 = new StringBuilder("CourseCharacterGroup(groupId=");
        sb2.append(j11);
        sb2.append(", groupIndex=");
        sb2.append(i11);
        d.w(sb2, ", groupList=", str, ", groupName=", str2);
        d.w(sb2, ", tGroupList=", str3, ", tGroupName=", str4);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeLong(this.groupId);
        dest.writeInt(this.groupIndex);
        dest.writeString(this.groupList);
        dest.writeString(this.groupName);
        dest.writeString(this.tGroupList);
        dest.writeString(this.tGroupName);
    }
}
