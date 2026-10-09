package qi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new j0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f47801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f47802e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        try {
            return new GsonBuilder().disableHtmlEscaping().create().toJson(this);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f47798a);
        parcel.writeLong(this.f47799b);
        parcel.writeInt(this.f47800c);
        parcel.writeList(this.f47801d);
        parcel.writeList(this.f47802e);
    }
}
