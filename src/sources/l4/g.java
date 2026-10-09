package l4;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import x1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k5.b {
    public static final Parcelable.Creator<g> CREATOR = new o(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArray f39733c;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i11 = parcel.readInt();
        int[] iArr = new int[i11];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f39733c = new SparseArray(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f39733c.append(iArr[i12], parcelableArray[i12]);
        }
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        SparseArray sparseArray = this.f39733c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = this.f39733c.keyAt(i12);
            parcelableArr[i12] = (Parcelable) this.f39733c.valueAt(i12);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i11);
    }
}
