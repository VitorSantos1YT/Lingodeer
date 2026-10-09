package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.text.ParseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzaih f9980e;

    public zzahk(String str, String str2, String str3, long j11, zzaih zzaihVar) {
        if (!TextUtils.isEmpty(str) && zzaihVar != null) {
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.f9976a = str;
        Preconditions.d(str2);
        this.f9977b = str2;
        this.f9978c = str3;
        this.f9979d = j11;
        this.f9980e = zzaihVar;
    }

    public static zzahk a(JSONObject jSONObject) {
        long jY;
        String strA = Strings.a(jSONObject.optString("phoneInfo"));
        String strA2 = Strings.a(jSONObject.optString("mfaEnrollmentId"));
        String strA3 = Strings.a(jSONObject.optString("displayName"));
        try {
            zzand zzandVarA = zzanz.a(jSONObject.optString("enrolledAt", BuildConfig.VERSION_NAME));
            zzanz.b(zzandVarA);
            jY = zzandVarA.y();
        } catch (ParseException unused) {
            jY = 0;
        }
        zzahk zzahkVar = new zzahk(strA, strA2, strA3, jY, jSONObject.opt("totpInfo") != null ? new zzaih() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahkVar;
    }

    public static ArrayList b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(a(jSONArray.getJSONObject(i11)));
        }
        return arrayList;
    }
}
