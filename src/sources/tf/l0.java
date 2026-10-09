package tf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.p0;
import lf.j1;
import lf.p1;
import lf.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends i0 {
    public static final Parcelable.Creator<l0> CREATOR = new b(9);
    public final re.g H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p1 f52197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f52198f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f52199t;

    public l0(Parcel parcel) {
        super(parcel, 1);
        this.f52199t = "web_view";
        this.H = re.g.WEB_VIEW;
        this.f52198f = parcel.readString();
    }

    @Override // tf.e0
    public final void b() {
        p1 p1Var = this.f52197e;
        if (p1Var != null) {
            if (p1Var != null) {
                p1Var.cancel();
            }
            this.f52197e = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // tf.e0
    public final String e() {
        return this.f52199t;
    }

    @Override // tf.e0
    public final int m(t request) {
        kotlin.jvm.internal.m.f(request, "request");
        Bundle bundleO = o(request);
        qh.z zVar = new qh.z(5, this, request);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.m.e(string, "e2e.toString()");
        this.f52198f = string;
        a("e2e", string);
        p0 p0VarE = d().e();
        if (p0VarE == null) {
            return 0;
        }
        boolean zV = j1.v(p0VarE);
        String applicationId = request.f52217d;
        kotlin.jvm.internal.m.f(applicationId, "applicationId");
        v0.k(applicationId, "applicationId");
        String str = this.f52198f;
        kotlin.jvm.internal.m.d(str, "null cannot be cast to non-null type kotlin.String");
        String str2 = zV ? "fbconnect://chrome_os_success" : "fbconnect://success";
        String authType = request.H;
        kotlin.jvm.internal.m.f(authType, "authType");
        s loginBehavior = request.f52214a;
        kotlin.jvm.internal.m.f(loginBehavior, "loginBehavior");
        h0 targetApp = request.N;
        kotlin.jvm.internal.m.f(targetApp, "targetApp");
        boolean z11 = request.O;
        boolean z12 = request.P;
        bundleO.putString("redirect_uri", str2);
        bundleO.putString("client_id", applicationId);
        bundleO.putString("e2e", str);
        bundleO.putString("response_type", targetApp == h0.INSTAGRAM ? "token,signed_request,graph_domain,granted_scopes" : "token,signed_request,graph_domain");
        bundleO.putString("return_scopes", "true");
        bundleO.putString("auth_type", authType);
        bundleO.putString("login_behavior", loginBehavior.name());
        if (z11) {
            bundleO.putString("fx_app", targetApp.toString());
        }
        if (z12) {
            bundleO.putString("skip_dedupe", "true");
        }
        int i11 = p1.O;
        p1.b(p0VarE);
        this.f52197e = new p1(p0VarE, "oauth", bundleO, targetApp, zVar);
        lf.p pVar = new lf.p();
        pVar.setRetainInstance(true);
        pVar.S = this.f52197e;
        pVar.u(p0VarE.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // tf.i0
    public final re.g p() {
        return this.H;
    }

    @Override // tf.e0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        super.writeToParcel(dest, i11);
        dest.writeString(this.f52198f);
    }

    public l0(w wVar) {
        this.f52166b = wVar;
        this.f52199t = "web_view";
        this.H = re.g.WEB_VIEW;
    }
}
