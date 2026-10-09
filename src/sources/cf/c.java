package cf;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.a0;
import lf.b1;
import lf.c0;
import lf.c1;
import lf.e0;
import lf.h0;
import lf.v0;
import org.json.JSONException;
import org.json.JSONObject;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6904a;

    public /* synthetic */ c(int i11) {
        this.f6904a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0239 A[Catch: all -> 0x0203, Exception -> 0x0261, TryCatch #20 {Exception -> 0x0261, all -> 0x0203, blocks: (B:146:0x01e6, B:148:0x01f6, B:151:0x01fd, B:155:0x020a, B:157:0x0216, B:159:0x021c, B:175:0x0257, B:170:0x0236, B:171:0x0239, B:174:0x0240, B:154:0x0205, B:165:0x0228), top: B:259:0x01e6, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x023f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0240 A[Catch: all -> 0x0203, Exception -> 0x0261, TryCatch #20 {Exception -> 0x0261, all -> 0x0203, blocks: (B:146:0x01e6, B:148:0x01f6, B:151:0x01fd, B:155:0x020a, B:157:0x0216, B:159:0x021c, B:175:0x0257, B:170:0x0236, B:171:0x0239, B:174:0x0240, B:154:0x0205, B:165:0x0228), top: B:259:0x01e6, inners: #9 }] */
    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        Class clsB;
        String str;
        ArrayList arrayListA = null;
        arrayListA = null;
        arrayListA = null;
        setF = null;
        Set setF = null;
        cVar = null;
        cVar = null;
        b7.c cVar = null;
        ArrayList arrayListA2 = null;
        int i11 = 0;
        switch (this.f6904a) {
            case 0:
                Context contextA = re.s.a();
                ArrayList arrayListF = q.f(contextA, e.f6911g);
                if (arrayListF.isEmpty()) {
                    Object obj = e.f6911g;
                    if (!qf.a.b(q.class)) {
                        try {
                            arrayListA = (obj != null && (clsB = (qVar = q.f6977a).b(contextA, "com.android.vending.billing.IInAppBillingService")) != null && qVar.c(clsB, "getPurchaseHistory") != null) ? qVar.a(qVar.d(contextA, obj)) : new ArrayList();
                        } catch (Throwable th2) {
                            qf.a.a(q.class, th2);
                        }
                    }
                    arrayListF = arrayListA;
                    break;
                }
                e.a(contextA, arrayListF, false);
                return;
            case 1:
                Context contextA2 = re.s.a();
                e.a(contextA2, q.f(contextA2, e.f6911g), false);
                Object obj2 = e.f6911g;
                if (!qf.a.b(q.class)) {
                    try {
                        q qVar2 = q.f6977a;
                        arrayListA2 = qVar2.a(qVar2.e(contextA2, obj2, "subs"));
                    } catch (Throwable th3) {
                        qf.a.a(q.class, th3);
                    }
                    break;
                }
                e.a(contextA2, arrayListA2, true);
                return;
            case 2:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.f8117a;
                return;
            case 3:
                t.d();
                return;
            case 4:
                if (ef.d.f25506g == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(re.s.a());
                    long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j12 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j11 != 0 && j12 != 0 && string != null) {
                        b7.c cVar2 = new b7.c(Long.valueOf(j11), Long.valueOf(j12));
                        cVar2.f3958a = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(re.s.a());
                        cVar2.f3963f = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new ef.o(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false)) : null;
                        cVar2.f3962e = Long.valueOf(System.currentTimeMillis());
                        UUID uuidFromString = UUID.fromString(string);
                        kotlin.jvm.internal.m.e(uuidFromString, "fromString(sessionIDStr)");
                        cVar2.f3961d = uuidFromString;
                        cVar = cVar2;
                    }
                    ef.d.f25506g = cVar;
                    return;
                }
                return;
            case 5:
                ff.g gVar = ff.g.f27245a;
                if (qf.a.b(ff.g.class)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = re.s.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string2 = sharedPreferences.getString("models", null);
                    JSONObject jSONObject = (string2 == null || string2.length() == 0) ? new JSONObject() : new JSONObject(string2);
                    long j13 = sharedPreferences.getLong("model_request_timestamp", 0L);
                    if (!a0.b(lf.x.ModelRequest) || jSONObject.length() == 0 || qf.a.b(gVar) || j13 == 0) {
                        jSONObject = gVar.c();
                        if (jSONObject == null) {
                            return;
                        } else {
                            sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                        }
                    } else {
                        try {
                            if (System.currentTimeMillis() - j13 >= 259200000) {
                                jSONObject = gVar.c();
                                if (jSONObject == null) {
                                    return;
                                } else {
                                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                                }
                            }
                        } catch (Throwable th4) {
                            qf.a.a(gVar, th4);
                        }
                    }
                    gVar.a(jSONObject);
                    gVar.b();
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th5) {
                    qf.a.a(ff.g.class, th5);
                    return;
                }
            case 6:
                if (qf.a.b(ff.g.class)) {
                    return;
                }
                try {
                    jf.d.a();
                    return;
                } catch (Throwable th6) {
                    qf.a.a(ff.g.class, th6);
                    return;
                }
            case 7:
                if (qf.a.b(ff.g.class)) {
                    return;
                }
                try {
                    if (qf.a.b(df.c.class)) {
                        return;
                    }
                    try {
                        df.c.f23393b = true;
                        df.c.f23394c = c0.b("FBSDKFeatureIntegritySample", re.s.b(), false);
                        return;
                    } catch (Throwable th7) {
                        qf.a.a(df.c.class, th7);
                        return;
                    }
                } catch (Throwable th8) {
                    qf.a.a(ff.g.class, th8);
                    return;
                }
            case 8:
                return;
            case 9:
                if (qf.a.b(jf.d.class)) {
                    return;
                }
                try {
                    AtomicBoolean atomicBoolean = jf.d.f36322b;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    jf.d.f36321a.b();
                    return;
                } catch (Throwable th9) {
                    qf.a.a(jf.d.class, th9);
                    return;
                }
            case 10:
                AtomicBoolean atomicBoolean2 = c1.f39982d;
                if (qf.a.b(c1.class)) {
                    return;
                }
                try {
                    try {
                        ArrayList arrayList = c1.f39980b;
                        int size = arrayList.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj3 = arrayList.get(i13);
                            i13++;
                            ((b1) obj3).a(true);
                        }
                        atomicBoolean2.set(false);
                        return;
                    } catch (Throwable th10) {
                        atomicBoolean2.set(false);
                        throw th10;
                    }
                } catch (Throwable th11) {
                    qf.a.a(c1.class, th11);
                    return;
                }
            case 11:
                if (qf.a.b(of.a.class)) {
                    return;
                }
                try {
                    Object systemService = re.s.a().getSystemService("activity");
                    kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    of.a.a((ActivityManager) systemService);
                    return;
                } catch (Exception unused2) {
                    return;
                } catch (Throwable th12) {
                    qf.a.a(of.a.class, th12);
                    return;
                }
            case 12:
                se.d.a();
                return;
            case 13:
                if (qf.a.b(se.j.class)) {
                    return;
                }
                try {
                    se.j.f51603c = null;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = se.m.f51605c;
                    if (g0.k() != se.l.EXPLICIT_ONLY) {
                        se.j.d(se.q.TIMER);
                        return;
                    }
                    return;
                } catch (Throwable th13) {
                    qf.a.a(se.j.class, th13);
                    return;
                }
            case 14:
                if (qf.a.b(se.j.class)) {
                    return;
                }
                try {
                    se.k.A(se.j.f51601a);
                    se.j.f51601a = new se.g();
                    return;
                } catch (Throwable th14) {
                    qf.a.a(se.j.class, th14);
                    return;
                }
            case 15:
                HashSet hashSet = new HashSet();
                se.g gVar2 = se.j.f51601a;
                if (!qf.a.b(se.j.class)) {
                    try {
                        setF = se.j.f51601a.f();
                    } catch (Throwable th15) {
                        qf.a.a(se.j.class, th15);
                    }
                    break;
                }
                Iterator it = setF.iterator();
                while (it.hasNext()) {
                    hashSet.add(((se.b) it.next()).f51580a);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    h0.k((String) it2.next(), true);
                }
                return;
            case 16:
                if (qf.a.b(te.a.class)) {
                    return;
                }
                try {
                    lf.d dVarA = v0.a(re.s.a());
                    if (dVarA == null || !dVarA.f39989e) {
                        te.a aVar = te.a.f52128a;
                        if (!qf.a.b(aVar)) {
                            try {
                                e0 e0VarK = h0.k(re.s.b(), false);
                                if (e0VarK != null && (str = e0VarK.m) != null) {
                                    try {
                                        te.c.a().clear();
                                        hz.b.p(new JSONObject(str));
                                        break;
                                    } catch (JSONException unused3) {
                                    }
                                }
                            } catch (Throwable th16) {
                                qf.a.a(aVar, th16);
                            }
                        }
                        te.a.f52129b = true;
                        return;
                    }
                    return;
                } catch (Throwable th17) {
                    qf.a.a(te.a.class, th17);
                    return;
                }
            default:
                y.e0 e0Var = AndroidComposeView.f1154o1;
                synchronized (e0Var) {
                    try {
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = e0Var.f56686a;
                            int i14 = e0Var.f56687b;
                            while (i11 < i14) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i11];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.f1151l1;
                                androidComposeView.setShowLayoutBounds(z2.g0.v());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    AndroidComposeView.l(androidComposeView.getRoot());
                                }
                                i11++;
                            }
                        } else {
                            Object[] objArr2 = e0Var.f56686a;
                            int i15 = e0Var.f56687b;
                            while (i11 < i15) {
                                AndroidComposeView.l(((AndroidComposeView) objArr2[i11]).getRoot());
                                i11++;
                            }
                        }
                    } catch (Throwable th18) {
                        throw th18;
                    }
                }
                return;
        }
    }

    private final void a() {
    }
}
