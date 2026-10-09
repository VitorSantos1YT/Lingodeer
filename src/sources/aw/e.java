package aw;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3228f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f3229t;

    public e(Parcel parcel) {
        super(parcel, 0);
        this.f3226d = parcel.readByte() != 0;
        this.f3227e = parcel.readLong();
        this.f3228f = parcel.readString();
        this.f3229t = parcel.readString();
    }

    @Override // aw.p
    public final String c() {
        return this.f3229t;
    }

    @Override // aw.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // aw.m, aw.p
    public final long e() {
        return this.f3227e;
    }

    @Override // aw.p
    public final byte k() {
        return (byte) 2;
    }

    @Override // aw.p, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeByte(this.f3226d ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f3227e);
        parcel.writeString(this.f3228f);
        parcel.writeString(this.f3229t);
    }

    public e(String str, int i11, boolean z11, long j11, String str2) {
        super(i11, 0);
        this.f3226d = z11;
        this.f3227e = j11;
        this.f3228f = str;
        this.f3229t = str2;
    }

    @Override // aw.p
    public final void b() {
    }

    @Override // aw.p
    public final void m() {
    }
}
