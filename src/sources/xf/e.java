package xf;

import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new j0(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56031a;

    public e(c7.a aVar) {
        this.f56031a = aVar.f6641a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeString(this.f56031a);
    }

    public e(Parcel parcel) {
        this.f56031a = parcel.readString();
    }
}
