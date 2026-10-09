package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class f extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f3231e;

    public f(Parcel parcel) {
        super(parcel, 0);
        this.f3230d = parcel.readLong();
        this.f3231e = (Throwable) parcel.readSerializable();
    }

    @Override // aw.m, aw.p
    public final long d() {
        return this.f3230d;
    }

    @Override // aw.p, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // aw.p
    public byte k() {
        return (byte) -1;
    }

    @Override // aw.p
    public final Throwable l() {
        return this.f3231e;
    }

    @Override // aw.p, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeLong(this.f3230d);
        parcel.writeSerializable(this.f3231e);
    }

    public f(int i11, long j11, Throwable th2) {
        super(i11, 0);
        this.f3230d = j11;
        this.f3231e = th2;
    }
}
