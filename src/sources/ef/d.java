package ef;

import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lf.a0;
import lf.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f25500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f25501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f25502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile ScheduledFuture f25503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f25504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f25505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile b7.c f25506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f25507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f25508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static long f25509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f25510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static WeakReference f25511l;
    public static String m;

    static {
        String canonicalName = d.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f25500a = canonicalName;
        f25501b = Executors.newSingleThreadScheduledExecutor();
        f25502c = Executors.newSingleThreadScheduledExecutor();
        f25504e = new Object();
        f25505f = new AtomicInteger(0);
        f25507h = new AtomicBoolean(false);
    }

    public static void a() {
        ScheduledFuture scheduledFuture;
        synchronized (f25504e) {
            try {
                if (f25503d != null && (scheduledFuture = f25503d) != null) {
                    scheduledFuture.cancel(false);
                }
                f25503d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final UUID b() {
        b7.c cVar;
        if (f25506g == null || (cVar = f25506g) == null) {
            return null;
        }
        return (UUID) cVar.f3961d;
    }

    public static final void c(Application application, String str) {
        kotlin.jvm.internal.m.f(application, "application");
        if (f25507h.compareAndSet(false, true)) {
            a0.a(new com.google.firebase.remoteconfig.a(29), x.CodelessEvents);
            f25508i = str;
            application.registerActivityLifecycleCallbacks(new c(0));
        }
    }
}
