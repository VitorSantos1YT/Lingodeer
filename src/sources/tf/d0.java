package tf;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lf.j1;
import lf.v0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c0 f52154i = new c0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f52155j = ry.l.m0(new String[]{"ads_management", "create_event", "rsvp_event"});

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile d0 f52156k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f52159c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f52161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52162f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f52164h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f52157a = s.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f52158b = e.FRIENDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f52160d = MzwEyWCkjXL.tEgulHjYqsSwY;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0 f52163g = h0.FACEBOOK;

    static {
        kotlin.jvm.internal.m.e(d0.class.toString(), "LoginManager::class.java.toString()");
    }

    public static Intent a(t tVar) {
        Intent intent = new Intent();
        intent.setClass(re.s.a(), FacebookActivity.class);
        intent.setAction(tVar.f52214a.toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", tVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public static void b(Context context, u uVar, Map map, FacebookException facebookException, boolean z11, t tVar) {
        y yVarD = c0.f52149a.d(context);
        if (yVarD == null) {
            return;
        }
        if (tVar == null) {
            ScheduledExecutorService scheduledExecutorService = y.f52240d;
            if (qf.a.b(y.class)) {
                return;
            }
            try {
                yVarD.a("fb_mobile_login_complete", BuildConfig.VERSION_NAME);
                return;
            } catch (Throwable th2) {
                qf.a.a(y.class, th2);
                return;
            }
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z11 ? "1" : "0");
        String str = tVar.f52218e;
        String str2 = tVar.O ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        ScheduledExecutorService scheduledExecutorService2 = y.f52240d;
        if (qf.a.b(yVarD)) {
            return;
        }
        try {
            Bundle bundleB = c0.b(str);
            if (uVar != null) {
                bundleB.putString("2_result", uVar.a());
            }
            if ((facebookException != null ? facebookException.getMessage() : null) != null) {
                bundleB.putString("5_error_message", facebookException.getMessage());
            }
            JSONObject jSONObject = map2.isEmpty() ? null : new JSONObject(map2);
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleB.putString("6_extras", jSONObject.toString());
            }
            yVarD.f52242b.c(str2, bundleB);
            if (uVar != u.SUCCESS || qf.a.b(yVarD)) {
                return;
            }
            try {
                y.f52240d.schedule(new pb.b(8, yVarD, c0.b(str)), 5L, TimeUnit.SECONDS);
            } catch (Throwable th3) {
                qf.a.a(yVarD, th3);
            }
        } catch (Throwable th4) {
            qf.a.a(yVarD, th4);
        }
    }

    public static void d(Context context, t tVar) {
        y yVarD = c0.f52149a.d(context);
        if (yVarD != null) {
            String str = tVar.O ? "foa_mobile_login_start" : "fb_mobile_login_start";
            if (qf.a.b(yVarD)) {
                return;
            }
            try {
                ScheduledExecutorService scheduledExecutorService = y.f52240d;
                Bundle bundleB = c0.b(tVar.f52218e);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", tVar.f52214a.toString());
                    jSONObject.put("request_code", lf.i.Login.a());
                    jSONObject.put("permissions", TextUtils.join(",", tVar.f52215b));
                    jSONObject.put("default_audience", tVar.f52216c.toString());
                    jSONObject.put("isReauthorize", tVar.f52219f);
                    String str2 = yVarD.f52243c;
                    if (str2 != null) {
                        jSONObject.put("facebookVersion", str2);
                    }
                    h0 h0Var = tVar.N;
                    if (h0Var != null) {
                        jSONObject.put("target_app", h0Var.toString());
                    }
                    bundleB.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                yVarD.f52242b.c(str, bundleB);
            } catch (Throwable th2) {
                qf.a.a(yVarD, th2);
            }
        }
    }

    public final void c() {
        Date date = re.b.N;
        re.f.f49141f.t().c(null, true);
        o00.a.L(null);
        re.k.f49183f.n().a(null, true);
        SharedPreferences.Editor editorEdit = this.f52159c.edit();
        editorEdit.putBoolean("express_login_allowed", false);
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i11, Intent intent, a5.j jVar) {
        u uVar;
        boolean z11;
        FacebookException facebookException;
        re.b bVar;
        re.h hVar;
        Map map;
        t tVar;
        re.b bVar2;
        boolean z12;
        Object obj;
        u uVar2 = u.ERROR;
        f0 f0Var = null;
        if (intent != null) {
            intent.setExtrasClassLoader(v.class.getClassLoader());
            v vVar = (v) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (vVar != null) {
                t tVar2 = vVar.f52226f;
                u uVar3 = vVar.f52221a;
                if (i11 != -1) {
                    if (i11 != 0) {
                        facebookException = null;
                        bVar2 = null;
                        obj = bVar2;
                        z12 = false;
                    } else {
                        z12 = true;
                        facebookException = null;
                        bVar2 = null;
                        obj = null;
                    }
                } else if (uVar3 == u.SUCCESS) {
                    re.b bVar3 = vVar.f52222b;
                    z12 = false;
                    obj = vVar.f52223c;
                    bVar2 = bVar3;
                    facebookException = null;
                } else {
                    facebookException = new FacebookAuthorizationException(vVar.f52224d);
                    bVar2 = null;
                    obj = bVar2;
                    z12 = false;
                }
                tVar = tVar2;
                hVar = obj;
                z11 = z12;
                map = vVar.f52227t;
                bVar = bVar2;
                uVar = uVar3;
            } else {
                uVar = uVar2;
                facebookException = null;
                bVar = null;
                hVar = 0;
                map = null;
                tVar = null;
                z11 = false;
            }
        } else if (i11 == 0) {
            uVar = u.CANCEL;
            z11 = true;
            facebookException = null;
            bVar = null;
            hVar = 0;
            map = null;
            tVar = null;
        } else {
            uVar = uVar2;
            facebookException = null;
            bVar = null;
            hVar = 0;
            map = null;
            tVar = null;
            z11 = false;
        }
        if (facebookException == null && bVar == null && !z11) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        b(null, uVar, map, facebookException2, true, tVar);
        if (bVar != null) {
            Date date = re.b.N;
            re.f.f49141f.t().c(bVar, true);
            re.b bVarX = ns.o.x();
            if (bVarX != null) {
                if (ns.o.F()) {
                    j1.p(bVarX.f49119e, new re.e0(0));
                } else {
                    re.k.f49183f.n().a(null, true);
                }
            }
        }
        if (hVar != 0) {
            o00.a.L(hVar);
        }
        if (jVar != null) {
            if (bVar != null && tVar != null) {
                Set set = tVar.f52215b;
                Set setE1 = ry.m.e1(ry.m.o0(bVar.f49116b));
                if (tVar.f52219f) {
                    setE1.retainAll(set);
                }
                Set setE2 = ry.m.e1(ry.m.o0(set));
                setE2.removeAll(setE1);
                f0Var = new f0(bVar, hVar, setE1, setE2);
            }
            c0 c0Var = f52154i;
            if (z11 || (f0Var != null && f0Var.f52171c.isEmpty())) {
                c0Var.c().c();
                return;
            }
            if (facebookException2 != null) {
                facebookException2.getMessage();
                c0Var.c().c();
            } else {
                if (bVar == null || f0Var == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = this.f52159c.edit();
                editorEdit.putBoolean("express_login_allowed", true);
                editorEdit.apply();
                String str = re.y.f49225j;
                re.y yVar = new re.y(f0Var.f52169a, "me", null, null, new nf.a(new app.rive.runtime.kotlin.core.a(f0Var, (xq.c) jVar.f385b), 2));
                yVar.f49231d = b7.e0.e("fields", "email,name,id,picture");
                yVar.d();
            }
        }
    }

    public final void f(k0 k0Var, t tVar) {
        d(k0Var.n(), tVar);
        p20.c cVar = lf.j.f40039b;
        lf.i iVar = lf.i.Login;
        cVar.r(iVar.a(), new lf.h() { // from class: tf.z
            @Override // lf.h
            public final boolean a(Intent intent, int i11) {
                this.f52244a.e(i11, intent, null);
                return true;
            }
        });
        Intent intentA = a(tVar);
        if (re.s.a().getPackageManager().resolveActivity(intentA, 0) != null) {
            try {
                k0Var.startActivityForResult(intentA, iVar.a());
                return;
            } catch (ActivityNotFoundException unused) {
            }
        }
        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        b(k0Var.n(), u.ERROR, null, facebookException, false, tVar);
        throw facebookException;
    }

    public d0() {
        v0.m();
        SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.loginManager", 0);
        kotlin.jvm.internal.m.e(sharedPreferences, "getApplicationContext().…ER, Context.MODE_PRIVATE)");
        this.f52159c = sharedPreferences;
        if (re.s.m && lf.k.b() != null) {
            d dVar = new d();
            Context contextA = re.s.a();
            dVar.f53449a = contextA.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty("com.android.chrome")) {
                intent.setPackage("com.android.chrome");
            }
            contextA.bindService(intent, dVar, 33);
            Context contextA2 = re.s.a();
            String packageName = re.s.a().getPackageName();
            if (packageName != null) {
                Context applicationContext = contextA2.getApplicationContext();
                v.a aVar = new v.a(applicationContext);
                try {
                    aVar.f53449a = applicationContext.getApplicationContext();
                    Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty(packageName)) {
                        intent2.setPackage(packageName);
                    }
                    applicationContext.bindService(intent2, aVar, 33);
                } catch (SecurityException unused) {
                }
            }
        }
    }
}
