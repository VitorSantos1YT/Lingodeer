package vd;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;
import mw.g0;
import qp.m3;
import qp.m4;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements f, Runnable, Comparable, qe.b {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final td.i f53900i0 = new td.i("glide_thread_priority_override", null, td.i.f52122e);
    public com.bumptech.glide.i H;
    public td.g K;
    public com.bumptech.glide.k L;
    public u M;
    public int N;
    public int O;
    public n P;
    public td.j Q;
    public s R;
    public int S;
    public k T;
    public j U;
    public Object V;
    public a5.f W;
    public Supplier X;
    public Thread Y;
    public td.g Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public td.g f53902a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Object f53904b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public td.a f53906c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f53907d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f53908d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y4.c f53909e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public volatile g f53910e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public volatile boolean f53912f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public volatile boolean f53913g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f53914h0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f53901a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53903b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe.e f53905c = new qe.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m3 f53911f = new m3();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h7.g f53915t = new h7.g();

    public l(g0 g0Var, ob.m mVar) {
        this.f53907d = g0Var;
        this.f53909e = mVar;
    }

    @Override // qe.b
    public final qe.e a() {
        return this.f53905c;
    }

    @Override // vd.f
    public final void b(td.g gVar, Object obj, com.bumptech.glide.load.data.d dVar, td.a aVar, td.g gVar2) {
        this.Z = gVar;
        this.f53904b0 = obj;
        this.f53908d0 = dVar;
        this.f53906c0 = aVar;
        this.f53902a0 = gVar2;
        this.f53914h0 = gVar != this.f53901a.a().get(0);
        if (Thread.currentThread() != this.Y) {
            m(j.DECODE_DATA);
        } else {
            g();
        }
    }

    @Override // vd.f
    public final void c(td.g gVar, Exception exc, com.bumptech.glide.load.data.d dVar, td.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class clsA = dVar.a();
        glideException.f7681b = gVar;
        glideException.f7682c = aVar;
        glideException.f7683d = clsA;
        this.f53903b.add(glideException);
        if (Thread.currentThread() != this.Y) {
            m(j.SWITCH_TO_SOURCE_SERVICE);
        } else {
            o();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        int iOrdinal = this.L.ordinal() - lVar.L.ordinal();
        return iOrdinal == 0 ? this.S - lVar.S : iOrdinal;
    }

    public final b0 e(com.bumptech.glide.load.data.d dVar, Object obj, td.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            int i11 = pe.h.f46822a;
            SystemClock.elapsedRealtimeNanos();
            b0 b0VarF = f(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                b0VarF.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.M);
                Thread.currentThread().getName();
            }
            return b0VarF;
        } finally {
            dVar.b();
        }
    }

    public final b0 f(Object obj, td.a aVar) {
        Class<?> cls = obj.getClass();
        h hVar = this.f53901a;
        z zVarC = hVar.c(cls);
        td.j jVar = this.Q;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z11 = aVar == td.a.RESOURCE_DISK_CACHE || hVar.f53896r;
            td.i iVar = ce.o.f6879i;
            Boolean bool = (Boolean) jVar.c(iVar);
            if (bool == null || (bool.booleanValue() && !z11)) {
                jVar = new td.j();
                pe.c cVar = this.Q.f52127b;
                pe.c cVar2 = jVar.f52127b;
                cVar2.g(cVar);
                cVar2.put(iVar, Boolean.valueOf(z11));
            }
        }
        td.j jVar2 = jVar;
        com.bumptech.glide.load.data.f fVarG = this.H.a().g(obj);
        try {
            return zVarC.a(this.N, this.O, fVarG, new o2(this, aVar), jVar2);
        } finally {
            fVarG.b();
        }
    }

    public final void g() {
        b0 b0VarE;
        boolean zB;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.f53904b0 + ", cache key: " + this.Z + ", fetcher: " + this.f53908d0;
            int i11 = pe.h.f46822a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.M);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        a0 a0Var = null;
        if (((Map) this.W.f378b).containsKey(com.bumptech.glide.f.class) && (supplier = this.X) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.X.get()).intValue());
            } catch (IllegalArgumentException | SecurityException unused) {
                this.X = null;
            }
        }
        try {
            b0VarE = e(this.f53908d0, this.f53904b0, this.f53906c0);
        } catch (GlideException e8) {
            td.g gVar = this.f53902a0;
            td.a aVar = this.f53906c0;
            e8.f7681b = gVar;
            e8.f7682c = aVar;
            e8.f7683d = null;
            this.f53903b.add(e8);
            b0VarE = null;
        }
        if (b0VarE == null) {
            o();
            return;
        }
        td.a aVar2 = this.f53906c0;
        boolean z11 = this.f53914h0;
        if (b0VarE instanceof y) {
            ((y) b0VarE).a();
        }
        if (((a0) this.f53911f.f48058c) != null) {
            a0Var = (a0) a0.f53840e.acquire();
            a0Var.f53844d = false;
            a0Var.f53843c = true;
            a0Var.f53842b = b0VarE;
            b0VarE = a0Var;
        }
        if (((Map) this.W.f378b).containsKey(com.bumptech.glide.f.class)) {
            n();
        }
        q();
        s sVar = this.R;
        synchronized (sVar) {
            sVar.P = b0VarE;
            sVar.Q = aVar2;
            sVar.X = z11;
        }
        synchronized (sVar) {
            try {
                sVar.f53941b.a();
                if (sVar.W) {
                    sVar.P.b();
                    sVar.g();
                } else {
                    if (sVar.f53940a.f53939a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (sVar.R) {
                        throw new IllegalStateException("Already have resource");
                    }
                    re.g0 g0Var = sVar.f53944e;
                    b0 b0Var = sVar.P;
                    boolean z12 = sVar.N;
                    u uVar = sVar.M;
                    v vVar = sVar.f53942c;
                    g0Var.getClass();
                    sVar.U = new w(b0Var, z12, true, uVar, vVar);
                    sVar.R = true;
                    r rVar = sVar.f53940a;
                    rVar.getClass();
                    ArrayList arrayList = new ArrayList(rVar.f53939a);
                    sVar.e(arrayList.size() + 1);
                    ((o) sVar.f53945f).c(sVar, sVar.M, sVar.U);
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        q qVar = (q) obj;
                        qVar.f53938b.execute(new p(sVar, qVar.f53937a, 1));
                    }
                    sVar.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.T = k.ENCODE;
        try {
            m3 m3Var = this.f53911f;
            if (((a0) m3Var.f48058c) != null) {
                g0 g0Var2 = this.f53907d;
                td.j jVar = this.Q;
                m3Var.getClass();
                try {
                    g0Var2.a().i((td.g) m3Var.f48056a, new m4((td.m) m3Var.f48057b, (a0) m3Var.f48058c, jVar, 6));
                    ((a0) m3Var.f48058c).e();
                } catch (Throwable th3) {
                    ((a0) m3Var.f48058c).e();
                    throw th3;
                }
            }
            if (a0Var != null) {
                a0Var.e();
            }
            h7.g gVar2 = this.f53915t;
            synchronized (gVar2) {
                gVar2.f31869b = true;
                zB = gVar2.b();
            }
            if (zB) {
                l();
            }
        } catch (Throwable th4) {
            if (a0Var != null) {
                a0Var.e();
            }
            throw th4;
        }
    }

    public final g h() {
        int i11 = i.f53898b[this.T.ordinal()];
        h hVar = this.f53901a;
        if (i11 == 1) {
            return new c0(hVar, this);
        }
        if (i11 == 2) {
            return new d(hVar.a(), hVar, this);
        }
        if (i11 == 3) {
            return new e0(hVar, this);
        }
        if (i11 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.T);
    }

    public final k j(k kVar) {
        boolean z11;
        boolean z12;
        int i11 = i.f53898b[kVar.ordinal()];
        if (i11 == 1) {
            switch (this.P.f53924a) {
                case 0:
                    z11 = false;
                    break;
                case 1:
                default:
                    z11 = true;
                    break;
            }
            return z11 ? k.DATA_CACHE : j(k.DATA_CACHE);
        }
        if (i11 == 2) {
            return k.SOURCE;
        }
        if (i11 == 3 || i11 == 4) {
            return k.FINISHED;
        }
        if (i11 != 5) {
            throw new IllegalArgumentException("Unrecognized stage: " + kVar);
        }
        switch (this.P.f53924a) {
            case 0:
            case 1:
                z12 = false;
                break;
            default:
                z12 = true;
                break;
        }
        return z12 ? k.RESOURCE_CACHE : j(k.RESOURCE_CACHE);
    }

    public final void k() {
        boolean zB;
        if (((Map) this.W.f378b).containsKey(com.bumptech.glide.f.class)) {
            n();
        }
        q();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f53903b));
        s sVar = this.R;
        synchronized (sVar) {
            sVar.S = glideException;
        }
        synchronized (sVar) {
            try {
                sVar.f53941b.a();
                if (sVar.W) {
                    sVar.g();
                } else {
                    if (sVar.f53940a.f53939a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (sVar.T) {
                        throw new IllegalStateException("Already failed once");
                    }
                    sVar.T = true;
                    u uVar = sVar.M;
                    r rVar = sVar.f53940a;
                    rVar.getClass();
                    ArrayList arrayList = new ArrayList(rVar.f53939a);
                    sVar.e(arrayList.size() + 1);
                    ((o) sVar.f53945f).c(sVar, uVar, null);
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        q qVar = (q) obj;
                        qVar.f53938b.execute(new p(sVar, qVar.f53937a, 0));
                    }
                    sVar.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h7.g gVar = this.f53915t;
        synchronized (gVar) {
            gVar.f31870c = true;
            zB = gVar.b();
        }
        if (zB) {
            l();
        }
    }

    public final void l() {
        h7.g gVar = this.f53915t;
        synchronized (gVar) {
            gVar.f31869b = false;
            gVar.f31868a = false;
            gVar.f31870c = false;
        }
        m3 m3Var = this.f53911f;
        m3Var.f48056a = null;
        m3Var.f48057b = null;
        m3Var.f48058c = null;
        h hVar = this.f53901a;
        hVar.f53882c = null;
        hVar.f53883d = null;
        hVar.f53892n = null;
        hVar.f53886g = null;
        hVar.f53890k = null;
        hVar.f53888i = null;
        hVar.f53893o = null;
        hVar.f53889j = null;
        hVar.f53894p = null;
        hVar.f53880a.clear();
        hVar.f53891l = false;
        hVar.f53881b.clear();
        hVar.m = false;
        this.f53912f0 = false;
        this.H = null;
        this.K = null;
        this.Q = null;
        this.L = null;
        this.M = null;
        this.R = null;
        this.T = null;
        this.f53910e0 = null;
        this.Y = null;
        this.Z = null;
        this.f53904b0 = null;
        this.f53906c0 = null;
        this.f53908d0 = null;
        this.f53913g0 = false;
        this.V = null;
        this.f53903b.clear();
        this.f53909e.c(this);
    }

    public final void m(j jVar) {
        this.U = jVar;
        s sVar = this.R;
        (sVar.O ? sVar.K : sVar.H).execute(this);
    }

    public final void n() {
        if (!((Map) this.W.f378b).containsKey(com.bumptech.glide.f.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.X;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.X = null;
        }
    }

    public final void o() {
        this.Y = Thread.currentThread();
        int i11 = pe.h.f46822a;
        SystemClock.elapsedRealtimeNanos();
        boolean zA = false;
        while (!this.f53913g0 && this.f53910e0 != null && !(zA = this.f53910e0.a())) {
            this.T = j(this.T);
            this.f53910e0 = h();
            if (this.T == k.SOURCE) {
                m(j.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.T == k.FINISHED || this.f53913g0) && !zA) {
            k();
        }
    }

    public final void p() {
        int i11 = i.f53897a[this.U.ordinal()];
        if (i11 == 1) {
            this.T = j(k.INITIALIZE);
            this.f53910e0 = h();
            o();
        } else if (i11 == 2) {
            o();
        } else if (i11 == 3) {
            g();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.U);
        }
    }

    public final void q() {
        this.f53905c.a();
        if (this.f53912f0) {
            throw new IllegalStateException("Already notified", this.f53903b.isEmpty() ? null : (Throwable) nv.p.f(1, this.f53903b));
        }
        this.f53912f0 = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d dVar = this.f53908d0;
        try {
            try {
                try {
                    if (this.f53913g0) {
                        k();
                        if (dVar != null) {
                            dVar.b();
                            return;
                        }
                        return;
                    }
                    p();
                    if (dVar != null) {
                        dVar.b();
                    }
                } catch (c e8) {
                    throw e8;
                }
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Objects.toString(this.T);
                }
                if (this.T != k.ENCODE) {
                    this.f53903b.add(th2);
                    k();
                }
                if (!this.f53913g0) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            throw th3;
        }
    }
}
