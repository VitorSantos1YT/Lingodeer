package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzail implements zzael<zzail> {
    public boolean H;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public ArrayList Q;
    public String R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10022f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f10023t;

    public final zzc a() {
        if (TextUtils.isEmpty(this.K) && TextUtils.isEmpty(this.L)) {
            return null;
        }
        String str = this.f10022f;
        String str2 = this.L;
        String str3 = this.K;
        String str4 = this.O;
        String str5 = this.M;
        Parcelable.Creator<zzc> creator = zzc.CREATOR;
        Preconditions.e(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zzc(str, str2, str3, null, str4, str5, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f10017a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f10018b = Strings.a(jSONObject.optString("idToken", null));
            this.f10019c = Strings.a(jSONObject.optString("refreshToken", null));
            this.f10020d = jSONObject.optLong("expiresIn", 0L);
            Strings.a(jSONObject.optString("localId", null));
            this.f10021e = Strings.a(jSONObject.optString("email", null));
            Strings.a(jSONObject.optString("displayName", null));
            Strings.a(jSONObject.optString("photoUrl", null));
            this.f10022f = Strings.a(jSONObject.optString("providerId", null));
            this.f10023t = Strings.a(jSONObject.optString("rawUserInfo", null));
            this.H = jSONObject.optBoolean("isNewUser", false);
            this.K = jSONObject.optString("oauthAccessToken", null);
            this.L = jSONObject.optString("oauthIdToken", null);
            this.N = Strings.a(jSONObject.optString("errorMessage", null));
            this.O = Strings.a(jSONObject.optString("pendingToken", null));
            this.P = Strings.a(jSONObject.optString("tenantId", null));
            this.Q = zzahk.b(jSONObject.optJSONArray("mfaInfo"));
            this.R = Strings.a(jSONObject.optString("mfaPendingCredential", null));
            this.M = Strings.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzail", str);
        }
    }
}
