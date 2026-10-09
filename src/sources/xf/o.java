package xf;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends h {
    public static final Parcelable.Creator<o> CREATOR = new j0(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f56047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f56048c;

    public o(n nVar) {
        super(nVar);
        this.f56048c = g.VIDEO;
        this.f56047b = nVar.f56046c;
    }

    @Override // xf.h
    public final g a() {
        return this.f56048c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xf.h, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        super.writeToParcel(out, i11);
        out.writeParcelable(this.f56047b, 0);
    }

    public o(Parcel parcel) {
        super(parcel);
        this.f56048c = g.VIDEO;
        this.f56047b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
