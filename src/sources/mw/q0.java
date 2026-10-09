package mw;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements g3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f42630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw.t1 f42631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f42632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o0 f42633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o0 f42634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public lp.b f42635h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lw.q1 f42637j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public lw.o0 f42638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f42639l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.f0 f42628a = lw.f0.a(q0.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42629b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Collection f42636i = new LinkedHashSet();

    public q0(Executor executor, lw.t1 t1Var) {
        this.f42630c = executor;
        this.f42631d = t1Var;
    }

    @Override // mw.g3
    public final Runnable a(f3 f3Var) {
        lp.b bVar = (lp.b) f3Var;
        this.f42635h = bVar;
        this.f42632e = new o0(bVar, 0);
        this.f42633f = new o0(bVar, 1);
        this.f42634g = new o0(bVar, 2);
        return null;
    }

    @Override // mw.z
    public final w b(lw.e1 e1Var, lw.c1 c1Var, lw.c cVar, lw.j[] jVarArr) {
        w z0Var;
        try {
            b4 b4Var = new b4(e1Var, c1Var, cVar);
            lw.o0 o0Var = null;
            long j11 = -1;
            while (true) {
                synchronized (this.f42629b) {
                    lw.q1 q1Var = this.f42637j;
                    if (q1Var == null) {
                        lw.o0 o0Var2 = this.f42638k;
                        if (o0Var2 != null) {
                            if (o0Var != null && j11 == this.f42639l) {
                                z0Var = e(b4Var, jVarArr);
                                break;
                            }
                            j11 = this.f42639l;
                            z zVarF = k1.f(o0Var2.a(b4Var), Boolean.TRUE.equals(cVar.f40353e));
                            if (zVarF != null) {
                                z0Var = zVarF.b(b4Var.f42362c, b4Var.f42361b, b4Var.f42360a, jVarArr);
                                break;
                            }
                            o0Var = o0Var2;
                        } else {
                            z0Var = e(b4Var, jVarArr);
                            break;
                        }
                    } else {
                        z0Var = new z0(q1Var, x.PROCESSED, jVarArr);
                        break;
                    }
                }
            }
            this.f42631d.a();
            return z0Var;
        } catch (Throwable th2) {
            this.f42631d.a();
            throw th2;
        }
    }

    @Override // mw.g3
    public final void c(lw.q1 q1Var) {
        o0 o0Var;
        synchronized (this.f42629b) {
            try {
                if (this.f42637j != null) {
                    return;
                }
                this.f42637j = q1Var;
                this.f42631d.b(new i0(5, this, q1Var));
                if (!f() && (o0Var = this.f42634g) != null) {
                    this.f42631d.b(o0Var);
                    this.f42634g = null;
                }
                this.f42631d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // lw.e0
    public final lw.f0 d() {
        return this.f42628a;
    }

    public final p0 e(b4 b4Var, lw.j[] jVarArr) {
        int size;
        p0 p0Var = new p0(this, b4Var, jVarArr);
        this.f42636i.add(p0Var);
        synchronized (this.f42629b) {
            size = this.f42636i.size();
        }
        if (size == 1) {
            this.f42631d.b(this.f42632e);
        }
        for (lw.j jVar : jVarArr) {
            jVar.a();
        }
        return p0Var;
    }

    public final boolean f() {
        boolean z11;
        synchronized (this.f42629b) {
            z11 = !this.f42636i.isEmpty();
        }
        return z11;
    }

    public final void g(lw.o0 o0Var) {
        o0 o0Var2;
        r0 r0Var;
        synchronized (this.f42629b) {
            this.f42638k = o0Var;
            this.f42639l++;
            if (o0Var != null && f()) {
                ArrayList arrayList = new ArrayList(this.f42636i);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    p0 p0Var = (p0) obj;
                    lw.m0 m0VarA = o0Var.a(p0Var.L);
                    lw.c cVar = p0Var.L.f42360a;
                    z zVarF = k1.f(m0VarA, Boolean.TRUE.equals(cVar.f40353e));
                    if (zVarF != null) {
                        Executor executor = this.f42630c;
                        Executor executor2 = cVar.f40350b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        lw.r rVar = p0Var.M;
                        lw.r rVarA = rVar.a();
                        try {
                            b4 b4Var = p0Var.L;
                            w wVarB = zVarF.b(b4Var.f42362c, b4Var.f42361b, b4Var.f42360a, p0Var.N);
                            rVar.c(rVarA);
                            synchronized (p0Var) {
                                try {
                                    r0Var = null;
                                    if (p0Var.f42612c == null) {
                                        Preconditions.k(wVarB, "stream");
                                        w wVar = p0Var.f42612c;
                                        Preconditions.q("realStream already set to %s", wVar == null, wVar);
                                        p0Var.f42612c = wVarB;
                                        p0Var.H = System.nanoTime();
                                        y yVar = p0Var.f42611b;
                                        if (yVar == null) {
                                            p0Var.f42614e = null;
                                            p0Var.f42610a = true;
                                        }
                                        if (yVar != null) {
                                            p0Var.g(yVar);
                                            r0Var = new r0(p0Var, 2);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (r0Var != null) {
                                executor.execute(r0Var);
                            }
                            arrayList2.add(p0Var);
                        } catch (Throwable th3) {
                            rVar.c(rVarA);
                            throw th3;
                        }
                    }
                }
                synchronized (this.f42629b) {
                    try {
                        if (f()) {
                            this.f42636i.removeAll(arrayList2);
                            if (this.f42636i.isEmpty()) {
                                this.f42636i = new LinkedHashSet();
                            }
                            if (!f()) {
                                this.f42631d.b(this.f42633f);
                                if (this.f42637j != null && (o0Var2 = this.f42634g) != null) {
                                    this.f42631d.b(o0Var2);
                                    this.f42634g = null;
                                }
                            }
                            this.f42631d.a();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }
}
