package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new android.support.v4.media.a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f780e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f776a);
        parcel.writeInt(this.f778c);
        parcel.writeInt(this.f779d);
        parcel.writeInt(this.f780e);
        parcel.writeInt(this.f777b);
    }
}
