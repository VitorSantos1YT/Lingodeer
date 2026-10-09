package jf;

import android.content.SharedPreferences;
import android.view.View;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import lf.j1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import re.s;
import ry.x;
import we.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f36317c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f36315a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f36316b = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f36318d = new AtomicBoolean(false);

    public static final void a(String str, String predictedEvent) {
        if (qf.a.b(b.class)) {
            return;
        }
        try {
            m.f(predictedEvent, "predictedEvent");
            if (!f36318d.get()) {
                f36315a.c();
            }
            LinkedHashMap linkedHashMap = f36316b;
            linkedHashMap.put(str, predictedEvent);
            SharedPreferences sharedPreferences = f36317c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", j1.C(x.h0(linkedHashMap))).apply();
            } else {
                m.n("shardPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            qf.a.a(b.class, th2);
        }
    }

    public static final String b(View view, String text) {
        if (qf.a.b(b.class)) {
            return null;
        }
        try {
            m.f(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = h.h(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return j1.K(jSONObject.toString());
        } catch (Throwable th2) {
            qf.a.a(b.class, th2);
            return null;
        }
    }

    public final void c() {
        String str = BuildConfig.VERSION_NAME;
        if (qf.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f36318d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = s.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            m.e(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            f36317c = sharedPreferences;
            LinkedHashMap linkedHashMap = f36316b;
            String string = sharedPreferences.getString(xTCJ.YjGIbvqOGD, BuildConfig.VERSION_NAME);
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(j1.B(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
