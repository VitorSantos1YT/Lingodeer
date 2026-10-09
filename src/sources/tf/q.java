package tf;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Set;
import lf.b1;
import lf.c1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends i0 {
    public static final Parcelable.Creator<q> CREATOR = new b(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f52211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re.g f52212f;

    public q(w wVar) {
        super(wVar);
        this.f52211e = "instagram_login";
        this.f52212f = re.g.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // tf.e0
    public final String e() {
        return this.f52211e;
    }

    @Override // tf.e0
    public final int m(t request) {
        Object obj;
        kotlin.jvm.internal.m.f(request, "request");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.m.e(string, "e2e.toString()");
        Context contextE = d().e();
        if (contextE == null) {
            contextE = re.s.a();
        }
        String applicationId = request.f52217d;
        Set permissions = request.f52215b;
        boolean zA = request.a();
        e eVar = request.f52216c;
        if (eVar == null) {
            eVar = e.NONE;
        }
        e defaultAudience = eVar;
        String strC = c(request.f52218e);
        String authType = request.H;
        String str = request.L;
        boolean z11 = request.M;
        boolean z12 = request.O;
        boolean z13 = request.P;
        c1 c1Var = c1.f39979a;
        Intent intentR = null;
        if (!qf.a.b(c1.class)) {
            try {
                kotlin.jvm.internal.m.f(applicationId, "applicationId");
                kotlin.jvm.internal.m.f(permissions, "permissions");
                kotlin.jvm.internal.m.f(defaultAudience, "defaultAudience");
                kotlin.jvm.internal.m.f(authType, "authType");
                try {
                    obj = c1.class;
                    try {
                        intentR = c1.r(contextE, c1.f39979a.d(new b1(1), applicationId, permissions, string, zA, defaultAudience, strC, authType, false, str, z11, h0.INSTAGRAM, z12, z13, BuildConfig.VERSION_NAME));
                    } catch (Throwable th2) {
                        th = th2;
                        qf.a.a(obj, th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = c1.class;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = c1.class;
            }
        }
        Intent intent = intentR;
        a("e2e", string);
        lf.i.Login.a();
        return t(intent) ? 1 : 0;
    }

    @Override // tf.i0
    public final re.g p() {
        return this.f52212f;
    }

    @Override // tf.e0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        super.writeToParcel(dest, i11);
    }

    public q(Parcel parcel) {
        super(parcel, 0);
        this.f52211e = "instagram_login";
        this.f52212f = re.g.INSTAGRAM_APPLICATION_WEB;
    }
}
