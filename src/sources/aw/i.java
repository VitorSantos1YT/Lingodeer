package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3234d;

    public i(Parcel parcel) {
        super(parcel, 0);
        this.f3234d = parcel.readLong();
    }

    @Override // aw.m, aw.p
    public final long d() {
        return this.f3234d;
    }

    @Override // aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.p
    public final byte k() {
        return (byte) 3;
    }

    @Override // aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeLong(this.f3234d);
    }

    public i(int i11, long j11) {
        super(i11, 0);
        this.f3234d = j11;
    }
}
