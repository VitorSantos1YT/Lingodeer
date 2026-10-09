package re;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import lf.v0;
import org.json.JSONException;
import org.json.JSONObject;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new j0(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49180c;

    public j(String encodedHeaderString) throws JSONException {
        kotlin.jvm.internal.m.f(encodedHeaderString, "encodedHeaderString");
        v0.i(encodedHeaderString, "encodedHeaderString");
        byte[] decodedBytes = Base64.decode(encodedHeaderString, 0);
        kotlin.jvm.internal.m.e(decodedBytes, "decodedBytes");
        Charset charset = oz.a.f46133a;
        try {
            JSONObject jSONObject = new JSONObject(new String(decodedBytes, charset));
            String alg = jSONObject.optString("alg");
            kotlin.jvm.internal.m.e(alg, "alg");
            boolean z11 = alg.length() > 0 && alg.equals("RS256");
            String strOptString = jSONObject.optString("kid");
            kotlin.jvm.internal.m.e(strOptString, "jsonObj.optString(\"kid\")");
            boolean z12 = strOptString.length() > 0;
            String strOptString2 = jSONObject.optString("typ");
            kotlin.jvm.internal.m.e(strOptString2, "jsonObj.optString(\"typ\")");
            boolean z13 = strOptString2.length() > 0;
            if (z11 && z12 && z13) {
                byte[] decodedBytes2 = Base64.decode(encodedHeaderString, 0);
                kotlin.jvm.internal.m.e(decodedBytes2, "decodedBytes");
                JSONObject jSONObject2 = new JSONObject(new String(decodedBytes2, charset));
                String string = jSONObject2.getString("alg");
                kotlin.jvm.internal.m.e(string, "jsonObj.getString(\"alg\")");
                this.f49178a = string;
                String string2 = jSONObject2.getString("typ");
                kotlin.jvm.internal.m.e(string2, "jsonObj.getString(\"typ\")");
                this.f49179b = string2;
                String string3 = jSONObject2.getString("kid");
                kotlin.jvm.internal.m.e(string3, "jsonObj.getString(\"kid\")");
                this.f49180c = string3;
                return;
            }
        } catch (JSONException unused) {
        }
        throw new IllegalArgumentException("Invalid Header");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f49178a, jVar.f49178a) && kotlin.jvm.internal.m.a(this.f49179b, jVar.f49179b) && kotlin.jvm.internal.m.a(this.f49180c, jVar.f49180c);
    }

    public final int hashCode() {
        return this.f49180c.hashCode() + defpackage.e.d(defpackage.e.d(527, 31, this.f49178a), 31, this.f49179b);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f49178a);
        jSONObject.put("typ", this.f49179b);
        jSONObject.put("kid", this.f49180c);
        String string = jSONObject.toString();
        kotlin.jvm.internal.m.e(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeString(this.f49178a);
        dest.writeString(this.f49179b);
        dest.writeString(this.f49180c);
    }

    public j(Parcel parcel) {
        String string = parcel.readString();
        v0.k(string, "alg");
        this.f49178a = string;
        String string2 = parcel.readString();
        v0.k(string2, "typ");
        this.f49179b = string2;
        String string3 = parcel.readString();
        v0.k(string3, "kid");
        this.f49180c = string3;
    }
}
