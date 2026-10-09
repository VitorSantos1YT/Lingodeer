package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements ReflectedParcelable, Api.ApiOptions.Optional {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions M;
    public static final Scope N;
    public static final Scope O;
    public static final Scope P;
    public static final Scope Q;
    public static final Comparator R;
    public final String H;
    public final ArrayList K;
    public final String L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Account f8495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8498f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8499t;

    static {
        Scope scope = new Scope(1, "profile");
        N = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        O = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        P = scope3;
        Q = new Scope(1, "https://www.googleapis.com/auth/games");
        Builder builder = new Builder();
        builder.f8500a.add(scope2);
        builder.f8500a.add(scope);
        M = builder.a();
        Builder builder2 = new Builder();
        HashSet hashSet = builder2.f8500a;
        hashSet.add(scope3);
        hashSet.addAll(Arrays.asList(new Scope[0]));
        builder2.a();
        CREATOR = new zad();
        R = new zac();
    }

    public GoogleSignInOptions(int i11, ArrayList arrayList, Account account, boolean z11, boolean z12, boolean z13, String str, String str2, HashMap map, String str3) {
        this.f8493a = i11;
        this.f8494b = arrayList;
        this.f8495c = account;
        this.f8496d = z11;
        this.f8497e = z12;
        this.f8498f = z13;
        this.f8499t = str;
        this.H = str2;
        this.K = new ArrayList(map.values());
        this.L = str3;
    }

    public static GoogleSignInOptions D1(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            hashSet.add(new Scope(1, jSONArray.getString(i11)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap E1(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) obj;
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f8515b), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f8499t;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.f8494b;
            String str2 = googleSignInOptions.f8499t;
            Account account = googleSignInOptions.f8495c;
            if (this.K.isEmpty() && googleSignInOptions.K.isEmpty()) {
                ArrayList arrayList2 = this.f8494b;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account2 = this.f8495c;
                    if (account2 == null) {
                        if (account != null) {
                            return false;
                        }
                    } else if (!account2.equals(account)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    return this.f8498f == googleSignInOptions.f8498f && this.f8496d == googleSignInOptions.f8496d && this.f8497e == googleSignInOptions.f8497e && TextUtils.equals(this.L, googleSignInOptions.L);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f8494b;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((Scope) arrayList2.get(i11)).f8702b);
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.a(arrayList);
        hashAccumulator.a(this.f8495c);
        hashAccumulator.a(this.f8499t);
        hashAccumulator.f8517a = (((((hashAccumulator.f8517a * 31) + (this.f8498f ? 1 : 0)) * 31) + (this.f8496d ? 1 : 0)) * 31) + (this.f8497e ? 1 : 0);
        hashAccumulator.a(this.L);
        return hashAccumulator.f8517a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8493a);
        SafeParcelWriter.o(parcel, 2, new ArrayList(this.f8494b), false);
        SafeParcelWriter.j(parcel, 3, this.f8495c, i11, false);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f8496d ? 1 : 0);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f8497e ? 1 : 0);
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(this.f8498f ? 1 : 0);
        SafeParcelWriter.k(parcel, 7, this.f8499t, false);
        SafeParcelWriter.k(parcel, 8, this.H, false);
        SafeParcelWriter.o(parcel, 9, this.K, false);
        SafeParcelWriter.k(parcel, 10, this.L, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f8500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f8502c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8503d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f8504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Account f8505f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f8506g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final HashMap f8507h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f8508i;

        public Builder() {
            this.f8500a = new HashSet();
            this.f8507h = new HashMap();
        }

        public final GoogleSignInOptions a() {
            Scope scope = GoogleSignInOptions.Q;
            HashSet hashSet = this.f8500a;
            if (hashSet.contains(scope)) {
                Scope scope2 = GoogleSignInOptions.P;
                if (hashSet.contains(scope2)) {
                    hashSet.remove(scope2);
                }
            }
            if (this.f8503d && (this.f8505f == null || !hashSet.isEmpty())) {
                hashSet.add(GoogleSignInOptions.O);
            }
            return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f8505f, this.f8503d, this.f8501b, this.f8502c, this.f8504e, this.f8506g, this.f8507h, this.f8508i);
        }

        public Builder(GoogleSignInOptions googleSignInOptions) {
            this.f8500a = new HashSet();
            this.f8507h = new HashMap();
            Preconditions.g(googleSignInOptions);
            this.f8500a = new HashSet(googleSignInOptions.f8494b);
            this.f8501b = googleSignInOptions.f8497e;
            this.f8502c = googleSignInOptions.f8498f;
            this.f8503d = googleSignInOptions.f8496d;
            this.f8504e = googleSignInOptions.f8499t;
            this.f8505f = googleSignInOptions.f8495c;
            this.f8506g = googleSignInOptions.H;
            this.f8507h = GoogleSignInOptions.E1(googleSignInOptions.K);
            this.f8508i = googleSignInOptions.L;
        }
    }
}
