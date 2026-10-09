package re;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import lf.v0;
import org.json.JSONException;
import org.json.JSONObject;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new j0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f49158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f49159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49160e;

    public h(String str, String expectedNonce) {
        kotlin.jvm.internal.m.f(expectedNonce, "expectedNonce");
        v0.i(str, "token");
        v0.i(expectedNonce, "expectedNonce");
        boolean zM = false;
        List listW0 = oz.q.W0(str, new String[]{"."}, 0, 6);
        if (listW0.size() != 3) {
            throw new IllegalArgumentException("Invalid IdToken string");
        }
        String str2 = (String) listW0.get(0);
        String str3 = (String) listW0.get(1);
        String str4 = (String) listW0.get(2);
        this.f49156a = str;
        this.f49157b = expectedNonce;
        j jVar = new j(str2);
        this.f49158c = jVar;
        this.f49159d = new i(str3, expectedNonce);
        try {
            String strW = android.support.v4.media.session.a.w(jVar.f49180c);
            if (strW != null) {
                zM = android.support.v4.media.session.a.M(android.support.v4.media.session.a.v(strW), str2 + '.' + str3, str4);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (!zM) {
            throw new IllegalArgumentException("Invalid Signature");
        }
        this.f49160e = str4;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f49156a);
        jSONObject.put("expected_nonce", this.f49157b);
        j jVar = this.f49158c;
        jVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", jVar.f49178a);
        jSONObject2.put("typ", jVar.f49179b);
        jSONObject2.put("kid", jVar.f49180c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f49159d.a());
        jSONObject.put("signature", this.f49160e);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f49156a, hVar.f49156a) && kotlin.jvm.internal.m.a(this.f49157b, hVar.f49157b) && kotlin.jvm.internal.m.a(this.f49158c, hVar.f49158c) && kotlin.jvm.internal.m.a(this.f49159d, hVar.f49159d) && kotlin.jvm.internal.m.a(this.f49160e, hVar.f49160e);
    }

    public final int hashCode() {
        return this.f49160e.hashCode() + ((this.f49159d.hashCode() + ((this.f49158c.hashCode() + defpackage.e.d(defpackage.e.d(527, 31, this.f49156a), 31, this.f49157b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeString(this.f49156a);
        dest.writeString(this.f49157b);
        dest.writeParcelable(this.f49158c, i11);
        dest.writeParcelable(this.f49159d, i11);
        dest.writeString(this.f49160e);
    }

    public h(Parcel parcel) {
        String string = parcel.readString();
        v0.k(string, "token");
        this.f49156a = string;
        String string2 = parcel.readString();
        v0.k(string2, "expectedNonce");
        this.f49157b = string2;
        Parcelable parcelable = parcel.readParcelable(j.class.getClassLoader());
        if (parcelable != null) {
            this.f49158c = (j) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(i.class.getClassLoader());
            if (parcelable2 != null) {
                this.f49159d = (i) parcelable2;
                String string3 = parcel.readString();
                v0.k(string3, "signature");
                this.f49160e = string3;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
