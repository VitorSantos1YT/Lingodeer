package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;
import nv.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Storage {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f8526c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Storage f8527d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f8528a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f8529b;

    public Storage(Context context) {
        this.f8529b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static Storage a(Context context) {
        Preconditions.g(context);
        ReentrantLock reentrantLock = f8526c;
        reentrantLock.lock();
        try {
            if (f8527d == null) {
                f8527d = new Storage(context.getApplicationContext());
            }
            return f8527d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String f(String str, String str2) {
        return p.u(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strE2) && (strE = e(f("googleSignInAccount", strE2))) != null) {
            try {
                return GoogleSignInAccount.E1(strE);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.g(googleSignInAccount);
        Preconditions.g(googleSignInOptions);
        String str = googleSignInAccount.H;
        d("defaultGoogleSignInAccount", str);
        d(f("googleSignInAccount", str), googleSignInAccount.F1());
        String strF = f("googleSignInOptions", str);
        String str2 = googleSignInOptions.H;
        String str3 = googleSignInOptions.f8499t;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInOptions.f8494b;
            Collections.sort(arrayList, GoogleSignInOptions.R);
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                jSONArray.put(((Scope) obj).f8702b);
            }
            jSONObject.put("scopes", jSONArray);
            Account account = googleSignInOptions.f8495c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", googleSignInOptions.f8496d);
            jSONObject.put("forceCodeForRefreshToken", googleSignInOptions.f8498f);
            jSONObject.put("serverAuthRequested", googleSignInOptions.f8497e);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("serverClientId", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("hostedDomain", str2);
            }
            d(strF, jSONObject.toString());
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final void d(String str, String str2) {
        ReentrantLock reentrantLock = this.f8528a;
        reentrantLock.lock();
        try {
            this.f8529b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f8528a;
        reentrantLock.lock();
        try {
            return this.f8529b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
