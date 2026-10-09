package jf;

import android.app.Activity;
import ff.g;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import lf.e0;
import lf.h0;
import org.json.JSONArray;
import org.json.JSONObject;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f36321a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f36322b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f36323c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f36324d = new LinkedHashSet();

    public static final synchronized void a() {
        if (qf.a.b(d.class)) {
            return;
        }
        try {
            s.d().execute(new cf.c(9));
        } catch (Throwable th2) {
            qf.a.a(d.class, th2);
        }
    }

    public static final void d(Activity activity) {
        if (qf.a.b(d.class)) {
            return;
        }
        try {
            if (f36322b.get()) {
                boolean z11 = false;
                if (!qf.a.b(a.class)) {
                    try {
                        z11 = a.f36314f;
                    } catch (Throwable th2) {
                        qf.a.a(a.class, th2);
                    }
                }
                if (z11) {
                    if (f36323c.isEmpty()) {
                        if (!f36324d.isEmpty()) {
                        }
                    }
                    HashMap map = e.f36325d;
                    ew.a.H(activity);
                    return;
                }
            }
            HashMap map2 = e.f36325d;
            ew.a.I(activity);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            qf.a.a(d.class, th3);
        }
    }

    public final void b() {
        String str;
        if (qf.a.b(this)) {
            return;
        }
        try {
            e0 e0VarK = h0.k(s.b(), false);
            if (e0VarK != null && (str = e0VarK.f40009n) != null) {
                c(str);
                if (f36323c.isEmpty() && f36324d.isEmpty()) {
                    return;
                }
                File fileD = g.d(ff.d.MTML_APP_EVENT_PREDICTION);
                if (fileD == null) {
                    return;
                }
                a.f(fileD);
                WeakReference weakReference = ef.d.f25511l;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if (activity != null) {
                    d(activity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void c(String str) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    LinkedHashSet linkedHashSet = f36323c;
                    String string = jSONArray.getString(i11);
                    m.e(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    LinkedHashSet linkedHashSet2 = f36324d;
                    String string2 = jSONArray2.getString(i12);
                    m.e(string2, "jsonArray.getString(i)");
                    linkedHashSet2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
