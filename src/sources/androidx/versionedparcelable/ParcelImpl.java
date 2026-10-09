package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;
import sa.b;
import sa.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new j0(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2723a;

    public ParcelImpl(Parcel parcel) {
        this.f2723a = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        new b(parcel).k(this.f2723a);
    }
}
