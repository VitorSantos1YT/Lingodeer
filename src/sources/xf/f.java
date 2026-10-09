package xf;

import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends d {
    public static final Parcelable.Creator<f> CREATOR = new j0(19);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f56032t;

    public f(Parcel parcel) {
        super(parcel);
        this.f56032t = parcel.readString();
    }

    @Override // xf.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xf.d, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        super.writeToParcel(out, i11);
        out.writeString(this.f56032t);
    }
}
