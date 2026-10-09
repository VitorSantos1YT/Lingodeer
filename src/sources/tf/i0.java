package tf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.fragment.app.p0;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import lf.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f52187d;

    public /* synthetic */ i0() {
        this.f52186c = 1;
    }

    @Override // tf.e0
    public boolean j(int i11, int i12, Intent intent) {
        String string;
        String string2;
        Object obj;
        switch (this.f52186c) {
            case 0:
                t tVar = d().f52234t;
                if (intent == null) {
                    n(new v(tVar, u.CANCEL, null, "Operation canceled", null));
                    return true;
                }
                String string3 = null;
                if (i12 == 0) {
                    Bundle extras = intent.getExtras();
                    if (extras == null || (string = extras.getString("error")) == null) {
                        string = extras != null ? extras.getString("error_type") : null;
                    }
                    String string4 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
                    if (!"CONNECTION_FAILURE".equals(string4)) {
                        n(new v(tVar, u.CANCEL, null, string, null));
                        return true;
                    }
                    if (extras != null && (string2 = extras.getString("error_message")) != null) {
                        string3 = string2;
                    } else if (extras != null) {
                        string3 = extras.getString("error_description");
                    }
                    ArrayList arrayList = new ArrayList();
                    if (string != null) {
                        arrayList.add(string);
                    }
                    if (string3 != null) {
                        arrayList.add(string3);
                    }
                    n(new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList), string4));
                    return true;
                }
                if (i12 != -1) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("Unexpected resultCode from authorization.");
                    n(new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList2), null));
                    return true;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add("Unexpected null from returned authorization data.");
                    n(new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList3), null));
                    return true;
                }
                String string5 = extras2.getString("error");
                if (string5 == null) {
                    string5 = extras2.getString("error_type");
                }
                Object obj2 = extras2.get("error_code");
                string3 = obj2 != null ? obj2.toString() : null;
                String string6 = extras2.getString("error_message");
                if (string6 == null) {
                    string6 = extras2.getString("error_description");
                }
                String string7 = extras2.getString("e2e");
                if (!j1.y(string7)) {
                    i(string7);
                }
                if (string5 != null || string3 != null || string6 != null || tVar == null) {
                    q(tVar, string5, string6, string3);
                    return true;
                }
                if (!extras2.containsKey("code") || j1.y(extras2.getString("code"))) {
                    r(tVar, extras2);
                    return true;
                }
                re.s.d().execute(new androidx.fragment.app.d(this, tVar, extras2, 17));
                return true;
            default:
                return super.j(i11, i12, intent);
        }
    }

    public void n(v vVar) {
        if (vVar != null) {
            d().d(vVar);
        } else {
            d().l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    public Bundle o(t request) {
        p0 p0VarE;
        kotlin.jvm.internal.m.f(request, "request");
        Bundle bundle = new Bundle();
        Set set = request.f52215b;
        if (set != null && !set.isEmpty()) {
            String strJoin = TextUtils.join(",", request.f52215b);
            bundle.putString("scope", strJoin);
            a("scope", strJoin);
        }
        e eVar = request.f52216c;
        if (eVar == null) {
            eVar = e.NONE;
        }
        bundle.putString("default_audience", eVar.a());
        bundle.putString("state", c(request.f52218e));
        Date date = re.b.N;
        re.b bVarX = ns.o.x();
        String str = bVarX != null ? bVarX.f49119e : null;
        if (str == null) {
            p0VarE = d().e();
            if (p0VarE != null) {
                j1.c(p0VarE);
            }
            a("access_token", "0");
        } else {
            Context contextE = d().e();
            if (contextE == null) {
                contextE = re.s.a();
            }
            if (str.equals(contextE.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", BuildConfig.VERSION_NAME))) {
                bundle.putString("access_token", str);
                a("access_token", "1");
            } else {
                p0VarE = d().e();
                if (p0VarE != null) {
                    j1.c(p0VarE);
                }
                a("access_token", "0");
            }
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        re.s sVar = re.s.f49201a;
        bundle.putString("ies", re.i0.c() ? "1" : "0");
        return bundle;
    }

    public re.g p() {
        return (re.g) this.f52187d;
    }

    public void q(t tVar, String str, String str2, String str3) {
        if (str != null && str.equals("logged_out")) {
            c.L = true;
            n(null);
            return;
        }
        if (ry.m.i0(ns.o.L("service_disabled", "AndroidAuthKillSwitchException"), str)) {
            n(null);
            return;
        }
        if (ry.m.i0(ns.o.L("access_denied", "OAuthAccessDeniedException"), str)) {
            n(new v(tVar, u.CANCEL, null, null, null));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        n(new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList), str3));
    }

    public void r(t tVar, Bundle bundle) {
        try {
            n(new v(tVar, u.SUCCESS, md.a.g(tVar.f52215b, bundle, p(), tVar.f52217d), md.a.i(tVar.Q, bundle), null, null));
        } catch (FacebookException e8) {
            String message = e8.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            n(new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList), null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    public void s(t request, Bundle bundle, FacebookException facebookException) {
        v vVar;
        v vVar2;
        kotlin.jvm.internal.m.f(request, "request");
        w wVarD = d();
        String strValueOf = null;
        this.f52187d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f52187d = bundle.getString("e2e");
            }
            try {
                re.b bVarG = md.a.g(request.f52215b, bundle, p(), request.f52217d);
                vVar2 = new v(wVarD.f52234t, u.SUCCESS, bVarG, md.a.i(request.Q, bundle), null, null);
                if (wVarD.e() != null) {
                    try {
                        CookieSyncManager.createInstance(wVarD.e()).sync();
                    } catch (Exception unused) {
                    }
                    if (bVarG != null) {
                        String str = bVarG.f49119e;
                        Context contextE = d().e();
                        if (contextE == null) {
                            contextE = re.s.a();
                        }
                        contextE.getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
                    }
                }
            } catch (FacebookException e8) {
                t tVar = wVarD.f52234t;
                String message = e8.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                vVar = new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList), null);
                vVar2 = vVar;
            }
            if (!j1.y((String) this.f52187d)) {
                i((String) this.f52187d);
            }
            wVarD.d(vVar2);
        }
        if (facebookException instanceof FacebookOperationCanceledException) {
            vVar = new v(wVarD.f52234t, u.CANCEL, null, "User canceled log in.", null);
        } else {
            this.f52187d = null;
            String message2 = facebookException != null ? facebookException.getMessage() : null;
            if (facebookException instanceof FacebookServiceException) {
                re.r rVar = ((FacebookServiceException) facebookException).f7719b;
                strValueOf = String.valueOf(rVar.f49195b);
                message2 = rVar.toString();
            }
            String str2 = strValueOf;
            t tVar2 = wVarD.f52234t;
            ArrayList arrayList2 = new ArrayList();
            if (message2 != null) {
                arrayList2.add(message2);
            }
            vVar = new v(tVar2, u.ERROR, null, TextUtils.join(": ", arrayList2), str2);
        }
        vVar2 = vVar;
        if (!j1.y((String) this.f52187d)) {
            i((String) this.f52187d);
        }
        wVarD.d(vVar2);
    }

    public boolean t(Intent intent) {
        if (intent == null) {
            return false;
        }
        List<ResolveInfo> listQueryIntentActivities = re.s.a().getPackageManager().queryIntentActivities(intent, 65536);
        kotlin.jvm.internal.m.e(listQueryIntentActivities, "getApplicationContext()\n…nager.MATCH_DEFAULT_ONLY)");
        if (listQueryIntentActivities.isEmpty()) {
            return false;
        }
        x xVar = d().f52230c;
        qy.b0 b0Var = null;
        if (xVar == null) {
            xVar = null;
        }
        if (xVar != null) {
            i.c cVar = xVar.f52238d;
            if (cVar == null) {
                kotlin.jvm.internal.m.n("launcher");
                throw null;
            }
            cVar.a(intent);
            b0Var = qy.b0.f48488a;
        }
        return b0Var != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Parcel parcel, int i11) {
        super(parcel);
        this.f52186c = i11;
        switch (i11) {
            case 1:
                super(parcel);
                break;
            default:
                this.f52187d = re.g.FACEBOOK_APPLICATION_WEB;
                break;
        }
    }

    public i0(w wVar) {
        this.f52186c = 0;
        this.f52166b = wVar;
        this.f52187d = re.g.FACEBOOK_APPLICATION_WEB;
    }
}
