package w9;

import android.os.Looper;
import bp.r0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import i0.pKy.shrCcjmOhAmRC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import mt.j5;
import pt.ImS.aYZzTH;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wz.d f54850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vy.i f54851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f54852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pb.j f54853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f54854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f54855f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f54857h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m4 f54856g = new m4(new j5(0, this, s.class, "onClosed", "onClosed()V", 0, 8));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f54858i = new ThreadLocal();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f54859j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f54860k = true;

    public final void a() {
        if (this.f54857h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (q() && !r() && this.f54858i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        ka.a aVarN0 = l().n0();
        if (!aVarN0.U0()) {
            se.i.D(new tp.f0(k(), (vy.d) null, 8));
        }
        if (aVarN0.e1()) {
            aVarN0.f0();
        } else {
            aVarN0.j();
        }
    }

    public abstract void d();

    public final void e() {
        m4 m4Var = this.f54856g;
        synchronized (m4Var) {
            if (((AtomicBoolean) m4Var.f48062d).compareAndSet(false, true)) {
                while (((AtomicInteger) m4Var.f48061c).get() != 0) {
                }
                ((j5) m4Var.f48060b).invoke();
            }
        }
    }

    public List f(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ry.x.W(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(qx.b.p((mz.c) entry.getKey()), entry.getValue());
        }
        return j(linkedHashMap2);
    }

    public abstract g g();

    public v5.e h() {
        throw new qy.k();
    }

    public ka.d i(b config) {
        kotlin.jvm.internal.m.f(config, "config");
        throw new qy.k();
    }

    public List j(LinkedHashMap linkedHashMap) {
        return ry.r.f50854a;
    }

    public final g k() {
        g gVar = this.f54855f;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.m.n("internalTracker");
        throw null;
    }

    public final ka.d l() {
        p pVar = this.f54854e;
        if (pVar == null) {
            kotlin.jvm.internal.m.n("connectionManager");
            throw null;
        }
        ka.d dVarC = pVar.c();
        if (dVarC != null) {
            return dVarC;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set m() {
        Set setN = n();
        ArrayList arrayList = new ArrayList(ry.n.W(setN, 10));
        Iterator it = setN.iterator();
        while (it.hasNext()) {
            arrayList.add(qx.b.r((Class) it.next()));
        }
        return ry.m.f1(arrayList);
    }

    public Set n() {
        return ry.t.f50856a;
    }

    public LinkedHashMap o() {
        Set<Map.Entry> setEntrySet = p().entrySet();
        int iW = ry.x.W(ry.n.W(setEntrySet, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            kotlin.jvm.internal.e eVarR = qx.b.r(cls);
            ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(qx.b.r((Class) it.next()));
            }
            linkedHashMap.put(eVarR, arrayList);
        }
        return linkedHashMap;
    }

    public Map p() {
        return ry.s.f50855a;
    }

    public final boolean q() {
        p pVar = this.f54854e;
        if (pVar != null) {
            return pVar.c() != null;
        }
        kotlin.jvm.internal.m.n("connectionManager");
        throw null;
    }

    public final boolean r() {
        return v() && l().n0().U0();
    }

    public final void s() {
        l().n0().r();
        if (r()) {
            return;
        }
        g gVarK = k();
        gVarK.f54801b.e(gVarK.f54804e, gVarK.f54805f);
    }

    public final boolean u() {
        p pVar = this.f54854e;
        if (pVar == null) {
            kotlin.jvm.internal.m.n("connectionManager");
            throw null;
        }
        ka.a aVar = pVar.f54831g;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }

    public final Object w(fz.a aVar) {
        if (!q()) {
            r0 r0Var = new r0(17, aVar);
            a();
            b();
            return se.i.D(new ca.c(this, true, false, (fz.c) r0Var, (vy.d) null));
        }
        c();
        try {
            Object objInvoke = aVar.invoke();
            x();
            return objInvoke;
        } finally {
            s();
        }
    }

    public final void x() {
        l().n0().o();
    }

    public final Object y(boolean z11, fz.e eVar, xy.c cVar) {
        p pVar = this.f54854e;
        if (pVar != null) {
            return pVar.f54830f.K(z11, eVar, cVar);
        }
        kotlin.jvm.internal.m.n("connectionManager");
        throw null;
    }

    public final void t(ja.a connection) {
        kotlin.jvm.internal.m.f(connection, "connection");
        g gVarK = k();
        g0 g0Var = gVarK.f54801b;
        g0Var.getClass();
        ja.c cVarB1 = connection.B1("PRAGMA query_only");
        try {
            cVarB1.r1();
            boolean z11 = cVarB1.getLong(0) != 0;
            hz.b.h(cVarB1, null);
            if (!z11) {
                com.bumptech.glide.f.o(connection, "PRAGMA temp_store = MEMORY");
                com.bumptech.glide.f.o(connection, "PRAGMA recursive_triggers = 1");
                com.bumptech.glide.f.o(connection, aYZzTH.AxmplGwP);
                if (g0Var.f54811d) {
                    com.bumptech.glide.f.o(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    com.bumptech.glide.f.o(connection, oz.x.q0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", BuildConfig.VERSION_NAME));
                }
                bq.f fVar = g0Var.f54815h;
                ReentrantLock reentrantLock = (ReentrantLock) fVar.f4944b;
                reentrantLock.lock();
                try {
                    fVar.f4943a = true;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            synchronized (gVarK.f54806g) {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                hz.b.h(cVarB1, th3);
                throw th4;
            }
        }
    }

    public final boolean v() {
        p pVar = this.f54854e;
        if (pVar == null) {
            kotlin.jvm.internal.m.n(shrCcjmOhAmRC.KQw);
            throw null;
        }
        ka.a aVar = pVar.f54831g;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }
}
