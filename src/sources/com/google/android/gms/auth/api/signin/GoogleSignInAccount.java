package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    public final String H;
    public final List K;
    public final String L;
    public final String M;
    public final HashSet N = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f8489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8490f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f8491t;

    static {
        DefaultClock defaultClock = DefaultClock.f9117a;
    }

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j11, String str6, ArrayList arrayList, String str7, String str8) {
        this.f8485a = str;
        this.f8486b = str2;
        this.f8487c = str3;
        this.f8488d = str4;
        this.f8489e = uri;
        this.f8490f = str5;
        this.f8491t = j11;
        this.H = str6;
        this.K = arrayList;
        this.L = str7;
        this.M = str8;
    }

    public static GoogleSignInAccount E1(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j11 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            hashSet.add(new Scope(1, jSONArray.getString(i11)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        Preconditions.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j11, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f8490f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final HashSet D1() {
        HashSet hashSet = new HashSet(this.K);
        hashSet.addAll(this.N);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.H.equals(this.H) && googleSignInAccount.D1().equals(D1());
    }

    public final int hashCode() {
        return ((this.H.hashCode() + 527) * 31) + D1().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f8485a, false);
        SafeParcelWriter.k(parcel, 3, this.f8486b, false);
        SafeParcelWriter.k(parcel, 4, this.f8487c, false);
        SafeParcelWriter.k(parcel, 5, this.f8488d, false);
        SafeParcelWriter.j(parcel, 6, this.f8489e, i11, false);
        SafeParcelWriter.k(parcel, 7, this.f8490f, false);
        SafeParcelWriter.p(parcel, 8, 8);
        parcel.writeLong(this.f8491t);
        SafeParcelWriter.k(parcel, 9, this.H, false);
        SafeParcelWriter.o(parcel, 10, this.K, false);
        SafeParcelWriter.k(parcel, 11, this.L, false);
        SafeParcelWriter.k(parcel, 12, this.M, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public final String F1() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f8485a;
            if (str != null) {
                jSONObject.put("id", str);
            }
            String str2 = this.f8486b;
            if (str2 != null) {
                jSONObject.put("tokenId", str2);
            }
            String str3 = this.f8487c;
            if (str3 != null) {
                jSONObject.put("email", str3);
            }
            String str4 = this.f8488d;
            if (str4 != null) {
                jSONObject.put("displayName", str4);
            }
            String str5 = this.L;
            if (str5 != null) {
                jSONObject.put(anrPHlQ.rYtOCEzliPDa, str5);
            }
            String str6 = this.M;
            if (str6 != null) {
                jSONObject.put("familyName", str6);
            }
            Uri uri = this.f8489e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str7 = this.f8490f;
            if (str7 != null) {
                jSONObject.put("serverAuthCode", str7);
            }
            jSONObject.put("expirationTime", this.f8491t);
            jSONObject.put("obfuscatedIdentifier", this.H);
            JSONArray jSONArray = new JSONArray();
            List list = this.K;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).f8702b.compareTo(((Scope) obj2).f8702b);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f8702b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }
}
