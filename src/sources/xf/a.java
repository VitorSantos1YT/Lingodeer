package xf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new j0(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f56022a;

    public a(m5 m5Var) {
        this.f56022a = (Bundle) m5Var.f50058b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        out.writeBundle(this.f56022a);
    }

    public a(Parcel parcel) {
        this.f56022a = parcel.readBundle(a.class.getClassLoader());
    }
}
