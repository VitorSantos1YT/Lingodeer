package pq;

import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new j0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f46987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f46988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f46989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f46991f;

    public b(int i11, String str, String str2, String str3, String str4, String str5) {
        this.f46986a = i11;
        this.f46987b = str;
        this.f46988c = str2;
        this.f46989d = str3;
        this.f46990e = str4;
        this.f46991f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f46986a);
        parcel.writeString(this.f46987b);
        parcel.writeString(this.f46988c);
        parcel.writeString(this.f46989d);
        parcel.writeString(this.f46990e);
        parcel.writeString(this.f46991f);
    }
}
