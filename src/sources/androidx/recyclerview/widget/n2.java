package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements Parcelable {
    public static final Parcelable.Creator<n2> CREATOR = new p0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2553d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2550a + ", mGapDir=" + this.f2551b + ", mHasUnwantedGapAfter=" + this.f2553d + ", mGapPerSpan=" + Arrays.toString(this.f2552c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f2550a);
        parcel.writeInt(this.f2551b);
        parcel.writeInt(this.f2553d ? 1 : 0);
        int[] iArr = this.f2552c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2552c);
        }
    }
}
