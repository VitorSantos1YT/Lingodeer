package re;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lf.j1;
import lf.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new j0(8);
    public final String H;
    public final String K;
    public final String L;
    public final String M;
    public final String N;
    public final String O;
    public final Set P;
    public final String Q;
    public final Map R;
    public final Map S;
    public final Map T;
    public final String U;
    public final String V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49167f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f49168t;

    public i(String encodedClaims, String expectedNonce) throws JSONException {
        Set setUnmodifiableSet;
        kotlin.jvm.internal.m.f(encodedClaims, "encodedClaims");
        kotlin.jvm.internal.m.f(expectedNonce, "expectedNonce");
        v0.i(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        kotlin.jvm.internal.m.e(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, oz.a.f46133a));
        String jti = jSONObject.optString("jti");
        kotlin.jvm.internal.m.e(jti, "jti");
        if (jti.length() != 0) {
            try {
                String iss = jSONObject.optString("iss");
                kotlin.jvm.internal.m.e(iss, "iss");
                if (iss.length() != 0 && (kotlin.jvm.internal.m.a(new URL(iss).getHost(), "facebook.com") || kotlin.jvm.internal.m.a(new URL(iss).getHost(), "www.facebook.com"))) {
                    String aud = jSONObject.optString("aud");
                    kotlin.jvm.internal.m.e(aud, "aud");
                    if (aud.length() != 0 && aud.equals(s.b())) {
                        long j11 = 1000;
                        if (!new Date().after(new Date(jSONObject.optLong("exp") * j11))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * j11) + 600000))) {
                                String sub = jSONObject.optString("sub");
                                kotlin.jvm.internal.m.e(sub, "sub");
                                if (sub.length() != 0) {
                                    String nonce = jSONObject.optString("nonce");
                                    kotlin.jvm.internal.m.e(nonce, "nonce");
                                    if (nonce.length() != 0 && nonce.equals(expectedNonce)) {
                                        String string = jSONObject.getString("jti");
                                        kotlin.jvm.internal.m.e(string, "jsonObj.getString(JSON_KEY_JIT)");
                                        this.f49162a = string;
                                        String string2 = jSONObject.getString("iss");
                                        kotlin.jvm.internal.m.e(string2, "jsonObj.getString(JSON_KEY_ISS)");
                                        this.f49163b = string2;
                                        String string3 = jSONObject.getString("aud");
                                        kotlin.jvm.internal.m.e(string3, "jsonObj.getString(JSON_KEY_AUD)");
                                        this.f49164c = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        kotlin.jvm.internal.m.e(string4, "jsonObj.getString(JSON_KEY_NONCE)");
                                        this.f49165d = string4;
                                        this.f49166e = jSONObject.getLong("exp");
                                        this.f49167f = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        kotlin.jvm.internal.m.e(string5, "jsonObj.getString(JSON_KEY_SUB)");
                                        this.f49168t = string5;
                                        this.H = ob.f.r(jSONObject, "name");
                                        this.K = ob.f.r(jSONObject, "given_name");
                                        this.L = ob.f.r(jSONObject, "middle_name");
                                        this.M = ob.f.r(jSONObject, "family_name");
                                        this.N = ob.f.r(jSONObject, "email");
                                        this.O = ob.f.r(jSONObject, "picture");
                                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
                                        if (jSONArrayOptJSONArray == null) {
                                            setUnmodifiableSet = null;
                                        } else {
                                            HashSet hashSet = new HashSet();
                                            int length = jSONArrayOptJSONArray.length();
                                            for (int i11 = 0; i11 < length; i11++) {
                                                String string6 = jSONArrayOptJSONArray.getString(i11);
                                                kotlin.jvm.internal.m.e(string6, "jsonArray.getString(i)");
                                                hashSet.add(string6);
                                            }
                                            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                                        }
                                        this.P = setUnmodifiableSet;
                                        this.Q = ob.f.r(jSONObject, "user_birthday");
                                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
                                        this.R = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(j1.h(jSONObjectOptJSONObject));
                                        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        this.S = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(j1.i(jSONObjectOptJSONObject2));
                                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.T = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(j1.i(jSONObjectOptJSONObject3)) : null;
                                        this.U = ob.f.r(jSONObject, "user_gender");
                                        this.V = ob.f.r(jSONObject, "user_link");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        throw new IllegalArgumentException("Invalid claims");
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f49162a);
        jSONObject.put("iss", this.f49163b);
        jSONObject.put("aud", this.f49164c);
        jSONObject.put("nonce", this.f49165d);
        jSONObject.put("exp", this.f49166e);
        jSONObject.put("iat", this.f49167f);
        String str = this.f49168t;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.H;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.K;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.L;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.M;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.N;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.O;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.P;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.Q;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.R;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.S;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.T;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.U;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.V;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f49162a, iVar.f49162a) && kotlin.jvm.internal.m.a(this.f49163b, iVar.f49163b) && kotlin.jvm.internal.m.a(this.f49164c, iVar.f49164c) && kotlin.jvm.internal.m.a(this.f49165d, iVar.f49165d) && this.f49166e == iVar.f49166e && this.f49167f == iVar.f49167f && kotlin.jvm.internal.m.a(this.f49168t, iVar.f49168t) && kotlin.jvm.internal.m.a(this.H, iVar.H) && kotlin.jvm.internal.m.a(this.K, iVar.K) && kotlin.jvm.internal.m.a(this.L, iVar.L) && kotlin.jvm.internal.m.a(this.M, iVar.M) && kotlin.jvm.internal.m.a(this.N, iVar.N) && kotlin.jvm.internal.m.a(this.O, iVar.O) && kotlin.jvm.internal.m.a(this.P, iVar.P) && kotlin.jvm.internal.m.a(this.Q, iVar.Q) && kotlin.jvm.internal.m.a(this.R, iVar.R) && kotlin.jvm.internal.m.a(this.S, iVar.S) && kotlin.jvm.internal.m.a(this.T, iVar.T) && kotlin.jvm.internal.m.a(this.U, iVar.U) && kotlin.jvm.internal.m.a(this.V, iVar.V);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(defpackage.e.f(this.f49167f, defpackage.e.f(this.f49166e, defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(527, 31, this.f49162a), 31, this.f49163b), 31, this.f49164c), 31, this.f49165d), 31), 31), 31, this.f49168t);
        String str = this.H;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.K;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.L;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.M;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.N;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.O;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.P;
        int iHashCode7 = (iHashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.Q;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.R;
        int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.S;
        int iHashCode10 = (iHashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.T;
        int iHashCode11 = (iHashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.U;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.V;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String string = a().toString();
        kotlin.jvm.internal.m.e(string, "claimsJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeString(this.f49162a);
        dest.writeString(this.f49163b);
        dest.writeString(this.f49164c);
        dest.writeString(this.f49165d);
        dest.writeLong(this.f49166e);
        dest.writeLong(this.f49167f);
        dest.writeString(this.f49168t);
        dest.writeString(this.H);
        dest.writeString(this.K);
        dest.writeString(this.L);
        dest.writeString(this.M);
        dest.writeString(this.N);
        dest.writeString(this.O);
        Set set = this.P;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.Q);
        dest.writeMap(this.R);
        dest.writeMap(this.S);
        dest.writeMap(this.T);
        dest.writeString(this.U);
        dest.writeString(this.V);
    }

    public i(Parcel parcel) {
        String string = parcel.readString();
        v0.k(string, "jti");
        this.f49162a = string;
        String string2 = parcel.readString();
        v0.k(string2, "iss");
        this.f49163b = string2;
        String string3 = parcel.readString();
        v0.k(string3, "aud");
        this.f49164c = string3;
        String string4 = parcel.readString();
        v0.k(string4, "nonce");
        this.f49165d = string4;
        this.f49166e = parcel.readLong();
        this.f49167f = parcel.readLong();
        String string5 = parcel.readString();
        v0.k(string5, "sub");
        this.f49168t = string5;
        this.H = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.O = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.P = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.Q = parcel.readString();
        HashMap hashMap = parcel.readHashMap(kotlin.jvm.internal.k.class.getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.R = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        HashMap hashMap2 = parcel.readHashMap(kotlin.jvm.internal.b0.class.getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.S = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(kotlin.jvm.internal.b0.class.getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.T = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.U = parcel.readString();
        this.V = parcel.readString();
    }
}
