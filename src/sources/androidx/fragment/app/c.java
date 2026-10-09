package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1629b;

    public c(Parcel parcel) {
        this.f1628a = parcel.createStringArrayList();
        this.f1629b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringList(this.f1628a);
        parcel.writeTypedList(this.f1629b);
    }
}
