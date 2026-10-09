package o9;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44755a;

    public e(int i11) {
        this.f44755a = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f44755a == ((e) obj).f44755a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44755a);
    }

    public final String toString() {
        return ep.a.j(new StringBuilder("PagingPlaceholderKey(index="), this.f44755a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        m.f(parcel, "parcel");
        parcel.writeInt(this.f44755a);
    }
}
