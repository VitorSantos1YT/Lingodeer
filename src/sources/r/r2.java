package r;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends k5.b {
    public static final Parcelable.Creator<r2> CREATOR = new x1.o(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48639d;

    public r2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f48638c = parcel.readInt();
        this.f48639d = parcel.readInt() != 0;
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f48638c);
        parcel.writeInt(this.f48639d ? 1 : 0);
    }
}
