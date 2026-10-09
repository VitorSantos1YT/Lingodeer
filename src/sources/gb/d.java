package gb;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import r.x2;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb.c f28919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qb.a f28920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f28921e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f28923g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f28922f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f28925i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f28926j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f28917a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f28927k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f28924h = new HashMap();

    static {
        fb.l.c("Processor");
    }

    public d(Context context, fb.c cVar, qb.a aVar, WorkDatabase workDatabase) {
        this.f28918b = context;
        this.f28919c = cVar;
        this.f28920d = aVar;
        this.f28921e = workDatabase;
    }

    public static boolean d(a0 a0Var, int i11) {
        if (a0Var == null) {
            fb.l.b().getClass();
            return false;
        }
        a0Var.m.r(new WorkerStoppedException(i11));
        fb.l.b().getClass();
        return true;
    }

    public final void a(b bVar) {
        synchronized (this.f28927k) {
            this.f28926j.add(bVar);
        }
    }

    public final a0 b(String str) {
        a0 a0Var = (a0) this.f28922f.remove(str);
        boolean z11 = a0Var != null;
        if (!z11) {
            a0Var = (a0) this.f28923g.remove(str);
        }
        this.f28924h.remove(str);
        if (z11) {
            synchronized (this.f28927k) {
                try {
                    if (this.f28922f.isEmpty()) {
                        Context context = this.f28918b;
                        int i11 = nb.a.L;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f28918b.startService(intent);
                        } catch (Throwable unused) {
                            fb.l.b().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.f28917a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f28917a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return a0Var;
    }

    public final a0 c(String str) {
        a0 a0Var = (a0) this.f28922f.get(str);
        return a0Var == null ? (a0) this.f28923g.get(str) : a0Var;
    }

    public final void e(b bVar) {
        synchronized (this.f28927k) {
            this.f28926j.remove(bVar);
        }
    }

    public final boolean f(i iVar, ob.l lVar) {
        Throwable th2;
        boolean z11;
        ob.j jVar = iVar.f28935a;
        String str = jVar.f44817a;
        ArrayList arrayList = new ArrayList();
        ob.p pVar = (ob.p) this.f28921e.w(new s0.u(new wc.i(this, arrayList, str), 22));
        if (pVar == null) {
            fb.l lVarB = fb.l.b();
            jVar.toString();
            lVarB.getClass();
            this.f28920d.f47697d.execute(new b2.c(17, this, jVar));
            return false;
        }
        synchronized (this.f28927k) {
            try {
                try {
                    synchronized (this.f28927k) {
                        try {
                            z11 = c(str) != null;
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    }
                    try {
                        if (z11) {
                            Set set = (Set) this.f28924h.get(str);
                            if (((i) set.iterator().next()).f28935a.f44818b == jVar.f44818b) {
                                set.add(iVar);
                                fb.l lVarB2 = fb.l.b();
                                jVar.toString();
                                lVarB2.getClass();
                            } else {
                                this.f28920d.f47697d.execute(new b2.c(17, this, jVar));
                            }
                            return false;
                        }
                        if (pVar.f44866t != jVar.f44818b) {
                            this.f28920d.f47697d.execute(new b2.c(17, this, jVar));
                            return false;
                        }
                        a0 a0Var = new a0(new x2(this.f28918b, this.f28919c, this.f28920d, this, this.f28921e, pVar, arrayList));
                        a4.l lVarG = r.G(a0Var.f28897d.f47695b.plus(e0.d()), new x(a0Var, null, 1));
                        lVarG.f352b.N(new androidx.fragment.app.d(this, lVarG, a0Var, 9), this.f28920d.f47697d);
                        this.f28923g.put(str, a0Var);
                        HashSet hashSet = new HashSet();
                        hashSet.add(iVar);
                        this.f28924h.put(str, hashSet);
                        fb.l lVarB3 = fb.l.b();
                        jVar.toString();
                        lVarB3.getClass();
                        return true;
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th2 = th;
                }
            } catch (Throwable th7) {
                th = th7;
                th2 = th;
            }
            throw th2;
        }
    }
}
