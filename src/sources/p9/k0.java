package p9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends m {
    public static final Parcelable.Creator<k0> CREATOR = new j0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46693c;

    public k0(Parcel parcel) {
        super(parcel);
        this.f46691a = parcel.readInt();
        this.f46692b = parcel.readInt();
        this.f46693c = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f46691a);
        parcel.writeInt(this.f46692b);
        parcel.writeInt(this.f46693c);
    }

    public k0() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
