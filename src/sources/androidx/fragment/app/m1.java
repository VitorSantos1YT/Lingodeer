package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR = new android.support.v4.media.a(12);
    public ArrayList H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f1747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f1749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f1752f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f1753t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringList(this.f1747a);
        parcel.writeStringList(this.f1748b);
        parcel.writeTypedArray(this.f1749c, i11);
        parcel.writeInt(this.f1750d);
        parcel.writeString(this.f1751e);
        parcel.writeStringList(this.f1752f);
        parcel.writeTypedList(this.f1753t);
        parcel.writeTypedList(this.H);
    }
}
