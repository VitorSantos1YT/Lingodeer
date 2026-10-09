package xf;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f56025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f56030f;

    public d(Parcel parcel) {
        this.f56025a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f56026b = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.f56027c = parcel.readString();
        this.f56028d = parcel.readString();
        this.f56029e = parcel.readString();
        c7.a aVar = new c7.a();
        e eVar = (e) parcel.readParcelable(e.class.getClassLoader());
        if (eVar != null) {
            aVar.f6641a = eVar.f56031a;
        }
        this.f56030f = new e(aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        out.writeParcelable(this.f56025a, 0);
        out.writeStringList(this.f56026b);
        out.writeString(this.f56027c);
        out.writeString(this.f56028d);
        out.writeString(this.f56029e);
        out.writeParcelable(this.f56030f, 0);
    }
}
