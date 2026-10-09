package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3222d;

    public b0(Parcel parcel) {
        super(parcel, 1);
        this.f3222d = parcel.readInt();
    }

    @Override // aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.m, aw.p
    public final int i() {
        return this.f3222d;
    }

    @Override // aw.p
    public final byte k() {
        return (byte) 3;
    }

    @Override // aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f3222d);
    }

    public b0(int i11, int i12) {
        super(i11, 1);
        this.f3222d = i12;
    }
}
