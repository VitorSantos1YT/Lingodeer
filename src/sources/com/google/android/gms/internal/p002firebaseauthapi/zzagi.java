package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzagi implements zzael<zzagi> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f9931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9932f;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString("email", null);
            this.f9927a = jSONObject.optString("idToken", null);
            this.f9928b = jSONObject.optString("refreshToken", null);
            this.f9929c = jSONObject.optBoolean(ualZoVVCQs.ywL, false);
            this.f9930d = jSONObject.optLong("expiresIn", 0L);
            this.f9931e = zzahk.b(jSONObject.optJSONArray("mfaInfo"));
            this.f9932f = jSONObject.optString(xTCJ.GdBkZfBljfIrHHZ, null);
            return this;
        } catch (NullPointerException | JSONException e8) {
            throw zzaiv.a(e8, "zzagi", str);
        }
    }
}
