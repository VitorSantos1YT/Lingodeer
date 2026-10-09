package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class d extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3225e;

    public d(Parcel parcel) {
        super(parcel, 0);
        this.f3224d = parcel.readByte() != 0;
        this.f3225e = parcel.readLong();
    }

    @Override // aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.m, aw.p
    public final long e() {
        return this.f3225e;
    }

    @Override // aw.p
    public final byte k() {
        return (byte) -3;
    }

    @Override // aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeByte(this.f3224d ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f3225e);
    }

    public d(int i11, long j11, boolean z11) {
        super(i11, 0);
        this.f3224d = z11;
        this.f3225e = j11;
    }

    @Override // aw.p
    public final void n() {
    }
}
