package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new p0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2593c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f2591a);
        parcel.writeInt(this.f2592b);
        parcel.writeInt(this.f2593c ? 1 : 0);
    }
}
