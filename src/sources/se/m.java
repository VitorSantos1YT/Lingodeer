package se;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookException;
import fr.p3;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lf.a0;
import lf.c0;
import lf.e0;
import lf.h0;
import lf.j1;
import lf.v0;
import lf.y0;
import org.json.JSONException;
import re.d0;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f51605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f51606d = l.AUTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f51607e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f51608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f51609g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f51611b;

    public m(String str, String str2) {
        v0.m();
        this.f51610a = str;
        Date date = re.b.N;
        re.b bVarX = ns.o.x();
        if (bVarX == null || new Date().after(bVarX.f49115a) || !(str2 == null || str2.equals(bVarX.H))) {
            if (str2 == null) {
                re.s.a();
                str2 = re.s.b();
            }
            this.f51611b = new b(null, str2);
        } else {
            this.f51611b = new b(bVarX.f49119e, re.s.b());
        }
        g0.p();
    }

    public static final /* synthetic */ String a() {
        if (qf.a.b(m.class)) {
            return null;
        }
        try {
            return f51608f;
        } catch (Throwable th2) {
            qf.a.a(m.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (qf.a.b(m.class)) {
            return null;
        }
        try {
            return f51605c;
        } catch (Throwable th2) {
            qf.a.a(m.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (qf.a.b(m.class)) {
            return null;
        }
        try {
            return f51607e;
        } catch (Throwable th2) {
            qf.a.a(m.class, th2);
            return null;
        }
    }

    public static /* synthetic */ void f(m mVar, String str, Double d5, Bundle bundle, boolean z11, UUID uuid) {
        if (qf.a.b(m.class)) {
            return;
        }
        try {
            mVar.e(str, d5, bundle, z11, uuid, null);
        } catch (Throwable th2) {
            qf.a.a(m.class, th2);
        }
    }

    public final void d(String str, Bundle bundle) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            try {
                f(this, str, null, bundle, false, ef.d.b());
            } catch (Throwable th2) {
                th = th2;
                qf.a.a(this, th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(String str, Double d5, Bundle bundle, boolean z11, UUID uuid, t tVar) {
        t tVar2;
        Bundle bundle2;
        boolean zContains;
        Double dValueOf;
        String string;
        if (qf.a.b(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            if (z11 || !ef.k.c() || (!str.equals("fb_mobile_purchase") && !str.equals("Subscribe") && !str.equals("StartTrial"))) {
                tVar2 = tVar;
                bundle2 = bundle;
            } else if ((a0.b(lf.x.AndroidManualImplicitPurchaseDedupe) && str.equals("fb_mobile_purchase")) || (a0.b(lf.x.AndroidManualImplicitSubsDedupe) && (str.equals("Subscribe") || str.equals("StartTrial")))) {
                List list = cf.p.f6973a;
                Currency currency = null;
                if (d5 == null) {
                    e0 e0VarB = h0.b(re.s.b());
                    Iterator it = (((e0VarB != null ? e0VarB.f40019x : null) == null || e0VarB.f40019x.isEmpty()) ? cf.p.f6974b : e0VarB.f40019x).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            dValueOf = null;
                            break;
                        }
                        String str2 = (String) it.next();
                        if (bundle != null) {
                            try {
                                dValueOf = Double.valueOf(bundle.getDouble(str2));
                                break;
                            } catch (Exception unused) {
                                continue;
                            }
                        }
                    }
                } else {
                    dValueOf = d5;
                }
                List list2 = cf.p.f6973a;
                e0 e0VarB2 = h0.b(re.s.b());
                for (String str3 : ((e0VarB2 != null ? e0VarB2.f40018w : null) == null || e0VarB2.f40018w.isEmpty()) ? cf.p.f6973a : e0VarB2.f40018w) {
                    if (bundle != null) {
                        try {
                            string = bundle.getString(str3);
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else {
                        string = currency;
                    }
                    if (string != 0 && string.length() != 0) {
                        currency = Currency.getInstance(string);
                        break;
                    }
                }
                if (dValueOf == null || currency == null) {
                    tVar2 = tVar;
                    bundle2 = bundle;
                } else {
                    qy.l lVarA = cf.p.a(cf.t.c(ns.o.K(new cf.a(str, dValueOf.doubleValue(), currency)), System.currentTimeMillis(), false, ns.o.K(new qy.l(bundle, tVar))), bundle, tVar);
                    bundle2 = (Bundle) lVarA.f48495a;
                    tVar2 = (t) lVarA.f48496b;
                }
            } else {
                tVar2 = tVar;
                bundle2 = bundle;
            }
            if (c0.b("app_events_killswitch", re.s.b(), false)) {
                p3 p3Var = y0.f40132d;
                p3.s(d0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            df.b bVar = df.b.f23389a;
            if (qf.a.b(df.b.class)) {
                zContains = false;
            } else {
                try {
                    if (df.b.f23390b) {
                        zContains = df.b.f23391c.contains(str);
                    }
                } catch (Throwable th2) {
                    qf.a.a(df.b.class, th2);
                }
                zContains = false;
            }
            if (zContains) {
                return;
            }
            qy.l lVarF = g0.f(bundle2, tVar2, z11);
            Bundle bundle3 = (Bundle) lVarF.f48495a;
            t tVar3 = (t) lVarF.f48496b;
            try {
                if (!df.f.f23400a.c(bundle3)) {
                    df.h.b(str, bundle3);
                }
                df.a.a(bundle3);
                df.d.e(str, bundle3);
                df.i.d(bundle3);
                df.f.b(bundle3);
                g0.d(new f(this.f51610a, str, d5, bundle3, z11, ef.d.f25510k == 0, uuid, tVar3), this.f51611b);
            } catch (FacebookException e8) {
                p3 p3Var2 = y0.f40132d;
                p3.s(d0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e8.toString());
            } catch (JSONException e10) {
                p3 p3Var3 = y0.f40132d;
                p3.s(d0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e10.toString());
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    public final void g(String str, Bundle bundle) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            try {
                f(this, str, null, bundle, true, ef.d.b());
            } catch (Throwable th2) {
                th = th2;
                qf.a.a(this, th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public m(Context context, String str) {
        this(j1.l(context), str);
    }
}
