package aw;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import ay.g0;
import ay.m0;
import com.android.billingclient.api.j0;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.api.Service;
import fr.j3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Future;
import kotlin.TypeCastException;
import rz.a1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3244c;

    public /* synthetic */ t(int i11, Object obj, Object obj2) {
        this.f3242a = i11;
        this.f3244c = obj;
        this.f3243b = obj2;
    }

    private final void a() {
        try {
            ((Runnable) this.f3244c).run();
            synchronized (((pb.j) this.f3243b).f46743e) {
                ((pb.j) this.f3243b).a();
            }
        } catch (Throwable th2) {
            synchronized (((pb.j) this.f3243b).f46743e) {
                ((pb.j) this.f3243b).a();
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        int i11 = 0;
        ob.p pVar = null;
        switch (this.f3242a) {
            case 0:
                u uVar = (u) this.f3244c;
                q qVar = (q) uVar.f3247c.f44805c;
                p pVar2 = (p) this.f3243b;
                qVar.j(pVar2);
                uVar.f3245a.remove(Integer.valueOf(pVar2.f3237a));
                return;
            case 1:
                ((qx.h) ((g0) this.f3244c).f3265a).i((m0) this.f3243b);
                return;
            case 2:
                com.android.billingclient.api.d dVar = (com.android.billingclient.api.d) this.f3243b;
                a5.j jVar = (a5.j) this.f3244c;
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                com.android.billingclient.api.j jVar2 = j0.f7532k;
                dVar.A(zzieVar, 3, jVar2);
                jVar.n(jVar2);
                return;
            case 3:
                com.android.billingclient.api.d dVar2 = (com.android.billingclient.api.d) this.f3243b;
                com.android.billingclient.api.j jVar3 = (com.android.billingclient.api.j) this.f3244c;
                if (((com.android.billingclient.api.r) dVar2.f7477f.f7510c) != null) {
                    ((com.android.billingclient.api.r) dVar2.f7477f.f7510c).d(jVar3, null);
                    return;
                } else {
                    int i12 = zzc.f12272a;
                    return;
                }
            case 4:
                Future future = (Future) this.f3243b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f3244c;
                future.cancel(true);
                int i13 = zzc.f12272a;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                com.android.billingclient.api.d dVar3 = (com.android.billingclient.api.d) this.f3243b;
                a5.f fVar = (a5.f) this.f3244c;
                zzie zzieVar2 = zzie.EXECUTE_ASYNC_TIMEOUT;
                com.android.billingclient.api.j jVar4 = j0.f7532k;
                dVar3.A(zzieVar2, 7, jVar4);
                zzbt zzbtVarN = zzbt.n();
                zzbt.n();
                rz.t tVar = (rz.t) fVar.f378b;
                kotlin.jvm.internal.m.c(jVar4);
                tVar.J(new com.android.billingclient.api.p(jVar4, zzbtVarN));
                return;
            case 6:
                com.android.billingclient.api.d dVar4 = (com.android.billingclient.api.d) this.f3243b;
                com.android.billingclient.api.q qVar2 = (com.android.billingclient.api.q) this.f3244c;
                zzie zzieVar3 = zzie.EXECUTE_ASYNC_TIMEOUT;
                com.android.billingclient.api.j jVar5 = j0.f7532k;
                dVar4.A(zzieVar3, 9, jVar5);
                qVar2.a(jVar5, zzbt.n());
                return;
            case 7:
                ((dy.v) this.f3243b).f24623d = true;
                ((dy.w) this.f3244c).f24624a.remove((dy.v) this.f3243b);
                return;
            case 8:
                f10.j jVarJ = ((b1.p) this.f3243b).J();
                if (jVarJ == null) {
                    throw new IllegalStateException("No pending post available");
                }
                ((f10.e) this.f3244c).c(jVarJ);
                return;
            case 9:
                ((uw.h) this.f3244c).b((fx.t) this.f3243b);
                return;
            case 10:
                fb.l lVarB = fb.l.b();
                int i14 = hb.a.f32158e;
                ob.p pVar3 = (ob.p) this.f3243b;
                lVarB.getClass();
                ((hb.a) this.f3244c).f32159a.b(pVar3);
                return;
            case 11:
                ce.x xVarA = ce.x.a();
                xVarA.getClass();
                pe.m.a();
                xVarA.f6900d.set(true);
                ((ie.d) this.f3244c).f34391b.f34393b = true;
                View view = ((ie.d) this.f3244c).f34390a;
                view.getViewTreeObserver().removeOnDrawListener((ie.d) this.f3243b);
                ((ie.d) this.f3244c).f34391b.f34392a.clear();
                return;
            case 12:
                ((n4.c) this.f3243b).f43185a = this.f3244c;
                return;
            case 13:
                ((Application) this.f3243b).unregisterActivityLifecycleCallbacks((n4.c) this.f3244c);
                return;
            case 14:
                Object obj = this.f3244c;
                Object obj2 = this.f3243b;
                try {
                    Method method = n4.d.f43194d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        n4.d.f43195e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e8) {
                    if (e8.getClass() == RuntimeException.class && e8.getMessage() != null && e8.getMessage().startsWith("Unable to stop")) {
                        throw e8;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 15:
                gb.d dVar5 = ((nb.a) this.f3244c).f43751a.f28958f;
                String str = (String) this.f3243b;
                synchronized (dVar5.f28927k) {
                    try {
                        gb.a0 a0VarC = dVar5.c(str);
                        if (a0VarC != null) {
                            pVar = a0VarC.f28894a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (pVar == null || !pVar.c()) {
                    return;
                }
                synchronized (((nb.a) this.f3244c).f43753c) {
                    ((nb.a) this.f3244c).f43756f.put(j3.s(pVar), pVar);
                    nb.a aVar = (nb.a) this.f3244c;
                    ((nb.a) this.f3244c).f43757t.put(j3.s(pVar), kb.k.a(aVar.H, pVar, aVar.f43752b.f47695b, aVar));
                    break;
                }
                return;
            case 16:
                ue.f.x((o20.x) this.f3243b).resumeWith(com.bumptech.glide.e.l((Throwable) this.f3244c));
                return;
            case 17:
                a();
                return;
            case 18:
                EditText editText = (EditText) this.f3243b;
                editText.requestFocus();
                Object systemService = ((lc.d) this.f3244c).O.getSystemService("input_method");
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                ((InputMethodManager) systemService).showSoftInput(editText, 1);
                return;
            case 19:
                try {
                    ((pd.b) this.f3244c).f46771b.put((pd.h) this.f3243b);
                    return;
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 20:
                py.c cVar = (py.c) ((py.b) this.f3244c).f47212b;
                ob.c cVar2 = cVar.f47217d;
                Bitmap bitmapZ = com.bumptech.glide.d.z((Context) this.f3243b, cVar.f47216c, cVar.f47215b);
                ViewGroup viewGroup = (ViewGroup) cVar2.f44799b;
                Resources resources = viewGroup.getResources();
                bq.f fVar2 = (bq.f) cVar2.f44800c;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, com.bumptech.glide.d.z((Context) fVar2.f4945c, bitmapZ, (py.a) fVar2.f4946d));
                View view2 = (View) fVar2.f4944b;
                view2.setBackground(bitmapDrawable);
                viewGroup.addView(view2);
                return;
            case 21:
                ((rz.m) this.f3244c).D((a1) this.f3243b);
                return;
            case 22:
                o20.w wVar = (o20.w) this.f3243b;
                Typeface typeface = (Typeface) this.f3244c;
                q4.a aVar2 = (q4.a) wVar.f44617b;
                if (aVar2 != null) {
                    aVar2.j(typeface);
                    return;
                }
                return;
            case 23:
                ((com.android.billingclient.api.a0) this.f3243b).accept(this.f3244c);
                return;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                w6.a aVar3 = (w6.a) this.f3244c;
                Object obj3 = this.f3243b;
                if (aVar3.f54654c.get()) {
                    zbc zbcVar = aVar3.f54656e;
                    if (zbcVar.f8540h == aVar3) {
                        SystemClock.uptimeMillis();
                        zbcVar.f8540h = null;
                        zbcVar.b();
                    }
                } else {
                    zbc zbcVar2 = aVar3.f54656e;
                    if (zbcVar2.f8539g != aVar3) {
                        if (zbcVar2.f8540h == aVar3) {
                            SystemClock.uptimeMillis();
                            zbcVar2.f8540h = null;
                            zbcVar2.b();
                        }
                    } else if (!zbcVar2.f8535c) {
                        SystemClock.uptimeMillis();
                        zbcVar2.f8539g = null;
                        v6.c cVar3 = zbcVar2.f8533a;
                        if (cVar3 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                cVar3.setValue(obj3);
                            } else {
                                cVar3.postValue(obj3);
                            }
                        }
                    }
                }
                aVar3.f54653b = w6.d.FINISHED;
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                yd.b bVar = (yd.b) this.f3244c;
                if (bVar.f57737d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f3243b).run();
                    return;
                } catch (Throwable unused3) {
                    bVar.f57736c.getClass();
                    return;
                }
            default:
                uv.r rVar = (uv.r) this.f3244c;
                w00.d dVar6 = (w00.d) this.f3243b;
                LinkedList linkedList = (LinkedList) ((HashMap) rVar.f53231b).get("event.service.connect.changed");
                if (linkedList == null) {
                    synchronized ("event.service.connect.changed".intern()) {
                        try {
                            linkedList = (LinkedList) ((HashMap) rVar.f53231b).get("event.service.connect.changed");
                            if (linkedList == null) {
                                return;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                Object[] array = linkedList.toArray();
                int length = array.length;
                while (i11 < length) {
                    Object obj4 = array[i11];
                    if (obj4 != null) {
                        uv.d dVar7 = (uv.d) obj4;
                        yv.a aVar4 = (yv.a) dVar6.f54378a;
                        dVar7.f53204a = aVar4;
                        if (aVar4 == yv.a.connected) {
                            dVar7.a();
                        } else {
                            dVar7.b();
                        }
                    }
                    i11++;
                }
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f3243b).run();
            } catch (Throwable th4) {
                rz.e0.u(th4, vy.j.f54321a);
            }
            try {
                Runnable runnableD = ((wz.g) this.f3244c).d();
                if (runnableD == null) {
                    return;
                }
                this.f3243b = runnableD;
                i11++;
                if (i11 >= 16) {
                    wz.g gVar = (wz.g) this.f3244c;
                    if (wz.b.j(gVar.f55518b, gVar)) {
                        wz.g gVar2 = (wz.g) this.f3244c;
                        wz.b.i(gVar2.f55518b, gVar2, this);
                        return;
                    }
                }
            } catch (Throwable th5) {
                wz.g gVar3 = (wz.g) this.f3244c;
                synchronized (gVar3.f55522f) {
                    wz.g.f55516t.decrementAndGet(gVar3);
                    throw th5;
                }
            }
        }
    }

    public /* synthetic */ t(Object obj, Object obj2, boolean z11, int i11) {
        this.f3242a = i11;
        this.f3243b = obj;
        this.f3244c = obj2;
    }

    public t(f10.e eVar) {
        this.f3242a = 8;
        this.f3244c = eVar;
        this.f3243b = new b1.p(8, false);
    }
}
