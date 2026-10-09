package re;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import lf.a1;
import lf.c1;
import lf.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f49201a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f49202b = qx.b.w(d0.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Executor f49203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile String f49204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f49205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile String f49206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile Boolean f49207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static ob.c f49208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Context f49209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f49210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ReentrantLock f49211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f49212l;
    public static boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f49213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f49214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicBoolean f49215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile String f49216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile String f49217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final nf.f f49218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f49219t;

    static {
        new AtomicLong(65536L);
        f49210j = 64206;
        f49211k = new ReentrantLock();
        f49212l = "v16.0";
        f49215p = new AtomicBoolean(false);
        f49216q = "instagram.com";
        f49217r = "facebook.com";
        f49218s = new nf.f(21);
    }

    public static final Context a() {
        v0.m();
        Context context = f49209i;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.m.n("applicationContext");
        throw null;
    }

    public static final String b() {
        v0.m();
        String str = f49204d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String c() {
        v0.m();
        String str = f49206f;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final Executor d() {
        ReentrantLock reentrantLock = f49211k;
        reentrantLock.lock();
        try {
            if (f49203c == null) {
                f49203c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = f49203c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String e() {
        String str = f49212l;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String f() {
        Date date = b.N;
        b bVarX = ns.o.x();
        String str = bVarX != null ? bVarX.M : null;
        String str2 = f49217r;
        if (str != null) {
            if (str.equals("gaming")) {
                return oz.x.q0(str2, "facebook.com", "fb.gg");
            }
            if (str.equals("instagram")) {
                return oz.x.q0(str2, "facebook.com", "instagram.com");
            }
        }
        return str2;
    }

    public static final boolean g(Context context) {
        v0.m();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean h() {
        return f49219t;
    }

    public static final void i(d0 behavior) {
        kotlin.jvm.internal.m.f(behavior, "behavior");
        synchronized (f49202b) {
        }
    }

    public static final void j(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.m.e(applicationInfo, "try {\n                co…     return\n            }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f49204d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.m.e(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.m.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (oz.x.s0(lowerCase, "fb", false)) {
                        String strSubstring = str.substring(2);
                        kotlin.jvm.internal.m.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                        f49204d = strSubstring;
                    } else {
                        f49204d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f49205e == null) {
                f49205e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f49206f == null) {
                f49206f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f49210j == 64206) {
                f49210j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f49207g == null) {
                f49207g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void k(Context context) {
        try {
            AtomicBoolean atomicBoolean = f49215p;
            if (atomicBoolean.get()) {
                return;
            }
            boolean zA = false;
            v0.e(context, false);
            context.checkCallingOrSelfPermission("android.permission.INTERNET");
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.m.e(applicationContext, "applicationContext.applicationContext");
            f49209i = applicationContext;
            v10.c.l(context);
            Context context2 = f49209i;
            if (context2 == null) {
                kotlin.jvm.internal.m.n("applicationContext");
                throw null;
            }
            j(context2);
            String str = f49204d;
            if (str == null || str.length() == 0) {
                throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            String str2 = f49206f;
            if (str2 == null || str2.length() == 0) {
                throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
            }
            int i11 = 1;
            atomicBoolean.set(true);
            i0 i0Var = i0.f49169a;
            if (!qf.a.b(i0.class)) {
                try {
                    i0.f49169a.e();
                    zA = i0.f49172d.a();
                } catch (Throwable th2) {
                    qf.a.a(i0.class, th2);
                }
            }
            if (zA) {
                f49219t = true;
            }
            Context context3 = f49209i;
            if (context3 == null) {
                kotlin.jvm.internal.m.n("applicationContext");
                throw null;
            }
            if ((context3 instanceof Application) && i0.c()) {
                Context context4 = f49209i;
                if (context4 == null) {
                    kotlin.jvm.internal.m.n("applicationContext");
                    throw null;
                }
                ef.d.c((Application) context4, f49204d);
            } else {
                cf.r.l();
            }
            ef.i iVarA = ef.i.f25514b.a();
            if (iVarA != null) {
                Context context5 = f49209i;
                if (context5 == null) {
                    kotlin.jvm.internal.m.n("applicationContext");
                    throw null;
                }
                Application application = (Application) context5;
                if (!qf.a.b(iVarA)) {
                    try {
                        application.registerActivityLifecycleCallbacks(new ef.c(i11));
                    } catch (Throwable th3) {
                        qf.a.a(iVarA, th3);
                    }
                }
            }
            lf.h0.d();
            c1.q();
            lf.e eVar = lf.e.f39994c;
            Context context6 = f49209i;
            if (context6 == null) {
                kotlin.jvm.internal.m.n("applicationContext");
                throw null;
            }
            a1.f(context6);
            bp.g gVar = new bp.g(9);
            ob.c cVar = new ob.c(20);
            cVar.f44800c = new CountDownLatch(1);
            d().execute(new FutureTask(new com.google.common.cache.a(7, cVar, gVar)));
            f49208h = cVar;
            lf.a0.a(new nf.f(22), lf.x.Instrument);
            lf.a0.a(new nf.f(23), lf.x.AppEvents);
            lf.a0.a(new nf.f(24), lf.x.ChromeCustomTabsPrefetching);
            lf.a0.a(new nf.f(25), lf.x.IgnoreAppSwitchToLoggedOut);
            lf.a0.a(new nf.f(26), lf.x.BypassAppSwitch);
            d().execute(new FutureTask(new bp.g(10)));
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static final void l() {
        i0 i0Var = i0.f49169a;
        if (!qf.a.b(i0.class)) {
            try {
                j0.h0 h0Var = i0.f49172d;
                h0Var.f35300d = Boolean.TRUE;
                h0Var.f35298b = System.currentTimeMillis();
                if (i0.f49170b.get()) {
                    i0Var.l(h0Var);
                } else {
                    i0Var.e();
                }
            } catch (Throwable th2) {
                qf.a.a(i0.class, th2);
            }
        }
        f49219t = true;
    }
}
