package ia;

import android.os.Parcel;
import android.os.Parcelable;
import x1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k5.b {
    public static final Parcelable.Creator<g> CREATOR = new o(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34293d;

    public g(Parcel parcel) {
        super(parcel, null);
        this.f34292c = parcel.readInt() != 0;
        this.f34293d = parcel.readInt();
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f34292c ? 1 : 0);
        parcel.writeInt(this.f34293d);
    }
}
