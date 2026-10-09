package mw;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r5 implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n3 f42666c = new n3(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42668b;

    public /* synthetic */ r5(Object obj, Object obj2) {
        this.f42668b = obj;
        this.f42667a = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0224  */
    @Override // mw.y
    public void f(lw.q1 q1Var, x xVar, lw.c1 c1Var) {
        boolean z11;
        l.j0 j0Var;
        n2 n2Var;
        ie.o oVar;
        Integer numValueOf = -1;
        synchronized (((n2) this.f42668b).K) {
            n2 n2Var2 = (n2) this.f42668b;
            n2Var2.Q = n2Var2.Q.d((w4) this.f42667a);
            ((n2) this.f42668b).P.f39601b.add(String.valueOf(q1Var.f40444a));
        }
        if (((n2) this.f42668b).T.decrementAndGet() == Integer.MIN_VALUE) {
            ((n2) this.f42668b).f42575c.execute(new v4(this, 0));
            return;
        }
        w4 w4Var = (w4) this.f42667a;
        if (w4Var.f42779c) {
            n2 n2Var3 = (n2) this.f42668b;
            k4 k4VarB = n2Var3.b(w4Var);
            if (k4VarB != null) {
                n2Var3.f42573b.execute(k4VarB);
            }
            if (((n2) this.f42668b).Q.f42705f == ((w4) this.f42667a)) {
                ((n2) this.f42668b).u(q1Var, xVar, c1Var);
                return;
            }
            return;
        }
        x xVar2 = x.MISCARRIED;
        if (xVar == xVar2 && ((n2) this.f42668b).S.incrementAndGet() > 1000) {
            n2 n2Var4 = (n2) this.f42668b;
            k4 k4VarB2 = n2Var4.b((w4) this.f42667a);
            if (k4VarB2 != null) {
                n2Var4.f42573b.execute(k4VarB2);
            }
            if (((n2) this.f42668b).Q.f42705f == ((w4) this.f42667a)) {
                ((n2) this.f42668b).u(lw.q1.f40441l.h("Too many transparent retries. Might be a bug in gRPC").g(q1Var.a()), xVar, c1Var);
                return;
            }
            return;
        }
        if (((n2) this.f42668b).Q.f42705f == null) {
            if (xVar == xVar2 || (xVar == x.REFUSED && ((n2) this.f42668b).R.compareAndSet(false, true))) {
                w4 w4VarG = ((n2) this.f42668b).g(((w4) this.f42667a).f42780d, true);
                if (w4VarG == null) {
                    return;
                }
                n2 n2Var5 = (n2) this.f42668b;
                if (n2Var5.H) {
                    synchronized (n2Var5.K) {
                        n2 n2Var6 = (n2) this.f42668b;
                        n2Var6.Q = n2Var6.Q.c((w4) this.f42667a, w4VarG);
                    }
                }
                ((n2) this.f42668b).f42573b.execute(new u4(this, w4VarG, 1));
                return;
            }
            if (xVar == x.DROPPED) {
                n2 n2Var7 = (n2) this.f42668b;
                if (n2Var7.H) {
                    n2Var7.o();
                }
            } else {
                ((n2) this.f42668b).R.set(true);
                n2 n2Var8 = (n2) this.f42668b;
                if (n2Var8.H) {
                    String str = (String) c1Var.c(n2.f42568h0);
                    if (str != null) {
                        try {
                            numValueOf = Integer.valueOf(str);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        numValueOf = null;
                    }
                    n2 n2Var9 = (n2) this.f42668b;
                    boolean zContains = n2Var9.f42583t.f42566c.contains(q1Var.f40444a);
                    boolean z12 = (n2Var9.O == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !n2Var9.O.a();
                    if (zContains && !z12 && !q1Var.f() && numValueOf != null && numValueOf.intValue() > 0) {
                        numValueOf = 0;
                    }
                    boolean z13 = zContains && !z12;
                    if (z13) {
                        n2.a((n2) this.f42668b, numValueOf);
                    }
                    synchronized (((n2) this.f42668b).K) {
                        try {
                            n2 n2Var10 = (n2) this.f42668b;
                            n2Var10.Q = n2Var10.Q.b((w4) this.f42667a);
                            if (z13) {
                                n2 n2Var11 = (n2) this.f42668b;
                                if (!n2Var11.t(n2Var11.Q)) {
                                    if (!((n2) this.f42668b).Q.f42703d.isEmpty()) {
                                    }
                                }
                                return;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    y4 y4Var = n2Var8.f42581f;
                    long nanos = 0;
                    if (y4Var == null) {
                        j0Var = new l.j0(0L, false);
                    } else {
                        boolean zContains2 = y4Var.f42847f.contains(q1Var.f40444a);
                        String str2 = (String) c1Var.c(n2.f42568h0);
                        if (str2 != null) {
                            try {
                                numValueOf = Integer.valueOf(str2);
                            } catch (NumberFormatException unused2) {
                            }
                        } else {
                            numValueOf = null;
                        }
                        boolean z14 = (n2Var8.O == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !n2Var8.O.a();
                        if (n2Var8.f42581f.f42842a <= ((w4) this.f42667a).f42780d + 1 || z14) {
                            z11 = false;
                        } else if (numValueOf == null) {
                            if (zContains2) {
                                nanos = (long) (n2.f42570j0.nextDouble() * n2Var8.Z);
                                double d5 = n2Var8.Z;
                                y4 y4Var2 = n2Var8.f42581f;
                                n2Var8.Z = Math.min((long) (d5 * y4Var2.f42845d), y4Var2.f42844c);
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        } else if (numValueOf.intValue() >= 0) {
                            nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                            n2Var8.Z = n2Var8.f42581f.f42843b;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        j0Var = new l.j0(nanos, z11);
                    }
                    if (j0Var.f39022a) {
                        w4 w4VarG2 = ((n2) this.f42668b).g(((w4) this.f42667a).f42780d + 1, false);
                        if (w4VarG2 == null) {
                            return;
                        }
                        synchronized (((n2) this.f42668b).K) {
                            n2Var = (n2) this.f42668b;
                            oVar = new ie.o(n2Var.K);
                            n2Var.X = oVar;
                        }
                        oVar.g(n2Var.f42577d.schedule(new u4(this, w4VarG2, 0), j0Var.f39023b, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            }
        }
        n2 n2Var12 = (n2) this.f42668b;
        k4 k4VarB3 = n2Var12.b((w4) this.f42667a);
        if (k4VarB3 != null) {
            n2Var12.f42573b.execute(k4VarB3);
        }
        if (((n2) this.f42668b).Q.f42705f == ((w4) this.f42667a)) {
            ((n2) this.f42668b).u(q1Var, xVar, c1Var);
        }
    }

    @Override // mw.y
    public void h() {
        n2 n2Var = (n2) this.f42668b;
        if (n2Var.f()) {
            n2Var.f42575c.execute(new v4(this, 1));
        }
    }

    @Override // mw.y
    public void j(lw.c1 c1Var) {
        int i11;
        int i12;
        if (((w4) this.f42667a).f42780d > 0) {
            lw.x0 x0Var = n2.f42567g0;
            c1Var.a(x0Var);
            c1Var.e(x0Var, String.valueOf(((w4) this.f42667a).f42780d));
        }
        n2 n2Var = (n2) this.f42668b;
        w4 w4Var = (w4) this.f42667a;
        lw.x0 x0Var2 = n2.f42567g0;
        k4 k4VarB = n2Var.b(w4Var);
        if (k4VarB != null) {
            n2Var.f42573b.execute(k4VarB);
        }
        if (((n2) this.f42668b).Q.f42705f == ((w4) this.f42667a)) {
            x4 x4Var = ((n2) this.f42668b).O;
            if (x4Var != null) {
                AtomicInteger atomicInteger = x4Var.f42799d;
                do {
                    i11 = atomicInteger.get();
                    i12 = x4Var.f42796a;
                    if (i11 == i12) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i11, Math.min(x4Var.f42798c + i11, i12)));
            }
            ((n2) this.f42668b).f42575c.execute(new i0(23, this, c1Var));
        }
    }

    public r5() {
        n3 n3Var = n3.f42585c;
        this.f42668b = j5.a();
        this.f42667a = n3Var;
    }

    @Override // mw.y
    public void e(dm.a aVar) {
        t4 t4Var = ((n2) this.f42668b).Q;
        Preconditions.p(ypOOxsaJG.ndWPYErdqS, t4Var.f42705f != null);
        if (t4Var.f42705f == ((w4) this.f42667a)) {
            ((n2) this.f42668b).f42575c.execute(new i0(24, this, aVar));
            return;
        }
        Logger logger = k1.f42487a;
        while (true) {
            InputStream inputStreamU = aVar.u();
            if (inputStreamU == null) {
                return;
            } else {
                k1.b(inputStreamU);
            }
        }
    }

    public r5(String str) {
        lw.s0 s0VarA = lw.s0.a();
        Preconditions.k(s0VarA, "registry");
        this.f42667a = s0VarA;
        Preconditions.k(str, "defaultPolicy");
        this.f42668b = str;
    }
}
