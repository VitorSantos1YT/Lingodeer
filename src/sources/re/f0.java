package re;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import lf.v0;
import org.json.JSONObject;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new j0(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f49153f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Uri f49154t;

    public f0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        v0.k(str, "id");
        this.f49148a = str;
        this.f49149b = str2;
        this.f49150c = str3;
        this.f49151d = str4;
        this.f49152e = str5;
        this.f49153f = uri;
        this.f49154t = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        String str5 = this.f49148a;
        return ((str5 == null && ((f0) obj).f49148a == null) || kotlin.jvm.internal.m.a(str5, ((f0) obj).f49148a)) && (((str = this.f49149b) == null && ((f0) obj).f49149b == null) || kotlin.jvm.internal.m.a(str, ((f0) obj).f49149b)) && ((((str2 = this.f49150c) == null && ((f0) obj).f49150c == null) || kotlin.jvm.internal.m.a(str2, ((f0) obj).f49150c)) && ((((str3 = this.f49151d) == null && ((f0) obj).f49151d == null) || kotlin.jvm.internal.m.a(str3, ((f0) obj).f49151d)) && ((((str4 = this.f49152e) == null && ((f0) obj).f49152e == null) || kotlin.jvm.internal.m.a(str4, ((f0) obj).f49152e)) && ((((uri = this.f49153f) == null && ((f0) obj).f49153f == null) || kotlin.jvm.internal.m.a(uri, ((f0) obj).f49153f)) && (((uri2 = this.f49154t) == null && ((f0) obj).f49154t == null) || kotlin.jvm.internal.m.a(uri2, ((f0) obj).f49154t))))));
    }

    public final int hashCode() {
        String str = this.f49148a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f49149b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f49150c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f49151d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f49152e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f49153f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f49154t;
        if (uri2 != null) {
            return uri2.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeString(this.f49148a);
        dest.writeString(this.f49149b);
        dest.writeString(this.f49150c);
        dest.writeString(this.f49151d);
        dest.writeString(this.f49152e);
        Uri uri = this.f49153f;
        dest.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.f49154t;
        dest.writeString(uri2 != null ? uri2.toString() : null);
    }

    public f0(JSONObject jSONObject) {
        this.f49148a = jSONObject.optString("id", null);
        this.f49149b = jSONObject.optString("first_name", null);
        this.f49150c = jSONObject.optString("middle_name", null);
        this.f49151d = jSONObject.optString("last_name", null);
        this.f49152e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f49153f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.f49154t = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public f0(Parcel parcel) {
        this.f49148a = parcel.readString();
        this.f49149b = parcel.readString();
        this.f49150c = parcel.readString();
        this.f49151d = parcel.readString();
        this.f49152e = parcel.readString();
        String string = parcel.readString();
        this.f49153f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f49154t = string2 != null ? Uri.parse(string2) : null;
    }
}
