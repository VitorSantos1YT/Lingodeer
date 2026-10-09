package ze;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import nz.n;
import org.json.JSONObject;
import oz.q;
import re.s;
import se.f;
import y.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f59209a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f59210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ye.a f59211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f59212d;

    static {
        m.e(a.class.toString(), "GpsAraTriggersManager::class.java.toString()");
    }

    public final boolean a() {
        if (qf.a.b(this)) {
            return false;
        }
        try {
            if (!f59210b) {
                return false;
            }
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                return true;
            } catch (Error e8) {
                ye.a aVar = f59211c;
                if (aVar == null) {
                    m.n("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e8.toString());
                aVar.a("gps_ara_failed", bundle);
                return false;
            } catch (Exception e10) {
                ye.a aVar2 = f59211c;
                if (aVar2 == null) {
                    m.n("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e10.toString());
                aVar2.a("gps_ara_failed", bundle2);
                return false;
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return false;
        }
    }

    public final String b(f fVar) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = fVar.f51592a;
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> itKeys = jSONObject.keys();
                m.e(itKeys, "params.keys()");
                return n.V(n.X(n.P(itKeys), new p0(jSONObject, 14)), "&");
            }
            return BuildConfig.VERSION_NAME;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final void c(String str, f fVar) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (qf.a.b(this)) {
                return;
            }
            try {
                String eventName = fVar.f51592a.getString("_eventName");
                if (m.a(eventName, "_removed_")) {
                    return;
                }
                m.e(eventName, "eventName");
                if (!q.v0(eventName, "gps", false) && a()) {
                    Context contextA = s.a();
                    try {
                        MeasurementManager measurementManagerD = se.n.d(contextA.getSystemService(se.n.i()));
                        if (measurementManagerD == null) {
                            measurementManagerD = MeasurementManager.get(contextA.getApplicationContext());
                        }
                        if (measurementManagerD == null) {
                            ye.a aVar = f59211c;
                            if (aVar == null) {
                                m.n("gpsDebugLogger");
                                throw null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                            aVar.a("gps_ara_failed", bundle);
                            return;
                        }
                        String strB = b(fVar);
                        StringBuilder sb2 = new StringBuilder();
                        String str2 = f59212d;
                        if (str2 == null) {
                            m.n("serverUri");
                            throw null;
                        }
                        sb2.append(str2);
                        sb2.append("?app_id=");
                        sb2.append(str);
                        sb2.append('&');
                        sb2.append(strB);
                        Uri uri = Uri.parse(sb2.toString());
                        m.e(uri, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                        measurementManagerD.registerTrigger(uri, s.d(), new af.a(1));
                    } catch (Error e8) {
                        ye.a aVar2 = f59211c;
                        if (aVar2 == null) {
                            m.n("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gps_ara_failed_reason", e8.toString());
                        aVar2.a("gps_ara_failed", bundle2);
                    } catch (Exception e10) {
                        ye.a aVar3 = f59211c;
                        if (aVar3 == null) {
                            m.n("gpsDebugLogger");
                            throw null;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("gps_ara_failed_reason", e10.toString());
                        aVar3.a("gps_ara_failed", bundle3);
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    public final void d(String str, f fVar) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            s.d().execute(new gf.a(str, fVar, 1));
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
