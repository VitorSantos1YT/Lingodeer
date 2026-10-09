package re;

import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new j0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f49224b;

    public x(Parcelable parcelable) {
        this.f49223a = "image/png";
        this.f49224b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        out.writeString(this.f49223a);
        out.writeParcelable(this.f49224b, i11);
    }

    public x(Parcel parcel) {
        this.f49223a = parcel.readString();
        this.f49224b = parcel.readParcelable(s.a().getClassLoader());
    }
}
