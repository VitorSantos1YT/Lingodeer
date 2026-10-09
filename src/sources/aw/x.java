package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3252f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f3253t;

    public x(Parcel parcel) {
        super(parcel, 1);
        this.f3250d = parcel.readByte() != 0;
        this.f3251e = parcel.readInt();
        this.f3252f = parcel.readString();
        this.f3253t = parcel.readString();
    }

    @Override // aw.p
    public final String c() {
        return this.f3253t;
    }

    @Override // aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.m, aw.p
    public final int j() {
        return this.f3251e;
    }

    @Override // aw.p
    public final byte k() {
        return (byte) 2;
    }

    @Override // aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeByte(this.f3250d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f3251e);
        parcel.writeString(this.f3252f);
        parcel.writeString(this.f3253t);
    }

    public x(int i11, String str, String str2, int i12, boolean z11) {
        super(i11, 1);
        this.f3250d = z11;
        this.f3251e = i12;
        this.f3252f = str;
        this.f3253t = str2;
    }

    @Override // aw.p
    public final void b() {
    }

    @Override // aw.p
    public final void m() {
    }
}
