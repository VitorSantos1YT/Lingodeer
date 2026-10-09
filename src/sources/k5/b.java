package k5;

import android.os.Parcel;
import android.os.Parcelable;
import x1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f37910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37909b = new a();
    public static final Parcelable.Creator<b> CREATOR = new o(3);

    public b() {
        this.f37910a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f37910a, i11);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f37910a = parcelable == f37909b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f37910a = parcelable == null ? f37909b : parcelable;
    }
}
