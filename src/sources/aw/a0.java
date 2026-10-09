package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class a0 extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3221e;

    public a0(Parcel parcel) {
        super(parcel, 1);
        this.f3220d = parcel.readInt();
        this.f3221e = parcel.readInt();
    }

    @Override // aw.m, aw.p
    public final int i() {
        return this.f3220d;
    }

    @Override // aw.m, aw.p
    public final int j() {
        return this.f3221e;
    }

    @Override // aw.p
    public byte k() {
        return (byte) 1;
    }

    @Override // aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f3220d);
        parcel.writeInt(this.f3221e);
    }

    public a0(int i11, int i12, int i13) {
        super(i11, 1);
        this.f3220d = i12;
        this.f3221e = i13;
    }
}
