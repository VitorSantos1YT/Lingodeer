package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements Parcelable {
    public static final Parcelable.Creator<g1> CREATOR = new android.support.v4.media.a(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1665b;

    public g1(String str, int i11) {
        this.f1664a = str;
        this.f1665b = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f1664a);
        parcel.writeInt(this.f1665b);
    }
}
