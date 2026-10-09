package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Parcelable {
    public static final Parcelable.Creator<o2> CREATOR = new p0(2);
    public boolean H;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f2572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f2574f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f2575t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f2569a);
        parcel.writeInt(this.f2570b);
        parcel.writeInt(this.f2571c);
        if (this.f2571c > 0) {
            parcel.writeIntArray(this.f2572d);
        }
        parcel.writeInt(this.f2573e);
        if (this.f2573e > 0) {
            parcel.writeIntArray(this.f2574f);
        }
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeList(this.f2575t);
    }
}
