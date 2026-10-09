package cf;

import a0.b2;
import android.media.AudioTrack;
import android.os.Handler;
import androidx.work.impl.WorkDatabase;
import au.n0;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.lingodeer.data.model.DbFileVersion;
import com.lingodeer.data.model.DbFileVersionKt;
import com.lingodeer.database.model.DbFileVersionEntity;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import kotlin.jvm.internal.y;
import lf.j1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6922e;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f6918a = i11;
        this.f6922e = obj;
        this.f6919b = obj2;
        this.f6920c = obj3;
        this.f6921d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArrF;
        DbFileVersion dbFileVersion;
        int i11 = 0;
        int i12 = 1;
        Object obj = null;
        switch (this.f6918a) {
            case 0:
                n nVar = (n) this.f6922e;
                Runnable runnable = (Runnable) this.f6919b;
                w skuType = (w) this.f6920c;
                ArrayList arrayList = (ArrayList) this.f6921d;
                if (qf.a.b(n.class)) {
                    return;
                }
                try {
                    Class cls = nVar.f6941e;
                    kotlin.jvm.internal.m.f(skuType, "$skuType");
                    Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new m(nVar, runnable, i11));
                    Object objA = nVar.f6947k.a(skuType, arrayList);
                    Class cls2 = nVar.f6938b;
                    Method method = nVar.f6945i;
                    if (!qf.a.b(nVar)) {
                        try {
                            obj = nVar.f6937a;
                        } catch (Throwable th2) {
                            qf.a.a(nVar, th2);
                        }
                        break;
                    }
                    x.t(cls2, obj, method, objA, objNewProxyInstance);
                    return;
                } catch (Throwable th3) {
                    qf.a.a(n.class, th3);
                    return;
                }
            case 1:
                o oVar = (o) this.f6922e;
                Runnable runnable2 = (Runnable) this.f6919b;
                w wVar = (w) this.f6920c;
                ArrayList arrayList2 = (ArrayList) this.f6921d;
                if (qf.a.b(o.class)) {
                    return;
                }
                try {
                    Class cls3 = oVar.f6960n;
                    Object objNewProxyInstance2 = Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new m(oVar, new Object[]{runnable2}, i12));
                    Object objE = oVar.e(wVar, arrayList2);
                    if (objE != null) {
                        Class cls4 = oVar.f6949b;
                        Method method2 = oVar.f6968v;
                        if (!qf.a.b(oVar)) {
                            try {
                                obj = oVar.f6948a;
                            } catch (Throwable th4) {
                                qf.a.a(oVar, th4);
                            }
                            break;
                        }
                        x.t(cls4, obj, method2, objE, objNewProxyInstance2);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    qf.a.a(o.class, th5);
                    return;
                }
            case 2:
                List list = (List) this.f6922e;
                ob.j jVar = (ob.j) this.f6919b;
                fb.c cVar = (fb.c) this.f6920c;
                WorkDatabase workDatabase = (WorkDatabase) this.f6921d;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((gb.f) it.next()).d(jVar.f44817a);
                }
                gb.h.b(cVar, workDatabase, list);
                return;
            case 3:
                AudioTrack audioTrack = (AudioTrack) this.f6922e;
                b2 b2Var = (b2) this.f6919b;
                Handler handler = (Handler) this.f6920c;
                h7.j jVar2 = (h7.j) this.f6921d;
                int i13 = 20;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (b2Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new b2.c(i13, b2Var, jVar2));
                    }
                    synchronized (h7.x.f31960n0) {
                        try {
                            int i14 = h7.x.f31962p0 - 1;
                            h7.x.f31962p0 = i14;
                            if (i14 == 0) {
                                h7.x.f31961o0.shutdown();
                                h7.x.f31961o0 = null;
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th7) {
                    if (b2Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new b2.c(i13, b2Var, jVar2));
                    }
                    synchronized (h7.x.f31960n0) {
                        try {
                            int i15 = h7.x.f31962p0 - 1;
                            h7.x.f31962p0 = i15;
                            if (i15 == 0) {
                                h7.x.f31961o0.shutdown();
                                h7.x.f31961o0 = null;
                            }
                            throw th7;
                        } catch (Throwable th8) {
                            throw th8;
                        }
                    }
                }
            case 4:
                DefaultScheduler defaultScheduler = (DefaultScheduler) this.f6922e;
                TransportContext transportContext = (TransportContext) this.f6919b;
                TransportScheduleCallback transportScheduleCallback = (TransportScheduleCallback) this.f6920c;
                EventInternal eventInternal = (EventInternal) this.f6921d;
                Logger logger = DefaultScheduler.f8101f;
                try {
                    TransportBackend transportBackendA = defaultScheduler.f8104c.a(transportContext.b());
                    if (transportBackendA == null) {
                        String str = "Transport backend '" + transportContext.b() + "' is not registered";
                        logger.warning(str);
                        transportScheduleCallback.i(new IllegalArgumentException(str));
                    } else {
                        defaultScheduler.f8106e.b(new com.google.firebase.crashlytics.internal.concurrency.a(defaultScheduler, transportContext, transportBackendA.b(eventInternal), 5));
                        transportScheduleCallback.i(null);
                    }
                    return;
                } catch (Exception e8) {
                    logger.warning("Error scheduling event " + e8.getMessage());
                    transportScheduleCallback.i(e8);
                    return;
                }
            case 5:
                JSONObject jSONObject = (JSONObject) this.f6922e;
                String buttonText = (String) this.f6919b;
                jf.f fVar = (jf.f) this.f6920c;
                String str2 = (String) this.f6921d;
                if (qf.a.b(jf.f.class)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.m.f(buttonText, "$buttonText");
                    try {
                        String lowerCase = j1.m(re.s.a()).toLowerCase();
                        kotlin.jvm.internal.m.e(lowerCase, "this as java.lang.String).toLowerCase()");
                        float[] fArrC = jf.a.c(jSONObject, lowerCase);
                        String strE = jf.a.e(buttonText, fVar.f36333d, lowerCase);
                        if (fArrC != null && (strArrF = ff.g.f(ff.d.MTML_APP_EVENT_PREDICTION, new float[][]{fArrC}, new String[]{strE})) != null) {
                            String str3 = strArrF[0];
                            jf.b.a(str2, str3);
                            if (kotlin.jvm.internal.m.a(str3, "other")) {
                                return;
                            }
                            HashSet hashSet = jf.f.f36329e;
                            jf.a.j(str3, buttonText, fArrC);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Throwable th9) {
                    qf.a.a(jf.f.class, th9);
                    return;
                }
            default:
                n0 n0Var = (n0) this.f6922e;
                jj.a aVar = (jj.a) this.f6919b;
                y yVar = (y) this.f6920c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f6921d;
                try {
                    try {
                        DbFileVersionEntity dbFileVersionEntityC = n0Var.c(aVar.c());
                        if (dbFileVersionEntityC == null || (dbFileVersion = DbFileVersionKt.asExternalModel(dbFileVersionEntityC)) == null) {
                            dbFileVersion = new DbFileVersion(aVar.c(), -1L, true);
                        }
                        yVar.f38361a = dbFileVersion;
                        break;
                    } catch (Exception unused2) {
                        yVar.f38361a = new DbFileVersion(aVar.c(), -1L, true);
                        break;
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }
}
