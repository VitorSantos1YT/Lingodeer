package bi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4452c = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4453d;

    public a(int i11, String str) {
        this.f4450a = i11;
        this.f4453d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f4450a);
        parcel.writeString(this.f4451b);
        parcel.writeString(this.f4452c);
        parcel.writeString(this.f4453d);
    }
}
