package tf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f52181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f52182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f52183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f52184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f52185e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeString(this.f52181a);
        dest.writeString(this.f52182b);
        dest.writeString(this.f52183c);
        dest.writeLong(this.f52184d);
        dest.writeLong(this.f52185e);
    }
}
