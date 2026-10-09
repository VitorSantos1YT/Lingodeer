package wf;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xf.d {
    public static final Parcelable.Creator<j> CREATOR = new i();
    public final String H;
    public final String K;
    public final String L;
    public final String M;
    public final String N;
    public final String O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f55121t;

    public j(Parcel parcel) {
        super(parcel);
        this.f55121t = parcel.readString();
        this.H = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.O = parcel.readString();
    }

    @Override // xf.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xf.d, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        m.f(out, "out");
        super.writeToParcel(out, i11);
        out.writeString(this.f55121t);
        out.writeString(this.H);
        out.writeString(this.K);
        out.writeString(this.L);
        out.writeString(this.M);
        out.writeString(this.N);
        out.writeString(this.O);
    }
}
