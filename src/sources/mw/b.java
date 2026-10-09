package mw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k3 f42342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42343b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r5 f42344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3 f42345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f42347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n5 f42349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f42351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public lw.u f42352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42353l;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f42354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f42355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42356p;

    public b(int i11, n5 n5Var, r5 r5Var) {
        Preconditions.k(r5Var, "transportTracer");
        this.f42344c = r5Var;
        k3 k3Var = new k3(this, i11, n5Var, r5Var);
        this.f42345d = k3Var;
        this.f42342a = k3Var;
        this.f42352k = lw.u.f40474d;
        this.f42353l = false;
        this.f42349h = n5Var;
    }

    public abstract void a(int i11);

    public final void b(lw.q1 q1Var, x xVar, lw.c1 c1Var) {
        if (this.f42350i) {
            return;
        }
        this.f42350i = true;
        n5 n5Var = this.f42349h;
        if (n5Var.f42590b.compareAndSet(false, true)) {
            for (lw.j jVar : n5Var.f42589a) {
                jVar.m(q1Var);
            }
        }
        if (this.f42344c != null) {
            q1Var.f();
        }
        this.f42351j.f(q1Var, xVar, c1Var);
    }

    public abstract void c(boolean z11);

    public final void d(lw.c1 c1Var) {
        lw.k kVar = lw.k.f40407b;
        Preconditions.p("Received headers on closed stream", !this.f42355o);
        for (lw.j jVar : this.f42349h.f42589a) {
            jVar.b();
        }
        String str = (String) c1Var.c(k1.f42490d);
        if (str != null) {
            lw.t tVar = (lw.t) this.f42352k.f40475a.get(str);
            lw.l lVar = tVar != null ? tVar.f40468a : null;
            if (lVar == null) {
                ((nw.l) this).m(lw.q1.f40441l.h("Can't find decompressor for ".concat(str)).a());
                return;
            } else if (lVar != kVar) {
                k3 k3Var = this.f42342a;
                k3Var.getClass();
                Preconditions.p("Already set full stream decompressor", true);
                k3Var.f42508e = lVar;
            }
        }
        this.f42351j.j(c1Var);
    }

    public final boolean e() {
        boolean z11;
        synchronized (this.f42343b) {
            try {
                z11 = this.f42347f && this.f42346e < 32768 && !this.f42348g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(lw.q1 r7, mw.x r8, boolean r9, lw.c1 r10) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "status"
            com.google.common.base.Preconditions.k(r7, r0)
            boolean r0 = r6.f42355o
            if (r0 == 0) goto Lc
            if (r9 != 0) goto Lc
            return
        Lc:
            r0 = 1
            r6.f42355o = r0
            boolean r1 = r7.f()
            r6.f42356p = r1
            java.lang.Object r1 = r6.f42343b
            monitor-enter(r1)
            r6.f42348g = r0     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            boolean r0 = r6.f42353l
            if (r0 == 0) goto L26
            r9 = 0
            r6.m = r9
            r6.b(r7, r8, r10)
            return
        L26:
            mw.a r0 = new mw.a
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r1
            r7.m = r0
            if (r9 == 0) goto L3b
            mw.k3 r8 = r7.f42342a
            r8.close()
            return
        L3b:
            mw.k3 r8 = r7.f42342a
            boolean r9 = r8.isClosed()
            if (r9 == 0) goto L44
            goto L56
        L44:
            mw.e0 r9 = r8.N
            int r9 = r9.f42403c
            r10 = 1
            if (r9 != 0) goto L4d
            r9 = r10
            goto L4e
        L4d:
            r9 = 0
        L4e:
            if (r9 == 0) goto L54
            r8.close()
            goto L56
        L54:
            r8.S = r10
        L56:
            return
        L57:
            r0 = move-exception
            r7 = r6
        L59:
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5c
            throw r8
        L5c:
            r0 = move-exception
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.b.f(lw.q1, mw.x, boolean, lw.c1):void");
    }

    public final void g(lw.q1 q1Var, boolean z11, lw.c1 c1Var) throws Throwable {
        f(q1Var, x.PROCESSED, z11, c1Var);
    }
}
