package x1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.j0;
import r.d2;
import r.r2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55702a;

    public /* synthetic */ o(int i11) {
        this.f55702a = i11;
    }

    public static p a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = o.class.getClassLoader();
        }
        int i11 = parcel.readInt();
        if (i11 == 0) {
            return new p();
        }
        p1.f fVarG = p1.i.f46270b.g();
        for (int i12 = 0; i12 < i11; i12++) {
            fVarG.add(parcel.readValue(classLoader));
        }
        return new p(fVarG.e());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f55702a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new j0(parcel, classLoader);
            case 2:
                return new ia.g(parcel);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return k5.b.f37909b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new l4.g(parcel, classLoader);
            case 5:
                return new d2(parcel, classLoader);
            case 6:
                return new r2(parcel, classLoader);
            case 7:
                return new t5.d(parcel, classLoader);
            default:
                return new ua.l(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f55702a) {
            case 0:
                return new p[i11];
            case 1:
                return new j0[i11];
            case 2:
                return new ia.g[i11];
            case 3:
                return new k5.b[i11];
            case 4:
                return new l4.g[i11];
            case 5:
                return new d2[i11];
            case 6:
                return new r2[i11];
            case 7:
                return new t5.d[i11];
            default:
                return new ua.l[i11];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f55702a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new j0(parcel, null);
            case 2:
                return new ia.g(parcel);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return k5.b.f37909b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new l4.g(parcel, null);
            case 5:
                return new d2(parcel, null);
            case 6:
                return new r2(parcel, null);
            case 7:
                return new t5.d(parcel, null);
            default:
                return new ua.l(parcel, null);
        }
    }
}
