package mw;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.MoreExecutors;
import io.grpc.StatusException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f42421b;

    public /* synthetic */ f2(i2 i2Var, int i11) {
        this.f42420a = i11;
        this.f42421b = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i2 i2Var;
        boolean z11;
        long jNextLong;
        boolean z12 = true;
        switch (this.f42420a) {
            case 0:
                synchronized (this.f42421b) {
                    try {
                        i2Var = this.f42421b;
                        h2 h2Var = i2Var.f42451d;
                        h2 h2Var2 = h2.DISCONNECTED;
                        if (h2Var != h2Var2) {
                            i2Var.f42451d = h2Var2;
                        } else {
                            z12 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (z12) {
                    ((nw.p) i2Var.f42450c.f378b).q(lw.q1.m.h("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.f42421b) {
                    try {
                        i2 i2Var2 = this.f42421b;
                        i2Var2.f42453f = null;
                        h2 h2Var3 = i2Var2.f42451d;
                        h2 h2Var4 = h2.PING_SCHEDULED;
                        if (h2Var3 == h2Var4) {
                            i2Var2.f42451d = h2.PING_SENT;
                            i2Var2.f42452e = i2Var2.f42448a.schedule(i2Var2.f42454g, i2Var2.f42457j, TimeUnit.NANOSECONDS);
                            z11 = true;
                        } else {
                            if (h2Var3 == h2.PING_DELAYED) {
                                i2Var2.f42453f = i2Var2.f42448a.schedule(i2Var2.f42455h, i2Var2.f42456i - i2Var2.f42449b.a(), TimeUnit.NANOSECONDS);
                                this.f42421b.f42451d = h2Var4;
                            }
                            z11 = false;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (z11) {
                    a5.f fVar = this.f42421b.f42450c;
                    nw.p pVar = (nw.p) fVar.f378b;
                    g2 g2Var = new g2(fVar);
                    Executor executorA = MoreExecutors.a();
                    synchronized (pVar.f44247k) {
                        try {
                            Preconditions.r(pVar.f44245i != null);
                            if (pVar.f44260y) {
                                StatusException statusExceptionK = pVar.k();
                                Logger logger = q1.f42640g;
                                try {
                                    executorA.execute(new p1(g2Var, statusExceptionK));
                                    break;
                                } catch (Throwable th4) {
                                    q1.f42640g.log(Level.SEVERE, "Failed to execute PingCallback", th4);
                                }
                                return;
                            }
                            q1 q1Var = pVar.f44259x;
                            if (q1Var != null) {
                                jNextLong = 0;
                                z12 = false;
                            } else {
                                jNextLong = pVar.f44240d.nextLong();
                                Stopwatch stopwatch = (Stopwatch) pVar.f44241e.get();
                                stopwatch.b();
                                q1 q1Var2 = new q1(jNextLong, stopwatch);
                                pVar.f44259x = q1Var2;
                                pVar.L.getClass();
                                q1Var = q1Var2;
                            }
                            if (z12) {
                                pVar.f44245i.d((int) (jNextLong >>> 32), (int) jNextLong, false);
                            }
                            synchronized (q1Var) {
                                try {
                                    if (!q1Var.f42644d) {
                                        q1Var.f42643c.put(g2Var, executorA);
                                        return;
                                    }
                                    StatusException statusException = q1Var.f42645e;
                                    p1 p1Var = statusException != null ? new p1(g2Var, statusException) : new p1(g2Var, q1Var.f42646f);
                                    try {
                                        executorA.execute(p1Var);
                                        return;
                                    } catch (Throwable th5) {
                                        q1.f42640g.log(Level.SEVERE, "Failed to execute PingCallback", th5);
                                        return;
                                    }
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                }
                return;
        }
    }
}
