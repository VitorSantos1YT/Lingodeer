package vd;

import a.ar.MFeWs;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements qe.b {
    public static final g0 Y = new g0(6);
    public final yd.d H;
    public final yd.d K;
    public u M;
    public boolean N;
    public boolean O;
    public b0 P;
    public td.a Q;
    public boolean R;
    public GlideException S;
    public boolean T;
    public w U;
    public l V;
    public volatile boolean W;
    public boolean X;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f53942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y4.c f53943d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f53945f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yd.d f53946t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f53940a = new r(new ArrayList(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qe.e f53941b = new qe.e();
    public final AtomicInteger L = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f53944e = Y;

    public s(yd.d dVar, yd.d dVar2, yd.d dVar3, yd.d dVar4, o oVar, o oVar2, ob.m mVar) {
        this.f53946t = dVar;
        this.H = dVar2;
        this.K = dVar4;
        this.f53945f = oVar;
        this.f53942c = oVar2;
        this.f53943d = mVar;
    }

    @Override // qe.b
    public final qe.e a() {
        return this.f53941b;
    }

    public final synchronized void b(le.i iVar, Executor executor) {
        try {
            this.f53941b.a();
            this.f53940a.f53939a.add(new q(iVar, executor));
            if (this.R) {
                e(1);
                executor.execute(new p(this, iVar, 1));
            } else if (this.T) {
                e(1);
                executor.execute(new p(this, iVar, 0));
            } else {
                pe.f.a("Cannot add callbacks to a cancelled EngineJob", !this.W);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.W = true;
        l lVar = this.V;
        lVar.f53913g0 = true;
        g gVar = lVar.f53910e0;
        if (gVar != null) {
            gVar.cancel();
        }
        t tVar = this.f53945f;
        u uVar = this.M;
        o oVar = (o) tVar;
        synchronized (oVar) {
            sj.a aVar = oVar.f53926a;
            aVar.getClass();
            HashMap map = aVar.f51714b;
            if (equals(map.get(uVar))) {
                map.remove(uVar);
            }
        }
    }

    public final void d() {
        w wVar;
        synchronized (this) {
            try {
                this.f53941b.a();
                pe.f.a(MFeWs.JFxSBQZ, f());
                int iDecrementAndGet = this.L.decrementAndGet();
                pe.f.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    wVar = this.U;
                    g();
                } else {
                    wVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (wVar != null) {
            wVar.e();
        }
    }

    public final synchronized void e(int i11) {
        w wVar;
        pe.f.a("Not yet complete!", f());
        if (this.L.getAndAdd(i11) == 0 && (wVar = this.U) != null) {
            wVar.a();
        }
    }

    public final boolean f() {
        return this.T || this.R || this.W;
    }

    public final synchronized void g() {
        boolean zB;
        if (this.M == null) {
            throw new IllegalArgumentException();
        }
        this.f53940a.f53939a.clear();
        this.M = null;
        this.U = null;
        this.P = null;
        this.T = false;
        this.W = false;
        this.R = false;
        this.X = false;
        l lVar = this.V;
        h7.g gVar = lVar.f53915t;
        synchronized (gVar) {
            gVar.f31868a = true;
            zB = gVar.b();
        }
        if (zB) {
            lVar.l();
        }
        this.V = null;
        this.S = null;
        this.Q = null;
        this.f53943d.c(this);
    }

    public final synchronized void h(le.i iVar) {
        try {
            this.f53941b.a();
            this.f53940a.f53939a.remove(new q(iVar, pe.f.f46821b));
            if (this.f53940a.f53939a.isEmpty()) {
                c();
                if (this.R || this.T) {
                    if (this.L.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
