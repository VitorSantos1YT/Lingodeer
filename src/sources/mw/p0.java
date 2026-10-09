package mw;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements w {
    public long H;
    public final b4 L;
    public final lw.j[] N;
    public final /* synthetic */ q0 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f42610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f42611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f42612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lw.q1 f42613d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f42615f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f42616t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f42614e = new ArrayList();
    public ArrayList K = new ArrayList();
    public final lw.r M = lw.r.b();

    public p0(q0 q0Var, b4 b4Var, lw.j[] jVarArr) {
        this.O = q0Var;
        this.L = b4Var;
        this.N = jVarArr;
    }

    public final void a(Runnable runnable) {
        Preconditions.p("May only be called after start", this.f42611b != null);
        synchronized (this) {
            try {
                if (this.f42610a) {
                    runnable.run();
                } else {
                    this.f42614e.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:11:0x001f, B:13:0x0027, B:14:0x002b, B:18:0x002f, B:19:0x0033), top: B:41:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[LOOP:3: B:21:0x0038->B:23:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.f42614e     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r6.f42614e = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r6.f42610a = r1     // Catch: java.lang.Throwable -> L50
            mw.t0 r2 = r6.f42615f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.f42687c     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            r2.f42687c = r0     // Catch: java.lang.Throwable -> L2d
            r2.f42686b = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            java.util.List r4 = r2.f42687c     // Catch: java.lang.Throwable -> L2d
            r2.f42687c = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r4.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L38
        L48:
            r4.clear()
            r3 = r4
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List r1 = r6.f42614e     // Catch: java.lang.Throwable -> L50
            r6.f42614e = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.p0.b():void");
    }

    @Override // mw.o5
    public final void c(lw.l lVar) {
        Preconditions.p("May only be called before start", this.f42611b == null);
        this.K.add(new i0(6, this, lVar));
    }

    @Override // mw.w
    public final void d(int i11) {
        Preconditions.p("May only be called before start", this.f42611b == null);
        this.K.add(new s0(this, i11, 1));
    }

    @Override // mw.o5
    public final void e() {
        Preconditions.p("May only be called after start", this.f42611b != null);
        if (this.f42610a) {
            this.f42612c.e();
        } else {
            a(new r0(this, 0));
        }
    }

    @Override // mw.o5
    public final boolean f() {
        if (this.f42610a) {
            return this.f42612c.f();
        }
        return false;
    }

    @Override // mw.o5
    public final void flush() {
        Preconditions.p("May only be called after start", this.f42611b != null);
        if (this.f42610a) {
            this.f42612c.flush();
        } else {
            a(new r0(this, 3));
        }
    }

    public final void g(y yVar) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((Runnable) obj).run();
        }
        this.K = null;
        this.f42612c.n(yVar);
    }

    @Override // mw.w
    public final void h() {
        Preconditions.p("May only be called after start", this.f42611b != null);
        a(new r0(this, 4));
    }

    @Override // mw.o5
    public final void j(qw.a aVar) {
        Preconditions.p("May only be called after start", this.f42611b != null);
        if (this.f42610a) {
            this.f42612c.j(aVar);
        } else {
            a(new i0(9, this, aVar));
        }
    }

    @Override // mw.w
    public final void k(l2.f fVar) {
        if (Boolean.TRUE.equals(this.L.f42360a.f40353e)) {
            fVar.f39601b.add("wait_for_ready");
        }
        synchronized (this) {
            try {
                if (this.f42611b == null) {
                    return;
                }
                if (this.f42612c != null) {
                    fVar.a(Long.valueOf(this.H - this.f42616t), "buffered_nanos");
                    this.f42612c.k(fVar);
                } else {
                    fVar.a(Long.valueOf(System.nanoTime() - this.f42616t), "buffered_nanos");
                    fVar.f39601b.add("waiting_for_connection");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mw.w
    public final void l(int i11) {
        Preconditions.p("May only be called before start", this.f42611b == null);
        this.K.add(new s0(this, i11, 0));
    }

    @Override // mw.w
    public final void n(y yVar) {
        lw.q1 q1Var;
        boolean z11;
        Preconditions.k(yVar, "listener");
        Preconditions.p("already started", this.f42611b == null);
        synchronized (this) {
            try {
                q1Var = this.f42613d;
                z11 = this.f42610a;
                if (!z11) {
                    t0 t0Var = new t0(yVar);
                    this.f42615f = t0Var;
                    yVar = t0Var;
                }
                this.f42611b = yVar;
                this.f42616t = System.nanoTime();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (q1Var != null) {
            yVar.f(q1Var, x.PROCESSED, new lw.c1());
        } else if (z11) {
            g(yVar);
        }
    }

    @Override // mw.w
    public final void p(lw.q1 q1Var) {
        boolean z11 = false;
        boolean z12 = true;
        Preconditions.p("May only be called after start", this.f42611b != null);
        Preconditions.k(q1Var, "reason");
        synchronized (this) {
            try {
                w wVar = this.f42612c;
                if (wVar == null) {
                    n3 n3Var = n3.f42584b;
                    if (wVar != null) {
                        z12 = false;
                    }
                    Preconditions.q("realStream already set to %s", z12, wVar);
                    this.f42612c = n3Var;
                    this.H = System.nanoTime();
                    this.f42613d = q1Var;
                } else {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            a(new i0(10, this, q1Var));
        } else {
            b();
            for (lw.j jVar : this.N) {
                jVar.m(q1Var);
            }
            this.f42611b.f(q1Var, x.PROCESSED, new lw.c1());
        }
        synchronized (this.O.f42629b) {
            try {
                q0 q0Var = this.O;
                if (q0Var.f42634g != null) {
                    boolean zRemove = q0Var.f42636i.remove(this);
                    if (!this.O.f() && zRemove) {
                        q0 q0Var2 = this.O;
                        q0Var2.f42631d.b(q0Var2.f42633f);
                        q0 q0Var3 = this.O;
                        if (q0Var3.f42637j != null) {
                            q0Var3.f42631d.b(q0Var3.f42634g);
                            this.O.f42634g = null;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.O.f42631d.a();
    }

    @Override // mw.o5
    public final void q() {
        Preconditions.p("May only be called before start", this.f42611b == null);
        this.K.add(new r0(this, 1));
    }

    @Override // mw.w
    public final void r(lw.u uVar) {
        Preconditions.p("May only be called before start", this.f42611b == null);
        Preconditions.k(uVar, "decompressorRegistry");
        this.K.add(new i0(7, this, uVar));
    }

    @Override // mw.w
    public final void s(lw.s sVar) {
        Preconditions.p("May only be called before start", this.f42611b == null);
        this.K.add(new i0(8, this, sVar));
    }
}
