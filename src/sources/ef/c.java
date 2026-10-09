package ef;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import fr.p3;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import lf.e0;
import lf.h0;
import lf.j1;
import lf.y0;
import oz.q;
import re.d0;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25499a;

    public /* synthetic */ c(int i11) {
        this.f25499a = i11;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i11 = this.f25499a;
        kotlin.jvm.internal.m.f(activity, "activity");
        switch (i11) {
            case 0:
                p3 p3Var = y0.f40132d;
                p3.r(d0.APP_EVENTS, d.f25500a, "onActivityCreated");
                d.f25501b.execute(new cf.c(4));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i11 = this.f25499a;
        kotlin.jvm.internal.m.f(activity, "activity");
        switch (i11) {
            case 0:
                p3 p3Var = y0.f40132d;
                p3.r(d0.APP_EVENTS, d.f25500a, "onActivityDestroyed");
                ve.d dVar = ve.d.f53979a;
                if (!qf.a.b(ve.d.class)) {
                    try {
                        ve.g gVarA = ve.g.f53993f.a();
                        if (!qf.a.b(gVarA)) {
                            try {
                                gVarA.f53999e.remove(Integer.valueOf(activity.hashCode()));
                            } catch (Throwable th2) {
                                qf.a.a(gVarA, th2);
                            }
                        }
                    } catch (Throwable th3) {
                        qf.a.a(ve.d.class, th3);
                        return;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:11:0x0038, B:14:0x0041, B:16:0x004e, B:29:0x006e, B:30:0x0071, B:32:0x0075, B:19:0x0055, B:22:0x0060, B:24:0x0064, B:27:0x006a), top: B:41:0x0038, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:11:0x0038, B:14:0x0041, B:16:0x004e, B:29:0x006e, B:30:0x0071, B:32:0x0075, B:19:0x0055, B:22:0x0060, B:24:0x0064, B:27:0x006a), top: B:41:0x0038, inners: #0 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        SensorManager sensorManager;
        int i11 = this.f25499a;
        kotlin.jvm.internal.m.f(activity, "activity");
        switch (i11) {
            case 0:
                p3 p3Var = y0.f40132d;
                p3.r(d0.APP_EVENTS, d.f25500a, "onActivityPaused");
                AtomicInteger atomicInteger = d.f25505f;
                int i12 = 0;
                if (atomicInteger.decrementAndGet() < 0) {
                    atomicInteger.set(0);
                }
                d.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strL = j1.l(activity);
                ve.d dVar = ve.d.f53979a;
                if (!qf.a.b(ve.d.class)) {
                    try {
                        if (ve.d.f53984f.get()) {
                            ve.g.f53993f.a().c(activity);
                            ve.k kVar = ve.d.f53982d;
                            if (kVar == null || qf.a.b(kVar)) {
                                sensorManager = ve.d.f53981c;
                                if (sensorManager != null) {
                                    sensorManager.unregisterListener(ve.d.f53980b);
                                }
                            } else {
                                try {
                                    if (((Activity) kVar.f54011b.get()) != null) {
                                        try {
                                            Timer timer = kVar.f54012c;
                                            if (timer != null) {
                                                timer.cancel();
                                            }
                                            kVar.f54012c = null;
                                            break;
                                        } catch (Exception unused) {
                                        }
                                        sensorManager = ve.d.f53981c;
                                        if (sensorManager != null) {
                                            sensorManager.unregisterListener(ve.d.f53980b);
                                        }
                                    } else {
                                        sensorManager = ve.d.f53981c;
                                        if (sensorManager != null) {
                                            sensorManager.unregisterListener(ve.d.f53980b);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    qf.a.a(kVar, th2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        qf.a.a(ve.d.class, th3);
                    }
                }
                d.f25501b.execute(new b(jCurrentTimeMillis, strL, i12));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i11 = this.f25499a;
        kotlin.jvm.internal.m.f(activity, "activity");
        switch (i11) {
            case 0:
                p3 p3Var = y0.f40132d;
                p3.r(d0.APP_EVENTS, d.f25500a, "onActivityResumed");
                d.f25511l = new WeakReference(activity);
                d.f25505f.incrementAndGet();
                d.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                d.f25509j = jCurrentTimeMillis;
                String strL = j1.l(activity);
                ve.l lVar = ve.d.f53980b;
                ve.d dVar = ve.d.f53979a;
                if (!qf.a.b(ve.d.class)) {
                    try {
                        if (ve.d.f53984f.get()) {
                            ve.g.f53993f.a().a(activity);
                            Context applicationContext = activity.getApplicationContext();
                            String strB = s.b();
                            e0 e0VarB = h0.b(strB);
                            if (e0VarB == null || !e0VarB.f40006j) {
                                qf.a.b(dVar);
                            } else {
                                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                                if (sensorManager != null) {
                                    ve.d.f53981c = sensorManager;
                                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                                    ve.k kVar = new ve.k(activity);
                                    ve.d.f53982d = kVar;
                                    com.google.android.datatransport.runtime.scheduling.jobscheduling.e eVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(22, e0VarB, strB);
                                    if (!qf.a.b(lVar)) {
                                        try {
                                            lVar.f54014a = eVar;
                                        } catch (Throwable th2) {
                                            qf.a.a(lVar, th2);
                                        }
                                    }
                                    sensorManager.registerListener(lVar, defaultSensor, 2);
                                    if (e0VarB.f40006j) {
                                        kVar.c();
                                    }
                                    break;
                                }
                            }
                            qf.a.b(dVar);
                            break;
                        }
                    } catch (Throwable th3) {
                        qf.a.a(ve.d.class, th3);
                    }
                }
                if (!qf.a.b(te.a.class)) {
                    try {
                        if (te.a.f52129b) {
                            CopyOnWriteArraySet copyOnWriteArraySet = te.c.f52131d;
                            if (!new HashSet(te.c.a()).isEmpty()) {
                                HashMap map = te.d.f52135e;
                                te.a.b(activity);
                                break;
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th4) {
                        qf.a.a(te.a.class, th4);
                    }
                }
                jf.d.d(activity);
                String str = d.m;
                if (str != null && q.v0(str, "ProxyBillingActivity", false) && !strL.equals("ProxyBillingActivity")) {
                    d.f25502c.execute(new cf.c(3));
                }
                d.f25501b.execute(new a(strL, jCurrentTimeMillis, activity.getApplicationContext()));
                d.m = strL;
                break;
            default:
                i iVarA = i.f25514b.a();
                if (iVarA != null) {
                    iVarA.b(activity);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        int i11 = this.f25499a;
        kotlin.jvm.internal.m.f(activity, "activity");
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(outState, "outState");
                p3 p3Var = y0.f40132d;
                p3.r(d0.APP_EVENTS, d.f25500a, "onActivitySaveInstanceState");
                break;
            default:
                kotlin.jvm.internal.m.f(outState, "bundle");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i11 = this.f25499a;
        kotlin.jvm.internal.m.f(activity, "activity");
        switch (i11) {
            case 0:
                d.f25510k++;
                p3 p3Var = y0.f40132d;
                p3.r(d0.APP_EVENTS, d.f25500a, "onActivityStarted");
                break;
            default:
                i iVarA = i.f25514b.a();
                if (iVarA != null) {
                    iVarA.b(activity);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i11 = this.f25499a;
        kotlin.jvm.internal.m.f(activity, "activity");
        switch (i11) {
            case 0:
                p3 p3Var = y0.f40132d;
                p3.r(d0.APP_EVENTS, d.f25500a, "onActivityStopped");
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
                se.g gVar = se.j.f51601a;
                if (!qf.a.b(se.j.class)) {
                    try {
                        se.j.f51602b.execute(new cf.c(14));
                    } catch (Throwable th2) {
                        qf.a.a(se.j.class, th2);
                    }
                }
                d.f25510k--;
                break;
        }
    }
}
