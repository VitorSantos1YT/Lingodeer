package xf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p9.j0;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends d {
    public static final Parcelable.Creator<i> CREATOR = new j0(20);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f56034t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ry.r] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    public i(Parcel parcel) {
        Object arrayList;
        super(parcel);
        Parcelable[] parcelableArray = parcel.readParcelableArray(h.class.getClassLoader());
        if (parcelableArray != null) {
            arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                h hVar = (h) parcelable;
                if (hVar != null) {
                    arrayList.add(hVar);
                }
            }
        } else {
            arrayList = r.f50854a;
        }
        this.f56034t = arrayList;
    }

    @Override // xf.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    @Override // xf.d, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        super.writeToParcel(out, i11);
        out.writeParcelableArray((Parcelable[]) this.f56034t.toArray(new h[0]), i11);
    }
}
