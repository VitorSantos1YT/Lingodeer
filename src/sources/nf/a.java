package nf;

import bp.y1;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ff.h;
import j4.i;
import java.util.ArrayList;
import l.m;
import org.json.JSONException;
import org.json.JSONObject;
import re.b0;
import re.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43762b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f43761a = i11;
        this.f43762b = obj;
    }

    @Override // re.u
    public final void a(b0 b0Var) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        JSONObject jSONObject2;
        switch (this.f43761a) {
            case 0:
                e eVar = (e) this.f43762b;
                try {
                    if (b0Var.f49125c == null && (jSONObject = b0Var.f49126d) != null && jSONObject.getBoolean("success")) {
                        ob.f.j(eVar.f43765a);
                        break;
                    }
                } catch (JSONException unused) {
                    return;
                }
                break;
            case 1:
                i iVar = (i) this.f43762b;
                JSONObject jSONObject3 = b0Var.f49126d;
                if (jSONObject3 != null) {
                    iVar.f35910c = jSONObject3.optString("access_token");
                    iVar.f35908a = jSONObject3.optInt("expires_at");
                    iVar.f35909b = jSONObject3.optInt("expires_in");
                    iVar.f35911d = Long.valueOf(jSONObject3.optLong("data_access_expiration_time"));
                    iVar.f35912e = jSONObject3.optString("graph_domain", null);
                    break;
                }
                break;
            case 2:
                app.rive.runtime.kotlin.core.a aVar = (app.rive.runtime.kotlin.core.a) this.f43762b;
                if (aVar != null) {
                    JSONObject jSONObject4 = b0Var.f49124b;
                    xq.c cVar = (xq.c) aVar.f2823b;
                    if (jSONObject4 == null) {
                        String string = ((m) cVar.f56174b).getString(R.string.cant_acquire_facebook_login_account);
                        kotlin.jvm.internal.m.e(string, "getString(...)");
                        h.C(string);
                    } else {
                        jSONObject4.toString();
                        String strOptString2 = jSONObject4.optString("email", BuildConfig.VERSION_NAME);
                        String strOptString3 = jSONObject4.optString("id", BuildConfig.VERSION_NAME);
                        JSONObject jSONObjectOptJSONObject2 = jSONObject4.optJSONObject("picture");
                        String str = (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("data")) == null || (strOptString = jSONObjectOptJSONObject.optString("url")) == null) ? BuildConfig.VERSION_NAME : strOptString;
                        y1 y1Var = (y1) cVar.f56175c;
                        kotlin.jvm.internal.m.c(strOptString3);
                        String strOptString4 = jSONObject4.optString("name");
                        kotlin.jvm.internal.m.e(strOptString4, "optString(...)");
                        y1Var.i(strOptString3, strOptString4, "fb", strOptString2, str);
                    }
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f43762b;
                try {
                    if (b0Var.f49125c == null && (jSONObject2 = b0Var.f49126d) != null && jSONObject2.getBoolean("success")) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ob.f.j(((rf.a) obj).f49239a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
