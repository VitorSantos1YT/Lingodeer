package xf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends d {
    public static final Parcelable.Creator<m> CREATOR = new j0(23);
    public final k H;
    public final List K;
    public final String L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f56045t;

    public m(Parcel parcel) {
        super(parcel);
        this.f56045t = (h) parcel.readParcelable(h.class.getClassLoader());
        this.H = (k) parcel.readParcelable(k.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.K = arrayList.isEmpty() ? null : ry.m.a1(arrayList);
        this.L = parcel.readString();
    }

    @Override // xf.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xf.d, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        super.writeToParcel(out, i11);
        out.writeParcelable(this.f56045t, 0);
        out.writeParcelable(this.H, 0);
        List list = this.K;
        out.writeStringList(list != null ? ry.m.a1(list) : null);
        out.writeString(this.L);
    }
}
