package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends k5.b {
    public static final Parcelable.Creator<y1> CREATOR = new x1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f2653c;

    public y1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2653c = parcel.readParcelable(classLoader == null ? m1.class.getClassLoader() : classLoader);
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeParcelable(this.f2653c, 0);
    }
}
