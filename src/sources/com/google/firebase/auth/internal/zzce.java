package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzahd;
import com.google.android.gms.internal.p002firebaseauthapi.zzje;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.internal.p002firebaseauthapi.zzzx;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f18002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f18004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Logger f18005d;

    public final zzad a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        zzaf zzafVarA;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z11 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(zzz.D1(jSONArray3.getString(i11)));
            }
            zzad zzadVar = new zzad(FirebaseApp.f(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzadVar.f17933a = zzahd.D1(string);
            }
            if (!z11) {
                zzadVar.H = Boolean.FALSE;
            }
            zzadVar.f17939t = str;
            if (jSONObject.has("userMetadata") && (zzafVarA = zzaf.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzadVar.K = zzafVarA;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i12));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? PhoneMultiFactorInfo.F1(jSONObject2) : Objects.equals(strOptString, "totp") ? TotpMultiFactorInfo.F1(jSONObject2) : null);
                }
                zzadVar.N1(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                    arrayList3.add(com.google.firebase.auth.zzao.E1(new JSONObject(jSONArray.getString(i13))));
                }
                zzadVar.O = arrayList3;
            }
            return zzadVar;
        } catch (zzzx e8) {
            e = e8;
            Log.wtf(this.f18005d.f9046a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e10) {
            e = e10;
            Log.wtf(this.f18005d.f9046a, e);
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            Log.wtf(this.f18005d.f9046a, e);
            return null;
        } catch (JSONException e12) {
            e = e12;
            Log.wtf(this.f18005d.f9046a, e);
            return null;
        }
    }

    public final void b(String str, String str2) {
        String strEncodeToString;
        zzcb zzcbVarA = zzcb.a(this.f18002a, this.f18003b);
        zzcbVarA.getClass();
        Preconditions.g(str2);
        zzmy zzmyVar = zzcbVarA.f18000b;
        String str3 = null;
        if (zzmyVar != null) {
            try {
                synchronized (zzmyVar) {
                    try {
                        strEncodeToString = Base64.encodeToString(((com.google.android.gms.internal.p002firebaseauthapi.zzbm) zzcbVarA.f18000b.a().g(zzje.a(), com.google.android.gms.internal.p002firebaseauthapi.zzbm.class)).b(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                str3 = strEncodeToString;
            } catch (GeneralSecurityException e8) {
                e8.getMessage();
            }
        }
        if (str3 != null) {
            this.f18004c.edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }

    public final String c(String str) {
        String str2;
        String string = this.f18004c.getString(str, null);
        if (string != null) {
            if (!string.startsWith("ENCRYPTED:")) {
                return string;
            }
            zzcb zzcbVarA = zzcb.a(this.f18002a, this.f18003b);
            String strSubstring = string.substring(10);
            zzcbVarA.getClass();
            Preconditions.g(strSubstring);
            zzmy zzmyVar = zzcbVarA.f18000b;
            if (zzmyVar != null) {
                try {
                    synchronized (zzmyVar) {
                        str2 = new String(((com.google.android.gms.internal.p002firebaseauthapi.zzbm) zzcbVarA.f18000b.a().g(zzje.a(), com.google.android.gms.internal.p002firebaseauthapi.zzbm.class)).a(Base64.decode(strSubstring, 2), null), StandardCharsets.UTF_8);
                    }
                    return str2;
                } catch (IllegalArgumentException | GeneralSecurityException e8) {
                    e8.getMessage();
                    return null;
                }
            }
        }
        return null;
    }
}
