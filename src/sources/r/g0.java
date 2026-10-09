package r;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends View.BaseSavedState {
    public static final Parcelable.Creator<g0> CREATOR = new p9.j0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48568a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeByte(this.f48568a ? (byte) 1 : (byte) 0);
    }
}
