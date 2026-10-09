package ef;

import android.content.Context;
import android.os.Build;
import fr.p3;
import i0.pKy.shrCcjmOhAmRC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lf.a0;
import lf.j1;
import lf.y0;
import org.json.JSONException;
import org.json.JSONObject;
import re.d0;
import re.i0;
import re.s;
import ry.x;
import se.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f25512a = x.V(new qy.l(f.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new qy.l(f.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    public static final JSONObject a(f activityType, lf.d dVar, String str, boolean z11, Context context) throws JSONException {
        String strC;
        kotlin.jvm.internal.m.f(activityType, "activityType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f25512a.get(activityType));
        if (!se.d.f51586c) {
            se.d.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = se.d.f51584a;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = se.d.f51585b;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            lf.x xVar = lf.x.ServiceUpdateCompliance;
            if (!a0.b(xVar)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z11);
            s sVar = s.f49201a;
            jSONObject.put("advertiser_id_collection_enabled", i0.b());
            String string = null;
            if (dVar != null) {
                if (a0.b(xVar) && (Build.VERSION.SDK_INT < 31 || !j1.x(context) || !dVar.f39989e)) {
                    jSONObject.put("anon_id", str);
                }
                if (dVar.f39987c != null && (!a0.b(xVar) || Build.VERSION.SDK_INT < 31 || !j1.x(context) || !dVar.f39989e)) {
                    jSONObject.put("attribution", dVar.f39987c);
                }
                if (dVar.a() != null) {
                    jSONObject.put("advertiser_id", dVar.a());
                    jSONObject.put("advertiser_tracking_enabled", !dVar.f39989e);
                }
                if (!dVar.f39989e) {
                    z zVar = z.f51623a;
                    if (qf.a.b(z.class)) {
                        strC = null;
                    } else {
                        try {
                            if (!z.f51625c.get()) {
                                zVar.b();
                            }
                            HashMap map = new HashMap();
                            map.putAll(z.f51626d);
                            map.putAll(zVar.a());
                            strC = j1.C(map);
                        } catch (Throwable th2) {
                            qf.a.a(z.class, th2);
                            strC = null;
                        }
                    }
                    if (strC.length() != 0) {
                        jSONObject.put("ud", strC);
                    }
                }
                String str3 = dVar.f39988d;
                if (str3 != null) {
                    jSONObject.put("installer_package", str3);
                }
            }
            i iVarA = i.f25514b.a();
            if (iVarA != null && !qf.a.b(iVarA)) {
                try {
                    string = iVarA.a().getString("campaign_ids", null);
                } catch (Throwable th3) {
                    qf.a.a(iVarA, th3);
                }
            }
            if (string != null) {
                jSONObject.put("campaign_ids", string);
            }
            try {
                j1.J(jSONObject, context);
            } catch (Exception e8) {
                p3 p3Var = y0.f40132d;
                p3.s(d0.APP_EVENTS, shrCcjmOhAmRC.bkTF, "Fetching extended device info parameters failed: '%s'", e8.toString());
            }
            JSONObject jSONObjectO = j1.o();
            if (jSONObjectO != null) {
                Iterator<String> itKeys = jSONObjectO.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectO.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th4) {
            se.d.f51584a.readLock().unlock();
            throw th4;
        }
    }
}
