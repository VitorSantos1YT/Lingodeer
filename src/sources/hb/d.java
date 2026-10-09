package hb;

import android.os.Handler;
import android.util.Log;
import b1.p;
import bq.f;
import gb.i;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import qh.z;
import qp.m4;
import qp.r;
import rd.e;
import td.g;
import td.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements xd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f32174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f32175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f32176e;

    public d(dm.a runnableScheduler, p pVar) {
        m.f(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f32173b = runnableScheduler;
        this.f32174c = pVar;
        this.f32172a = millis;
        this.f32175d = new Object();
        this.f32176e = new LinkedHashMap();
    }

    public void a(i token) {
        Runnable runnable;
        m.f(token, "token");
        synchronized (this.f32175d) {
            runnable = (Runnable) ((LinkedHashMap) this.f32176e).remove(token);
        }
        if (runnable != null) {
            ((Handler) ((dm.a) this.f32173b).f23485b).removeCallbacks(runnable);
        }
    }

    public synchronized rd.c b() {
        try {
            if (((rd.c) this.f32176e) == null) {
                this.f32176e = rd.c.i((File) this.f32174c, this.f32172a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (rd.c) this.f32176e;
    }

    public void c(i token) {
        m.f(token, "token");
        b2.c cVar = new b2.c(22, this, token);
        synchronized (this.f32175d) {
        }
        dm.a aVar = (dm.a) this.f32173b;
        ((Handler) aVar.f23485b).postDelayed(cVar, this.f32172a);
    }

    @Override // xd.a
    public synchronized void clear() {
        try {
            rd.c cVarB = b();
            cVarB.close();
            e.a(cVarB.f49096a);
            synchronized (this) {
                this.f32176e = null;
            }
        } catch (IOException unused) {
            synchronized (this) {
                this.f32176e = null;
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.f32176e = null;
                throw th2;
            }
        }
    }

    @Override // xd.a
    public void i(g gVar, m4 m4Var) {
        xd.b bVar;
        String strC = ((r) this.f32173b).c(gVar);
        z zVar = (z) this.f32175d;
        synchronized (zVar) {
            bVar = (xd.b) ((HashMap) zVar.f47796b).get(strC);
            if (bVar == null) {
                ge.a aVar = (ge.a) zVar.f47797c;
                synchronized (aVar.f29130a) {
                    bVar = (xd.b) aVar.f29130a.poll();
                }
                if (bVar == null) {
                    bVar = new xd.b();
                }
                ((HashMap) zVar.f47796b).put(strC, bVar);
            }
            bVar.f56007b++;
        }
        bVar.f56006a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(gVar);
            }
            try {
                rd.c cVarB = b();
                if (cVarB.f(strC) == null) {
                    f fVarD = cVarB.d(strC);
                    if (fVarD == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strC));
                    }
                    try {
                        if (((td.d) m4Var.f48060b).h(m4Var.f48061c, fVarD.g(), (j) m4Var.f48062d)) {
                            rd.c.a((rd.c) fVarD.f4946d, fVarD, true);
                            fVarD.f4943a = true;
                        }
                        if (!fVarD.f4943a) {
                            fVarD.a();
                        }
                    } catch (Throwable th2) {
                        if (!fVarD.f4943a) {
                            try {
                                fVarD.a();
                            } catch (IOException unused) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (IOException unused2) {
            }
            ((z) this.f32175d).h(strC);
        } catch (Throwable th3) {
            ((z) this.f32175d).h(strC);
            throw th3;
        }
    }

    @Override // xd.a
    public File j(g gVar) {
        String strC = ((r) this.f32173b).c(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(gVar);
        }
        try {
            lp.b bVarF = b().f(strC);
            if (bVarF != null) {
                return ((File[]) bVarF.f40184b)[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public d(File file) {
        this.f32175d = new z(11);
        this.f32174c = file;
        this.f32172a = 262144000L;
        this.f32173b = new r(9);
    }
}
