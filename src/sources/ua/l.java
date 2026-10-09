package ua;

import android.os.Parcel;
import android.os.Parcelable;
import hh.p0;
import x1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends k5.b {
    public static final Parcelable.Creator<l> CREATOR = new o(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f52900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ClassLoader f52901e;

    public l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? l.class.getClassLoader() : classLoader;
        this.f52899c = parcel.readInt();
        this.f52900d = parcel.readParcelable(classLoader);
        this.f52901e = classLoader;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return p0.i(this.f52899c, "}", sb2);
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f52899c);
        parcel.writeParcelable(this.f52900d, i11);
    }
}
