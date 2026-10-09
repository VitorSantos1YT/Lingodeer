package xf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b0.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f56033a;

    public h(h2 h2Var) {
        this.f56033a = new Bundle((Bundle) h2Var.f3561b);
    }

    public abstract g a();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeBundle(this.f56033a);
    }

    public h(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.f56033a = bundle == null ? new Bundle() : bundle;
    }
}
