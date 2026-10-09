package hb;

import a0.b2;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import aw.t;
import b1.p;
import fb.e0;
import fb.l;
import fr.j3;
import gb.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import kb.h;
import kb.k;
import mb.i;
import ob.j;
import ob.u;
import rz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f, h, gb.b {
    public final p H;
    public final fb.c K;
    public Boolean M;
    public final ed.c N;
    public final qb.a O;
    public final d P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32165a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f32167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32168d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gb.d f32171t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f32166b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f32169e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f32170f = new u(new b2());
    public final HashMap L = new HashMap();

    static {
        l.c("GreedyScheduler");
    }

    public c(Context context, fb.c cVar, i iVar, gb.d dVar, p pVar, qb.a aVar) {
        this.f32165a = context;
        dm.a aVar2 = cVar.f27052g;
        this.f32167c = new a(this, aVar2, cVar.f27049d);
        this.P = new d(aVar2, pVar);
        this.O = aVar;
        this.N = new ed.c(iVar);
        this.K = cVar;
        this.f32171t = dVar;
        this.H = pVar;
    }

    @Override // kb.h
    public final void a(ob.p pVar, kb.c cVar) {
        j jVarS = j3.s(pVar);
        boolean z11 = cVar instanceof kb.a;
        p pVar2 = this.H;
        d dVar = this.P;
        u uVar = this.f32170f;
        if (z11) {
            if (uVar.n(jVarS)) {
                return;
            }
            l lVarB = l.b();
            jVarS.toString();
            lVarB.getClass();
            gb.i iVarH = uVar.H(jVarS);
            dVar.c(iVarH);
            ((qb.a) pVar2.f3801c).a(new androidx.fragment.app.d(pVar2, iVarH, null, 10));
            return;
        }
        l lVarB2 = l.b();
        jVarS.toString();
        lVarB2.getClass();
        gb.i iVarC = uVar.C(jVarS);
        if (iVarC != null) {
            dVar.a(iVarC);
            int i11 = ((kb.b) cVar).f38029a;
            pVar2.getClass();
            pVar2.K(iVarC, i11);
        }
    }

    @Override // gb.f
    public final void b(ob.p... pVarArr) {
        long jMax;
        if (this.M == null) {
            this.M = Boolean.valueOf(pb.i.a(this.f32165a, this.K));
        }
        if (!this.M.booleanValue()) {
            l.b().getClass();
            return;
        }
        if (!this.f32168d) {
            this.f32171t.a(this);
            this.f32168d = true;
        }
        HashSet<ob.p> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ob.p pVar : pVarArr) {
            if (!this.f32170f.n(j3.s(pVar))) {
                synchronized (this.f32169e) {
                    try {
                        j jVarS = j3.s(pVar);
                        b bVar = (b) this.L.get(jVarS);
                        if (bVar == null) {
                            int i11 = pVar.f44858k;
                            this.K.f27049d.getClass();
                            bVar = new b(i11, System.currentTimeMillis());
                            this.L.put(jVarS, bVar);
                        }
                        jMax = (((long) Math.max((pVar.f44858k - bVar.f32163a) - 5, 0)) * 30000) + bVar.f32164b;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long jMax2 = Math.max(pVar.a(), jMax);
                this.K.f27049d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (pVar.f44849b == e0.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax2) {
                        a aVar = this.f32167c;
                        if (aVar != null) {
                            dm.a aVar2 = aVar.f32160b;
                            HashMap map = aVar.f32162d;
                            Runnable runnable = (Runnable) map.remove(pVar.f44848a);
                            if (runnable != null) {
                                ((Handler) aVar2.f23485b).removeCallbacks(runnable);
                            }
                            t tVar = new t(10, aVar, pVar);
                            map.put(pVar.f44848a, tVar);
                            aVar.f32161c.getClass();
                            ((Handler) aVar2.f23485b).postDelayed(tVar, jMax2 - System.currentTimeMillis());
                        }
                    } else if (pVar.c()) {
                        fb.f fVar = pVar.f44857j;
                        if (fVar.f27068d) {
                            l lVarB = l.b();
                            pVar.toString();
                            lVarB.getClass();
                        } else if (fVar.b()) {
                            l lVarB2 = l.b();
                            pVar.toString();
                            lVarB2.getClass();
                        } else {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f44848a);
                        }
                    } else if (!this.f32170f.n(j3.s(pVar))) {
                        l.b().getClass();
                        u uVar = this.f32170f;
                        uVar.getClass();
                        gb.i iVarH = uVar.H(j3.s(pVar));
                        this.P.c(iVarH);
                        p pVar2 = this.H;
                        ((qb.a) pVar2.f3801c).a(new androidx.fragment.app.d(pVar2, iVarH, null, 10));
                    }
                }
            }
        }
        synchronized (this.f32169e) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    l.b().getClass();
                    for (ob.p pVar3 : hashSet) {
                        j jVarS2 = j3.s(pVar3);
                        if (!this.f32166b.containsKey(jVarS2)) {
                            this.f32166b.put(jVarS2, k.a(this.N, pVar3, this.O.f47695b, this));
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // gb.f
    public final boolean c() {
        return false;
    }

    @Override // gb.f
    public final void d(String str) {
        Runnable runnable;
        if (this.M == null) {
            this.M = Boolean.valueOf(pb.i.a(this.f32165a, this.K));
        }
        if (!this.M.booleanValue()) {
            l.b().getClass();
            return;
        }
        if (!this.f32168d) {
            this.f32171t.a(this);
            this.f32168d = true;
        }
        l.b().getClass();
        a aVar = this.f32167c;
        if (aVar != null && (runnable = (Runnable) aVar.f32162d.remove(str)) != null) {
            ((Handler) aVar.f32160b.f23485b).removeCallbacks(runnable);
        }
        for (gb.i iVar : this.f32170f.D(str)) {
            this.P.a(iVar);
            p pVar = this.H;
            pVar.getClass();
            pVar.K(iVar, -512);
        }
    }

    @Override // gb.b
    public final void e(j jVar, boolean z11) {
        g1 g1Var;
        gb.i iVarC = this.f32170f.C(jVar);
        if (iVarC != null) {
            this.P.a(iVarC);
        }
        synchronized (this.f32169e) {
            g1Var = (g1) this.f32166b.remove(jVar);
        }
        if (g1Var != null) {
            l lVarB = l.b();
            Objects.toString(jVar);
            lVarB.getClass();
            g1Var.cancel(null);
        }
        if (z11) {
            return;
        }
        synchronized (this.f32169e) {
            this.L.remove(jVar);
        }
    }
}
