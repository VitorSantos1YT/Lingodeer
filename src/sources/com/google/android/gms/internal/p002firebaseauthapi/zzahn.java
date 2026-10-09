package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzahn implements zzael<zzahn> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzahk f9985d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final zzael zza(String str) throws zzabz {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f9982a = Strings.a(jSONObject.optString("email"));
            this.f9983b = Strings.a(jSONObject.optString("newEmail"));
            int iOptInt = jSONObject.optInt("reqType");
            String str3 = null;
            if (iOptInt != 1) {
                switch (iOptInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.f9984c = str2;
            if (TextUtils.isEmpty(str2)) {
                String strOptString = jSONObject.optString("requestType");
                switch (strOptString.hashCode()) {
                    case -1874510116:
                        if (strOptString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            str3 = strOptString;
                        }
                        break;
                    case -1452371317:
                        if (strOptString.equals("PASSWORD_RESET")) {
                            str3 = strOptString;
                        }
                        break;
                    case -1341836234:
                        if (strOptString.equals("VERIFY_EMAIL")) {
                            str3 = strOptString;
                        }
                        break;
                    case -1099157829:
                        if (strOptString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            str3 = strOptString;
                        }
                        break;
                    case 870738373:
                        if (strOptString.equals("EMAIL_SIGNIN")) {
                            str3 = strOptString;
                        }
                        break;
                    case 970484929:
                        if (strOptString.equals("RECOVER_EMAIL")) {
                            str3 = strOptString;
                        }
                        break;
                }
                this.f9984c = str3;
            }
            if (jSONObject.has("mfaInfo")) {
                this.f9985d = zzahk.a(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException e8) {
            e = e8;
            throw zzaiv.a(e, "zzahn", str);
        } catch (JSONException e10) {
            e = e10;
            throw zzaiv.a(e, "zzahn", str);
        }
    }
}
