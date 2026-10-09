package p9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends m {
    public static final Parcelable.Creator<l0> CREATOR = new j0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46698a;

    public l0(Parcel parcel) {
        super(parcel);
        this.f46698a = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f46698a ? 1 : 0);
    }

    public l0() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
