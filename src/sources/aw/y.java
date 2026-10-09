package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class y extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f3255e;

    public y(Parcel parcel) {
        super(parcel, 1);
        this.f3254d = parcel.readInt();
        this.f3255e = (Throwable) parcel.readSerializable();
    }

    @Override // aw.p, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // aw.m, aw.p
    public final int i() {
        return this.f3254d;
    }

    @Override // aw.p
    public byte k() {
        return (byte) -1;
    }

    @Override // aw.p
    public final Throwable l() {
        return this.f3255e;
    }

    @Override // aw.p, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f3254d);
        parcel.writeSerializable(this.f3255e);
    }

    public y(int i11, int i12, Throwable th2) {
        super(i11, 1);
        this.f3254d = i12;
        this.f3255e = th2;
    }
}
