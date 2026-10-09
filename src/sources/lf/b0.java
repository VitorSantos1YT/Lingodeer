package lf;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39966a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f39967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f39969d;

    public /* synthetic */ b0(Context context, String str, String str2) {
        this.f39967b = context;
        this.f39968c = str;
        this.f39969d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        int i11 = this.f39966a;
        String str = this.f39969d;
        String applicationId = this.f39968c;
        Context context = this.f39967b;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(applicationId, "$applicationId");
                JSONObject jSONObjectA = c0.a();
                if (jSONObjectA.length() != 0) {
                    c0.d(jSONObjectA, applicationId);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, jSONObjectA.toString()).apply();
                    c0.f39977d = Long.valueOf(System.currentTimeMillis());
                }
                c0.e();
                c0.f39974a.set(false);
                return;
            default:
                h0 h0Var = h0.f40029a;
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                e0 e0VarE = null;
                String string = sharedPreferences.getString(applicationId, null);
                if (!j1.y(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException unused) {
                        re.s sVar = re.s.f49201a;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        e0VarE = h0.e(jSONObject, str);
                    }
                    break;
                }
                JSONObject jSONObjectA2 = h0.a();
                h0.e(jSONObjectA2, str);
                sharedPreferences.edit().putString(applicationId, jSONObjectA2.toString()).apply();
                if (e0VarE != null) {
                    String str2 = e0VarE.f40008l;
                    if (!h0.f40034f && str2.length() > 0) {
                        h0.f40034f = true;
                    }
                }
                JSONObject jSONObjectA3 = c0.a();
                re.s.a().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1)), jSONObjectA3.toString()).apply();
                c0.d(jSONObjectA3, str);
                o20.i iVar = ef.k.f25521a;
                Context contextA = re.s.a();
                String strB = re.s.b();
                if (re.i0.c() && (contextA instanceof Application)) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
                    re.g0.e((Application) contextA, strB);
                }
                h0.f40032d.set(h0.f40031c.containsKey(str) ? g0.SUCCESS : g0.ERROR);
                h0Var.j();
                return;
        }
    }

    public /* synthetic */ b0(String str, Context context, String str2) {
        this.f39968c = str;
        this.f39967b = context;
        this.f39969d = str2;
    }
}
