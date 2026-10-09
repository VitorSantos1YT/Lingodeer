package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class w extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3249e;

    public w(Parcel parcel) {
        super(parcel, 1);
        this.f3248d = parcel.readByte() != 0;
        this.f3249e = parcel.readInt();
    }

    @Override // aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.m, aw.p
    public final int j() {
        return this.f3249e;
    }

    @Override // aw.p
    public final byte k() {
        return (byte) -3;
    }

    @Override // aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeByte(this.f3248d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f3249e);
    }

    public w(int i11, boolean z11, int i12) {
        super(i11, 1);
        this.f3248d = z11;
        this.f3249e = i12;
    }

    @Override // aw.p
    public final void n() {
    }
}
