package xf;

import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends d {
    public static final Parcelable.Creator<p> CREATOR = new j0(25);
    public final String H;
    public final k K;
    public final o L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f56049t;

    public p(Parcel parcel) {
        super(parcel);
        this.f56049t = parcel.readString();
        this.H = parcel.readString();
        j jVar = new j(9);
        jVar.s0((k) parcel.readParcelable(k.class.getClassLoader()));
        this.K = (jVar.f56036d == null && jVar.f56035c == null) ? null : new k(jVar);
        n nVar = new n(9);
        o oVar = (o) parcel.readParcelable(o.class.getClassLoader());
        if (oVar != null) {
            nVar.f56046c = oVar.f56047b;
        }
        this.L = new o(nVar);
    }

    @Override // xf.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xf.d, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        super.writeToParcel(out, i11);
        out.writeString(this.f56049t);
        out.writeString(this.H);
        out.writeParcelable(this.K, 0);
        out.writeParcelable(this.L, 0);
    }
}
