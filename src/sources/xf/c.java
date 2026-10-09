package xf;

import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    public static final Parcelable.Creator<c> CREATOR = new j0(17);
    public a H;
    public b K;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f56024t;

    @Override // xf.d, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        super.writeToParcel(out, i11);
        out.writeString(this.f56024t);
        out.writeParcelable(this.H, 0);
        out.writeParcelable(this.K, 0);
    }
}
