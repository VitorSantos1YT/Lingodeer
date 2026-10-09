package tf;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;
import lf.b1;
import lf.c1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends i0 {
    public static final Parcelable.Creator<r> CREATOR = new b(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f52213e;

    public r(w wVar) {
        super(wVar);
        this.f52213e = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // tf.e0
    public final String e() {
        return this.f52213e;
    }

    @Override // tf.e0
    public final int m(t request) {
        kotlin.jvm.internal.m.f(request, "request");
        boolean z11 = re.s.f49213n && lf.k.b() != null && request.f52214a.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.m.e(string, "e2e.toString()");
        d().e();
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
        boolean z12 = request.M;
        boolean z13 = request.O;
        boolean z14 = request.P;
        String str2 = request.Q;
        a aVar = request.T;
        if (aVar != null) {
            aVar.name();
        }
        c1 c1Var = c1.f39979a;
        ArrayList<Intent> arrayList = null;
        if (!qf.a.b(c1.class)) {
            try {
                kotlin.jvm.internal.m.f(applicationId, "applicationId");
                kotlin.jvm.internal.m.f(permissions, "permissions");
                kotlin.jvm.internal.m.f(defaultAudience, "defaultAudience");
                kotlin.jvm.internal.m.f(authType, "authType");
                ArrayList arrayList2 = c1.f39980b;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    boolean z15 = z13;
                    boolean z16 = z14;
                    Intent intentD = c1.f39979a.d((b1) obj, applicationId, permissions, string, zA, defaultAudience, strC, authType, z11, str, z12, h0.FACEBOOK, z15, z16, str2);
                    if (intentD != null) {
                        arrayList3.add(intentD);
                    }
                    z13 = z15;
                    z14 = z16;
                }
                arrayList = arrayList3;
            } catch (Throwable th2) {
                qf.a.a(c1.class, th2);
            }
        }
        a("e2e", string);
        int i12 = 0;
        for (Intent intent : arrayList) {
            i12++;
            lf.i.Login.a();
            if (t(intent)) {
                return i12;
            }
        }
        return 0;
    }

    public r(Parcel parcel) {
        super(parcel, 0);
        this.f52213e = "katana_proxy_auth";
    }
}
