package t5;

import android.os.Parcel;
import android.os.Parcelable;
import x1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k5.b {
    public static final Parcelable.Creator<d> CREATOR = new o(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52043f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f52044t;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f52040c = 0;
        this.f52040c = parcel.readInt();
        this.f52041d = parcel.readInt();
        this.f52042e = parcel.readInt();
        this.f52043f = parcel.readInt();
        this.f52044t = parcel.readInt();
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f52040c);
        parcel.writeInt(this.f52041d);
        parcel.writeInt(this.f52042e);
        parcel.writeInt(this.f52043f);
        parcel.writeInt(this.f52044t);
    }
}
