package n0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42939a;

    public f(int i11) {
        this.f42939a = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f42939a == ((f) obj).f42939a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42939a);
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("DefaultLazyKey(index="), this.f42939a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f42939a);
    }
}
