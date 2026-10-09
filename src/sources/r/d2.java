package r;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends k5.b {
    public static final Parcelable.Creator<d2> CREATOR = new x1.o(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48543c;

    public d2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f48543c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchView.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" isIconified=");
        return hh.p0.p(sb2, this.f48543c, "}");
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeValue(Boolean.valueOf(this.f48543c));
    }
}
