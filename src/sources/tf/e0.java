package tf;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import lf.j1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f52165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f52166b;

    public e0(Parcel parcel) {
        HashMap map;
        int i11 = parcel.readInt();
        if (i11 < 0) {
            map = null;
        } else {
            map = new HashMap();
            for (int i12 = 0; i12 < i11; i12++) {
                map.put(parcel.readString(), parcel.readString());
            }
        }
        this.f52165a = map != null ? ry.x.k0(map) : null;
    }

    public final void a(String str, String str2) {
        if (this.f52165a == null) {
            this.f52165a = new HashMap();
        }
        HashMap map = this.f52165a;
        if (map != null) {
        }
    }

    public final String c(String authId) {
        kotlin.jvm.internal.m.f(authId, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", authId);
            jSONObject.put("3_method", e());
            l(jSONObject);
        } catch (JSONException e8) {
            e8.getMessage();
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.m.e(string, "param.toString()");
        return string;
    }

    public final w d() {
        w wVar = this.f52166b;
        if (wVar != null) {
            return wVar;
        }
        kotlin.jvm.internal.m.n("loginClient");
        throw null;
    }

    public abstract String e();

    public String g() {
        return "fb" + re.s.b() + "://authorize/";
    }

    public final void i(String str) {
        String strB;
        t tVar = d().f52234t;
        if (tVar == null || (strB = tVar.f52217d) == null) {
            strB = re.s.b();
        }
        se.m mVar = new se.m(d().e(), strB);
        Bundle bundleE = b7.e0.e("fb_web_login_e2e", str);
        bundleE.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundleE.putString("app_id", strB);
        re.s sVar = re.s.f49201a;
        if (re.i0.c()) {
            mVar.g("fb_dialogs_web_login_dialog_complete", bundleE);
        }
    }

    public boolean j(int i11, int i12, Intent intent) {
        return false;
    }

    public final void k(t tVar, Bundle bundle) {
        String string = bundle.getString("code");
        if (j1.y(string)) {
            throw new FacebookException("No code param found from the request");
        }
        if (string == null) {
            throw new FacebookException("Failed to create code exchange request");
        }
        String redirectUri = g();
        String str = tVar.R;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        kotlin.jvm.internal.m.f(redirectUri, "redirectUri");
        Bundle bundle2 = new Bundle();
        bundle2.putString("code", string);
        bundle2.putString("client_id", re.s.b());
        bundle2.putString("redirect_uri", redirectUri);
        bundle2.putString("code_verifier", str);
        String str2 = re.y.f49225j;
        re.y yVarB = re.v.B(null, "oauth/access_token", null);
        yVarB.k(re.c0.GET);
        yVarB.f49231d = bundle2;
        re.b0 b0VarC = yVarB.c();
        re.r rVar = b0VarC.f49125c;
        if (rVar != null) {
            throw new FacebookServiceException(rVar, rVar.a());
        }
        try {
            JSONObject jSONObject = b0VarC.f49124b;
            String string2 = jSONObject != null ? jSONObject.getString("access_token") : null;
            if (jSONObject == null || j1.y(string2)) {
                throw new FacebookException("No access token found from result");
            }
            bundle.putString("access_token", string2);
            if (jSONObject.has("id_token")) {
                bundle.putString("id_token", jSONObject.getString("id_token"));
            }
        } catch (JSONException e8) {
            throw new FacebookException("Fail to process code exchange response: " + e8.getMessage());
        }
    }

    public abstract int m(t tVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        HashMap map = this.f52165a;
        if (map == null) {
            dest.writeInt(-1);
            return;
        }
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            dest.writeString(str);
            dest.writeString(str2);
        }
    }

    public void b() {
    }

    public void l(JSONObject jSONObject) {
    }
}
