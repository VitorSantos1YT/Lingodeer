package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zzao;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzagt implements zzael<zzagt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzagv f9939a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        zzagv zzagvVar;
        zzagw zzagwVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzagvVar = new zzagv(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z11 = false;
                    int i11 = 0;
                    while (i11 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzagwVar = new zzagw();
                        } else {
                            String strA = Strings.a(jSONObject2.optString("localId", null));
                            String strA2 = Strings.a(jSONObject2.optString("email", null));
                            boolean zOptBoolean = jSONObject2.optBoolean("emailVerified", z11);
                            String strA3 = Strings.a(jSONObject2.optString("displayName", null));
                            String strA4 = Strings.a(jSONObject2.optString("photoUrl", null));
                            zzahm zzahmVarA = zzahm.a(jSONObject2.optJSONArray("providerUserInfo"));
                            Strings.a(jSONObject2.optString("rawPassword", null));
                            zzagwVar = new zzagw(strA, strA2, zOptBoolean, strA3, strA4, zzahmVarA, Strings.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), zzahk.b(jSONObject2.optJSONArray("mfaInfo")), zzao.D1(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzagwVar);
                        i11++;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        z11 = false;
                    }
                    zzagvVar = new zzagv(arrayList);
                }
            } else {
                zzagvVar = new zzagv();
            }
            this.f9939a = zzagvVar;
            return this;
        } catch (NullPointerException e8) {
            e = e8;
            throw zzaiv.a(e, "zzagt", str);
        } catch (JSONException e10) {
            e = e10;
            throw zzaiv.a(e, "zzagt", str);
        }
    }
}
