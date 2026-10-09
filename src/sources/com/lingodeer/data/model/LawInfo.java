package com.lingodeer.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LawInfo implements Parcelable {
    public static final Parcelable.Creator<LawInfo> CREATOR = new Creator();
    private final int lawAge;
    private final String lawGuardianEmail;
    private final String lawGuardianName;
    private final String lawRegin;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Creator implements Parcelable.Creator<LawInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LawInfo createFromParcel(Parcel parcel) {
            m.f(parcel, "parcel");
            return new LawInfo(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LawInfo[] newArray(int i11) {
            return new LawInfo[i11];
        }
    }

    public LawInfo(String lawRegin, int i11, String lawGuardianName, String lawGuardianEmail) {
        m.f(lawRegin, "lawRegin");
        m.f(lawGuardianName, "lawGuardianName");
        m.f(lawGuardianEmail, "lawGuardianEmail");
        this.lawRegin = lawRegin;
        this.lawAge = i11;
        this.lawGuardianName = lawGuardianName;
        this.lawGuardianEmail = lawGuardianEmail;
    }

    public static /* synthetic */ LawInfo copy$default(LawInfo lawInfo, String str, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = lawInfo.lawRegin;
        }
        if ((i12 & 2) != 0) {
            i11 = lawInfo.lawAge;
        }
        if ((i12 & 4) != 0) {
            str2 = lawInfo.lawGuardianName;
        }
        if ((i12 & 8) != 0) {
            str3 = lawInfo.lawGuardianEmail;
        }
        return lawInfo.copy(str, i11, str2, str3);
    }

    public final String component1() {
        return this.lawRegin;
    }

    public final int component2() {
        return this.lawAge;
    }

    public final String component3() {
        return this.lawGuardianName;
    }

    public final String component4() {
        return this.lawGuardianEmail;
    }

    public final LawInfo copy(String lawRegin, int i11, String lawGuardianName, String lawGuardianEmail) {
        m.f(lawRegin, "lawRegin");
        m.f(lawGuardianName, "lawGuardianName");
        m.f(lawGuardianEmail, "lawGuardianEmail");
        return new LawInfo(lawRegin, i11, lawGuardianName, lawGuardianEmail);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LawInfo)) {
            return false;
        }
        LawInfo lawInfo = (LawInfo) obj;
        return m.a(this.lawRegin, lawInfo.lawRegin) && this.lawAge == lawInfo.lawAge && m.a(this.lawGuardianName, lawInfo.lawGuardianName) && m.a(this.lawGuardianEmail, lawInfo.lawGuardianEmail);
    }

    public final int getLawAge() {
        return this.lawAge;
    }

    public final String getLawGuardianEmail() {
        return this.lawGuardianEmail;
    }

    public final String getLawGuardianName() {
        return this.lawGuardianName;
    }

    public final String getLawRegin() {
        return this.lawRegin;
    }

    public int hashCode() {
        return this.lawGuardianEmail.hashCode() + e.d(e.b(this.lawAge, this.lawRegin.hashCode() * 31, 31), 31, this.lawGuardianName);
    }

    public String toString() {
        String str = this.lawRegin;
        int i11 = this.lawAge;
        return e.p(e.q(i11, "LawInfo(lawRegin=", str, ", lawAge=", ", lawGuardianName="), this.lawGuardianName, ", lawGuardianEmail=", this.lawGuardianEmail, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeString(this.lawRegin);
        dest.writeInt(this.lawAge);
        dest.writeString(this.lawGuardianName);
        dest.writeString(this.lawGuardianEmail);
    }

    public LawInfo() {
        this(BuildConfig.VERSION_NAME, 0, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
    }
}
