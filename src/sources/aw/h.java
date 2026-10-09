package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class h extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3233e;

    public h(Parcel parcel) {
        super(parcel, 0);
        this.f3232d = parcel.readLong();
        this.f3233e = parcel.readLong();
    }

    @Override // aw.m, aw.p
    public final long d() {
        return this.f3232d;
    }

    @Override // aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.m, aw.p
    public final long e() {
        return this.f3233e;
    }

    @Override // aw.p
    public byte k() {
        return (byte) 1;
    }

    @Override // aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeLong(this.f3232d);
        parcel.writeLong(this.f3233e);
    }

    public h(long j11, int i11, long j12) {
        super(i11, 0);
        this.f3232d = j11;
        this.f3233e = j12;
    }
}
