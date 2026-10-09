package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39297a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f39297a) {
            case 0:
                return new g1(parcel.readFloat());
            case 1:
                return new h1(parcel.readInt());
            default:
                return new i1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f39297a) {
            case 0:
                return new g1[i11];
            case 1:
                return new h1[i11];
            default:
                return new i1[i11];
        }
    }
}
