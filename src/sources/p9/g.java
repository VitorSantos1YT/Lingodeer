package p9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m {
    public static final Parcelable.Creator<g> CREATOR = new android.support.v4.media.a(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46662a;

    public g(Parcel parcel) {
        super(parcel);
        this.f46662a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f46662a);
    }

    public g() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
