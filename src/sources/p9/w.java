package p9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends m {
    public static final Parcelable.Creator<w> CREATOR = new android.support.v4.media.a(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46711a;

    public w(Parcel parcel) {
        super(parcel);
        this.f46711a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f46711a);
    }

    public w(int i11) {
        super(AbsSavedState.EMPTY_STATE);
        this.f46711a = i11;
    }
}
