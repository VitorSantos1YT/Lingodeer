package nb;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import ed.c;
import fb.l;
import fb.o;
import fr.j3;
import gb.b;
import gb.i;
import gb.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kb.h;
import ob.j;
import pb.k;
import rz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h, b {
    public static final /* synthetic */ int L = 0;
    public final c H;
    public SystemForegroundService K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f43751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb.a f43752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43753c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f43754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f43755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f43756f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f43757t;

    static {
        l.c("SystemFgDispatcher");
    }

    public a(Context context) {
        p pVarE = p.E(context);
        this.f43751a = pVarE;
        this.f43752b = pVarE.f28956d;
        this.f43754d = null;
        this.f43755e = new LinkedHashMap();
        this.f43757t = new HashMap();
        this.f43756f = new HashMap();
        this.H = new c(pVarE.f28962j);
        pVarE.f28958f.a(this);
    }

    public static Intent b(Context context, j jVar, o oVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f44817a);
        intent.putExtra("KEY_GENERATION", jVar.f44818b);
        intent.putExtra("KEY_NOTIFICATION_ID", oVar.f27102a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oVar.f27103b);
        intent.putExtra("KEY_NOTIFICATION", oVar.f27104c);
        return intent;
    }

    @Override // kb.h
    public final void a(ob.p pVar, kb.c cVar) {
        if (cVar instanceof kb.b) {
            l.b().getClass();
            j jVarS = j3.s(pVar);
            int i11 = ((kb.b) cVar).f38029a;
            p pVar2 = this.f43751a;
            pVar2.f28956d.a(new k(pVar2.f28958f, new i(jVarS), true, i11));
        }
    }

    public final void c(Intent intent) {
        if (this.K == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i11 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        j jVar = new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        l.b().getClass();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        o oVar = new o(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f43755e;
        linkedHashMap.put(jVar, oVar);
        o oVar2 = (o) linkedHashMap.get(this.f43754d);
        if (oVar2 == null) {
            this.f43754d = jVar;
        } else {
            this.K.f2812c.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i11 |= ((o) ((Map.Entry) it.next()).getValue()).f27103b;
                }
                oVar = new o(oVar2.f27102a, oVar2.f27104c, i11);
            } else {
                oVar = oVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.K;
        int i12 = oVar.f27102a;
        int i13 = oVar.f27103b;
        Notification notification2 = oVar.f27104c;
        systemForegroundService.getClass();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 31) {
            c3.c.p(systemForegroundService, i12, notification2, i13);
        } else if (i14 >= 29) {
            c3.c.o(systemForegroundService, i12, notification2, i13);
        } else {
            systemForegroundService.startForeground(i12, notification2);
        }
    }

    public final void d() {
        this.K = null;
        synchronized (this.f43753c) {
            try {
                Iterator it = this.f43757t.values().iterator();
                while (it.hasNext()) {
                    ((g1) it.next()).cancel(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f43751a.f28958f.e(this);
    }

    @Override // gb.b
    public final void e(j jVar, boolean z11) {
        Map.Entry entry;
        synchronized (this.f43753c) {
            try {
                g1 g1Var = ((ob.p) this.f43756f.remove(jVar)) != null ? (g1) this.f43757t.remove(jVar) : null;
                if (g1Var != null) {
                    g1Var.cancel(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o oVar = (o) this.f43755e.remove(jVar);
        if (jVar.equals(this.f43754d)) {
            if (this.f43755e.size() > 0) {
                Iterator it = this.f43755e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f43754d = (j) entry.getKey();
                if (this.K != null) {
                    o oVar2 = (o) entry.getValue();
                    SystemForegroundService systemForegroundService = this.K;
                    int i11 = oVar2.f27102a;
                    int i12 = oVar2.f27103b;
                    Notification notification = oVar2.f27104c;
                    systemForegroundService.getClass();
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 31) {
                        c3.c.p(systemForegroundService, i11, notification, i12);
                    } else if (i13 >= 29) {
                        c3.c.o(systemForegroundService, i11, notification, i12);
                    } else {
                        systemForegroundService.startForeground(i11, notification);
                    }
                    this.K.f2812c.cancel(oVar2.f27102a);
                }
            } else {
                this.f43754d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.K;
        if (oVar == null || systemForegroundService2 == null) {
            return;
        }
        l lVarB = l.b();
        jVar.toString();
        lVarB.getClass();
        systemForegroundService2.f2812c.cancel(oVar.f27102a);
    }

    public final void f(int i11) {
        l.b().getClass();
        for (Map.Entry entry : this.f43755e.entrySet()) {
            if (((o) entry.getValue()).f27103b == i11) {
                j jVar = (j) entry.getKey();
                p pVar = this.f43751a;
                pVar.f28956d.a(new k(pVar.f28958f, new i(jVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.K;
        if (systemForegroundService != null) {
            systemForegroundService.f2810a = true;
            l.b().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
        }
    }
}
