package xf;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new j0(21);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f56039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f56040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f56043f;

    public k(j jVar) {
        super(jVar);
        this.f56043f = g.PHOTO;
        this.f56039b = jVar.f56035c;
        this.f56040c = jVar.f56036d;
        this.f56041d = jVar.f56037e;
        this.f56042e = jVar.f56038f;
    }

    @Override // xf.h
    public final g a() {
        return this.f56043f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xf.h, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        super.writeToParcel(out, i11);
        out.writeParcelable(this.f56039b, 0);
        out.writeParcelable(this.f56040c, 0);
        out.writeByte(this.f56041d ? (byte) 1 : (byte) 0);
        out.writeString(this.f56042e);
    }

    public k(Parcel parcel) {
        super(parcel);
        this.f56043f = g.PHOTO;
        this.f56039b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f56040c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f56041d = parcel.readByte() != 0;
        this.f56042e = parcel.readString();
    }
}
