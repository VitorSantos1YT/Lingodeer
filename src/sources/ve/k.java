package ve;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import lf.y0;
import org.json.JSONException;
import org.json.JSONObject;
import re.b0;
import re.d0;
import re.s;
import re.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f54009e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f54011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Timer f54012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f54013d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f54010a = new Handler(Looper.getMainLooper());

    static {
        String canonicalName = k.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = BuildConfig.VERSION_NAME;
        }
        f54009e = canonicalName;
    }

    public k(Activity activity) {
        this.f54011b = new WeakReference(activity);
    }

    public static final /* synthetic */ String a() {
        if (qf.a.b(k.class)) {
            return null;
        }
        try {
            return f54009e;
        } catch (Throwable th2) {
            qf.a.a(k.class, th2);
            return null;
        }
    }

    public final void b(y yVar, String str) {
        if (qf.a.b(this) || yVar == null) {
            return;
        }
        try {
            b0 b0VarC = yVar.c();
            try {
                JSONObject jSONObject = b0VarC.f49124b;
                if (jSONObject == null) {
                    Objects.toString(b0VarC.f49125c);
                    return;
                }
                if ("true".equals(jSONObject.optString("success"))) {
                    p3 p3Var = y0.f40132d;
                    p3.r(d0.APP_EVENTS, f54009e, "Successfully send UI component tree to server");
                    this.f54013d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z11 = jSONObject.getBoolean("is_app_indexing_enabled");
                    if (qf.a.b(d.class)) {
                        return;
                    }
                    try {
                        d.f53985g.set(z11);
                    } catch (Throwable th2) {
                        qf.a.a(d.class, th2);
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    public final void c() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            try {
                s.d().execute(new pb.b(20, this, new j(this)));
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
