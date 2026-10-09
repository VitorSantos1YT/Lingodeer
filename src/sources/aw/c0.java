package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3223f;

    public c0(int i11, int i12, Throwable th2, int i13) {
        super(i11, i12, th2);
        this.f3223f = i13;
    }

    @Override // aw.y, aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.p
    public final int g() {
        return this.f3223f;
    }

    @Override // aw.y, aw.p
    public final byte k() {
        return (byte) 5;
    }

    @Override // aw.y, aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f3223f);
    }

    public c0(Parcel parcel) {
        super(parcel);
        this.f3223f = parcel.readInt();
    }
}
