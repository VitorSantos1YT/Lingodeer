package l1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Parcelable.ClassLoaderCreator {
    public static k1 a(Parcel parcel, ClassLoader classLoader) {
        g gVar;
        if (classLoader == null) {
            classLoader = j1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i11 = parcel.readInt();
        if (i11 == 0) {
            gVar = g.f39300d;
        } else if (i11 == 1) {
            gVar = g.f39303t;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException(hh.p0.h(i11, "Unsupported MutableState policy ", " was restored"));
            }
            gVar = g.f39301e;
        }
        return new k1(value, gVar);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new k1[i11];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
