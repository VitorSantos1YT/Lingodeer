package tf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import lf.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new b(8);
    public HashMap H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f52221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.b f52222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.h f52223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f52224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f52225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f52226f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f52227t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(t tVar, u code, re.b bVar, String str, String str2) {
        this(tVar, code, bVar, null, str, str2);
        kotlin.jvm.internal.m.f(code, "code");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeString(this.f52221a.name());
        dest.writeParcelable(this.f52222b, i11);
        dest.writeParcelable(this.f52223c, i11);
        dest.writeString(this.f52224d);
        dest.writeString(this.f52225e);
        dest.writeParcelable(this.f52226f, i11);
        j1.L(dest, this.f52227t);
        j1.L(dest, this.H);
    }

    public v(t tVar, u code, re.b bVar, re.h hVar, String str, String str2) {
        kotlin.jvm.internal.m.f(code, "code");
        this.f52226f = tVar;
        this.f52222b = bVar;
        this.f52223c = hVar;
        this.f52224d = str;
        this.f52221a = code;
        this.f52225e = str2;
    }

    public v(Parcel parcel) {
        String string = parcel.readString();
        this.f52221a = u.valueOf(string == null ? "error" : string);
        this.f52222b = (re.b) parcel.readParcelable(re.b.class.getClassLoader());
        this.f52223c = (re.h) parcel.readParcelable(re.h.class.getClassLoader());
        this.f52224d = parcel.readString();
        this.f52225e = parcel.readString();
        this.f52226f = (t) parcel.readParcelable(t.class.getClassLoader());
        this.f52227t = j1.H(parcel);
        this.H = j1.H(parcel);
    }
}
