package xf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p9.j0;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends d {
    public static final Parcelable.Creator<l> CREATOR = new j0(22);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f56044t;

    public l(Parcel parcel) {
        Iterable iterable;
        super(parcel);
        Parcelable[] parcelableArray = parcel.readParcelableArray(h.class.getClassLoader());
        if (parcelableArray == null) {
            iterable = r.f50854a;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof h) {
                    arrayList.add(parcelable);
                }
            }
            iterable = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof k) {
                arrayList2.add(obj);
            }
        }
        this.f56044t = ry.m.a1(arrayList2);
    }

    @Override // xf.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xf.d, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        super.writeToParcel(out, i11);
        List photos = this.f56044t;
        kotlin.jvm.internal.m.f(photos, "photos");
        out.writeParcelableArray((k[]) photos.toArray(new k[0]), i11);
    }
}
