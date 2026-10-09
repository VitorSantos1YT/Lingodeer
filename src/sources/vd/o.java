package vd;

import android.os.SystemClock;
import android.util.Log;
import com.android.billingclient.api.k0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import mw.g0;
import qp.m4;
import r.x2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements t, v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f53925i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj.a f53926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.q f53927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd.c f53928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x2 f53929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f53930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f53931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ij.d f53932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dm.c f53933h;

    public o(xd.c cVar, o20.i iVar, yd.d dVar, yd.d dVar2, yd.d dVar3, yd.d dVar4) {
        this.f53928c = cVar;
        g0 g0Var = new g0(iVar);
        this.f53931f = g0Var;
        dm.c cVar2 = new dm.c(17);
        this.f53933h = cVar2;
        synchronized (this) {
            synchronized (cVar2) {
                cVar2.f23493e = this;
            }
        }
        this.f53927b = new re.q(7);
        this.f53926a = new sj.a(1);
        x2 x2Var = new x2();
        x2Var.f48715t = qe.d.a(150, new t7.d(x2Var, 5));
        x2Var.f48709a = dVar;
        x2Var.f48710b = dVar2;
        x2Var.f48711c = dVar3;
        x2Var.f48712d = dVar4;
        x2Var.f48713e = this;
        x2Var.f48714f = this;
        this.f53929d = x2Var;
        this.f53932g = new ij.d(g0Var);
        this.f53930e = new k0(7);
        cVar.f56008d = this;
    }

    public static void e(b0 b0Var) {
        if (!(b0Var instanceof w)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((w) b0Var).e();
    }

    public final m4 a(com.bumptech.glide.i iVar, Object obj, td.g gVar, int i11, int i12, Class cls, Class cls2, com.bumptech.glide.k kVar, n nVar, pe.c cVar, boolean z11, boolean z12, td.j jVar, boolean z13, boolean z14, le.i iVar2, l.q qVar) {
        long jElapsedRealtimeNanos;
        if (f53925i) {
            int i13 = pe.h.f46822a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f53927b.getClass();
        u uVar = new u(obj, gVar, i11, i12, cVar, cls, cls2, jVar);
        synchronized (this) {
            try {
                w wVarB = b(uVar, z13, jElapsedRealtimeNanos);
                if (wVarB == null) {
                    return f(iVar, obj, gVar, i11, i12, cls, cls2, kVar, nVar, cVar, z11, z12, jVar, z13, z14, iVar2, qVar, uVar, jElapsedRealtimeNanos);
                }
                iVar2.i(wVarB, td.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0096 */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final vd.w b(vd.u r7, boolean r8, long r9) throws java.lang.Throwable {
        /*
            r6 = this;
            r9 = 0
            if (r8 != 0) goto L6
            r5 = r6
            goto L90
        L6:
            dm.c r8 = r6.f53933h
            monitor-enter(r8)
            java.lang.Object r10 = r8.f23491c     // Catch: java.lang.Throwable -> L98
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch: java.lang.Throwable -> L98
            java.lang.Object r10 = r10.get(r7)     // Catch: java.lang.Throwable -> L98
            vd.b r10 = (vd.b) r10     // Catch: java.lang.Throwable -> L98
            if (r10 != 0) goto L18
            monitor-exit(r8)
            r0 = r9
            goto L2a
        L18:
            java.lang.Object r0 = r10.get()     // Catch: java.lang.Throwable -> L98
            vd.w r0 = (vd.w) r0     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L29
            r8.d(r10)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r0 = move-exception
            r7 = r0
            r5 = r6
            goto L9b
        L29:
            monitor-exit(r8)
        L2a:
            if (r0 == 0) goto L2f
            r0.a()
        L2f:
            if (r0 == 0) goto L3e
            boolean r8 = vd.o.f53925i
            if (r8 == 0) goto L3d
            int r8 = pe.h.f46822a
            android.os.SystemClock.elapsedRealtimeNanos()
            java.util.Objects.toString(r7)
        L3d:
            return r0
        L3e:
            xd.c r10 = r6.f53928c
            monitor-enter(r10)
            java.io.Serializable r8 = r10.f31953c     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8     // Catch: java.lang.Throwable -> L91
            java.lang.Object r8 = r8.remove(r7)     // Catch: java.lang.Throwable -> L91
            pe.i r8 = (pe.i) r8     // Catch: java.lang.Throwable -> L91
            if (r8 != 0) goto L50
            monitor-exit(r10)
            r8 = r9
            goto L5b
        L50:
            long r0 = r10.f31952b     // Catch: java.lang.Throwable -> L91
            int r2 = r8.f46824b     // Catch: java.lang.Throwable -> L91
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L91
            long r0 = r0 - r2
            r10.f31952b = r0     // Catch: java.lang.Throwable -> L91
            java.lang.Object r8 = r8.f46823a     // Catch: java.lang.Throwable -> L91
            monitor-exit(r10)
        L5b:
            r1 = r8
            vd.b0 r1 = (vd.b0) r1
            if (r1 != 0) goto L64
            r5 = r6
            r4 = r7
            r1 = r9
            goto L77
        L64:
            boolean r8 = r1 instanceof vd.w
            if (r8 == 0) goto L6d
            vd.w r1 = (vd.w) r1
            r5 = r6
            r4 = r7
            goto L77
        L6d:
            vd.w r0 = new vd.w
            r2 = 1
            r3 = 1
            r5 = r6
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r0
        L77:
            if (r1 == 0) goto L81
            r1.a()
            dm.c r7 = r5.f53933h
            r7.b(r4, r1)
        L81:
            if (r1 == 0) goto L90
            boolean r7 = vd.o.f53925i
            if (r7 == 0) goto L8f
            int r7 = pe.h.f46822a
            android.os.SystemClock.elapsedRealtimeNanos()
            java.util.Objects.toString(r4)
        L8f:
            return r1
        L90:
            return r9
        L91:
            r0 = move-exception
            r5 = r6
        L93:
            r7 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L96
            throw r7
        L96:
            r0 = move-exception
            goto L93
        L98:
            r0 = move-exception
            r5 = r6
        L9a:
            r7 = r0
        L9b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L9d
            throw r7
        L9d:
            r0 = move-exception
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.o.b(vd.u, boolean, long):vd.w");
    }

    public final synchronized void c(s sVar, td.g gVar, w wVar) {
        if (wVar != null) {
            try {
                if (wVar.f53956a) {
                    this.f53933h.b(gVar, wVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        sj.a aVar = this.f53926a;
        aVar.getClass();
        sVar.getClass();
        HashMap map = aVar.f51714b;
        if (sVar.equals(map.get(gVar))) {
            map.remove(gVar);
        }
    }

    public final void d(td.g gVar, w wVar) {
        dm.c cVar = this.f53933h;
        synchronized (cVar) {
            b bVar = (b) ((HashMap) cVar.f23491c).remove(gVar);
            if (bVar != null) {
                bVar.f53847c = null;
                bVar.clear();
            }
        }
        if (wVar.f53956a) {
        } else {
            this.f53930e.o(wVar, false);
        }
    }

    public final m4 f(com.bumptech.glide.i iVar, Object obj, td.g gVar, int i11, int i12, Class cls, Class cls2, com.bumptech.glide.k kVar, n nVar, Map map, boolean z11, boolean z12, td.j jVar, boolean z13, boolean z14, le.i iVar2, Executor executor, u uVar, long j11) {
        yd.d dVar;
        s sVar = (s) this.f53926a.f51714b.get(uVar);
        if (sVar != null) {
            sVar.b(iVar2, executor);
            if (f53925i) {
                int i13 = pe.h.f46822a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(uVar);
            }
            return new m4(this, iVar2, sVar);
        }
        s sVar2 = (s) ((ob.m) this.f53929d.f48715t).acquire();
        synchronized (sVar2) {
            sVar2.M = uVar;
            sVar2.N = z13;
            sVar2.O = z14;
        }
        ij.d dVar2 = this.f53932g;
        l lVar = (l) ((ob.m) dVar2.f34423d).acquire();
        int i14 = dVar2.f34421b;
        dVar2.f34421b = i14 + 1;
        h hVar = lVar.f53901a;
        g0 g0Var = lVar.f53907d;
        hVar.f53882c = iVar;
        hVar.f53883d = obj;
        hVar.f53892n = gVar;
        hVar.f53884e = i11;
        hVar.f53885f = i12;
        hVar.f53894p = nVar;
        hVar.f53886g = cls;
        hVar.f53887h = g0Var;
        hVar.f53890k = cls2;
        hVar.f53893o = kVar;
        hVar.f53888i = jVar;
        hVar.f53889j = map;
        hVar.f53895q = z11;
        hVar.f53896r = z12;
        lVar.H = iVar;
        lVar.K = gVar;
        lVar.L = kVar;
        lVar.M = uVar;
        lVar.N = i11;
        lVar.O = i12;
        lVar.P = nVar;
        lVar.Q = jVar;
        lVar.R = sVar2;
        lVar.S = i14;
        lVar.U = j.INITIALIZE;
        lVar.V = obj;
        lVar.W = iVar.f7636h;
        lVar.X = (Supplier) jVar.c(l.f53900i0);
        sj.a aVar = this.f53926a;
        aVar.getClass();
        aVar.f51714b.put(uVar, sVar2);
        sVar2.b(iVar2, executor);
        synchronized (sVar2) {
            sVar2.V = lVar;
            k kVarJ = lVar.j(k.INITIALIZE);
            if (kVarJ == k.RESOURCE_CACHE || kVarJ == k.DATA_CACHE) {
                dVar = sVar2.f53946t;
            } else {
                dVar = sVar2.O ? sVar2.K : sVar2.H;
            }
            dVar.execute(lVar);
        }
        if (f53925i) {
            int i15 = pe.h.f46822a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(uVar);
        }
        return new m4(this, iVar2, sVar2);
    }
}
