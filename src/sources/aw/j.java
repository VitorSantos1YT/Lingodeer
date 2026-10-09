package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3235f;

    public j(int i11, long j11, Throwable th2, int i12) {
        super(i11, j11, th2);
        this.f3235f = i12;
    }

    @Override // aw.f, aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.p
    public final int g() {
        return this.f3235f;
    }

    @Override // aw.f, aw.p
    public final byte k() {
        return (byte) 5;
    }

    @Override // aw.f, aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f3235f);
    }

    public j(Parcel parcel) {
        super(parcel);
        this.f3235f = parcel.readInt();
    }
}
