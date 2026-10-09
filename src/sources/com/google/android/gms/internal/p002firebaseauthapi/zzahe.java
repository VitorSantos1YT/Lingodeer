package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzahe implements zzael<zzahe> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzah f9964b;

    public final String a(String str) {
        Preconditions.d(str);
        zzah zzahVar = this.f9964b;
        if (zzahVar == null || zzahVar.isEmpty()) {
            return null;
        }
        zzah zzahVar2 = this.f9964b;
        int i11 = ((zzas) zzahVar2).f10244d;
        int i12 = 0;
        while (i12 < i11) {
            Object obj = ((zzas) zzahVar2).get(i12);
            i12++;
            zzahl zzahlVar = (zzahl) obj;
            String strA = zzahlVar.a();
            String strB = zzahlVar.b();
            if (strA != null && strB != null && strB.equals(str)) {
                return zzahlVar.a();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        zzah zzahVarC;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9963a = Strings.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzaz zzazVar = zzah.f9955b;
                    zzahVarC = zzas.f10242e;
                } else {
                    zzaz zzazVar2 = zzah.f9955b;
                    zzak zzakVar = new zzak();
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                        zzakVar.b(jSONObject2 == null ? new zzafx(null, null) : new zzafx(Strings.a(jSONObject2.optString("provider")), Strings.a(jSONObject2.optString("enforcementState"))));
                    }
                    zzahVarC = zzakVar.c();
                }
                this.f9964b = zzahVarC;
            }
            return this;
        } catch (NullPointerException e8) {
            e = e8;
            throw zzaiv.a(e, "zzahe", str);
        } catch (JSONException e10) {
            e = e10;
            throw zzaiv.a(e, "zzahe", str);
        }
    }
}
